package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "live_cohost_allow_friend_manual_activity_in_quick_cohost")
public final class LiveCohostAllowFriendManualActivityInQuickCohostSetting {
    public static final boolean DEFAULT = false;
    public static final LiveCohostAllowFriendManualActivityInQuickCohostSetting INSTANCE = new LiveCohostAllowFriendManualActivityInQuickCohostSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_cohost_allow_friend_manual_activity_in_quick_cohost", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue();
    }
}
