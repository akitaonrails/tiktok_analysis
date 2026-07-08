package com.bytedance.android.livesdk.livesetting;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.io.Serializable;

/* JADX INFO: loaded from: classes19.dex */
public final class MultiGuestLayoutMonitorInfo implements Serializable {
    public static final TypeAdapter ADAPTER = new MultiGuestLayoutMonitorInfo_OptTypeAdapter(NormalGson.singleton());

    @C09CT("bg_flick_threshold_ms")
    public long bgFlickThresholdMs;

    @C09CT("layout_flick_threshold_ms")
    public long layoutFlickThresholdMs;

    /* JADX INFO: renamed from: switch, reason: not valid java name */
    @C09CT("switch")
    public boolean f23switch;

    public MultiGuestLayoutMonitorInfo() {
        this(true, 10L, 10L);
    }

    public final long getBgFlickThresholdMs() {
        return this.bgFlickThresholdMs;
    }

    public final long getLayoutFlickThresholdMs() {
        return this.layoutFlickThresholdMs;
    }

    public final boolean getSwitch() {
        return this.f23switch;
    }

    public final void setBgFlickThresholdMs(long j) {
        this.bgFlickThresholdMs = j;
    }

    public final void setLayoutFlickThresholdMs(long j) {
        this.layoutFlickThresholdMs = j;
    }

    public final void setSwitch(boolean z) {
        this.f23switch = z;
    }

    public MultiGuestLayoutMonitorInfo(boolean z, long j, long j2) {
        this.f23switch = z;
        this.layoutFlickThresholdMs = j;
        this.bgFlickThresholdMs = j2;
    }
}
