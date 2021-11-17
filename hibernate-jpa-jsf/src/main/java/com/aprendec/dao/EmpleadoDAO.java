package com.aprendec.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;


import com.aprendec.model.Empleado;
import com.aprendec.model.JPAUtil;


public class EmpleadoDAO {
	EntityManager entity = JPAUtil.getEntityManagerFactory().createEntityManager();
	

	// guardar empleado
	public void guardar(Empleado empleado) {
		entity.getTransaction().begin();
		entity.persist(empleado);
		entity.getTransaction().commit();
		// JPAUtil.shutdown();
	}

	// editar empleado
	public void editar(Empleado empleado) {
		entity.getTransaction().begin();
		entity.merge(empleado);
		entity.getTransaction().commit();
		/// JPAUtil.shutdown();
	}

	// buscar empleado
	public Empleado buscar(Long id) {
		Empleado e = new Empleado();
		e = entity.find(Empleado.class, id);
		// JPAUtil.shutdown();
		return e;
	}

	/// eliminar empleado
	public void eliminar(Long id) {
		Empleado e = new Empleado();
		e = entity.find(Empleado.class, id);
		entity.getTransaction().begin();
		entity.remove(e);
		entity.getTransaction().commit();
	}

	// obtener todos los empleados
	@SuppressWarnings("unchecked")
	public List<Empleado> obtenerEmpleados() {
		List<Empleado> listaEmpleados = new ArrayList<>();

		Query q = entity.createQuery("SELECT c FROM Empleado c");
		listaEmpleados = q.getResultList();

		return listaEmpleados;
	}

}
