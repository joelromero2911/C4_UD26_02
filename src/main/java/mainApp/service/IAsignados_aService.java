package mainApp.service;

import java.util.List;

import mainApp.dto.Asignado_a;

public interface IAsignados_aService {

	//Metodos del CRUD
	public List<Asignado_a> listarAsignados_a(); // Listar All 
	
	public Asignado_a guardarAsignado_a(Asignado_a asignado_a);	// CREATE
	
	public Asignado_a asignado_aXID(int id); // READ
	
	public Asignado_a actualizarAsignados_a(Asignado_a asignado_a); // UPDATE
	
	public void eliminarAsignados_a(int id); // DELETE
}
