package com.ss.android.ugc.aweme.services.interceptor;

import X.C123100dR;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public final class ConditionalBindLoginParam {
    public String code;
    public String emailCodeKey;
    public boolean isRegister;
    public String mobile;
    public Map<String, String> originParam;
    public String profileKey;
    public static final Companion Companion = new Companion();
    public static final int $stable = 8;

    public static final class Companion {
    }

    public final int getVerifyLogicType() {
        return C123100dR.LIZ(this.profileKey) ? this.isRegister ? 2 : 4 : this.isRegister ? 1 : 3;
    }

    public final String getCode() {
        return this.code;
    }

    public final String getEmailCodeKey() {
        return this.emailCodeKey;
    }

    public final String getMobile() {
        return this.mobile;
    }

    public final Map<String, String> getOriginParam() {
        return this.originParam;
    }

    public final String getProfileKey() {
        return this.profileKey;
    }

    public final boolean isRegister() {
        return this.isRegister;
    }

    public final void setCode(String str) {
        this.code = str;
    }

    public final void setEmailCodeKey(String str) {
        this.emailCodeKey = str;
    }

    public final void setMobile(String str) {
        this.mobile = str;
    }

    public final void setOriginParam(Map<String, String> map) {
        this.originParam = map;
    }

    public final void setProfileKey(String str) {
        this.profileKey = str;
    }

    public final void setRegister(boolean z) {
        this.isRegister = z;
    }
}
