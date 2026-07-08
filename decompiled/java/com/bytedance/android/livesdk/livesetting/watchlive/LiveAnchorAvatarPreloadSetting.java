package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_anchor_avatar_preload")
public final class LiveAnchorAvatarPreloadSetting {
    public static final int DEFAULT = 0;
    public static final int EXP_V1 = 1;
    public static final int EXP_V2 = 2;
    public static final LiveAnchorAvatarPreloadSetting INSTANCE = new LiveAnchorAvatarPreloadSetting();

    public static final boolean preloadWhenCreate() {
        return SettingsManager.INSTANCE.getIntValue("live_anchor_avatar_preload", DEFAULT) == 1;
    }

    public static final boolean preloadWhenSlide() {
        return SettingsManager.INSTANCE.getIntValue("live_anchor_avatar_preload", DEFAULT) == 2;
    }
}
