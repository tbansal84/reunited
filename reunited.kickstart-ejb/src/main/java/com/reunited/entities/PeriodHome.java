package com.reunited.entities;

// Generated May 26, 2015 3:56:20 PM by Hibernate Tools 4.3.1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Period.
 * @see com.reunited.entities.Period
 * @author Hibernate Tools
 */
@Stateless
public class PeriodHome {

	private static final Log log = LogFactory.getLog(PeriodHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Period transientInstance) {
		log.debug("persisting Period instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Period persistentInstance) {
		log.debug("removing Period instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Period merge(Period detachedInstance) {
		log.debug("merging Period instance");
		try {
			Period result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Period findById(Integer id) {
		log.debug("getting Period instance with id: " + id);
		try {
			Period instance = entityManager.find(Period.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
