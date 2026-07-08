package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_anchor_match_fallback_switch")
public final class LiveMatchFallbackSwitch {
    public static final boolean DEFAULT = false;
    public static final LiveMatchFallbackSwitch INSTANCE = new LiveMatchFallbackSwitch();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_anchor_match_fallback_switch", DEFAULT);
    }
}
