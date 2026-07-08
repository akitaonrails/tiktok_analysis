package com.bytedance.android.livesdk.livesetting.game;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "ttlive_game_moderator_guide_schema")
public final class GameLiveModeratorGuideSchemaSetting {
    public static final String DEFAULT = "";
    public static final GameLiveModeratorGuideSchemaSetting INSTANCE = new GameLiveModeratorGuideSchemaSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("ttlive_game_moderator_guide_schema", DEFAULT);
    }
}
