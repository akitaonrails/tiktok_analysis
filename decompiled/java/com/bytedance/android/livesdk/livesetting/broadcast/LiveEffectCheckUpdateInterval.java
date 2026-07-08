package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_anchor_effect_cache_threshold")
public final class LiveEffectCheckUpdateInterval {
    public static final int DEFAULT = 0;
    public static final LiveEffectCheckUpdateInterval INSTANCE = new LiveEffectCheckUpdateInterval();

    public final int getInterval() {
        return SettingsManager.INSTANCE.getIntValue("live_anchor_effect_cache_threshold", DEFAULT);
    }
}
