package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_match_progress_bar_inverse_setting")
public final class LiveMatchProgressBarInverseSetting {
    public static final boolean DEFAULT = true;
    public static final LiveMatchProgressBarInverseSetting INSTANCE = new LiveMatchProgressBarInverseSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_match_progress_bar_inverse_setting", DEFAULT);
    }
}
