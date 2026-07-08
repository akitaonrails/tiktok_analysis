package com.bytedance.android.livesdk.livesetting.highlight;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "live_replay_image_size_opt")
public final class LiveReplayCoverImageSizeOptEnable {
    public static final LiveReplayCoverImageSizeOptEnable INSTANCE = new LiveReplayCoverImageSizeOptEnable();
    public static final boolean DEFAULT = false;
    public static final boolean value = SettingsManager.INSTANCE.getBooleanValue("live_replay_image_size_opt", DEFAULT);

    public final boolean enable() {
        return value;
    }
}
