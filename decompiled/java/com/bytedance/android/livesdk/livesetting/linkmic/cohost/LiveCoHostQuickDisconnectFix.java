package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "live_cohost_quick_disconnect_fix")
public final class LiveCoHostQuickDisconnectFix {
    public static final boolean DEFAULT = true;
    public static final LiveCoHostQuickDisconnectFix INSTANCE = new LiveCoHostQuickDisconnectFix();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_cohost_quick_disconnect_fix", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue();
    }
}
