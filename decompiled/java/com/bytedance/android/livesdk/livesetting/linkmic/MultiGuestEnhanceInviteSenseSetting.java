package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "mg_enable_increase_invite_reach_rate")
public final class MultiGuestEnhanceInviteSenseSetting {
    public static final int DEFAULT = 0;
    public static final MultiGuestEnhanceInviteSenseSetting INSTANCE = new MultiGuestEnhanceInviteSenseSetting();

    public static final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("mg_enable_increase_invite_reach_rate", DEFAULT);
    }

    public static final boolean isEnabled() {
        return getValue() > 0;
    }
}
