package com.ss.android.ugc.aweme.network.model;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class AuditBatchAckResponse extends com.ss.android.ugc.aweme.base.api.BaseResponse {

    @C09CT("succ_apply_ids")
    public final List<Long> successApplyIds;

    public AuditBatchAckResponse() {
        this(null, 1, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AuditBatchAckResponse) && Intrinsics.LJFF(this.successApplyIds, ((AuditBatchAckResponse) obj).successApplyIds);
    }

    public final int hashCode() {
        return this.successApplyIds.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AuditBatchAckResponse(successApplyIds=");
        sbLIZ.append(this.successApplyIds);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AuditBatchAckResponse(List<Long> list) {
        this.successApplyIds = list;
    }

    public AuditBatchAckResponse(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list);
    }
}
