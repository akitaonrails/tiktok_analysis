package com.ss.android.ugc.aweme.tako.ccl.net;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoBaseResponse;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class BatchDeleteResponse extends TakoBaseResponse {

    @C09CT("fail_sub_conv")
    public boolean failDeleteConversation;

    @C09CT("fail_msgids")
    public final List<String> failMsgIds;

    public BatchDeleteResponse() {
        this(null, false, 3, null);
    }

    public final BatchDeleteResponse copy(List<String> list, boolean z) {
        return new BatchDeleteResponse(list, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BatchDeleteResponse)) {
            return false;
        }
        BatchDeleteResponse batchDeleteResponse = (BatchDeleteResponse) obj;
        return Intrinsics.LJFF(this.failMsgIds, batchDeleteResponse.failMsgIds) && this.failDeleteConversation == batchDeleteResponse.failDeleteConversation;
    }

    public int hashCode() {
        List<String> list = this.failMsgIds;
        return ((list == null ? 0 : list.hashCode()) * 31) + C786410Ut5.Z2(this.failDeleteConversation);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BatchDeleteResponse(failMsgIds=");
        sbLIZ.append(this.failMsgIds);
        sbLIZ.append(", failDeleteConversation=");
        sbLIZ.append(this.failDeleteConversation);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean getFailDeleteConversation() {
        return this.failDeleteConversation;
    }

    public final List<String> getFailMsgIds() {
        return this.failMsgIds;
    }

    public final void setFailDeleteConversation(boolean z) {
        this.failDeleteConversation = z;
    }

    public BatchDeleteResponse(List<String> list, boolean z) {
        super(null, 0, "");
        this.failMsgIds = list;
        this.failDeleteConversation = z;
    }

    public BatchDeleteResponse(List list, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? false : z);
    }
}
