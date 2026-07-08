package com.ss.android.ugc.aweme.ecommerce.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.model.PlatformLinkBasedItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class PlatformLinkBasedItem implements Parcelable {
    public static final Parcelable.Creator<PlatformLinkBasedItem> CREATOR = new Parcelable.Creator<PlatformLinkBasedItem>() { // from class: X.03k5
        @Override // android.os.Parcelable.Creator
        public final PlatformLinkBasedItem createFromParcel(Parcel parcel) {
            return new PlatformLinkBasedItem(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PlatformLinkBasedItem[] newArray(int i) {
            return new PlatformLinkBasedItem[i];
        }
    };

    @C09CT("product_id")
    public final String productId;

    @C09CT("seller_id")
    public final String sellerId;

    @C09CT("sku_id")
    public final String skuId;

    public PlatformLinkBasedItem() {
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
        if (!(obj instanceof PlatformLinkBasedItem)) {
            return false;
        }
        PlatformLinkBasedItem platformLinkBasedItem = (PlatformLinkBasedItem) obj;
        return Intrinsics.LJFF(this.skuId, platformLinkBasedItem.skuId) && Intrinsics.LJFF(this.productId, platformLinkBasedItem.productId) && Intrinsics.LJFF(this.sellerId, platformLinkBasedItem.sellerId);
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
        sbLIZ.append("PlatformLinkBasedItem(skuId=");
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

    public PlatformLinkBasedItem(String str, String str2, String str3) {
        this.skuId = str;
        this.productId = str2;
        this.sellerId = str3;
    }
}
