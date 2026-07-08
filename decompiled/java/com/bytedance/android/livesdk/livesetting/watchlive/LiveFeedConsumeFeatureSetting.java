package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.AFwS205S0000000_17;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_feed_consume_feature_setting")
public final class LiveFeedConsumeFeatureSetting {
    public static final LiveFeedConsumeFeatureSetting INSTANCE = new LiveFeedConsumeFeatureSetting();
    public static final LiveFeedConsumeFeatureConfig DEFAULT = new LiveFeedConsumeFeatureConfig(false, 2);
    public static final C01GW value$delegate = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(90));

    private final LiveFeedConsumeFeatureConfig getValue() {
        return (LiveFeedConsumeFeatureConfig) value$delegate.getValue();
    }

    public final boolean enable() {
        return getValue().enable;
    }

    public static final class LiveFeedConsumeFeatureConfig {
        public static final TypeAdapter ADAPTER = new LiveFeedConsumeFeatureSetting_LiveFeedConsumeFeatureConfig_OptTypeAdapter(NormalGson.singleton());

        @C09CT("consume_id_type")
        public int consumeIdType;

        @C09CT("enable")
        public boolean enable;

        public LiveFeedConsumeFeatureConfig() {
            this(false, 2);
        }

        public LiveFeedConsumeFeatureConfig(boolean z, int i) {
            this.enable = z;
            this.consumeIdType = i;
        }
    }
}
