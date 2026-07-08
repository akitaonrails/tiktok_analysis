package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "live_host_insert_consume_interval")
public final class LiveHostInertConsumeInterval {
    public static final LiveHostInertConsumeInterval INSTANCE = new LiveHostInertConsumeInterval();
    public static final long DEFAULT = 3000;

    public static final long value() {
        return SettingsManager.INSTANCE.getLongValue("live_host_insert_consume_interval", DEFAULT);
    }
}
