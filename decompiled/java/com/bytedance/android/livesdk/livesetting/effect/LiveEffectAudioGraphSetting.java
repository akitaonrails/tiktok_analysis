package com.bytedance.android.livesdk.livesetting.effect;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_audio_graph_opt")
public final class LiveEffectAudioGraphSetting {
    public static final LiveEffectAudioGraphSetting INSTANCE = new LiveEffectAudioGraphSetting();
    public static final int DEFAULT = 1;
    public static final int setting = SettingsManager.INSTANCE.getIntValue("live_audio_graph_opt", 1);

    public final boolean enable() {
        return setting > 0;
    }
}
