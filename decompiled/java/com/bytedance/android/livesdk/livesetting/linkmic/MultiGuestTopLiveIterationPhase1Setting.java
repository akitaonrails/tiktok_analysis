package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_enable_landing_hangout_tab_by_schema")
public final class MultiGuestTopLiveIterationPhase1Setting {
    public static final boolean DEFAULT = true;
    public static final MultiGuestTopLiveIterationPhase1Setting INSTANCE = new MultiGuestTopLiveIterationPhase1Setting();

    public static final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("multi_guest_enable_landing_hangout_tab_by_schema", DEFAULT) && MultiTopLivePhase1SwitcherSetting.isEnable();
    }
}
