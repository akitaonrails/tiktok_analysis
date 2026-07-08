package com.ss.android.ugc.aweme.poi;

import X.C09CT;

/* JADX INFO: loaded from: classes23.dex */
public final class PokerBundle {

    @C09CT("adcode")
    public String adcode;

    @C09CT("city")
    public String city;

    @C09CT("country")
    public String country;

    @C09CT("district")
    public String district;

    @C09CT("province")
    public String province;

    public PokerBundle() {
        this("", "", "", "", "");
    }

    public final void setAdcode(String str) {
        this.adcode = str;
    }

    public final void setCity(String str) {
        this.city = str;
    }

    public final void setCountry(String str) {
        this.country = str;
    }

    public final void setDistrict(String str) {
        this.district = str;
    }

    public final void setProvince(String str) {
        this.province = str;
    }

    public PokerBundle(String str, String str2, String str3, String str4, String str5) {
        this.adcode = str;
        this.district = str2;
        this.country = str3;
        this.province = str4;
        this.city = str5;
    }
}
