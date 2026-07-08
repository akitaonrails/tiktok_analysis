package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_karaoke_voice_education")
public final class LiveKaraokeMicDetectionSetting {
    public static final int DEFAULT = 0;
    public static final LiveKaraokeMicDetectionSetting INSTANCE = new LiveKaraokeMicDetectionSetting();

    public final boolean enabled() {
        return SettingsManager.INSTANCE.getIntValue("live_karaoke_voice_education", DEFAULT) > 0;
    }
}
