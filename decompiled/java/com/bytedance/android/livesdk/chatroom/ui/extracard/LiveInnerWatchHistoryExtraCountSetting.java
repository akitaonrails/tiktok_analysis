package com.bytedance.android.livesdk.chatroom.ui.extracard;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_inner_watch_history_extra_count")
public final class LiveInnerWatchHistoryExtraCountSetting {
    public static final int DEFAULT = 5;
    public static final LiveInnerWatchHistoryExtraCountSetting INSTANCE = new LiveInnerWatchHistoryExtraCountSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_inner_watch_history_extra_count", DEFAULT);
    }
}
