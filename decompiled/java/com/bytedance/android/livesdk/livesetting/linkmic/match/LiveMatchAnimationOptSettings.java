package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_match_animation_opt_settings")
public final class LiveMatchAnimationOptSettings {
    public static final LiveMatchAnimationOptSettings INSTANCE = new LiveMatchAnimationOptSettings();
    public static final AnimationConfig DEFAULT = new AnimationConfig(false, false);

    private final AnimationConfig getConfig() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        AnimationConfig animationConfig = DEFAULT;
        AnimationConfig animationConfig2 = (AnimationConfig) settingsManager.getValueSafely("live_match_animation_opt_settings", animationConfig);
        return animationConfig2 != null ? animationConfig2 : animationConfig;
    }

    public final boolean getPunishAnimUseLottie() {
        return getConfig().punish_anim_use_lottie;
    }

    public final boolean getStartAnimOptEnabled() {
        return getConfig().start_anim_opt;
    }
}
