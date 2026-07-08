package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "co_host_invited_count_down_opt_setting")
public final class CoHostInvitedCountDownOptSetting {
    public static final boolean DEFAULT = false;
    public static final CoHostInvitedCountDownOptSetting INSTANCE = new CoHostInvitedCountDownOptSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("co_host_invited_count_down_opt_setting", DEFAULT);
    }
}
