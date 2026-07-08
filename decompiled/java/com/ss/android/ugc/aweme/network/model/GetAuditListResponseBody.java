package com.ss.android.ugc.aweme.network.model;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import X.C786410Ut5;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class GetAuditListResponseBody extends com.ss.android.ugc.aweme.base.api.BaseResponse {

    @C09CT("audit_list")
    public final List<ConversationAudit> audits;

    @C09CT("has_more")
    public final boolean hasMore;

    @C09CT("next_cursor")
    public final long nextCursor;

    @C09CT("total_count")
    public final int totalCount;

    public GetAuditListResponseBody() {
        this(null, false, 0L, 0, 15, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetAuditListResponseBody)) {
            return false;
        }
        GetAuditListResponseBody getAuditListResponseBody = (GetAuditListResponseBody) obj;
        return Intrinsics.LJFF(this.audits, getAuditListResponseBody.audits) && this.hasMore == getAuditListResponseBody.hasMore && this.nextCursor == getAuditListResponseBody.nextCursor && this.totalCount == getAuditListResponseBody.totalCount;
    }

    public final int hashCode() {
        return (((((this.audits.hashCode() * 31) + C786410Ut5.Z2(this.hasMore)) * 31) + C786410Ut5.Y2(this.nextCursor)) * 31) + this.totalCount;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GetAuditListResponseBody(audits=");
        sbLIZ.append(this.audits);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.hasMore);
        sbLIZ.append(", nextCursor=");
        sbLIZ.append(this.nextCursor);
        sbLIZ.append(", totalCount=");
        sbLIZ.append(this.totalCount);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public GetAuditListResponseBody(List<ConversationAudit> list, boolean z, long j, int i) {
        this.audits = list;
        this.hasMore = z;
        this.nextCursor = j;
        this.totalCount = i;
    }

    public GetAuditListResponseBody(List list, boolean z, long j, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? C13BV.INSTANCE : list, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? 0L : j, (i2 & 8) == 0 ? i : 0);
    }
}
