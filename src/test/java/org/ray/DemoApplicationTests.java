package org.ray;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.ray.dao.UserDao;
import org.ray.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
	@Autowired
	private UserDao userDao;
	
	@Test
	public void testSelect() {
		List<User> users = userDao.findAll();
		for (User user : users) {
			System.out.println(user);
		}
	}
	
	@Test
	public void testInsert() {
		User user = new User();
		user.setName("Robin");
		user.setAge(10);
		user.setGender("male");
		
		user = userDao.save(user);
		System.out.println(user);
	}
	
	@Test
	public void testFindById() {
		System.out.println(userDao.findOne(4));
	}
	
	@Test
	public void test111() {
		User user = new User();
		user.setId(13);
		user.setName("Robin");
		user.setAge(10);
		user.setGender("male");
		userDao.save(user);
	}
	
	@Test
	public void testPage() {
		Pageable pageable = new PageRequest(0, 5);
		Page<User> page = userDao.findAll(pageable);
		System.out.println(page.getContent());
	}
}