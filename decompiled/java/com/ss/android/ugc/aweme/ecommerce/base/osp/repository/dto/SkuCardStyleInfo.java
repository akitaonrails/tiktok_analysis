package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SkuCardStyleInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class SkuCardStyleInfo implements Parcelable {

    @C09CT("edit_bundle_quantity_toast")
    public String editBundleQuantityToast;

    @C09CT("sku_card_style_type")
    public Integer skuCardStyleType;

    @C09CT("title_light_text")
    public String titleLightText;
    public static final Parcelable.Creator<SkuCardStyleInfo> CREATOR = new Parcelable.Creator<SkuCardStyleInfo>() { // from class: X.02oN
        @Override // android.os.Parcelable.Creator
        public final SkuCardStyleInfo createFromParcel(Parcel parcel) {
            Integer numValueOf;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new SkuCardStyleInfo(numValueOf, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SkuCardStyleInfo[] newArray(int i) {
            return new SkuCardStyleInfo[i];
        }
    };
    public static final int $stable = 8;

    public SkuCardStyleInfo() {
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
        if (!(obj instanceof SkuCardStyleInfo)) {
            return false;
        }
        SkuCardStyleInfo skuCardStyleInfo = (SkuCardStyleInfo) obj;
        return Intrinsics.LJFF(this.skuCardStyleType, skuCardStyleInfo.skuCardStyleType) && Intrinsics.LJFF(this.titleLightText, skuCardStyleInfo.titleLightText) && Intrinsics.LJFF(this.editBundleQuantityToast, skuCardStyleInfo.editBundleQuantityToast);
    }

    public final int hashCode() {
        Integer num = this.skuCardStyleType;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.titleLightText;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.editBundleQuantityToast;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SkuCardStyleInfo(skuCardStyleType=");
        sbLIZ.append(this.skuCardStyleType);
        sbLIZ.append(", titleLightText=");
        sbLIZ.append(this.titleLightText);
        sbLIZ.append(", editBundleQuantityToast=");
        sbLIZ.append(this.editBundleQuantityToast);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iIntValue;
        Integer num = this.skuCardStyleType;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeString(this.titleLightText);
        parcel.writeString(this.editBundleQuantityToast);
    }

    public SkuCardStyleInfo(Integer num, String str, String str2) {
        this.skuCardStyleType = num;
        this.titleLightText = str;
        this.editBundleQuantityToast = str2;
    }
}
