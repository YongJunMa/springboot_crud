package org.ray.service;

import java.util.List;

import org.ray.dao.UserDao;
import org.ray.pojo.User;
import org.ray.util.Page4Navigator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	@Autowired
	private UserDao userDao;
	
	public List<User> findAll() {
		return userDao.findAll();
	}
	
	public Page4Navigator<User> findByPage(int start, int size, int navigatePages) {
        Sort sort = new Sort(Sort.Direction.DESC, "id");
        Pageable pageable = new PageRequest(start, size, sort);
        Page<User> pageFromJPA = userDao.findAll(pageable);
 
        return new Page4Navigator<User>(pageFromJPA, navigatePages);
    }
	
	public User findById(Integer id) {
		return userDao.findOne(id);
	}
	
	public void add(User user) {
		userDao.save(user);
	}

	public void del(Integer id) {
		userDao.delete(id);
	}

	public void chg(User user) {
		userDao.save(user);
	}
}
