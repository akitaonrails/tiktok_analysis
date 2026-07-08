package com.bytedance.android.livesdk.livesetting.feed;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "toplive_go_live_button_tooltips_enable")
public final class TopliveGoLiveButtonTooltipsEnableSetting {
    public static final boolean DEFAULT = false;
    public static final TopliveGoLiveButtonTooltipsEnableSetting INSTANCE = new TopliveGoLiveButtonTooltipsEnableSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("toplive_go_live_button_tooltips_enable", DEFAULT);
    }
}
