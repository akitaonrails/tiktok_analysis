package com.ss.android.ugc.aweme.feed.experiment;

import X.C09CT;
import X.C2188811AlT;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class SurfaceViewPageWithMap {

    @C09CT("pages_with_map")
    public final Map<String, Integer> pagesWithMap;

    public SurfaceViewPageWithMap() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SurfaceViewPageWithMap) && Intrinsics.LJFF(this.pagesWithMap, ((SurfaceViewPageWithMap) obj).pagesWithMap);
    }

    public final int hashCode() {
        Map<String, Integer> map = this.pagesWithMap;
        if (map == null) {
            return 0;
        }
        return map.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SurfaceViewPageWithMap(pagesWithMap=");
        sbLIZ.append(this.pagesWithMap);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SurfaceViewPageWithMap(Map<String, Integer> map) {
        this.pagesWithMap = map;
    }
}
