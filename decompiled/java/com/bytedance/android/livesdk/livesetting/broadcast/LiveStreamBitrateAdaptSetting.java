package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_stream_bitrate_adapt")
public final class LiveStreamBitrateAdaptSetting {
    public static final int DEFAULT = -1;
    public static final LiveStreamBitrateAdaptSetting INSTANCE = new LiveStreamBitrateAdaptSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_stream_bitrate_adapt", DEFAULT);
    }
}
