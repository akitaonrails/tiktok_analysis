package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("remove_not_recommend_preview_live")
public final class RemoveNotRecommendPreLiveSetting {
    public static final int DEFAULT = 0;
    public static final RemoveNotRecommendPreLiveSetting INSTANCE = new RemoveNotRecommendPreLiveSetting();
    public static final int enableValue = 1;

    public final boolean enable() {
        return SettingsManager.INSTANCE.getIntValue("remove_not_recommend_preview_live", DEFAULT) == 1;
    }
}
