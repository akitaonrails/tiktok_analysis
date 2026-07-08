package com.ss.android.ugc.aweme.ecommerce.base.address.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressPromotionSku;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class AddressPromotionSku implements Parcelable {

    @C09CT("product_id")
    public final String productId;

    @C09CT("seller_id")
    public final String sellerId;

    @C09CT("sku_id")
    public final String skuId;

    @C09CT("source_info")
    public final String sourceInfo;
    public static final Parcelable.Creator<AddressPromotionSku> CREATOR = new Parcelable.Creator<AddressPromotionSku>() { // from class: X.03Qv
        @Override // android.os.Parcelable.Creator
        public final AddressPromotionSku createFromParcel(Parcel parcel) {
            return new AddressPromotionSku(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AddressPromotionSku[] newArray(int i) {
            return new AddressPromotionSku[i];
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
        if (!(obj instanceof AddressPromotionSku)) {
            return false;
        }
        AddressPromotionSku addressPromotionSku = (AddressPromotionSku) obj;
        return Intrinsics.LJFF(this.productId, addressPromotionSku.productId) && Intrinsics.LJFF(this.skuId, addressPromotionSku.skuId) && Intrinsics.LJFF(this.sellerId, addressPromotionSku.sellerId) && Intrinsics.LJFF(this.sourceInfo, addressPromotionSku.sourceInfo);
    }

    public final int hashCode() {
        String str = this.productId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.skuId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.sellerId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.sourceInfo;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AddressPromotionSku(productId=");
        sbLIZ.append(this.productId);
        sbLIZ.append(", skuId=");
        sbLIZ.append(this.skuId);
        sbLIZ.append(", sellerId=");
        sbLIZ.append(this.sellerId);
        sbLIZ.append(", sourceInfo=");
        sbLIZ.append(this.sourceInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.productId);
        parcel.writeString(this.skuId);
        parcel.writeString(this.sellerId);
        parcel.writeString(this.sourceInfo);
    }

    public AddressPromotionSku(String str, String str2, String str3, String str4) {
        this.productId = str;
        this.skuId = str2;
        this.sellerId = str3;
        this.sourceInfo = str4;
    }
}
