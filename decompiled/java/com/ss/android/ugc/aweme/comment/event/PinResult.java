package com.ss.android.ugc.aweme.comment.event;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class PinResult extends BaseResponse {

    @C09CT("notice")
    public final PinNotice notice;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PinResult) && Intrinsics.LJFF(this.notice, ((PinResult) obj).notice);
    }

    public final int hashCode() {
        PinNotice pinNotice = this.notice;
        if (pinNotice == null) {
            return 0;
        }
        return pinNotice.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PinResult(notice=");
        sbLIZ.append(this.notice);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PinResult(PinNotice pinNotice) {
        this.notice = pinNotice;
    }
}
