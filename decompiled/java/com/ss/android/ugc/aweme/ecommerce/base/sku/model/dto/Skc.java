package com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto;

import X.C09CT;
import X.C624302c5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPrice;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.ProductLinkProperty;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.Skc;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class Skc implements Parcelable {

    @C09CT("pdp_button_area_id")
    public String bottomAreaId;

    @C09CT("color_block_image")
    public Image colorBlockImage;

    @C09CT("out_of_stock_warning")
    public String outOfStockWarning;

    @C09CT("price")
    public ProductPrice price;

    @C09CT("product_link")
    public ProductLinkProperty productLinkProperties;

    @C09CT("skc_id")
    public String skcId;

    @C09CT("skc_images")
    public List<Image> skcImages;

    @C09CT("skc_name")
    public String skcName;

    @C09CT("skc_status")
    public Integer skcStatus;

    @C09CT("skc_stock")
    public int skcStock;

    @C09CT("sku_ids")
    public List<String> skuIds;
    public static final C624302c5 Companion = new Object() { // from class: X.02c5
    };
    public static final Parcelable.Creator<Skc> CREATOR = new Parcelable.Creator<Skc>() { // from class: X.02c4
        @Override // android.os.Parcelable.Creator
        public final Skc createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Integer numValueOf;
            ProductPrice productPriceCreateFromParcel;
            String string = parcel.readString();
            String string2 = parcel.readString();
            Image image = (Image) parcel.readParcelable(Skc.class.getClassLoader());
            ProductLinkProperty productLinkPropertyCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readParcelable(Skc.class.getClassLoader()));
                }
            }
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            int i3 = parcel.readInt();
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                productPriceCreateFromParcel = null;
            } else {
                productPriceCreateFromParcel = ProductPrice.CREATOR.createFromParcel(parcel);
            }
            ProductPrice productPrice = productPriceCreateFromParcel;
            String string4 = parcel.readString();
            if (parcel.readInt() != 0) {
                productLinkPropertyCreateFromParcel = ProductLinkProperty.CREATOR.createFromParcel(parcel);
            }
            return new Skc(string, string2, image, arrayList, arrayListCreateStringArrayList, i3, numValueOf, string3, productPrice, string4, productLinkPropertyCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final Skc[] newArray(int i) {
            return new Skc[i];
        }
    };
    public static final int $stable = 8;

    public Skc() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Skc)) {
            return false;
        }
        Skc skc = (Skc) obj;
        return Intrinsics.LJFF(this.skcId, skc.skcId) && Intrinsics.LJFF(this.skcName, skc.skcName) && Intrinsics.LJFF(this.colorBlockImage, skc.colorBlockImage) && Intrinsics.LJFF(this.skcImages, skc.skcImages) && Intrinsics.LJFF(this.skuIds, skc.skuIds) && this.skcStock == skc.skcStock && Intrinsics.LJFF(this.skcStatus, skc.skcStatus) && Intrinsics.LJFF(this.outOfStockWarning, skc.outOfStockWarning) && Intrinsics.LJFF(this.price, skc.price) && Intrinsics.LJFF(this.bottomAreaId, skc.bottomAreaId) && Intrinsics.LJFF(this.productLinkProperties, skc.productLinkProperties);
    }

    public final int hashCode() {
        String str = this.skcId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.skcName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Image image = this.colorBlockImage;
        int iHashCode3 = (iHashCode2 + (image == null ? 0 : image.hashCode())) * 31;
        List<Image> list = this.skcImages;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.skuIds;
        int iHashCode5 = (((iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31) + this.skcStock) * 31;
        Integer num = this.skcStatus;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.outOfStockWarning;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ProductPrice productPrice = this.price;
        int iHashCode8 = (iHashCode7 + (productPrice == null ? 0 : productPrice.hashCode())) * 31;
        String str4 = this.bottomAreaId;
        int iHashCode9 = (iHashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        ProductLinkProperty productLinkProperty = this.productLinkProperties;
        return iHashCode9 + (productLinkProperty != null ? productLinkProperty.hashCode() : 0);
    }

    public final String toString() {
        return "Skc(skcId=" + this.skcId + ", skcName=" + this.skcName + ", colorBlockImage=" + this.colorBlockImage + ", skcImages=" + this.skcImages + ", skuIds=" + this.skuIds + ", skcStock=" + this.skcStock + ", skcStatus=" + this.skcStatus + ", outOfStockWarning=" + this.outOfStockWarning + ", price=" + this.price + ", bottomAreaId=" + this.bottomAreaId + ", productLinkProperties=" + this.productLinkProperties + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.skcId);
        parcel.writeString(this.skcName);
        parcel.writeParcelable(this.colorBlockImage, i);
        List<Image> list = this.skcImages;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<Image> it2 = list.iterator();
            while (it2.hasNext()) {
                parcel.writeParcelable(it2.next(), i);
            }
        }
        parcel.writeStringList(this.skuIds);
        parcel.writeInt(this.skcStock);
        Integer num = this.skcStatus;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.outOfStockWarning);
        ProductPrice productPrice = this.price;
        if (productPrice == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            productPrice.writeToParcel(parcel, i);
        }
        parcel.writeString(this.bottomAreaId);
        ProductLinkProperty productLinkProperty = this.productLinkProperties;
        if (productLinkProperty == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            productLinkProperty.writeToParcel(parcel, i);
        }
    }

    public Skc(String str, String str2, Image image, List<Image> list, List<String> list2, int i, Integer num, String str3, ProductPrice productPrice, String str4, ProductLinkProperty productLinkProperty) {
        this.skcId = str;
        this.skcName = str2;
        this.colorBlockImage = image;
        this.skcImages = list;
        this.skuIds = list2;
        this.skcStock = i;
        this.skcStatus = num;
        this.outOfStockWarning = str3;
        this.price = productPrice;
        this.bottomAreaId = str4;
        this.productLinkProperties = productLinkProperty;
    }
}
