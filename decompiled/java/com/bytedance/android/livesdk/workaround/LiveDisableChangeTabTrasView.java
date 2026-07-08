package com.bytedance.android.livesdk.workaround;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "live_disable_change_tab_trans")
public final class LiveDisableChangeTabTrasView {
    public static final boolean DEFAULT = false;
    public static final LiveDisableChangeTabTrasView INSTANCE = new LiveDisableChangeTabTrasView();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_disable_change_tab_trans", DEFAULT);
    }
}
