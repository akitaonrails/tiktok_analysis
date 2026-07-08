package com.ss.android.ugc.aweme.im.b2c.replies.api;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.im.b2c.replies.model.IMQuickReply;
import com.ss.android.ugc.aweme.im.b2c.replies.model.IMQuickReplyContent;
import com.ss.android.ugc.aweme.im.b2c.replies.model.IMQuickReplyText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class QuickReplySaveResponse extends BaseResponse {

    @C09CT("audit_status")
    public final int auditStatus;

    @C09CT("quick_reply")
    public final IMQuickReply quickReply;

    public QuickReplySaveResponse() {
        this(-1, new IMQuickReply("", 0, new IMQuickReplyContent(new IMQuickReplyText("")), false));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QuickReplySaveResponse)) {
            return false;
        }
        QuickReplySaveResponse quickReplySaveResponse = (QuickReplySaveResponse) obj;
        return this.auditStatus == quickReplySaveResponse.auditStatus && Intrinsics.LJFF(this.quickReply, quickReplySaveResponse.quickReply);
    }

    public final int hashCode() {
        return (this.auditStatus * 31) + this.quickReply.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("QuickReplySaveResponse(auditStatus=");
        sbLIZ.append(this.auditStatus);
        sbLIZ.append(", quickReply=");
        sbLIZ.append(this.quickReply);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public QuickReplySaveResponse(int i, IMQuickReply iMQuickReply) {
        this.auditStatus = i;
        this.quickReply = iMQuickReply;
    }
}
