package com.ss.android.ugc.aweme.poi_api.model;

import X.C09CT;
import X.C1201190hMb;
import X.C1494600ozq;
import X.C2188811AlT;
import X.InterfaceC1201180hMa;
import com.ss.android.ugc.aweme.app.api.RequestLog;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class AutoFillCertificateResp extends BaseResponse implements InterfaceC1201180hMa {

    @C09CT("client_certificate")
    public final String clientCertificate;
    public C1494600ozq<?> requestInfo;

    public final AutoFillCertificateResp copy(String str) {
        return new AutoFillCertificateResp(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AutoFillCertificateResp) && Intrinsics.LJFF(this.clientCertificate, ((AutoFillCertificateResp) obj).clientCertificate);
    }

    @Override // X.InterfaceC1201180hMa
    public /* bridge */ /* synthetic */ RequestLog getRequestLog() {
        return C1201190hMb.LIZ(this);
    }

    public int hashCode() {
        String str = this.clientCertificate;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AutoFillCertificateResp(clientCertificate=");
        sbLIZ.append(this.clientCertificate);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getClientCertificate() {
        return this.clientCertificate;
    }

    @Override // X.InterfaceC1201180hMa
    public C1494600ozq<?> getRequestInfo() {
        return this.requestInfo;
    }

    public AutoFillCertificateResp(String str) {
        this.clientCertificate = str;
    }

    @Override // X.InterfaceC1201180hMa
    public void setRequestInfo(C1494600ozq<?> c1494600ozq) {
        this.requestInfo = c1494600ozq;
    }
}
