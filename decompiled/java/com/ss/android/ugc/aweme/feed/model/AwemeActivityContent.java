package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class AwemeActivityContent implements Serializable {

    @C09CT("color")
    public String color;

    @C09CT("size")
    public String size;

    @C09CT("text")
    public String text;

    public AwemeActivityContent() {
        this(null, null, null);
    }

    public AwemeActivityContent(String str, String str2, String str3) {
        this.text = str;
        this.color = str2;
        this.size = str3;
    }
}
