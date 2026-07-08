package com.bytedance.android.livesdk.livesetting.gift;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_gift_sync_audience_anchor_v2")
public final class LiveGiftSyncAnchorAudienceV2Setting {
    public static Boolean isEnabled;
    public static final LiveGiftSyncAnchorAudienceV2Setting INSTANCE = new LiveGiftSyncAnchorAudienceV2Setting();
    public static final SettingParams DEFAULT = new SettingParams(7, 0);

    private final SettingParams getSettingValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        SettingParams settingParams = DEFAULT;
        SettingParams settingParams2 = (SettingParams) settingsManager.getValueSafely("live_gift_sync_audience_anchor_v2", settingParams);
        return settingParams2 != null ? settingParams2 : settingParams;
    }

    public final int getMaxConsumeValue() {
        return getSettingValue().consumeValueMax;
    }

    public final int getMinConsumeValue() {
        return getSettingValue().consumeValueMin;
    }

    public final SettingParams getDEFAULT() {
        return DEFAULT;
    }

    public final Boolean isEnabled() {
        return isEnabled;
    }

    public final void setEnabled(Boolean bool) {
        isEnabled = bool;
    }

    public static final class SettingParams {
        public static final TypeAdapter ADAPTER;

        @C09CT("consume_value_max")
        public int consumeValueMax;

        @C09CT("consume_value_min")
        public int consumeValueMin;

        static {
            NormalGson.singleton();
            ADAPTER = new LiveGiftSyncAnchorAudienceV2Setting_SettingParams_OptTypeAdapter();
        }

        public SettingParams() {
            this(7, 0);
        }

        public SettingParams(int i, int i2) {
            this.consumeValueMax = i;
            this.consumeValueMin = i2;
        }
    }
}
