package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "game_link_in_link_mic_revert_exp")
public final class GameLinkInLinkMicRevertExpSetting {
    public static final boolean DEFAULT = true;
    public static final GameLinkInLinkMicRevertExpSetting INSTANCE = new GameLinkInLinkMicRevertExpSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("game_link_in_link_mic_revert_exp", DEFAULT);
    }
}
