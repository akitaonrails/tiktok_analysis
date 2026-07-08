package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_inactive_gameplay_gift_force_insertion")
public final class LiveInactiveGameplayForceInsertionSetting {
    public static final LiveInactiveGameplayForceInsertionSetting INSTANCE = new LiveInactiveGameplayForceInsertionSetting();
    public static final int DEFAULT = 604800;

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_inactive_gameplay_gift_force_insertion", DEFAULT);
    }
}
