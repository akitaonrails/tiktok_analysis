package com.ss.android.ugc.aweme.im.b2c.entitlementlist;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class B2CEntitlementListResponse extends BaseResponse {

    @C09CT("matched_entitlements")
    public final List<String> matchedEntitlements;

    public B2CEntitlementListResponse() {
        this(null, 1, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof B2CEntitlementListResponse) && Intrinsics.LJFF(this.matchedEntitlements, ((B2CEntitlementListResponse) obj).matchedEntitlements);
    }

    public final int hashCode() {
        return this.matchedEntitlements.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("B2CEntitlementListResponse(matchedEntitlements=");
        sbLIZ.append(this.matchedEntitlements);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public B2CEntitlementListResponse(List<String> list) {
        this.matchedEntitlements = list;
    }

    public B2CEntitlementListResponse(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list);
    }
}
