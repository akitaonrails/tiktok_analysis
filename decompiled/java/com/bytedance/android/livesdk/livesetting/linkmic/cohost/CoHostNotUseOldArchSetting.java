package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "co_host_not_use_old_arch_setting")
public final class CoHostNotUseOldArchSetting {
    public static final boolean DEFAULT = true;
    public static final CoHostNotUseOldArchSetting INSTANCE = new CoHostNotUseOldArchSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("co_host_not_use_old_arch_setting", DEFAULT);
    }
}
