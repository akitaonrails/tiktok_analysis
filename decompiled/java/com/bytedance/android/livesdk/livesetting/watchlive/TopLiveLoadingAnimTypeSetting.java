package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_toplive_loading_animation_type")
public final class TopLiveLoadingAnimTypeSetting {
    public static final int DEFAULT = 0;
    public static final TopLiveLoadingAnimTypeSetting INSTANCE;
    public static final int animType;

    static {
        TopLiveLoadingAnimTypeSetting topLiveLoadingAnimTypeSetting = new TopLiveLoadingAnimTypeSetting();
        INSTANCE = topLiveLoadingAnimTypeSetting;
        animType = topLiveLoadingAnimTypeSetting.getValue();
    }

    private final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_toplive_loading_animation_type", DEFAULT);
    }

    public final int getAnimType() {
        return animType;
    }
}
