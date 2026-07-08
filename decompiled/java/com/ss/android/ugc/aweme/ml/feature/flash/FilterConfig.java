package com.ss.android.ugc.aweme.ml.feature.flash;

import X.C2188811AlT;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class FilterConfig {
    public final Set<String> customFilter;
    public final Map<String, Set<String>> headerFilter;
    public final Set<Integer> indexFilter;
    public final Map<String, Set<String>> queryFilter;

    public FilterConfig() {
        this(null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FilterConfig)) {
            return false;
        }
        FilterConfig filterConfig = (FilterConfig) obj;
        return Intrinsics.LJFF(this.headerFilter, filterConfig.headerFilter) && Intrinsics.LJFF(this.queryFilter, filterConfig.queryFilter) && Intrinsics.LJFF(this.indexFilter, filterConfig.indexFilter) && Intrinsics.LJFF(this.customFilter, filterConfig.customFilter);
    }

    public int hashCode() {
        Map<String, Set<String>> map = this.headerFilter;
        int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
        Map<String, Set<String>> map2 = this.queryFilter;
        int iHashCode2 = (iHashCode + (map2 == null ? 0 : map2.hashCode())) * 31;
        Set<Integer> set = this.indexFilter;
        int iHashCode3 = (iHashCode2 + (set == null ? 0 : set.hashCode())) * 31;
        Set<String> set2 = this.customFilter;
        return iHashCode3 + (set2 != null ? set2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FilterConfig(headerFilter=");
        sbLIZ.append(this.headerFilter);
        sbLIZ.append(", queryFilter=");
        sbLIZ.append(this.queryFilter);
        sbLIZ.append(", indexFilter=");
        sbLIZ.append(this.indexFilter);
        sbLIZ.append(", customFilter=");
        sbLIZ.append(this.customFilter);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FilterConfig(Map<String, ? extends Set<String>> map, Map<String, ? extends Set<String>> map2, Set<Integer> set, Set<String> set2) {
        this.headerFilter = map;
        this.queryFilter = map2;
        this.indexFilter = set;
        this.customFilter = set2;
    }
}
