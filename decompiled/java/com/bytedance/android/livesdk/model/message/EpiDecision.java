package com.bytedance.android.livesdk.model.message;

import X.C09CT;
import com.bytedance.android.livesdkapi.depend.model.live.EPIFeatureValue;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class EpiDecision {
    public transient EPIFeatureValue LIZ;

    @C09CT("data")
    public Map<String, String> data = new LinkedHashMap();

    @C09CT("data_v2")
    public Map<String, String> dataV2 = new LinkedHashMap();

    @C09CT("server_features")
    public Map<String, String> serverFeatures = new LinkedHashMap();

    @C09CT("ts")
    public long ts;
}
