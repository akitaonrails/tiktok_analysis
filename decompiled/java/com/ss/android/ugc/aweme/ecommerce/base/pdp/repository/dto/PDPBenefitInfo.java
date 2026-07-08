package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPBenefitInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPBenefitItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class PDPBenefitInfo implements Parcelable {

    @C09CT("biz_type")
    public final Integer bizType;

    @C09CT("da_info")
    public final String daInfo;

    @C09CT("dynamic_item")
    public final PDPBenefitItem dynamicItem;

    @C09CT("static_item")
    public final PDPBenefitItem staticItem;

    @C09CT("style")
    public final Integer style;
    public static final Parcelable.Creator<PDPBenefitInfo> CREATOR = new Parcelable.Creator<PDPBenefitInfo>() { // from class: X.0vjO
        @Override // android.os.Parcelable.Creator
        public final PDPBenefitInfo createFromParcel(Parcel parcel) {
            Integer numValueOf;
            Integer numValueOf2;
            PDPBenefitItem pDPBenefitItemCreateFromParcel;
            PDPBenefitItem pDPBenefitItemCreateFromParcel2 = null;
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
                pDPBenefitItemCreateFromParcel = null;
            } else {
                pDPBenefitItemCreateFromParcel = PDPBenefitItem.CREATOR.createFromParcel(parcel);
            }
            PDPBenefitItem pDPBenefitItem = pDPBenefitItemCreateFromParcel;
            if (parcel.readInt() != 0) {
                pDPBenefitItemCreateFromParcel2 = PDPBenefitItem.CREATOR.createFromParcel(parcel);
            }
            return new PDPBenefitInfo(numValueOf, numValueOf2, pDPBenefitItem, pDPBenefitItemCreateFromParcel2, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PDPBenefitInfo[] newArray(int i) {
            return new PDPBenefitInfo[i];
        }
    };
    public static final int $stable = 8;

    public PDPBenefitInfo() {
        this(null, null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PDPBenefitInfo)) {
            return false;
        }
        PDPBenefitInfo pDPBenefitInfo = (PDPBenefitInfo) obj;
        return Intrinsics.LJFF(this.bizType, pDPBenefitInfo.bizType) && Intrinsics.LJFF(this.style, pDPBenefitInfo.style) && Intrinsics.LJFF(this.dynamicItem, pDPBenefitInfo.dynamicItem) && Intrinsics.LJFF(this.staticItem, pDPBenefitInfo.staticItem) && Intrinsics.LJFF(this.daInfo, pDPBenefitInfo.daInfo);
    }

    public final int hashCode() {
        Integer num = this.bizType;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.style;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        PDPBenefitItem pDPBenefitItem = this.dynamicItem;
        int iHashCode3 = (iHashCode2 + (pDPBenefitItem == null ? 0 : pDPBenefitItem.hashCode())) * 31;
        PDPBenefitItem pDPBenefitItem2 = this.staticItem;
        int iHashCode4 = (iHashCode3 + (pDPBenefitItem2 == null ? 0 : pDPBenefitItem2.hashCode())) * 31;
        String str = this.daInfo;
        return iHashCode4 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PDPBenefitInfo(bizType=");
        sbLIZ.append(this.bizType);
        sbLIZ.append(", style=");
        sbLIZ.append(this.style);
        sbLIZ.append(", dynamicItem=");
        sbLIZ.append(this.dynamicItem);
        sbLIZ.append(", staticItem=");
        sbLIZ.append(this.staticItem);
        sbLIZ.append(", daInfo=");
        sbLIZ.append(this.daInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.bizType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.style;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        PDPBenefitItem pDPBenefitItem = this.dynamicItem;
        if (pDPBenefitItem == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            pDPBenefitItem.writeToParcel(parcel, i);
        }
        PDPBenefitItem pDPBenefitItem2 = this.staticItem;
        if (pDPBenefitItem2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            pDPBenefitItem2.writeToParcel(parcel, i);
        }
        parcel.writeString(this.daInfo);
    }

    public PDPBenefitInfo(Integer num, Integer num2, PDPBenefitItem pDPBenefitItem, PDPBenefitItem pDPBenefitItem2, String str) {
        this.bizType = num;
        this.style = num2;
        this.dynamicItem = pDPBenefitItem;
        this.staticItem = pDPBenefitItem2;
        this.daInfo = str;
    }
}
