package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_cohost_friend_list_fold_num")
public final class LiveCohostFriendListFoldNum {
    public static final int DEFAULT = 3;
    public static final LiveCohostFriendListFoldNum INSTANCE = new LiveCohostFriendListFoldNum();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_cohost_friend_list_fold_num", DEFAULT);
    }
}
