package com.bytedance.android.livesdk.livesetting.roomfunction;

import X.C09CT;
import X.C418440Gaw;
import X.C814420VxA;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "live_pin_card_style_opt")
public final class LivePinCardSetting {
    public static final LivePinCardSetting INSTANCE = new LivePinCardSetting();
    public static final LivePinCardConfig DEFAULT = new LivePinCardConfig(false, 14, 90, 76, 94);

    private final LivePinCardConfig getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LivePinCardConfig livePinCardConfig = DEFAULT;
        LivePinCardConfig livePinCardConfig2 = (LivePinCardConfig) settingsManager.getValueSafely("live_pin_card_style_opt", livePinCardConfig);
        return livePinCardConfig2 != null ? livePinCardConfig2 : livePinCardConfig;
    }

    public final boolean enableQA() {
        return getValue().enableQA;
    }

    public final int pinCardDefaultHeightPx() {
        return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(getValue().defaultHeight)));
    }

    public final int pinCardMaxHeightPx() {
        return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(getValue().maxHeight)));
    }

    public final int pinCardMinHeightPx() {
        return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(getValue().minHeight)));
    }

    public final int pinCardRadiusPx() {
        return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(getValue().radius)));
    }

    public static final class LivePinCardConfig {
        public static final TypeAdapter ADAPTER = new LivePinCardSetting_LivePinCardConfig_OptTypeAdapter(NormalGson.singleton());

        @C09CT("card_height_default")
        public int defaultHeight;

        @C09CT("enable_qa")
        public boolean enableQA;

        @C09CT("card_height_max")
        public int maxHeight;

        @C09CT("card_height_min")
        public int minHeight;

        @C09CT("card_radius")
        public int radius;

        public LivePinCardConfig() {
            this(false, 14, 90, 76, 94);
        }

        public LivePinCardConfig(boolean z, int i, int i2, int i3, int i4) {
            this.enableQA = z;
            this.radius = i;
            this.defaultHeight = i2;
            this.minHeight = i3;
            this.maxHeight = i4;
        }
    }
}
