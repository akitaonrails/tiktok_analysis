package com.bytedance.android.livesdk.livesetting.watchlive.previewlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "live_preview_report_all_second_label")
public final class LivePreviewShareTagSetting {
    public static final boolean DEFAULT = false;
    public static final LivePreviewShareTagSetting INSTANCE = new LivePreviewShareTagSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_preview_report_all_second_label", DEFAULT);
    }
}
