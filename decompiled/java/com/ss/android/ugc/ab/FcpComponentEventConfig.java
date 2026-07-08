package com.ss.android.ugc.ab;

import X.C09CT;
import X.C2188811AlT;
import X.C707630RpJ;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class FcpComponentEventConfig implements Serializable {
    public static final C707630RpJ Companion = new Object() { // from class: X.0RpJ
    };

    @C09CT("fcp_component_event_name")
    public final String eventName;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FcpComponentEventConfig) && Intrinsics.LJFF(this.eventName, ((FcpComponentEventConfig) obj).eventName);
    }

    public int hashCode() {
        return this.eventName.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FcpComponentEventConfig(eventName=");
        sbLIZ.append(this.eventName);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public FcpComponentEventConfig() {
        this("record_component_funnel_v2");
    }

    public FcpComponentEventConfig(String str) {
        this.eventName = str;
    }
}
