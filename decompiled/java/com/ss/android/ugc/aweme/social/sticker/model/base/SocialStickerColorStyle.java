package com.ss.android.ugc.aweme.social.sticker.model.base;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes31.dex */
public final class SocialStickerColorStyle implements Serializable {
    public static final int $stable = 8;

    @C09CT("color_mode")
    public String colorMode;

    @C09CT("color")
    public String colorString;

    @C09CT("gradient")
    public SocialStickerColorGradientData gradient;

    @C09CT("res_id")
    public String resId;

    @C09CT("type")
    public final int type;

    public SocialStickerColorStyle() {
        this(null, null, null, null, -1);
    }

    public final String getColorMode() {
        return this.colorMode;
    }

    public final String getColorString() {
        return this.colorString;
    }

    public final SocialStickerColorGradientData getGradient() {
        return this.gradient;
    }

    public final String getResId() {
        return this.resId;
    }

    public final int getType() {
        return this.type;
    }

    public final void setColorMode(String str) {
        this.colorMode = str;
    }

    public final void setColorString(String str) {
        this.colorString = str;
    }

    public final void setGradient(SocialStickerColorGradientData socialStickerColorGradientData) {
        this.gradient = socialStickerColorGradientData;
    }

    public final void setResId(String str) {
        this.resId = str;
    }

    public SocialStickerColorStyle(String str, String str2, SocialStickerColorGradientData socialStickerColorGradientData, String str3, int i) {
        this.colorString = str;
        this.colorMode = str2;
        this.gradient = socialStickerColorGradientData;
        this.resId = str3;
        this.type = i;
    }
}
