package com.ss.android.ugc.aweme.ecommerce.base.common.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.PaymentPromotion;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class PaymentPromotion implements Parcelable {

    @C09CT("amount")
    public String amount;

    @C09CT("currency")
    public String currency;

    @C09CT("promotion_id")
    public String promotionId;

    @C09CT("reduction_type")
    public Integer reductionType;

    @C09CT("sponsor")
    public Integer sponsor;
    public static final Parcelable.Creator<PaymentPromotion> CREATOR = new Parcelable.Creator<PaymentPromotion>() { // from class: X.02Qs
        @Override // android.os.Parcelable.Creator
        public final PaymentPromotion createFromParcel(Parcel parcel) {
            Integer numValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            Integer numValueOf2 = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() != 0) {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            return new PaymentPromotion(string, string2, string3, numValueOf, numValueOf2);
        }

        @Override // android.os.Parcelable.Creator
        public final PaymentPromotion[] newArray(int i) {
            return new PaymentPromotion[i];
        }
    };
    public static final int $stable = 8;

    public PaymentPromotion() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentPromotion)) {
            return false;
        }
        PaymentPromotion paymentPromotion = (PaymentPromotion) obj;
        return Intrinsics.LJFF(this.promotionId, paymentPromotion.promotionId) && Intrinsics.LJFF(this.currency, paymentPromotion.currency) && Intrinsics.LJFF(this.amount, paymentPromotion.amount) && Intrinsics.LJFF(this.reductionType, paymentPromotion.reductionType) && Intrinsics.LJFF(this.sponsor, paymentPromotion.sponsor);
    }

    public final int hashCode() {
        String str = this.promotionId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.currency;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.amount;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.reductionType;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.sponsor;
        return iHashCode4 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PaymentPromotion(promotionId=");
        sbLIZ.append(this.promotionId);
        sbLIZ.append(", currency=");
        sbLIZ.append(this.currency);
        sbLIZ.append(", amount=");
        sbLIZ.append(this.amount);
        sbLIZ.append(", reductionType=");
        sbLIZ.append(this.reductionType);
        sbLIZ.append(", sponsor=");
        sbLIZ.append(this.sponsor);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.promotionId);
        parcel.writeString(this.currency);
        parcel.writeString(this.amount);
        Integer num = this.reductionType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.sponsor;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
    }

    public PaymentPromotion(String str, String str2, String str3, Integer num, Integer num2) {
        this.promotionId = str;
        this.currency = str2;
        this.amount = str3;
        this.reductionType = num;
        this.sponsor = num2;
    }
}
