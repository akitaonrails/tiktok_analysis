package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes36.dex */
public final class LiveTakeTheStageColor {
    public static final TypeAdapter ADAPTER;
    public static final LiveTakeTheStageColor LIZ = new LiveTakeTheStageColor("", "", "", "", "", "", "", "");

    @C09CT("bg_color_hex")
    public String bgColorHex;

    @C09CT("color_name")
    public String colorName;

    @C09CT("empty_item_bg_border_end_color")
    public String emptyItemBackgroundBorderEndColor;

    @C09CT("empty_item_bg_border_from_color")
    public String emptyItemBackgroundBorderFromColor;

    @C09CT("empty_item_gradient_end_color")
    public String emptyItemGradientEndColor;

    @C09CT("empty_item_gradient_from_color")
    public String emptyItemGradientFromColor;

    @C09CT("hex_str")
    public String hexStr;

    @C09CT("item_bg_color")
    public String itemBgColor;

    static {
        NormalGson.singleton();
        ADAPTER = new LiveTakeTheStageColor_OptTypeAdapter();
    }

    public LiveTakeTheStageColor() {
        this("", "", "", "", "", "", "", "");
    }

    public LiveTakeTheStageColor(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.colorName = str;
        this.hexStr = str2;
        this.bgColorHex = str3;
        this.emptyItemGradientFromColor = str4;
        this.emptyItemGradientEndColor = str5;
        this.emptyItemBackgroundBorderFromColor = str6;
        this.emptyItemBackgroundBorderEndColor = str7;
        this.itemBgColor = str8;
    }
}
