package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SeaPaymentTenureInterestDetail;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class SeaPaymentTenureInterestDetail implements Parcelable {

    @C09CT("interest_free_tag")
    public final String interestFreeTag;

    @C09CT("tenure_interest")
    public final String tenureInterest;

    @C09CT("tenure_interest_actual")
    public final String tenureInterestActual;

    @C09CT("tenure_interest_hint")
    public final String tenureInterestHint;
    public static final Parcelable.Creator<SeaPaymentTenureInterestDetail> CREATOR = new Parcelable.Creator<SeaPaymentTenureInterestDetail>() { // from class: X.047t
        @Override // android.os.Parcelable.Creator
        public final SeaPaymentTenureInterestDetail createFromParcel(Parcel parcel) {
            return new SeaPaymentTenureInterestDetail(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SeaPaymentTenureInterestDetail[] newArray(int i) {
            return new SeaPaymentTenureInterestDetail[i];
        }
    };
    public static final int $stable = 8;

    public SeaPaymentTenureInterestDetail() {
        this(null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SeaPaymentTenureInterestDetail)) {
            return false;
        }
        SeaPaymentTenureInterestDetail seaPaymentTenureInterestDetail = (SeaPaymentTenureInterestDetail) obj;
        return Intrinsics.LJFF(this.tenureInterestHint, seaPaymentTenureInterestDetail.tenureInterestHint) && Intrinsics.LJFF(this.tenureInterest, seaPaymentTenureInterestDetail.tenureInterest) && Intrinsics.LJFF(this.tenureInterestActual, seaPaymentTenureInterestDetail.tenureInterestActual) && Intrinsics.LJFF(this.interestFreeTag, seaPaymentTenureInterestDetail.interestFreeTag);
    }

    public final int hashCode() {
        String str = this.tenureInterestHint;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.tenureInterest;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.tenureInterestActual;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.interestFreeTag;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeaPaymentTenureInterestDetail(tenureInterestHint=");
        sbLIZ.append(this.tenureInterestHint);
        sbLIZ.append(", tenureInterest=");
        sbLIZ.append(this.tenureInterest);
        sbLIZ.append(", tenureInterestActual=");
        sbLIZ.append(this.tenureInterestActual);
        sbLIZ.append(", interestFreeTag=");
        sbLIZ.append(this.interestFreeTag);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.tenureInterestHint);
        parcel.writeString(this.tenureInterest);
        parcel.writeString(this.tenureInterestActual);
        parcel.writeString(this.interestFreeTag);
    }

    public SeaPaymentTenureInterestDetail(String str, String str2, String str3, String str4) {
        this.tenureInterestHint = str;
        this.tenureInterest = str2;
        this.tenureInterestActual = str3;
        this.interestFreeTag = str4;
    }
}
