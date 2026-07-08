package com.ss.android.ugc.aweme.pipo.auth;

import X.C09CT;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes27.dex */
public final class PipoAuthRequest implements Serializable {

    @C09CT("auth_type")
    public final String authType;

    @C09CT("country")
    public final String country;

    @C09CT("extra")
    public final Map<String, String> extra;

    @C09CT("login_scene")
    public final String loginScene;

    @C09CT("merchant_id")
    public final String merchantId;

    public PipoAuthRequest(String str, String str2, String str3, String str4, Map<String, String> map) {
        this.merchantId = str;
        this.authType = str2;
        this.loginScene = str3;
        this.country = str4;
        this.extra = map;
    }
}
