package com.ss.android.ugc.aweme.mention.api;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* JADX INFO: loaded from: classes.dex */
public final class QuickMentionCheckResponse extends BaseResponse {

    @C09CT("is_pass_shark")
    public final boolean isPassShark;

    public QuickMentionCheckResponse() {
        this(false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof QuickMentionCheckResponse) && this.isPassShark == ((QuickMentionCheckResponse) obj).isPassShark;
    }

    public final int hashCode() {
        return C786410Ut5.Z2(this.isPassShark);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("QuickMentionCheckResponse(isPassShark=");
        sbLIZ.append(this.isPassShark);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public QuickMentionCheckResponse(boolean z) {
        this.isPassShark = z;
    }
}
