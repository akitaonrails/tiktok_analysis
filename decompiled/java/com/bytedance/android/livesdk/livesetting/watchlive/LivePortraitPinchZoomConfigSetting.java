package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_portrait_pinch_zoom_config")
public final class LivePortraitPinchZoomConfigSetting {
    public static final LivePortraitPinchZoomConfigSetting INSTANCE = new LivePortraitPinchZoomConfigSetting();
    public static final PinchConfig DEFAULT = new PinchConfig();

    public static final class PinchConfig {
        public static final TypeAdapter ADAPTER = new LivePortraitPinchZoomConfigSetting_PinchConfig_OptTypeAdapter(NormalGson.singleton());

        @C09CT("enable_only_in_clear_screen_mode")
        public boolean enableOnlyInClearScreen;

        @C09CT("enable_portrait_pinch")
        public boolean enablePinch;

        @C09CT("portrait_max_scale")
        public float portraitMaxScale = 4.0f;

        @C09CT("portrait_min_scale")
        public float portraitMinScale = 0.9f;
    }

    public static final PinchConfig getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        PinchConfig pinchConfig = DEFAULT;
        PinchConfig pinchConfig2 = (PinchConfig) settingsManager.getValueSafely("live_portrait_pinch_zoom_config", pinchConfig);
        return pinchConfig2 != null ? pinchConfig2 : pinchConfig;
    }
}
