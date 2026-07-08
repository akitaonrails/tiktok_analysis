package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_cohost_widget_window_layout_cache_expire_second_settings")
public final class CoHostWidgetWindowLayoutCacheExpireSecondSetting {
    public static final long DEFAULT = 180;
    public static final CoHostWidgetWindowLayoutCacheExpireSecondSetting INSTANCE = new CoHostWidgetWindowLayoutCacheExpireSecondSetting();

    public final long getExpireSecond() {
        return SettingsManager.INSTANCE.getLongValue("live_cohost_widget_window_layout_cache_expire_second_settings", DEFAULT);
    }
}
