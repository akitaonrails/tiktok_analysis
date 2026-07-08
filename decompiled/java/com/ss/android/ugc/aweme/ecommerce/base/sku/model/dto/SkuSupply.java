package com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuSupply;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class SkuSupply implements Parcelable {

    @C09CT("product_id")
    public String productId;

    @C09CT("seller_id")
    public String sellerId;

    @C09CT("sku_id")
    public String skuId;
    public static final Parcelable.Creator<SkuSupply> CREATOR = new Parcelable.Creator<SkuSupply>() { // from class: X.02o8
        @Override // android.os.Parcelable.Creator
        public final SkuSupply createFromParcel(Parcel parcel) {
            return new SkuSupply(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SkuSupply[] newArray(int i) {
            return new SkuSupply[i];
        }
    };
    public static final int $stable = 8;

    public SkuSupply() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SkuSupply)) {
            return false;
        }
        SkuSupply skuSupply = (SkuSupply) obj;
        return Intrinsics.LJFF(this.skuId, skuSupply.skuId) && Intrinsics.LJFF(this.productId, skuSupply.productId) && Intrinsics.LJFF(this.sellerId, skuSupply.sellerId);
    }

    public final int hashCode() {
        String str = this.skuId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.productId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.sellerId;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SkuSupply(skuId=");
        sbLIZ.append(this.skuId);
        sbLIZ.append(", productId=");
        sbLIZ.append(this.productId);
        sbLIZ.append(", sellerId=");
        sbLIZ.append(this.sellerId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.skuId);
        parcel.writeString(this.productId);
        parcel.writeString(this.sellerId);
    }

    public SkuSupply(String str, String str2, String str3) {
        this.skuId = str;
        this.productId = str2;
        this.sellerId = str3;
    }
}
