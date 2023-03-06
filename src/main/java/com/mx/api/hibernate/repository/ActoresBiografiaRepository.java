package com.mx.api.hibernate.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.mx.api.hibernate.models.ActoresBiografia;

public interface ActoresBiografiaRepository extends JpaRepository<ActoresBiografia, Serializable> {

	@Query(value = "SELECT actor_id, actor_nombre, sz.signo_zodiacal, a.signo_zodiacal_id, altura, cumpleaños, ad.imagen, ad.biografia "
			+ "FROM hollywood.actores AS a INNER JOIN hollywood.actores_detalle AS ad USING(actor_id) \n"
			+ "LEFT JOIN hollywood.signo_zodiacal AS sz ON a.signo_zodiacal_id = sz.signo_zodiacal_id ORDER BY actor_id; ", nativeQuery = true)
	List<ActoresBiografia> allActores();


}
