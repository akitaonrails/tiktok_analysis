package com.bytedance.android.livesdk.livesetting.game;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "ttlive_game_landscape_chat_default_swticher")
public final class TtliveGameLandscapeChatDefaultSwitcherSetting {
    public static final boolean DEFAULT = false;
    public static final TtliveGameLandscapeChatDefaultSwitcherSetting INSTANCE = new TtliveGameLandscapeChatDefaultSwitcherSetting();

    public static final boolean isEnabled() {
        return SettingsManager.INSTANCE.getBooleanValue("ttlive_game_landscape_chat_default_swticher", DEFAULT);
    }
}
