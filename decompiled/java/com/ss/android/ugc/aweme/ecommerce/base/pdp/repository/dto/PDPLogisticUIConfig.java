package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPLogisticCornerRadius;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPLogisticEdgeInsets;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPLogisticUIConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class PDPLogisticUIConfig implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<PDPLogisticUIConfig> CREATOR = new Parcelable.Creator<PDPLogisticUIConfig>() { // from class: X.03KC
        @Override // android.os.Parcelable.Creator
        public final PDPLogisticUIConfig createFromParcel(Parcel parcel) {
            Integer numValueOf;
            Integer numValueOf2;
            PDPLogisticEdgeInsets pDPLogisticEdgeInsetsCreateFromParcel;
            PDPLogisticEdgeInsets pDPLogisticEdgeInsetsCreateFromParcel2;
            PDPLogisticCornerRadius pDPLogisticCornerRadiusCreateFromParcel = null;
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
                pDPLogisticEdgeInsetsCreateFromParcel = null;
            } else {
                pDPLogisticEdgeInsetsCreateFromParcel = PDPLogisticEdgeInsets.CREATOR.createFromParcel(parcel);
            }
            PDPLogisticEdgeInsets pDPLogisticEdgeInsets = pDPLogisticEdgeInsetsCreateFromParcel;
            if (parcel.readInt() == 0) {
                pDPLogisticEdgeInsetsCreateFromParcel2 = null;
            } else {
                pDPLogisticEdgeInsetsCreateFromParcel2 = PDPLogisticEdgeInsets.CREATOR.createFromParcel(parcel);
            }
            PDPLogisticEdgeInsets pDPLogisticEdgeInsets2 = pDPLogisticEdgeInsetsCreateFromParcel2;
            if (parcel.readInt() != 0) {
                pDPLogisticCornerRadiusCreateFromParcel = PDPLogisticCornerRadius.CREATOR.createFromParcel(parcel);
            }
            return new PDPLogisticUIConfig(numValueOf, numValueOf2, pDPLogisticEdgeInsets, pDPLogisticEdgeInsets2, pDPLogisticCornerRadiusCreateFromParcel, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PDPLogisticUIConfig[] newArray(int i) {
            return new PDPLogisticUIConfig[i];
        }
    };

    @C09CT("bg_color")
    public final String backgroundColor;

    @C09CT("bottom_padding")
    public final Integer bottomPadding;

    @C09CT("margin")
    public final PDPLogisticEdgeInsets margin;

    @C09CT("padding")
    public final PDPLogisticEdgeInsets padding;

    @C09CT("radius")
    public final PDPLogisticCornerRadius radius;

    @C09CT("top_padding")
    public final Integer topPadding;

    public PDPLogisticUIConfig() {
        this(null, null, null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PDPLogisticUIConfig)) {
            return false;
        }
        PDPLogisticUIConfig pDPLogisticUIConfig = (PDPLogisticUIConfig) obj;
        return Intrinsics.LJFF(this.topPadding, pDPLogisticUIConfig.topPadding) && Intrinsics.LJFF(this.bottomPadding, pDPLogisticUIConfig.bottomPadding) && Intrinsics.LJFF(this.margin, pDPLogisticUIConfig.margin) && Intrinsics.LJFF(this.padding, pDPLogisticUIConfig.padding) && Intrinsics.LJFF(this.radius, pDPLogisticUIConfig.radius) && Intrinsics.LJFF(this.backgroundColor, pDPLogisticUIConfig.backgroundColor);
    }

    public final int hashCode() {
        Integer num = this.topPadding;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.bottomPadding;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        PDPLogisticEdgeInsets pDPLogisticEdgeInsets = this.margin;
        int iHashCode3 = (iHashCode2 + (pDPLogisticEdgeInsets == null ? 0 : pDPLogisticEdgeInsets.hashCode())) * 31;
        PDPLogisticEdgeInsets pDPLogisticEdgeInsets2 = this.padding;
        int iHashCode4 = (iHashCode3 + (pDPLogisticEdgeInsets2 == null ? 0 : pDPLogisticEdgeInsets2.hashCode())) * 31;
        PDPLogisticCornerRadius pDPLogisticCornerRadius = this.radius;
        int iHashCode5 = (iHashCode4 + (pDPLogisticCornerRadius == null ? 0 : pDPLogisticCornerRadius.hashCode())) * 31;
        String str = this.backgroundColor;
        return iHashCode5 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PDPLogisticUIConfig(topPadding=");
        sbLIZ.append(this.topPadding);
        sbLIZ.append(", bottomPadding=");
        sbLIZ.append(this.bottomPadding);
        sbLIZ.append(", margin=");
        sbLIZ.append(this.margin);
        sbLIZ.append(", padding=");
        sbLIZ.append(this.padding);
        sbLIZ.append(", radius=");
        sbLIZ.append(this.radius);
        sbLIZ.append(", backgroundColor=");
        sbLIZ.append(this.backgroundColor);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.topPadding;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.bottomPadding;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        PDPLogisticEdgeInsets pDPLogisticEdgeInsets = this.margin;
        if (pDPLogisticEdgeInsets == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            pDPLogisticEdgeInsets.writeToParcel(parcel, i);
        }
        PDPLogisticEdgeInsets pDPLogisticEdgeInsets2 = this.padding;
        if (pDPLogisticEdgeInsets2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            pDPLogisticEdgeInsets2.writeToParcel(parcel, i);
        }
        PDPLogisticCornerRadius pDPLogisticCornerRadius = this.radius;
        if (pDPLogisticCornerRadius == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            pDPLogisticCornerRadius.writeToParcel(parcel, i);
        }
        parcel.writeString(this.backgroundColor);
    }

    public PDPLogisticUIConfig(Integer num, Integer num2, PDPLogisticEdgeInsets pDPLogisticEdgeInsets, PDPLogisticEdgeInsets pDPLogisticEdgeInsets2, PDPLogisticCornerRadius pDPLogisticCornerRadius, String str) {
        this.topPadding = num;
        this.bottomPadding = num2;
        this.margin = pDPLogisticEdgeInsets;
        this.padding = pDPLogisticEdgeInsets2;
        this.radius = pDPLogisticCornerRadius;
        this.backgroundColor = str;
    }
}
