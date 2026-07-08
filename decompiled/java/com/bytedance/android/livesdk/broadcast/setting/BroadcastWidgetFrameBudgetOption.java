package com.bytedance.android.livesdk.broadcast.setting;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes36.dex */
public final class BroadcastWidgetFrameBudgetOption {
    public static final TypeAdapter ADAPTER;

    @C09CT("low_end_device_score")
    public float lowEndDeviceScore = 6.5f;

    @C09CT("low_end_device_budget")
    public long lowEndDeviceBudget = 8;

    @C09CT("medium_end_device_score")
    public float mediumEndDeviceScore = 8.0f;

    @C09CT("medium_end_device_budget")
    public long mediumEndDeviceBudget = 4;

    @C09CT("high_end_device_budget")
    public long highEndDeviceBudget = 2;

    static {
        NormalGson.singleton();
        ADAPTER = new BroadcastWidgetFrameBudgetOption_OptTypeAdapter();
    }

    public final long getHighEndDeviceBudget() {
        return this.highEndDeviceBudget;
    }

    public final long getLowEndDeviceBudget() {
        return this.lowEndDeviceBudget;
    }

    public final float getLowEndDeviceScore() {
        return this.lowEndDeviceScore;
    }

    public final long getMediumEndDeviceBudget() {
        return this.mediumEndDeviceBudget;
    }

    public final float getMediumEndDeviceScore() {
        return this.mediumEndDeviceScore;
    }

    public final void setHighEndDeviceBudget(long j) {
        this.highEndDeviceBudget = j;
    }

    public final void setLowEndDeviceBudget(long j) {
        this.lowEndDeviceBudget = j;
    }

    public final void setLowEndDeviceScore(float f) {
        this.lowEndDeviceScore = f;
    }

    public final void setMediumEndDeviceBudget(long j) {
        this.mediumEndDeviceBudget = j;
    }

    public final void setMediumEndDeviceScore(float f) {
        this.mediumEndDeviceScore = f;
    }
}
