package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_cohost_permission_retry_times")
public final class LiveCohostPermissionRetryTimesSetting {
    public static final int DEFAULT = 3;
    public static final LiveCohostPermissionRetryTimesSetting INSTANCE = new LiveCohostPermissionRetryTimesSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_cohost_permission_retry_times", DEFAULT);
    }
}
