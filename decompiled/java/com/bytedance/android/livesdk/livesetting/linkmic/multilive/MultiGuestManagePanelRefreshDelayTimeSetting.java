package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_manage_panel_refresh_delay_time")
public final class MultiGuestManagePanelRefreshDelayTimeSetting {
    public static final double DEFAULT = 2.0d;
    public static final MultiGuestManagePanelRefreshDelayTimeSetting INSTANCE = new MultiGuestManagePanelRefreshDelayTimeSetting();

    public final double getValue() {
        return SettingsManager.INSTANCE.getDoubleValue("multi_guest_manage_panel_refresh_delay_time", DEFAULT);
    }
}
