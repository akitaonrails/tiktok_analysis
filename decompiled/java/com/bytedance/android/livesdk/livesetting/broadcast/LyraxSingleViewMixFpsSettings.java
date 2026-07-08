package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("lyrax_single_view_mix_fps")
public final class LyraxSingleViewMixFpsSettings {
    public static final LyraxSingleViewMixFpsSettings INSTANCE = new LyraxSingleViewMixFpsSettings();
    public static final int DEFAULT = 20;

    public final int mixFps() {
        return SettingsManager.INSTANCE.getIntValue("lyrax_single_view_mix_fps", DEFAULT);
    }
}
