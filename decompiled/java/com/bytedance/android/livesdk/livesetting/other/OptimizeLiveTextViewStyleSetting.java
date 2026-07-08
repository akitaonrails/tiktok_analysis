package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "optimize_live_text_view_style")
public final class OptimizeLiveTextViewStyleSetting {
    public static final boolean DEFAULT = false;
    public static final OptimizeLiveTextViewStyleSetting INSTANCE = new OptimizeLiveTextViewStyleSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("optimize_live_text_view_style", DEFAULT);
    }
}
