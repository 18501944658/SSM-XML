package test;

import com.itszt.dao.UserDao;
import com.itszt.domain.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:config/spring-config.xml")
public class TestMybatis {

    @Autowired
    private UserDao userDao;


    @Test
    public void test1() {

        List<User> users1 = userDao.selectAll();
        System.out.println("users1 = " + users1);
        userDao.insertUser("dahei1", 121);
        List<User> users2 = userDao.selectAll();
        System.out.println("users2 = " + users2);
    }
}
