package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_opt_sei_exp")
public final class LiveOptSeiExp {
    public static final boolean DEFAULT = false;
    public static final LiveOptSeiExp INSTANCE = new LiveOptSeiExp();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_opt_sei_exp", DEFAULT);
    }
}
