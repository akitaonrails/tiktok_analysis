package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_match_individual_match_mvp_animation_modifying")
public final class LiveMatchIndividualMatchMVPAnimationModifyingSettings {
    public static final LiveMatchIndividualMatchMVPAnimationModifyingSettings INSTANCE = new LiveMatchIndividualMatchMVPAnimationModifyingSettings();
    public static final boolean DEFAULT = true;

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_match_individual_match_mvp_animation_modifying", DEFAULT);
    }
}
