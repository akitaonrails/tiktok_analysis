package com.bytedance.android.livesdk.livesetting.other;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_bottom_right_like_animation_params")
public final class LiveBottomRightLikeParamsSetting {
    public static final LiveBottomRightLikeParamsSetting INSTANCE = new LiveBottomRightLikeParamsSetting();
    public static final LikeBehaviorParams DEFAULT = new LikeBehaviorParams();

    public static final class LikeBehaviorParams {
        public static final TypeAdapter ADAPTER = new LiveBottomRightLikeParamsSetting_LikeBehaviorParams_OptTypeAdapter(NormalGson.singleton());

        @C09CT("appear_alpha_start")
        public float appearAlphaStart = -1.0f;

        @C09CT("appear_alpha_end")
        public float appearAlphaEnd = -1.0f;

        @C09CT("disappear_alpha_start")
        public float disappearAlphaStart = -1.0f;

        @C09CT("disappear_alpha_end")
        public float disappearAlphaEnd = -1.0f;

        @C09CT("bezier_enable")
        public boolean bezierEnable = true;

        @C09CT("distance_ratio")
        public float distanceRatio = 1.0f;

        @C09CT("time_ratio")
        public float timeRatio = 1.0f;
    }

    private final LikeBehaviorParams getParams() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LikeBehaviorParams likeBehaviorParams = DEFAULT;
        LikeBehaviorParams likeBehaviorParams2 = (LikeBehaviorParams) settingsManager.getValueSafely("live_bottom_right_like_animation_params", likeBehaviorParams);
        return likeBehaviorParams2 != null ? likeBehaviorParams2 : likeBehaviorParams;
    }

    public final boolean bezierEnable() {
        return getParams().bezierEnable;
    }

    public final float getAppearAlphaEnd() {
        return getParams().appearAlphaEnd;
    }

    public final float getAppearAlphaStart() {
        return getParams().appearAlphaStart;
    }

    public final float getDisappearAlphaEnd() {
        return getParams().disappearAlphaEnd;
    }

    public final float getDisappearAlphaStart() {
        return getParams().disappearAlphaStart;
    }

    public final float getDistanceRatio() {
        return getParams().distanceRatio;
    }

    public final float getTimeRatio() {
        return getParams().timeRatio;
    }
}
