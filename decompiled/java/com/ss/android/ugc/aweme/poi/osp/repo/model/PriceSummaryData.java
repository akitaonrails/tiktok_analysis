package com.ss.android.ugc.aweme.poi.osp.repo.model;

import X.C09CT;
import X.C1201190hMb;
import X.C2188811AlT;
import X.EnumC1982707ph;
import com.ss.android.ugc.aweme.app.api.RequestLog;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PriceSummaryData extends BaseComponentData implements Serializable {

    @C09CT("order_summary_type")
    public final Integer orderSummaryType;

    public final PriceSummaryData copy(Integer num) {
        return new PriceSummaryData(num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PriceSummaryData) && Intrinsics.LJFF(this.orderSummaryType, ((PriceSummaryData) obj).orderSummaryType);
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseComponentData, X.InterfaceC1201180hMa
    public /* bridge */ /* synthetic */ RequestLog getRequestLog() {
        return C1201190hMb.LIZ(this);
    }

    public int hashCode() {
        Integer num = this.orderSummaryType;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PriceSummaryData(orderSummaryType=");
        sbLIZ.append(this.orderSummaryType);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean isUsOrderSummary() {
        Integer num = this.orderSummaryType;
        return num != null && num.intValue() == EnumC1982707ph.US.getType();
    }

    public final Integer getOrderSummaryType() {
        return this.orderSummaryType;
    }

    public PriceSummaryData(Integer num) {
        this.orderSummaryType = num;
    }
}
