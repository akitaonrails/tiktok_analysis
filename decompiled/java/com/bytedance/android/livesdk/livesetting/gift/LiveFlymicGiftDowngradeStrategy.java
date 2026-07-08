package com.bytedance.android.livesdk.livesetting.gift;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_fly_mic_downgrade_strategy")
public final class LiveFlymicGiftDowngradeStrategy {
    public static final LiveFlymicGiftDowngradeStrategy INSTANCE = new LiveFlymicGiftDowngradeStrategy();
    public static final SettingParams DEFAULT = new SettingParams(0.0f, 0, 0.0f, 0);

    public final SettingParams getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        SettingParams settingParams = DEFAULT;
        SettingParams settingParams2 = (SettingParams) settingsManager.getValueSafely("live_fly_mic_downgrade_strategy", settingParams);
        return settingParams2 != null ? settingParams2 : settingParams;
    }

    public static final class SettingParams {
        public static final TypeAdapter ADAPTER;

        @C09CT("downgrade_device_score_level_1")
        public float deviceScoreLevel1;

        @C09CT("downgrade_device_score_level_2")
        public float deviceScoreLevel2;

        @C09CT("downgrade_message_count_level_1")
        public int msgCountLevel1;

        @C09CT("downgrade_message_count_level_2")
        public int msgCountLevel2;

        static {
            NormalGson.singleton();
            ADAPTER = new LiveFlymicGiftDowngradeStrategy_SettingParams_OptTypeAdapter();
        }

        public SettingParams() {
            this(0.0f, 0, 0.0f, 0);
        }

        public SettingParams(float f, int i, float f2, int i2) {
            this.deviceScoreLevel1 = f;
            this.msgCountLevel1 = i;
            this.deviceScoreLevel2 = f2;
            this.msgCountLevel2 = i2;
        }
    }
}
