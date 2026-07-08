package com.ss.android.ugc.aweme.openauthorize.entity;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes35.dex */
public final class OAuthClientInfo implements Serializable {

    @C09CT("client_icon")
    public final String clientIcon;

    @C09CT("client_key")
    public final String clientKey;

    @C09CT("client_name")
    public final String clientName;

    @C09CT("is_lite")
    public final Boolean isLite;

    public OAuthClientInfo() {
        this(null, null, null, null);
    }

    public final Boolean isLite() {
        return this.isLite;
    }

    public OAuthClientInfo(String str, String str2, String str3, Boolean bool) {
        this.clientKey = str;
        this.clientName = str2;
        this.clientIcon = str3;
        this.isLite = bool;
    }
}
