package com.bytedance.android.livesdk.livesetting.subscription;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "ttlive_sub_management_milstone_uxw")
public final class TtliveSubManagementMilstoneUxwSetting {
    public static final boolean DEFAULT = false;
    public static final TtliveSubManagementMilstoneUxwSetting INSTANCE = new TtliveSubManagementMilstoneUxwSetting();

    public final boolean isEnabled() {
        return SettingsManager.INSTANCE.getBooleanValue("ttlive_sub_management_milstone_uxw", DEFAULT);
    }
}
