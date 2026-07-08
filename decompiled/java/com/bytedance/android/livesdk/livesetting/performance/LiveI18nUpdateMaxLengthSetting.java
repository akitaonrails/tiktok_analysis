package com.bytedance.android.livesdk.livesetting.performance;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_i18n_update_max_length")
public final class LiveI18nUpdateMaxLengthSetting {
    public static final LiveI18nUpdateMaxLengthSetting INSTANCE = new LiveI18nUpdateMaxLengthSetting();
    public static final I18nUpdateMaxLengthConfig DEFAULT = new I18nUpdateMaxLengthConfig();

    private final I18nUpdateMaxLengthConfig getValue() {
        I18nUpdateMaxLengthConfig i18nUpdateMaxLengthConfig = (I18nUpdateMaxLengthConfig) SettingsManager.INSTANCE.getValueSafely(LiveI18nUpdateMaxLengthSetting.class);
        return i18nUpdateMaxLengthConfig == null ? DEFAULT : i18nUpdateMaxLengthConfig;
    }

    public final int getMaxLength() {
        return getValue().getMaxLength();
    }

    public final boolean isEnable() {
        return getValue().getEnable();
    }

    public static final class I18nUpdateMaxLengthConfig {
        public static final TypeAdapter ADAPTER = new LiveI18nUpdateMaxLengthSetting_I18nUpdateMaxLengthConfig_OptTypeAdapter(NormalGson.singleton());

        @C09CT("enable")
        public boolean enable;

        @C09CT("max_length")
        public int maxLength = 6556000;

        public final boolean getEnable() {
            return this.enable;
        }

        public final int getMaxLength() {
            return this.maxLength;
        }

        public final void setEnable(boolean z) {
            this.enable = z;
        }

        public final void setMaxLength(int i) {
            this.maxLength = i;
        }
    }
}
