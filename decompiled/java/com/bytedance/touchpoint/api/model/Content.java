package com.bytedance.touchpoint.api.model;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class Content {

    @C09CT("color")
    public String color;

    @C09CT("size")
    public int size;

    @C09CT("text")
    public String text;

    public Content(String str, String str2, int i) {
        this.text = str;
        this.color = str2;
        this.size = i;
    }
}
