package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPLogisticEdgeInsets;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class PDPLogisticEdgeInsets implements Parcelable {

    @C09CT("bottom")
    public final Integer bottom;

    @C09CT("left")
    public final Integer left;

    @C09CT("right")
    public final Integer right;

    @C09CT("top")
    public final Integer top;
    public static final Parcelable.Creator<PDPLogisticEdgeInsets> CREATOR = new Parcelable.Creator<PDPLogisticEdgeInsets>() { // from class: X.03KB
        @Override // android.os.Parcelable.Creator
        public final PDPLogisticEdgeInsets createFromParcel(Parcel parcel) {
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
            return new PDPLogisticEdgeInsets(numValueOf, numValueOf2, numValueOf3, numValueOf4);
        }

        @Override // android.os.Parcelable.Creator
        public final PDPLogisticEdgeInsets[] newArray(int i) {
            return new PDPLogisticEdgeInsets[i];
        }
    };
    public static final int $stable = 8;

    public PDPLogisticEdgeInsets() {
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
        if (!(obj instanceof PDPLogisticEdgeInsets)) {
            return false;
        }
        PDPLogisticEdgeInsets pDPLogisticEdgeInsets = (PDPLogisticEdgeInsets) obj;
        return Intrinsics.LJFF(this.top, pDPLogisticEdgeInsets.top) && Intrinsics.LJFF(this.bottom, pDPLogisticEdgeInsets.bottom) && Intrinsics.LJFF(this.left, pDPLogisticEdgeInsets.left) && Intrinsics.LJFF(this.right, pDPLogisticEdgeInsets.right);
    }

    public final int hashCode() {
        Integer num = this.top;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.bottom;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.left;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.right;
        return iHashCode3 + (num4 != null ? num4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PDPLogisticEdgeInsets(top=");
        sbLIZ.append(this.top);
        sbLIZ.append(", bottom=");
        sbLIZ.append(this.bottom);
        sbLIZ.append(", left=");
        sbLIZ.append(this.left);
        sbLIZ.append(", right=");
        sbLIZ.append(this.right);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.top;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.bottom;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Integer num3 = this.left;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        Integer num4 = this.right;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num4.intValue());
        }
    }

    public PDPLogisticEdgeInsets(Integer num, Integer num2, Integer num3, Integer num4) {
        this.top = num;
        this.bottom = num2;
        this.left = num3;
        this.right = num4;
    }
}
