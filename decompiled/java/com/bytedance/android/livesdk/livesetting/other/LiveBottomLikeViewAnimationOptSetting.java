package com.bytedance.android.livesdk.livesetting.other;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_bottom_like_view_animation_opt")
public final class LiveBottomLikeViewAnimationOptSetting {
    public static final LiveBottomLikeViewAnimationOptConfig DEFAULT;
    public static final LiveBottomLikeViewAnimationOptSetting INSTANCE = new LiveBottomLikeViewAnimationOptSetting();
    public static final LiveBottomLikeViewAnimationOptConfig value;

    static {
        LiveBottomLikeViewAnimationOptConfig liveBottomLikeViewAnimationOptConfig = new LiveBottomLikeViewAnimationOptConfig(false, 10, false, true, false, 0);
        DEFAULT = liveBottomLikeViewAnimationOptConfig;
        LiveBottomLikeViewAnimationOptConfig liveBottomLikeViewAnimationOptConfig2 = (LiveBottomLikeViewAnimationOptConfig) SettingsManager.INSTANCE.getValueSafely("live_bottom_like_view_animation_opt", liveBottomLikeViewAnimationOptConfig);
        if (liveBottomLikeViewAnimationOptConfig2 != null) {
            liveBottomLikeViewAnimationOptConfig = liveBottomLikeViewAnimationOptConfig2;
        }
        value = liveBottomLikeViewAnimationOptConfig;
    }

    public static final boolean clearCacheWhenRoomSwitch() {
        return value.clearCacheWhenRoomSwitch;
    }

    public static final boolean enable() {
        return value.enable;
    }

    public static final int getAddViewCountWhenInit() {
        return value.addViewCountWhenInit;
    }

    public static final boolean useHw() {
        return value.useHw;
    }

    public static final boolean useKeyFrame() {
        return value.useKeyFrame;
    }

    public static final int viewPoolSize() {
        return value.viewPoolSize;
    }

    public static final class LiveBottomLikeViewAnimationOptConfig {
        public static final TypeAdapter ADAPTER = new LiveBottomLikeViewAnimationOptSetting_LiveBottomLikeViewAnimationOptConfig_OptTypeAdapter(NormalGson.singleton());

        @C09CT("add_view_count_when_init")
        public int addViewCountWhenInit;

        @C09CT("clear_cache_when_room_switch")
        public boolean clearCacheWhenRoomSwitch;

        @C09CT("enable_digg_bottom_draw_bitmap_opt")
        public boolean enable;

        @C09CT("digg_bottom_bitmap_user_hw")
        public boolean useHw;

        @C09CT("use_key_frame")
        public boolean useKeyFrame;

        @C09CT("digg_bottom_bitmap_view_pool_size")
        public int viewPoolSize;

        public LiveBottomLikeViewAnimationOptConfig() {
            this(false, 10, false, true, false, 0);
        }

        public LiveBottomLikeViewAnimationOptConfig(boolean z, int i, boolean z2, boolean z3, boolean z4, int i2) {
            this.enable = z;
            this.viewPoolSize = i;
            this.useKeyFrame = z2;
            this.useHw = z3;
            this.clearCacheWhenRoomSwitch = z4;
            this.addViewCountWhenInit = i2;
        }
    }
}
