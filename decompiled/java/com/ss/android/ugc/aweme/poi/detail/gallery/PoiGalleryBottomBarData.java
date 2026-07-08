package com.ss.android.ugc.aweme.poi.detail.gallery;

import X.C1188650h2N;
import X.C786410Ut5;
import X.InterfaceC111300bX;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiGalleryBottomBarData implements InterfaceC111300bX {
    public static final C1188650h2N Companion = new Object() { // from class: X.0h2N
    };
    public final int bottomBarStyle;
    public final String categoryName;
    public final String collectInfo;
    public final String enterFrom;
    public final Long favCnt;
    public final String headImgUrl;
    public final String initialPoiEnterFrom;
    public final String initialPoiEnterMethod;
    public final String initialPoiFromGroupId;
    public final boolean isCollected;
    public final String locationDesc;
    public final String poiAddress;
    public final String poiId;
    public final String poiName;
    public final PoiReviewsApi.PoiReviewSummaryModel reviewSummary;

    public final PoiGalleryBottomBarData copy(String str, String str2, PoiReviewsApi.PoiReviewSummaryModel poiReviewSummaryModel, Long l, String str3, String str4, boolean z, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i) {
        return new PoiGalleryBottomBarData(str, str2, poiReviewSummaryModel, l, str3, str4, z, str5, str6, str7, str8, str9, str10, str11, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PoiGalleryBottomBarData)) {
            return false;
        }
        PoiGalleryBottomBarData poiGalleryBottomBarData = (PoiGalleryBottomBarData) obj;
        return Intrinsics.LJFF(this.poiName, poiGalleryBottomBarData.poiName) && Intrinsics.LJFF(this.headImgUrl, poiGalleryBottomBarData.headImgUrl) && Intrinsics.LJFF(this.reviewSummary, poiGalleryBottomBarData.reviewSummary) && Intrinsics.LJFF(this.favCnt, poiGalleryBottomBarData.favCnt) && Intrinsics.LJFF(this.categoryName, poiGalleryBottomBarData.categoryName) && Intrinsics.LJFF(this.locationDesc, poiGalleryBottomBarData.locationDesc) && this.isCollected == poiGalleryBottomBarData.isCollected && Intrinsics.LJFF(this.poiId, poiGalleryBottomBarData.poiId) && Intrinsics.LJFF(this.poiAddress, poiGalleryBottomBarData.poiAddress) && Intrinsics.LJFF(this.collectInfo, poiGalleryBottomBarData.collectInfo) && Intrinsics.LJFF(this.initialPoiEnterFrom, poiGalleryBottomBarData.initialPoiEnterFrom) && Intrinsics.LJFF(this.initialPoiEnterMethod, poiGalleryBottomBarData.initialPoiEnterMethod) && Intrinsics.LJFF(this.initialPoiFromGroupId, poiGalleryBottomBarData.initialPoiFromGroupId) && Intrinsics.LJFF(this.enterFrom, poiGalleryBottomBarData.enterFrom) && this.bottomBarStyle == poiGalleryBottomBarData.bottomBarStyle;
    }

    public int hashCode() {
        String str = this.poiName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.headImgUrl;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        PoiReviewsApi.PoiReviewSummaryModel poiReviewSummaryModel = this.reviewSummary;
        int iHashCode3 = (iHashCode2 + (poiReviewSummaryModel == null ? 0 : poiReviewSummaryModel.hashCode())) * 31;
        Long l = this.favCnt;
        int iHashCode4 = (iHashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        String str3 = this.categoryName;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.locationDesc;
        int iHashCode6 = (((iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31) + C786410Ut5.Z2(this.isCollected)) * 31;
        String str5 = this.poiId;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.poiAddress;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.collectInfo;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.initialPoiEnterFrom;
        int iHashCode10 = (iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.initialPoiEnterMethod;
        int iHashCode11 = (iHashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.initialPoiFromGroupId;
        int iHashCode12 = (iHashCode11 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.enterFrom;
        return ((iHashCode12 + (str11 != null ? str11.hashCode() : 0)) * 31) + this.bottomBarStyle;
    }

    public String toString() {
        return "PoiGalleryBottomBarData(poiName=" + this.poiName + ", headImgUrl=" + this.headImgUrl + ", reviewSummary=" + this.reviewSummary + ", favCnt=" + this.favCnt + ", categoryName=" + this.categoryName + ", locationDesc=" + this.locationDesc + ", isCollected=" + this.isCollected + ", poiId=" + this.poiId + ", poiAddress=" + this.poiAddress + ", collectInfo=" + this.collectInfo + ", initialPoiEnterFrom=" + this.initialPoiEnterFrom + ", initialPoiEnterMethod=" + this.initialPoiEnterMethod + ", initialPoiFromGroupId=" + this.initialPoiFromGroupId + ", enterFrom=" + this.enterFrom + ", bottomBarStyle=" + this.bottomBarStyle + ')';
    }

    public final int getBottomBarStyle() {
        return this.bottomBarStyle;
    }

    public final String getCategoryName() {
        return this.categoryName;
    }

    public final String getCollectInfo() {
        return this.collectInfo;
    }

    public final String getEnterFrom() {
        return this.enterFrom;
    }

    public final Long getFavCnt() {
        return this.favCnt;
    }

    public final String getHeadImgUrl() {
        return this.headImgUrl;
    }

    public final String getInitialPoiEnterFrom() {
        return this.initialPoiEnterFrom;
    }

    public final String getInitialPoiEnterMethod() {
        return this.initialPoiEnterMethod;
    }

    public final String getInitialPoiFromGroupId() {
        return this.initialPoiFromGroupId;
    }

    public final String getLocationDesc() {
        return this.locationDesc;
    }

    public final String getPoiAddress() {
        return this.poiAddress;
    }

    public final String getPoiId() {
        return this.poiId;
    }

    public final String getPoiName() {
        return this.poiName;
    }

    public final PoiReviewsApi.PoiReviewSummaryModel getReviewSummary() {
        return this.reviewSummary;
    }

    public final boolean isCollected() {
        return this.isCollected;
    }

    public PoiGalleryBottomBarData(String str, String str2, PoiReviewsApi.PoiReviewSummaryModel poiReviewSummaryModel, Long l, String str3, String str4, boolean z, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i) {
        this.poiName = str;
        this.headImgUrl = str2;
        this.reviewSummary = poiReviewSummaryModel;
        this.favCnt = l;
        this.categoryName = str3;
        this.locationDesc = str4;
        this.isCollected = z;
        this.poiId = str5;
        this.poiAddress = str6;
        this.collectInfo = str7;
        this.initialPoiEnterFrom = str8;
        this.initialPoiEnterMethod = str9;
        this.initialPoiFromGroupId = str10;
        this.enterFrom = str11;
        this.bottomBarStyle = i;
    }
}
