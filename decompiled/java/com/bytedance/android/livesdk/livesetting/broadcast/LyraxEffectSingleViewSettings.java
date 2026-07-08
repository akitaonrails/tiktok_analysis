package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("lyrax_effect_single_view_enable")
public final class LyraxEffectSingleViewSettings {
    public static final LyraxEffectSingleViewSettings INSTANCE = new LyraxEffectSingleViewSettings();
    public static final boolean DEFAULT = true;

    public final boolean enabled() {
        return SettingsManager.INSTANCE.getBooleanValue("lyrax_effect_single_view_enable", DEFAULT);
    }
}
