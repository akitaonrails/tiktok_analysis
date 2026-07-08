package com.ss.android.ugc.awemepushlib.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class M2SignalUploadResp extends BaseResponse {

    @C09CT("data")
    public final PopupInfoData data;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof M2SignalUploadResp) && Intrinsics.LJFF(this.data, ((M2SignalUploadResp) obj).data);
    }

    public final int hashCode() {
        PopupInfoData popupInfoData = this.data;
        if (popupInfoData == null) {
            return 0;
        }
        return popupInfoData.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("M2SignalUploadResp(data=");
        sbLIZ.append(this.data);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public M2SignalUploadResp(PopupInfoData popupInfoData) {
        this.data = popupInfoData;
    }
}
