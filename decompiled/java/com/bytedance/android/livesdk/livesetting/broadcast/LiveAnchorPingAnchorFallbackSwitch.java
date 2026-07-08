package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_ping_anchor_force_fallback")
public final class LiveAnchorPingAnchorFallbackSwitch {
    public static final LiveAnchorPingAnchorFallbackSwitch INSTANCE = new LiveAnchorPingAnchorFallbackSwitch();
    public static final boolean DEFAULT = false;
    public static boolean value = SettingsManager.INSTANCE.getBooleanValue("live_ping_anchor_force_fallback", DEFAULT);

    public final boolean isEnable() {
        return value;
    }
}
