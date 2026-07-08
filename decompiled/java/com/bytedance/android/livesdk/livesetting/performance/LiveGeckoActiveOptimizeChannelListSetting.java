package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "live_gecko_active_optimize_channel_list")
public final class LiveGeckoActiveOptimizeChannelListSetting {
    public static final LiveGeckoActiveOptimizeChannelListSetting INSTANCE = new LiveGeckoActiveOptimizeChannelListSetting();
    public static final List<String> DEFAULT = new ArrayList();

    public final List<String> getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        List<String> list = DEFAULT;
        ArrayList arrayList = (ArrayList) settingsManager.getValueSafely("live_gecko_active_optimize_channel_list", list);
        return arrayList != null ? arrayList : list;
    }
}
