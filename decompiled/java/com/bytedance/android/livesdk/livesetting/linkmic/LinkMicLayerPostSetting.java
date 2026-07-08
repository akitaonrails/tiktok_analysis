package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "link_mic_layer_post_times")
public final class LinkMicLayerPostSetting {
    public static final int DEFAULT = 0;
    public static final LinkMicLayerPostSetting INSTANCE = new LinkMicLayerPostSetting();

    public final int times() {
        return SettingsManager.INSTANCE.getIntValue("link_mic_layer_post_times", DEFAULT);
    }
}
