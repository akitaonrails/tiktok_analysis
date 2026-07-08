package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_karaoke_voice_stop_karoke_time")
public final class LiveKaraokeMicDetectionPhase2Setting {
    public static final int DEFAULT = 20;
    public static final LiveKaraokeMicDetectionPhase2Setting INSTANCE = new LiveKaraokeMicDetectionPhase2Setting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_karaoke_voice_stop_karoke_time", DEFAULT);
    }

    public final int getCounter() {
        return getValue() / 5;
    }
}
