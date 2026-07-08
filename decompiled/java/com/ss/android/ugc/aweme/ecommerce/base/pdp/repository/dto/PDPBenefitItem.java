package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPBenefitContentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPBenefitItem;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPBenefitStyleInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class PDPBenefitItem implements Parcelable {

    @C09CT("content_info")
    public final PDPBenefitContentInfo contentInfo;

    @C09CT("style_info")
    public final PDPBenefitStyleInfo styleInfo;
    public static final Parcelable.Creator<PDPBenefitItem> CREATOR = new Parcelable.Creator<PDPBenefitItem>() { // from class: X.0vjQ
        @Override // android.os.Parcelable.Creator
        public final PDPBenefitItem createFromParcel(Parcel parcel) {
            PDPBenefitStyleInfo pDPBenefitStyleInfoCreateFromParcel;
            PDPBenefitContentInfo pDPBenefitContentInfoCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                pDPBenefitStyleInfoCreateFromParcel = null;
            } else {
                pDPBenefitStyleInfoCreateFromParcel = PDPBenefitStyleInfo.CREATOR.createFromParcel(parcel);
            }
            PDPBenefitStyleInfo pDPBenefitStyleInfo = pDPBenefitStyleInfoCreateFromParcel;
            if (parcel.readInt() != 0) {
                pDPBenefitContentInfoCreateFromParcel = PDPBenefitContentInfo.CREATOR.createFromParcel(parcel);
            }
            return new PDPBenefitItem(pDPBenefitStyleInfo, pDPBenefitContentInfoCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final PDPBenefitItem[] newArray(int i) {
            return new PDPBenefitItem[i];
        }
    };
    public static final int $stable = 8;

    public PDPBenefitItem() {
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
        if (!(obj instanceof PDPBenefitItem)) {
            return false;
        }
        PDPBenefitItem pDPBenefitItem = (PDPBenefitItem) obj;
        return Intrinsics.LJFF(this.styleInfo, pDPBenefitItem.styleInfo) && Intrinsics.LJFF(this.contentInfo, pDPBenefitItem.contentInfo);
    }

    public final int hashCode() {
        PDPBenefitStyleInfo pDPBenefitStyleInfo = this.styleInfo;
        int iHashCode = (pDPBenefitStyleInfo == null ? 0 : pDPBenefitStyleInfo.hashCode()) * 31;
        PDPBenefitContentInfo pDPBenefitContentInfo = this.contentInfo;
        return iHashCode + (pDPBenefitContentInfo != null ? pDPBenefitContentInfo.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PDPBenefitItem(styleInfo=");
        sbLIZ.append(this.styleInfo);
        sbLIZ.append(", contentInfo=");
        sbLIZ.append(this.contentInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        PDPBenefitStyleInfo pDPBenefitStyleInfo = this.styleInfo;
        if (pDPBenefitStyleInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            pDPBenefitStyleInfo.writeToParcel(parcel, i);
        }
        PDPBenefitContentInfo pDPBenefitContentInfo = this.contentInfo;
        if (pDPBenefitContentInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            pDPBenefitContentInfo.writeToParcel(parcel, i);
        }
    }

    public PDPBenefitItem(PDPBenefitStyleInfo pDPBenefitStyleInfo, PDPBenefitContentInfo pDPBenefitContentInfo) {
        this.styleInfo = pDPBenefitStyleInfo;
        this.contentInfo = pDPBenefitContentInfo;
    }
}
