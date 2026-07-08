package com.bytedance.android.livesdk.livesetting.other;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_like_animation_downgrade_setting")
public final class LiveLikeAnimationDowngradeSetting {
    public static final LiveLikeAnimatorDowngradeConfig DEFAULT;
    public static final LiveLikeAnimationDowngradeSetting INSTANCE = new LiveLikeAnimationDowngradeSetting();
    public static final LiveBottomLikeAnimatorDowngradeConfig bottomDowngradeConfig;
    public static final LiveLikeAnimatorDowngradeConfig config;
    public static final LiveTapLikeAnimatorDowngradeConfig tapDowngradeConfig;
    public static final LiveUserInfoLikeAnimatorDowngradeConfig userinfoConfig;

    public static final class LiveBottomLikeAnimatorDowngradeConfig {
        public static final TypeAdapter ADAPTER = new LiveLikeAnimationDowngradeSetting_LiveBottomLikeAnimatorDowngradeConfig_OptTypeAdapter(NormalGson.singleton());

        @C09CT("distance_ratio")
        public float distanceRatio;

        @C09CT("duration_ratio")
        public float durationRatio;

        @C09CT("fixed_alpha_ratio")
        public float fixedAlphaRatio;

        @C09CT("minFrameRate")
        public int minFrameRate;

        @C09CT("refreshFrameInterval")
        public int refreshFrameInterval;

        @C09CT("remove_bottom_like_alpha_animator")
        public boolean removeBottomLikeAlphaAnim;

        @C09CT("remove_bottom_like_animator")
        public boolean removeBottomLikeAnimator;

        public LiveBottomLikeAnimatorDowngradeConfig() {
            this(false, false, 1, 25, -1.0f, 1.0f, 1.0f);
        }

        public LiveBottomLikeAnimatorDowngradeConfig(boolean z, boolean z2, int i, int i2, float f, float f2, float f3) {
            this.removeBottomLikeAnimator = z;
            this.removeBottomLikeAlphaAnim = z2;
            this.refreshFrameInterval = i;
            this.minFrameRate = i2;
            this.fixedAlphaRatio = f;
            this.distanceRatio = f2;
            this.durationRatio = f3;
        }
    }

    public static final class LiveLikeAnimatorDowngradeConfig {
        public static final TypeAdapter ADAPTER = new LiveLikeAnimationDowngradeSetting_LiveLikeAnimatorDowngradeConfig_OptTypeAdapter(NormalGson.singleton());

        @C09CT("bottom_downgrade_config")
        public LiveBottomLikeAnimatorDowngradeConfig bottomDowngradeConfig;

        @C09CT("tap_downgrade_config")
        public LiveTapLikeAnimatorDowngradeConfig tapDowngradeConfig;

        @C09CT("userinfo_downgrade_config")
        public LiveUserInfoLikeAnimatorDowngradeConfig userinfoDowngradeConfig;

        public LiveLikeAnimatorDowngradeConfig() {
            this(new LiveBottomLikeAnimatorDowngradeConfig(false, false, 1, 25, -1.0f, 1.0f, 1.0f), new LiveTapLikeAnimatorDowngradeConfig(false), new LiveUserInfoLikeAnimatorDowngradeConfig(false));
        }

        public LiveLikeAnimatorDowngradeConfig(LiveBottomLikeAnimatorDowngradeConfig liveBottomLikeAnimatorDowngradeConfig, LiveTapLikeAnimatorDowngradeConfig liveTapLikeAnimatorDowngradeConfig, LiveUserInfoLikeAnimatorDowngradeConfig liveUserInfoLikeAnimatorDowngradeConfig) {
            this.bottomDowngradeConfig = liveBottomLikeAnimatorDowngradeConfig;
            this.tapDowngradeConfig = liveTapLikeAnimatorDowngradeConfig;
            this.userinfoDowngradeConfig = liveUserInfoLikeAnimatorDowngradeConfig;
        }
    }

    static {
        LiveLikeAnimatorDowngradeConfig liveLikeAnimatorDowngradeConfig = new LiveLikeAnimatorDowngradeConfig(new LiveBottomLikeAnimatorDowngradeConfig(false, false, 1, 25, -1.0f, 1.0f, 1.0f), new LiveTapLikeAnimatorDowngradeConfig(false), new LiveUserInfoLikeAnimatorDowngradeConfig(false));
        DEFAULT = liveLikeAnimatorDowngradeConfig;
        LiveLikeAnimatorDowngradeConfig liveLikeAnimatorDowngradeConfig2 = (LiveLikeAnimatorDowngradeConfig) SettingsManager.INSTANCE.getValueSafely("live_like_animation_downgrade_setting", liveLikeAnimatorDowngradeConfig);
        if (liveLikeAnimatorDowngradeConfig2 != null) {
            liveLikeAnimatorDowngradeConfig = liveLikeAnimatorDowngradeConfig2;
        }
        config = liveLikeAnimatorDowngradeConfig;
        bottomDowngradeConfig = liveLikeAnimatorDowngradeConfig.bottomDowngradeConfig;
        tapDowngradeConfig = liveLikeAnimatorDowngradeConfig.tapDowngradeConfig;
        userinfoConfig = liveLikeAnimatorDowngradeConfig.userinfoDowngradeConfig;
    }

    public final float getDistanceRatio() {
        return bottomDowngradeConfig.distanceRatio;
    }

    public final float getDurationRatio() {
        return bottomDowngradeConfig.durationRatio;
    }

    public final float getFixedAlphaRatio() {
        return bottomDowngradeConfig.fixedAlphaRatio;
    }

    public final boolean isRemoveBottomLikeAlphaAnimator() {
        return bottomDowngradeConfig.removeBottomLikeAlphaAnim;
    }

    public final boolean isRemoveBottomLikeAnimator() {
        return bottomDowngradeConfig.removeBottomLikeAnimator;
    }

    public final boolean isRemoveHeadBreathAnimator() {
        return userinfoConfig.removeHeadBreathAnimator;
    }

    public final boolean isRemoveTapLikeToHeadAnimator() {
        return tapDowngradeConfig.removeTapLikeToHeadAnim;
    }

    public static final class LiveTapLikeAnimatorDowngradeConfig {
        public static final TypeAdapter ADAPTER = new LiveLikeAnimationDowngradeSetting_LiveTapLikeAnimatorDowngradeConfig_OptTypeAdapter(NormalGson.singleton());

        @C09CT("remove_tap_like_to_head_animator")
        public boolean removeTapLikeToHeadAnim;

        public LiveTapLikeAnimatorDowngradeConfig() {
            this(false);
        }

        public LiveTapLikeAnimatorDowngradeConfig(boolean z) {
            this.removeTapLikeToHeadAnim = z;
        }
    }

    public static final class LiveUserInfoLikeAnimatorDowngradeConfig {
        public static final TypeAdapter ADAPTER = new LiveLikeAnimationDowngradeSetting_LiveUserInfoLikeAnimatorDowngradeConfig_OptTypeAdapter(NormalGson.singleton());

        @C09CT("remove_breath_animator")
        public boolean removeHeadBreathAnimator;

        public LiveUserInfoLikeAnimatorDowngradeConfig() {
            this(false);
        }

        public LiveUserInfoLikeAnimatorDowngradeConfig(boolean z) {
            this.removeHeadBreathAnimator = z;
        }
    }

    public final int getLikeAnimatorDegradeFrameInterval(float f) {
        if (f > 0.0f) {
            LiveBottomLikeAnimatorDowngradeConfig liveBottomLikeAnimatorDowngradeConfig = bottomDowngradeConfig;
            int i = liveBottomLikeAnimatorDowngradeConfig.refreshFrameInterval;
            float f2 = f / i;
            int i2 = liveBottomLikeAnimatorDowngradeConfig.minFrameRate;
            if (f2 <= i2) {
                return (int) (f / i2);
            }
            return i;
        }
        return 1;
    }
}
