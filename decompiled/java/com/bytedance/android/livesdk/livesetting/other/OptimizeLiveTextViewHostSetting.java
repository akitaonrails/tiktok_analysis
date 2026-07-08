package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "optimize_live_text_view_host")
public final class OptimizeLiveTextViewHostSetting {
    public static final boolean DEFAULT = false;
    public static final OptimizeLiveTextViewHostSetting INSTANCE = new OptimizeLiveTextViewHostSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("optimize_live_text_view_host", DEFAULT);
    }
}
