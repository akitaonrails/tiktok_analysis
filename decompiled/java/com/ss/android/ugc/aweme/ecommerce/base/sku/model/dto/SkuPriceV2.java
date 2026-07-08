package com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SinglePriceItem;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuPriceV2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class SkuPriceV2 implements Parcelable {

    @C09CT("deposit_fee_desc")
    public String depositFeeDesc;

    @C09CT("min_price")
    public SinglePriceItem minPrice;

    @C09CT("price_type")
    public int priceType;
    public static final Parcelable.Creator<SkuPriceV2> CREATOR = new Parcelable.Creator<SkuPriceV2>() { // from class: X.02oZ
        @Override // android.os.Parcelable.Creator
        public final SkuPriceV2 createFromParcel(Parcel parcel) {
            return new SkuPriceV2(parcel.readInt(), SinglePriceItem.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SkuPriceV2[] newArray(int i) {
            return new SkuPriceV2[i];
        }
    };
    public static final int $stable = 8;

    public SkuPriceV2() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SkuPriceV2)) {
            return false;
        }
        SkuPriceV2 skuPriceV2 = (SkuPriceV2) obj;
        return this.priceType == skuPriceV2.priceType && Intrinsics.LJFF(this.minPrice, skuPriceV2.minPrice) && Intrinsics.LJFF(this.depositFeeDesc, skuPriceV2.depositFeeDesc);
    }

    public final int hashCode() {
        int iHashCode = ((this.priceType * 31) + this.minPrice.hashCode()) * 31;
        String str = this.depositFeeDesc;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SkuPriceV2(priceType=");
        sbLIZ.append(this.priceType);
        sbLIZ.append(", minPrice=");
        sbLIZ.append(this.minPrice);
        sbLIZ.append(", depositFeeDesc=");
        sbLIZ.append(this.depositFeeDesc);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.priceType);
        this.minPrice.writeToParcel(parcel, i);
        parcel.writeString(this.depositFeeDesc);
    }

    public SkuPriceV2(int i, SinglePriceItem singlePriceItem, String str) {
        this.priceType = i;
        this.minPrice = singlePriceItem;
        this.depositFeeDesc = str;
    }
}
