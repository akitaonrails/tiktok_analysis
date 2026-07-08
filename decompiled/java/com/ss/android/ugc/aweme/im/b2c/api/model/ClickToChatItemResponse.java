package com.ss.android.ugc.aweme.im.b2c.api.model;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ClickToChatItemResponse extends BaseResponse {

    @C09CT("filter_type")
    public final int filterType;

    @C09CT("message_audit_status")
    public final Integer messageAuditStatus;

    @C09CT("link_user_id")
    public final long userId;

    public ClickToChatItemResponse() {
        this(0L, 5, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClickToChatItemResponse)) {
            return false;
        }
        ClickToChatItemResponse clickToChatItemResponse = (ClickToChatItemResponse) obj;
        return this.userId == clickToChatItemResponse.userId && this.filterType == clickToChatItemResponse.filterType && Intrinsics.LJFF(this.messageAuditStatus, clickToChatItemResponse.messageAuditStatus);
    }

    public final int hashCode() {
        int iY2 = ((C786410Ut5.Y2(this.userId) * 31) + this.filterType) * 31;
        Integer num = this.messageAuditStatus;
        return iY2 + (num == null ? 0 : num.hashCode());
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ClickToChatItemResponse(userId=");
        sbLIZ.append(this.userId);
        sbLIZ.append(", filterType=");
        sbLIZ.append(this.filterType);
        sbLIZ.append(", messageAuditStatus=");
        sbLIZ.append(this.messageAuditStatus);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ClickToChatItemResponse(long j, int i, Integer num) {
        this.userId = j;
        this.filterType = i;
        this.messageAuditStatus = num;
    }
}
