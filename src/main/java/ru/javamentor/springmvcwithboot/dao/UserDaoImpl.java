package ru.javamentor.springmvcwithboot.dao;

import org.springframework.stereotype.Repository;
import ru.javamentor.springmvcwithboot.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;


@Repository
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public User findUserById(long id) {
        try {
            return entityManager.find(User.class, id);
        }
        catch (Throwable e) {
            return entityManager.find(User.class, 2);
        }
    }

    @Override
    public void saveUser(User user) {
        entityManager.persist(user);
    }

    @Override
    public void updateUser(User user) {
        entityManager.merge(user);
    }

    @Override
    public void deleteUser(long id) {
        entityManager.remove(findUserById(id));
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<User> getAllUsers() {
        return entityManager.createQuery("FROM User").getResultList();
    }
}
