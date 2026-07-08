package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "ttec_live_small_window_api_allow_list")
public final class LiveSmallApiAllowList {
    public static final LiveSmallApiAllowList INSTANCE = new LiveSmallApiAllowList();
    public static final String[] DEFAULT = new String[0];

    public final String[] getValue() {
        return SettingsManager.INSTANCE.getStringArrayValue("ttec_live_small_window_api_allow_list", DEFAULT);
    }
}
