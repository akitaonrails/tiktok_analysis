package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_karaoke_limit_volume")
public final class LiveKaraokeGuestVolumeThresholdSetting {
    public static final int DEFAULT = 20;
    public static final LiveKaraokeGuestVolumeThresholdSetting INSTANCE = new LiveKaraokeGuestVolumeThresholdSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_karaoke_limit_volume", DEFAULT);
    }
}
