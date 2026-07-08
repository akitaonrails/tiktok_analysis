package com.bytedance.android.livesdk.livesetting.publicscreen;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_message_first_screen_animation")
public final class LiveMessageFirstScreenAnimation {
    public static final LiveMessageFirstScreenAnimationConfig DEFAULT;
    public static final LiveMessageFirstScreenAnimation INSTANCE = new LiveMessageFirstScreenAnimation();
    public static final LiveMessageFirstScreenAnimationConfig value;

    static {
        LiveMessageFirstScreenAnimationConfig liveMessageFirstScreenAnimationConfig = new LiveMessageFirstScreenAnimationConfig(0, 0L);
        DEFAULT = liveMessageFirstScreenAnimationConfig;
        LiveMessageFirstScreenAnimationConfig liveMessageFirstScreenAnimationConfig2 = (LiveMessageFirstScreenAnimationConfig) SettingsManager.INSTANCE.getValueSafely("live_message_first_screen_animation", liveMessageFirstScreenAnimationConfig);
        if (liveMessageFirstScreenAnimationConfig2 != null) {
            liveMessageFirstScreenAnimationConfig = liveMessageFirstScreenAnimationConfig2;
        }
        value = liveMessageFirstScreenAnimationConfig;
    }

    public static final boolean alphaAnimation() {
        return value.type == 2;
    }

    public static final long duration() {
        return value.duration;
    }

    public static final boolean enableOpt() {
        return value.type != 0;
    }

    public static final boolean moveAnimation() {
        return value.type == 3;
    }

    public static final boolean noAnimation() {
        return value.type == 1;
    }

    public static final class LiveMessageFirstScreenAnimationConfig {
        public static final TypeAdapter ADAPTER;

        @C09CT("animate_duration")
        public long duration;

        @C09CT("animate_type")
        public int type;

        static {
            NormalGson.singleton();
            ADAPTER = new LiveMessageFirstScreenAnimation_LiveMessageFirstScreenAnimationConfig_OptTypeAdapter();
        }

        public LiveMessageFirstScreenAnimationConfig() {
            this(0, 0L);
        }

        public LiveMessageFirstScreenAnimationConfig(int i, long j) {
            this.type = i;
            this.duration = j;
        }
    }
}
