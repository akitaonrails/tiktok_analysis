package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes8.dex */
public final class BubbleConfig {
    public static final TypeAdapter ADAPTER = new BubbleConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("bubble_delay_time")
    public int bubbleDelayTime;

    @C09CT("delay")
    public long delay;

    @C09CT("enable")
    public boolean enable;

    @C09CT("interval")
    public long interval;

    @C09CT("max_gap_times")
    public int maxGapTimes;

    @C09CT("max_times")
    public int maxTimes;

    @C09CT("version")
    public int version;

    public BubbleConfig() {
        this(false, 0, 604800000L, 10000L, 3, 2, 5000);
    }

    public BubbleConfig(boolean z, int i, long j, long j2, int i2, int i3, int i4) {
        this.enable = z;
        this.version = i;
        this.interval = j;
        this.delay = j2;
        this.maxTimes = i2;
        this.maxGapTimes = i3;
        this.bubbleDelayTime = i4;
    }
}
