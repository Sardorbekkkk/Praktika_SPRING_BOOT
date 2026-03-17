package com.example.demo.request;

import com.google.gson.annotations.SerializedName;

public class AirQuality {

    private Double co;
    private Double no2;
    private Double o3;
    private Integer so2;
    private Double pm2_5;
    private Integer pm10;
    @SerializedName("us-epa-index")
    private Integer usEpaIndex;
    @SerializedName("gb-defra-index")

    private Integer GbDefraIndex;

    public Double getCo() {
        return co;
    }

    public void setCo(Double co) {
        this.co = co;
    }

    public Double getNo2() {
        return no2;
    }

    public void setNo2(Double no2) {
        this.no2 = no2;
    }

    public Double getO3() {
        return o3;
    }

    public void setO3(Double o3) {
        this.o3 = o3;
    }

    public Integer getSo2() {
        return so2;
    }

    public void setSo2(Integer so2) {
        this.so2 = so2;
    }

    public Double getPm2_5() {
        return pm2_5;
    }

    public void setPm2_5(Double pm2_5) {
        this.pm2_5 = pm2_5;
    }

    public Integer getPm10() {
        return pm10;
    }

    public void setPm10(Integer pm10) {
        this.pm10 = pm10;
    }

    public Integer getUsEpaIndex() {
        return usEpaIndex;
    }

    public void setUsEpaIndex(Integer usEpaIndex) {
        this.usEpaIndex = usEpaIndex;
    }

    public Integer getGbDefraIndex() {
        return GbDefraIndex;
    }

    public void setGbDefraIndex(Integer GbDefraIndex) {
        this.GbDefraIndex = GbDefraIndex;
    }
}
