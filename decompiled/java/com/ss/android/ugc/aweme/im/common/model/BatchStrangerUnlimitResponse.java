package com.ss.android.ugc.aweme.im.common.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class BatchStrangerUnlimitResponse extends BaseResponse {

    @C09CT("failed_conversation_ids")
    public final List<String> failedConversationIds;

    public BatchStrangerUnlimitResponse() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BatchStrangerUnlimitResponse) && Intrinsics.LJFF(this.failedConversationIds, ((BatchStrangerUnlimitResponse) obj).failedConversationIds);
    }

    public final int hashCode() {
        List<String> list = this.failedConversationIds;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BatchStrangerUnlimitResponse(failedConversationIds=");
        sbLIZ.append(this.failedConversationIds);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public BatchStrangerUnlimitResponse(List<String> list) {
        this.failedConversationIds = list;
    }
}
