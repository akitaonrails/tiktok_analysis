package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "multi_live_random_switch_button")
public final class MultiLiveRandomSwitchButtonSetting {
    public static final boolean DEFAULT = false;
    public static final MultiLiveRandomSwitchButtonSetting INSTANCE = new MultiLiveRandomSwitchButtonSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("multi_live_random_switch_button", DEFAULT);
    }
}
