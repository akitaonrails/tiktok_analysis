package com.bytedance.touchpoint.api.model;

import X.C09CT;

/* JADX INFO: loaded from: classes25.dex */
public final class Title {

    @C09CT("color")
    public final String color;

    @C09CT("font")
    public final String font;

    @C09CT("size")
    public final String size;

    @C09CT("text")
    public final String text;

    public Title() {
        this("", "", "", "");
    }

    public Title(String str, String str2, String str3, String str4) {
        this.text = str;
        this.color = str2;
        this.font = str3;
        this.size = str4;
    }
}
