package com.ss.android.ugc.aweme.account.security;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class SafeInfoNoticeMsgResponse extends BaseResponse {

    @C09CT("data")
    public final SafeInfoNoticeMsg data;

    public SafeInfoNoticeMsgResponse() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SafeInfoNoticeMsgResponse) && Intrinsics.LJFF(this.data, ((SafeInfoNoticeMsgResponse) obj).data);
    }

    public final int hashCode() {
        SafeInfoNoticeMsg safeInfoNoticeMsg = this.data;
        if (safeInfoNoticeMsg == null) {
            return 0;
        }
        return safeInfoNoticeMsg.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SafeInfoNoticeMsgResponse(data=");
        sbLIZ.append(this.data);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SafeInfoNoticeMsgResponse(SafeInfoNoticeMsg safeInfoNoticeMsg) {
        this.data = safeInfoNoticeMsg;
    }
}
