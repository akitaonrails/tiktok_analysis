package com.bytedance.android.livesdk.livesetting.feed;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_drawer_search_enable")
public final class LiveDrawerSearchEnableSetting {
    public static final boolean DEFAULT = false;
    public static final LiveDrawerSearchEnableSetting INSTANCE = new LiveDrawerSearchEnableSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_drawer_search_enable", DEFAULT);
    }
}
