package com.bytedance.android.livesdk.livesetting.performance;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.AFwS205S0000000_17;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_last_n_perf_feature")
public final class LiveLastNPerfFeatureSetting {
    public static final LiveLastNPerfFeatureSetting INSTANCE = new LiveLastNPerfFeatureSetting();
    public static final LastNPerfFeatureConfig DEFAULT = new LastNPerfFeatureConfig(true, 5);
    public static final C01GW value$delegate = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(77));

    public final LastNPerfFeatureConfig getValue() {
        return (LastNPerfFeatureConfig) value$delegate.getValue();
    }

    public final LastNPerfFeatureConfig getDEFAULT() {
        return DEFAULT;
    }

    public static final class LastNPerfFeatureConfig {
        public static final TypeAdapter ADAPTER = new LiveLastNPerfFeatureSetting_LastNPerfFeatureConfig_OptTypeAdapter(NormalGson.singleton());

        @C09CT("enable")
        public boolean enable;

        @C09CT("last_n_record_count")
        public int lastN;

        public LastNPerfFeatureConfig() {
            this(true, 5);
        }

        public LastNPerfFeatureConfig(boolean z, int i) {
            this.enable = z;
            this.lastN = i;
        }
    }
}
