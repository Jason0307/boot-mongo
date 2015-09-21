package org.zhubao.boot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.zhubao.boot.dao.UserDao;
import org.zhubao.boot.model.User;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = BootMongoApplication.class)
@WebAppConfiguration
public class BootMongoApplicationTests {

	@Autowired
	private UserDao userDao;
	@Test
	public void testFindByName(){
		User user = userDao.findByName("jason");
		System.out.println(user);
	}
	
	@Test
	public void testSaveUser() {
		User user = new User();
		user.setName("marco");
		userDao.save(user);
	}
	
	@Test
	public void testFindById() {
		User user = userDao.findOne("55ff6944e044361de84d1098");
		System.out.println(user);
	}

}
