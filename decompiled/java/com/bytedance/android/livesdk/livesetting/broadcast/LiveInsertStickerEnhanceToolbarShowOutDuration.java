package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "live_effect_show_out_duration")
public final class LiveInsertStickerEnhanceToolbarShowOutDuration {
    public static final LiveInsertStickerEnhanceToolbarShowOutDuration INSTANCE = new LiveInsertStickerEnhanceToolbarShowOutDuration();
    public static final long DEFAULT = 20000;
    public static final long value = SettingsManager.INSTANCE.getLongValue("live_effect_show_out_duration", DEFAULT);

    public static final long getDuration(long j) {
        return Math.max(j, value);
    }
}
