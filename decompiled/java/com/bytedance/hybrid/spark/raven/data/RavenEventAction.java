package com.bytedance.hybrid.spark.raven.data;

import X.C09CT;
import X.C1163720gOA;
import java.io.Serializable;

/* JADX INFO: loaded from: classes19.dex */
public final class RavenEventAction implements Serializable {
    public static final C1163720gOA Companion = new Object() { // from class: X.0gOA
    };

    @C09CT("raven_param")
    public final RavenParam ravenParam;

    @C09CT("service_type")
    public final String serviceType;

    @C09CT("type")
    public final String type;

    public RavenEventAction() {
        this(null, null, null);
    }

    public RavenEventAction(String str, RavenParam ravenParam, String str2) {
        this.serviceType = str;
        this.ravenParam = ravenParam;
        this.type = str2;
    }
}
