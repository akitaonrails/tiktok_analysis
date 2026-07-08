package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_anchor_match_start_fallback_configuration")
public final class LiveMatchFallbackConfigSetting {
    public static final LiveMatchFallbackConfigSetting INSTANCE = new LiveMatchFallbackConfigSetting();
    public static final LiveMatchFallbackConfigData DEFAULT = new LiveMatchFallbackConfigData(60, 2);

    public final LiveMatchFallbackConfigData getValue() {
        LiveMatchFallbackConfigData liveMatchFallbackConfigData = (LiveMatchFallbackConfigData) SettingsManager.INSTANCE.getValueSafely(LiveMatchFallbackConfigSetting.class);
        return liveMatchFallbackConfigData == null ? DEFAULT : liveMatchFallbackConfigData;
    }

    public final LiveMatchFallbackConfigData getDEFAULT() {
        return DEFAULT;
    }
}
