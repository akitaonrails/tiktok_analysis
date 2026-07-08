package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "live_broadcast_saa_mem_leak_opt_record")
public final class LiveBroadcastSAAMemLeakOptRecord {
    public static final LiveBroadcastSAAMemLeakOptRecord INSTANCE = new LiveBroadcastSAAMemLeakOptRecord();
    public static final boolean DEFAULT = false;
    public static final boolean enable = SettingsManager.INSTANCE.getBooleanValue("live_broadcast_saa_mem_leak_opt_record", DEFAULT);

    public static /* synthetic */ void getEnable$annotations() {
    }

    public static final boolean getEnable() {
        return enable;
    }
}
