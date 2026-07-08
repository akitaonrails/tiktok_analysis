package com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductUnavailableInfo;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuUnavailableInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class SkuUnavailableInfo implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<SkuUnavailableInfo> CREATOR = new Parcelable.Creator<SkuUnavailableInfo>() { // from class: X.02c3
        @Override // android.os.Parcelable.Creator
        public final SkuUnavailableInfo createFromParcel(Parcel parcel) {
            Integer numValueOf;
            ProductUnavailableInfo productUnavailableInfoCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() != 0) {
                productUnavailableInfoCreateFromParcel = ProductUnavailableInfo.CREATOR.createFromParcel(parcel);
            }
            return new SkuUnavailableInfo(numValueOf, productUnavailableInfoCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final SkuUnavailableInfo[] newArray(int i) {
            return new SkuUnavailableInfo[i];
        }
    };

    @C09CT("unavailable_info_id")
    public Integer pageStatus;

    @C09CT("unavailable_info")
    public ProductUnavailableInfo unavailableInfo;

    public SkuUnavailableInfo() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SkuUnavailableInfo)) {
            return false;
        }
        SkuUnavailableInfo skuUnavailableInfo = (SkuUnavailableInfo) obj;
        return Intrinsics.LJFF(this.pageStatus, skuUnavailableInfo.pageStatus) && Intrinsics.LJFF(this.unavailableInfo, skuUnavailableInfo.unavailableInfo);
    }

    public final int hashCode() {
        Integer num = this.pageStatus;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        ProductUnavailableInfo productUnavailableInfo = this.unavailableInfo;
        return iHashCode + (productUnavailableInfo != null ? productUnavailableInfo.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SkuUnavailableInfo(pageStatus=");
        sbLIZ.append(this.pageStatus);
        sbLIZ.append(", unavailableInfo=");
        sbLIZ.append(this.unavailableInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.pageStatus;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        ProductUnavailableInfo productUnavailableInfo = this.unavailableInfo;
        if (productUnavailableInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            productUnavailableInfo.writeToParcel(parcel, i);
        }
    }

    public SkuUnavailableInfo(Integer num, ProductUnavailableInfo productUnavailableInfo) {
        this.pageStatus = num;
        this.unavailableInfo = productUnavailableInfo;
    }
}
