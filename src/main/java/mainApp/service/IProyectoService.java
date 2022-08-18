package mainApp.service;

import java.util.List;

import mainApp.dto.Proyecto;

public interface IProyectoService {

	//Metodos del CRUD
	public List<Proyecto> listarProyectos(); // Listar All 
	
	public Proyecto guardarProyecto(Proyecto proyecto);	// CREATE
	
	public Proyecto proyectoXID(String id); // READ
	
	public Proyecto actualizarProyectos(Proyecto proyecto); // UPDATE
	
	public void eliminarProyectos(String id); // DELETE
}
