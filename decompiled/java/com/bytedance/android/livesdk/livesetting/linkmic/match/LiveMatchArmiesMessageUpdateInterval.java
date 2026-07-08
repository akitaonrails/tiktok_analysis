package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("match_armies_message_update_interval")
public final class LiveMatchArmiesMessageUpdateInterval {
    public static final long DEFAULT = 400;
    public static final LiveMatchArmiesMessageUpdateInterval INSTANCE = new LiveMatchArmiesMessageUpdateInterval();

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue("match_armies_message_update_interval", DEFAULT);
    }
}
