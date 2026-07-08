package com.ss.android.ugc.aweme.aigc.graph.nodes.slot;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class AIGCInputItem {

    @C09CT("extra")
    public final String extra;

    @C09CT("is_remote_resource")
    public final boolean isRemoteResource;

    @C09CT("type")
    public final Integer type;

    @C09CT("value")
    public final String value;

    public AIGCInputItem() {
        this("", 2, false, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIGCInputItem)) {
            return false;
        }
        AIGCInputItem aIGCInputItem = (AIGCInputItem) obj;
        return Intrinsics.LJFF(this.value, aIGCInputItem.value) && Intrinsics.LJFF(this.type, aIGCInputItem.type) && this.isRemoteResource == aIGCInputItem.isRemoteResource && Intrinsics.LJFF(this.extra, aIGCInputItem.extra);
    }

    public final int hashCode() {
        int iHashCode = this.value.hashCode() * 31;
        Integer num = this.type;
        int iHashCode2 = (((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + C786410Ut5.Z2(this.isRemoteResource)) * 31;
        String str = this.extra;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIGCInputItem(value=");
        sbLIZ.append(this.value);
        sbLIZ.append(", type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", isRemoteResource=");
        sbLIZ.append(this.isRemoteResource);
        sbLIZ.append(", extra=");
        sbLIZ.append(this.extra);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AIGCInputItem(String str, Integer num, boolean z, String str2) {
        this.value = str;
        this.type = num;
        this.isRemoteResource = z;
        this.extra = str2;
    }
}
