package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "live_cohost_list_jump_status_opt")
public final class LiveCohostListJumpStatusOptSetting {
    public static final boolean DEFAULT = false;
    public static final LiveCohostListJumpStatusOptSetting INSTANCE = new LiveCohostListJumpStatusOptSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_cohost_list_jump_status_opt", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue();
    }
}
