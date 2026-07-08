package com.ss.android.ugc.aweme.ml.infra;

import X.C09CT;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public final class CollectingTimingConfig {
    public JSONObject LIZ;

    @C09CT("constraints")
    public final String constraints;

    @C09CT("event_name")
    public final String eventName;

    @C09CT("sample_rate")
    public final float sampleRate;

    public CollectingTimingConfig() {
        this(null, null, 1.0f, null);
    }

    public CollectingTimingConfig(String str, String str2, float f, JSONObject jSONObject) {
        this.eventName = str;
        this.constraints = str2;
        this.sampleRate = f;
        this.LIZ = jSONObject;
    }
}
