package com.bytedance.android.livesdk.livesetting.game;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "game_bottom_bar_mix_disallow_list")
public final class GameBottomBarMixDisallowListSetting {
    public static final GameBottomBarMixDisallowListSetting INSTANCE = new GameBottomBarMixDisallowListSetting();
    public static final String[] DEFAULT = new String[0];

    public final String[] getValue() {
        return SettingsManager.INSTANCE.getStringArrayValue("game_bottom_bar_mix_disallow_list", DEFAULT);
    }
}
