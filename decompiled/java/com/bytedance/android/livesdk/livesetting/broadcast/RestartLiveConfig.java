package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes36.dex */
public final class RestartLiveConfig {
    public static final TypeAdapter ADAPTER = new RestartLiveConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("enable")
    public boolean enable;

    @C09CT("enable_capsule")
    public boolean enableCapsule;

    @C09CT("get_performance_interval")
    public int getPerformanceInterval;

    @C09CT("low_memory_level")
    public String lowMemoryLevel;

    @C09CT("poor_performance_threshold")
    public int poorPerformanceThreshold;

    @C09CT("poor_push_fps_threshold")
    public int poorPushFpsThreshold;

    @C09CT("poor_times")
    public int poorTimes;

    @C09CT("start_detect_time")
    public int startDetectTime;

    public RestartLiveConfig() {
        this(false, false, 15000, 50, 8, "10,15", 300000, 4);
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public final boolean getEnableCapsule() {
        return this.enableCapsule;
    }

    public final int getGetPerformanceInterval() {
        return this.getPerformanceInterval;
    }

    public final String getLowMemoryLevel() {
        return this.lowMemoryLevel;
    }

    public final int getPoorPerformanceThreshold() {
        return this.poorPerformanceThreshold;
    }

    public final int getPoorPushFpsThreshold() {
        return this.poorPushFpsThreshold;
    }

    public final int getPoorTimes() {
        return this.poorTimes;
    }

    public final int getStartDetectTime() {
        return this.startDetectTime;
    }

    public final void setEnable(boolean z) {
        this.enable = z;
    }

    public final void setEnableCapsule(boolean z) {
        this.enableCapsule = z;
    }

    public final void setGetPerformanceInterval(int i) {
        this.getPerformanceInterval = i;
    }

    public final void setLowMemoryLevel(String str) {
        this.lowMemoryLevel = str;
    }

    public final void setPoorPerformanceThreshold(int i) {
        this.poorPerformanceThreshold = i;
    }

    public final void setPoorPushFpsThreshold(int i) {
        this.poorPushFpsThreshold = i;
    }

    public final void setPoorTimes(int i) {
        this.poorTimes = i;
    }

    public final void setStartDetectTime(int i) {
        this.startDetectTime = i;
    }

    public RestartLiveConfig(boolean z, boolean z2, int i, int i2, int i3, String str, int i4, int i5) {
        this.enable = z;
        this.enableCapsule = z2;
        this.getPerformanceInterval = i;
        this.poorPerformanceThreshold = i2;
        this.poorPushFpsThreshold = i3;
        this.lowMemoryLevel = str;
        this.startDetectTime = i4;
        this.poorTimes = i5;
    }
}
