package com.bytedance.android.livesdk.livesetting.privilege;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("ttlive_enigma_iap_status_poll_duration_seconds")
public final class LiveEnigmaIapSyncMaxDurationSetting {
    public static final LiveEnigmaIapSyncMaxDurationSetting INSTANCE = new LiveEnigmaIapSyncMaxDurationSetting();
    public static final int DEFAULT = 10;

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("ttlive_enigma_iap_status_poll_duration_seconds", DEFAULT);
    }
}
