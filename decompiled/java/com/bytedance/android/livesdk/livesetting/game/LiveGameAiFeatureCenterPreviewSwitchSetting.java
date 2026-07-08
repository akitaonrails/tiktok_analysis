package com.bytedance.android.livesdk.livesetting.game;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_game_ai_feature_center_preview_switch")
public final class LiveGameAiFeatureCenterPreviewSwitchSetting {
    public static final boolean DEFAULT = false;
    public static final LiveGameAiFeatureCenterPreviewSwitchSetting INSTANCE = new LiveGameAiFeatureCenterPreviewSwitchSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_game_ai_feature_center_preview_switch", DEFAULT);
    }
}
