package com.ss.android.ugc.aweme.profile.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class SocialPlatformAccessInfo implements Serializable {

    @C09CT("access_token_app")
    public Integer accessTokenApp;

    @C09CT("token_status")
    public Integer tokenStatus;

    public SocialPlatformAccessInfo() {
        this(null, null);
    }

    public final Integer getAccessTokenApp() {
        return this.accessTokenApp;
    }

    public final Integer getTokenStatus() {
        return this.tokenStatus;
    }

    public final void setAccessTokenApp(Integer num) {
        this.accessTokenApp = num;
    }

    public final void setTokenStatus(Integer num) {
        this.tokenStatus = num;
    }

    public SocialPlatformAccessInfo(Integer num, Integer num2) {
        this.tokenStatus = num;
        this.accessTokenApp = num2;
    }
}
