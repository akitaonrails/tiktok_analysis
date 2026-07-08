package com.bytedance.touchpoint.api.model;

import X.C09CT;

/* JADX INFO: loaded from: classes25.dex */
public final class ButtonContent {

    @C09CT("color")
    public final String color;

    @C09CT("font")
    public final String font;

    @C09CT("size")
    public final String size;

    @C09CT("text")
    public final String text;

    public ButtonContent() {
        this(null, null, null, null);
    }

    public final int hashCode() {
        String str = this.text;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.color;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.font;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.size;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public ButtonContent(String str, String str2, String str3, String str4) {
        this.text = str;
        this.color = str2;
        this.font = str3;
        this.size = str4;
    }
}
