package com.reunited.entities;

// Generated May 26, 2015 3:56:20 PM by Hibernate Tools 4.3.1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Timetable.
 * @see com.reunited.entities.Timetable
 * @author Hibernate Tools
 */
@Stateless
public class TimetableHome {

	private static final Log log = LogFactory.getLog(TimetableHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Timetable transientInstance) {
		log.debug("persisting Timetable instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Timetable persistentInstance) {
		log.debug("removing Timetable instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Timetable merge(Timetable detachedInstance) {
		log.debug("merging Timetable instance");
		try {
			Timetable result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Timetable findById(Integer id) {
		log.debug("getting Timetable instance with id: " + id);
		try {
			Timetable instance = entityManager.find(Timetable.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
