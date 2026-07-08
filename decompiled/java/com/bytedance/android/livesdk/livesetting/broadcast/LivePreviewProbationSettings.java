package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "live_preview_probation_settings")
public final class LivePreviewProbationSettings {
    public static final LivePreviewProbationSettings INSTANCE = new LivePreviewProbationSettings();
    public static final int DEFAULT = 1;

    public static final boolean enable() {
        return SettingsManager.INSTANCE.getIntValue("live_preview_probation_settings", DEFAULT) == 1;
    }
}
