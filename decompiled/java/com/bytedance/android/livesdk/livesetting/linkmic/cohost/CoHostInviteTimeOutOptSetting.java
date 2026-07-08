package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "cohost_invite_time_out_opt_setting")
public final class CoHostInviteTimeOutOptSetting {
    public static final boolean DEFAULT = false;
    public static final CoHostInviteTimeOutOptSetting INSTANCE = new CoHostInviteTimeOutOptSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("cohost_invite_time_out_opt_setting", DEFAULT);
    }
}
