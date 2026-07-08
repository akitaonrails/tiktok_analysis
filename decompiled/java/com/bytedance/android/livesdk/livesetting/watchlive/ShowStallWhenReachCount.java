package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_show_stall_when_reach_stall_count")
public final class ShowStallWhenReachCount {
    public static final int DEFAULT = 3;
    public static final ShowStallWhenReachCount INSTANCE = new ShowStallWhenReachCount();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_show_stall_when_reach_stall_count", DEFAULT);
    }
}
