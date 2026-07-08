package com.ss.android.ugc.aweme.creative.model.product;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.product.ProductRecommendModel;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public final class ProductRecommendModel implements Parcelable {
    public static final Parcelable.Creator<ProductRecommendModel> CREATOR = new Parcelable.Creator<ProductRecommendModel>() { // from class: X.0nXL
        @Override // android.os.Parcelable.Creator
        public final ProductRecommendModel createFromParcel(Parcel parcel) {
            return new ProductRecommendModel(parcel.readString(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final ProductRecommendModel[] newArray(int i) {
            return new ProductRecommendModel[i];
        }
    };

    @C09CT("product_id_list")
    public List<String> productIdList;

    @C09CT("recommend_id")
    public String recommendId;

    public ProductRecommendModel() {
        this(null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.recommendId);
        parcel.writeStringList(this.productIdList);
    }

    public ProductRecommendModel(String str, List<String> list) {
        this.recommendId = str;
        this.productIdList = list;
    }
}
