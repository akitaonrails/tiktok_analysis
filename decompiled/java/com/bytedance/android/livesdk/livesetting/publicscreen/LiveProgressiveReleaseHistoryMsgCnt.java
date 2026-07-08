package com.bytedance.android.livesdk.livesetting.publicscreen;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_progressive_release_history_msg_cnt")
public final class LiveProgressiveReleaseHistoryMsgCnt {
    public static final LiveProgressiveReleaseHistoryMsgCnt INSTANCE = new LiveProgressiveReleaseHistoryMsgCnt();
    public static final int DEFAULT = 5;

    public static final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_progressive_release_history_msg_cnt", DEFAULT);
    }
}
