package com.ss.android.ugc.aweme.account.login.passkey.api;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;

/* JADX INFO: loaded from: classes29.dex */
public final class PasskeyCredential implements Serializable {
    public static final int $stable = 0;

    @C09CT("created_at")
    public final long createdAt;

    @C09CT("device_type")
    public final String deviceType;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String id;

    @C09CT("last_used")
    public final long lastUsed;

    @C09CT("location")
    public final String location;

    @C09CT("provider_id")
    public final String providerId;

    @C09CT("provider_name")
    public final String providerName;

    public PasskeyCredential() {
        this("", "", 0L, "", 0L, "", "");
    }

    public PasskeyCredential(String str, String str2, long j, String str3, long j2, String str4, String str5) {
        this.id = str;
        this.deviceType = str2;
        this.createdAt = j;
        this.location = str3;
        this.lastUsed = j2;
        this.providerName = str4;
        this.providerId = str5;
    }
}
