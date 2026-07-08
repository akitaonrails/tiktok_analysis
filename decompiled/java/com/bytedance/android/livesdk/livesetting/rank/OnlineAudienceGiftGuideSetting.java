package com.bytedance.android.livesdk.livesetting.rank;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("online_audience_gift_guide_setting")
public final class OnlineAudienceGiftGuideSetting {
    public static final OnlineAudienceGiftGuideSetting INSTANCE = new OnlineAudienceGiftGuideSetting();
    public static final Config DEFAULT = new Config(true, 5655);

    public final Config getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        Config config = DEFAULT;
        Config config2 = (Config) settingsManager.getValueSafely("online_audience_gift_guide_setting", config);
        return config2 != null ? config2 : config;
    }

    public static final class Config {
        public static final TypeAdapter ADAPTER = new OnlineAudienceGiftGuideSetting_Config_OptTypeAdapter(NormalGson.singleton());

        @C09CT("online_audience_gift_guide_available")
        public boolean giftGuideAvailable;

        @C09CT("online_audience_gift_guide_gift_id")
        public long giftId;

        public Config() {
            this(true, 5655L);
        }

        public Config(boolean z, long j) {
            this.giftGuideAvailable = z;
            this.giftId = j;
        }
    }
}
