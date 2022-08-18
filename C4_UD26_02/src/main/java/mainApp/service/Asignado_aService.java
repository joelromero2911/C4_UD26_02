package mainApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mainApp.dao.IAsignado_aDAO;
import mainApp.dto.Asignado_a;

@Service
public class Asignado_aService implements IAsignados_aService{

	@Autowired
	IAsignado_aDAO iAsignado_aDAO;
	
	@Override
	public List<Asignado_a> listarAsignados_a() {
		return iAsignado_aDAO.findAll();
	}

	@Override
	public Asignado_a guardarAsignado_a(Asignado_a asignado_a) {
		return iAsignado_aDAO.save(asignado_a);
	}

	@Override
	public Asignado_a asignado_aXID(int id) {
		return iAsignado_aDAO.findById(id).get();
	}

	@Override
	public Asignado_a actualizarAsignados_a(Asignado_a asignado_a) {
		return iAsignado_aDAO.save(asignado_a);
	}

	@Override
	public void eliminarAsignados_a(int id) {
		iAsignado_aDAO.deleteById(id);
	}

}
