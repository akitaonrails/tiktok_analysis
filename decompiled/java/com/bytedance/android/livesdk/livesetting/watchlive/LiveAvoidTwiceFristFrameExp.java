package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_avoid_twice_frist_frame_exp")
public final class LiveAvoidTwiceFristFrameExp {
    public static final boolean DEFAULT = false;
    public static final LiveAvoidTwiceFristFrameExp INSTANCE = new LiveAvoidTwiceFristFrameExp();

    public static final boolean isExp() {
        return SettingsManager.INSTANCE.getBooleanValue("live_avoid_twice_frist_frame_exp", DEFAULT);
    }

    public static final boolean isDisableExp() {
        return !isExp();
    }
}
