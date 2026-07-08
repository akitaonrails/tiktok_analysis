package com.bytedance.android.livesdk.livesetting.performance;

import X.C09CT;
import X.C13BV;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_i18n_init_opt_hot_keys_default")
public final class LiveI18nHotKeysDefaultSetting {
    public static final LiveI18nHotKeysDefaultSetting INSTANCE = new LiveI18nHotKeysDefaultSetting();
    public static final I18nInitOptHotKeysDefault DEFAULT = new I18nInitOptHotKeysDefault(null, 1, null);

    public final I18nInitOptHotKeysDefault getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        I18nInitOptHotKeysDefault i18nInitOptHotKeysDefault = DEFAULT;
        I18nInitOptHotKeysDefault i18nInitOptHotKeysDefault2 = (I18nInitOptHotKeysDefault) settingsManager.getValueSafely("live_i18n_init_opt_hot_keys_default", i18nInitOptHotKeysDefault);
        return i18nInitOptHotKeysDefault2 != null ? i18nInitOptHotKeysDefault2 : i18nInitOptHotKeysDefault;
    }

    public static final class I18nInitOptHotKeysDefault {
        public static final TypeAdapter ADAPTER = new LiveI18nHotKeysDefaultSetting_I18nInitOptHotKeysDefault_OptTypeAdapter(NormalGson.singleton());

        @C09CT("hot_keys")
        public List<String> defaultHotKeys;

        public I18nInitOptHotKeysDefault() {
            this(null, 1, null);
        }

        public I18nInitOptHotKeysDefault(List<String> list) {
            this.defaultHotKeys = list;
        }

        public I18nInitOptHotKeysDefault(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? C13BV.INSTANCE : list);
        }
    }
}
