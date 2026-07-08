package com.ss.android.ugc.aweme.tako.ccl.net;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoBaseResponse;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class BatchUpdateMessageResponse extends TakoBaseResponse {

    @C09CT("fail_msg_ids")
    public final List<String> failMsgIds;

    public BatchUpdateMessageResponse() {
        this(null, 1, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BatchUpdateMessageResponse) && Intrinsics.LJFF(this.failMsgIds, ((BatchUpdateMessageResponse) obj).failMsgIds);
    }

    public final int hashCode() {
        List<String> list = this.failMsgIds;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BatchUpdateMessageResponse(failMsgIds=");
        sbLIZ.append(this.failMsgIds);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public BatchUpdateMessageResponse(List<String> list) {
        super(null, 0, "");
        this.failMsgIds = list;
    }

    public BatchUpdateMessageResponse(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list);
    }
}
