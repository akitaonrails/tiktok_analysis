package com.bytedance.android.livesdk.livesetting.privilege;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("enigma_toggle_timeout")
public final class LiveEnigmaToggleTimeoutSetting {
    public static final LiveEnigmaToggleTimeoutSetting INSTANCE = new LiveEnigmaToggleTimeoutSetting();
    public static final int DEFAULT = 15;

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("enigma_toggle_timeout", DEFAULT);
    }
}
