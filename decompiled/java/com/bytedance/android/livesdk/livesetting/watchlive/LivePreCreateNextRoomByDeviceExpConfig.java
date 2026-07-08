package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C09CT;
import X.C13BV;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes18.dex */
public final class LivePreCreateNextRoomByDeviceExpConfig {
    public static final TypeAdapter ADAPTER = new LivePreCreateNextRoomByDeviceExpConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("default_delay_ms")
    public int defaultDelayMs;

    @C09CT("enable")
    public boolean enable;

    @C09CT("score_intervals")
    public List<PerformanceScoreIntervalConfig> scoreIntervals;

    public LivePreCreateNextRoomByDeviceExpConfig() {
        this(false, 0, null, 7, null);
    }

    public final int getDefaultDelayMs() {
        return this.defaultDelayMs;
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public final List<PerformanceScoreIntervalConfig> getScoreIntervals() {
        return this.scoreIntervals;
    }

    public final void setDefaultDelayMs(int i) {
        this.defaultDelayMs = i;
    }

    public final void setEnable(boolean z) {
        this.enable = z;
    }

    public final void setScoreIntervals(List<PerformanceScoreIntervalConfig> list) {
        this.scoreIntervals = list;
    }

    public LivePreCreateNextRoomByDeviceExpConfig(boolean z, int i, List<PerformanceScoreIntervalConfig> list) {
        this.enable = z;
        this.defaultDelayMs = i;
        this.scoreIntervals = list;
    }

    public LivePreCreateNextRoomByDeviceExpConfig(boolean z, int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? C13BV.INSTANCE : list);
    }
}
