package com.ss.android.ugc.aweme.commercialize.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class SimpleUriAndUrl implements Serializable {

    @C09CT("uri")
    public String uri;

    @C09CT("url")
    public String url;

    public final String getUri() {
        return this.uri;
    }

    public final String getUrl() {
        return this.url;
    }

    public final void setUri(String str) {
        this.uri = str;
    }

    public final void setUrl(String str) {
        this.url = str;
    }
}
