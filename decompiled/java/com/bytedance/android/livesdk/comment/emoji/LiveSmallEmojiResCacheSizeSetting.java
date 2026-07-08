package com.bytedance.android.livesdk.comment.emoji;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_small_emoji_res_cache_size")
public final class LiveSmallEmojiResCacheSizeSetting {
    public static final int DEFAULT = 100;
    public static final LiveSmallEmojiResCacheSizeSetting INSTANCE = new LiveSmallEmojiResCacheSizeSetting();

    public final int getValue() {
        Integer numValueOf = Integer.valueOf(SettingsManager.INSTANCE.getIntValue("live_small_emoji_res_cache_size", DEFAULT));
        if (numValueOf.intValue() > 0) {
            return numValueOf.intValue();
        }
        return 100;
    }
}
