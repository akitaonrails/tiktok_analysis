package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_match_start_animation_removal_setting")
public final class LiveMatchStartAnimationRemovalSetting {
    public static final boolean DEFAULT = false;
    public static final LiveMatchStartAnimationRemovalSetting INSTANCE = new LiveMatchStartAnimationRemovalSetting();

    public final boolean isEnabled() {
        return SettingsManager.INSTANCE.getBooleanValue("live_match_start_animation_removal_setting", DEFAULT);
    }
}
