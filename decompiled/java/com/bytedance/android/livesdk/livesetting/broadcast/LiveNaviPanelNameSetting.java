package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "live_navi_panel_name")
public final class LiveNaviPanelNameSetting {
    public static final String DEFAULT = "navi";
    public static final LiveNaviPanelNameSetting INSTANCE = new LiveNaviPanelNameSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("live_navi_panel_name", DEFAULT);
    }
}
