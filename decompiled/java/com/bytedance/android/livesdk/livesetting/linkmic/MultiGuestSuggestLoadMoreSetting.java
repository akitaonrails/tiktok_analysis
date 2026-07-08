package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "mg_enable_suggest_list_load_more")
public final class MultiGuestSuggestLoadMoreSetting {
    public static final boolean DEFAULT = false;
    public static final MultiGuestSuggestLoadMoreSetting INSTANCE = new MultiGuestSuggestLoadMoreSetting();

    public static final boolean isEnabled() {
        return SettingsManager.INSTANCE.getBooleanValue("mg_enable_suggest_list_load_more", DEFAULT);
    }
}
