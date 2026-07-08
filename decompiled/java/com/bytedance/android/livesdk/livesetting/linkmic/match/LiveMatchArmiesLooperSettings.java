package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_match_armies_looper_enabled")
public final class LiveMatchArmiesLooperSettings {
    public static final boolean DEFAULT = true;
    public static final LiveMatchArmiesLooperSettings INSTANCE = new LiveMatchArmiesLooperSettings();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_match_armies_looper_enabled", DEFAULT);
    }
}
