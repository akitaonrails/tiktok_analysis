package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.model.LiveRecommendAtEnd;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("recommended_end_at_following_live")
public final class RecommendEndAtFollowingSetting {
    public static final RecommendEndAtFollowingSetting INSTANCE = new RecommendEndAtFollowingSetting();
    public static final LiveRecommendAtEnd DEFAULT = new LiveRecommendAtEnd();

    public final LiveRecommendAtEnd getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LiveRecommendAtEnd liveRecommendAtEnd = DEFAULT;
        LiveRecommendAtEnd liveRecommendAtEnd2 = (LiveRecommendAtEnd) settingsManager.getValueSafely("recommended_end_at_following_live", liveRecommendAtEnd);
        return liveRecommendAtEnd2 != null ? liveRecommendAtEnd2 : liveRecommendAtEnd;
    }
}
