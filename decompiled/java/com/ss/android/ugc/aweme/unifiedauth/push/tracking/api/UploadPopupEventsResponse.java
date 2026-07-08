package com.ss.android.ugc.aweme.unifiedauth.push.tracking.api;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class UploadPopupEventsResponse extends BaseResponse {

    @C09CT("code")
    public final int code;

    @C09CT("result")
    public final String result;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UploadPopupEventsResponse)) {
            return false;
        }
        UploadPopupEventsResponse uploadPopupEventsResponse = (UploadPopupEventsResponse) obj;
        return this.code == uploadPopupEventsResponse.code && Intrinsics.LJFF(this.result, uploadPopupEventsResponse.result);
    }

    public final int hashCode() {
        return (this.code * 31) + this.result.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UploadPopupEventsResponse(code=");
        sbLIZ.append(this.code);
        sbLIZ.append(", result=");
        sbLIZ.append(this.result);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public UploadPopupEventsResponse(int i, String str) {
        this.code = i;
        this.result = str;
    }
}
