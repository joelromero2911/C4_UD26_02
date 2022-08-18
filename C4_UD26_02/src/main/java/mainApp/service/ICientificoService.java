package mainApp.service;

import java.util.List;

import mainApp.dto.Cientifico;

public interface ICientificoService {

	//Metodos del CRUD
	public List<Cientifico> listarCientificos(); // Listar All 
	
	public Cientifico guardarCientifico(Cientifico cientifico);	// CREATE
	
	public Cientifico cientificoXID(String dni); // READ
	
	public Cientifico actualizarCientificos(Cientifico cientifico); // UPDATE
	
	public void eliminarCientificos(String dni); // DELETE
}
