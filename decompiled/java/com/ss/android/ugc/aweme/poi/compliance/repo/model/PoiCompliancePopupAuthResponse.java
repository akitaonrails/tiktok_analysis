package com.ss.android.ugc.aweme.poi.compliance.repo.model;

import X.C09CT;
import X.C1201190hMb;
import X.C1494600ozq;
import X.C2188811AlT;
import X.InterfaceC1201180hMa;
import com.ss.android.ugc.aweme.app.api.RequestLog;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class PoiCompliancePopupAuthResponse extends BaseResponse implements InterfaceC1201180hMa {
    public C1494600ozq<?> LL;

    @C09CT("auth_status")
    public final Integer authStatus;

    public PoiCompliancePopupAuthResponse() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PoiCompliancePopupAuthResponse) && Intrinsics.LJFF(this.authStatus, ((PoiCompliancePopupAuthResponse) obj).authStatus);
    }

    @Override // X.InterfaceC1201180hMa
    public final /* synthetic */ RequestLog getRequestLog() {
        return C1201190hMb.LIZ(this);
    }

    public final int hashCode() {
        Integer num = this.authStatus;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiCompliancePopupAuthResponse(authStatus=");
        sbLIZ.append(this.authStatus);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1201180hMa
    public final C1494600ozq<?> getRequestInfo() {
        return this.LL;
    }

    public PoiCompliancePopupAuthResponse(Integer num) {
        this.authStatus = num;
    }

    @Override // X.InterfaceC1201180hMa
    public final void setRequestInfo(C1494600ozq<?> c1494600ozq) {
        this.LL = c1494600ozq;
    }
}
