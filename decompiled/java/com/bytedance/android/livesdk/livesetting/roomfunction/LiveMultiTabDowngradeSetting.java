package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_multi_tab_downgrade")
public final class LiveMultiTabDowngradeSetting {
    public static final boolean DEFAULT = false;
    public static final LiveMultiTabDowngradeSetting INSTANCE = new LiveMultiTabDowngradeSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_multi_tab_downgrade", DEFAULT);
    }
}
