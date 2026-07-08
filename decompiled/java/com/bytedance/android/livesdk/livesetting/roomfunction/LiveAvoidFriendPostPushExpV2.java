package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("fyp_easier_exit_push_crowd_group")
public final class LiveAvoidFriendPostPushExpV2 {
    public static final int DEFAULT = 0;
    public static final LiveAvoidFriendPostPushExpV2 INSTANCE = new LiveAvoidFriendPostPushExpV2();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("fyp_easier_exit_push_crowd_group", DEFAULT);
    }
}
