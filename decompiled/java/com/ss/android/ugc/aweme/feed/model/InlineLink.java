package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class InlineLink implements Serializable {

    @C09CT("link_type")
    public Integer linkType;

    @C09CT("placeholder")
    public String placeholder;

    @C09CT("text")
    public String text;

    @C09CT("url")
    public String url;

    public InlineLink() {
        this("", "", null, "");
    }

    public InlineLink(String str, String str2, Integer num, String str3) {
        this.text = str;
        this.url = str2;
        this.linkType = num;
        this.placeholder = str3;
    }
}
