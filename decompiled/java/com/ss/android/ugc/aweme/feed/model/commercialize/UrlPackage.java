package com.ss.android.ugc.aweme.feed.model.commercialize;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes14.dex */
public final class UrlPackage implements Serializable {

    @C09CT("Android")
    public String androidUrl;

    @C09CT("iOS")
    public String iosUrl;

    public final String getAndroidUrl() {
        return this.androidUrl;
    }

    public final String getIosUrl() {
        return this.iosUrl;
    }

    public final void setAndroidUrl(String str) {
        this.androidUrl = str;
    }

    public final void setIosUrl(String str) {
        this.iosUrl = str;
    }
}
