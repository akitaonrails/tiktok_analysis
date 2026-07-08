package com.ss.android.ugc.aweme.recording.js;

import X.C09CT;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class IABRecordingJsUrlFeatureResponse implements Serializable {
    public static final int $stable = 8;

    @C09CT("features")
    public final Map<String, Map<String, Object>> features;

    public IABRecordingJsUrlFeatureResponse() {
        this(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public IABRecordingJsUrlFeatureResponse(Map<String, ? extends Map<String, Object>> map) {
        this.features = map;
    }
}
