package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_match_enigma_thread_logic_enable")
public final class LiveMatchEnigmaThreadLogicSetting {
    public static final boolean DEFAULT = true;
    public static final LiveMatchEnigmaThreadLogicSetting INSTANCE = new LiveMatchEnigmaThreadLogicSetting();

    public final boolean isEnabled() {
        return SettingsManager.INSTANCE.getBooleanValue("live_match_enigma_thread_logic_enable", DEFAULT);
    }
}
