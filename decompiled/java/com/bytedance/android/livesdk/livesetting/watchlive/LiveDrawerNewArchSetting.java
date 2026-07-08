package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_drawer_new_arch")
public final class LiveDrawerNewArchSetting {
    public static final LiveDrawerNewArchSetting INSTANCE = new LiveDrawerNewArchSetting();
    public static final String[] DEFAULT = {"game_category", "game_category_bottom"};

    public final String[] getValue() {
        return SettingsManager.INSTANCE.getStringArrayValue("live_drawer_new_arch", DEFAULT);
    }
}
