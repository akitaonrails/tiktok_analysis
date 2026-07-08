package com.bytedance.android.livesdk.livesetting.watchlive.enterroom;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("fast_scroll_delay_time")
public final class FastScrollDelayLoadTime {
    public static final long DEFAULT = 1000;
    public static final FastScrollDelayLoadTime INSTANCE = new FastScrollDelayLoadTime();

    public static final long delayTime() {
        return SettingsManager.INSTANCE.getLongValue("fast_scroll_delay_time", DEFAULT);
    }
}
