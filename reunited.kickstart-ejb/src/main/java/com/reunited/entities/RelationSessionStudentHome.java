package com.reunited.entities;

// Generated May 26, 2015 3:56:20 PM by Hibernate Tools 4.3.1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class RelationSessionStudent.
 * @see com.reunited.entities.RelationSessionStudent
 * @author Hibernate Tools
 */
@Stateless
public class RelationSessionStudentHome {

	private static final Log log = LogFactory
			.getLog(RelationSessionStudentHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(RelationSessionStudent transientInstance) {
		log.debug("persisting RelationSessionStudent instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(RelationSessionStudent persistentInstance) {
		log.debug("removing RelationSessionStudent instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public RelationSessionStudent merge(RelationSessionStudent detachedInstance) {
		log.debug("merging RelationSessionStudent instance");
		try {
			RelationSessionStudent result = entityManager
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public RelationSessionStudent findById(Integer id) {
		log.debug("getting RelationSessionStudent instance with id: " + id);
		try {
			RelationSessionStudent instance = entityManager.find(
					RelationSessionStudent.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
