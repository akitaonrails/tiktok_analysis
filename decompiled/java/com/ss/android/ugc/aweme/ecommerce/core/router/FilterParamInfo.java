package com.ss.android.ugc.aweme.ecommerce.core.router;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class FilterParamInfo implements Serializable {
    public static final int $stable = 8;

    @C09CT("filter_key")
    public final String filterKey;

    @C09CT("filter_param")
    public final List<String> filterParams;

    @C09CT("retain_param")
    public final List<String> retainParams;

    public FilterParamInfo() {
        this(null, null, null, 7, null);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FilterParamInfo(filterKey=");
        sbLIZ.append(this.filterKey);
        sbLIZ.append(", filterParams=");
        sbLIZ.append(this.filterParams);
        sbLIZ.append(", retainParams=");
        sbLIZ.append(this.retainParams);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public FilterParamInfo(String str, List<String> list, List<String> list2) {
        this.filterKey = str;
        this.filterParams = list;
        this.retainParams = list2;
    }

    public FilterParamInfo(String str, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? C13BV.INSTANCE : list, (i & 4) != 0 ? C13BV.INSTANCE : list2);
    }
}
