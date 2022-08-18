package mainApp.dto;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="cientificos")
public class Cientifico {

	@Id
	@Column(name = "dni")
	private String dni;
	@Column(name = "nom_apels")
	private String nom_apels;

	@OneToMany
	@JoinColumn(name="cientifico")
	private List<Asignado_a> asignado_a;

	/**
	 * 
	 */
	public Cientifico() {
	}

	/**
	 * @param dni
	 * @param nom_apels
	 * @param asignado_a
	 */
	public Cientifico(String dni, String nom_apels, List<Asignado_a> asignado_a) {
		this.dni = dni;
		this.nom_apels = nom_apels;
		this.asignado_a = asignado_a;
	}

	/**
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}

	/**
	 * @return the nom_apels
	 */
	public String getNom_apels() {
		return nom_apels;
	}

	/**
	 * @param nom_apels the nom_apels to set
	 */
	public void setNom_apels(String nom_apels) {
		this.nom_apels = nom_apels;
	}

	/**
	 * @return the asignado_a
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Asignado_a")
	public List<Asignado_a> getAsignado_a() {
		return asignado_a;
	}

	/**
	 * @param asignado_a the asignado_a to set
	 */
	public void setAsignado_a(List<Asignado_a> asignado_a) {
		this.asignado_a = asignado_a;
	}

	@Override
	public String toString() {
		return "Cientifico [dni=" + dni + ", nom_apels=" + nom_apels + "]";
	}
	
	
}
