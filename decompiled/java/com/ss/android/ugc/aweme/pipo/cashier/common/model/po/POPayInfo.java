package com.ss.android.ugc.aweme.pipo.cashier.common.model.po;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.CommuteType;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class POPayInfo {

    @C09CT("actual_payment_amount")
    public final PriceAmount actualPaymentAmount;

    @C09CT("supported_commute_types")
    public final List<CommuteType> supportedCommuteTypes;

    public POPayInfo() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof POPayInfo)) {
            return false;
        }
        POPayInfo pOPayInfo = (POPayInfo) obj;
        return Intrinsics.LJFF(this.supportedCommuteTypes, pOPayInfo.supportedCommuteTypes) && Intrinsics.LJFF(this.actualPaymentAmount, pOPayInfo.actualPaymentAmount);
    }

    public final int hashCode() {
        List<CommuteType> list = this.supportedCommuteTypes;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        PriceAmount priceAmount = this.actualPaymentAmount;
        return iHashCode + (priceAmount != null ? priceAmount.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("POPayInfo(supportedCommuteTypes=");
        sbLIZ.append(this.supportedCommuteTypes);
        sbLIZ.append(", actualPaymentAmount=");
        sbLIZ.append(this.actualPaymentAmount);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public POPayInfo(List<? extends CommuteType> list, PriceAmount priceAmount) {
        this.supportedCommuteTypes = list;
        this.actualPaymentAmount = priceAmount;
    }
}
