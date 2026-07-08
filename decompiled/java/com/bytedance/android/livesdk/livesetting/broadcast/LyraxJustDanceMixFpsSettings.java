package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("lyrax_just_dance_mix_fps")
public final class LyraxJustDanceMixFpsSettings {
    public static final LyraxJustDanceMixFpsSettings INSTANCE = new LyraxJustDanceMixFpsSettings();
    public static final int DEFAULT = 24;

    public final int mixFps() {
        return SettingsManager.INSTANCE.getIntValue("lyrax_just_dance_mix_fps", DEFAULT);
    }
}
