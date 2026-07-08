package defpackage;

import X.C09CT;

/* JADX INFO: loaded from: classes20.dex */
public final class PasskeyFrequencySettingsModel {

    @C09CT("cool_down")
    public int coolDown;

    @C09CT("impressions")
    public int impressions;

    @C09CT("time_frame")
    public int timeFrame;

    public static final class a {
    }

    public PasskeyFrequencySettingsModel() {
        this(3, 3, 14);
    }

    public PasskeyFrequencySettingsModel(int i, int i2, int i3) {
        this.coolDown = i;
        this.impressions = i2;
        this.timeFrame = i3;
    }
}
