package com.bytedance.android.livesdk.livesetting.liveevent;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "live_event_preview_info_simplify_enable")
public final class LiveEventPreviewInfoSimplifyEnableSetting {
    public static final int DEFAULT = 0;
    public static final LiveEventPreviewInfoSimplifyEnableSetting INSTANCE = new LiveEventPreviewInfoSimplifyEnableSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getIntValue("live_event_preview_info_simplify_enable", DEFAULT) == 1;
    }
}
