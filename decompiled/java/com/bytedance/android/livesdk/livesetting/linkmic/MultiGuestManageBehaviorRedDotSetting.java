package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_manage_behavior_red_dot_setting")
public final class MultiGuestManageBehaviorRedDotSetting {
    public static final boolean DEFAULT = true;
    public static final MultiGuestManageBehaviorRedDotSetting INSTANCE = new MultiGuestManageBehaviorRedDotSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("multi_guest_manage_behavior_red_dot_setting", DEFAULT);
    }
}
