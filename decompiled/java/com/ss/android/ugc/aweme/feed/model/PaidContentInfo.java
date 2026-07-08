package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class PaidContentInfo implements Serializable {

    @C09CT("bottom_button_text")
    public String bottomButtonText;

    @C09CT("category")
    public long category;

    @C09CT("collection_category_tags")
    public List<String> collectionCategoryTags;

    @C09CT("collection_name")
    public String collectionName = "";

    @C09CT("cover_url")
    public UrlModel coverUrl;
    public transient Map<String, Object> customPayloads;

    @C09CT("discounted_price")
    public PriceInfo discountedPrice;

    @C09CT("display_prompt")
    public int displayPrompt;

    @C09CT("enable_single_video_purchase")
    public boolean enableSingleVideoPurchase;

    @C09CT("episode_num")
    public String episodeNumber;

    @C09CT("has_partial_purchased_collection")
    public boolean hasPartialPurchased;

    @C09CT("has_purchased")
    public boolean hasPurchased;

    @C09CT("has_purchased_video")
    public boolean hasPurchasedVideo;
    public transient Boolean isInnerFeedRecommend;

    @C09CT("is_last_purchased_video_in_order")
    public boolean isLastPurchasedVideoInOrder;

    @C09CT("is_limited_free")
    public boolean isLimitedFreeShortDrama;

    @C09CT("is_paid_collection_intro")
    public boolean isPaidCollectionIntro;

    @C09CT("is_partial_preview")
    public boolean isPartialPreview;

    @C09CT("is_subscription_active")
    public Boolean isSubscriptionActive;

    @C09CT("card_info")
    public MiniDramaCardInfo miniDramaCardInfo;

    @C09CT("mini_drama_info")
    public String miniDramaInfo;

    @C09CT("paid_collection_id")
    public long paidCollectionId;
    public transient PaidContentMiniDramaInfo paidContentMiniDramaInfo;

    @C09CT("resume_timestamp")
    public long paidContentResumeTimestamp;

    @C09CT("price")
    public PriceInfo price;

    @C09CT("should_show_bottom_button")
    public Boolean shouldShowBottomButton;

    @C09CT("should_show_info_area")
    public Boolean shouldShowInfoArea;

    @C09CT("should_show_preview")
    public boolean shouldShowPreview;

    @C09CT("should_show_video_interactions")
    public boolean shouldShowVideoInteractions;

    @C09CT("should_show_series_purchase_label")
    public boolean showSeriesPurchaseLabel;

    @C09CT("single_video_price")
    public PriceInfo singleVideoPrice;

    @C09CT("subscription_cycle_type")
    public String subscriptionCycleType;

    @C09CT("subscription_expired_time")
    public Long subscriptionExpiredTime;

    @C09CT("subscription_status")
    public String subscriptionStatus;

    @C09CT("tv_rating")
    public TvRatingInfo tvRatingInfo;

    @C09CT("voucher_id")
    public String voucherId;

    public final boolean isVideoPurchased() {
        return this.hasPurchasedVideo || isSeriesPurchased();
    }

    public final boolean isSeriesPurchased() {
        long jCurrentTimeMillis = System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        if (this.hasPurchased) {
            return true;
        }
        if (!Intrinsics.LJFF(this.isSubscriptionActive, Boolean.TRUE)) {
            return false;
        }
        Long l = this.subscriptionExpiredTime;
        return (l != null ? l.longValue() : 0L) > jCurrentTimeMillis;
    }

    public final String getBottomButtonText() {
        return this.bottomButtonText;
    }

    public final long getCategory() {
        return this.category;
    }

    public final List<String> getCollectionCategoryTags() {
        return this.collectionCategoryTags;
    }

    public final String getCollectionName() {
        return this.collectionName;
    }

    public final UrlModel getCoverUrl() {
        return this.coverUrl;
    }

    public final Map<String, Object> getCustomPayloads() {
        return this.customPayloads;
    }

    public final PriceInfo getDiscountedPrice() {
        return this.discountedPrice;
    }

    public final int getDisplayPrompt() {
        return this.displayPrompt;
    }

    public final boolean getEnableSingleVideoPurchase() {
        return this.enableSingleVideoPurchase;
    }

    public final String getEpisodeNumber() {
        return this.episodeNumber;
    }

    public final boolean getHasPartialPurchased() {
        return this.hasPartialPurchased;
    }

    public final boolean getHasPurchased() {
        return this.hasPurchased;
    }

    public final boolean getHasPurchasedVideo() {
        return this.hasPurchasedVideo;
    }

    public final MiniDramaCardInfo getMiniDramaCardInfo() {
        return this.miniDramaCardInfo;
    }

    public final String getMiniDramaInfo() {
        return this.miniDramaInfo;
    }

    public final long getPaidCollectionId() {
        return this.paidCollectionId;
    }

    public final PaidContentMiniDramaInfo getPaidContentMiniDramaInfo() {
        return this.paidContentMiniDramaInfo;
    }

    public final long getPaidContentResumeTimestamp() {
        return this.paidContentResumeTimestamp;
    }

    public final PriceInfo getPrice() {
        return this.price;
    }

    public final Boolean getShouldShowBottomButton() {
        return this.shouldShowBottomButton;
    }

    public final Boolean getShouldShowInfoArea() {
        return this.shouldShowInfoArea;
    }

    public final boolean getShouldShowPreview() {
        return this.shouldShowPreview;
    }

    public final boolean getShouldShowVideoInteractions() {
        return this.shouldShowVideoInteractions;
    }

    public final boolean getShowSeriesPurchaseLabel() {
        return this.showSeriesPurchaseLabel;
    }

    public final PriceInfo getSingleVideoPrice() {
        return this.singleVideoPrice;
    }

    public final String getSubscriptionCycleType() {
        return this.subscriptionCycleType;
    }

    public final Long getSubscriptionExpiredTime() {
        return this.subscriptionExpiredTime;
    }

    public final String getSubscriptionStatus() {
        return this.subscriptionStatus;
    }

    public final TvRatingInfo getTvRatingInfo() {
        return this.tvRatingInfo;
    }

    public final String getVoucherId() {
        return this.voucherId;
    }

    public final Boolean isInnerFeedRecommend() {
        return this.isInnerFeedRecommend;
    }

    public final boolean isLastPurchasedVideoInOrder() {
        return this.isLastPurchasedVideoInOrder;
    }

    public final boolean isLimitedFreeShortDrama() {
        return this.isLimitedFreeShortDrama;
    }

    public final boolean isPaidCollectionIntro() {
        return this.isPaidCollectionIntro;
    }

    public final boolean isPartialPreview() {
        return this.isPartialPreview;
    }

    public final Boolean isSubscriptionActive() {
        return this.isSubscriptionActive;
    }

    public final Object getCustomPayload(String str) {
        Map<String, Object> map = this.customPayloads;
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    public final void removeCustomPayload(String str) {
        Map<String, Object> map = this.customPayloads;
        if (map != null) {
            map.remove(str);
        }
    }

    public final void setBottomButtonText(String str) {
        this.bottomButtonText = str;
    }

    public final void setCollectionName(String str) {
        this.collectionName = str;
    }

    public final void setCoverUrl(UrlModel urlModel) {
        this.coverUrl = urlModel;
    }

    public final void setCustomPayloads(Map<String, Object> map) {
        this.customPayloads = map;
    }

    public final void setDiscountedPrice(PriceInfo priceInfo) {
        this.discountedPrice = priceInfo;
    }

    public final void setDisplayPrompt(int i) {
        this.displayPrompt = i;
    }

    public final void setEnableSingleVideoPurchase(boolean z) {
        this.enableSingleVideoPurchase = z;
    }

    public final void setHasPartialPurchased(boolean z) {
        this.hasPartialPurchased = z;
    }

    public final void setHasPurchased(boolean z) {
        this.hasPurchased = z;
    }

    public final void setHasPurchasedVideo(boolean z) {
        this.hasPurchasedVideo = z;
    }

    public final void setInnerFeedRecommend(Boolean bool) {
        this.isInnerFeedRecommend = bool;
    }

    public final void setLastPurchasedVideoInOrder(boolean z) {
        this.isLastPurchasedVideoInOrder = z;
    }

    public final void setMiniDramaCardInfo(MiniDramaCardInfo miniDramaCardInfo) {
        this.miniDramaCardInfo = miniDramaCardInfo;
    }

    public final void setMiniDramaInfo(String str) {
        this.miniDramaInfo = str;
    }

    public final void setPaidCollectionId(long j) {
        this.paidCollectionId = j;
    }

    public final void setPaidCollectionIntro(boolean z) {
        this.isPaidCollectionIntro = z;
    }

    public final void setPaidContentMiniDramaInfo(PaidContentMiniDramaInfo paidContentMiniDramaInfo) {
        this.paidContentMiniDramaInfo = paidContentMiniDramaInfo;
    }

    public final void setPaidContentResumeTimestamp(long j) {
        this.paidContentResumeTimestamp = j;
    }

    public final void setPartialPreview(boolean z) {
        this.isPartialPreview = z;
    }

    public final void setPrice(PriceInfo priceInfo) {
        this.price = priceInfo;
    }

    public final void setShouldShowBottomButton(Boolean bool) {
        this.shouldShowBottomButton = bool;
    }

    public final void setShouldShowInfoArea(Boolean bool) {
        this.shouldShowInfoArea = bool;
    }

    public final void setShouldShowPreview(boolean z) {
        this.shouldShowPreview = z;
    }

    public final void setSubscriptionActive(Boolean bool) {
        this.isSubscriptionActive = bool;
    }

    public final void setSubscriptionCycleType(String str) {
        this.subscriptionCycleType = str;
    }

    public final void setSubscriptionExpiredTime(Long l) {
        this.subscriptionExpiredTime = l;
    }

    public final void setSubscriptionStatus(String str) {
        this.subscriptionStatus = str;
    }

    public final void setVoucherId(String str) {
        this.voucherId = str;
    }

    public final void putCustomPayload(String str, Object obj) {
        Map<String, Object> map;
        if (this.customPayloads == null) {
            this.customPayloads = new ConcurrentHashMap();
        }
        if (obj != null && (map = this.customPayloads) != null) {
            map.put(str, obj);
        }
    }
}
