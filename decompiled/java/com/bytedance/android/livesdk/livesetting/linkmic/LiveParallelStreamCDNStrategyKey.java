package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_parallel_stream_cdn_strategy_key")
public final class LiveParallelStreamCDNStrategyKey {
    public static final String DEFAULT = "live_cdn_peak_strategy";
    public static final LiveParallelStreamCDNStrategyKey INSTANCE = new LiveParallelStreamCDNStrategyKey();

    public final String getValue() {
        String stringValue = SettingsManager.INSTANCE.getStringValue("live_parallel_stream_cdn_strategy_key", DEFAULT);
        return stringValue.length() == 0 ? "live_cdn_peak_strategy" : stringValue;
    }
}
