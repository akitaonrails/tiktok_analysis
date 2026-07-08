package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "mg_enable_suggest_list_load_more_threshold")
public final class MultiGuestSuggestLoadMoreThresholdSetting {
    public static final MultiGuestSuggestLoadMoreThresholdSetting INSTANCE = new MultiGuestSuggestLoadMoreThresholdSetting();
    public static final int DEFAULT = 40;

    public static final int getMaxThreshold() {
        return SettingsManager.INSTANCE.getIntValue("mg_enable_suggest_list_load_more_threshold", DEFAULT);
    }
}
