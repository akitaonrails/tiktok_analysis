package com.ss.android.ugc.aweme.network.model;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class GetUnreadAuditCountResponse extends com.ss.android.ugc.aweme.base.api.BaseResponse {

    @C09CT("conv_audit_unread")
    public final List<ConversationAuditUnreadInfo> unreadList;

    public GetUnreadAuditCountResponse() {
        this(null, 1, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetUnreadAuditCountResponse) && Intrinsics.LJFF(this.unreadList, ((GetUnreadAuditCountResponse) obj).unreadList);
    }

    public final int hashCode() {
        List<ConversationAuditUnreadInfo> list = this.unreadList;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GetUnreadAuditCountResponse(unreadList=");
        sbLIZ.append(this.unreadList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public GetUnreadAuditCountResponse(List<ConversationAuditUnreadInfo> list) {
        this.unreadList = list;
    }

    public GetUnreadAuditCountResponse(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list);
    }
}
