package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.VoucherTextAfterClaim;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class VoucherTextAfterClaim implements Parcelable {

    @C09CT("promotion_text")
    public final String promotionText;

    @C09CT("sub_promotion_text")
    public final String subPromotionText;
    public static final Parcelable.Creator<VoucherTextAfterClaim> CREATOR = new Parcelable.Creator<VoucherTextAfterClaim>() { // from class: X.02sj
        @Override // android.os.Parcelable.Creator
        public final VoucherTextAfterClaim createFromParcel(Parcel parcel) {
            return new VoucherTextAfterClaim(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VoucherTextAfterClaim[] newArray(int i) {
            return new VoucherTextAfterClaim[i];
        }
    };
    public static final int $stable = 8;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VoucherTextAfterClaim)) {
            return false;
        }
        VoucherTextAfterClaim voucherTextAfterClaim = (VoucherTextAfterClaim) obj;
        return Intrinsics.LJFF(this.promotionText, voucherTextAfterClaim.promotionText) && Intrinsics.LJFF(this.subPromotionText, voucherTextAfterClaim.subPromotionText);
    }

    public final int hashCode() {
        String str = this.promotionText;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.subPromotionText;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VoucherTextAfterClaim(promotionText=");
        sbLIZ.append(this.promotionText);
        sbLIZ.append(", subPromotionText=");
        sbLIZ.append(this.subPromotionText);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.promotionText);
        parcel.writeString(this.subPromotionText);
    }

    public VoucherTextAfterClaim(String str, String str2) {
        this.promotionText = str;
        this.subPromotionText = str2;
    }
}
