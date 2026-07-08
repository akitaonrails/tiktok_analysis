package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Amount;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.DiscountInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class DiscountInfo implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<DiscountInfo> CREATOR = new Parcelable.Creator<DiscountInfo>() { // from class: X.02pK
        @Override // android.os.Parcelable.Creator
        public final DiscountInfo createFromParcel(Parcel parcel) {
            Amount amountCreateFromParcel;
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                amountCreateFromParcel = null;
            } else {
                amountCreateFromParcel = Amount.CREATOR.createFromParcel(parcel);
            }
            return new DiscountInfo(string, string2, amountCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final DiscountInfo[] newArray(int i) {
            return new DiscountInfo[i];
        }
    };

    @C09CT("discount_amount")
    public Amount discountAmount;

    @C09CT("discount_source_id")
    public String discountSourceId;

    @C09CT("discount_type")
    public String discountType;

    public DiscountInfo() {
        this(null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DiscountInfo)) {
            return false;
        }
        DiscountInfo discountInfo = (DiscountInfo) obj;
        return Intrinsics.LJFF(this.discountType, discountInfo.discountType) && Intrinsics.LJFF(this.discountSourceId, discountInfo.discountSourceId) && Intrinsics.LJFF(this.discountAmount, discountInfo.discountAmount);
    }

    public final int hashCode() {
        String str = this.discountType;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.discountSourceId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Amount amount = this.discountAmount;
        return iHashCode2 + (amount != null ? amount.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DiscountInfo(discountType=");
        sbLIZ.append(this.discountType);
        sbLIZ.append(", discountSourceId=");
        sbLIZ.append(this.discountSourceId);
        sbLIZ.append(", discountAmount=");
        sbLIZ.append(this.discountAmount);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.discountType);
        parcel.writeString(this.discountSourceId);
        Amount amount = this.discountAmount;
        if (amount == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            amount.writeToParcel(parcel, i);
        }
    }

    public DiscountInfo(String str, String str2, Amount amount) {
        this.discountType = str;
        this.discountSourceId = str2;
        this.discountAmount = amount;
    }
}
