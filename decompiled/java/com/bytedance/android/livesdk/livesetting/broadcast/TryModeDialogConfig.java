package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes34.dex */
public final class TryModeDialogConfig {
    public static final TypeAdapter ADAPTER;

    @C09CT("long_interval")
    public long longestDuration;

    @C09CT("action_interval")
    public long motionDuration;

    @C09CT("short_interval")
    public long shortestDuration;

    @C09CT("value")
    public int value;

    static {
        NormalGson.singleton();
        ADAPTER = new TryModeDialogConfig_OptTypeAdapter();
    }

    public TryModeDialogConfig() {
        this(0, 30L, 5L, 60L);
    }

    public final long getLongestDuration() {
        return this.longestDuration;
    }

    public final long getMotionDuration() {
        return this.motionDuration;
    }

    public final long getShortestDuration() {
        return this.shortestDuration;
    }

    public final int getValue() {
        return this.value;
    }

    public final void setLongestDuration(long j) {
        this.longestDuration = j;
    }

    public final void setMotionDuration(long j) {
        this.motionDuration = j;
    }

    public final void setShortestDuration(long j) {
        this.shortestDuration = j;
    }

    public final void setValue(int i) {
        this.value = i;
    }

    public TryModeDialogConfig(int i, long j, long j2, long j3) {
        this.value = i;
        this.shortestDuration = j;
        this.motionDuration = j2;
        this.longestDuration = j3;
    }
}
