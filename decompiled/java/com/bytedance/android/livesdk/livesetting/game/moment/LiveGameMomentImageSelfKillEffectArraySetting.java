package com.bytedance.android.livesdk.livesetting.game.moment;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "live_game_moment_image_self_kill_effect_array")
public final class LiveGameMomentImageSelfKillEffectArraySetting {
    public static final LiveGameMomentImageSelfKillEffectArraySetting INSTANCE = new LiveGameMomentImageSelfKillEffectArraySetting();
    public static final int[] DEFAULT = {1};

    public final int[] getValue() {
        int[] iArr = (int[]) SettingsManager.INSTANCE.getValueSafely(LiveGameMomentImageSelfKillEffectArraySetting.class);
        return iArr == null ? DEFAULT : iArr;
    }
}
