package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_center_violation_num_finally_opt_setting")
public final class LiveCenterViolationNumFinallyOptSetting {
    public static final boolean DEFAULT = true;
    public static final LiveCenterViolationNumFinallyOptSetting INSTANCE = new LiveCenterViolationNumFinallyOptSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_center_violation_num_finally_opt_setting", DEFAULT);
    }
}
