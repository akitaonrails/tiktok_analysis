package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "live_continue_request_opt")
public final class ContinueLiveOptSetting {
    public static final boolean DEFAULT = false;
    public static final ContinueLiveOptSetting INSTANCE = new ContinueLiveOptSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_continue_request_opt", DEFAULT);
    }
}
