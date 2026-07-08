package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_cohost_friend_notice_optimize")
public final class LiveCoHostFriendNoticeOptSetting {
    public static final int DEFAULT = 0;
    public static final LiveCoHostFriendNoticeOptSetting INSTANCE = new LiveCoHostFriendNoticeOptSetting();
    public static final int STRATEGY_BOTH = 3;
    public static final int STRATEGY_EXECUTION = 2;
    public static final int STRATEGY_ITERATION = 1;

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_cohost_friend_notice_optimize", DEFAULT);
    }
}
