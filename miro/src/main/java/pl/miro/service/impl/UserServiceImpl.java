package pl.miro.service.impl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pl.miro.dao.UserDao;
import pl.miro.entity.User;
import pl.miro.service.UserService;


@Service("userService")
@Transactional(readOnly = true)
public class UserServiceImpl implements UserService {

    @Inject
    private UserDao userDao;
    
    @Override
    public User findByUserName(String userName) {
        //TODO
       return null;
    }

    @Override
    @Transactional(readOnly = false)
    public void saveUser(User user) {
       userDao.saveOrUpdate(user);
        
    }

    @Override
    @Transactional(readOnly = false)
    public void deleteUser(String userName) {
      //TODO
        
    }

    @Override
    public List<User> findUsers(String user) {
        return userDao.findUsers(user);
    }

}
