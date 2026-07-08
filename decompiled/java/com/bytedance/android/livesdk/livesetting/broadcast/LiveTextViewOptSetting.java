package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_text_view_opt")
public final class LiveTextViewOptSetting {
    public static final boolean DEFAULT = false;
    public static final LiveTextViewOptSetting INSTANCE = new LiveTextViewOptSetting();

    public static final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_text_view_opt", DEFAULT);
    }
}
