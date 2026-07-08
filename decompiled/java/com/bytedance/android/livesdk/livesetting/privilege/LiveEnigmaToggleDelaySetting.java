package com.bytedance.android.livesdk.livesetting.privilege;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("enigma_toggle_delay")
public final class LiveEnigmaToggleDelaySetting {
    public static final LiveEnigmaToggleDelaySetting INSTANCE = new LiveEnigmaToggleDelaySetting();
    public static final int DEFAULT = 3;

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("enigma_toggle_delay", DEFAULT);
    }
}
