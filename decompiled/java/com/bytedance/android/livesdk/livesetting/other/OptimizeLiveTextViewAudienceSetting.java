package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "optimize_live_text_view_audience")
public final class OptimizeLiveTextViewAudienceSetting {
    public static final boolean DEFAULT = false;
    public static final OptimizeLiveTextViewAudienceSetting INSTANCE = new OptimizeLiveTextViewAudienceSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("optimize_live_text_view_audience", DEFAULT);
    }
}
