package com.bytedance.android.livesdk.broadcast.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("ttlh_event_driven_log_enable")
public final class TTLHEventDrivenLogSetting {
    public static final boolean DEFAULT = true;
    public static final TTLHEventDrivenLogSetting INSTANCE = new TTLHEventDrivenLogSetting();

    public final boolean enabled() {
        return SettingsManager.INSTANCE.getBooleanValue("ttlh_event_driven_log_enable", DEFAULT);
    }
}
