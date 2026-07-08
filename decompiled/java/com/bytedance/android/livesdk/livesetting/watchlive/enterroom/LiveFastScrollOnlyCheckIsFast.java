package com.bytedance.android.livesdk.livesetting.watchlive.enterroom;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_fast_scroll_check_is_fast")
public final class LiveFastScrollOnlyCheckIsFast {
    public static final boolean DEFAULT = false;
    public static final LiveFastScrollOnlyCheckIsFast INSTANCE = new LiveFastScrollOnlyCheckIsFast();

    public static final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_fast_scroll_check_is_fast", DEFAULT);
    }

    public final boolean getDEFAULT() {
        return DEFAULT;
    }
}
