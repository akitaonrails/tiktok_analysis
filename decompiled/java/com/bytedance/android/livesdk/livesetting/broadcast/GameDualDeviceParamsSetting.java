package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_game_dual_device_param_setting")
public final class GameDualDeviceParamsSetting {
    public static final GameDualDeviceParamsSetting INSTANCE = new GameDualDeviceParamsSetting();
    public static final DualDeviceParamSetting DEFAULT = new DualDeviceParamSetting();

    public static final class DualDeviceParamSetting {
        public static final TypeAdapter ADAPTER;

        @C09CT("width")
        public int width = 640;

        @C09CT("height")
        public int height = 480;

        static {
            NormalGson.singleton();
            ADAPTER = new GameDualDeviceParamsSetting_DualDeviceParamSetting_OptTypeAdapter();
        }
    }

    public final DualDeviceParamSetting getParamSetting() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        DualDeviceParamSetting dualDeviceParamSetting = DEFAULT;
        DualDeviceParamSetting dualDeviceParamSetting2 = (DualDeviceParamSetting) settingsManager.getValueSafely("live_game_dual_device_param_setting", dualDeviceParamSetting);
        return dualDeviceParamSetting2 != null ? dualDeviceParamSetting2 : dualDeviceParamSetting;
    }
}
