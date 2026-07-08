package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "live_cohost_public_screen_min_height_setting")
public final class LiveCoHostPublicScreenMinHeightSetting {
    public static final float DEFAULT = 125.0f;
    public static final LiveCoHostPublicScreenMinHeightSetting INSTANCE = new LiveCoHostPublicScreenMinHeightSetting();

    public final float minHeightDp() {
        return SettingsManager.INSTANCE.getFloatValue("live_cohost_public_screen_min_height_setting", DEFAULT);
    }
}
