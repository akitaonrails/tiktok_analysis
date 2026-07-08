package com.ss.android.ugc.tiktok.ban;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes29.dex */
public final class InlineLink implements Serializable {

    @C09CT("link_type")
    public final Integer linkType;

    @C09CT("text")
    public final String text;

    @C09CT("url")
    public final String url;

    public InlineLink() {
        this("", "", null);
    }

    public InlineLink(String str, String str2, Integer num) {
        this.text = str;
        this.url = str2;
        this.linkType = num;
    }
}
