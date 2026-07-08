package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Amount;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.HybridPaymentInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class HybridPaymentInfo implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<HybridPaymentInfo> CREATOR = new Parcelable.Creator<HybridPaymentInfo>() { // from class: X.02pf
        @Override // android.os.Parcelable.Creator
        public final HybridPaymentInfo createFromParcel(Parcel parcel) {
            Amount amountCreateFromParcel;
            Amount amountCreateFromParcel2 = null;
            if (parcel.readInt() == 0) {
                amountCreateFromParcel = null;
            } else {
                amountCreateFromParcel = Amount.CREATOR.createFromParcel(parcel);
            }
            Amount amount = amountCreateFromParcel;
            if (parcel.readInt() != 0) {
                amountCreateFromParcel2 = Amount.CREATOR.createFromParcel(parcel);
            }
            return new HybridPaymentInfo(amount, amountCreateFromParcel2);
        }

        @Override // android.os.Parcelable.Creator
        public final HybridPaymentInfo[] newArray(int i) {
            return new HybridPaymentInfo[i];
        }
    };

    @C09CT("actual_payment_amount")
    public Amount actualPaymentAmount;

    @C09CT("original_payment_amount")
    public Amount originalPaymentAmount;

    public HybridPaymentInfo() {
        this(null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HybridPaymentInfo)) {
            return false;
        }
        HybridPaymentInfo hybridPaymentInfo = (HybridPaymentInfo) obj;
        return Intrinsics.LJFF(this.actualPaymentAmount, hybridPaymentInfo.actualPaymentAmount) && Intrinsics.LJFF(this.originalPaymentAmount, hybridPaymentInfo.originalPaymentAmount);
    }

    public final int hashCode() {
        Amount amount = this.actualPaymentAmount;
        int iHashCode = (amount == null ? 0 : amount.hashCode()) * 31;
        Amount amount2 = this.originalPaymentAmount;
        return iHashCode + (amount2 != null ? amount2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HybridPaymentInfo(actualPaymentAmount=");
        sbLIZ.append(this.actualPaymentAmount);
        sbLIZ.append(", originalPaymentAmount=");
        sbLIZ.append(this.originalPaymentAmount);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Amount amount = this.actualPaymentAmount;
        if (amount == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            amount.writeToParcel(parcel, i);
        }
        Amount amount2 = this.originalPaymentAmount;
        if (amount2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            amount2.writeToParcel(parcel, i);
        }
    }

    public HybridPaymentInfo(Amount amount, Amount amount2) {
        this.actualPaymentAmount = amount;
        this.originalPaymentAmount = amount2;
    }
}
