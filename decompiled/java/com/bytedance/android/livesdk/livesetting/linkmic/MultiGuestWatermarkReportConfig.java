package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class MultiGuestWatermarkReportConfig {
    public static final TypeAdapter ADAPTER = new MultiGuestWatermarkReportConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("enabled")
    public boolean enabled;

    @C09CT("threshold_of_diff_in_ms")
    public long thresholdOfDiffInMS;

    @C09CT("threshold_of_times")
    public long thresholdOfTimes;

    public MultiGuestWatermarkReportConfig() {
        this(20L, 1000L, true);
    }

    public MultiGuestWatermarkReportConfig(long j, long j2, boolean z) {
        this.thresholdOfTimes = j;
        this.thresholdOfDiffInMS = j2;
        this.enabled = z;
    }
}
