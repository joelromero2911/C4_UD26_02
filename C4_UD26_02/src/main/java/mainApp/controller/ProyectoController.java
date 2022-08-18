package mainApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import mainApp.dto.Proyecto;
import mainApp.service.ProyectoService;

@RestController
@RequestMapping("/api")
public class ProyectoController {

	@Autowired
	ProyectoService proyectoService;
	
	@GetMapping("/proyectos")
	public List<Proyecto> listarProyectos(){
		return proyectoService.listarProyectos();
	}
	
	@PostMapping("/proyectos")
	public Proyecto guardarProyecto(@RequestBody Proyecto proyecto) {
		return proyectoService.guardarProyecto(proyecto);
	}
	
	@GetMapping("/proyectos/{id}")
	public Proyecto proyectoXID(@PathVariable(name="id") String id) {
		
		Proyecto proyecto_xid= new Proyecto();
		proyecto_xid=proyectoService.proyectoXID(id);
		System.out.println("Proyecto XID: "+proyecto_xid);
		return proyecto_xid;
	}

	@PutMapping("/proyectos/{id}")
	public Proyecto actualizarProyectos(@PathVariable(name="id")String id,@RequestBody Proyecto proyecto) {
		
		Proyecto proyecto_seleccionado= new Proyecto();
		Proyecto proyecto_actualizado= new Proyecto();
		
		proyecto_seleccionado= proyectoService.proyectoXID(id);
		proyecto_seleccionado.setNombre(proyecto.getNombre());
		proyecto_seleccionado.setHoras(proyecto.getHoras());
		proyecto_actualizado = proyectoService.actualizarProyectos(proyecto_seleccionado);
		
		System.out.println("El Proyecto actualizado es: "+ proyecto_actualizado);
		
		return proyecto_actualizado;
	}
	
	@DeleteMapping("/proyectos/{id}")
	public void eliminarProyectos(@PathVariable(name="id")String id) {
		proyectoService.eliminarProyectos(id);
	}
}
