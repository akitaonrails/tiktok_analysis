package com.ss.android.ugc.aweme.discover.model;

import X.C09CT;

/* JADX INFO: loaded from: classes11.dex */
public class NearByAuth {

    @C09CT("country_auth")
    public int countryAuth;

    @C09CT("encr_lat")
    public String encryptLatitude;

    @C09CT("encr_lng")
    public String encryptLongitude;

    @C09CT("encr_place_name")
    public String encryptPlaceName;

    @C09CT("granularity")
    public int granularity;

    @C09CT("place_name")
    public String placeName;

    public int getCountryAuth() {
        return this.countryAuth;
    }

    public String getEncryptLatitude() {
        return this.encryptLatitude;
    }

    public String getEncryptLongitude() {
        return this.encryptLongitude;
    }

    public String getEncryptPlaceName() {
        return this.encryptPlaceName;
    }

    public int getGranularity() {
        return this.granularity;
    }

    public String getPlaceName() {
        return this.placeName;
    }
}
