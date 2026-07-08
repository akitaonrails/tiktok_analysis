package com.bytedance.goda.v2.model.dto;

import X.C09CT;
import X.C2188811AlT;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class GodaV2Extension {

    @C09CT("pages")
    public final Map<String, Object> pages;

    @C09CT("service")
    public final Map<String, GodaV2Data> service;

    public GodaV2Extension() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GodaV2Extension)) {
            return false;
        }
        GodaV2Extension godaV2Extension = (GodaV2Extension) obj;
        return Intrinsics.LJFF(this.pages, godaV2Extension.pages) && Intrinsics.LJFF(this.service, godaV2Extension.service);
    }

    public final int hashCode() {
        Map<String, Object> map = this.pages;
        int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
        Map<String, GodaV2Data> map2 = this.service;
        return iHashCode + (map2 != null ? map2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GodaV2Extension(pages=");
        sbLIZ.append(this.pages);
        sbLIZ.append(", service=");
        sbLIZ.append(this.service);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public GodaV2Extension(Map<String, ? extends Object> map, Map<String, GodaV2Data> map2) {
        this.pages = map;
        this.service = map2;
    }
}
