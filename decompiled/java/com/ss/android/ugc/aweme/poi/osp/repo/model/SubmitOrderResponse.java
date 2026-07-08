package com.ss.android.ugc.aweme.poi.osp.repo.model;

import X.C09CT;
import X.C1201190hMb;
import X.C1494600ozq;
import X.C2188811AlT;
import X.InterfaceC1201180hMa;
import com.ss.android.ugc.aweme.app.api.RequestLog;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class SubmitOrderResponse extends BaseResponse implements InterfaceC1201180hMa {

    @C09CT("exception_ux")
    public final LsExceptionUx exceptionUx;

    @C09CT("order_id")
    public final String orderId;

    @C09CT("pay_result_info")
    public final String payResultInfo;
    public C1494600ozq<?> requestInfo;

    public final SubmitOrderResponse copy(String str, String str2, LsExceptionUx lsExceptionUx) {
        return new SubmitOrderResponse(str, str2, lsExceptionUx);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubmitOrderResponse)) {
            return false;
        }
        SubmitOrderResponse submitOrderResponse = (SubmitOrderResponse) obj;
        return Intrinsics.LJFF(this.orderId, submitOrderResponse.orderId) && Intrinsics.LJFF(this.payResultInfo, submitOrderResponse.payResultInfo) && Intrinsics.LJFF(this.exceptionUx, submitOrderResponse.exceptionUx);
    }

    @Override // X.InterfaceC1201180hMa
    public /* bridge */ /* synthetic */ RequestLog getRequestLog() {
        return C1201190hMb.LIZ(this);
    }

    public int hashCode() {
        String str = this.orderId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.payResultInfo;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        LsExceptionUx lsExceptionUx = this.exceptionUx;
        return iHashCode2 + (lsExceptionUx != null ? lsExceptionUx.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SubmitOrderResponse(orderId=");
        sbLIZ.append(this.orderId);
        sbLIZ.append(", payResultInfo=");
        sbLIZ.append(this.payResultInfo);
        sbLIZ.append(", exceptionUx=");
        sbLIZ.append(this.exceptionUx);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final LsExceptionUx getExceptionUx() {
        return this.exceptionUx;
    }

    public final String getOrderId() {
        return this.orderId;
    }

    public final String getPayResultInfo() {
        return this.payResultInfo;
    }

    @Override // X.InterfaceC1201180hMa
    public C1494600ozq<?> getRequestInfo() {
        return this.requestInfo;
    }

    @Override // X.InterfaceC1201180hMa
    public void setRequestInfo(C1494600ozq<?> c1494600ozq) {
        this.requestInfo = c1494600ozq;
    }

    public SubmitOrderResponse(String str, String str2, LsExceptionUx lsExceptionUx) {
        this.orderId = str;
        this.payResultInfo = str2;
        this.exceptionUx = lsExceptionUx;
    }
}
