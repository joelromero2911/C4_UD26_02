package mainApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import mainApp.dto.Asignado_a;
import mainApp.service.Asignado_aService;

@RestController
@RequestMapping("/api")
public class Asignado_aController {

	@Autowired
	Asignado_aService asignado_aService;
	
	@GetMapping("/asignados_a")
	public List<Asignado_a> listarAsignados_a(){
		return asignado_aService.listarAsignados_a();
	}
	
	@PostMapping("/asignados_a")
	public Asignado_a guardarAsignado_a(@RequestBody Asignado_a asignado_a) {
		return asignado_aService.guardarAsignado_a(asignado_a);
	}
	
	@GetMapping("/asignados_a/{id}")
	public Asignado_a asignado_aXID(@PathVariable(name="id") int id) {
		
		Asignado_a asignado_a_xid= new Asignado_a();
		asignado_a_xid=asignado_aService.asignado_aXID(id);
		System.out.println("Asignado_a XID: "+asignado_a_xid);
		return asignado_a_xid;
	}

	@PutMapping("/asignados_a/{id}")
	public Asignado_a actualizarAsignados_a(@PathVariable(name="id")int id,@RequestBody Asignado_a asignado_a) {
		
		Asignado_a asignado_a_seleccionado= new Asignado_a();
		Asignado_a asignado_a_actualizado= new Asignado_a();
		
		asignado_a_seleccionado= asignado_aService.asignado_aXID(id);
		asignado_a_seleccionado.setCientifico(asignado_a.getCientifico());
		asignado_a_seleccionado.setProyecto(asignado_a.getProyecto());
		asignado_a_actualizado = asignado_aService.actualizarAsignados_a(asignado_a_seleccionado);
		
		System.out.println("El Asignado_a actualizado es: "+ asignado_a_actualizado);
		
		return asignado_a_actualizado;
	}
	
	@DeleteMapping("/asignados_a/{id}")
	public void eliminarAsignados_a(@PathVariable(name="id")int id) {
		asignado_aService.eliminarAsignados_a(id);
	}
}
