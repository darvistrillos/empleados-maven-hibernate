package com.aprendec.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "empleados")
public class Empleado {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column
	private String documento_tipo;
	@Column
	private String documento_numero;
	@Column
	private String nombres;
	@Column
	private String apellidos;
	@Column
	private Integer departamento_id;
	@Column
	private String ciudad;
	@Column
	private String direccion;
	@Column
	private String correo_electronico;
	@Column
	private String telefono;
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecha_hora_crea;
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecha_hora_modifica;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDocumento_tipo() {
		return documento_tipo;
	}

	public void setDocumento_tipo(String documento_tipo) {
		this.documento_tipo = documento_tipo;
	}

	public String getDocumento_numero() {
		return documento_numero;
	}

	public void setDocumento_numero(String documento_numero) {
		this.documento_numero = documento_numero;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public Integer getDepartamento_id() {
		return departamento_id;
	}

	public void setDepartamento_id(Integer departamento_id) {
		this.departamento_id = departamento_id;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCorreo_electronico() {
		return correo_electronico;
	}

	public void setCorreo_electronico(String correo_electronico) {
		this.correo_electronico = correo_electronico;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Date getFecha_hora_crea() {
		return fecha_hora_crea;
	}

	public void setFecha_hora_crea(Date fecha_hora_crea) {
		this.fecha_hora_crea = fecha_hora_crea;
	}

	public Date getFecha_hora_modifica() {
		return fecha_hora_modifica;
	}

	public void setFecha_hora_modifica(Date fecha_hora_modifica) {
		this.fecha_hora_modifica = fecha_hora_modifica;
	}

	@Override
	public String toString() {
		return "Empleado [id=" + id + ", documento_tipo=" + documento_tipo + ", documento_numero=" + documento_numero
				+ ", nombres=" + nombres + ", apellidos=" + apellidos + ", departamento_id=" + departamento_id
				+ ", ciudad=" + ciudad + ", direccion=" + direccion + ", correo_electronico=" + correo_electronico
				+ ", telefono=" + telefono + ", fecha_hora_crea=" + fecha_hora_crea + "]";
	}

}
