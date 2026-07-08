package com.ss.android.ugc.aweme.commercialize.hybrid.api.web.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class LoginModel implements Serializable {

    @C09CT("login_id")
    public String loginId;

    @C09CT("login_method")
    public String loginMethod;

    @C09CT("login_type")
    public String loginType;

    public LoginModel() {
        this(null, null, null);
    }

    public int hashCode() {
        String str = this.loginId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.loginType;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.loginMethod;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setLoginId(String str) {
        this.loginId = str;
    }

    public final void setLoginMethod(String str) {
        this.loginMethod = str;
    }

    public final void setLoginType(String str) {
        this.loginType = str;
    }

    public LoginModel(String str, String str2, String str3) {
        this.loginId = str;
        this.loginType = str2;
        this.loginMethod = str3;
    }
}
