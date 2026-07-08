package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "ttlive_multi_panel_manage_guest_opt")
public final class MultiPanelManageGuestOptSetting {
    public static final int DEFAULT = 0;
    public static final MultiPanelManageGuestOptSetting INSTANCE = new MultiPanelManageGuestOptSetting();
    public static final int V1 = 1;
    public static final int V2 = 2;

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("ttlive_multi_panel_manage_guest_opt", DEFAULT);
    }
}
