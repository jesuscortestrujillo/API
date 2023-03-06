package com.mx.api.hibernate.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "actores", schema = "hollywood")
public class Actores {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer actor_id;
	String actor_nombre;
	Integer signo_zodiacal_id;
	Float altura;
	Date cumpleaños;

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

}
