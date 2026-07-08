package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C09CT;
import X.C316660CbA;

/* JADX INFO: loaded from: classes5.dex */
public class VideoAuth {

    @C09CT("auth")
    public String auth;

    @C09CT("code")
    public String code;

    public String getAuth() throws C316660CbA {
        String str = this.auth;
        if (str != null) {
            return str;
        }
        throw new C316660CbA();
    }

    public String getCode() throws C316660CbA {
        String str = this.code;
        if (str != null) {
            return str;
        }
        throw new C316660CbA();
    }
}
