package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_recyclerview_preformance_opt_switch")
public final class LiveRecyclerviewPerformanceOptSwitchSetting {
    public static final LiveRecyclerviewPerformanceOptSwitchSetting INSTANCE = new LiveRecyclerviewPerformanceOptSwitchSetting();
    public static final LiveRecyclerviewPerformanceOptData DEFAULT = new LiveRecyclerviewPerformanceOptData(false, false, false);

    private final LiveRecyclerviewPerformanceOptData getSettingValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LiveRecyclerviewPerformanceOptData liveRecyclerviewPerformanceOptData = DEFAULT;
        LiveRecyclerviewPerformanceOptData liveRecyclerviewPerformanceOptData2 = (LiveRecyclerviewPerformanceOptData) settingsManager.getValueSafely("live_recyclerview_preformance_opt_switch", liveRecyclerviewPerformanceOptData);
        return liveRecyclerviewPerformanceOptData2 != null ? liveRecyclerviewPerformanceOptData2 : liveRecyclerviewPerformanceOptData;
    }

    public final boolean enableOtherOpt() {
        return getSettingValue().other;
    }

    public final boolean enableReusePool() {
        return getSettingValue().reusePool;
    }

    public final boolean enableViewHolderLayoutPreload() {
        return getSettingValue().viewHolderLayoutPreload;
    }
}
