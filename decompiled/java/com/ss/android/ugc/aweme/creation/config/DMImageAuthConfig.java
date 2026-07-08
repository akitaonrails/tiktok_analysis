package com.ss.android.ugc.aweme.creation.config;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes10.dex */
public final class DMImageAuthConfig implements Serializable {

    @C09CT("auth_token")
    public final DMMediaAuthToken authToken;

    @C09CT("host")
    public final String host;

    @C09CT("service_id")
    public final String service_id;

    public DMImageAuthConfig(String str, String str2, DMMediaAuthToken dMMediaAuthToken) {
        this.service_id = str;
        this.host = str2;
        this.authToken = dMMediaAuthToken;
    }
}
