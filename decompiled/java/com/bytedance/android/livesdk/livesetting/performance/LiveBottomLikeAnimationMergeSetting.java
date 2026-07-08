package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("like_bottom_like_animation_merge")
public final class LiveBottomLikeAnimationMergeSetting {
    public static final int DEFAULT = 0;
    public static final LiveBottomLikeAnimationMergeSetting INSTANCE = new LiveBottomLikeAnimationMergeSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("like_bottom_like_animation_merge", DEFAULT);
    }

    public final boolean enable() {
        return getValue() != DEFAULT;
    }

    public final int getDEFAULT() {
        return DEFAULT;
    }
}
