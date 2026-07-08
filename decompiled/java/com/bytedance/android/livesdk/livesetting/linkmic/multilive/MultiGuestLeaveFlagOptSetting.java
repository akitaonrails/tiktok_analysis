package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_leave_flag_opt_setting")
public final class MultiGuestLeaveFlagOptSetting {
    public static final boolean DEFAULT = false;
    public static final MultiGuestLeaveFlagOptSetting INSTANCE = new MultiGuestLeaveFlagOptSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("multi_guest_leave_flag_opt_setting", DEFAULT);
    }
}
