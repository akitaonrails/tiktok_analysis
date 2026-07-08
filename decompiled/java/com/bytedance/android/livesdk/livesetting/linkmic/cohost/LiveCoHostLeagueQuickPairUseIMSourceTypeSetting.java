package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "live_cohost_league_quick_pair_use_im_source_type")
public final class LiveCoHostLeagueQuickPairUseIMSourceTypeSetting {
    public static final boolean DEFAULT = true;
    public static final LiveCoHostLeagueQuickPairUseIMSourceTypeSetting INSTANCE = new LiveCoHostLeagueQuickPairUseIMSourceTypeSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_cohost_league_quick_pair_use_im_source_type", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue();
    }
}
