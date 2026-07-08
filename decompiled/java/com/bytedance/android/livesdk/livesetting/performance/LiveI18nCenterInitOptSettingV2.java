package com.bytedance.android.livesdk.livesetting.performance;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_i18n_center_init_opt_v2")
public final class LiveI18nCenterInitOptSettingV2 {
    public static final LiveI18nCenterInitOptSettingV2 INSTANCE = new LiveI18nCenterInitOptSettingV2();
    public static final I18nInitOptConfig DEFAULT = new I18nInitOptConfig(false, 6000);

    private final I18nInitOptConfig getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        I18nInitOptConfig i18nInitOptConfig = DEFAULT;
        I18nInitOptConfig i18nInitOptConfig2 = (I18nInitOptConfig) settingsManager.getValueSafely("live_i18n_center_init_opt_v2", i18nInitOptConfig);
        return i18nInitOptConfig2 != null ? i18nInitOptConfig2 : i18nInitOptConfig;
    }

    public final int getSaveCacheFreqCtrTimeMs() {
        return getValue().saveCacheFreqCtrTimeMs;
    }

    public final boolean isEnable() {
        return getValue().isEnable;
    }

    public static final class I18nInitOptConfig {
        public static final TypeAdapter ADAPTER = new LiveI18nCenterInitOptSettingV2_I18nInitOptConfig_OptTypeAdapter(NormalGson.singleton());

        @C09CT("isEnable")
        public boolean isEnable;

        @C09CT("saveCacheFreqCtrTimeMs")
        public int saveCacheFreqCtrTimeMs;

        public I18nInitOptConfig() {
            this(false, 6000);
        }

        public I18nInitOptConfig(boolean z, int i) {
            this.isEnable = z;
            this.saveCacheFreqCtrTimeMs = i;
        }
    }
}
