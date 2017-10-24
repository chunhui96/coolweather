package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by 19160 on 2017/10/24.
 * 对省份进行数据库建表
 */

public class Province extends DataSupport {

    private int id;//省份id

    private String provinceName;//省份名字

    private int provinceCode;//省份代号

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
