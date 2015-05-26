package com.reunited.entities;

// Generated May 26, 2015 3:56:20 PM by Hibernate Tools 4.3.1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Institute.
 * @see com.reunited.entities.Institute
 * @author Hibernate Tools
 */
@Stateless
public class InstituteHome {

	private static final Log log = LogFactory.getLog(InstituteHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Institute transientInstance) {
		log.debug("persisting Institute instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Institute persistentInstance) {
		log.debug("removing Institute instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Institute merge(Institute detachedInstance) {
		log.debug("merging Institute instance");
		try {
			Institute result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Institute findById(Integer id) {
		log.debug("getting Institute instance with id: " + id);
		try {
			Institute instance = entityManager.find(Institute.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
