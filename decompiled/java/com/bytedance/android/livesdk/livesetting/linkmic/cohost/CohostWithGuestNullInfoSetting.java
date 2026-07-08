package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("cohost_with_guest_null_info_setting")
public final class CohostWithGuestNullInfoSetting {
    public static final CohostWithGuestNullInfoSetting INSTANCE = new CohostWithGuestNullInfoSetting();
    public static final Configs DEFAULT = new Configs(true);

    public final Configs getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        Configs configs = DEFAULT;
        Configs configs2 = (Configs) settingsManager.getValueSafely("cohost_with_guest_null_info_setting", configs);
        return configs2 != null ? configs2 : configs;
    }

    public static final class Configs {
        public static final TypeAdapter ADAPTER = new CohostWithGuestNullInfoSetting_Configs_OptTypeAdapter(NormalGson.singleton());

        @C09CT("disable_click_when_no_nickname")
        public boolean disableClickWhenNoNickname;

        public Configs() {
            this(true);
        }

        public Configs(boolean z) {
            this.disableClickWhenNoNickname = z;
        }
    }
}
