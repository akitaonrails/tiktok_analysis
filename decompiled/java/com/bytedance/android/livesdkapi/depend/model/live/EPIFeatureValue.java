package com.bytedance.android.livesdkapi.depend.model.live;

import X.C09CT;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class EPIFeatureValue {

    @C09CT("int_feature")
    public Map<String, Long> intFeature = new LinkedHashMap();

    @C09CT("float_feature")
    public Map<String, Float> floatFeature = new LinkedHashMap();

    @C09CT("string_feature")
    public Map<String, String> stringFeature = new LinkedHashMap();
}
