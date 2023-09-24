package icu.cccccyq.centerprojectbackend.service;

import icu.cccccyq.centerprojectbackend.model.domain.User;
import com.baomidou.mybatisplus.extension.service.IService;

import javax.servlet.http.HttpServletRequest;

/**
* @author cccccyq
* @description 针对表【user(用户表)】的数据库用户服务操作Service
*/
public interface UserService extends IService<User> {
    /**
     * 用户登录状态
     */


    /**
     * 用户注册
     * @param userAccount 账户
     * @param userPassword 密码
     * @param checkPassword 校验
     * @param planetCode 世界编号
     * @return 新用户id
     */
    long userRegister(String userAccount, String userPassword, String checkPassword, String planetCode);

    /**
     * 登录
     * @param userAccount 账户
     * @param userPassword 密码
     * @param request
     * @return 信息
     */
    User userLogin(String userAccount, String userPassword, HttpServletRequest request);


    /**
     * 用户脱敏
     * @param originUser
     * @return
     */
    User getSafetyUser(User originUser);


    /**
     * 用户注销
     * @param request
     * @return
     */
    int userLogout(HttpServletRequest request);
}
