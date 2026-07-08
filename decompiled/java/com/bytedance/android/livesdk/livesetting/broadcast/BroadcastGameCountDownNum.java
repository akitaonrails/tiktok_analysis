package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("ttlive_broadcast_game_count_down_num")
public final class BroadcastGameCountDownNum {
    public static final int DEFAULT = 90;
    public static final BroadcastGameCountDownNum INSTANCE = new BroadcastGameCountDownNum();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("ttlive_broadcast_game_count_down_num", DEFAULT);
    }

    public final boolean isNeedCountDown() {
        return getValue() > 0;
    }
}
