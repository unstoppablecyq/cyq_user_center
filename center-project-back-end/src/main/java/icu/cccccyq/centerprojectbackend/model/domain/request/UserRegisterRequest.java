package icu.cccccyq.centerprojectbackend.model.domain.request;

import lombok.Data;

import java.io.Serializable;

/**
 * @author cccccyq
 * 用户注册请求体
 */
@Data
public class UserRegisterRequest implements Serializable {

    private static final long serialVersionUID = -9139302542414461950L;

    private String userAccount;
    private String userPassword;
    private String checkPassword;
    private String planetCode;

}