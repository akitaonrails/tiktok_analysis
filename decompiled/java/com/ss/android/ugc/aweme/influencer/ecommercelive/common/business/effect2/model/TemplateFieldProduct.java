package com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateFieldProduct;
import kotlin.text.u;

/* JADX INFO: loaded from: classes27.dex */
public final class TemplateFieldProduct implements Parcelable {

    @C09CT("product_id")
    public final String productId;

    @C09CT("product_image_url")
    public final String productImage;

    @C09CT("product_index")
    public final String productIndex;

    @C09CT("product_name")
    public final String productName;

    @C09CT("product_image_origin_url")
    public final String productOriginImage;
    public static final Parcelable.Creator<TemplateFieldProduct> CREATOR = new Parcelable.Creator<TemplateFieldProduct>() { // from class: X.0v8k
        @Override // android.os.Parcelable.Creator
        public final TemplateFieldProduct createFromParcel(Parcel parcel) {
            return new TemplateFieldProduct(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TemplateFieldProduct[] newArray(int i) {
            return new TemplateFieldProduct[i];
        }
    };
    public static final int $stable = 8;

    public final Integer LIZ() {
        Integer numValueOf = null;
        try {
            String str = this.productIndex;
            if (str != null) {
                numValueOf = Integer.valueOf(CastIntegerProtector.parseInt(str));
                return numValueOf;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return numValueOf;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int hashCode() {
        String str = this.productImage;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.productIndex;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.productId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.productName;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.productOriginImage;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TemplateFieldProduct(productImage=");
        sbLIZ.append(this.productImage);
        sbLIZ.append(", productIndex=");
        sbLIZ.append(this.productIndex);
        sbLIZ.append(", productId=");
        sbLIZ.append(this.productId);
        sbLIZ.append(", productName=");
        sbLIZ.append(this.productName);
        sbLIZ.append(", productOriginImage=");
        sbLIZ.append(this.productOriginImage);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.productImage);
        parcel.writeString(this.productIndex);
        parcel.writeString(this.productId);
        parcel.writeString(this.productName);
        parcel.writeString(this.productOriginImage);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof TemplateFieldProduct)) {
            return false;
        }
        TemplateFieldProduct templateFieldProduct = (TemplateFieldProduct) obj;
        if (!u.LJIJI(this.productId, templateFieldProduct.productId, false) || !u.LJIJI(this.productImage, templateFieldProduct.productImage, false) || !u.LJIJI(this.productIndex, templateFieldProduct.productIndex, false) || !u.LJIJI(this.productName, templateFieldProduct.productName, false)) {
            return false;
        }
        return true;
    }

    public TemplateFieldProduct(String str, String str2, String str3, String str4, String str5) {
        this.productImage = str;
        this.productIndex = str2;
        this.productId = str3;
        this.productName = str4;
        this.productOriginImage = str5;
    }
}
