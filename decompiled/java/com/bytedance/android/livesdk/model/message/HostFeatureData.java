package com.bytedance.android.livesdk.model.message;

import X.C09CT;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class HostFeatureData {

    @C09CT("event_time_ms")
    public long eventTimeMs;

    @C09CT("features")
    public Map<String, String> features = new LinkedHashMap();
}
