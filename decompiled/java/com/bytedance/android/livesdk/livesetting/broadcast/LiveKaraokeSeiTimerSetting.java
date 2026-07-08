package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_host_karaok_sei_timer_ms")
public final class LiveKaraokeSeiTimerSetting {
    public static final long DEFAULT = 200;
    public static final LiveKaraokeSeiTimerSetting INSTANCE = new LiveKaraokeSeiTimerSetting();

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue("live_host_karaok_sei_timer_ms", DEFAULT);
    }
}
