package com.bytedance.android.livesdk.livesetting.widget;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreCreateNextRoomPlayer;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_preload_next_room_widget")
public final class LivePreloadNextRoomWidgetsSetting {
    public static final Config DEFAULT;
    public static final LivePreloadNextRoomWidgetsSetting INSTANCE = new LivePreloadNextRoomWidgetsSetting();
    public static final Config value;

    static {
        Config config = new Config(Boolean.FALSE, null, Integer.valueOf(LivePreCreateNextRoomPlayer.ENABLE), Boolean.FALSE, Boolean.FALSE, Boolean.FALSE);
        DEFAULT = config;
        Config config2 = (Config) SettingsManager.INSTANCE.getValueSafely("live_preload_next_room_widget", config);
        if (config2 != null) {
            config = config2;
        }
        value = config;
    }

    public final boolean enable() {
        Config config = value;
        return Intrinsics.LJFF(config.enable, Boolean.TRUE) && config.preloadTriggerTiming != null;
    }

    public final long postDelayTime() {
        if (value.postDelayTime != null) {
            return r0.intValue();
        }
        return 3000L;
    }

    public final boolean enableClick() {
        return enable() && Intrinsics.LJFF(value.enableClick, Boolean.TRUE);
    }

    public final boolean enableFollowAnim() {
        return enable() && Intrinsics.LJFF(value.enableFollowAnim, Boolean.TRUE);
    }

    public final boolean onlyFollowerEnable() {
        return enable() && Intrinsics.LJFF(value.onlyFollowerEnable, Boolean.TRUE);
    }

    public final boolean triggerAfterEnterRoomDelay() {
        Integer num;
        return enable() && (num = value.preloadTriggerTiming) != null && num.intValue() == 1;
    }

    public final boolean triggerAfterWidgetAndStreamFinished() {
        Integer num;
        return enable() && (num = value.preloadTriggerTiming) != null && num.intValue() == 2;
    }

    public static final class Config {
        public static final TypeAdapter ADAPTER = new LivePreloadNextRoomWidgetsSetting_Config_OptTypeAdapter(NormalGson.singleton());

        @C09CT("enable")
        public Boolean enable;

        @C09CT("enable_click")
        public Boolean enableClick;

        @C09CT("enable_follow_anim")
        public Boolean enableFollowAnim;

        @C09CT("only_follower_enable")
        public Boolean onlyFollowerEnable;

        @C09CT("post_delay_time")
        public Integer postDelayTime;

        @C09CT("preload_trigger_timing")
        public Integer preloadTriggerTiming;

        public Config() {
            this(Boolean.FALSE, null, Integer.valueOf(LivePreCreateNextRoomPlayer.ENABLE), Boolean.FALSE, Boolean.FALSE, Boolean.FALSE);
        }

        public Config(Boolean bool, Integer num, Integer num2, Boolean bool2, Boolean bool3, Boolean bool4) {
            this.enable = bool;
            this.preloadTriggerTiming = num;
            this.postDelayTime = num2;
            this.enableClick = bool2;
            this.enableFollowAnim = bool3;
            this.onlyFollowerEnable = bool4;
        }
    }
}
