package com.ss.android.ugc.aweme.ecommerce.service.cartservice;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.PlatformLinkInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class PlatformLinkInfo implements Parcelable {
    public static final Parcelable.Creator<PlatformLinkInfo> CREATOR = new Parcelable.Creator<PlatformLinkInfo>() { // from class: X.02oO
        @Override // android.os.Parcelable.Creator
        public final PlatformLinkInfo createFromParcel(Parcel parcel) {
            return new PlatformLinkInfo(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PlatformLinkInfo[] newArray(int i) {
            return new PlatformLinkInfo[i];
        }
    };

    @C09CT("product_id")
    public String productId;

    @C09CT("seller_id")
    public String sellerId;

    @C09CT("sku_id")
    public String skuId;

    public PlatformLinkInfo() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlatformLinkInfo)) {
            return false;
        }
        PlatformLinkInfo platformLinkInfo = (PlatformLinkInfo) obj;
        return Intrinsics.LJFF(this.skuId, platformLinkInfo.skuId) && Intrinsics.LJFF(this.productId, platformLinkInfo.productId) && Intrinsics.LJFF(this.sellerId, platformLinkInfo.sellerId);
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
        sbLIZ.append("PlatformLinkInfo(skuId=");
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

    public PlatformLinkInfo(String str, String str2, String str3) {
        this.skuId = str;
        this.productId = str2;
        this.sellerId = str3;
    }
}
