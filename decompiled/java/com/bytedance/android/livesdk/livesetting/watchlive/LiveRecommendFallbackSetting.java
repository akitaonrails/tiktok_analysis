package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_recommend_fallback")
public final class LiveRecommendFallbackSetting {
    public static final LiveRecommendFallbackConfig DEFAULT;
    public static final LiveRecommendFallbackSetting INSTANCE = new LiveRecommendFallbackSetting();
    public static final LiveRecommendFallbackConfig value;

    static {
        LiveRecommendFallbackConfig liveRecommendFallbackConfig = new LiveRecommendFallbackConfig(false, "tiktok_common_backup", "76", "loadmore_recommend", "live_cell");
        DEFAULT = liveRecommendFallbackConfig;
        LiveRecommendFallbackConfig liveRecommendFallbackConfig2 = (LiveRecommendFallbackConfig) SettingsManager.INSTANCE.getValueSafely(LiveRecommendFallbackSetting.class);
        if (liveRecommendFallbackConfig2 != null) {
            liveRecommendFallbackConfig = liveRecommendFallbackConfig2;
        }
        value = liveRecommendFallbackConfig;
    }

    public static final String channelId() {
        return value.channelId;
    }

    public static final String enterFromMerge() {
        return value.enterFromMerge;
    }

    public static final String enterMethod() {
        return value.enterMethod;
    }

    public static final String reqFrom() {
        return value.reqFrom;
    }

    public final boolean enable() {
        return value.enable;
    }
}
