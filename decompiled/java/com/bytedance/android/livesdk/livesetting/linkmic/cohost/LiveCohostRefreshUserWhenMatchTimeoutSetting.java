package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "live_cohost_refresh_user_when_match_timeout")
public final class LiveCohostRefreshUserWhenMatchTimeoutSetting {
    public static final long DEFAULT = 5000;
    public static final LiveCohostRefreshUserWhenMatchTimeoutSetting INSTANCE = new LiveCohostRefreshUserWhenMatchTimeoutSetting();

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue("live_cohost_refresh_user_when_match_timeout", DEFAULT);
    }
}
