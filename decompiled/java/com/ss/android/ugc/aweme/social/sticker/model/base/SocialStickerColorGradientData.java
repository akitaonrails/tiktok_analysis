package com.ss.android.ugc.aweme.social.sticker.model.base;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes27.dex */
public final class SocialStickerColorGradientData implements Serializable {
    public static final int $stable = 8;

    @C09CT("angle")
    public String angle;

    @C09CT("end_color")
    public String endColor;

    @C09CT("start_color")
    public String startColor;

    public SocialStickerColorGradientData() {
        this(null, null, null);
    }

    public final String getAngle() {
        return this.angle;
    }

    public final String getEndColor() {
        return this.endColor;
    }

    public final String getStartColor() {
        return this.startColor;
    }

    public final void setAngle(String str) {
        this.angle = str;
    }

    public final void setEndColor(String str) {
        this.endColor = str;
    }

    public final void setStartColor(String str) {
        this.startColor = str;
    }

    public SocialStickerColorGradientData(String str, String str2, String str3) {
        this.startColor = str;
        this.endColor = str2;
        this.angle = str3;
    }
}
