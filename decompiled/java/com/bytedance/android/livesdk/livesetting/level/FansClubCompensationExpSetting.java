package com.bytedance.android.livesdk.livesetting.level;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("fans_club_compensation_exp_config")
public final class FansClubCompensationExpSetting {
    public static final FansClubCompensationExpSetting INSTANCE = new FansClubCompensationExpSetting();
    public static final LiveFansCompensationConfig DEFAULT = new LiveFansCompensationConfig(false, 2000);

    public final LiveFansCompensationConfig getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LiveFansCompensationConfig liveFansCompensationConfig = DEFAULT;
        LiveFansCompensationConfig liveFansCompensationConfig2 = (LiveFansCompensationConfig) settingsManager.getValueSafely("fans_club_compensation_exp_config", liveFansCompensationConfig);
        return liveFansCompensationConfig2 != null ? liveFansCompensationConfig2 : liveFansCompensationConfig;
    }

    public static final class LiveFansCompensationConfig {
        public static final TypeAdapter ADAPTER = new FansClubCompensationExpSetting_LiveFansCompensationConfig_OptTypeAdapter(NormalGson.singleton());

        @C09CT("starling_key")
        public long compensationDelayTime;

        @C09CT("enable")
        public boolean enableCompensation;

        public LiveFansCompensationConfig() {
            this(false, 2000L);
        }

        public LiveFansCompensationConfig(boolean z, long j) {
            this.enableCompensation = z;
            this.compensationDelayTime = j;
        }
    }
}
