package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_user_watch_duration_layer")
public final class LiveUserWatchDurationLayoutSettings {
    public static final int DEFAULT = 0;
    public static final LiveUserWatchDurationLayoutSettings INSTANCE = new LiveUserWatchDurationLayoutSettings();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_user_watch_duration_layer", DEFAULT);
    }
}
