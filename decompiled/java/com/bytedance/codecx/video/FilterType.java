package com.bytedance.codecx.video;

import X.C08FF;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: loaded from: classes21.dex */
public enum FilterType {
    Origin(9),
    Bilinear(10),
    Bicubic(11),
    BOX(12);

    public final int value;

    public int toInt() {
        return this.value;
    }

    public static FilterType fromValue(int i) {
        switch (i) {
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return Bilinear;
            case BdTuring.TYPE_EMAIL /* 11 */:
                return Bicubic;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return BOX;
            default:
                return Origin;
        }
    }

    public static FilterType valueOf(String str) {
        return (FilterType) C08FF.LIZ(FilterType.class, str);
    }

    FilterType(int i) {
        this.value = i;
    }
}
