package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.page.sellingpoints.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.page.sellingpoints.model.ProductSellingPoints;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.page.sellingpoints.model.SeaPdpSellingPointsGroup;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ProductSellingPoints implements Parcelable {

    @C09CT("selling_points_bottom_bubble")
    public final SeaPdpSellingPointsGroup sellingPointsBottomBubble;

    @C09CT("selling_points_header_bubble")
    public final SeaPdpSellingPointsGroup sellingPointsHeaderBubble;
    public static final Parcelable.Creator<ProductSellingPoints> CREATOR = new Parcelable.Creator<ProductSellingPoints>() { // from class: X.03yz
        @Override // android.os.Parcelable.Creator
        public final ProductSellingPoints createFromParcel(Parcel parcel) {
            SeaPdpSellingPointsGroup seaPdpSellingPointsGroupCreateFromParcel;
            SeaPdpSellingPointsGroup seaPdpSellingPointsGroupCreateFromParcel2 = null;
            if (parcel.readInt() == 0) {
                seaPdpSellingPointsGroupCreateFromParcel = null;
            } else {
                seaPdpSellingPointsGroupCreateFromParcel = SeaPdpSellingPointsGroup.CREATOR.createFromParcel(parcel);
            }
            SeaPdpSellingPointsGroup seaPdpSellingPointsGroup = seaPdpSellingPointsGroupCreateFromParcel;
            if (parcel.readInt() != 0) {
                seaPdpSellingPointsGroupCreateFromParcel2 = SeaPdpSellingPointsGroup.CREATOR.createFromParcel(parcel);
            }
            return new ProductSellingPoints(seaPdpSellingPointsGroup, seaPdpSellingPointsGroupCreateFromParcel2);
        }

        @Override // android.os.Parcelable.Creator
        public final ProductSellingPoints[] newArray(int i) {
            return new ProductSellingPoints[i];
        }
    };
    public static final int $stable = 8;

    public ProductSellingPoints() {
        this(null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductSellingPoints)) {
            return false;
        }
        ProductSellingPoints productSellingPoints = (ProductSellingPoints) obj;
        return Intrinsics.LJFF(this.sellingPointsHeaderBubble, productSellingPoints.sellingPointsHeaderBubble) && Intrinsics.LJFF(this.sellingPointsBottomBubble, productSellingPoints.sellingPointsBottomBubble);
    }

    public final int hashCode() {
        SeaPdpSellingPointsGroup seaPdpSellingPointsGroup = this.sellingPointsHeaderBubble;
        int iHashCode = (seaPdpSellingPointsGroup == null ? 0 : seaPdpSellingPointsGroup.hashCode()) * 31;
        SeaPdpSellingPointsGroup seaPdpSellingPointsGroup2 = this.sellingPointsBottomBubble;
        return iHashCode + (seaPdpSellingPointsGroup2 != null ? seaPdpSellingPointsGroup2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ProductSellingPoints(sellingPointsHeaderBubble=");
        sbLIZ.append(this.sellingPointsHeaderBubble);
        sbLIZ.append(", sellingPointsBottomBubble=");
        sbLIZ.append(this.sellingPointsBottomBubble);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        SeaPdpSellingPointsGroup seaPdpSellingPointsGroup = this.sellingPointsHeaderBubble;
        if (seaPdpSellingPointsGroup == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            seaPdpSellingPointsGroup.writeToParcel(parcel, i);
        }
        SeaPdpSellingPointsGroup seaPdpSellingPointsGroup2 = this.sellingPointsBottomBubble;
        if (seaPdpSellingPointsGroup2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            seaPdpSellingPointsGroup2.writeToParcel(parcel, i);
        }
    }

    public ProductSellingPoints(SeaPdpSellingPointsGroup seaPdpSellingPointsGroup, SeaPdpSellingPointsGroup seaPdpSellingPointsGroup2) {
        this.sellingPointsHeaderBubble = seaPdpSellingPointsGroup;
        this.sellingPointsBottomBubble = seaPdpSellingPointsGroup2;
    }
}
