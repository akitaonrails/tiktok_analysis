package com.bytedance.android.livesdk.livesetting.performance;

import X.C1697810uHb;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "live_gecko_banner_low_device_optimize_channel_list")
public final class LiveGeckoBannerOptimizeListSetting {
    public static final LiveGeckoBannerOptimizeListSetting INSTANCE = new LiveGeckoBannerOptimizeListSetting();
    public static final List<String> DEFAULT = C1697810uHb.LJIILJJIL("tiktok_live_fundamental_banner", "lynx_dynamic_banner");

    public final List<String> getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        List<String> list = DEFAULT;
        ArrayList arrayList = (ArrayList) settingsManager.getValueSafely("live_gecko_banner_low_device_optimize_channel_list", list);
        return arrayList != null ? arrayList : list;
    }
}
