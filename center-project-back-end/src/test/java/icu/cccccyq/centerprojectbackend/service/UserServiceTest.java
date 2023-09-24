package icu.cccccyq.centerprojectbackend.service;
import java.util.Date;

import icu.cccccyq.centerprojectbackend.model.domain.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author cccccyq
 */
@SpringBootTest
public class UserServiceTest {

    @Resource UserService userService;

    @Test
    public void testAddUser(){
        User user = new User();
        user.setUsername("catdog");
        user.setUserAccount("1145141919");
        user.setAvatarUrl("http://cccccyq.icu");
        user.setGender(0);
        user.setUserPassword("xxxxxxxxxx");
        user.setEmail("123");
        user.setPhone("456");

        boolean result = userService.save(user);
        System.out.println(user.getId());
        Assertions.assertTrue(result);
    }

    @Test
    void userRegister() {
        //测试非空
        String userAccount = "cyqtest";
        String userPassword = "123456789";
        String checkPassword = "123456789";
        String planetCode = "11451";
        long result = userService.userRegister(userAccount, userPassword, checkPassword, planetCode);
//        Assertions.assertEquals(-1, result);
//        //测试账户长度不小于4位
//        userAccount ="ab";
//        result = userService.userRegister(userAccount, userPassword,checkPassword);
//        Assertions.assertEquals(-1,result);
//        //测试密码不小于8位
//        userAccount = "cyqok";
//        userPassword ="1234";
//        result = userService.userRegister(userAccount, userPassword,checkPassword);
//        Assertions.assertEquals(-1,result);
//        //测试账户特殊字符
//        userAccount = "te st";
//        userPassword ="qwertyuiop";
//        result = userService.userRegister(userAccount, userPassword, checkPassword);
//        Assertions.assertEquals(-1,result);
//        //测试
//        checkPassword ="qwertyuiop";
//        result = userService.userRegister(userAccount, userPassword, checkPassword);
//        Assertions.assertEquals(-1,result);
//        //测试密码和校验密码相同
//        userAccount = "cyqcyq";
//        checkPassword ="qwertyuiop";
//        result = userService.userRegister(userAccount, userPassword, checkPassword);
//        Assertions.assertEquals(-1, result);
//        //ok
//        userAccount = "usercyq";
//        result = userService.userRegister(userAccount, userPassword, checkPassword);
//        Assertions.assertTrue(result > 0);


    }
}