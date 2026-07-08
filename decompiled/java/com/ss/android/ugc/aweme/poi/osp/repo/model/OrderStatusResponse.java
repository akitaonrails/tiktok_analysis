package com.ss.android.ugc.aweme.poi.osp.repo.model;

import X.C09CT;
import X.C1201190hMb;
import X.C1494600ozq;
import X.C2188811AlT;
import X.InterfaceC1201180hMa;
import com.ss.android.ugc.aweme.app.api.RequestLog;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class OrderStatusResponse extends BaseResponse implements InterfaceC1201180hMa {

    @C09CT("order_id")
    public final String orderId;
    public C1494600ozq<?> requestInfo;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final Integer status;

    public final OrderStatusResponse copy(String str, Integer num) {
        return new OrderStatusResponse(str, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderStatusResponse)) {
            return false;
        }
        OrderStatusResponse orderStatusResponse = (OrderStatusResponse) obj;
        return Intrinsics.LJFF(this.orderId, orderStatusResponse.orderId) && Intrinsics.LJFF(this.status, orderStatusResponse.status);
    }

    @Override // X.InterfaceC1201180hMa
    public /* bridge */ /* synthetic */ RequestLog getRequestLog() {
        return C1201190hMb.LIZ(this);
    }

    public int hashCode() {
        String str = this.orderId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.status;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OrderStatusResponse(orderId=");
        sbLIZ.append(this.orderId);
        sbLIZ.append(", status=");
        sbLIZ.append(this.status);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getOrderId() {
        return this.orderId;
    }

    @Override // X.InterfaceC1201180hMa
    public C1494600ozq<?> getRequestInfo() {
        return this.requestInfo;
    }

    public final Integer getStatus() {
        return this.status;
    }

    @Override // X.InterfaceC1201180hMa
    public void setRequestInfo(C1494600ozq<?> c1494600ozq) {
        this.requestInfo = c1494600ozq;
    }

    public OrderStatusResponse(String str, Integer num) {
        this.orderId = str;
        this.status = num;
    }
}
