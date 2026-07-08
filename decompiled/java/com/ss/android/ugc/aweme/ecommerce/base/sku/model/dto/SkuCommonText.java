package com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuCommonText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class SkuCommonText implements Parcelable {

    @C09CT("desc")
    public String desc;

    @C09CT("sku_common_text_type")
    public Integer skuCommonTextType;

    @C09CT("toast")
    public String toast;
    public static final Parcelable.Creator<SkuCommonText> CREATOR = new Parcelable.Creator<SkuCommonText>() { // from class: X.02ha
        @Override // android.os.Parcelable.Creator
        public final SkuCommonText createFromParcel(Parcel parcel) {
            Integer numValueOf;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new SkuCommonText(numValueOf, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SkuCommonText[] newArray(int i) {
            return new SkuCommonText[i];
        }
    };
    public static final int $stable = 8;

    public SkuCommonText() {
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
        if (!(obj instanceof SkuCommonText)) {
            return false;
        }
        SkuCommonText skuCommonText = (SkuCommonText) obj;
        return Intrinsics.LJFF(this.skuCommonTextType, skuCommonText.skuCommonTextType) && Intrinsics.LJFF(this.desc, skuCommonText.desc) && Intrinsics.LJFF(this.toast, skuCommonText.toast);
    }

    public final int hashCode() {
        Integer num = this.skuCommonTextType;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.desc;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.toast;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SkuCommonText(skuCommonTextType=");
        sbLIZ.append(this.skuCommonTextType);
        sbLIZ.append(", desc=");
        sbLIZ.append(this.desc);
        sbLIZ.append(", toast=");
        sbLIZ.append(this.toast);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iIntValue;
        Integer num = this.skuCommonTextType;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeString(this.desc);
        parcel.writeString(this.toast);
    }

    public SkuCommonText(Integer num, String str, String str2) {
        this.skuCommonTextType = num;
        this.desc = str;
        this.toast = str2;
    }
}
