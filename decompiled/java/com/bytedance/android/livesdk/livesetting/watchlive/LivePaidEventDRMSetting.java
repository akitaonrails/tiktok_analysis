package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_paid_event_drm")
public final class LivePaidEventDRMSetting {
    public static final LivePaidEventDRMSetting INSTANCE = new LivePaidEventDRMSetting();
    public static final StreamDRMConfig DEFAULT = new StreamDRMConfig();

    public final StreamDRMConfig getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        StreamDRMConfig streamDRMConfig = DEFAULT;
        StreamDRMConfig streamDRMConfig2 = (StreamDRMConfig) settingsManager.getValueSafely("live_paid_event_drm", streamDRMConfig);
        return streamDRMConfig2 != null ? streamDRMConfig2 : streamDRMConfig;
    }

    public final StreamDRMConfig getDEFAULT() {
        return DEFAULT;
    }
}
