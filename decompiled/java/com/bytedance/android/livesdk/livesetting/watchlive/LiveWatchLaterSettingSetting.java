package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_watch_later_setting")
public final class LiveWatchLaterSettingSetting {
    public static final int DEFAULT = 0;
    public static final LiveWatchLaterSettingSetting INSTANCE = new LiveWatchLaterSettingSetting();
    public static final int SKYLIGHT_ITEM = 2;
    public static final int TOP_LEFT_ICON = 1;

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_watch_later_setting", DEFAULT);
    }
}
