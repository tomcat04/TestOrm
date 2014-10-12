/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wms.core.domain;

import java.io.Serializable;

/**
 * 供应商联系方式
 * @author chengangxiong
 */
public class SupplyContact implements Serializable {
    
    /**
     * 联系人
     */
    private String ContactPerson;
    /**
     * 固定电话
     */
    private String FixedTel;
    /**
     * 移动电话
     */
    private String MobileTel;
    /**
     * 电子邮箱
     */
    private String Email;

    public String getContactPerson() {
        return ContactPerson;
    }

    public void setContactPerson(String ContactPerson) {
        this.ContactPerson = ContactPerson;
    }

    public String getFixedTel() {
        return FixedTel;
    }

    public void setFixedTel(String FixedTel) {
        this.FixedTel = FixedTel;
    }

    public String getMobileTel() {
        return MobileTel;
    }

    public void setMobileTel(String MobileTel) {
        this.MobileTel = MobileTel;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
}
