package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPLogisticCornerRadius;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class PDPLogisticCornerRadius implements Parcelable {

    @C09CT("bottom_left")
    public final Integer bottomLeft;

    @C09CT("bottom_right")
    public final Integer bottomRight;

    @C09CT("top_left")
    public final Integer topLeft;

    @C09CT("top_right")
    public final Integer topRight;
    public static final Parcelable.Creator<PDPLogisticCornerRadius> CREATOR = new Parcelable.Creator<PDPLogisticCornerRadius>() { // from class: X.03KD
        @Override // android.os.Parcelable.Creator
        public final PDPLogisticCornerRadius createFromParcel(Parcel parcel) {
            Integer numValueOf;
            Integer numValueOf2;
            Integer numValueOf3;
            Integer numValueOf4 = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                numValueOf2 = null;
            } else {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                numValueOf3 = null;
            } else {
                numValueOf3 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() != 0) {
                numValueOf4 = Integer.valueOf(parcel.readInt());
            }
            return new PDPLogisticCornerRadius(numValueOf, numValueOf2, numValueOf3, numValueOf4);
        }

        @Override // android.os.Parcelable.Creator
        public final PDPLogisticCornerRadius[] newArray(int i) {
            return new PDPLogisticCornerRadius[i];
        }
    };
    public static final int $stable = 8;

    public PDPLogisticCornerRadius() {
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
        if (!(obj instanceof PDPLogisticCornerRadius)) {
            return false;
        }
        PDPLogisticCornerRadius pDPLogisticCornerRadius = (PDPLogisticCornerRadius) obj;
        return Intrinsics.LJFF(this.topLeft, pDPLogisticCornerRadius.topLeft) && Intrinsics.LJFF(this.topRight, pDPLogisticCornerRadius.topRight) && Intrinsics.LJFF(this.bottomRight, pDPLogisticCornerRadius.bottomRight) && Intrinsics.LJFF(this.bottomLeft, pDPLogisticCornerRadius.bottomLeft);
    }

    public final int hashCode() {
        Integer num = this.topLeft;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.topRight;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.bottomRight;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.bottomLeft;
        return iHashCode3 + (num4 != null ? num4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PDPLogisticCornerRadius(topLeft=");
        sbLIZ.append(this.topLeft);
        sbLIZ.append(", topRight=");
        sbLIZ.append(this.topRight);
        sbLIZ.append(", bottomRight=");
        sbLIZ.append(this.bottomRight);
        sbLIZ.append(", bottomLeft=");
        sbLIZ.append(this.bottomLeft);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.topLeft;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.topRight;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Integer num3 = this.bottomRight;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        Integer num4 = this.bottomLeft;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num4.intValue());
        }
    }

    public PDPLogisticCornerRadius(Integer num, Integer num2, Integer num3, Integer num4) {
        this.topLeft = num;
        this.topRight = num2;
        this.bottomRight = num3;
        this.bottomLeft = num4;
    }
}
