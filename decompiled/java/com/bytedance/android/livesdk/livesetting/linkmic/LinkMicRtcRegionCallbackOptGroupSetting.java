package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.CacheLevel;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(cacheLevel = CacheLevel.DID, preciseExperiment = true, value = "linkmic_rtc_region_callback_opt_group")
public final class LinkMicRtcRegionCallbackOptGroupSetting {
    public static final int DEFAULT = 0;
    public static final LinkMicRtcRegionCallbackOptGroupSetting INSTANCE = new LinkMicRtcRegionCallbackOptGroupSetting();

    private final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("linkmic_rtc_region_callback_opt_group", DEFAULT);
    }

    public final boolean enableRtcRegionFilter() {
        return getValue() == 1;
    }
}
