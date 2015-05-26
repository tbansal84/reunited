package com.reunited.entities;

// Generated May 26, 2015 3:56:20 PM by Hibernate Tools 4.3.1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TestResult.
 * @see com.reunited.entities.TestResult
 * @author Hibernate Tools
 */
@Stateless
public class TestResultHome {

	private static final Log log = LogFactory.getLog(TestResultHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TestResult transientInstance) {
		log.debug("persisting TestResult instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TestResult persistentInstance) {
		log.debug("removing TestResult instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TestResult merge(TestResult detachedInstance) {
		log.debug("merging TestResult instance");
		try {
			TestResult result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TestResult findById(Integer id) {
		log.debug("getting TestResult instance with id: " + id);
		try {
			TestResult instance = entityManager.find(TestResult.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
