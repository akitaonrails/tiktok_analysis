package com.ss.android.ugc.aweme.friends.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class ShortenUrlModel implements Serializable {

    @C09CT("short_url")
    public String url;

    public final String getUrl() {
        return this.url;
    }

    public final void setUrl(String str) {
        this.url = str;
    }
}
