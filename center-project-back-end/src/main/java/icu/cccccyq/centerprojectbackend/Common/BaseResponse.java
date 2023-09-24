package icu.cccccyq.centerprojectbackend.Common;

import lombok.Data;
import org.springframework.validation.beanvalidation.SpringValidatorAdapter;

import java.io.Serializable;


/**
 * @author cccccyq
 * 通用返回类
 * @param <T>
 */
@Data
public class BaseResponse<T> implements Serializable {
    private int code;
    private T data;
    private String message;
    private String description;

    public BaseResponse(int code, T data, String message, String description) {
        this.code = code;
        this.data = data;
        this.message = message;
        this.description = description;
    }

    public BaseResponse(int code, T data, String message){
        this(code, data, message, "");
    }
    public BaseResponse(int code, T data){
        this(code, data, "","");
    }
    public BaseResponse(ErrorCode errorCode){
        this(errorCode.getCode(),null,errorCode.getMessage(),errorCode.getDescription());
    }
}
