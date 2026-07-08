package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "live_cohost_new_go_live_cohost_friend_online_append")
public final class CoHostFriendOnlineAppendExperimentSetting {
    public static final boolean DEFAULT = false;
    public static final CoHostFriendOnlineAppendExperimentSetting INSTANCE = new CoHostFriendOnlineAppendExperimentSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_cohost_new_go_live_cohost_friend_online_append", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue();
    }
}
