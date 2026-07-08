package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_match_result_animation")
public final class LiveMatchResultAnimationSetting {
    public static final boolean DEFAULT = true;
    public static final LiveMatchResultAnimationSetting INSTANCE = new LiveMatchResultAnimationSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_match_result_animation", DEFAULT);
    }
}
