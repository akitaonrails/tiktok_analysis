package com.ss.android.ugc.aweme.utils;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes24.dex */
public final class BrightnessInfo implements Serializable {

    @C09CT("screen_auto_mode")
    public final int screenAutoMode;

    @C09CT("screen_brightness")
    public final float screenBrightness;

    public BrightnessInfo(float f, int i) {
        this.screenBrightness = f;
        this.screenAutoMode = i;
    }
}
