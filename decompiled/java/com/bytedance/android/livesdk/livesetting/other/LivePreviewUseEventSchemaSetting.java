package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "live_preview_use_event_schema")
public final class LivePreviewUseEventSchemaSetting {
    public static final int DEFAULT = 0;
    public static final LivePreviewUseEventSchemaSetting INSTANCE = new LivePreviewUseEventSchemaSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_preview_use_event_schema", DEFAULT) == 1;
    }
}
