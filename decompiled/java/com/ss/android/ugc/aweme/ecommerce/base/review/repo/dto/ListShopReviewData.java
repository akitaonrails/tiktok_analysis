package com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ListShopReviewData;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewCardUI;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewFilterStruct;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ShopReviewItemStruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ListShopReviewData implements Parcelable {

    @C09CT("has_more")
    public final Boolean hasMore;

    @C09CT("next_cursor")
    public final Integer nextCursor;

    @C09CT("rating_filters")
    public final List<ReviewFilterStruct> ratingFilters;

    @C09CT("review_card_ui_ab")
    public final ReviewCardUI reviewABTest;

    @C09CT("review_count")
    public final Integer reviewCount;

    @C09CT("review_count_str")
    public final String reviewCountStr;

    @C09CT("review_count_str_v2")
    public final String reviewCountStrV2;

    @C09CT("review_filters")
    public final List<ReviewFilterStruct> reviewFilter;

    @C09CT("review_items")
    public final List<ShopReviewItemStruct> reviewItems;

    @C09CT("top_text")
    public final String topText;
    public static final Parcelable.Creator<ListShopReviewData> CREATOR = new Parcelable.Creator<ListShopReviewData>() { // from class: X.04II
        @Override // android.os.Parcelable.Creator
        public final ListShopReviewData createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            boolean z;
            Boolean boolValueOf;
            Integer numValueOf;
            ArrayList arrayList2;
            Integer numValueOf2;
            ArrayList arrayList3;
            ReviewCardUI reviewCardUICreateFromParcel = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(ShopReviewItemStruct.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i3 = parcel.readInt();
                arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList2.add(ReviewFilterStruct.CREATOR.createFromParcel(parcel));
                }
            }
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf2 = null;
            } else {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int i5 = parcel.readInt();
                arrayList3 = new ArrayList(i5);
                for (int i6 = 0; i6 != i5; i6++) {
                    arrayList3.add(ReviewFilterStruct.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() != 0) {
                reviewCardUICreateFromParcel = ReviewCardUI.CREATOR.createFromParcel(parcel);
            }
            return new ListShopReviewData(arrayList, boolValueOf, numValueOf, arrayList2, string, numValueOf2, string2, string3, arrayList3, reviewCardUICreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ListShopReviewData[] newArray(int i) {
            return new ListShopReviewData[i];
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
        if (!(obj instanceof ListShopReviewData)) {
            return false;
        }
        ListShopReviewData listShopReviewData = (ListShopReviewData) obj;
        return Intrinsics.LJFF(this.reviewItems, listShopReviewData.reviewItems) && Intrinsics.LJFF(this.hasMore, listShopReviewData.hasMore) && Intrinsics.LJFF(this.nextCursor, listShopReviewData.nextCursor) && Intrinsics.LJFF(this.reviewFilter, listShopReviewData.reviewFilter) && Intrinsics.LJFF(this.topText, listShopReviewData.topText) && Intrinsics.LJFF(this.reviewCount, listShopReviewData.reviewCount) && Intrinsics.LJFF(this.reviewCountStr, listShopReviewData.reviewCountStr) && Intrinsics.LJFF(this.reviewCountStrV2, listShopReviewData.reviewCountStrV2) && Intrinsics.LJFF(this.ratingFilters, listShopReviewData.ratingFilters) && Intrinsics.LJFF(this.reviewABTest, listShopReviewData.reviewABTest);
    }

    public final int hashCode() {
        List<ShopReviewItemStruct> list = this.reviewItems;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Boolean bool = this.hasMore;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.nextCursor;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        List<ReviewFilterStruct> list2 = this.reviewFilter;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.topText;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.reviewCount;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.reviewCountStr;
        int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.reviewCountStrV2;
        int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<ReviewFilterStruct> list3 = this.ratingFilters;
        int iHashCode9 = (iHashCode8 + (list3 == null ? 0 : list3.hashCode())) * 31;
        ReviewCardUI reviewCardUI = this.reviewABTest;
        return iHashCode9 + (reviewCardUI != null ? reviewCardUI.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ListShopReviewData(reviewItems=");
        sbLIZ.append(this.reviewItems);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.hasMore);
        sbLIZ.append(", nextCursor=");
        sbLIZ.append(this.nextCursor);
        sbLIZ.append(", reviewFilter=");
        sbLIZ.append(this.reviewFilter);
        sbLIZ.append(", topText=");
        sbLIZ.append(this.topText);
        sbLIZ.append(", reviewCount=");
        sbLIZ.append(this.reviewCount);
        sbLIZ.append(", reviewCountStr=");
        sbLIZ.append(this.reviewCountStr);
        sbLIZ.append(", reviewCountStrV2=");
        sbLIZ.append(this.reviewCountStrV2);
        sbLIZ.append(", ratingFilters=");
        sbLIZ.append(this.ratingFilters);
        sbLIZ.append(", reviewABTest=");
        sbLIZ.append(this.reviewABTest);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<ShopReviewItemStruct> list = this.reviewItems;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<ShopReviewItemStruct> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        Boolean bool = this.hasMore;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Integer num = this.nextCursor;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        List<ReviewFilterStruct> list2 = this.reviewFilter;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            Iterator<ReviewFilterStruct> it3 = list2.iterator();
            while (it3.hasNext()) {
                it3.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.topText);
        Integer num2 = this.reviewCount;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.reviewCountStr);
        parcel.writeString(this.reviewCountStrV2);
        List<ReviewFilterStruct> list3 = this.ratingFilters;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list3.size());
            Iterator<ReviewFilterStruct> it4 = list3.iterator();
            while (it4.hasNext()) {
                it4.next().writeToParcel(parcel, i);
            }
        }
        ReviewCardUI reviewCardUI = this.reviewABTest;
        if (reviewCardUI == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(reviewCardUI.reviewCardUnificationVersion);
        }
    }

    public ListShopReviewData(List<ShopReviewItemStruct> list, Boolean bool, Integer num, List<ReviewFilterStruct> list2, String str, Integer num2, String str2, String str3, List<ReviewFilterStruct> list3, ReviewCardUI reviewCardUI) {
        this.reviewItems = list;
        this.hasMore = bool;
        this.nextCursor = num;
        this.reviewFilter = list2;
        this.topText = str;
        this.reviewCount = num2;
        this.reviewCountStr = str2;
        this.reviewCountStrV2 = str3;
        this.ratingFilters = list3;
        this.reviewABTest = reviewCardUI;
    }
}
