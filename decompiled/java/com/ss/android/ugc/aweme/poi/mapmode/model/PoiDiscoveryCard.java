package com.ss.android.ugc.aweme.poi.mapmode.model;

import X.C09CT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.poi.detail.cells.AddressInfo;
import com.ss.android.ugc.aweme.poi.detail.cells.FeedProductInfo;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiDetailTag;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiDetailTagStyle;
import com.ss.android.ugc.aweme.poi.detail.nearby.PoiDistance;
import com.ss.android.ugc.aweme.poi.mapdetail.model.HotelShelfInfo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiDiscoveryCard implements Serializable {

    @C09CT("address_info")
    public final AddressInfo addressInfo;

    @C09CT("average_price")
    public final String averagePrice;

    @C09CT("category_for_marker")
    public final String categoryForMarker;

    @C09CT("category_name")
    public final String categoryName;

    @C09CT("city_code")
    public final String cityCode;

    @C09CT("collect_info")
    public final String collectInfo;

    @C09CT("cover_img")
    public final String coverImg;

    @C09CT("estimated_distance_for_show")
    public final String estimatedDistanceForShow;

    @C09CT("exact_distance_for_show")
    public final String exactDistanceForShow;

    @C09CT("formatted_address")
    public final String formattedAddress;

    @C09CT("poi_highlight_tags")
    public final List<PoiDetailTag> highlightTags;

    @C09CT("hotel_shelf_info")
    public final HotelShelfInfo hotelShelfInfo;

    @C09CT("is_claimed")
    public final boolean isClaimed;

    @C09CT("is_collected")
    public Boolean isCollected;

    @C09CT("is_hotel_marker_special")
    public final Boolean isHotelMarkerSpecial;

    @C09CT("is_poi_has_product")
    public final Boolean isPoiHasProduct;

    @C09CT("key_category")
    public final String keyCategory;

    @C09CT("location")
    public final Location location;

    @C09CT("no_rating")
    public final Boolean noRating;
    public int originalIndex;

    @C09CT("poi_backend_type")
    public final String poiBackendType;

    @C09CT("poi_crop_header_img")
    public final String poiCropHeaderImg;

    @C09CT("poi_detail_tag_style_map")
    public final Map<String, PoiDetailTagStyle> poiDetailTagStyleMap;

    @C09CT("detail_page_poi_display")
    public final String poiDisplay;

    @C09CT("detail_page_poi_distance")
    public final PoiDistance poiDistance;

    @C09CT("poi_distance_for_show")
    public final String poiDistanceForShow;

    @C09CT("poi_distance_from_center")
    public final String poiDistanceFromCenter;

    @C09CT("poi_header_img")
    public final String poiHeaderImg;

    @C09CT("poi_id")
    public final String poiId;

    @C09CT("poi_map_pin_info")
    public final PoiMapPinInfo poiMapPinInfo;

    @C09CT("poi_name")
    public final String poiName;

    @C09CT("poi_tags")
    public final List<PoiDetailTag> poiTags;

    @C09CT("poi_title_img")
    public final String poiTitleImg;

    @C09CT("poi_trust_tags")
    public final List<PoiDetailTag> poiTrustTag;

    @C09CT("product_info")
    public final FeedProductInfo productInfo;

    @C09CT("real_time_fav_cnt")
    public final Long realTimeFavCnt;

    @C09CT("region_code")
    public final String regionCode;

    @C09CT("review_count")
    public final String reviewCount;

    @C09CT("review_max_score")
    public final String reviewMaxScore;

    @C09CT("review_score")
    public final String reviewScore;

    @C09CT("schema")
    public final String schema;

    @C09CT("sort_distance_meter")
    public final Long sortDistanceMeter;

    @C09CT("time_for_show")
    public final String timeForShow;

    @C09CT("type_level")
    public final String typeLevel;

    @C09CT("upper_tag")
    public final PoiDetailTag upperTag;

    @C09CT("video_count")
    public final Integer videoCount;

    @C09CT("video_count_for_show")
    public final String videoCountForShow;

    @C09CT("video_list")
    public final ArrayList<Aweme> videoList;

    public PoiDiscoveryCard() {
        ArrayList arrayList = new ArrayList();
        Double dValueOf = Double.valueOf(0.0d);
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, arrayList, null, null, null, new Location(dValueOf, dValueOf), null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, null, null, null, null);
    }

    public final PoiDiscoveryCard copy(String str, String str2, String str3, String str4, String str5, Integer num, String str6, String str7, String str8, String str9, String str10, Boolean bool, String str11, ArrayList<Aweme> arrayList, String str12, String str13, String str14, Location location, String str15, boolean z, String str16, String str17, String str18, String str19, List<PoiDetailTag> list, List<PoiDetailTag> list2, Map<String, PoiDetailTagStyle> map, String str20, String str21, String str22, String str23, Long l, String str24, PoiDistance poiDistance, Boolean bool2, Long l2, List<PoiDetailTag> list3, String str25, Boolean bool3, HotelShelfInfo hotelShelfInfo, PoiMapPinInfo poiMapPinInfo, String str26, Boolean bool4, int i, PoiDetailTag poiDetailTag, AddressInfo addressInfo, String str27, FeedProductInfo feedProductInfo) {
        return new PoiDiscoveryCard(str, str2, str3, str4, str5, num, str6, str7, str8, str9, str10, bool, str11, arrayList, str12, str13, str14, location, str15, z, str16, str17, str18, str19, list, list2, map, str20, str21, str22, str23, l, str24, poiDistance, bool2, l2, list3, str25, bool3, hotelShelfInfo, poiMapPinInfo, str26, bool4, i, poiDetailTag, addressInfo, str27, feedProductInfo);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PoiDiscoveryCard)) {
            return false;
        }
        PoiDiscoveryCard poiDiscoveryCard = (PoiDiscoveryCard) obj;
        return Intrinsics.LJFF(this.poiId, poiDiscoveryCard.poiId) && Intrinsics.LJFF(this.schema, poiDiscoveryCard.schema) && Intrinsics.LJFF(this.poiName, poiDiscoveryCard.poiName) && Intrinsics.LJFF(this.categoryName, poiDiscoveryCard.categoryName) && Intrinsics.LJFF(this.averagePrice, poiDiscoveryCard.averagePrice) && Intrinsics.LJFF(this.videoCount, poiDiscoveryCard.videoCount) && Intrinsics.LJFF(this.videoCountForShow, poiDiscoveryCard.videoCountForShow) && Intrinsics.LJFF(this.timeForShow, poiDiscoveryCard.timeForShow) && Intrinsics.LJFF(this.exactDistanceForShow, poiDiscoveryCard.exactDistanceForShow) && Intrinsics.LJFF(this.estimatedDistanceForShow, poiDiscoveryCard.estimatedDistanceForShow) && Intrinsics.LJFF(this.formattedAddress, poiDiscoveryCard.formattedAddress) && Intrinsics.LJFF(this.isCollected, poiDiscoveryCard.isCollected) && Intrinsics.LJFF(this.collectInfo, poiDiscoveryCard.collectInfo) && Intrinsics.LJFF(this.videoList, poiDiscoveryCard.videoList) && Intrinsics.LJFF(this.regionCode, poiDiscoveryCard.regionCode) && Intrinsics.LJFF(this.cityCode, poiDiscoveryCard.cityCode) && Intrinsics.LJFF(this.typeLevel, poiDiscoveryCard.typeLevel) && Intrinsics.LJFF(this.location, poiDiscoveryCard.location) && Intrinsics.LJFF(this.poiTitleImg, poiDiscoveryCard.poiTitleImg) && this.isClaimed == poiDiscoveryCard.isClaimed && Intrinsics.LJFF(this.poiHeaderImg, poiDiscoveryCard.poiHeaderImg) && Intrinsics.LJFF(this.reviewScore, poiDiscoveryCard.reviewScore) && Intrinsics.LJFF(this.reviewMaxScore, poiDiscoveryCard.reviewMaxScore) && Intrinsics.LJFF(this.reviewCount, poiDiscoveryCard.reviewCount) && Intrinsics.LJFF(this.highlightTags, poiDiscoveryCard.highlightTags) && Intrinsics.LJFF(this.poiTags, poiDiscoveryCard.poiTags) && Intrinsics.LJFF(this.poiDetailTagStyleMap, poiDiscoveryCard.poiDetailTagStyleMap) && Intrinsics.LJFF(this.poiDistanceForShow, poiDiscoveryCard.poiDistanceForShow) && Intrinsics.LJFF(this.poiDistanceFromCenter, poiDiscoveryCard.poiDistanceFromCenter) && Intrinsics.LJFF(this.keyCategory, poiDiscoveryCard.keyCategory) && Intrinsics.LJFF(this.poiDisplay, poiDiscoveryCard.poiDisplay) && Intrinsics.LJFF(this.realTimeFavCnt, poiDiscoveryCard.realTimeFavCnt) && Intrinsics.LJFF(this.poiBackendType, poiDiscoveryCard.poiBackendType) && Intrinsics.LJFF(this.poiDistance, poiDiscoveryCard.poiDistance) && Intrinsics.LJFF(this.noRating, poiDiscoveryCard.noRating) && Intrinsics.LJFF(this.sortDistanceMeter, poiDiscoveryCard.sortDistanceMeter) && Intrinsics.LJFF(this.poiTrustTag, poiDiscoveryCard.poiTrustTag) && Intrinsics.LJFF(this.poiCropHeaderImg, poiDiscoveryCard.poiCropHeaderImg) && Intrinsics.LJFF(this.isPoiHasProduct, poiDiscoveryCard.isPoiHasProduct) && Intrinsics.LJFF(this.hotelShelfInfo, poiDiscoveryCard.hotelShelfInfo) && Intrinsics.LJFF(this.poiMapPinInfo, poiDiscoveryCard.poiMapPinInfo) && Intrinsics.LJFF(this.categoryForMarker, poiDiscoveryCard.categoryForMarker) && Intrinsics.LJFF(this.isHotelMarkerSpecial, poiDiscoveryCard.isHotelMarkerSpecial) && this.originalIndex == poiDiscoveryCard.originalIndex && Intrinsics.LJFF(this.upperTag, poiDiscoveryCard.upperTag) && Intrinsics.LJFF(this.addressInfo, poiDiscoveryCard.addressInfo) && Intrinsics.LJFF(this.coverImg, poiDiscoveryCard.coverImg) && Intrinsics.LJFF(this.productInfo, poiDiscoveryCard.productInfo);
    }

    public int hashCode() {
        String str = this.poiId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.schema;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.poiName;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.categoryName;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.averagePrice;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.videoCount;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        String str6 = this.videoCountForShow;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.timeForShow;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.exactDistanceForShow;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.estimatedDistanceForShow;
        int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.formattedAddress;
        int iHashCode11 = (iHashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Boolean bool = this.isCollected;
        int iHashCode12 = (iHashCode11 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str11 = this.collectInfo;
        int iHashCode13 = (((iHashCode12 + (str11 == null ? 0 : str11.hashCode())) * 31) + this.videoList.hashCode()) * 31;
        String str12 = this.regionCode;
        int iHashCode14 = (iHashCode13 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.cityCode;
        int iHashCode15 = (iHashCode14 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.typeLevel;
        int iHashCode16 = (iHashCode15 + (str14 == null ? 0 : str14.hashCode())) * 31;
        Location location = this.location;
        int iHashCode17 = (iHashCode16 + (location == null ? 0 : location.hashCode())) * 31;
        String str15 = this.poiTitleImg;
        int iHashCode18 = (((iHashCode17 + (str15 == null ? 0 : str15.hashCode())) * 31) + C786410Ut5.Z2(this.isClaimed)) * 31;
        String str16 = this.poiHeaderImg;
        int iHashCode19 = (iHashCode18 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.reviewScore;
        int iHashCode20 = (iHashCode19 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.reviewMaxScore;
        int iHashCode21 = (iHashCode20 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.reviewCount;
        int iHashCode22 = (iHashCode21 + (str19 == null ? 0 : str19.hashCode())) * 31;
        List<PoiDetailTag> list = this.highlightTags;
        int iHashCode23 = (iHashCode22 + (list == null ? 0 : list.hashCode())) * 31;
        List<PoiDetailTag> list2 = this.poiTags;
        int iHashCode24 = (iHashCode23 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Map<String, PoiDetailTagStyle> map = this.poiDetailTagStyleMap;
        int iHashCode25 = (iHashCode24 + (map == null ? 0 : map.hashCode())) * 31;
        String str20 = this.poiDistanceForShow;
        int iHashCode26 = (iHashCode25 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.poiDistanceFromCenter;
        int iHashCode27 = (iHashCode26 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.keyCategory;
        int iHashCode28 = (iHashCode27 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.poiDisplay;
        int iHashCode29 = (iHashCode28 + (str23 == null ? 0 : str23.hashCode())) * 31;
        Long l = this.realTimeFavCnt;
        int iHashCode30 = (iHashCode29 + (l == null ? 0 : l.hashCode())) * 31;
        String str24 = this.poiBackendType;
        int iHashCode31 = (iHashCode30 + (str24 == null ? 0 : str24.hashCode())) * 31;
        PoiDistance poiDistance = this.poiDistance;
        int iHashCode32 = (iHashCode31 + (poiDistance == null ? 0 : poiDistance.hashCode())) * 31;
        Boolean bool2 = this.noRating;
        int iHashCode33 = (iHashCode32 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Long l2 = this.sortDistanceMeter;
        int iHashCode34 = (iHashCode33 + (l2 == null ? 0 : l2.hashCode())) * 31;
        List<PoiDetailTag> list3 = this.poiTrustTag;
        int iHashCode35 = (iHashCode34 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str25 = this.poiCropHeaderImg;
        int iHashCode36 = (iHashCode35 + (str25 == null ? 0 : str25.hashCode())) * 31;
        Boolean bool3 = this.isPoiHasProduct;
        int iHashCode37 = (iHashCode36 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        HotelShelfInfo hotelShelfInfo = this.hotelShelfInfo;
        int iHashCode38 = (iHashCode37 + (hotelShelfInfo == null ? 0 : hotelShelfInfo.hashCode())) * 31;
        PoiMapPinInfo poiMapPinInfo = this.poiMapPinInfo;
        int iHashCode39 = (iHashCode38 + (poiMapPinInfo == null ? 0 : poiMapPinInfo.hashCode())) * 31;
        String str26 = this.categoryForMarker;
        int iHashCode40 = (iHashCode39 + (str26 == null ? 0 : str26.hashCode())) * 31;
        Boolean bool4 = this.isHotelMarkerSpecial;
        int iHashCode41 = (((iHashCode40 + (bool4 == null ? 0 : bool4.hashCode())) * 31) + this.originalIndex) * 31;
        PoiDetailTag poiDetailTag = this.upperTag;
        int iHashCode42 = (iHashCode41 + (poiDetailTag == null ? 0 : poiDetailTag.hashCode())) * 31;
        AddressInfo addressInfo = this.addressInfo;
        int iHashCode43 = (iHashCode42 + (addressInfo == null ? 0 : addressInfo.hashCode())) * 31;
        String str27 = this.coverImg;
        int iHashCode44 = (iHashCode43 + (str27 == null ? 0 : str27.hashCode())) * 31;
        FeedProductInfo feedProductInfo = this.productInfo;
        return iHashCode44 + (feedProductInfo != null ? feedProductInfo.hashCode() : 0);
    }

    public String toString() {
        return "PoiDiscoveryCard(poiId=" + this.poiId + ", schema=" + this.schema + ", poiName=" + this.poiName + ", categoryName=" + this.categoryName + ", averagePrice=" + this.averagePrice + ", videoCount=" + this.videoCount + ", videoCountForShow=" + this.videoCountForShow + ", timeForShow=" + this.timeForShow + ", exactDistanceForShow=" + this.exactDistanceForShow + ", estimatedDistanceForShow=" + this.estimatedDistanceForShow + ", formattedAddress=" + this.formattedAddress + ", isCollected=" + this.isCollected + ", collectInfo=" + this.collectInfo + ", videoList=" + this.videoList + ", regionCode=" + this.regionCode + ", cityCode=" + this.cityCode + ", typeLevel=" + this.typeLevel + ", location=" + this.location + ", poiTitleImg=" + this.poiTitleImg + ", isClaimed=" + this.isClaimed + ", poiHeaderImg=" + this.poiHeaderImg + ", reviewScore=" + this.reviewScore + ", reviewMaxScore=" + this.reviewMaxScore + ", reviewCount=" + this.reviewCount + ", highlightTags=" + this.highlightTags + ", poiTags=" + this.poiTags + ", poiDetailTagStyleMap=" + this.poiDetailTagStyleMap + ", poiDistanceForShow=" + this.poiDistanceForShow + ", poiDistanceFromCenter=" + this.poiDistanceFromCenter + ", keyCategory=" + this.keyCategory + ", poiDisplay=" + this.poiDisplay + ", realTimeFavCnt=" + this.realTimeFavCnt + ", poiBackendType=" + this.poiBackendType + ", poiDistance=" + this.poiDistance + ", noRating=" + this.noRating + ", sortDistanceMeter=" + this.sortDistanceMeter + ", poiTrustTag=" + this.poiTrustTag + ", poiCropHeaderImg=" + this.poiCropHeaderImg + ", isPoiHasProduct=" + this.isPoiHasProduct + ", hotelShelfInfo=" + this.hotelShelfInfo + ", poiMapPinInfo=" + this.poiMapPinInfo + ", categoryForMarker=" + this.categoryForMarker + ", isHotelMarkerSpecial=" + this.isHotelMarkerSpecial + ", originalIndex=" + this.originalIndex + ", upperTag=" + this.upperTag + ", addressInfo=" + this.addressInfo + ", coverImg=" + this.coverImg + ", productInfo=" + this.productInfo + ')';
    }

    public final boolean isClaimed() {
        return this.isClaimed;
    }

    public final Boolean isCollected() {
        return this.isCollected;
    }

    public final Boolean isHotelMarkerSpecial() {
        return this.isHotelMarkerSpecial;
    }

    public final Boolean isPoiHasProduct() {
        return this.isPoiHasProduct;
    }

    public final void setCollected(Boolean bool) {
        this.isCollected = bool;
    }

    public final void setOriginalIndex(int i) {
        this.originalIndex = i;
    }

    public PoiDiscoveryCard(String str, String str2, String str3, String str4, String str5, Integer num, String str6, String str7, String str8, String str9, String str10, Boolean bool, String str11, ArrayList<Aweme> arrayList, String str12, String str13, String str14, Location location, String str15, boolean z, String str16, String str17, String str18, String str19, List<PoiDetailTag> list, List<PoiDetailTag> list2, Map<String, PoiDetailTagStyle> map, String str20, String str21, String str22, String str23, Long l, String str24, PoiDistance poiDistance, Boolean bool2, Long l2, List<PoiDetailTag> list3, String str25, Boolean bool3, HotelShelfInfo hotelShelfInfo, PoiMapPinInfo poiMapPinInfo, String str26, Boolean bool4, int i, PoiDetailTag poiDetailTag, AddressInfo addressInfo, String str27, FeedProductInfo feedProductInfo) {
        this.poiId = str;
        this.schema = str2;
        this.poiName = str3;
        this.categoryName = str4;
        this.averagePrice = str5;
        this.videoCount = num;
        this.videoCountForShow = str6;
        this.timeForShow = str7;
        this.exactDistanceForShow = str8;
        this.estimatedDistanceForShow = str9;
        this.formattedAddress = str10;
        this.isCollected = bool;
        this.collectInfo = str11;
        this.videoList = arrayList;
        this.regionCode = str12;
        this.cityCode = str13;
        this.typeLevel = str14;
        this.location = location;
        this.poiTitleImg = str15;
        this.isClaimed = z;
        this.poiHeaderImg = str16;
        this.reviewScore = str17;
        this.reviewMaxScore = str18;
        this.reviewCount = str19;
        this.highlightTags = list;
        this.poiTags = list2;
        this.poiDetailTagStyleMap = map;
        this.poiDistanceForShow = str20;
        this.poiDistanceFromCenter = str21;
        this.keyCategory = str22;
        this.poiDisplay = str23;
        this.realTimeFavCnt = l;
        this.poiBackendType = str24;
        this.poiDistance = poiDistance;
        this.noRating = bool2;
        this.sortDistanceMeter = l2;
        this.poiTrustTag = list3;
        this.poiCropHeaderImg = str25;
        this.isPoiHasProduct = bool3;
        this.hotelShelfInfo = hotelShelfInfo;
        this.poiMapPinInfo = poiMapPinInfo;
        this.categoryForMarker = str26;
        this.isHotelMarkerSpecial = bool4;
        this.originalIndex = i;
        this.upperTag = poiDetailTag;
        this.addressInfo = addressInfo;
        this.coverImg = str27;
        this.productInfo = feedProductInfo;
    }
}
