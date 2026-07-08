package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_view_fail_detach_log")
public final class LiveViewFailDetachLogSetting {
    public static final boolean DEFAULT = false;
    public static final LiveViewFailDetachLogSetting INSTANCE = new LiveViewFailDetachLogSetting();

    public final boolean getEnabled() {
        return SettingsManager.INSTANCE.getBooleanValue("live_view_fail_detach_log", DEFAULT);
    }
}
