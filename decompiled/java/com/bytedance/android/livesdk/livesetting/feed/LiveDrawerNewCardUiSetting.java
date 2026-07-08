package com.bytedance.android.livesdk.livesetting.feed;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_drawer_new_card_ui")
public final class LiveDrawerNewCardUiSetting {
    public static final boolean DEFAULT = false;
    public static final LiveDrawerNewCardUiSetting INSTANCE = new LiveDrawerNewCardUiSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_drawer_new_card_ui", DEFAULT);
    }
}
