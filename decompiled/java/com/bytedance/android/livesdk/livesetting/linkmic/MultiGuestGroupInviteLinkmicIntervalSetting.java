package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "multi_group_invite_linkmic_interval")
public final class MultiGuestGroupInviteLinkmicIntervalSetting {
    public static final int DEFAULT = 60;
    public static final MultiGuestGroupInviteLinkmicIntervalSetting INSTANCE = new MultiGuestGroupInviteLinkmicIntervalSetting();

    public final int getTimeInSecond() {
        return SettingsManager.INSTANCE.getIntValue("multi_group_invite_linkmic_interval", DEFAULT);
    }
}
