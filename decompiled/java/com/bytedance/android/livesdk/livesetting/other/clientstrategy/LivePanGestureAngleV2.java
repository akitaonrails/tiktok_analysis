package com.bytedance.android.livesdk.livesetting.other.clientstrategy;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("leave_pan_gesture_angle_v2")
public final class LivePanGestureAngleV2 {
    public static final StrategyConfig DEFAULT;
    public static final LivePanGestureAngleV2 INSTANCE = new LivePanGestureAngleV2();
    public static final StrategyConfig value;

    public static final class StrategyConfig {
        public static final TypeAdapter ADAPTER;

        @C09CT("detail")
        public String detail;

        @C09CT("type")
        public String type;

        static {
            NormalGson.singleton();
            ADAPTER = new LivePanGestureAngleV2_StrategyConfig_OptTypeAdapter();
        }

        public StrategyConfig() {
            this("", "");
        }

        public StrategyConfig(String str, String str2) {
            this.type = str;
            this.detail = str2;
        }
    }

    public static /* synthetic */ void getValue$annotations() {
    }

    static {
        StrategyConfig strategyConfig = new StrategyConfig("", "");
        DEFAULT = strategyConfig;
        StrategyConfig strategyConfig2 = (StrategyConfig) SettingsManager.INSTANCE.getValueSafely("leave_pan_gesture_angle_v2", strategyConfig);
        if (strategyConfig2 != null) {
            strategyConfig = strategyConfig2;
        }
        value = strategyConfig;
    }

    public static final StrategyConfig getValue() {
        return value;
    }
}
