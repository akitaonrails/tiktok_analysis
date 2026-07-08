package com.bytedance.android.livesdk.signaling.model.downlink;

import X.C09CT;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class EPIFeatureData {

    @C09CT("FloatFeature")
    public Map<String, Float> floatFeature;

    @C09CT("IntFeature")
    public Map<String, Long> intFeature;

    @C09CT("StringFeature")
    public Map<String, String> stringFeature;

    public EPIFeatureData() {
        this(new LinkedHashMap(), new LinkedHashMap(), new LinkedHashMap());
    }

    public EPIFeatureData(Map<String, Long> map, Map<String, Float> map2, Map<String, String> map3) {
        this.intFeature = map;
        this.floatFeature = map2;
        this.stringFeature = map3;
    }
}
