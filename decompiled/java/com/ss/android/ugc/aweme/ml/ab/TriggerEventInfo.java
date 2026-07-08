package com.ss.android.ugc.aweme.ml.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes24.dex */
public final class TriggerEventInfo {

    @C09CT("event_name")
    public final String eventName;

    @C09CT("param_name")
    public final String paramName;

    @C09CT("param_value")
    public final Object paramValue;

    public TriggerEventInfo() {
        this(null, null, null);
    }

    public TriggerEventInfo(String str, String str2, Object obj) {
        this.eventName = str;
        this.paramName = str2;
        this.paramValue = obj;
    }
}
