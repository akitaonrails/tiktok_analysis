package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_watch_later_animation_disable")
public final class LiveWatchLaterAnimationDisableSetting {
    public static final boolean DEFAULT = false;
    public static final LiveWatchLaterAnimationDisableSetting INSTANCE = new LiveWatchLaterAnimationDisableSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_watch_later_animation_disable", DEFAULT);
    }
}
