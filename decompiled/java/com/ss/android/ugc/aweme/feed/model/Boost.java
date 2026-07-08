package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class Boost implements Serializable {

    @C09CT("color")
    public String bgColor;

    @C09CT("label")
    public String text;

    @C09CT("color_text")
    public String textColor;

    public Boost() {
        this("", "", "");
    }

    public Boost(String str, String str2, String str3) {
        this.text = str;
        this.bgColor = str2;
        this.textColor = str3;
    }
}
