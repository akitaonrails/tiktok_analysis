package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("image_cache_hit_sample")
public final class LiveImageCacheHitSampleSetting {
    public static final LiveImageCacheHitSampleSetting INSTANCE = new LiveImageCacheHitSampleSetting();
    public static final int DEFAULT = 1;

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("image_cache_hit_sample", DEFAULT);
    }

    public final int getDEFAULT() {
        return DEFAULT;
    }
}
