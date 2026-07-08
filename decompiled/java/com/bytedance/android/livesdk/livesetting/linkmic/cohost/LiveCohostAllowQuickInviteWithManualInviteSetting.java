package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "live_cohost_allow_quick_invite_with_manual_invite")
public final class LiveCohostAllowQuickInviteWithManualInviteSetting {
    public static final int DEFAULT = 0;
    public static final LiveCohostAllowQuickInviteWithManualInviteSetting INSTANCE = new LiveCohostAllowQuickInviteWithManualInviteSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_cohost_allow_quick_invite_with_manual_invite", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue() == 1;
    }
}
