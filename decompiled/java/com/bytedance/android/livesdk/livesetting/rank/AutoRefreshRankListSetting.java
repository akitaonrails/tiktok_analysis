package com.bytedance.android.livesdk.livesetting.rank;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_refresh_ranklist_interval")
public final class AutoRefreshRankListSetting {
    public static final AutoRefreshRankListSetting INSTANCE = new AutoRefreshRankListSetting();
    public static final AutoRefreshRankInterval DEFAULT = new AutoRefreshRankInterval(5, 5);

    public final AutoRefreshRankInterval getConfig() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        AutoRefreshRankInterval autoRefreshRankInterval = DEFAULT;
        AutoRefreshRankInterval autoRefreshRankInterval2 = (AutoRefreshRankInterval) settingsManager.getValueSafely("live_refresh_ranklist_interval", autoRefreshRankInterval);
        return autoRefreshRankInterval2 != null ? autoRefreshRankInterval2 : autoRefreshRankInterval;
    }
}
