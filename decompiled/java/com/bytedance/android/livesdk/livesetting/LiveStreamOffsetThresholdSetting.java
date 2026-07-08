package com.bytedance.android.livesdk.livesetting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_steam_offset_threshold")
public final class LiveStreamOffsetThresholdSetting {
    public static final LiveStreamOffsetThresholdSetting INSTANCE = new LiveStreamOffsetThresholdSetting();
    public static final float DEFAULT = 0.04f;
    public static final float value = SettingsManager.INSTANCE.getFloatValue("live_steam_offset_threshold", 0.04f);

    public final float threshold() {
        return value;
    }
}
