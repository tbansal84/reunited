/*
 * JBoss, Home of Professional Open Source
 * Copyright 2013, Red Hat, Inc. and/or its affiliates, and individual
 * contributors by the @authors tag. See the copyright.txt in the
 * distribution for a full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package reunited.kickstart.service;

import java.util.List;
import java.util.logging.Logger;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import com.reunited.entities.Address;
import com.reunited.entities.PersistenceBase;
import com.reunited.entities.User;

// The @Stateless annotation eliminates the need for manual transaction demarcation
@Stateless
public class ProfileRegistration {

	@Inject
	private Logger log;

	@Inject
	private EntityManager em;

	// @Inject
	// private Event<Profile> memberEventSrc;
	public void register(User member, Address address) throws Exception {
		// log.info("Registering " + member.getName());
		em.persist(member);
		em.flush();
		// memberEventSrc.fire(member);
	}

	public void register(List<PersistenceBase> entities) throws Exception {
		// log.info("Registering " + member.getName());
		
		if(entities==null||entities.isEmpty()||entities.size()!=2){
			throw new IllegalArgumentException();
		}
		this.register((User)entities.get(0), (Address)entities.get(1));
		// memberEventSrc.fire(member);
	}
}
