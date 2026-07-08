package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpButtonAreaIdV2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class PdpButtonAreaIdV2 implements Parcelable {

    @C09CT("pdp_button_area_id")
    public String pdpButtonAreaId;

    @C09CT("product_purchase_type")
    public int purchaseType;
    public static final Parcelable.Creator<PdpButtonAreaIdV2> CREATOR = new Parcelable.Creator<PdpButtonAreaIdV2>() { // from class: X.02hz
        @Override // android.os.Parcelable.Creator
        public final PdpButtonAreaIdV2 createFromParcel(Parcel parcel) {
            return new PdpButtonAreaIdV2(parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PdpButtonAreaIdV2[] newArray(int i) {
            return new PdpButtonAreaIdV2[i];
        }
    };
    public static final int $stable = 8;

    public PdpButtonAreaIdV2() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PdpButtonAreaIdV2)) {
            return false;
        }
        PdpButtonAreaIdV2 pdpButtonAreaIdV2 = (PdpButtonAreaIdV2) obj;
        return this.purchaseType == pdpButtonAreaIdV2.purchaseType && Intrinsics.LJFF(this.pdpButtonAreaId, pdpButtonAreaIdV2.pdpButtonAreaId);
    }

    public final int hashCode() {
        return (this.purchaseType * 31) + this.pdpButtonAreaId.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PdpButtonAreaIdV2(purchaseType=");
        sbLIZ.append(this.purchaseType);
        sbLIZ.append(", pdpButtonAreaId=");
        sbLIZ.append(this.pdpButtonAreaId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.purchaseType);
        parcel.writeString(this.pdpButtonAreaId);
    }

    public PdpButtonAreaIdV2(int i, String str) {
        this.purchaseType = i;
        this.pdpButtonAreaId = str;
    }
}
