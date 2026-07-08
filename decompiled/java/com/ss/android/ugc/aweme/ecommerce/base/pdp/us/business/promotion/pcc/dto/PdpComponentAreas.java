package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.promotion.pcc.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.promotion.pcc.dto.PdpComponentArea;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.promotion.pcc.dto.PdpComponentAreas;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class PdpComponentAreas implements Parcelable {

    @C09CT("left")
    public final PdpComponentArea left;

    @C09CT("middle")
    public final PdpComponentArea middle;

    @C09CT("right")
    public final PdpComponentArea right;
    public static final Parcelable.Creator<PdpComponentAreas> CREATOR = new Parcelable.Creator<PdpComponentAreas>() { // from class: X.0vtX
        @Override // android.os.Parcelable.Creator
        public final PdpComponentAreas createFromParcel(Parcel parcel) {
            PdpComponentArea pdpComponentAreaCreateFromParcel;
            PdpComponentArea pdpComponentAreaCreateFromParcel2;
            PdpComponentArea pdpComponentAreaCreateFromParcel3 = null;
            if (parcel.readInt() == 0) {
                pdpComponentAreaCreateFromParcel = null;
            } else {
                pdpComponentAreaCreateFromParcel = PdpComponentArea.CREATOR.createFromParcel(parcel);
            }
            PdpComponentArea pdpComponentArea = pdpComponentAreaCreateFromParcel;
            if (parcel.readInt() == 0) {
                pdpComponentAreaCreateFromParcel2 = null;
            } else {
                pdpComponentAreaCreateFromParcel2 = PdpComponentArea.CREATOR.createFromParcel(parcel);
            }
            PdpComponentArea pdpComponentArea2 = pdpComponentAreaCreateFromParcel2;
            if (parcel.readInt() != 0) {
                pdpComponentAreaCreateFromParcel3 = PdpComponentArea.CREATOR.createFromParcel(parcel);
            }
            return new PdpComponentAreas(pdpComponentArea, pdpComponentArea2, pdpComponentAreaCreateFromParcel3);
        }

        @Override // android.os.Parcelable.Creator
        public final PdpComponentAreas[] newArray(int i) {
            return new PdpComponentAreas[i];
        }
    };
    public static final int $stable = 8;

    public PdpComponentAreas() {
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
        if (!(obj instanceof PdpComponentAreas)) {
            return false;
        }
        PdpComponentAreas pdpComponentAreas = (PdpComponentAreas) obj;
        return Intrinsics.LJFF(this.left, pdpComponentAreas.left) && Intrinsics.LJFF(this.middle, pdpComponentAreas.middle) && Intrinsics.LJFF(this.right, pdpComponentAreas.right);
    }

    public final int hashCode() {
        PdpComponentArea pdpComponentArea = this.left;
        int iHashCode = (pdpComponentArea == null ? 0 : pdpComponentArea.hashCode()) * 31;
        PdpComponentArea pdpComponentArea2 = this.middle;
        int iHashCode2 = (iHashCode + (pdpComponentArea2 == null ? 0 : pdpComponentArea2.hashCode())) * 31;
        PdpComponentArea pdpComponentArea3 = this.right;
        return iHashCode2 + (pdpComponentArea3 != null ? pdpComponentArea3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PdpComponentAreas(left=");
        sbLIZ.append(this.left);
        sbLIZ.append(", middle=");
        sbLIZ.append(this.middle);
        sbLIZ.append(", right=");
        sbLIZ.append(this.right);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        PdpComponentArea pdpComponentArea = this.left;
        if (pdpComponentArea == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            pdpComponentArea.writeToParcel(parcel, i);
        }
        PdpComponentArea pdpComponentArea2 = this.middle;
        if (pdpComponentArea2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            pdpComponentArea2.writeToParcel(parcel, i);
        }
        PdpComponentArea pdpComponentArea3 = this.right;
        if (pdpComponentArea3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            pdpComponentArea3.writeToParcel(parcel, i);
        }
    }

    public PdpComponentAreas(PdpComponentArea pdpComponentArea, PdpComponentArea pdpComponentArea2, PdpComponentArea pdpComponentArea3) {
        this.left = pdpComponentArea;
        this.middle = pdpComponentArea2;
        this.right = pdpComponentArea3;
    }
}
