package com.ss.android.ugc.aweme.poi.quiz.data;

import X.C09CT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiQuizItem implements Serializable {

    @C09CT("category_name")
    public final String categoryName;

    @C09CT("city_code")
    public final String cityCode;

    @C09CT("claim_store_status")
    public final String claimStoreStatus;

    @C09CT("collect_info")
    public final String collectInfo;

    @C09CT("detail_page_poi_display")
    public final String detailPagePoiDisplay;

    @C09CT("formatted_address")
    public final String formattedAddress;

    @C09CT("is_collected")
    public final Boolean isCollected;

    @C09CT("is_finish_poi_quiz")
    public Boolean isFinishPoiQuiz;

    @C09CT("key_category")
    public final String keyCategory;

    @C09CT("location")
    public final Location location;

    @C09CT("poi_header_img")
    public final String poiHeaderImg;

    @C09CT("poi_id")
    public final String poiId;

    @C09CT("poi_name")
    public final String poiName;

    @C09CT("poi_title_finish_img")
    public final String poiTitleFinishImg;

    @C09CT("poi_title_img")
    public final String poiTitleImg;

    public PoiQuizItem() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PoiQuizItem)) {
            return false;
        }
        PoiQuizItem poiQuizItem = (PoiQuizItem) obj;
        return Intrinsics.LJFF(this.categoryName, poiQuizItem.categoryName) && Intrinsics.LJFF(this.cityCode, poiQuizItem.cityCode) && Intrinsics.LJFF(this.claimStoreStatus, poiQuizItem.claimStoreStatus) && Intrinsics.LJFF(this.collectInfo, poiQuizItem.collectInfo) && Intrinsics.LJFF(this.detailPagePoiDisplay, poiQuizItem.detailPagePoiDisplay) && Intrinsics.LJFF(this.isCollected, poiQuizItem.isCollected) && Intrinsics.LJFF(this.keyCategory, poiQuizItem.keyCategory) && Intrinsics.LJFF(this.location, poiQuizItem.location) && Intrinsics.LJFF(this.poiTitleImg, poiQuizItem.poiTitleImg) && Intrinsics.LJFF(this.poiTitleFinishImg, poiQuizItem.poiTitleFinishImg) && Intrinsics.LJFF(this.isFinishPoiQuiz, poiQuizItem.isFinishPoiQuiz) && Intrinsics.LJFF(this.formattedAddress, poiQuizItem.formattedAddress) && Intrinsics.LJFF(this.poiHeaderImg, poiQuizItem.poiHeaderImg) && Intrinsics.LJFF(this.poiId, poiQuizItem.poiId) && Intrinsics.LJFF(this.poiName, poiQuizItem.poiName);
    }

    public int hashCode() {
        String str = this.categoryName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.cityCode;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.claimStoreStatus;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.collectInfo;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.detailPagePoiDisplay;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool = this.isCollected;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str6 = this.keyCategory;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Location location = this.location;
        int iHashCode8 = (iHashCode7 + (location == null ? 0 : location.hashCode())) * 31;
        String str7 = this.poiTitleImg;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.poiTitleFinishImg;
        int iHashCode10 = (iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Boolean bool2 = this.isFinishPoiQuiz;
        int iHashCode11 = (iHashCode10 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str9 = this.formattedAddress;
        int iHashCode12 = (iHashCode11 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.poiHeaderImg;
        int iHashCode13 = (iHashCode12 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.poiId;
        int iHashCode14 = (iHashCode13 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.poiName;
        return iHashCode14 + (str12 != null ? str12.hashCode() : 0);
    }

    public final Boolean isCollected() {
        return this.isCollected;
    }

    public final Boolean isFinishPoiQuiz() {
        return this.isFinishPoiQuiz;
    }

    public final void setFinishPoiQuiz(Boolean bool) {
        this.isFinishPoiQuiz = bool;
    }

    public PoiQuizItem(String str, String str2, String str3, String str4, String str5, Boolean bool, String str6, Location location, String str7, String str8, Boolean bool2, String str9, String str10, String str11, String str12) {
        this.categoryName = str;
        this.cityCode = str2;
        this.claimStoreStatus = str3;
        this.collectInfo = str4;
        this.detailPagePoiDisplay = str5;
        this.isCollected = bool;
        this.keyCategory = str6;
        this.location = location;
        this.poiTitleImg = str7;
        this.poiTitleFinishImg = str8;
        this.isFinishPoiQuiz = bool2;
        this.formattedAddress = str9;
        this.poiHeaderImg = str10;
        this.poiId = str11;
        this.poiName = str12;
    }
}
