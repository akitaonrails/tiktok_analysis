package com.bytedance.hybrid.spark.raven.data;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes19.dex */
public final class EventModel implements Serializable {

    @C09CT("rave_param")
    public final RavenParam ravenParam;

    @C09CT("service_type")
    public final String serviceType;

    public EventModel() {
        this(null, null);
    }

    public EventModel(String str, RavenParam ravenParam) {
        this.serviceType = str;
        this.ravenParam = ravenParam;
    }
}
