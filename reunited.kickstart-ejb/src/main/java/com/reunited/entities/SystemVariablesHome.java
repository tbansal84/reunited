package com.reunited.entities;

// Generated May 26, 2015 3:56:20 PM by Hibernate Tools 4.3.1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class SystemVariables.
 * @see com.reunited.entities.SystemVariables
 * @author Hibernate Tools
 */
@Stateless
public class SystemVariablesHome {

	private static final Log log = LogFactory.getLog(SystemVariablesHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(SystemVariables transientInstance) {
		log.debug("persisting SystemVariables instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(SystemVariables persistentInstance) {
		log.debug("removing SystemVariables instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public SystemVariables merge(SystemVariables detachedInstance) {
		log.debug("merging SystemVariables instance");
		try {
			SystemVariables result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public SystemVariables findById(Integer id) {
		log.debug("getting SystemVariables instance with id: " + id);
		try {
			SystemVariables instance = entityManager.find(
					SystemVariables.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
