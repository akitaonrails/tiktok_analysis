package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_opt_sei_in_ui_exp")
public final class LiveOptSeiInUIExp {
    public static final boolean DEFAULT = false;
    public static final LiveOptSeiInUIExp INSTANCE = new LiveOptSeiInUIExp();

    public static final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_opt_sei_in_ui_exp", DEFAULT);
    }

    public static final boolean enable() {
        return !getValue();
    }
}
