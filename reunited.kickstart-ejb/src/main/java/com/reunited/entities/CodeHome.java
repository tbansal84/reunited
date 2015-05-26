package com.reunited.entities;

// Generated May 26, 2015 3:56:20 PM by Hibernate Tools 4.3.1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Code.
 * @see com.reunited.entities.Code
 * @author Hibernate Tools
 */
@Stateless
public class CodeHome {

	private static final Log log = LogFactory.getLog(CodeHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Code transientInstance) {
		log.debug("persisting Code instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Code persistentInstance) {
		log.debug("removing Code instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Code merge(Code detachedInstance) {
		log.debug("merging Code instance");
		try {
			Code result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Code findById(Integer id) {
		log.debug("getting Code instance with id: " + id);
		try {
			Code instance = entityManager.find(Code.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
