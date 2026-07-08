package com.ss.android.ugc.aweme.property;

import X.C09CT;

/* JADX INFO: loaded from: classes35.dex */
public final class CameraLowLightHintToastConfig {

    @C09CT("alsThreshold")
    public final int alsThreshold;

    @C09CT("enable")
    public final boolean enable;

    @C09CT("expoTimeThreshold")
    public final int expoTimeThreshold;

    @C09CT("hint_text_type")
    public final int hintTextType;

    @C09CT("isOneShot")
    public final boolean isOneShot;

    @C09CT("is_toast_position_center")
    public final boolean isToastPositionCenter;

    @C09CT("isoThreshold")
    public final int isoThreshold;

    @C09CT("oneShotMaxTimes")
    public final int oneShotMaxTimes;

    @C09CT("recurrentConsecutiveDaysLimit")
    public final int recurrentConsecutiveDaysLimit;

    @C09CT("recurrentMaxTimes")
    public final int recurrentMaxTimes;

    @C09CT("useAmbientLightSensor")
    public final boolean useAmbientLightSensor;

    @C09CT("useCameraExposure")
    public final boolean useCameraExposure;

    @C09CT("version")
    public final String version;

    public CameraLowLightHintToastConfig() {
        this(false, "", false, 3, 3, 15, true, 60, true, 50, 800, true, 0);
    }

    public CameraLowLightHintToastConfig(boolean z, String str, boolean z2, int i, int i2, int i3, boolean z3, int i4, boolean z4, int i5, int i6, boolean z5, int i7) {
        this.enable = z;
        this.version = str;
        this.isOneShot = z2;
        this.oneShotMaxTimes = i;
        this.recurrentMaxTimes = i2;
        this.recurrentConsecutiveDaysLimit = i3;
        this.useAmbientLightSensor = z3;
        this.alsThreshold = i4;
        this.useCameraExposure = z4;
        this.expoTimeThreshold = i5;
        this.isoThreshold = i6;
        this.isToastPositionCenter = z5;
        this.hintTextType = i7;
    }
}
