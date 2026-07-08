package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes29.dex */
public final class ShareWarnPopAccessory implements Serializable {

    @C09CT("text")
    public final String text;

    @C09CT("url")
    public final String url;

    public ShareWarnPopAccessory() {
        this("", "");
    }

    public ShareWarnPopAccessory(String str, String str2) {
        this.text = str;
        this.url = str2;
    }
}
