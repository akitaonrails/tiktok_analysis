package com.ss.android.ugc.aweme.profile.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public class AdCoverTitle implements Serializable, Cloneable {

    @C09CT("title")
    public String title;

    @C09CT("web_url")
    public String webUrl;

    public String getTitle() {
        return this.title;
    }

    public String getWebUrl() {
        return this.webUrl;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setWebUrl(String str) {
        this.webUrl = str;
    }
}
