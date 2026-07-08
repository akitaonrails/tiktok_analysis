package com.bytedance.android.livesdk.livesetting.other;

import X.C13BV;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_chain_monitor_exclude_error_codes")
public final class LiveChainMonitorExcludeErrorCodesSetting {
    public static final LiveChainMonitorExcludeErrorCodesSetting INSTANCE = new LiveChainMonitorExcludeErrorCodesSetting();
    public static final List<Integer> DEFAULT = C13BV.INSTANCE;

    public final List<Integer> getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        List<Integer> list = DEFAULT;
        List<Integer> list2 = (List) settingsManager.getValueSafely("live_chain_monitor_exclude_error_codes", list);
        return list2 != null ? list2 : list;
    }
}
