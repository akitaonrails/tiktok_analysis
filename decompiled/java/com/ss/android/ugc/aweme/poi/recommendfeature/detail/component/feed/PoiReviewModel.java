package com.ss.android.ugc.aweme.poi.recommendfeature.detail.component.feed;

import X.C09CT;
import X.C786410Ut5;
import com.bytedance.im.core.proto.UrlStruct;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiReviewModel implements Serializable {

    @C09CT("author")
    public final PoiReviewsApi.PoiReviewUserModel author;

    @C09CT("basic_info")
    public final PoiReviewsApi.PoiReviewBasicInfoModel basicInfo;

    @C09CT("brand_logo")
    public final UrlStruct brandLogo;

    @C09CT("brand_display_text")
    public final String brandName;

    @C09CT("content")
    public final PoiReviewsApi.PoiReviewContentModel content;

    @C09CT("dark_mode_brand_logo")
    public final UrlStruct darkModeBrandLogo;

    @C09CT("external_url")
    public final String externalUrl;

    @C09CT("author_self_has_more_review")
    public final boolean hasFoldedReviews;

    @C09CT("anonymous")
    public final boolean isAnonymous;

    @C09CT("poi_id")
    public final String poiId;

    @C09CT("review_id")
    public final String reviewId;

    @C09CT("server_param")
    public final String serverParam;

    @C09CT("review_source")
    public final Integer source;

    @C09CT("statistics")
    public final PoiReviewsApi.PoiReviewStatisticsModel statistics;

    @C09CT("review_status")
    public final PoiReviewsApi.PoiReviewStatusModel status;

    @C09CT("user_status")
    public final PoiReviewsApi.PoiReviewUserStatusModel userStatus;

    @C09CT("verified_display")
    public final String verifiedDisplay;

    public PoiReviewModel() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PoiReviewModel)) {
            return false;
        }
        PoiReviewModel poiReviewModel = (PoiReviewModel) obj;
        return Intrinsics.LJFF(this.poiId, poiReviewModel.poiId) && Intrinsics.LJFF(this.reviewId, poiReviewModel.reviewId) && Intrinsics.LJFF(this.author, poiReviewModel.author) && Intrinsics.LJFF(this.content, poiReviewModel.content) && Intrinsics.LJFF(this.basicInfo, poiReviewModel.basicInfo) && Intrinsics.LJFF(this.statistics, poiReviewModel.statistics) && Intrinsics.LJFF(this.userStatus, poiReviewModel.userStatus) && Intrinsics.LJFF(this.source, poiReviewModel.source) && Intrinsics.LJFF(this.brandName, poiReviewModel.brandName) && Intrinsics.LJFF(this.brandLogo, poiReviewModel.brandLogo) && Intrinsics.LJFF(this.darkModeBrandLogo, poiReviewModel.darkModeBrandLogo) && Intrinsics.LJFF(this.externalUrl, poiReviewModel.externalUrl) && Intrinsics.LJFF(this.status, poiReviewModel.status) && Intrinsics.LJFF(this.serverParam, poiReviewModel.serverParam) && this.isAnonymous == poiReviewModel.isAnonymous && this.hasFoldedReviews == poiReviewModel.hasFoldedReviews && Intrinsics.LJFF(this.verifiedDisplay, poiReviewModel.verifiedDisplay);
    }

    public int hashCode() {
        String str = this.poiId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.reviewId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        PoiReviewsApi.PoiReviewUserModel poiReviewUserModel = this.author;
        int iHashCode3 = (iHashCode2 + (poiReviewUserModel == null ? 0 : poiReviewUserModel.hashCode())) * 31;
        PoiReviewsApi.PoiReviewContentModel poiReviewContentModel = this.content;
        int iHashCode4 = (iHashCode3 + (poiReviewContentModel == null ? 0 : poiReviewContentModel.hashCode())) * 31;
        PoiReviewsApi.PoiReviewBasicInfoModel poiReviewBasicInfoModel = this.basicInfo;
        int iHashCode5 = (iHashCode4 + (poiReviewBasicInfoModel == null ? 0 : poiReviewBasicInfoModel.hashCode())) * 31;
        PoiReviewsApi.PoiReviewStatisticsModel poiReviewStatisticsModel = this.statistics;
        int iHashCode6 = (iHashCode5 + (poiReviewStatisticsModel == null ? 0 : poiReviewStatisticsModel.hashCode())) * 31;
        PoiReviewsApi.PoiReviewUserStatusModel poiReviewUserStatusModel = this.userStatus;
        int iHashCode7 = (iHashCode6 + (poiReviewUserStatusModel == null ? 0 : poiReviewUserStatusModel.hashCode())) * 31;
        Integer num = this.source;
        int iHashCode8 = (iHashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.brandName;
        int iHashCode9 = (iHashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        UrlStruct urlStruct = this.brandLogo;
        int iHashCode10 = (iHashCode9 + (urlStruct == null ? 0 : urlStruct.hashCode())) * 31;
        UrlStruct urlStruct2 = this.darkModeBrandLogo;
        int iHashCode11 = (iHashCode10 + (urlStruct2 == null ? 0 : urlStruct2.hashCode())) * 31;
        String str4 = this.externalUrl;
        int iHashCode12 = (iHashCode11 + (str4 == null ? 0 : str4.hashCode())) * 31;
        PoiReviewsApi.PoiReviewStatusModel poiReviewStatusModel = this.status;
        int iHashCode13 = (iHashCode12 + (poiReviewStatusModel == null ? 0 : poiReviewStatusModel.hashCode())) * 31;
        String str5 = this.serverParam;
        int iHashCode14 = (((((iHashCode13 + (str5 == null ? 0 : str5.hashCode())) * 31) + C786410Ut5.Z2(this.isAnonymous)) * 31) + C786410Ut5.Z2(this.hasFoldedReviews)) * 31;
        String str6 = this.verifiedDisplay;
        return iHashCode14 + (str6 != null ? str6.hashCode() : 0);
    }

    public String toString() {
        return "PoiReviewModel(poiId=" + this.poiId + ", reviewId=" + this.reviewId + ", author=" + this.author + ", content=" + this.content + ", basicInfo=" + this.basicInfo + ", statistics=" + this.statistics + ", userStatus=" + this.userStatus + ", source=" + this.source + ", brandName=" + this.brandName + ", brandLogo=" + this.brandLogo + ", darkModeBrandLogo=" + this.darkModeBrandLogo + ", externalUrl=" + this.externalUrl + ", status=" + this.status + ", serverParam=" + this.serverParam + ", isAnonymous=" + this.isAnonymous + ", hasFoldedReviews=" + this.hasFoldedReviews + ", verifiedDisplay=" + this.verifiedDisplay + ')';
    }

    public final boolean isAnonymous() {
        return this.isAnonymous;
    }

    public PoiReviewModel(String str, String str2, PoiReviewsApi.PoiReviewUserModel poiReviewUserModel, PoiReviewsApi.PoiReviewContentModel poiReviewContentModel, PoiReviewsApi.PoiReviewBasicInfoModel poiReviewBasicInfoModel, PoiReviewsApi.PoiReviewStatisticsModel poiReviewStatisticsModel, PoiReviewsApi.PoiReviewUserStatusModel poiReviewUserStatusModel, Integer num, String str3, UrlStruct urlStruct, UrlStruct urlStruct2, String str4, PoiReviewsApi.PoiReviewStatusModel poiReviewStatusModel, String str5, boolean z, boolean z2, String str6) {
        this.poiId = str;
        this.reviewId = str2;
        this.author = poiReviewUserModel;
        this.content = poiReviewContentModel;
        this.basicInfo = poiReviewBasicInfoModel;
        this.statistics = poiReviewStatisticsModel;
        this.userStatus = poiReviewUserStatusModel;
        this.source = num;
        this.brandName = str3;
        this.brandLogo = urlStruct;
        this.darkModeBrandLogo = urlStruct2;
        this.externalUrl = str4;
        this.status = poiReviewStatusModel;
        this.serverParam = str5;
        this.isAnonymous = z;
        this.hasFoldedReviews = z2;
        this.verifiedDisplay = str6;
    }
}
