package com.bytedance.android.livesdk.livesetting.pullstream;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_net_adaptive_enable")
public final class LiveNetAdaptiveEnableSetting {
    public static final boolean DEFAULT = false;
    public static final LiveNetAdaptiveEnableSetting INSTANCE = new LiveNetAdaptiveEnableSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_net_adaptive_enable", DEFAULT);
    }
}
