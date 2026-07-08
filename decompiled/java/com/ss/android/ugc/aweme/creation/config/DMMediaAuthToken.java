package com.ss.android.ugc.aweme.creation.config;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes10.dex */
public final class DMMediaAuthToken implements Serializable {

    @C09CT("access_key_id")
    public final String accessKeyId;

    @C09CT("current_time")
    public final String currentTime;

    @C09CT("expire_time")
    public final String expireTime;

    @C09CT("secret_access_key")
    public final String secretAccessKey;

    @C09CT("session_token")
    public final String sessionToken;

    public DMMediaAuthToken(String str, String str2, String str3, String str4, String str5) {
        this.accessKeyId = str;
        this.sessionToken = str2;
        this.secretAccessKey = str3;
        this.expireTime = str4;
        this.currentTime = str5;
    }
}
