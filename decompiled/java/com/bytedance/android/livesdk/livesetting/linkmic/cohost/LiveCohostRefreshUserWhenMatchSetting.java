package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "live_cohost_refresh_user_when_match")
public final class LiveCohostRefreshUserWhenMatchSetting {
    public static final int DEFAULT = 0;
    public static final LiveCohostRefreshUserWhenMatchSetting INSTANCE = new LiveCohostRefreshUserWhenMatchSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_cohost_refresh_user_when_match", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue() == 1;
    }
}
