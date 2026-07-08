package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_cohost_window_layout_cache_delay_in_second_settings")
public final class CoHostWindowLayoutCacheDelayInSecondSetting {
    public static final long DEFAULT = 3;
    public static final CoHostWindowLayoutCacheDelayInSecondSetting INSTANCE = new CoHostWindowLayoutCacheDelayInSecondSetting();

    public final long getCacheDelayInSecond() {
        return SettingsManager.INSTANCE.getLongValue("live_cohost_window_layout_cache_delay_in_second_settings", DEFAULT);
    }
}
