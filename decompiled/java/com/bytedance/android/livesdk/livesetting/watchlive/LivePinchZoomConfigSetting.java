package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_pinch_zoom_config")
public final class LivePinchZoomConfigSetting {
    public static final LivePinchZoomConfigSetting INSTANCE = new LivePinchZoomConfigSetting();
    public static final PinchConfig DEFAULT = new PinchConfig();

    public static final class PinchConfig {
        public static final TypeAdapter ADAPTER = new LivePinchZoomConfigSetting_PinchConfig_OptTypeAdapter(NormalGson.singleton());

        @C09CT("enable_landscape_pinch")
        public boolean enableLandscape;

        @C09CT("enable_portrait_pinch")
        public boolean enablePortrait;

        @C09CT("portrait_max_scale")
        public float portraitMaxScale = 4.0f;

        @C09CT("portrait_min_scale")
        public float portraitMinScale = 0.9f;

        @C09CT("landscape_max_scale")
        public float landscapeMaxScale = 4.0f;

        @C09CT("landscape_min_scale")
        public float landscapeMinScale = 0.9f;
    }

    public static final boolean enablePinch() {
        LivePinchZoomConfigSetting livePinchZoomConfigSetting = INSTANCE;
        return livePinchZoomConfigSetting.getValue().enablePortrait || livePinchZoomConfigSetting.getValue().enableLandscape;
    }

    private final PinchConfig getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        PinchConfig pinchConfig = DEFAULT;
        PinchConfig pinchConfig2 = (PinchConfig) settingsManager.getValueSafely("live_pinch_zoom_config", pinchConfig);
        return pinchConfig2 != null ? pinchConfig2 : pinchConfig;
    }

    public static final boolean enablePinch(boolean z) {
        if (z) {
            return INSTANCE.getValue().enablePortrait;
        }
        return INSTANCE.getValue().enableLandscape;
    }

    public static final float getMaxPinchScale(boolean z) {
        if (z) {
            return INSTANCE.getValue().portraitMaxScale;
        }
        return INSTANCE.getValue().landscapeMaxScale;
    }

    public static final float getMinPinchScale(boolean z) {
        if (z) {
            return INSTANCE.getValue().portraitMinScale;
        }
        return INSTANCE.getValue().landscapeMinScale;
    }
}
