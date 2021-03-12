package com.vinsh;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * TODO Please add descriptive information
 *
 * <p>
 *
 * @author Vinsh Liu
 * @since 2021.03.11 周四
 */

@AllArgsConstructor
@NoArgsConstructor
public class Wechat implements Serializable {
    private String name;
    private String addr;
    private String phone;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
