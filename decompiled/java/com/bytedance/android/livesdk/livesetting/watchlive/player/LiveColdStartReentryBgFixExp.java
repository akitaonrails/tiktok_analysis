package com.bytedance.android.livesdk.livesetting.watchlive.player;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_cold_start_reentry_bg_fix")
public final class LiveColdStartReentryBgFixExp {
    public static final int DEFAULT = 0;
    public static final int ENABLE = 1;
    public static final LiveColdStartReentryBgFixExp INSTANCE = new LiveColdStartReentryBgFixExp();

    public static final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_cold_start_reentry_bg_fix", DEFAULT);
    }

    public static final boolean isEnable() {
        return getValue() == 1;
    }
}
