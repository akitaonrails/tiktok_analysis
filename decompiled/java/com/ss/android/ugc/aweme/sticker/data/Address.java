package com.ss.android.ugc.aweme.sticker.data;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes19.dex */
public class Address implements Serializable {

    @C09CT("address")
    public String address;

    @C09CT("city")
    public String city;

    @C09CT("district")
    public String district;

    @C09CT("province")
    public String provice;

    @C09CT("simple_addr")
    public String simpleAddr;

    public String getAddress() {
        return this.address;
    }

    public String getCity() {
        return this.city;
    }

    public String getDistrict() {
        return this.district;
    }

    public String getProvice() {
        return this.provice;
    }

    public String getSimpleAddr() {
        return this.simpleAddr;
    }

    public void setAddress(String str) {
        this.address = str;
    }

    public void setCity(String str) {
        this.city = str;
    }

    public void setDistrict(String str) {
        this.district = str;
    }

    public void setProvice(String str) {
        this.provice = str;
    }

    public void setSimpleAddr(String str) {
        this.simpleAddr = str;
    }
}
