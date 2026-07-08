package com.ss.android.ugc.aweme.poi.osp.repo.model;

import X.C09CT;
import X.C1201190hMb;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.app.api.RequestLog;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PaymentInfoData extends BaseComponentData implements Serializable {

    @C09CT("cashier_info")
    public final String cashierInfo;

    public PaymentInfoData() {
        this(null);
    }

    public final PaymentInfoData copy(String str) {
        return new PaymentInfoData(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PaymentInfoData) && Intrinsics.LJFF(this.cashierInfo, ((PaymentInfoData) obj).cashierInfo);
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseComponentData, X.InterfaceC1201180hMa
    public /* bridge */ /* synthetic */ RequestLog getRequestLog() {
        return C1201190hMb.LIZ(this);
    }

    public int hashCode() {
        String str = this.cashierInfo;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PaymentInfoData(cashierInfo=");
        sbLIZ.append(this.cashierInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getCashierInfo() {
        return this.cashierInfo;
    }

    public PaymentInfoData(String str) {
        this.cashierInfo = str;
    }
}
