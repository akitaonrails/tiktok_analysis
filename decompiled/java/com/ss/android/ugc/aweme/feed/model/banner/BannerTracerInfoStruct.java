package com.ss.android.ugc.aweme.feed.model.banner;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class BannerTracerInfoStruct implements Serializable {

    @C09CT("tracer_info_value")
    public String tracerInfoValue;

    public BannerTracerInfoStruct() {
        this(null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BannerTracerInfoStruct) && Intrinsics.LJFF(this.tracerInfoValue, ((BannerTracerInfoStruct) obj).tracerInfoValue);
    }

    public int hashCode() {
        String str = this.tracerInfoValue;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BannerTracerInfoStruct(tracerInfoValue=");
        sbLIZ.append(this.tracerInfoValue);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public BannerTracerInfoStruct(String str) {
        this.tracerInfoValue = str;
    }
}
