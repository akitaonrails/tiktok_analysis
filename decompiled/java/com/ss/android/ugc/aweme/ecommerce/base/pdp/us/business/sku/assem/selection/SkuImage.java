package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.assem.selection;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.assem.selection.SkuImage;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class SkuImage implements Parcelable {

    @C09CT("sku_image")
    public final Image skuImage;

    @C09CT("sku_prop_value_ids")
    public final List<String> skuPropValueIds;
    public static final Parcelable.Creator<SkuImage> CREATOR = new Parcelable.Creator<SkuImage>() { // from class: X.0mgW
        @Override // android.os.Parcelable.Creator
        public final SkuImage createFromParcel(Parcel parcel) {
            return new SkuImage(parcel.createStringArrayList(), (Image) parcel.readParcelable(SkuImage.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final SkuImage[] newArray(int i) {
            return new SkuImage[i];
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
        if (!(obj instanceof SkuImage)) {
            return false;
        }
        SkuImage skuImage = (SkuImage) obj;
        return Intrinsics.LJFF(this.skuPropValueIds, skuImage.skuPropValueIds) && Intrinsics.LJFF(this.skuImage, skuImage.skuImage);
    }

    public final int hashCode() {
        List<String> list = this.skuPropValueIds;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Image image = this.skuImage;
        return iHashCode + (image != null ? image.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SkuImage(skuPropValueIds=");
        sbLIZ.append(this.skuPropValueIds);
        sbLIZ.append(", skuImage=");
        sbLIZ.append(this.skuImage);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.skuPropValueIds);
        parcel.writeParcelable(this.skuImage, i);
    }

    public SkuImage(List<String> list, Image image) {
        this.skuPropValueIds = list;
        this.skuImage = image;
    }
}
