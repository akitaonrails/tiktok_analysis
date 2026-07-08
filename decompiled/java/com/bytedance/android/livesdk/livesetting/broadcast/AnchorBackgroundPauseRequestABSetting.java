package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = true, value = "anchor_background_pause_request")
public final class AnchorBackgroundPauseRequestABSetting {
    public static final int DEFAULT = 0;
    public static final AnchorBackgroundPauseRequestABSetting INSTANCE = new AnchorBackgroundPauseRequestABSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getIntValue("anchor_background_pause_request", DEFAULT) == 1;
    }
}
