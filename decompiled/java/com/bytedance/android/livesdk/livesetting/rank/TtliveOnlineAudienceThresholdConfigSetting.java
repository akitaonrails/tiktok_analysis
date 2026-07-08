package com.bytedance.android.livesdk.livesetting.rank;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_online_audience_threshold_config")
public final class TtliveOnlineAudienceThresholdConfigSetting {
    public static final TtliveOnlineAudienceThresholdConfigSetting INSTANCE = new TtliveOnlineAudienceThresholdConfigSetting();
    public static final ThresholdConfig DEFAULT = new ThresholdConfig(false, new ArrayList(), new ArrayList());

    public static final class ProportionConfig {
        public static final TypeAdapter ADAPTER;

        @C09CT("cur_user_count")
        public long curUserCount;

        @C09CT("prop")
        public int prop;

        static {
            NormalGson.singleton();
            ADAPTER = new TtliveOnlineAudienceThresholdConfigSetting_ProportionConfig_OptTypeAdapter();
        }

        public ProportionConfig() {
            this(0L, 0);
        }

        public ProportionConfig(long j, int i) {
            this.curUserCount = j;
            this.prop = i;
        }
    }

    public final ThresholdConfig getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        ThresholdConfig thresholdConfig = DEFAULT;
        ThresholdConfig thresholdConfig2 = (ThresholdConfig) settingsManager.getValueSafely("live_online_audience_threshold_config", thresholdConfig);
        return thresholdConfig2 != null ? thresholdConfig2 : thresholdConfig;
    }

    public final ThresholdConfig getDEFAULT() {
        return DEFAULT;
    }

    public static final class ThresholdConfig {
        public static final TypeAdapter ADAPTER = new TtliveOnlineAudienceThresholdConfigSetting_ThresholdConfig_OptTypeAdapter(NormalGson.singleton());

        @C09CT("down")
        public List<ProportionConfig> downConfig;

        @C09CT("enable")
        public boolean enable;

        @C09CT("up")
        public List<ProportionConfig> upConfig;

        public ThresholdConfig() {
            this(false, null, null);
        }

        public ThresholdConfig(boolean z, List<ProportionConfig> list, List<ProportionConfig> list2) {
            this.enable = z;
            this.downConfig = list;
            this.upConfig = list2;
        }
    }
}
