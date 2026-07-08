package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("like_digg_tap_animation_alpha")
public final class LiveTapAnimationAlphaSetting {
    public static final LikeDiggTapBehaviorConfig DEFAULT;
    public static final LiveTapAnimationAlphaSetting INSTANCE = new LiveTapAnimationAlphaSetting();
    public static final LikeDiggTapBehaviorConfig value;

    static {
        LikeDiggTapBehaviorConfig likeDiggTapBehaviorConfig = new LikeDiggTapBehaviorConfig();
        DEFAULT = likeDiggTapBehaviorConfig;
        LikeDiggTapBehaviorConfig likeDiggTapBehaviorConfig2 = (LikeDiggTapBehaviorConfig) SettingsManager.INSTANCE.getValueSafely("like_digg_tap_animation_alpha", likeDiggTapBehaviorConfig);
        if (likeDiggTapBehaviorConfig2 != null) {
            likeDiggTapBehaviorConfig = likeDiggTapBehaviorConfig2;
        }
        value = likeDiggTapBehaviorConfig;
    }

    public final LikeDiggTapBehaviorConfig getDEFAULT() {
        return DEFAULT;
    }

    public final LikeDiggTapBehaviorConfig getValue() {
        return value;
    }
}
