package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveSpeedTestPreRequest {
    public static final TypeAdapter ADAPTER = new LiveSpeedTestPreRequest_OptTypeAdapter(NormalGson.singleton());

    @C09CT("available_duration")
    public double availableDuration;

    @C09CT("enable")
    public boolean enable;

    @C09CT("interval_time")
    public double intervalTime;

    public LiveSpeedTestPreRequest() {
        this(false, 7.0d, 10.0d);
    }

    public final double getAvailableDuration() {
        return this.availableDuration;
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public final double getIntervalTime() {
        return this.intervalTime;
    }

    public final void setAvailableDuration(double d) {
        this.availableDuration = d;
    }

    public final void setEnable(boolean z) {
        this.enable = z;
    }

    public final void setIntervalTime(double d) {
        this.intervalTime = d;
    }

    public LiveSpeedTestPreRequest(boolean z, double d, double d2) {
        this.enable = z;
        this.intervalTime = d;
        this.availableDuration = d2;
    }
}
