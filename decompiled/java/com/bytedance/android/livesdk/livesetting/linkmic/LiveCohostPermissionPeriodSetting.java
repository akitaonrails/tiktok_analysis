package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_cohost_permission_period")
public final class LiveCohostPermissionPeriodSetting {
    public static final int DEFAULT = 600;
    public static final LiveCohostPermissionPeriodSetting INSTANCE = new LiveCohostPermissionPeriodSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_cohost_permission_period", DEFAULT);
    }
}
