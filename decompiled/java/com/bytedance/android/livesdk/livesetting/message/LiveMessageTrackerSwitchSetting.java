package com.bytedance.android.livesdk.livesetting.message;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_message_tracker_switch")
public final class LiveMessageTrackerSwitchSetting {
    public static final LiveMessageTrackerSwitchSetting INSTANCE = new LiveMessageTrackerSwitchSetting();
    public static final String[] DEFAULT = new String[0];

    public final String[] getValue() {
        return SettingsManager.INSTANCE.getStringArrayValue("live_message_tracker_switch", DEFAULT);
    }

    public final String[] getDEFAULT() {
        return DEFAULT;
    }
}
