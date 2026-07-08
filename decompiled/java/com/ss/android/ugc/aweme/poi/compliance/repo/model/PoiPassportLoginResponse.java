package com.ss.android.ugc.aweme.poi.compliance.repo.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiPassportLoginResponse implements Serializable {

    @C09CT("data")
    public final PoiPassportLoginData data;

    @C09CT("message")
    public final String message;

    public PoiPassportLoginResponse() {
        this(null, null);
    }

    public PoiPassportLoginResponse(String str, PoiPassportLoginData poiPassportLoginData) {
        this.message = str;
        this.data = poiPassportLoginData;
    }
}
