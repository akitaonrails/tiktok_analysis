package com.ss.android.ugc.aweme.profile.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class SparkAdsModel implements Serializable {

    @C09CT("allowed")
    public final boolean adAuthorization;

    @C09CT("auth_code")
    public final String authCode;

    public final boolean getAdAuthorization() {
        return this.adAuthorization;
    }

    public final String getAuthCode() {
        return this.authCode;
    }
}
