package com.ss.android.ugc.aweme.ml.request.meta;

import X.C09CT;
import X.C2188811AlT;
import java.util.Map;

/* JADX INFO: loaded from: classes24.dex */
public final class ApplogConfig {

    @C09CT("event")
    public final String event;

    @C09CT("event_constraints")
    public final Map<String, String> event_constraints;

    @C09CT("event_params")
    public final Map<String, String> event_params;

    @C09CT("sample")
    public final Float sample;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ApplogConfig(event=");
        sbLIZ.append(this.event);
        sbLIZ.append(", event_constraints=");
        sbLIZ.append(this.event_constraints);
        sbLIZ.append(", event_params=");
        sbLIZ.append(this.event_params);
        sbLIZ.append(", sample=");
        sbLIZ.append(this.sample);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ApplogConfig(String str, Map<String, String> map, Map<String, String> map2, Float f) {
        this.event = str;
        this.event_constraints = map;
        this.event_params = map2;
        this.sample = f;
    }
}
