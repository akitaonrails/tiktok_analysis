package com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.ClaimVoucherResponseData;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.Voucher;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ClaimVoucherResponseData implements Parcelable, Serializable {

    @C09CT("can_retry")
    public final Boolean canRetry;

    @C09CT("title_text")
    public final String titleText;

    @C09CT("voucher")
    public final Voucher voucher;
    public static final Parcelable.Creator<ClaimVoucherResponseData> CREATOR = new Parcelable.Creator<ClaimVoucherResponseData>() { // from class: X.04Gn
        @Override // android.os.Parcelable.Creator
        public final ClaimVoucherResponseData createFromParcel(Parcel parcel) {
            boolean z;
            Boolean boolValueOf;
            Voucher voucherCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            if (parcel.readInt() != 0) {
                voucherCreateFromParcel = Voucher.CREATOR.createFromParcel(parcel);
            }
            return new ClaimVoucherResponseData(boolValueOf, voucherCreateFromParcel, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ClaimVoucherResponseData[] newArray(int i) {
            return new ClaimVoucherResponseData[i];
        }
    };
    public static final int $stable = 8;

    public final ClaimVoucherResponseData copy(Boolean bool, Voucher voucher, String str) {
        return new ClaimVoucherResponseData(bool, voucher, str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClaimVoucherResponseData)) {
            return false;
        }
        ClaimVoucherResponseData claimVoucherResponseData = (ClaimVoucherResponseData) obj;
        return Intrinsics.LJFF(this.canRetry, claimVoucherResponseData.canRetry) && Intrinsics.LJFF(this.voucher, claimVoucherResponseData.voucher) && Intrinsics.LJFF(this.titleText, claimVoucherResponseData.titleText);
    }

    public int hashCode() {
        Boolean bool = this.canRetry;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Voucher voucher = this.voucher;
        int iHashCode2 = (iHashCode + (voucher == null ? 0 : voucher.hashCode())) * 31;
        String str = this.titleText;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ClaimVoucherResponseData(canRetry=");
        sbLIZ.append(this.canRetry);
        sbLIZ.append(", voucher=");
        sbLIZ.append(this.voucher);
        sbLIZ.append(", titleText=");
        sbLIZ.append(this.titleText);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Boolean bool = this.canRetry;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Voucher voucher = this.voucher;
        if (voucher == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            voucher.writeToParcel(parcel, i);
        }
        parcel.writeString(this.titleText);
    }

    public final Boolean getCanRetry() {
        return this.canRetry;
    }

    public final String getTitleText() {
        return this.titleText;
    }

    public final Voucher getVoucher() {
        return this.voucher;
    }

    public ClaimVoucherResponseData(Boolean bool, Voucher voucher, String str) {
        this.canRetry = bool;
        this.voucher = voucher;
        this.titleText = str;
    }
}
