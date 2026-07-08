package com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateFieldData;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateFieldProduct;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateFieldPromotionInfo;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateFieldText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class TemplateFieldData implements Parcelable {

    @C09CT("product_image")
    public final TemplateFieldProduct fieldProduct;

    @C09CT("promotion_info")
    public final TemplateFieldPromotionInfo fieldPromotionInfo;

    @C09CT("text")
    public final TemplateFieldText fieldText;
    public static final Parcelable.Creator<TemplateFieldData> CREATOR = new Parcelable.Creator<TemplateFieldData>() { // from class: X.0v8s
        @Override // android.os.Parcelable.Creator
        public final TemplateFieldData createFromParcel(Parcel parcel) {
            TemplateFieldText templateFieldTextCreateFromParcel;
            TemplateFieldProduct templateFieldProductCreateFromParcel;
            TemplateFieldPromotionInfo templateFieldPromotionInfoCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                templateFieldTextCreateFromParcel = null;
            } else {
                templateFieldTextCreateFromParcel = TemplateFieldText.CREATOR.createFromParcel(parcel);
            }
            TemplateFieldText templateFieldText = templateFieldTextCreateFromParcel;
            if (parcel.readInt() == 0) {
                templateFieldProductCreateFromParcel = null;
            } else {
                templateFieldProductCreateFromParcel = TemplateFieldProduct.CREATOR.createFromParcel(parcel);
            }
            TemplateFieldProduct templateFieldProduct = templateFieldProductCreateFromParcel;
            if (parcel.readInt() != 0) {
                templateFieldPromotionInfoCreateFromParcel = TemplateFieldPromotionInfo.CREATOR.createFromParcel(parcel);
            }
            return new TemplateFieldData(templateFieldText, templateFieldProduct, templateFieldPromotionInfoCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final TemplateFieldData[] newArray(int i) {
            return new TemplateFieldData[i];
        }
    };
    public static final int $stable = 8;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int hashCode() {
        TemplateFieldText templateFieldText = this.fieldText;
        int iHashCode = (templateFieldText == null ? 0 : templateFieldText.hashCode()) * 31;
        TemplateFieldProduct templateFieldProduct = this.fieldProduct;
        int iHashCode2 = (iHashCode + (templateFieldProduct == null ? 0 : templateFieldProduct.hashCode())) * 31;
        TemplateFieldPromotionInfo templateFieldPromotionInfo = this.fieldPromotionInfo;
        return iHashCode2 + (templateFieldPromotionInfo != null ? templateFieldPromotionInfo.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TemplateFieldData(fieldText=");
        sbLIZ.append(this.fieldText);
        sbLIZ.append(", fieldProduct=");
        sbLIZ.append(this.fieldProduct);
        sbLIZ.append(", fieldPromotionInfo=");
        sbLIZ.append(this.fieldPromotionInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        TemplateFieldText templateFieldText = this.fieldText;
        if (templateFieldText == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            templateFieldText.writeToParcel(parcel, i);
        }
        TemplateFieldProduct templateFieldProduct = this.fieldProduct;
        if (templateFieldProduct == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            templateFieldProduct.writeToParcel(parcel, i);
        }
        TemplateFieldPromotionInfo templateFieldPromotionInfo = this.fieldPromotionInfo;
        if (templateFieldPromotionInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            templateFieldPromotionInfo.writeToParcel(parcel, i);
        }
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof TemplateFieldData)) {
            TemplateFieldData templateFieldData = (TemplateFieldData) obj;
            if (Intrinsics.LJFF(this.fieldText, templateFieldData.fieldText) && Intrinsics.LJFF(this.fieldProduct, templateFieldData.fieldProduct) && Intrinsics.LJFF(this.fieldPromotionInfo, templateFieldData.fieldPromotionInfo)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public TemplateFieldData(TemplateFieldText templateFieldText, TemplateFieldProduct templateFieldProduct, TemplateFieldPromotionInfo templateFieldPromotionInfo) {
        this.fieldText = templateFieldText;
        this.fieldProduct = templateFieldProduct;
        this.fieldPromotionInfo = templateFieldPromotionInfo;
    }

    public static TemplateFieldData LIZ(TemplateFieldData templateFieldData, TemplateFieldText templateFieldText, TemplateFieldProduct templateFieldProduct, TemplateFieldPromotionInfo templateFieldPromotionInfo, int i) {
        if ((i & 1) != 0) {
            templateFieldText = templateFieldData.fieldText;
        }
        if ((i & 2) != 0) {
            templateFieldProduct = templateFieldData.fieldProduct;
        }
        if ((i & 4) != 0) {
            templateFieldPromotionInfo = templateFieldData.fieldPromotionInfo;
        }
        templateFieldData.getClass();
        return new TemplateFieldData(templateFieldText, templateFieldProduct, templateFieldPromotionInfo);
    }
}
