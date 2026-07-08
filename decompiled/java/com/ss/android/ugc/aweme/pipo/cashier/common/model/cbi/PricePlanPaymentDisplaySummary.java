package com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.PricePlanPaymentDisplaySummary;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class PricePlanPaymentDisplaySummary implements Parcelable {
    public static final Parcelable.Creator<PricePlanPaymentDisplaySummary> CREATOR = new Parcelable.Creator<PricePlanPaymentDisplaySummary>() { // from class: X.0ulX
        @Override // android.os.Parcelable.Creator
        public final PricePlanPaymentDisplaySummary createFromParcel(Parcel parcel) {
            return new PricePlanPaymentDisplaySummary(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PricePlanPaymentDisplaySummary[] newArray(int i) {
            return new PricePlanPaymentDisplaySummary[i];
        }
    };

    @C09CT("discount_payment_price_desc")
    public final String discountPaymentPriceDesc;

    @C09CT("total_payment_price_desc")
    public final String totalPaymentPriceDesc;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PricePlanPaymentDisplaySummary)) {
            return false;
        }
        PricePlanPaymentDisplaySummary pricePlanPaymentDisplaySummary = (PricePlanPaymentDisplaySummary) obj;
        return Intrinsics.LJFF(this.totalPaymentPriceDesc, pricePlanPaymentDisplaySummary.totalPaymentPriceDesc) && Intrinsics.LJFF(this.discountPaymentPriceDesc, pricePlanPaymentDisplaySummary.discountPaymentPriceDesc);
    }

    public final int hashCode() {
        String str = this.totalPaymentPriceDesc;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.discountPaymentPriceDesc;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PricePlanPaymentDisplaySummary(totalPaymentPriceDesc=");
        sbLIZ.append(this.totalPaymentPriceDesc);
        sbLIZ.append(", discountPaymentPriceDesc=");
        sbLIZ.append(this.discountPaymentPriceDesc);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.totalPaymentPriceDesc);
        parcel.writeString(this.discountPaymentPriceDesc);
    }

    public PricePlanPaymentDisplaySummary(String str, String str2) {
        this.totalPaymentPriceDesc = str;
        this.discountPaymentPriceDesc = str2;
    }
}
