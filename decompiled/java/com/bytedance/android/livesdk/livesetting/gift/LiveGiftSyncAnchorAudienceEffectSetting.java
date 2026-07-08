package com.bytedance.android.livesdk.livesetting.gift;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_gift_sync_audience_anchor")
public final class LiveGiftSyncAnchorAudienceEffectSetting {
    public static final LiveGiftSyncAnchorAudienceEffectSetting INSTANCE = new LiveGiftSyncAnchorAudienceEffectSetting();
    public static final SettingParams DEFAULT = new SettingParams(0, 11, 0, 0, 500);

    public static final class SettingParams {
        public static final TypeAdapter ADAPTER;

        @C09CT("consume_value_max")
        public int consumeValueMax;

        @C09CT("consume_value_min")
        public int consumeValueMin;

        @C09CT("sei_delay_map_count_max")
        public int seiDelayMapCount;

        @C09CT("sei_delay_max_ms")
        public long seiDelayMaxMs;

        @C09CT("sync_strategy")
        public int syncStrategy;

        static {
            NormalGson.singleton();
            ADAPTER = new LiveGiftSyncAnchorAudienceEffectSetting_SettingParams_OptTypeAdapter();
        }

        public SettingParams() {
            this(0, 11, 0, 0L, 500);
        }

        public SettingParams(int i, int i2, int i3, long j, int i4) {
            this.syncStrategy = i;
            this.consumeValueMax = i2;
            this.consumeValueMin = i3;
            this.seiDelayMaxMs = j;
            this.seiDelayMapCount = i4;
        }
    }

    private final SettingParams getSettingValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        SettingParams settingParams = DEFAULT;
        SettingParams settingParams2 = (SettingParams) settingsManager.getValueSafely("live_gift_sync_audience_anchor", settingParams);
        return settingParams2 != null ? settingParams2 : settingParams;
    }

    public final int getConsumeValueMax() {
        return getSettingValue().consumeValueMax;
    }

    public final int getConsumeValueMin() {
        return getSettingValue().consumeValueMin;
    }

    public final long getSeiDelayMaxMs() {
        return getSettingValue().seiDelayMaxMs;
    }

    public final int getSeuDelayMapCount() {
        return getSettingValue().seiDelayMapCount;
    }

    public final int getStrategy() {
        return getSettingValue().syncStrategy;
    }

    public final SettingParams getDEFAULT() {
        return DEFAULT;
    }
}
