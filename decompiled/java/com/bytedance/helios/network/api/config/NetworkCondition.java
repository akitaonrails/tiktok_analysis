package com.bytedance.helios.network.api.config;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class NetworkCondition {

    @C09CT("domain")
    public final List<ValueCondition> domainCondition;

    @C09CT("path")
    public final List<ValueCondition> pathCondition;

    @C09CT("url")
    public final List<ValueCondition> urlCondition;

    public NetworkCondition() {
        this(null, null, null, 7, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NetworkCondition)) {
            return false;
        }
        NetworkCondition networkCondition = (NetworkCondition) obj;
        return Intrinsics.LJFF(this.domainCondition, networkCondition.domainCondition) && Intrinsics.LJFF(this.pathCondition, networkCondition.pathCondition) && Intrinsics.LJFF(this.urlCondition, networkCondition.urlCondition);
    }

    public final int hashCode() {
        return (((this.domainCondition.hashCode() * 31) + this.pathCondition.hashCode()) * 31) + this.urlCondition.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NetworkCondition(domainCondition=");
        sbLIZ.append(this.domainCondition);
        sbLIZ.append(", pathCondition=");
        sbLIZ.append(this.pathCondition);
        sbLIZ.append(", urlCondition=");
        sbLIZ.append(this.urlCondition);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public NetworkCondition(List<ValueCondition> list, List<ValueCondition> list2, List<ValueCondition> list3) {
        this.domainCondition = list;
        this.pathCondition = list2;
        this.urlCondition = list3;
    }

    public NetworkCondition(List list, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? C13BV.INSTANCE : list2, (i & 4) != 0 ? C13BV.INSTANCE : list3);
    }
}
