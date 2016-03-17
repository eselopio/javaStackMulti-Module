package com.opiosoft.todo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@NamedQueries( { @NamedQuery(name = "TodoTable.findAll", query = "SELECT t FROM TodoTable t ORDER BY t.codigo") })
@Table(name="todotable")
public class TodoTable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "codigo")
	private Integer codigo;
	@Column(name = "descripcion", length = 15)
	private String descripcion;
	
	public TodoTable() {
	}

	public TodoTable(Integer codigo,String descripcion) {
		this.codigo = codigo;
		this.descripcion = descripcion;
	}

	public TodoTable(Integer codigo) {
		this.codigo = codigo;
	}

	public TodoTable(String descripcion) {
		this.descripcion = descripcion;
	}
	

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "TodoTable [codigo=" + codigo + ", descripcion=" + descripcion + "]";
	}
}

