package com.aprendec.controller;

import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
 
import com.aprendec.dao.EmpleadoDAO;
import com.aprendec.model.Empleado;
 

@ManagedBean(name = "empleadoBean")
@RequestScoped

public class EmpleadoBean {
 public String nuevo() {
	 System.out.println("******************************************");
  Empleado e = new Empleado();
  Map<String, Object> sessionMap = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
  sessionMap.put("empleado", e);
  return "/faces/nuevo.xhtml";
 }
 
 public String guardar(Empleado empleado) {
  // guarda la fecha de registro
  Date fechaActual = new Date();
  empleado.setFecha_hora_crea(new java.sql.Date(fechaActual.getTime()));
 
  EmpleadoDAO empleadoDAO = new EmpleadoDAO();
  empleadoDAO.guardar(empleado);
  return "/faces/index.xhtml";
 }
 
 public List<Empleado> obtenerEmpleados() {
  EmpleadoDAO empleadoDAO = new EmpleadoDAO();
 
  /*
   * List<cliente> listaClientes = new ArrayList<>(); Cliente c1 = new Cliente();
   * c1.setId(1L); c1.setNombres("Elivar"); c1.setApellidos("Largo");
   * c1.setDireccion("Loja");
   * 
   * Cliente c2 = new Cliente(); c2.setId(1L); c2.setNombres("Elivar1");
   * c2.setApellidos("Largo1"); c2.setDireccion("Loja1"); listaClientes.add(c1);
   * listaClientes.add(c2);
   * 
   * return listaClientes;
   */
  return empleadoDAO.obtenerEmpleados();
 }
 
 public String editar(Long id) {
  EmpleadoDAO empleadoDAO = new EmpleadoDAO();
  Empleado e = new Empleado();
  e = empleadoDAO.buscar(id);
  System.out.println("******************************************");
  System.out.println(e);
 
  Map<String, Object> sessionMap = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
  sessionMap.put("empleado", e);
  return "/faces/editar.xhtml";
 }
 
 public String actualizar(Empleado empleado) {
  // guarda la fecha de actualizacion
  Date fechaActual = new Date();
  empleado.setFecha_hora_modifica(new java.sql.Date(fechaActual.getTime()));
 
  EmpleadoDAO empleadoDAO = new EmpleadoDAO();
  empleadoDAO.editar(empleado);
  return "/faces/index.xhtml";
 }
 
 // eliminar un empleado
 public String eliminar(Long id) {
  EmpleadoDAO empleadoDAO = new EmpleadoDAO();
  empleadoDAO.eliminar(id);
  System.out.println("Empleado eliminado..");
  return "/faces/index.xhtml";
 }
 
}
