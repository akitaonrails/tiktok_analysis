package com.ss.android.ugc.localnotify.api;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class LocalNotifyInfoResponse extends BaseResponse {

    @C09CT("payload")
    public final String pushMsg;

    public LocalNotifyInfoResponse() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LocalNotifyInfoResponse) && Intrinsics.LJFF(this.pushMsg, ((LocalNotifyInfoResponse) obj).pushMsg);
    }

    public final int hashCode() {
        String str = this.pushMsg;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LocalNotifyInfoResponse(pushMsg=");
        sbLIZ.append(this.pushMsg);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public LocalNotifyInfoResponse(String str) {
        this.pushMsg = str;
    }
}
