package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("quick_cohost_reset_start_time_on_cancel")
public final class QuickCohostResetStartTimeOnCancelSetting {
    public static final boolean DEFAULT = true;
    public static final QuickCohostResetStartTimeOnCancelSetting INSTANCE = new QuickCohostResetStartTimeOnCancelSetting();

    public static final boolean enabled() {
        return SettingsManager.INSTANCE.getBooleanValue("quick_cohost_reset_start_time_on_cancel", DEFAULT);
    }
}
