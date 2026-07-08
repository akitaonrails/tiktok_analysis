package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_effect_notify_cleanup_max_duration")
public final class LiveEffectNotifyCleanupMaxDurationSetting {
    public static final LiveEffectNotifyCleanupMaxDurationSetting INSTANCE = new LiveEffectNotifyCleanupMaxDurationSetting();
    public static final long DEFAULT = -1;

    public static final long getDuration() {
        return SettingsManager.INSTANCE.getLongValue("live_effect_notify_cleanup_max_duration", DEFAULT);
    }
}
