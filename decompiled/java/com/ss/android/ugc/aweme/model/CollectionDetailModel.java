package com.ss.android.ugc.aweme.model;

import X.C09CT;
import com.ss.android.ugc.aweme.feed.model.SeriesCategory;
import com.ss.android.ugc.aweme.feed.model.TvRatingInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class CollectionDetailModel implements Serializable {

    @C09CT("bottom_bar_desc")
    public final String bottomBarDesc;

    @C09CT("bottom_bar_subtitle")
    public final String bottomBarSubTitle;

    @C09CT("bottom_bar_title")
    public final String bottomBarTitle;

    @C09CT("can_user_refund")
    public final boolean canCollectionRefund;

    @C09CT("can_user_review")
    public final boolean canReviewCollection;

    @C09CT("category")
    public final SeriesCategory category;

    @C09CT("cover")
    public final UrlModel collectionCover;

    @C09CT("create_timestamp")
    public final long collectionCreateTimestamp;

    @C09CT("creator")
    public final User collectionCreator;

    @C09CT("description")
    public final String collectionDescription;

    @C09CT("collection_id")
    public final long collectionId;

    @C09CT("name")
    public final String collectionName;

    @C09CT("publish_timestamp")
    public final long collectionPublishTimestamp;

    @C09CT("avg_rating_float")
    public final float collectionRating;

    @C09CT("num_ratings")
    public final long collectionRatingNum;

    @C09CT("num_sales")
    public final long collectionSalesNum;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final long collectionStatus;

    @C09CT("total_duration")
    public final long collectionTotalDuration;

    @C09CT("num_videos")
    public final int collectionVideoNum;

    @C09CT("discount_description")
    public final String discountDescription;

    @C09CT("discounted_price")
    public final PriceInfo discountedPriceInfo;

    @C09CT("enable_single_video_purchase")
    public final boolean enableSingleVideoPurchase;

    @C09CT("episode_panel_subtitle")
    public final String episodePanelSubtitle;

    @C09CT("free_tag_text")
    public final String freeTagText;

    @C09CT("has_confirmed_purchase")
    public final boolean hasConfirmedEpisodePurchase;

    @C09CT("has_user_purchased")
    public final boolean hasPurchasedCollection;

    @C09CT("has_user_partial_purchased")
    public final boolean hasUserPartialPurchased;

    @C09CT("has_voucher")
    public final boolean hasVoucher;

    @C09CT("is_eager_review_displayed")
    public final boolean isEagerReviewDisplayed;

    @C09CT("is_favorited")
    public final boolean isFavorite;

    @C09CT("is_limited_free")
    public final boolean isLimitedFree;

    @C09CT("is_standard_review_displayed")
    public final boolean isStandardReviewDisplayed;

    @C09CT("last_watched")
    public final Integer lastWatched;

    @C09CT("num_purchased_videos")
    public final int numPurchasedVideos;

    @C09CT("num_watched")
    public final int numWatched;

    @C09CT("review_section")
    public final PaidContentReviewSection paidContentReviewSection;

    @C09CT("paid_videos")
    public final List<PaidVideoItem> paidVideoList;

    @C09CT("price")
    public final PriceInfo priceInfo;

    @C09CT("purchased_videos_text")
    public final String purchasedVideosText;

    @C09CT("replace_rating_with_cta")
    public final boolean replaceRatingWithCta;

    @C09CT("should_hide_favorite_button")
    public final Boolean shouldHideFavoriteButton;

    @C09CT("should_hide_report_button")
    public final Boolean shouldHideReportButton;

    @C09CT("should_hide_share_button")
    public final Boolean shouldHideShareButton;

    @C09CT("should_prompt_review")
    public final boolean shouldPromptReview;

    @C09CT("single_video_price")
    public final PriceInfo singleVideoPriceInfo;

    @C09CT("tab_range_size")
    public final int tabRange;

    @C09CT("tv_rating")
    public final TvRatingInfo tvRatingInfo;

    @C09CT("video_completion_threshold")
    public final Double videoCompletionThreshold;

    @C09CT("voucher_description")
    public final String voucherDescription;

    @C09CT("voucher_expiration_timestamp")
    public final long voucherExpireTimestamp;

    @C09CT("voucher_id")
    public final Long voucherId;

    @C09CT("voucher_is_countdown")
    public final boolean voucherIsCountdown;

    @C09CT("voucher_status")
    public final VoucherStatus voucherStatus;

    @C09CT("voucher_tag")
    public final String voucherTag;

    @C09CT("voucher_type")
    public final int voucherUrgencyType;

    @C09CT("web_payment_link")
    public final String webPaymentLink;

    public CollectionDetailModel() {
        this(0L, "", "", null, null, 0L, 0L, 0L, 0L, 0L, 0.0f, 0, 0L, false, false, false, false, new ArrayList(), null, false, false, false, null, null, false, null, VoucherStatus.UNKNOWN, "", null, false, 0L, 0, Double.valueOf(0.95d), "", false, false, null, false, null, false, 0, 0, null, SeriesCategory.DEFAULT, null, 0, false, null, null, null, null, null, null, null, null, null);
    }

    public final CollectionDetailModel copy(long j, String str, String str2, UrlModel urlModel, User user, long j2, long j3, long j4, long j5, long j6, float f, int i, long j7, boolean z, boolean z2, boolean z3, boolean z4, List<PaidVideoItem> list, PaidContentReviewSection paidContentReviewSection, boolean z5, boolean z6, boolean z7, PriceInfo priceInfo, PriceInfo priceInfo2, boolean z8, Long l, VoucherStatus voucherStatus, String str3, String str4, boolean z9, long j8, int i2, Double d, String str5, boolean z10, boolean z11, PriceInfo priceInfo3, boolean z12, String str6, boolean z13, int i3, int i4, TvRatingInfo tvRatingInfo, SeriesCategory seriesCategory, String str7, int i5, boolean z14, String str8, String str9, Boolean bool, Boolean bool2, Boolean bool3, String str10, String str11, String str12, Integer num) {
        return new CollectionDetailModel(j, str, str2, urlModel, user, j2, j3, j4, j5, j6, f, i, j7, z, z2, z3, z4, list, paidContentReviewSection, z5, z6, z7, priceInfo, priceInfo2, z8, l, voucherStatus, str3, str4, z9, j8, i2, d, str5, z10, z11, priceInfo3, z12, str6, z13, i3, i4, tvRatingInfo, seriesCategory, str7, i5, z14, str8, str9, bool, bool2, bool3, str10, str11, str12, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CollectionDetailModel)) {
            return false;
        }
        CollectionDetailModel collectionDetailModel = (CollectionDetailModel) obj;
        return this.collectionId == collectionDetailModel.collectionId && Intrinsics.LJFF(this.collectionName, collectionDetailModel.collectionName) && Intrinsics.LJFF(this.collectionDescription, collectionDetailModel.collectionDescription) && Intrinsics.LJFF(this.collectionCover, collectionDetailModel.collectionCover) && Intrinsics.LJFF(this.collectionCreator, collectionDetailModel.collectionCreator) && this.collectionPublishTimestamp == collectionDetailModel.collectionPublishTimestamp && this.collectionCreateTimestamp == collectionDetailModel.collectionCreateTimestamp && this.collectionStatus == collectionDetailModel.collectionStatus && this.collectionSalesNum == collectionDetailModel.collectionSalesNum && this.collectionRatingNum == collectionDetailModel.collectionRatingNum && Float.compare(this.collectionRating, collectionDetailModel.collectionRating) == 0 && this.collectionVideoNum == collectionDetailModel.collectionVideoNum && this.collectionTotalDuration == collectionDetailModel.collectionTotalDuration && this.hasPurchasedCollection == collectionDetailModel.hasPurchasedCollection && this.canReviewCollection == collectionDetailModel.canReviewCollection && this.shouldPromptReview == collectionDetailModel.shouldPromptReview && this.canCollectionRefund == collectionDetailModel.canCollectionRefund && Intrinsics.LJFF(this.paidVideoList, collectionDetailModel.paidVideoList) && Intrinsics.LJFF(this.paidContentReviewSection, collectionDetailModel.paidContentReviewSection) && this.isEagerReviewDisplayed == collectionDetailModel.isEagerReviewDisplayed && this.isStandardReviewDisplayed == collectionDetailModel.isStandardReviewDisplayed && this.replaceRatingWithCta == collectionDetailModel.replaceRatingWithCta && Intrinsics.LJFF(this.priceInfo, collectionDetailModel.priceInfo) && Intrinsics.LJFF(this.discountedPriceInfo, collectionDetailModel.discountedPriceInfo) && this.hasVoucher == collectionDetailModel.hasVoucher && Intrinsics.LJFF(this.voucherId, collectionDetailModel.voucherId) && this.voucherStatus == collectionDetailModel.voucherStatus && Intrinsics.LJFF(this.voucherTag, collectionDetailModel.voucherTag) && Intrinsics.LJFF(this.voucherDescription, collectionDetailModel.voucherDescription) && this.voucherIsCountdown == collectionDetailModel.voucherIsCountdown && this.voucherExpireTimestamp == collectionDetailModel.voucherExpireTimestamp && this.voucherUrgencyType == collectionDetailModel.voucherUrgencyType && Intrinsics.LJFF(this.videoCompletionThreshold, collectionDetailModel.videoCompletionThreshold) && Intrinsics.LJFF(this.webPaymentLink, collectionDetailModel.webPaymentLink) && this.isFavorite == collectionDetailModel.isFavorite && this.enableSingleVideoPurchase == collectionDetailModel.enableSingleVideoPurchase && Intrinsics.LJFF(this.singleVideoPriceInfo, collectionDetailModel.singleVideoPriceInfo) && this.hasUserPartialPurchased == collectionDetailModel.hasUserPartialPurchased && Intrinsics.LJFF(this.purchasedVideosText, collectionDetailModel.purchasedVideosText) && this.hasConfirmedEpisodePurchase == collectionDetailModel.hasConfirmedEpisodePurchase && this.numPurchasedVideos == collectionDetailModel.numPurchasedVideos && this.numWatched == collectionDetailModel.numWatched && Intrinsics.LJFF(this.tvRatingInfo, collectionDetailModel.tvRatingInfo) && this.category == collectionDetailModel.category && Intrinsics.LJFF(this.discountDescription, collectionDetailModel.discountDescription) && this.tabRange == collectionDetailModel.tabRange && this.isLimitedFree == collectionDetailModel.isLimitedFree && Intrinsics.LJFF(this.bottomBarSubTitle, collectionDetailModel.bottomBarSubTitle) && Intrinsics.LJFF(this.episodePanelSubtitle, collectionDetailModel.episodePanelSubtitle) && Intrinsics.LJFF(this.shouldHideShareButton, collectionDetailModel.shouldHideShareButton) && Intrinsics.LJFF(this.shouldHideFavoriteButton, collectionDetailModel.shouldHideFavoriteButton) && Intrinsics.LJFF(this.shouldHideReportButton, collectionDetailModel.shouldHideReportButton) && Intrinsics.LJFF(this.freeTagText, collectionDetailModel.freeTagText) && Intrinsics.LJFF(this.bottomBarTitle, collectionDetailModel.bottomBarTitle) && Intrinsics.LJFF(this.bottomBarDesc, collectionDetailModel.bottomBarDesc) && Intrinsics.LJFF(this.lastWatched, collectionDetailModel.lastWatched);
    }

    public String toString() {
        return "CollectionDetailModel(collectionId=" + this.collectionId + ", collectionName=" + this.collectionName + ", collectionDescription=" + this.collectionDescription + ", collectionCover=" + this.collectionCover + ", collectionCreator=" + this.collectionCreator + ", collectionPublishTimestamp=" + this.collectionPublishTimestamp + ", collectionCreateTimestamp=" + this.collectionCreateTimestamp + ", collectionStatus=" + this.collectionStatus + ", collectionSalesNum=" + this.collectionSalesNum + ", collectionRatingNum=" + this.collectionRatingNum + ", collectionRating=" + this.collectionRating + ", collectionVideoNum=" + this.collectionVideoNum + ", collectionTotalDuration=" + this.collectionTotalDuration + ", hasPurchasedCollection=" + this.hasPurchasedCollection + ", canReviewCollection=" + this.canReviewCollection + ", shouldPromptReview=" + this.shouldPromptReview + ", canCollectionRefund=" + this.canCollectionRefund + ", paidVideoList=" + this.paidVideoList + ", paidContentReviewSection=" + this.paidContentReviewSection + ", isEagerReviewDisplayed=" + this.isEagerReviewDisplayed + ", isStandardReviewDisplayed=" + this.isStandardReviewDisplayed + ", replaceRatingWithCta=" + this.replaceRatingWithCta + ", priceInfo=" + this.priceInfo + ", discountedPriceInfo=" + this.discountedPriceInfo + ", hasVoucher=" + this.hasVoucher + ", voucherId=" + this.voucherId + ", voucherStatus=" + this.voucherStatus + ", voucherTag=" + this.voucherTag + ", voucherDescription=" + this.voucherDescription + ", voucherIsCountdown=" + this.voucherIsCountdown + ", voucherExpireTimestamp=" + this.voucherExpireTimestamp + ", voucherUrgencyType=" + this.voucherUrgencyType + ", videoCompletionThreshold=" + this.videoCompletionThreshold + ", webPaymentLink=" + this.webPaymentLink + ", isFavorite=" + this.isFavorite + ", enableSingleVideoPurchase=" + this.enableSingleVideoPurchase + ", singleVideoPriceInfo=" + this.singleVideoPriceInfo + ", hasUserPartialPurchased=" + this.hasUserPartialPurchased + ", purchasedVideosText=" + this.purchasedVideosText + ", hasConfirmedEpisodePurchase=" + this.hasConfirmedEpisodePurchase + ", numPurchasedVideos=" + this.numPurchasedVideos + ", numWatched=" + this.numWatched + ", tvRatingInfo=" + this.tvRatingInfo + ", category=" + this.category + ", discountDescription=" + this.discountDescription + ", tabRange=" + this.tabRange + ", isLimitedFree=" + this.isLimitedFree + ", bottomBarSubTitle=" + this.bottomBarSubTitle + ", episodePanelSubtitle=" + this.episodePanelSubtitle + ", shouldHideShareButton=" + this.shouldHideShareButton + ", shouldHideFavoriteButton=" + this.shouldHideFavoriteButton + ", shouldHideReportButton=" + this.shouldHideReportButton + ", freeTagText=" + this.freeTagText + ", bottomBarTitle=" + this.bottomBarTitle + ", bottomBarDesc=" + this.bottomBarDesc + ", lastWatched=" + this.lastWatched + ')';
    }

    public final boolean isEagerReviewDisplayed() {
        return this.isEagerReviewDisplayed;
    }

    public final boolean isFavorite() {
        return this.isFavorite;
    }

    public final boolean isLimitedFree() {
        return this.isLimitedFree;
    }

    public final boolean isStandardReviewDisplayed() {
        return this.isStandardReviewDisplayed;
    }

    public CollectionDetailModel(long j, String str, String str2, UrlModel urlModel, User user, long j2, long j3, long j4, long j5, long j6, float f, int i, long j7, boolean z, boolean z2, boolean z3, boolean z4, List<PaidVideoItem> list, PaidContentReviewSection paidContentReviewSection, boolean z5, boolean z6, boolean z7, PriceInfo priceInfo, PriceInfo priceInfo2, boolean z8, Long l, VoucherStatus voucherStatus, String str3, String str4, boolean z9, long j8, int i2, Double d, String str5, boolean z10, boolean z11, PriceInfo priceInfo3, boolean z12, String str6, boolean z13, int i3, int i4, TvRatingInfo tvRatingInfo, SeriesCategory seriesCategory, String str7, int i5, boolean z14, String str8, String str9, Boolean bool, Boolean bool2, Boolean bool3, String str10, String str11, String str12, Integer num) {
        this.collectionId = j;
        this.collectionName = str;
        this.collectionDescription = str2;
        this.collectionCover = urlModel;
        this.collectionCreator = user;
        this.collectionPublishTimestamp = j2;
        this.collectionCreateTimestamp = j3;
        this.collectionStatus = j4;
        this.collectionSalesNum = j5;
        this.collectionRatingNum = j6;
        this.collectionRating = f;
        this.collectionVideoNum = i;
        this.collectionTotalDuration = j7;
        this.hasPurchasedCollection = z;
        this.canReviewCollection = z2;
        this.shouldPromptReview = z3;
        this.canCollectionRefund = z4;
        this.paidVideoList = list;
        this.paidContentReviewSection = paidContentReviewSection;
        this.isEagerReviewDisplayed = z5;
        this.isStandardReviewDisplayed = z6;
        this.replaceRatingWithCta = z7;
        this.priceInfo = priceInfo;
        this.discountedPriceInfo = priceInfo2;
        this.hasVoucher = z8;
        this.voucherId = l;
        this.voucherStatus = voucherStatus;
        this.voucherTag = str3;
        this.voucherDescription = str4;
        this.voucherIsCountdown = z9;
        this.voucherExpireTimestamp = j8;
        this.voucherUrgencyType = i2;
        this.videoCompletionThreshold = d;
        this.webPaymentLink = str5;
        this.isFavorite = z10;
        this.enableSingleVideoPurchase = z11;
        this.singleVideoPriceInfo = priceInfo3;
        this.hasUserPartialPurchased = z12;
        this.purchasedVideosText = str6;
        this.hasConfirmedEpisodePurchase = z13;
        this.numPurchasedVideos = i3;
        this.numWatched = i4;
        this.tvRatingInfo = tvRatingInfo;
        this.category = seriesCategory;
        this.discountDescription = str7;
        this.tabRange = i5;
        this.isLimitedFree = z14;
        this.bottomBarSubTitle = str8;
        this.episodePanelSubtitle = str9;
        this.shouldHideShareButton = bool;
        this.shouldHideFavoriteButton = bool2;
        this.shouldHideReportButton = bool3;
        this.freeTagText = str10;
        this.bottomBarTitle = str11;
        this.bottomBarDesc = str12;
        this.lastWatched = num;
    }
}
