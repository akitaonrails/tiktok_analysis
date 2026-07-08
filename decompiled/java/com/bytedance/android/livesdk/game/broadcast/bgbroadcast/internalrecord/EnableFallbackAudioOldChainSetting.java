package com.bytedance.android.livesdk.game.broadcast.bgbroadcast.internalrecord;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "enable_fallback_audio_old_chain")
public final class EnableFallbackAudioOldChainSetting {
    public static final int $stable = 0;
    public static final boolean DEFAULT = false;
    public static final EnableFallbackAudioOldChainSetting INSTANCE = new EnableFallbackAudioOldChainSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("enable_fallback_audio_old_chain", DEFAULT);
    }
}
