package com.reunited.entities;

// Generated May 26, 2015 3:56:20 PM by Hibernate Tools 4.3.1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class RelationParentStudent.
 * @see com.reunited.entities.RelationParentStudent
 * @author Hibernate Tools
 */
@Stateless
public class RelationParentStudentHome {

	private static final Log log = LogFactory
			.getLog(RelationParentStudentHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(RelationParentStudent transientInstance) {
		log.debug("persisting RelationParentStudent instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(RelationParentStudent persistentInstance) {
		log.debug("removing RelationParentStudent instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public RelationParentStudent merge(RelationParentStudent detachedInstance) {
		log.debug("merging RelationParentStudent instance");
		try {
			RelationParentStudent result = entityManager
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public RelationParentStudent findById(Integer id) {
		log.debug("getting RelationParentStudent instance with id: " + id);
		try {
			RelationParentStudent instance = entityManager.find(
					RelationParentStudent.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
