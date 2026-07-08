package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.FeedbackVoteData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductDetailReview;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.GalleryReview;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.PlatformLinkInfo;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewAspectPercentageCard;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewCardUI;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewFilterStruct;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewImageItem;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewItemStruct;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewSubTitle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ProductDetailReview implements Parcelable {

    @C09CT("da_info")
    public final String daInfo;

    @C09CT("feedback_vote_data")
    public final FeedbackVoteData feedbackVoteData;

    @C09CT("gallery_review")
    public final GalleryReview galleryReview;

    @C09CT("has_more")
    public final Boolean hasMore;
    public final PlatformLinkInfo platformLinkInfo;

    @C09CT("product_rating")
    public final Float rating;

    @C09CT("rating_policy_page_schema")
    public final String ratingPolicyPageSchema;

    @C09CT("review_card_ui_ab")
    public final ReviewCardUI reviewABTest;

    @C09CT("review_aspect_percentage_cards")
    public final List<ReviewAspectPercentageCard> reviewAspectPercentageCards;

    @C09CT("review_count")
    public final Integer reviewCount;

    @C09CT("review_count_str")
    public final String reviewCountStr;

    @C09CT("review_count_str_v2")
    public final String reviewCountStrV2;

    @C09CT("review_filters")
    public final List<ReviewFilterStruct> reviewFilters;

    @C09CT("review_image_items")
    public final List<ReviewImageItem> reviewImageItems;

    @C09CT("review_items")
    public final List<ReviewItemStruct> reviewItems;

    @C09CT("review_page_request_params")
    public final String reviewPageRequestParams;

    @C09CT("subtitle")
    public final ReviewSubTitle subTitle;

    @C09CT("third_party_review_cnt")
    public final Integer thirdPartyReviewCnt;
    public static final Parcelable.Creator<ProductDetailReview> CREATOR = new Parcelable.Creator<ProductDetailReview>() { // from class: X.04IG
        @Override // android.os.Parcelable.Creator
        public final ProductDetailReview createFromParcel(Parcel parcel) {
            Float fValueOf;
            Integer numValueOf;
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            ArrayList arrayList4;
            ReviewCardUI reviewCardUICreateFromParcel;
            Boolean boolValueOf;
            PlatformLinkInfo platformLinkInfoCreateFromParcel;
            Integer numValueOf2;
            ReviewSubTitle reviewSubTitleCreateFromParcel;
            GalleryReview galleryReviewCreateFromParcel;
            FeedbackVoteData feedbackVoteDataCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                fValueOf = null;
            } else {
                fValueOf = Float.valueOf(parcel.readFloat());
            }
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            boolean z = false;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(ReviewItemStruct.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i3 = parcel.readInt();
                arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList2.add(ReviewImageItem.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int i5 = parcel.readInt();
                arrayList3 = new ArrayList(i5);
                for (int i6 = 0; i6 != i5; i6++) {
                    arrayList3.add(ReviewFilterStruct.CREATOR.createFromParcel(parcel));
                }
            }
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList4 = null;
            } else {
                int i7 = parcel.readInt();
                arrayList4 = new ArrayList(i7);
                for (int i8 = 0; i8 != i7; i8++) {
                    arrayList4.add(ReviewAspectPercentageCard.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                reviewCardUICreateFromParcel = null;
            } else {
                reviewCardUICreateFromParcel = ReviewCardUI.CREATOR.createFromParcel(parcel);
            }
            ReviewCardUI reviewCardUI = reviewCardUICreateFromParcel;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    z = true;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            if (parcel.readInt() == 0) {
                platformLinkInfoCreateFromParcel = null;
            } else {
                platformLinkInfoCreateFromParcel = PlatformLinkInfo.CREATOR.createFromParcel(parcel);
            }
            PlatformLinkInfo platformLinkInfo = platformLinkInfoCreateFromParcel;
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf2 = null;
            } else {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                reviewSubTitleCreateFromParcel = null;
            } else {
                reviewSubTitleCreateFromParcel = ReviewSubTitle.CREATOR.createFromParcel(parcel);
            }
            ReviewSubTitle reviewSubTitle = reviewSubTitleCreateFromParcel;
            if (parcel.readInt() == 0) {
                galleryReviewCreateFromParcel = null;
            } else {
                galleryReviewCreateFromParcel = GalleryReview.CREATOR.createFromParcel(parcel);
            }
            GalleryReview galleryReview = galleryReviewCreateFromParcel;
            String string4 = parcel.readString();
            if (parcel.readInt() != 0) {
                feedbackVoteDataCreateFromParcel = FeedbackVoteData.CREATOR.createFromParcel(parcel);
            }
            return new ProductDetailReview(fValueOf, numValueOf, arrayList, arrayList2, arrayList3, string, string2, arrayList4, reviewCardUI, boolValueOf, platformLinkInfo, string3, numValueOf2, reviewSubTitle, galleryReview, string4, feedbackVoteDataCreateFromParcel, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ProductDetailReview[] newArray(int i) {
            return new ProductDetailReview[i];
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
        if (!(obj instanceof ProductDetailReview)) {
            return false;
        }
        ProductDetailReview productDetailReview = (ProductDetailReview) obj;
        return Intrinsics.LJFF(this.rating, productDetailReview.rating) && Intrinsics.LJFF(this.reviewCount, productDetailReview.reviewCount) && Intrinsics.LJFF(this.reviewItems, productDetailReview.reviewItems) && Intrinsics.LJFF(this.reviewImageItems, productDetailReview.reviewImageItems) && Intrinsics.LJFF(this.reviewFilters, productDetailReview.reviewFilters) && Intrinsics.LJFF(this.reviewCountStr, productDetailReview.reviewCountStr) && Intrinsics.LJFF(this.reviewCountStrV2, productDetailReview.reviewCountStrV2) && Intrinsics.LJFF(this.reviewAspectPercentageCards, productDetailReview.reviewAspectPercentageCards) && Intrinsics.LJFF(this.reviewABTest, productDetailReview.reviewABTest) && Intrinsics.LJFF(this.hasMore, productDetailReview.hasMore) && Intrinsics.LJFF(this.platformLinkInfo, productDetailReview.platformLinkInfo) && Intrinsics.LJFF(this.daInfo, productDetailReview.daInfo) && Intrinsics.LJFF(this.thirdPartyReviewCnt, productDetailReview.thirdPartyReviewCnt) && Intrinsics.LJFF(this.subTitle, productDetailReview.subTitle) && Intrinsics.LJFF(this.galleryReview, productDetailReview.galleryReview) && Intrinsics.LJFF(this.ratingPolicyPageSchema, productDetailReview.ratingPolicyPageSchema) && Intrinsics.LJFF(this.feedbackVoteData, productDetailReview.feedbackVoteData) && Intrinsics.LJFF(this.reviewPageRequestParams, productDetailReview.reviewPageRequestParams);
    }

    public final int hashCode() {
        Float f = this.rating;
        int iHashCode = (f == null ? 0 : f.hashCode()) * 31;
        Integer num = this.reviewCount;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        List<ReviewItemStruct> list = this.reviewItems;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<ReviewImageItem> list2 = this.reviewImageItems;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<ReviewFilterStruct> list3 = this.reviewFilters;
        int iHashCode5 = (iHashCode4 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str = this.reviewCountStr;
        int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.reviewCountStrV2;
        int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<ReviewAspectPercentageCard> list4 = this.reviewAspectPercentageCards;
        int iHashCode8 = (iHashCode7 + (list4 == null ? 0 : list4.hashCode())) * 31;
        ReviewCardUI reviewCardUI = this.reviewABTest;
        int iHashCode9 = (iHashCode8 + (reviewCardUI == null ? 0 : reviewCardUI.hashCode())) * 31;
        Boolean bool = this.hasMore;
        int iHashCode10 = (iHashCode9 + (bool == null ? 0 : bool.hashCode())) * 31;
        PlatformLinkInfo platformLinkInfo = this.platformLinkInfo;
        int iHashCode11 = (iHashCode10 + (platformLinkInfo == null ? 0 : platformLinkInfo.hashCode())) * 31;
        String str3 = this.daInfo;
        int iHashCode12 = (iHashCode11 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num2 = this.thirdPartyReviewCnt;
        int iHashCode13 = (iHashCode12 + (num2 == null ? 0 : num2.hashCode())) * 31;
        ReviewSubTitle reviewSubTitle = this.subTitle;
        int iHashCode14 = (iHashCode13 + (reviewSubTitle == null ? 0 : reviewSubTitle.hashCode())) * 31;
        GalleryReview galleryReview = this.galleryReview;
        int iHashCode15 = (iHashCode14 + (galleryReview == null ? 0 : galleryReview.hashCode())) * 31;
        String str4 = this.ratingPolicyPageSchema;
        int iHashCode16 = (iHashCode15 + (str4 == null ? 0 : str4.hashCode())) * 31;
        FeedbackVoteData feedbackVoteData = this.feedbackVoteData;
        int iHashCode17 = (iHashCode16 + (feedbackVoteData == null ? 0 : feedbackVoteData.hashCode())) * 31;
        String str5 = this.reviewPageRequestParams;
        return iHashCode17 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        return "ProductDetailReview(rating=" + this.rating + ", reviewCount=" + this.reviewCount + ", reviewItems=" + this.reviewItems + ", reviewImageItems=" + this.reviewImageItems + ", reviewFilters=" + this.reviewFilters + ", reviewCountStr=" + this.reviewCountStr + ", reviewCountStrV2=" + this.reviewCountStrV2 + ", reviewAspectPercentageCards=" + this.reviewAspectPercentageCards + ", reviewABTest=" + this.reviewABTest + ", hasMore=" + this.hasMore + ", platformLinkInfo=" + this.platformLinkInfo + ", daInfo=" + this.daInfo + ", thirdPartyReviewCnt=" + this.thirdPartyReviewCnt + ", subTitle=" + this.subTitle + ", galleryReview=" + this.galleryReview + ", ratingPolicyPageSchema=" + this.ratingPolicyPageSchema + ", feedbackVoteData=" + this.feedbackVoteData + ", reviewPageRequestParams=" + this.reviewPageRequestParams + ')';
    }

    public static ProductDetailReview LIZ(ProductDetailReview productDetailReview, List list) {
        return new ProductDetailReview(productDetailReview.rating, productDetailReview.reviewCount, list, productDetailReview.reviewImageItems, productDetailReview.reviewFilters, productDetailReview.reviewCountStr, productDetailReview.reviewCountStrV2, productDetailReview.reviewAspectPercentageCards, productDetailReview.reviewABTest, productDetailReview.hasMore, productDetailReview.platformLinkInfo, productDetailReview.daInfo, productDetailReview.thirdPartyReviewCnt, productDetailReview.subTitle, productDetailReview.galleryReview, productDetailReview.ratingPolicyPageSchema, productDetailReview.feedbackVoteData, productDetailReview.reviewPageRequestParams);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Float f = this.rating;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f.floatValue());
        }
        Integer num = this.reviewCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        List<ReviewItemStruct> list = this.reviewItems;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<ReviewItemStruct> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        List<ReviewImageItem> list2 = this.reviewImageItems;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            Iterator<ReviewImageItem> it3 = list2.iterator();
            while (it3.hasNext()) {
                it3.next().writeToParcel(parcel, i);
            }
        }
        List<ReviewFilterStruct> list3 = this.reviewFilters;
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
        parcel.writeString(this.reviewCountStr);
        parcel.writeString(this.reviewCountStrV2);
        List<ReviewAspectPercentageCard> list4 = this.reviewAspectPercentageCards;
        if (list4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list4.size());
            Iterator<ReviewAspectPercentageCard> it5 = list4.iterator();
            while (it5.hasNext()) {
                it5.next().writeToParcel(parcel, i);
            }
        }
        ReviewCardUI reviewCardUI = this.reviewABTest;
        if (reviewCardUI == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(reviewCardUI.reviewCardUnificationVersion);
        }
        Boolean bool = this.hasMore;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        PlatformLinkInfo platformLinkInfo = this.platformLinkInfo;
        if (platformLinkInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            platformLinkInfo.writeToParcel(parcel, i);
        }
        parcel.writeString(this.daInfo);
        Integer num2 = this.thirdPartyReviewCnt;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        ReviewSubTitle reviewSubTitle = this.subTitle;
        if (reviewSubTitle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            reviewSubTitle.writeToParcel(parcel, i);
        }
        GalleryReview galleryReview = this.galleryReview;
        if (galleryReview == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            galleryReview.writeToParcel(parcel, i);
        }
        parcel.writeString(this.ratingPolicyPageSchema);
        FeedbackVoteData feedbackVoteData = this.feedbackVoteData;
        if (feedbackVoteData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            feedbackVoteData.writeToParcel(parcel, i);
        }
        parcel.writeString(this.reviewPageRequestParams);
    }

    public ProductDetailReview(Float f, Integer num, List<ReviewItemStruct> list, List<ReviewImageItem> list2, List<ReviewFilterStruct> list3, String str, String str2, List<ReviewAspectPercentageCard> list4, ReviewCardUI reviewCardUI, Boolean bool, PlatformLinkInfo platformLinkInfo, String str3, Integer num2, ReviewSubTitle reviewSubTitle, GalleryReview galleryReview, String str4, FeedbackVoteData feedbackVoteData, String str5) {
        this.rating = f;
        this.reviewCount = num;
        this.reviewItems = list;
        this.reviewImageItems = list2;
        this.reviewFilters = list3;
        this.reviewCountStr = str;
        this.reviewCountStrV2 = str2;
        this.reviewAspectPercentageCards = list4;
        this.reviewABTest = reviewCardUI;
        this.hasMore = bool;
        this.platformLinkInfo = platformLinkInfo;
        this.daInfo = str3;
        this.thirdPartyReviewCnt = num2;
        this.subTitle = reviewSubTitle;
        this.galleryReview = galleryReview;
        this.ratingPolicyPageSchema = str4;
        this.feedbackVoteData = feedbackVoteData;
        this.reviewPageRequestParams = str5;
    }
}
