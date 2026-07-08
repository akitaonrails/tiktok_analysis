package com.ss.android.ugc.aweme.poi.uiwidget.gallery.reviews;

import X.C09CT;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiReviewsGalleryData implements Serializable {

    @C09CT("author")
    public PoiReviewsApi.PoiReviewUserModel author;

    @C09CT("bottom_desc")
    public final String bottomDesc;

    @C09CT("content")
    public final PoiReviewsApi.PoiReviewContentModel content;

    @C09CT("has_translate")
    public final Boolean hasTranslate;

    @C09CT("anonymous")
    public final Boolean isAnonymous;

    @C09CT("poi_id")
    public final String poiId;

    @C09CT("review_content")
    public final String reviewContent;

    @C09CT("review_id")
    public final String reviewId;

    @C09CT("review_order")
    public final Integer reviewOrder;

    @C09CT("server_param")
    public final String serverParam;

    @C09CT("review_source")
    public final Integer source;

    @C09CT("statistics")
    public final PoiReviewsApi.PoiReviewStatisticsModel statistics;

    @C09CT("user_status")
    public final PoiReviewsApi.PoiReviewUserStatusModel userStatus;

    public PoiReviewsGalleryData() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public final PoiReviewsGalleryData copy(PoiReviewsApi.PoiReviewContentModel poiReviewContentModel, PoiReviewsApi.PoiReviewUserModel poiReviewUserModel, String str, String str2, PoiReviewsApi.PoiReviewStatisticsModel poiReviewStatisticsModel, Integer num, Boolean bool, PoiReviewsApi.PoiReviewUserStatusModel poiReviewUserStatusModel, String str3, String str4, Boolean bool2, Integer num2, String str5) {
        return new PoiReviewsGalleryData(poiReviewContentModel, poiReviewUserModel, str, str2, poiReviewStatisticsModel, num, bool, poiReviewUserStatusModel, str3, str4, bool2, num2, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PoiReviewsGalleryData)) {
            return false;
        }
        PoiReviewsGalleryData poiReviewsGalleryData = (PoiReviewsGalleryData) obj;
        return Intrinsics.LJFF(this.content, poiReviewsGalleryData.content) && Intrinsics.LJFF(this.author, poiReviewsGalleryData.author) && Intrinsics.LJFF(this.reviewId, poiReviewsGalleryData.reviewId) && Intrinsics.LJFF(this.poiId, poiReviewsGalleryData.poiId) && Intrinsics.LJFF(this.statistics, poiReviewsGalleryData.statistics) && Intrinsics.LJFF(this.source, poiReviewsGalleryData.source) && Intrinsics.LJFF(this.isAnonymous, poiReviewsGalleryData.isAnonymous) && Intrinsics.LJFF(this.userStatus, poiReviewsGalleryData.userStatus) && Intrinsics.LJFF(this.serverParam, poiReviewsGalleryData.serverParam) && Intrinsics.LJFF(this.reviewContent, poiReviewsGalleryData.reviewContent) && Intrinsics.LJFF(this.hasTranslate, poiReviewsGalleryData.hasTranslate) && Intrinsics.LJFF(this.reviewOrder, poiReviewsGalleryData.reviewOrder) && Intrinsics.LJFF(this.bottomDesc, poiReviewsGalleryData.bottomDesc);
    }

    public final Boolean isAnonymous() {
        return this.isAnonymous;
    }

    public final void setAuthor(PoiReviewsApi.PoiReviewUserModel poiReviewUserModel) {
        this.author = poiReviewUserModel;
    }

    public PoiReviewsGalleryData(PoiReviewsApi.PoiReviewContentModel poiReviewContentModel, PoiReviewsApi.PoiReviewUserModel poiReviewUserModel, String str, String str2, PoiReviewsApi.PoiReviewStatisticsModel poiReviewStatisticsModel, Integer num, Boolean bool, PoiReviewsApi.PoiReviewUserStatusModel poiReviewUserStatusModel, String str3, String str4, Boolean bool2, Integer num2, String str5) {
        this.content = poiReviewContentModel;
        this.author = poiReviewUserModel;
        this.reviewId = str;
        this.poiId = str2;
        this.statistics = poiReviewStatisticsModel;
        this.source = num;
        this.isAnonymous = bool;
        this.userStatus = poiReviewUserStatusModel;
        this.serverParam = str3;
        this.reviewContent = str4;
        this.hasTranslate = bool2;
        this.reviewOrder = num2;
        this.bottomDesc = str5;
    }
}
