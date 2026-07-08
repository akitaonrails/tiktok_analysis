package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "live_broadcast_preview_mem_leak_opt")
public final class LiveBroadcastPreviewMemLeakOpt {
    public static final LiveBroadcastPreviewMemLeakOpt INSTANCE = new LiveBroadcastPreviewMemLeakOpt();
    public static final boolean DEFAULT = true;
    public static final boolean enable = SettingsManager.INSTANCE.getBooleanValue("live_broadcast_preview_mem_leak_opt", true);

    public static /* synthetic */ void getEnable$annotations() {
    }

    public static final boolean getEnable() {
        return enable;
    }
}
