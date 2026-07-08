package com.ss.android.ugc.aweme.minis.model.payment.coupon;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.minis.model.payment.coupon.TiktokMinisMonetizationCheckQcpxResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class TiktokMinisMonetizationCheckQcpxResponse extends BaseResponse implements Parcelable {

    @C09CT("coupon_quote_token")
    public final String couponQuoteToken;

    @C09CT("discount_rate")
    public final String discountRate;

    @C09CT("is_valid")
    public final boolean isValid;
    public static final Parcelable.Creator<TiktokMinisMonetizationCheckQcpxResponse> CREATOR = new Parcelable.Creator<TiktokMinisMonetizationCheckQcpxResponse>() { // from class: X.0mKY
        @Override // android.os.Parcelable.Creator
        public final TiktokMinisMonetizationCheckQcpxResponse createFromParcel(Parcel parcel) {
            boolean z;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new TiktokMinisMonetizationCheckQcpxResponse(z, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TiktokMinisMonetizationCheckQcpxResponse[] newArray(int i) {
            return new TiktokMinisMonetizationCheckQcpxResponse[i];
        }
    };
    public static final int $stable = 8;

    public TiktokMinisMonetizationCheckQcpxResponse() {
        this(false, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TiktokMinisMonetizationCheckQcpxResponse)) {
            return false;
        }
        TiktokMinisMonetizationCheckQcpxResponse tiktokMinisMonetizationCheckQcpxResponse = (TiktokMinisMonetizationCheckQcpxResponse) obj;
        return this.isValid == tiktokMinisMonetizationCheckQcpxResponse.isValid && Intrinsics.LJFF(this.discountRate, tiktokMinisMonetizationCheckQcpxResponse.discountRate) && Intrinsics.LJFF(this.couponQuoteToken, tiktokMinisMonetizationCheckQcpxResponse.couponQuoteToken);
    }

    public final int hashCode() {
        int iZ2 = C786410Ut5.Z2(this.isValid) * 31;
        String str = this.discountRate;
        int iHashCode = (iZ2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.couponQuoteToken;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TiktokMinisMonetizationCheckQcpxResponse(isValid=");
        sbLIZ.append(this.isValid);
        sbLIZ.append(", discountRate=");
        sbLIZ.append(this.discountRate);
        sbLIZ.append(", couponQuoteToken=");
        sbLIZ.append(this.couponQuoteToken);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.isValid ? 1 : 0);
        parcel.writeString(this.discountRate);
        parcel.writeString(this.couponQuoteToken);
    }

    public TiktokMinisMonetizationCheckQcpxResponse(boolean z, String str, String str2) {
        this.isValid = z;
        this.discountRate = str;
        this.couponQuoteToken = str2;
    }
}
