package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_slr_diamonds_preload")
public final class SlrDiamondsPreloadSetting {
    public static final SlrDiamondsPreload DEFAULT;
    public static final SlrDiamondsPreloadSetting INSTANCE = new SlrDiamondsPreloadSetting();
    public static final SlrDiamondsPreload config;

    static {
        SlrDiamondsPreload slrDiamondsPreload = new SlrDiamondsPreload(null, null, null, 0, 15, null);
        DEFAULT = slrDiamondsPreload;
        config = (SlrDiamondsPreload) SettingsManager.INSTANCE.getValueSafely("live_slr_diamonds_preload", slrDiamondsPreload);
    }

    public final int getExpiredTimeInSeconds() {
        return config.getExpiredTimeInSeconds();
    }

    public final List<String> getPreloadAllowList() {
        return config.getPreloadAllowList();
    }

    public final String getPreloadSchema() {
        return config.getPreloadSchema();
    }

    public final List<String> getReuseAllowList() {
        return config.getReuseAllowList();
    }
}
