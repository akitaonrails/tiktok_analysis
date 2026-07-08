package com.bytedance.android.livesdk.livesetting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_online_rank_follow_change_opt")
public final class LiveOnlineRankFollowChangeOptSetting {
    public static final LiveOnlineRankFollowChangeOptSetting INSTANCE = new LiveOnlineRankFollowChangeOptSetting();
    public static final boolean DEFAULT = true;
    public static final boolean value = SettingsManager.INSTANCE.getBooleanValue("live_online_rank_follow_change_opt", true);

    public final boolean enable() {
        return value;
    }
}
