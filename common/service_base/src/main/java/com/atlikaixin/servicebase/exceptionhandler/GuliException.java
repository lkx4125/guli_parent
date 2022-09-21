package com.atlikaixin.servicebase.exceptionhandler;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author : LiKaixin
 * @number : phone 15179204125
 * @create : 2022-09-21 09:56
 * @Description : 描述
 */
@Data
@AllArgsConstructor // 有参构造
@NoArgsConstructor // 无参构造
public class GuliException extends RuntimeException {
    private Integer code; // 状态码
    private String msg; // 异常信息
}
