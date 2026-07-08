package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import X.C604102Xf;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.CommonColor;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellingPointLabel;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class SellingPointLabel implements Parcelable {

    @C09CT("background_color")
    public CommonColor backgroundColor;

    @C09CT("da_info")
    public String daInfo;

    @C09CT("style")
    public Integer style;

    @C09CT("selling_point_data")
    public ECRichText text;
    public static final C604102Xf Companion = new Object() { // from class: X.02Xf
    };
    public static final Parcelable.Creator<SellingPointLabel> CREATOR = new Parcelable.Creator<SellingPointLabel>() { // from class: X.02Xe
        @Override // android.os.Parcelable.Creator
        public final SellingPointLabel createFromParcel(Parcel parcel) {
            Integer numValueOf;
            ECRichText eCRichText = (ECRichText) parcel.readParcelable(SellingPointLabel.class.getClassLoader());
            String string = parcel.readString();
            CommonColor commonColorCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() != 0) {
                commonColorCreateFromParcel = CommonColor.CREATOR.createFromParcel(parcel);
            }
            return new SellingPointLabel(eCRichText, string, numValueOf, commonColorCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final SellingPointLabel[] newArray(int i) {
            return new SellingPointLabel[i];
        }
    };
    public static final int $stable = 8;

    public SellingPointLabel() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SellingPointLabel)) {
            return false;
        }
        SellingPointLabel sellingPointLabel = (SellingPointLabel) obj;
        return Intrinsics.LJFF(this.text, sellingPointLabel.text) && Intrinsics.LJFF(this.daInfo, sellingPointLabel.daInfo) && Intrinsics.LJFF(this.style, sellingPointLabel.style) && Intrinsics.LJFF(this.backgroundColor, sellingPointLabel.backgroundColor);
    }

    public final int hashCode() {
        ECRichText eCRichText = this.text;
        int iHashCode = (eCRichText == null ? 0 : eCRichText.hashCode()) * 31;
        String str = this.daInfo;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.style;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        CommonColor commonColor = this.backgroundColor;
        return iHashCode3 + (commonColor != null ? commonColor.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SellingPointLabel(text=");
        sbLIZ.append(this.text);
        sbLIZ.append(", daInfo=");
        sbLIZ.append(this.daInfo);
        sbLIZ.append(", style=");
        sbLIZ.append(this.style);
        sbLIZ.append(", backgroundColor=");
        sbLIZ.append(this.backgroundColor);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.text, i);
        parcel.writeString(this.daInfo);
        Integer num = this.style;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        CommonColor commonColor = this.backgroundColor;
        if (commonColor == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            commonColor.writeToParcel(parcel, i);
        }
    }

    public SellingPointLabel(ECRichText eCRichText, String str, Integer num, CommonColor commonColor) {
        this.text = eCRichText;
        this.daInfo = str;
        this.style = num;
        this.backgroundColor = commonColor;
    }
}
