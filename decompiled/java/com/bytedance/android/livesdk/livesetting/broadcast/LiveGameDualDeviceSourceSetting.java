package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_game_dual_device_source_param")
public final class LiveGameDualDeviceSourceSetting {
    public static final LiveGameDualDeviceSourceSetting INSTANCE = new LiveGameDualDeviceSourceSetting();
    public static final SourceParam DEFAULT = new SourceParam(true, 500, 30, 4);

    public final boolean enable() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        SourceParam sourceParam = DEFAULT;
        SourceParam sourceParam2 = (SourceParam) settingsManager.getValueSafely("live_game_dual_device_source_param", sourceParam);
        if (sourceParam2 != null) {
            sourceParam = sourceParam2;
        }
        return sourceParam.enable;
    }

    public final int getBitRate() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        SourceParam sourceParam = DEFAULT;
        SourceParam sourceParam2 = (SourceParam) settingsManager.getValueSafely("live_game_dual_device_source_param", sourceParam);
        if (sourceParam2 != null) {
            sourceParam = sourceParam2;
        }
        return sourceParam.bitRate;
    }

    public final long getDuration() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        SourceParam sourceParam = DEFAULT;
        SourceParam sourceParam2 = (SourceParam) settingsManager.getValueSafely("live_game_dual_device_source_param", sourceParam);
        if (sourceParam2 != null) {
            sourceParam = sourceParam2;
        }
        return sourceParam.retryDuration;
    }

    public final int getFPS() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        SourceParam sourceParam = DEFAULT;
        SourceParam sourceParam2 = (SourceParam) settingsManager.getValueSafely("live_game_dual_device_source_param", sourceParam);
        if (sourceParam2 != null) {
            sourceParam = sourceParam2;
        }
        return sourceParam.cameraFPS;
    }

    public static final class SourceParam {
        public static final TypeAdapter ADAPTER = new LiveGameDualDeviceSourceSetting_SourceParam_OptTypeAdapter(NormalGson.singleton());

        @C09CT("live_game_dual_device_camera_bit_rate")
        public int bitRate;

        @C09CT("live_game_dual_device_camera_fps")
        public int cameraFPS;

        @C09CT("live_game_dual_device_camera_enable")
        public boolean enable;

        @C09CT("live_game_dual_device_camera_retry_duration_sec")
        public long retryDuration;

        public SourceParam() {
            this(true, 500L, 30, 4);
        }

        public SourceParam(boolean z, long j, int i, int i2) {
            this.enable = z;
            this.retryDuration = j;
            this.cameraFPS = i;
            this.bitRate = i2;
        }
    }
}
