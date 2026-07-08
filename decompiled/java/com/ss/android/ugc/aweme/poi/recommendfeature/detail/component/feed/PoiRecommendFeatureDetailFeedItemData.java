package com.ss.android.ugc.aweme.poi.recommendfeature.detail.component.feed;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.poi.activity.PoiActivityApi;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiRecommendFeatureDetailFeedItemData implements Serializable {

    @C09CT("aweme")
    public final Aweme aweme;

    @C09CT("aweme_cover")
    public final UrlModel awemeCover;

    @C09CT("aweme_topic_tag")
    public final String awemeTopicTag;

    @C09CT("aweme_topic_tag_en")
    public final String awemeTopicTagEn;

    @C09CT("banners")
    public final List<PoiActivityApi.PoiBannerInfo> banners;

    @C09CT("collect_info")
    public final String collectInfo;

    @C09CT("crop_aweme_cover")
    public final UrlModel cropAwemeCover;

    @C09CT("item_type")
    public final Integer itemType;

    @C09CT("media_type")
    public final Integer mediaType;

    @C09CT("review_v2")
    public final PoiReviewModel review;

    @C09CT("review_image_index")
    public final Integer reviewImageIndex;

    public PoiRecommendFeatureDetailFeedItemData() {
        this(null, null, null, null, null, null, null, null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PoiRecommendFeatureDetailFeedItemData)) {
            return false;
        }
        PoiRecommendFeatureDetailFeedItemData poiRecommendFeatureDetailFeedItemData = (PoiRecommendFeatureDetailFeedItemData) obj;
        return Intrinsics.LJFF(this.itemType, poiRecommendFeatureDetailFeedItemData.itemType) && Intrinsics.LJFF(this.aweme, poiRecommendFeatureDetailFeedItemData.aweme) && Intrinsics.LJFF(this.review, poiRecommendFeatureDetailFeedItemData.review) && Intrinsics.LJFF(this.banners, poiRecommendFeatureDetailFeedItemData.banners) && Intrinsics.LJFF(this.awemeCover, poiRecommendFeatureDetailFeedItemData.awemeCover) && Intrinsics.LJFF(this.awemeTopicTag, poiRecommendFeatureDetailFeedItemData.awemeTopicTag) && Intrinsics.LJFF(this.mediaType, poiRecommendFeatureDetailFeedItemData.mediaType) && Intrinsics.LJFF(this.cropAwemeCover, poiRecommendFeatureDetailFeedItemData.cropAwemeCover) && Intrinsics.LJFF(this.collectInfo, poiRecommendFeatureDetailFeedItemData.collectInfo) && Intrinsics.LJFF(this.awemeTopicTagEn, poiRecommendFeatureDetailFeedItemData.awemeTopicTagEn) && Intrinsics.LJFF(this.reviewImageIndex, poiRecommendFeatureDetailFeedItemData.reviewImageIndex);
    }

    public int hashCode() {
        Integer num = this.itemType;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Aweme aweme = this.aweme;
        int iHashCode2 = (iHashCode + (aweme == null ? 0 : aweme.hashCode())) * 31;
        PoiReviewModel poiReviewModel = this.review;
        int iHashCode3 = (iHashCode2 + (poiReviewModel == null ? 0 : poiReviewModel.hashCode())) * 31;
        List<PoiActivityApi.PoiBannerInfo> list = this.banners;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        UrlModel urlModel = this.awemeCover;
        int iHashCode5 = (iHashCode4 + (urlModel == null ? 0 : urlModel.hashCode())) * 31;
        String str = this.awemeTopicTag;
        int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.mediaType;
        int iHashCode7 = (iHashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        UrlModel urlModel2 = this.cropAwemeCover;
        int iHashCode8 = (iHashCode7 + (urlModel2 == null ? 0 : urlModel2.hashCode())) * 31;
        String str2 = this.collectInfo;
        int iHashCode9 = (iHashCode8 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.awemeTopicTagEn;
        int iHashCode10 = (iHashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num3 = this.reviewImageIndex;
        return iHashCode10 + (num3 != null ? num3.hashCode() : 0);
    }

    public String toString() {
        return "PoiRecommendFeatureDetailFeedItemData(itemType=" + this.itemType + ", aweme=" + this.aweme + ", review=" + this.review + ", banners=" + this.banners + ", awemeCover=" + this.awemeCover + ", awemeTopicTag=" + this.awemeTopicTag + ", mediaType=" + this.mediaType + ", cropAwemeCover=" + this.cropAwemeCover + ", collectInfo=" + this.collectInfo + ", awemeTopicTagEn=" + this.awemeTopicTagEn + ", reviewImageIndex=" + this.reviewImageIndex + ')';
    }

    public final boolean hasCropAwemeCoverImage() {
        UrlModel urlModel = this.cropAwemeCover;
        if (urlModel == null) {
            return false;
        }
        List<String> urlList = urlModel.getUrlList();
        if (urlList != null && !urlList.isEmpty()) {
            for (String str : urlList) {
                if (str != null && !a0.LJJJIL(str)) {
                    return true;
                }
            }
        }
        String uri = urlModel.getUri();
        return (uri == null || a0.LJJJIL(uri)) ? false : true;
    }

    public PoiRecommendFeatureDetailFeedItemData(Integer num, Aweme aweme, PoiReviewModel poiReviewModel, List<PoiActivityApi.PoiBannerInfo> list, UrlModel urlModel, String str, Integer num2, UrlModel urlModel2, String str2, String str3, Integer num3) {
        this.itemType = num;
        this.aweme = aweme;
        this.review = poiReviewModel;
        this.banners = list;
        this.awemeCover = urlModel;
        this.awemeTopicTag = str;
        this.mediaType = num2;
        this.cropAwemeCover = urlModel2;
        this.collectInfo = str2;
        this.awemeTopicTagEn = str3;
        this.reviewImageIndex = num3;
    }
}
