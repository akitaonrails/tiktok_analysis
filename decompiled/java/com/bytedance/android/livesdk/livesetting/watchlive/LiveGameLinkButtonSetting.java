package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_game_link_button_setting")
public final class LiveGameLinkButtonSetting {
    public static final int DEFAULT = 0;
    public static final int GROUP_EXPERIMENT = 1;
    public static final LiveGameLinkButtonSetting INSTANCE = new LiveGameLinkButtonSetting();

    private final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_game_link_button_setting", DEFAULT);
    }

    public final boolean isExperimentGroup() {
        return getValue() == 1;
    }
}
