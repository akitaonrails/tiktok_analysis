package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_karaoke_voice_show_toast_time")
public final class LiveKaraokeMicDetectionPhase1Setting {
    public static final int DEFAULT = 50;
    public static final LiveKaraokeMicDetectionPhase1Setting INSTANCE = new LiveKaraokeMicDetectionPhase1Setting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_karaoke_voice_show_toast_time", DEFAULT);
    }

    public final int getCounter() {
        return getValue() / 5;
    }
}
