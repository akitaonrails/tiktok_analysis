package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_broadcast_guardian_setting")
public final class LiveBroadcastGuardianSetting {
    public static final boolean DEFAULT = true;
    public static final LiveBroadcastGuardianSetting INSTANCE = new LiveBroadcastGuardianSetting();

    public static final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_broadcast_guardian_setting", DEFAULT);
    }
}
