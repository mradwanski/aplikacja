package pl.miro.dao.impl;

import java.util.List;

import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import pl.miro.dao.UserDao;
import pl.miro.entity.User;


@Repository
public class UserDaoImpl extends AbstractDaoImpl<User, Integer> implements UserDao {

    protected UserDaoImpl() {
        super(User.class);
    }

    @Override
    public List<User> findUsers(String userName) {
        return findByCriteria(Restrictions.like("userName", userName, MatchMode.START));
    }

    @Override
    public User findUser(String userName) {
    	
    	for (User user : findByCriteria(Restrictions.eq("userName", userName))) {
			return user;
		}
    	return null;
    }

}
