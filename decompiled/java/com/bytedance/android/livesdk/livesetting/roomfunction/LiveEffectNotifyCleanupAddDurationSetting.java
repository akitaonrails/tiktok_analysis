package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_effect_notify_cleanup_add_duration")
public final class LiveEffectNotifyCleanupAddDurationSetting {
    public static final LiveEffectNotifyCleanupAddDurationSetting INSTANCE = new LiveEffectNotifyCleanupAddDurationSetting();
    public static final long DEFAULT = 2000;

    public static final long getDuration() {
        return SettingsManager.INSTANCE.getLongValue("live_effect_notify_cleanup_add_duration", DEFAULT);
    }
}
