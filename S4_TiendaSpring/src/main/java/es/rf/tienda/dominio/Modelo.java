package es.rf.tienda.dominio;

import com.fasterxml.jackson.annotation.JsonIgnore;

import es.rf.tienda.exception.DomainException;
import jakarta.persistence.Transient;

public interface Modelo {

	@Transient
	@JsonIgnore
	public boolean isValidInsert() throws DomainException;
	@Transient
	@JsonIgnore
	public boolean isValidUpdate();
}
