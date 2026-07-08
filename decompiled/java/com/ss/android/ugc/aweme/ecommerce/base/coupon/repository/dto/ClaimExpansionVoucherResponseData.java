package com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.ClaimExpansionVoucherResponseData;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.Voucher;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ClaimExpansionVoucherResponseData implements Parcelable, Serializable {

    @C09CT("can_retry")
    public final Boolean canRetry;

    @C09CT("is_success_upgrade")
    public final Boolean isSuccessUpgrade;

    @C09CT("voucher")
    public final Voucher voucher;
    public static final Parcelable.Creator<ClaimExpansionVoucherResponseData> CREATOR = new Parcelable.Creator<ClaimExpansionVoucherResponseData>() { // from class: X.04Go
        @Override // android.os.Parcelable.Creator
        public final ClaimExpansionVoucherResponseData createFromParcel(Parcel parcel) {
            boolean z;
            Boolean boolValueOf;
            Voucher voucherCreateFromParcel;
            boolean z2 = true;
            Boolean boolValueOf2 = null;
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
            if (parcel.readInt() == 0) {
                voucherCreateFromParcel = null;
            } else {
                voucherCreateFromParcel = Voucher.CREATOR.createFromParcel(parcel);
            }
            Voucher voucher = voucherCreateFromParcel;
            if (parcel.readInt() != 0) {
                if (parcel.readInt() == 0) {
                    z2 = false;
                }
                boolValueOf2 = Boolean.valueOf(z2);
            }
            return new ClaimExpansionVoucherResponseData(boolValueOf, voucher, boolValueOf2);
        }

        @Override // android.os.Parcelable.Creator
        public final ClaimExpansionVoucherResponseData[] newArray(int i) {
            return new ClaimExpansionVoucherResponseData[i];
        }
    };
    public static final int $stable = 8;

    public final ClaimExpansionVoucherResponseData copy(Boolean bool, Voucher voucher, Boolean bool2) {
        return new ClaimExpansionVoucherResponseData(bool, voucher, bool2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClaimExpansionVoucherResponseData)) {
            return false;
        }
        ClaimExpansionVoucherResponseData claimExpansionVoucherResponseData = (ClaimExpansionVoucherResponseData) obj;
        return Intrinsics.LJFF(this.canRetry, claimExpansionVoucherResponseData.canRetry) && Intrinsics.LJFF(this.voucher, claimExpansionVoucherResponseData.voucher) && Intrinsics.LJFF(this.isSuccessUpgrade, claimExpansionVoucherResponseData.isSuccessUpgrade);
    }

    public int hashCode() {
        Boolean bool = this.canRetry;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Voucher voucher = this.voucher;
        int iHashCode2 = (iHashCode + (voucher == null ? 0 : voucher.hashCode())) * 31;
        Boolean bool2 = this.isSuccessUpgrade;
        return iHashCode2 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ClaimExpansionVoucherResponseData(canRetry=");
        sbLIZ.append(this.canRetry);
        sbLIZ.append(", voucher=");
        sbLIZ.append(this.voucher);
        sbLIZ.append(", isSuccessUpgrade=");
        sbLIZ.append(this.isSuccessUpgrade);
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
        Boolean bool2 = this.isSuccessUpgrade;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
    }

    public final Boolean getCanRetry() {
        return this.canRetry;
    }

    public final Voucher getVoucher() {
        return this.voucher;
    }

    public final Boolean isSuccessUpgrade() {
        return this.isSuccessUpgrade;
    }

    public ClaimExpansionVoucherResponseData(Boolean bool, Voucher voucher, Boolean bool2) {
        this.canRetry = bool;
        this.voucher = voucher;
        this.isSuccessUpgrade = bool2;
    }
}
