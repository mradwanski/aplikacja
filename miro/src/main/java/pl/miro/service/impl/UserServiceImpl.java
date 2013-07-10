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
    public void saveUser(User user) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void deleteUser(String userName) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public List<User> findUsers(String user) {
        // TODO Auto-generated method stub
        return null;
    }

}
