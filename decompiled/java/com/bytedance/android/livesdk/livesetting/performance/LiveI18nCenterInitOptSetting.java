package com.bytedance.android.livesdk.livesetting.performance;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_i18n_center_init_opt")
public final class LiveI18nCenterInitOptSetting {
    public static final LiveI18nCenterInitOptSetting INSTANCE = new LiveI18nCenterInitOptSetting();
    public static final I18nInitOptConfig DEFAULT = new I18nInitOptConfig(false, 500, 6000);

    private final I18nInitOptConfig getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        I18nInitOptConfig i18nInitOptConfig = DEFAULT;
        I18nInitOptConfig i18nInitOptConfig2 = (I18nInitOptConfig) settingsManager.getValueSafely("live_i18n_center_init_opt", i18nInitOptConfig);
        return i18nInitOptConfig2 != null ? i18nInitOptConfig2 : i18nInitOptConfig;
    }

    public final int getCachePartitionSize() {
        return getValue().cachePartitionSize;
    }

    public final int getSaveCacheFreqCtrTimeMs() {
        return getValue().saveCacheFreqCtrTimeMs;
    }

    public final boolean isEnable() {
        return getValue().isEnable;
    }

    public static final class I18nInitOptConfig {
        public static final TypeAdapter ADAPTER = new LiveI18nCenterInitOptSetting_I18nInitOptConfig_OptTypeAdapter(NormalGson.singleton());

        @C09CT("cachePartitionSize")
        public int cachePartitionSize;

        @C09CT("isEnable")
        public boolean isEnable;

        @C09CT("saveCacheFreqCtrTimeMs")
        public int saveCacheFreqCtrTimeMs;

        public I18nInitOptConfig() {
            this(false, 500, 6000);
        }

        public I18nInitOptConfig(boolean z, int i, int i2) {
            this.isEnable = z;
            this.cachePartitionSize = i;
            this.saveCacheFreqCtrTimeMs = i2;
        }
    }
}
