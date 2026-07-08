package com.ss.android.ugc.aweme.friendstab.mute;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* JADX INFO: loaded from: classes.dex */
public final class MutePostsResponse extends BaseResponse {

    @C09CT("result")
    public final int result;

    public MutePostsResponse() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MutePostsResponse) && this.result == ((MutePostsResponse) obj).result;
    }

    public final int hashCode() {
        return this.result;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MutePostsResponse(result=");
        sbLIZ.append(this.result);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public MutePostsResponse(int i) {
        this.result = i;
    }
}
