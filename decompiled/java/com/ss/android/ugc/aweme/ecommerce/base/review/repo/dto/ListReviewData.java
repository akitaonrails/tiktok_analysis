package com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkRichText;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShopReviewEntry;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ListReviewData;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.PlatformLinkInfo;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewAspectPercentageCard;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewCardUI;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewFilterStruct;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewItemStruct;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.TopTextDisclaimer;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ListReviewData implements Parcelable {

    @C09CT("bottom_filter_local_reviews")
    public final ReviewFilterStruct bottomFilterLocalReviews;

    @C09CT("bottom_filter_other_countries")
    public final ReviewFilterStruct bottomFilterOtherCountries;

    @C09CT("has_more")
    public final Boolean hasMore;

    @C09CT("next_cursor")
    public final Integer nextCursor;

    @C09CT("no_allow_feedback")
    public final Boolean noAllowFeedback;

    @C09CT("platform_link_info")
    public final PlatformLinkInfo platformLinkInfo;

    @C09CT("product_rating")
    public final Float rating;

    @C09CT("rating_filters")
    public final List<ReviewFilterStruct> ratingFilters;

    @C09CT("ratings_link")
    public final String ratingsLink;

    @C09CT("review_card_ui_ab")
    public final ReviewCardUI reviewABTest;

    @C09CT("review_aspect_percentage_cards")
    public final List<ReviewAspectPercentageCard> reviewAspectPercentageCard;

    @C09CT("review_count")
    public final Integer reviewCount;

    @C09CT("review_count_str")
    public final String reviewCountStr;

    @C09CT("review_count_str_v2")
    public final String reviewCountStrV2;

    @C09CT("review_filters")
    public final List<ReviewFilterStruct> reviewFilter;

    @C09CT("review_items")
    public final List<ReviewItemStruct> reviewItems;

    @C09CT("review_items_other_countries")
    public final List<ReviewItemStruct> reviewItemsOtherCountries;

    @C09CT("review_other_countries_disclaimer")
    public final LinkRichText reviewOtherCountriesDisclaimer;

    @C09CT("review_policy_info")
    public final ECRichText reviewPolicy;

    @C09CT("shop_review_entry")
    public final ShopReviewEntry shopReviewEntry;

    @C09CT("third_party_review_cnt")
    public final Integer thirdPartyReviewCnt;

    @C09CT("top_text")
    public final String topText;

    @C09CT("top_text_disclaimer")
    public final TopTextDisclaimer topTextDisclaimer;

    @C09CT("top_text_local")
    public final String topTextLocal;

    @C09CT("top_text_other_countries")
    public final String topTextOtherCountries;
    public static final Parcelable.Creator<ListReviewData> CREATOR = new Parcelable.Creator<ListReviewData>() { // from class: X.04IF
        @Override // android.os.Parcelable.Creator
        public final ListReviewData createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            boolean z;
            Boolean boolValueOf;
            Integer numValueOf;
            ArrayList arrayList3;
            Boolean boolValueOf2;
            Float fValueOf;
            TopTextDisclaimer topTextDisclaimerCreateFromParcel;
            ArrayList arrayList4;
            Integer numValueOf2;
            ArrayList arrayList5;
            ShopReviewEntry shopReviewEntryCreateFromParcel;
            ReviewCardUI reviewCardUICreateFromParcel;
            ReviewFilterStruct reviewFilterStructCreateFromParcel;
            LinkRichText linkRichTextCreateFromParcel;
            ReviewFilterStruct reviewFilterStructCreateFromParcel2;
            PlatformLinkInfo platformLinkInfoCreateFromParcel;
            Integer numValueOf3 = null;
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
                    arrayList2.add(ReviewItemStruct.CREATOR.createFromParcel(parcel));
                }
            }
            boolean z2 = true;
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
                arrayList3 = null;
            } else {
                int i5 = parcel.readInt();
                arrayList3 = new ArrayList(i5);
                for (int i6 = 0; i6 != i5; i6++) {
                    arrayList3.add(ReviewFilterStruct.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                if (parcel.readInt() == 0) {
                    z2 = false;
                }
                boolValueOf2 = Boolean.valueOf(z2);
            }
            if (parcel.readInt() == 0) {
                fValueOf = null;
            } else {
                fValueOf = Float.valueOf(parcel.readFloat());
            }
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                topTextDisclaimerCreateFromParcel = null;
            } else {
                topTextDisclaimerCreateFromParcel = TopTextDisclaimer.CREATOR.createFromParcel(parcel);
            }
            TopTextDisclaimer topTextDisclaimer = topTextDisclaimerCreateFromParcel;
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
                numValueOf2 = null;
            } else {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList5 = null;
            } else {
                int i9 = parcel.readInt();
                arrayList5 = new ArrayList(i9);
                for (int i10 = 0; i10 != i9; i10++) {
                    arrayList5.add(ReviewFilterStruct.CREATOR.createFromParcel(parcel));
                }
            }
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                shopReviewEntryCreateFromParcel = null;
            } else {
                shopReviewEntryCreateFromParcel = ShopReviewEntry.CREATOR.createFromParcel(parcel);
            }
            ShopReviewEntry shopReviewEntry = shopReviewEntryCreateFromParcel;
            if (parcel.readInt() == 0) {
                reviewCardUICreateFromParcel = null;
            } else {
                reviewCardUICreateFromParcel = ReviewCardUI.CREATOR.createFromParcel(parcel);
            }
            ReviewCardUI reviewCardUI = reviewCardUICreateFromParcel;
            String string5 = parcel.readString();
            if (parcel.readInt() == 0) {
                reviewFilterStructCreateFromParcel = null;
            } else {
                reviewFilterStructCreateFromParcel = ReviewFilterStruct.CREATOR.createFromParcel(parcel);
            }
            ReviewFilterStruct reviewFilterStruct = reviewFilterStructCreateFromParcel;
            String string6 = parcel.readString();
            if (parcel.readInt() == 0) {
                linkRichTextCreateFromParcel = null;
            } else {
                linkRichTextCreateFromParcel = LinkRichText.CREATOR.createFromParcel(parcel);
            }
            LinkRichText linkRichText = linkRichTextCreateFromParcel;
            if (parcel.readInt() == 0) {
                reviewFilterStructCreateFromParcel2 = null;
            } else {
                reviewFilterStructCreateFromParcel2 = ReviewFilterStruct.CREATOR.createFromParcel(parcel);
            }
            ReviewFilterStruct reviewFilterStruct2 = reviewFilterStructCreateFromParcel2;
            ECRichText eCRichText = (ECRichText) parcel.readParcelable(ListReviewData.class.getClassLoader());
            if (parcel.readInt() == 0) {
                platformLinkInfoCreateFromParcel = null;
            } else {
                platformLinkInfoCreateFromParcel = PlatformLinkInfo.CREATOR.createFromParcel(parcel);
            }
            PlatformLinkInfo platformLinkInfo = platformLinkInfoCreateFromParcel;
            if (parcel.readInt() != 0) {
                numValueOf3 = Integer.valueOf(parcel.readInt());
            }
            return new ListReviewData(arrayList, arrayList2, boolValueOf, numValueOf, arrayList3, boolValueOf2, fValueOf, string, topTextDisclaimer, arrayList4, numValueOf2, string2, string3, arrayList5, string4, shopReviewEntry, reviewCardUI, string5, reviewFilterStruct, string6, linkRichText, reviewFilterStruct2, eCRichText, platformLinkInfo, numValueOf3);
        }

        @Override // android.os.Parcelable.Creator
        public final ListReviewData[] newArray(int i) {
            return new ListReviewData[i];
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
        if (!(obj instanceof ListReviewData)) {
            return false;
        }
        ListReviewData listReviewData = (ListReviewData) obj;
        return Intrinsics.LJFF(this.reviewItems, listReviewData.reviewItems) && Intrinsics.LJFF(this.reviewItemsOtherCountries, listReviewData.reviewItemsOtherCountries) && Intrinsics.LJFF(this.hasMore, listReviewData.hasMore) && Intrinsics.LJFF(this.nextCursor, listReviewData.nextCursor) && Intrinsics.LJFF(this.reviewFilter, listReviewData.reviewFilter) && Intrinsics.LJFF(this.noAllowFeedback, listReviewData.noAllowFeedback) && Intrinsics.LJFF(this.rating, listReviewData.rating) && Intrinsics.LJFF(this.topText, listReviewData.topText) && Intrinsics.LJFF(this.topTextDisclaimer, listReviewData.topTextDisclaimer) && Intrinsics.LJFF(this.reviewAspectPercentageCard, listReviewData.reviewAspectPercentageCard) && Intrinsics.LJFF(this.reviewCount, listReviewData.reviewCount) && Intrinsics.LJFF(this.reviewCountStr, listReviewData.reviewCountStr) && Intrinsics.LJFF(this.reviewCountStrV2, listReviewData.reviewCountStrV2) && Intrinsics.LJFF(this.ratingFilters, listReviewData.ratingFilters) && Intrinsics.LJFF(this.ratingsLink, listReviewData.ratingsLink) && Intrinsics.LJFF(this.shopReviewEntry, listReviewData.shopReviewEntry) && Intrinsics.LJFF(this.reviewABTest, listReviewData.reviewABTest) && Intrinsics.LJFF(this.topTextLocal, listReviewData.topTextLocal) && Intrinsics.LJFF(this.bottomFilterLocalReviews, listReviewData.bottomFilterLocalReviews) && Intrinsics.LJFF(this.topTextOtherCountries, listReviewData.topTextOtherCountries) && Intrinsics.LJFF(this.reviewOtherCountriesDisclaimer, listReviewData.reviewOtherCountriesDisclaimer) && Intrinsics.LJFF(this.bottomFilterOtherCountries, listReviewData.bottomFilterOtherCountries) && Intrinsics.LJFF(this.reviewPolicy, listReviewData.reviewPolicy) && Intrinsics.LJFF(this.platformLinkInfo, listReviewData.platformLinkInfo) && Intrinsics.LJFF(this.thirdPartyReviewCnt, listReviewData.thirdPartyReviewCnt);
    }

    public final int hashCode() {
        List<ReviewItemStruct> list = this.reviewItems;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<ReviewItemStruct> list2 = this.reviewItemsOtherCountries;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool = this.hasMore;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.nextCursor;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        List<ReviewFilterStruct> list3 = this.reviewFilter;
        int iHashCode5 = (iHashCode4 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Boolean bool2 = this.noAllowFeedback;
        int iHashCode6 = (iHashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Float f = this.rating;
        int iHashCode7 = (iHashCode6 + (f == null ? 0 : f.hashCode())) * 31;
        String str = this.topText;
        int iHashCode8 = (iHashCode7 + (str == null ? 0 : str.hashCode())) * 31;
        TopTextDisclaimer topTextDisclaimer = this.topTextDisclaimer;
        int iHashCode9 = (iHashCode8 + (topTextDisclaimer == null ? 0 : topTextDisclaimer.hashCode())) * 31;
        List<ReviewAspectPercentageCard> list4 = this.reviewAspectPercentageCard;
        int iHashCode10 = (iHashCode9 + (list4 == null ? 0 : list4.hashCode())) * 31;
        Integer num2 = this.reviewCount;
        int iHashCode11 = (iHashCode10 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.reviewCountStr;
        int iHashCode12 = (iHashCode11 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.reviewCountStrV2;
        int iHashCode13 = (iHashCode12 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<ReviewFilterStruct> list5 = this.ratingFilters;
        int iHashCode14 = (iHashCode13 + (list5 == null ? 0 : list5.hashCode())) * 31;
        String str4 = this.ratingsLink;
        int iHashCode15 = (iHashCode14 + (str4 == null ? 0 : str4.hashCode())) * 31;
        ShopReviewEntry shopReviewEntry = this.shopReviewEntry;
        int iHashCode16 = (iHashCode15 + (shopReviewEntry == null ? 0 : shopReviewEntry.hashCode())) * 31;
        ReviewCardUI reviewCardUI = this.reviewABTest;
        int iHashCode17 = (iHashCode16 + (reviewCardUI == null ? 0 : reviewCardUI.hashCode())) * 31;
        String str5 = this.topTextLocal;
        int iHashCode18 = (iHashCode17 + (str5 == null ? 0 : str5.hashCode())) * 31;
        ReviewFilterStruct reviewFilterStruct = this.bottomFilterLocalReviews;
        int iHashCode19 = (iHashCode18 + (reviewFilterStruct == null ? 0 : reviewFilterStruct.hashCode())) * 31;
        String str6 = this.topTextOtherCountries;
        int iHashCode20 = (iHashCode19 + (str6 == null ? 0 : str6.hashCode())) * 31;
        LinkRichText linkRichText = this.reviewOtherCountriesDisclaimer;
        int iHashCode21 = (iHashCode20 + (linkRichText == null ? 0 : linkRichText.hashCode())) * 31;
        ReviewFilterStruct reviewFilterStruct2 = this.bottomFilterOtherCountries;
        int iHashCode22 = (iHashCode21 + (reviewFilterStruct2 == null ? 0 : reviewFilterStruct2.hashCode())) * 31;
        ECRichText eCRichText = this.reviewPolicy;
        int iHashCode23 = (iHashCode22 + (eCRichText == null ? 0 : eCRichText.hashCode())) * 31;
        PlatformLinkInfo platformLinkInfo = this.platformLinkInfo;
        int iHashCode24 = (iHashCode23 + (platformLinkInfo == null ? 0 : platformLinkInfo.hashCode())) * 31;
        Integer num3 = this.thirdPartyReviewCnt;
        return iHashCode24 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        return "ListReviewData(reviewItems=" + this.reviewItems + ", reviewItemsOtherCountries=" + this.reviewItemsOtherCountries + ", hasMore=" + this.hasMore + ", nextCursor=" + this.nextCursor + ", reviewFilter=" + this.reviewFilter + ", noAllowFeedback=" + this.noAllowFeedback + ", rating=" + this.rating + ", topText=" + this.topText + ", topTextDisclaimer=" + this.topTextDisclaimer + ", reviewAspectPercentageCard=" + this.reviewAspectPercentageCard + ", reviewCount=" + this.reviewCount + ", reviewCountStr=" + this.reviewCountStr + ", reviewCountStrV2=" + this.reviewCountStrV2 + ", ratingFilters=" + this.ratingFilters + ", ratingsLink=" + this.ratingsLink + ", shopReviewEntry=" + this.shopReviewEntry + ", reviewABTest=" + this.reviewABTest + ", topTextLocal=" + this.topTextLocal + ", bottomFilterLocalReviews=" + this.bottomFilterLocalReviews + ", topTextOtherCountries=" + this.topTextOtherCountries + ", reviewOtherCountriesDisclaimer=" + this.reviewOtherCountriesDisclaimer + ", bottomFilterOtherCountries=" + this.bottomFilterOtherCountries + ", reviewPolicy=" + this.reviewPolicy + ", platformLinkInfo=" + this.platformLinkInfo + ", thirdPartyReviewCnt=" + this.thirdPartyReviewCnt + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
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
        List<ReviewItemStruct> list2 = this.reviewItemsOtherCountries;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            Iterator<ReviewItemStruct> it3 = list2.iterator();
            while (it3.hasNext()) {
                it3.next().writeToParcel(parcel, i);
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
        List<ReviewFilterStruct> list3 = this.reviewFilter;
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
        Boolean bool2 = this.noAllowFeedback;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        Float f = this.rating;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f.floatValue());
        }
        parcel.writeString(this.topText);
        TopTextDisclaimer topTextDisclaimer = this.topTextDisclaimer;
        if (topTextDisclaimer == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            topTextDisclaimer.writeToParcel(parcel, i);
        }
        List<ReviewAspectPercentageCard> list4 = this.reviewAspectPercentageCard;
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
        Integer num2 = this.reviewCount;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.reviewCountStr);
        parcel.writeString(this.reviewCountStrV2);
        List<ReviewFilterStruct> list5 = this.ratingFilters;
        if (list5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list5.size());
            Iterator<ReviewFilterStruct> it6 = list5.iterator();
            while (it6.hasNext()) {
                it6.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.ratingsLink);
        ShopReviewEntry shopReviewEntry = this.shopReviewEntry;
        if (shopReviewEntry == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            shopReviewEntry.writeToParcel(parcel, i);
        }
        ReviewCardUI reviewCardUI = this.reviewABTest;
        if (reviewCardUI == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(reviewCardUI.reviewCardUnificationVersion);
        }
        parcel.writeString(this.topTextLocal);
        ReviewFilterStruct reviewFilterStruct = this.bottomFilterLocalReviews;
        if (reviewFilterStruct == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            reviewFilterStruct.writeToParcel(parcel, i);
        }
        parcel.writeString(this.topTextOtherCountries);
        LinkRichText linkRichText = this.reviewOtherCountriesDisclaimer;
        if (linkRichText == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            linkRichText.writeToParcel(parcel, i);
        }
        ReviewFilterStruct reviewFilterStruct2 = this.bottomFilterOtherCountries;
        if (reviewFilterStruct2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            reviewFilterStruct2.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.reviewPolicy, i);
        PlatformLinkInfo platformLinkInfo = this.platformLinkInfo;
        if (platformLinkInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            platformLinkInfo.writeToParcel(parcel, i);
        }
        Integer num3 = this.thirdPartyReviewCnt;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
    }

    public ListReviewData(List<ReviewItemStruct> list, List<ReviewItemStruct> list2, Boolean bool, Integer num, List<ReviewFilterStruct> list3, Boolean bool2, Float f, String str, TopTextDisclaimer topTextDisclaimer, List<ReviewAspectPercentageCard> list4, Integer num2, String str2, String str3, List<ReviewFilterStruct> list5, String str4, ShopReviewEntry shopReviewEntry, ReviewCardUI reviewCardUI, String str5, ReviewFilterStruct reviewFilterStruct, String str6, LinkRichText linkRichText, ReviewFilterStruct reviewFilterStruct2, ECRichText eCRichText, PlatformLinkInfo platformLinkInfo, Integer num3) {
        this.reviewItems = list;
        this.reviewItemsOtherCountries = list2;
        this.hasMore = bool;
        this.nextCursor = num;
        this.reviewFilter = list3;
        this.noAllowFeedback = bool2;
        this.rating = f;
        this.topText = str;
        this.topTextDisclaimer = topTextDisclaimer;
        this.reviewAspectPercentageCard = list4;
        this.reviewCount = num2;
        this.reviewCountStr = str2;
        this.reviewCountStrV2 = str3;
        this.ratingFilters = list5;
        this.ratingsLink = str4;
        this.shopReviewEntry = shopReviewEntry;
        this.reviewABTest = reviewCardUI;
        this.topTextLocal = str5;
        this.bottomFilterLocalReviews = reviewFilterStruct;
        this.topTextOtherCountries = str6;
        this.reviewOtherCountriesDisclaimer = linkRichText;
        this.bottomFilterOtherCountries = reviewFilterStruct2;
        this.reviewPolicy = eCRichText;
        this.platformLinkInfo = platformLinkInfo;
        this.thirdPartyReviewCnt = num3;
    }
}
