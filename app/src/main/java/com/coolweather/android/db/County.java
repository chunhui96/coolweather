package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by 19160 on 2017/10/24.
 * 县的信息数据库建表
 */

public class County extends DataSupport {

    private int id;//县id

    private String countyName;//县名

    private int countyCode;//县代号

    private int cityId;//县所属城市id

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public int getCountyCode() {
        return countyCode;
    }

    public void setCountyCode(int countyCode) {
        this.countyCode = countyCode;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
