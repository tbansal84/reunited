package com.reunited.entities;

// Generated May 26, 2015 3:56:20 PM by Hibernate Tools 4.3.1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class CodeType.
 * @see com.reunited.entities.CodeType
 * @author Hibernate Tools
 */
@Stateless
public class CodeTypeHome {

	private static final Log log = LogFactory.getLog(CodeTypeHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(CodeType transientInstance) {
		log.debug("persisting CodeType instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(CodeType persistentInstance) {
		log.debug("removing CodeType instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public CodeType merge(CodeType detachedInstance) {
		log.debug("merging CodeType instance");
		try {
			CodeType result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public CodeType findById(Integer id) {
		log.debug("getting CodeType instance with id: " + id);
		try {
			CodeType instance = entityManager.find(CodeType.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
