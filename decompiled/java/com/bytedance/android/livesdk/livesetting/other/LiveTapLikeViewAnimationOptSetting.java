package com.bytedance.android.livesdk.livesetting.other;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_tap_like_view_animation_opt")
public final class LiveTapLikeViewAnimationOptSetting {
    public static final LiveTapLikeViewAnimationOptConfig DEFAULT;
    public static final LiveTapLikeViewAnimationOptSetting INSTANCE = new LiveTapLikeViewAnimationOptSetting();
    public static final LiveTapLikeViewAnimationOptConfig value;

    static {
        LiveTapLikeViewAnimationOptConfig liveTapLikeViewAnimationOptConfig = new LiveTapLikeViewAnimationOptConfig(false, 10, true, false, 0);
        DEFAULT = liveTapLikeViewAnimationOptConfig;
        LiveTapLikeViewAnimationOptConfig liveTapLikeViewAnimationOptConfig2 = (LiveTapLikeViewAnimationOptConfig) SettingsManager.INSTANCE.getValueSafely("live_tap_like_view_animation_opt", liveTapLikeViewAnimationOptConfig);
        if (liveTapLikeViewAnimationOptConfig2 != null) {
            liveTapLikeViewAnimationOptConfig = liveTapLikeViewAnimationOptConfig2;
        }
        value = liveTapLikeViewAnimationOptConfig;
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

    public static final int viewPoolSize() {
        return value.viewPoolSize;
    }

    public static final class LiveTapLikeViewAnimationOptConfig {
        public static final TypeAdapter ADAPTER = new LiveTapLikeViewAnimationOptSetting_LiveTapLikeViewAnimationOptConfig_OptTypeAdapter(NormalGson.singleton());

        @C09CT("add_view_count_when_init")
        public int addViewCountWhenInit;

        @C09CT("clear_cache_when_room_switch")
        public boolean clearCacheWhenRoomSwitch;

        @C09CT("enable_digg_tap_draw_bitmap_opt")
        public boolean enable;

        @C09CT("digg_tap_bitmap_user_hw")
        public boolean useHw;

        @C09CT("digg_tap_bitmap_view_pool_size")
        public int viewPoolSize;

        public LiveTapLikeViewAnimationOptConfig() {
            this(false, 10, true, false, 0);
        }

        public LiveTapLikeViewAnimationOptConfig(boolean z, int i, boolean z2, boolean z3, int i2) {
            this.enable = z;
            this.viewPoolSize = i;
            this.useHw = z2;
            this.clearCacheWhenRoomSwitch = z3;
            this.addViewCountWhenInit = i2;
        }
    }
}
