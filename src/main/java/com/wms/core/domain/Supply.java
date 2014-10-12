package com.wms.core.domain;

import com.wms.core.combobox.SupplyCondition;
import com.wms.core.combobox.SupplyLevel;
import java.io.Serializable;

public class Supply implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * 供应商ID
     */
    private String SupplyId;
    /**
     * 供应商名称
     */
    private String SupplyName;
    /**
     * 品牌
     */
    private String Brand;
    /**
     * 供应状态
     */
    private String Condition;
    /**
     * 供应商等级
     */
    private int Level;

    public String getSupplyId() {
        return SupplyId;
    }

    public void setSupplyId(String supplyId) {
        SupplyId = supplyId;
    }

    public String getSupplyName() {
        return SupplyName;
    }

    public void setSupplyName(String supplyName) {
        SupplyName = supplyName;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(SupplyCondition Brand) {
        this.Brand = Brand.getCondition();
    }

    public String getCondition() {
        return Condition;
    }

    public void setCondition(SupplyCondition Condition) {
        this.Condition = Condition.getCondition();
    }

    public int getLevel() {
        return Level;
    }

    public void setLevel(SupplyLevel Level) {
        this.Level = Level.getCondition();
    }

}
