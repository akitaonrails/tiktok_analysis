package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_lop0_opt")
public final class LiveLOP0OptSetting {
    public static final LiveLOP0OptSetting INSTANCE = new LiveLOP0OptSetting();
    public static final boolean DEFAULT = false;
    public static final boolean value = SettingsManager.INSTANCE.getBooleanValue("live_lop0_opt", DEFAULT);

    public final boolean disable() {
        return !value;
    }

    public final boolean enable() {
        return value;
    }
}
