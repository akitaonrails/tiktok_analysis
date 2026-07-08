package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("pad_all_panel_adapter_disable_list")
public final class PadAllPanelAdapterDisableListSetting {
    public static final PadAllPanelAdapterDisableListSetting INSTANCE = new PadAllPanelAdapterDisableListSetting();
    public static final String[] DEFAULT = new String[0];

    public final String[] getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        String[] strArr = DEFAULT;
        String[] stringArrayValue = settingsManager.getStringArrayValue("pad_all_panel_adapter_disable_list", strArr);
        return stringArrayValue != null ? stringArrayValue : strArr;
    }
}
