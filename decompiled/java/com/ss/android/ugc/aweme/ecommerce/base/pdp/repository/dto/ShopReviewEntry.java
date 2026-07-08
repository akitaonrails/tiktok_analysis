package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShopReviewEntry;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewFilterStruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ShopReviewEntry implements Parcelable {

    @C09CT("review_count")
    public final Integer reviewCount;

    @C09CT("review_count_str")
    public final String reviewCountStr;

    @C09CT("review_filters")
    public final List<ReviewFilterStruct> reviewFilters;

    @C09CT("shop_schema")
    public final String shopSchema;

    @C09CT("third_party_review_cnt")
    public final Integer thirdPartyReviewCnt;
    public static final Parcelable.Creator<ShopReviewEntry> CREATOR = new Parcelable.Creator<ShopReviewEntry>() { // from class: X.04IK
        @Override // android.os.Parcelable.Creator
        public final ShopReviewEntry createFromParcel(Parcel parcel) {
            Integer numValueOf;
            ArrayList arrayList;
            Integer numValueOf2 = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(ReviewFilterStruct.CREATOR.createFromParcel(parcel));
                }
            }
            String string2 = parcel.readString();
            if (parcel.readInt() != 0) {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            return new ShopReviewEntry(numValueOf, string, arrayList, string2, numValueOf2);
        }

        @Override // android.os.Parcelable.Creator
        public final ShopReviewEntry[] newArray(int i) {
            return new ShopReviewEntry[i];
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
        if (!(obj instanceof ShopReviewEntry)) {
            return false;
        }
        ShopReviewEntry shopReviewEntry = (ShopReviewEntry) obj;
        return Intrinsics.LJFF(this.reviewCount, shopReviewEntry.reviewCount) && Intrinsics.LJFF(this.reviewCountStr, shopReviewEntry.reviewCountStr) && Intrinsics.LJFF(this.reviewFilters, shopReviewEntry.reviewFilters) && Intrinsics.LJFF(this.shopSchema, shopReviewEntry.shopSchema) && Intrinsics.LJFF(this.thirdPartyReviewCnt, shopReviewEntry.thirdPartyReviewCnt);
    }

    public final int hashCode() {
        Integer num = this.reviewCount;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.reviewCountStr;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<ReviewFilterStruct> list = this.reviewFilters;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.shopSchema;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.thirdPartyReviewCnt;
        return iHashCode4 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShopReviewEntry(reviewCount=");
        sbLIZ.append(this.reviewCount);
        sbLIZ.append(", reviewCountStr=");
        sbLIZ.append(this.reviewCountStr);
        sbLIZ.append(", reviewFilters=");
        sbLIZ.append(this.reviewFilters);
        sbLIZ.append(", shopSchema=");
        sbLIZ.append(this.shopSchema);
        sbLIZ.append(", thirdPartyReviewCnt=");
        sbLIZ.append(this.thirdPartyReviewCnt);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.reviewCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.reviewCountStr);
        List<ReviewFilterStruct> list = this.reviewFilters;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<ReviewFilterStruct> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.shopSchema);
        Integer num2 = this.thirdPartyReviewCnt;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
    }

    public ShopReviewEntry(Integer num, String str, List<ReviewFilterStruct> list, String str2, Integer num2) {
        this.reviewCount = num;
        this.reviewCountStr = str;
        this.reviewFilters = list;
        this.shopSchema = str2;
        this.thirdPartyReviewCnt = num2;
    }
}
