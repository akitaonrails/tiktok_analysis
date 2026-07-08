package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_match_fix_progress_animation_setting")
public final class LiveMatchFixProgressAnimation {
    public static final boolean DEFAULT = true;
    public static final LiveMatchFixProgressAnimation INSTANCE = new LiveMatchFixProgressAnimation();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_match_fix_progress_animation_setting", DEFAULT);
    }
}
