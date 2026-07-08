package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BubbleSellingPoints;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellingPointGroup;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class BubbleSellingPoints implements Parcelable {

    @C09CT("header_selling_points")
    public final SellingPointGroup headerSellingPoints;

    @C09CT("sku_selling_points")
    public final SellingPointGroup skuSellingPoints;
    public static final Parcelable.Creator<BubbleSellingPoints> CREATOR = new Parcelable.Creator<BubbleSellingPoints>() { // from class: X.02yj
        @Override // android.os.Parcelable.Creator
        public final BubbleSellingPoints createFromParcel(Parcel parcel) {
            SellingPointGroup sellingPointGroupCreateFromParcel;
            SellingPointGroup sellingPointGroupCreateFromParcel2 = null;
            if (parcel.readInt() == 0) {
                sellingPointGroupCreateFromParcel = null;
            } else {
                sellingPointGroupCreateFromParcel = SellingPointGroup.CREATOR.createFromParcel(parcel);
            }
            SellingPointGroup sellingPointGroup = sellingPointGroupCreateFromParcel;
            if (parcel.readInt() != 0) {
                sellingPointGroupCreateFromParcel2 = SellingPointGroup.CREATOR.createFromParcel(parcel);
            }
            return new BubbleSellingPoints(sellingPointGroup, sellingPointGroupCreateFromParcel2);
        }

        @Override // android.os.Parcelable.Creator
        public final BubbleSellingPoints[] newArray(int i) {
            return new BubbleSellingPoints[i];
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
        if (!(obj instanceof BubbleSellingPoints)) {
            return false;
        }
        BubbleSellingPoints bubbleSellingPoints = (BubbleSellingPoints) obj;
        return Intrinsics.LJFF(this.headerSellingPoints, bubbleSellingPoints.headerSellingPoints) && Intrinsics.LJFF(this.skuSellingPoints, bubbleSellingPoints.skuSellingPoints);
    }

    public final int hashCode() {
        SellingPointGroup sellingPointGroup = this.headerSellingPoints;
        int iHashCode = (sellingPointGroup == null ? 0 : sellingPointGroup.hashCode()) * 31;
        SellingPointGroup sellingPointGroup2 = this.skuSellingPoints;
        return iHashCode + (sellingPointGroup2 != null ? sellingPointGroup2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BubbleSellingPoints(headerSellingPoints=");
        sbLIZ.append(this.headerSellingPoints);
        sbLIZ.append(", skuSellingPoints=");
        sbLIZ.append(this.skuSellingPoints);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        SellingPointGroup sellingPointGroup = this.headerSellingPoints;
        if (sellingPointGroup == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            sellingPointGroup.writeToParcel(parcel, i);
        }
        SellingPointGroup sellingPointGroup2 = this.skuSellingPoints;
        if (sellingPointGroup2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            sellingPointGroup2.writeToParcel(parcel, i);
        }
    }

    public BubbleSellingPoints(SellingPointGroup sellingPointGroup, SellingPointGroup sellingPointGroup2) {
        this.headerSellingPoints = sellingPointGroup;
        this.skuSellingPoints = sellingPointGroup2;
    }
}
