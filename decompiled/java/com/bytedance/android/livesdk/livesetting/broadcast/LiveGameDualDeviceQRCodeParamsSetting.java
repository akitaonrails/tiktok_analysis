package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CT;
import com.bytedance.android.live.annotation.CacheLevel;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(cacheLevel = CacheLevel.DID, preciseExperiment = true, value = "live_game_dual_device_qr_code_params")
public final class LiveGameDualDeviceQRCodeParamsSetting {
    public static final LiveGameDualDeviceQRCodeParamsSetting INSTANCE = new LiveGameDualDeviceQRCodeParamsSetting();
    public static final SourceParam DEFAULT = new SourceParam(null, null);

    public final Float getBitRateScale() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        SourceParam sourceParam = DEFAULT;
        SourceParam sourceParam2 = (SourceParam) settingsManager.getValueSafely("live_game_dual_device_qr_code_params", sourceParam);
        if (sourceParam2 != null) {
            sourceParam = sourceParam2;
        }
        return sourceParam.bitRateScale;
    }

    public final Integer getFPS() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        SourceParam sourceParam = DEFAULT;
        SourceParam sourceParam2 = (SourceParam) settingsManager.getValueSafely("live_game_dual_device_qr_code_params", sourceParam);
        if (sourceParam2 != null) {
            sourceParam = sourceParam2;
        }
        return sourceParam.cameraFPS;
    }

    public static final class SourceParam {
        public static final TypeAdapter ADAPTER;

        @C09CT("live_game_dual_device_qr_code_bit_rate_scale")
        public Float bitRateScale;

        @C09CT("live_game_dual_device_qr_code_fps")
        public Integer cameraFPS;

        static {
            NormalGson.singleton();
            ADAPTER = new LiveGameDualDeviceQRCodeParamsSetting_SourceParam_OptTypeAdapter();
        }

        public SourceParam() {
            this(null, null);
        }

        public SourceParam(Integer num, Float f) {
            this.cameraFPS = num;
            this.bitRateScale = f;
        }
    }
}
