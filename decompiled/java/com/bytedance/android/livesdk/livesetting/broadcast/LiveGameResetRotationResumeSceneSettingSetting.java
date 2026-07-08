package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "live_game_reset_rotation_resume_scene_setting")
public final class LiveGameResetRotationResumeSceneSettingSetting {
    public static final int DEFAULT = 1;
    public static final LiveGameResetRotationResumeSceneSettingSetting INSTANCE = new LiveGameResetRotationResumeSceneSettingSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getIntValue("live_game_reset_rotation_resume_scene_setting", DEFAULT) == 1;
    }
}
