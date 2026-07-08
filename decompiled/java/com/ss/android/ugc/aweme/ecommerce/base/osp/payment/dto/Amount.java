package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Amount;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class Amount implements Parcelable, Serializable {

    @C09CT("amount")
    public String amount;

    @C09CT("currency")
    public String currency;

    @C09CT("price_str")
    public String priceStr;
    public static final Parcelable.Creator<Amount> CREATOR = new Parcelable.Creator<Amount>() { // from class: X.02lP
        @Override // android.os.Parcelable.Creator
        public final Amount createFromParcel(Parcel parcel) {
            return new Amount(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Amount[] newArray(int i) {
            return new Amount[i];
        }
    };
    public static final int $stable = 8;

    public Amount() {
        this(null, null, null);
    }

    public final Amount copy(String str, String str2, String str3) {
        return new Amount(str, str2, str3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Amount)) {
            return false;
        }
        Amount amount = (Amount) obj;
        return Intrinsics.LJFF(this.currency, amount.currency) && Intrinsics.LJFF(this.amount, amount.amount) && Intrinsics.LJFF(this.priceStr, amount.priceStr);
    }

    public int hashCode() {
        String str = this.currency;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.amount;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.priceStr;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Amount(currency=");
        sbLIZ.append(this.currency);
        sbLIZ.append(", amount=");
        sbLIZ.append(this.amount);
        sbLIZ.append(", priceStr=");
        sbLIZ.append(this.priceStr);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.currency);
        parcel.writeString(this.amount);
        parcel.writeString(this.priceStr);
    }

    public final String getAmount() {
        return this.amount;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getPriceStr() {
        return this.priceStr;
    }

    public Amount(String str, String str2, String str3) {
        this.currency = str;
        this.amount = str2;
        this.priceStr = str3;
    }
}
