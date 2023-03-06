package com.mx.api.hibernate.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ActoresBiografia {

	@Id
	Integer actor_id;
	String actor_nombre;
	String signo_zodiacal;
	Integer signo_zodiacal_id;
	Float altura;
	Date cumpleaños;
	String imagen;
	String biografia;

	public Integer getActor_id() {
		return actor_id;
	}

	public void setActor_id(Integer actor_id) {
		this.actor_id = actor_id;
	}

	public String getActor_nombre() {
		return actor_nombre;
	}

	public void setActor_nombre(String actor_nombre) {
		this.actor_nombre = actor_nombre;
	}

	public String getSigno_zodiacal() {
		return signo_zodiacal;
	}

	public void setSigno_zodiacal(String signo_zodiacal) {
		this.signo_zodiacal = signo_zodiacal;
	}

	public Integer getSigno_zodiacal_id() {
		return signo_zodiacal_id;
	}

	public void setSigno_zodiacal_id(Integer signo_zodiacal_id) {
		this.signo_zodiacal_id = signo_zodiacal_id;
	}

	public Float getAltura() {
		return altura;
	}

	public void setAltura(Float altura) {
		this.altura = altura;
	}

	public Date getCumpleaños() {
		return cumpleaños;
	}

	public void setCumpleaños(Date cumpleaños) {
		this.cumpleaños = cumpleaños;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public String getBiografia() {
		return biografia;
	}

	public void setBiografia(String biografia) {
		this.biografia = biografia;
	}

}
