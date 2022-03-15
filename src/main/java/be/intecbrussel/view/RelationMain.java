package be.intecbrussel.view;

import be.intecbrussel.data.EntityMgr;
import be.intecbrussel.model.Message;
import be.intecbrussel.model.User;

import javax.persistence.EntityManager;

public class RelationMain {
	public static void main(String[] args) {

		EntityManager em = EntityMgr.getEntityManager();

		// new user, new message
		User user = new User();
		user.setUsername("Erik");

		Message message = new Message();
		message.setMessage("test message");
		message.setUser(user);

		// existing user, new message
//		User existingUser = em.find(User.class, 9);
//		// OR
//		User existingUser2 = new User();
//		existingUser2.setId(3);
//		existingUser2.setUsername("Erik");
		// Related entity with generated value id
		//
		// if we want to check if an object (user) exists in the DB, 2 options:
		// 1 via the property of the entity:
		// id >> id == null OR id == default value of datatype >> related
		// entity does not exist
		// id >> id != null OR id != default value of datatype >> related
		// entity exists
		// 2 via the find method of the entity manager:
		// Related entity with non-generated id
		// em.find >> null >> related entity does not exist
		// em.find >> entity >> related entity exists
		// consequences of 1:
		// quicker, no access needed to DB - but might sometimes return
		// incorrect result (if entity exists as transient, but not (yet) in DB
		// consequences of 2:
		// result will be correct, but takes more time (connect to DB)

//		Message message = new Message();
//		message.setMessage("another test message");
//		message.setUser(existingUser);

		em.getTransaction().begin();
		em.persist(user);
		em.persist(message);
		em.getTransaction().commit();

	}
}
