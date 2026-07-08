package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C01GW;
import X.C2097608Jq;
import X.C452501pT;
import X.C467090ITj;
import com.bytedance.android.live.annotation.SettingsKey;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_inner_recommend_features")
public final class LiveFeedDynamicFeatureConfig {
    public static final LiveFeedDynamicFeatureConfig INSTANCE = new LiveFeedDynamicFeatureConfig();
    public static final Map<String, Map<String, List<String>>> DEFAULT = C2097608Jq.LJ();
    public static final C01GW value$delegate = C452501pT.LIZIZ(new C467090ITj());

    public final Map<String, Map<String, List<String>>> getValue() {
        return (Map) value$delegate.getValue();
    }
}
