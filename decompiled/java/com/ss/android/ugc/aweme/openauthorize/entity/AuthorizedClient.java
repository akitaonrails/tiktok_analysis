package com.ss.android.ugc.aweme.openauthorize.entity;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes20.dex */
public final class AuthorizedClient implements Serializable {

    @C09CT("client_icon")
    public final String clientIcon;

    @C09CT("client_key")
    public final String clientKey;

    @C09CT("client_name")
    public final String clientName;

    public AuthorizedClient() {
        this(null, null, null);
    }

    public AuthorizedClient(String str, String str2, String str3) {
        this.clientKey = str;
        this.clientName = str2;
        this.clientIcon = str3;
    }
}
