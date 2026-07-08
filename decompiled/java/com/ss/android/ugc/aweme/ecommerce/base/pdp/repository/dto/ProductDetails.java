package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductDetails;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class ProductDetails implements Parcelable {

    @C09CT("content")
    public final List<String> content;

    @C09CT("image")
    public final Image image;

    @C09CT("text")
    public final String text;

    @C09CT("type")
    public final String type;
    public static final Parcelable.Creator<ProductDetails> CREATOR = new Parcelable.Creator<ProductDetails>() { // from class: X.0mgS
        @Override // android.os.Parcelable.Creator
        public final ProductDetails createFromParcel(Parcel parcel) {
            return new ProductDetails(parcel.readString(), (Image) parcel.readParcelable(ProductDetails.class.getClassLoader()), parcel.readString(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final ProductDetails[] newArray(int i) {
            return new ProductDetails[i];
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
        if (!(obj instanceof ProductDetails)) {
            return false;
        }
        ProductDetails productDetails = (ProductDetails) obj;
        return Intrinsics.LJFF(this.type, productDetails.type) && Intrinsics.LJFF(this.image, productDetails.image) && Intrinsics.LJFF(this.text, productDetails.text) && Intrinsics.LJFF(this.content, productDetails.content);
    }

    public final int hashCode() {
        String str = this.type;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Image image = this.image;
        int iHashCode2 = (iHashCode + (image == null ? 0 : image.hashCode())) * 31;
        String str2 = this.text;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list = this.content;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ProductDetails(type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", image=");
        sbLIZ.append(this.image);
        sbLIZ.append(", text=");
        sbLIZ.append(this.text);
        sbLIZ.append(", content=");
        sbLIZ.append(this.content);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.type);
        parcel.writeParcelable(this.image, i);
        parcel.writeString(this.text);
        parcel.writeStringList(this.content);
    }

    public ProductDetails(String str, Image image, String str2, List<String> list) {
        this.type = str;
        this.image = image;
        this.text = str2;
        this.content = list;
    }
}
