package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "cohost_set_invite_type_enable")
public final class CohostSetInviteTypeSetting {
    public static final boolean DEFAULT = true;
    public static final CohostSetInviteTypeSetting INSTANCE = new CohostSetInviteTypeSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("cohost_set_invite_type_enable", DEFAULT);
    }
}
