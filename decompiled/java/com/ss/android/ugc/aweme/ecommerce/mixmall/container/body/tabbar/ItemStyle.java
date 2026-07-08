package com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.tabbar;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class ItemStyle {

    @C09CT("bg_color")
    public String bgColor;

    @C09CT("border_color")
    public String borderColor;

    @C09CT("font")
    public Float font;

    @C09CT("font_weight")
    public Integer fontWeight;

    @C09CT("stick_bg_color")
    public String stickBgColor;

    @C09CT("text_color")
    public String textColor;

    public ItemStyle() {
        this(null, null, null, null, null, null);
    }

    public ItemStyle(String str, String str2, String str3, String str4, Integer num, Float f) {
        this.bgColor = str;
        this.stickBgColor = str2;
        this.borderColor = str3;
        this.textColor = str4;
        this.fontWeight = num;
        this.font = f;
    }
}
