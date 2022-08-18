package mainApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mainApp.dao.ICientificoDAO;
import mainApp.dto.Cientifico;

@Service
public class CientificoService implements ICientificoService{

	@Autowired
	ICientificoDAO iCientificoDAO;
	
	@Override
	public List<Cientifico> listarCientificos() {
		return iCientificoDAO.findAll();
	}

	@Override
	public Cientifico guardarCientifico(Cientifico cientifico) {
		return iCientificoDAO.save(cientifico);
	}

	@Override
	public Cientifico cientificoXID(String dni) {
		return iCientificoDAO.findById(dni).get();
	}

	@Override
	public Cientifico actualizarCientificos(Cientifico cientifico) {
		return iCientificoDAO.save(cientifico);
	}

	@Override
	public void eliminarCientificos(String dni) {
		iCientificoDAO.deleteById(dni);
	}

}
