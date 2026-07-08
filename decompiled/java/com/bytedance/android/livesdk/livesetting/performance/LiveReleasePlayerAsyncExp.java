package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_release_player_async_exp")
public final class LiveReleasePlayerAsyncExp {
    public static final LiveReleasePlayerAsyncExp INSTANCE = new LiveReleasePlayerAsyncExp();
    public static final boolean DEFAULT = false;
    public static final boolean isEnable = SettingsManager.INSTANCE.getBooleanValue("live_release_player_async_exp", DEFAULT);

    public static /* synthetic */ void isEnable$annotations() {
    }

    public static final boolean isEnable() {
        return isEnable;
    }
}
