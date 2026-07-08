package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("remove_not_recommend_live")
public final class RemoveNotRecommendLiveSetting {
    public static final int DEFAULT = 0;
    public static final RemoveNotRecommendLiveSetting INSTANCE = new RemoveNotRecommendLiveSetting();
    public static final int enableValue = 1;

    public final boolean enable() {
        return SettingsManager.INSTANCE.getIntValue("remove_not_recommend_live", DEFAULT) == 1;
    }
}
