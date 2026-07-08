package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.RelateProduct;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class RelateProduct implements Parcelable {

    @C09CT("images")
    public final List<Image> images;

    @C09CT("price")
    public final String price;

    @C09CT("product_id")
    public final String productID;
    public static final Parcelable.Creator<RelateProduct> CREATOR = new Parcelable.Creator<RelateProduct>() { // from class: X.04GF
        @Override // android.os.Parcelable.Creator
        public final RelateProduct createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readParcelable(RelateProduct.class.getClassLoader()));
                }
            }
            return new RelateProduct(string, string2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final RelateProduct[] newArray(int i) {
            return new RelateProduct[i];
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
        if (!(obj instanceof RelateProduct)) {
            return false;
        }
        RelateProduct relateProduct = (RelateProduct) obj;
        return Intrinsics.LJFF(this.productID, relateProduct.productID) && Intrinsics.LJFF(this.price, relateProduct.price) && Intrinsics.LJFF(this.images, relateProduct.images);
    }

    public final int hashCode() {
        String str = this.productID;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.price;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<Image> list = this.images;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RelateProduct(productID=");
        sbLIZ.append(this.productID);
        sbLIZ.append(", price=");
        sbLIZ.append(this.price);
        sbLIZ.append(", images=");
        sbLIZ.append(this.images);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.productID);
        parcel.writeString(this.price);
        List<Image> list = this.images;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator<Image> it2 = list.iterator();
        while (it2.hasNext()) {
            parcel.writeParcelable(it2.next(), i);
        }
    }

    public RelateProduct(String str, String str2, List<Image> list) {
        this.productID = str;
        this.price = str2;
        this.images = list;
    }
}
