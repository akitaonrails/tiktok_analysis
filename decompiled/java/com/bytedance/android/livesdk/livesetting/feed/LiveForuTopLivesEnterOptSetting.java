package com.bytedance.android.livesdk.livesetting.feed;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_foru_toplives_enter_opt_v3")
public final class LiveForuTopLivesEnterOptSetting {
    public static final LiveForuTopLivesEnterOptSetting INSTANCE = new LiveForuTopLivesEnterOptSetting();
    public static final TopLiveEnterRoomConfig DEFAULT = new TopLiveEnterRoomConfig(0, 0, 0, false, false);

    private final TopLiveEnterRoomConfig getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        TopLiveEnterRoomConfig topLiveEnterRoomConfig = DEFAULT;
        TopLiveEnterRoomConfig topLiveEnterRoomConfig2 = (TopLiveEnterRoomConfig) settingsManager.getValueSafely("live_foru_toplives_enter_opt_v3", topLiveEnterRoomConfig);
        return topLiveEnterRoomConfig2 != null ? topLiveEnterRoomConfig2 : topLiveEnterRoomConfig;
    }

    public final boolean cancelFeed() {
        return getValue().cancelFeed;
    }

    public final boolean cancelTask() {
        return getValue().cancelTask;
    }

    public final boolean enable() {
        return getValue().version > 0;
    }

    public final int getMaxNoFeedTime() {
        return getValue().maxNoFeedTime;
    }

    public final int getMaxWaitTime() {
        return getValue().maxWaitTime;
    }

    public final TopLiveEnterRoomConfig getDEFAULT() {
        return DEFAULT;
    }

    public final boolean enableOpenTopLiveImmediately(long j) {
        if (j == -3 && enable()) {
            return true;
        }
        return false;
    }
}
