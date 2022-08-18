package mainApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import mainApp.dto.Cientifico;
import mainApp.service.CientificoService;

@RestController
@RequestMapping("/api")
public class CientificoController {

	@Autowired
	CientificoService cientificoService;
	
	@GetMapping("/cientificos")
	public List<Cientifico> listarCientificos(){
		return cientificoService.listarCientificos();
	}
	
	@PostMapping("/cientificos")
	public Cientifico guardarCientifico(@RequestBody Cientifico cientifico) {
		return cientificoService.guardarCientifico(cientifico);
	}
	
	@GetMapping("/cientificos/{dni}")
	public Cientifico cientificoXID(@PathVariable(name="dni") String dni) {
		
		Cientifico cientifico_xid= new Cientifico();
		cientifico_xid=cientificoService.cientificoXID(dni);
		System.out.println("Cientifico XID: "+cientifico_xid);
		return cientifico_xid;
	}

	@PutMapping("/cientificos/{dni}")
	public Cientifico actualizarCientificos(@PathVariable(name="dni")String dni,@RequestBody Cientifico cientifico) {
		
		Cientifico cientifico_seleccionado= new Cientifico();
		Cientifico cientifico_actualizado= new Cientifico();
		
		cientifico_seleccionado= cientificoService.cientificoXID(dni);
		cientifico_seleccionado.setNom_apels(cientifico.getNom_apels());
		cientifico_actualizado = cientificoService.actualizarCientificos(cientifico_seleccionado);
		
		System.out.println("El Cientifico actualizado es: "+ cientifico_actualizado);
		
		return cientifico_actualizado;
	}
	
	@DeleteMapping("/cientificos/{dni}")
	public void eliminarCientificos(@PathVariable(name="dni")String dni) {
		cientificoService.eliminarCientificos(dni);
	}
}
