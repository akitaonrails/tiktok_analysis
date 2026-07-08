package com.ss.android.ugc.aweme.utils;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes24.dex */
public final class RealTimeClientInfo implements Serializable {

    @C09CT("brightness")
    public final BrightnessInfo brightness;

    @C09CT("dark_mode")
    public final int darkMode;

    @C09CT("font_scale")
    public final float fontScale;

    @C09CT("ohr_predict")
    public final OHRPredictResultParams ohrPredict;

    @C09CT("recent_consumption_data")
    public final String recentConsumptionData;

    public RealTimeClientInfo(BrightnessInfo brightnessInfo, int i, float f, OHRPredictResultParams oHRPredictResultParams, String str) {
        this.brightness = brightnessInfo;
        this.darkMode = i;
        this.fontScale = f;
        this.ohrPredict = oHRPredictResultParams;
        this.recentConsumptionData = str;
    }
}
