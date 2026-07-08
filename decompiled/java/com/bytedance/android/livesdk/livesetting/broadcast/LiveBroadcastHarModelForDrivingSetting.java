package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_broadcast_har_model_for_driving_setting")
public final class LiveBroadcastHarModelForDrivingSetting {
    public static final LiveBroadcastHarModelForDrivingSetting INSTANCE = new LiveBroadcastHarModelForDrivingSetting();
    public static final LiveBroadcastHarModelForDrivingConfig DEFAULT = new LiveBroadcastHarModelForDrivingConfig(10000, 30000);

    public static final class LiveBroadcastHarModelForDrivingConfig {
        public static final TypeAdapter ADAPTER;

        @C09CT("delay_time")
        public long delayTime;

        @C09CT("period_time")
        public long periodTime;

        static {
            NormalGson.singleton();
            ADAPTER = new LiveBroadcastHarModelForDrivingSetting_LiveBroadcastHarModelForDrivingConfig_OptTypeAdapter();
        }

        public LiveBroadcastHarModelForDrivingConfig() {
            this(10000L, 30000L);
        }

        public LiveBroadcastHarModelForDrivingConfig(long j, long j2) {
            this.delayTime = j;
            this.periodTime = j2;
        }
    }

    public final LiveBroadcastHarModelForDrivingConfig getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LiveBroadcastHarModelForDrivingConfig liveBroadcastHarModelForDrivingConfig = DEFAULT;
        LiveBroadcastHarModelForDrivingConfig liveBroadcastHarModelForDrivingConfig2 = (LiveBroadcastHarModelForDrivingConfig) settingsManager.getValueSafely("live_broadcast_har_model_for_driving_setting", liveBroadcastHarModelForDrivingConfig);
        return liveBroadcastHarModelForDrivingConfig2 != null ? liveBroadcastHarModelForDrivingConfig2 : liveBroadcastHarModelForDrivingConfig;
    }
}
