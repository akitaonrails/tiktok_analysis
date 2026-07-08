package com.bytedance.android.livesdk.livesetting.gift;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("gift_send_request_need_retry_info")
public final class SendGiftRetrySetting {
    public static final SendGiftRetrySetting INSTANCE = new SendGiftRetrySetting();
    public static final SettingParams DEFAULT = new SettingParams(false, 0);

    private final SettingParams getSettingValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        SettingParams settingParams = DEFAULT;
        SettingParams settingParams2 = (SettingParams) settingsManager.getValueSafely("gift_send_request_need_retry_info", settingParams);
        return settingParams2 != null ? settingParams2 : settingParams;
    }

    public final int getRetryCount() {
        if (isEnable()) {
            return getSettingValue().retryCount;
        }
        return 0;
    }

    public final boolean isEnable() {
        return getSettingValue().enable;
    }

    public static final class SettingParams {
        public static final TypeAdapter ADAPTER = new SendGiftRetrySetting_SettingParams_OptTypeAdapter(NormalGson.singleton());

        @C09CT("enable")
        public boolean enable;

        @C09CT("retry_count")
        public int retryCount;

        public SettingParams() {
            this(false, 0);
        }

        public SettingParams(boolean z, int i) {
            this.enable = z;
            this.retryCount = i;
        }
    }
}
