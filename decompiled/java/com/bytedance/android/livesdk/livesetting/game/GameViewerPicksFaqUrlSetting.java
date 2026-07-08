package com.bytedance.android.livesdk.livesetting.game;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "game_viewer_picks_faq_url")
public final class GameViewerPicksFaqUrlSetting {
    public static final String DEFAULT = "";
    public static final GameViewerPicksFaqUrlSetting INSTANCE = new GameViewerPicksFaqUrlSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("game_viewer_picks_faq_url", DEFAULT);
    }
}
