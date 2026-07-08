package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C01GW;
import X.C2097608Jq;
import X.C452501pT;
import X.C467100ITk;
import com.bytedance.android.live.annotation.SettingsKey;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_inner_recommend_features_inner_config")
public final class LiveFeedDynamicFeatureConfigNew {
    public static final LiveFeedDynamicFeatureConfigNew INSTANCE = new LiveFeedDynamicFeatureConfigNew();
    public static final Map<String, Map<String, Map<String, Integer>>> DEFAULT = C2097608Jq.LJ();
    public static final C01GW value$delegate = C452501pT.LIZIZ(new C467100ITk());

    public final Map<String, Map<String, Map<String, Integer>>> getValue() {
        return (Map) value$delegate.getValue();
    }
}
