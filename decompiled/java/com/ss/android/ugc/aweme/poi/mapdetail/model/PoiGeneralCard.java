package com.ss.android.ugc.aweme.poi.mapdetail.model;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import X.EnumC1177990glB;
import X.EnumC1184730gw3;
import X.InterfaceC1175110ggX;
import com.ss.android.ugc.aweme.poi.detail.cells.AddressInfo;
import com.ss.android.ugc.aweme.poi.detail.cells.FeedProductInfo;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiDetailTag;
import com.ss.android.ugc.aweme.poi.mapmode.model.Location;
import com.ss.android.ugc.aweme.poi.mapmode.model.PoiMapPinInfo;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiGeneralCard implements Serializable, InterfaceC1175110ggX {
    public int LL;
    public final HotelShelfInfo LLILLJJLI;

    @C09CT("address_info")
    public final AddressInfo addressInfo;

    @C09CT("ai_summary")
    public final PoiCardAiSummary aiSummary;

    @C09CT("category_for_marker")
    public final String categoryForMarker;

    @C09CT("category_name")
    public final String categoryName;

    @C09CT("city_code")
    public final String cityCode;

    @C09CT("collect_info")
    public final String collectInfo;

    @C09CT("country_code")
    public final String countryCode;

    @C09CT("cover_img")
    public final String coverImg;

    @C09CT("formatted_address")
    public final String formattedAddress;

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

    @C09CT("location")
    public final Location location;

    @C09CT("nearby_tab_key")
    public final String nearbyTabKey;

    @C09CT("no_rating")
    public final Boolean noRating;

    @C09CT("poi_card_display_style")
    public final Integer poiCardDisplayStyle;

    @C09CT("poi_crop_head_img")
    public final String poiCropHeadImg;

    @C09CT("poi_id")
    public final String poiId;

    @C09CT("poi_map_pin_info")
    public final PoiMapPinInfo poiMapPinInfo;

    @C09CT("poi_name")
    public final String poiName;

    @C09CT("poi_status")
    public final int poiStatus;

    @C09CT("poi_tags")
    public final List<PoiDetailTag> poiTags;

    @C09CT("product_info")
    public final FeedProductInfo productInfo;

    @C09CT("region_code")
    public final String regionCode;

    @C09CT("region_level")
    public final String regionLevel;

    @C09CT("review_count")
    public final Long reviewCount;

    @C09CT("review_max_score")
    public final String reviewMaxScore;

    @C09CT("review_score")
    public final String reviewScore;

    @C09CT("schema")
    public final String schema;

    @C09CT("sort_distance_meter")
    public final Long sortDistanceMeter;

    @C09CT("sort_poi_rating")
    public final Double sortPoiRating;

    @C09CT("tt_key_category")
    public final String ttKeyCategory;

    @C09CT("type_code")
    public final String typeCode;

    @C09CT("type_level")
    public final String typeLevel;

    @C09CT("upper_tag")
    public final PoiDetailTag upperTag;

    /* JADX WARN: Illegal instructions before constructor call */
    public PoiGeneralCard() {
        Double dValueOf = Double.valueOf(0.0d);
        this(null, null, null, null, null, null, null, null, null, null, null, new Location(dValueOf, dValueOf), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, false, null, null, null, null, null, null, null, null, -1, null);
    }

    public final PoiGeneralCard copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Location location, Integer num, String str12, String str13, Boolean bool, String str14, String str15, Long l, Boolean bool2, List<PoiDetailTag> list, PoiDetailTag poiDetailTag, AddressInfo addressInfo, HotelShelfInfo hotelShelfInfo, FeedProductInfo feedProductInfo, PoiCardAiSummary poiCardAiSummary, String str16, int i, boolean z, PoiMapPinInfo poiMapPinInfo, String str17, Boolean bool3, String str18, Boolean bool4, Long l2, Double d, String str19, int i2, HotelShelfInfo hotelShelfInfo2) {
        return new PoiGeneralCard(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, location, num, str12, str13, bool, str14, str15, l, bool2, list, poiDetailTag, addressInfo, hotelShelfInfo, feedProductInfo, poiCardAiSummary, str16, i, z, poiMapPinInfo, str17, bool3, str18, bool4, l2, d, str19, i2, hotelShelfInfo2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PoiGeneralCard)) {
            return false;
        }
        PoiGeneralCard poiGeneralCard = (PoiGeneralCard) obj;
        return Intrinsics.LJFF(this.poiId, poiGeneralCard.poiId) && Intrinsics.LJFF(this.schema, poiGeneralCard.schema) && Intrinsics.LJFF(this.poiName, poiGeneralCard.poiName) && Intrinsics.LJFF(this.ttKeyCategory, poiGeneralCard.ttKeyCategory) && Intrinsics.LJFF(this.typeCode, poiGeneralCard.typeCode) && Intrinsics.LJFF(this.typeLevel, poiGeneralCard.typeLevel) && Intrinsics.LJFF(this.formattedAddress, poiGeneralCard.formattedAddress) && Intrinsics.LJFF(this.cityCode, poiGeneralCard.cityCode) && Intrinsics.LJFF(this.regionCode, poiGeneralCard.regionCode) && Intrinsics.LJFF(this.countryCode, poiGeneralCard.countryCode) && Intrinsics.LJFF(this.collectInfo, poiGeneralCard.collectInfo) && Intrinsics.LJFF(this.location, poiGeneralCard.location) && Intrinsics.LJFF(this.poiCardDisplayStyle, poiGeneralCard.poiCardDisplayStyle) && Intrinsics.LJFF(this.coverImg, poiGeneralCard.coverImg) && Intrinsics.LJFF(this.categoryName, poiGeneralCard.categoryName) && Intrinsics.LJFF(this.isCollected, poiGeneralCard.isCollected) && Intrinsics.LJFF(this.reviewScore, poiGeneralCard.reviewScore) && Intrinsics.LJFF(this.reviewMaxScore, poiGeneralCard.reviewMaxScore) && Intrinsics.LJFF(this.reviewCount, poiGeneralCard.reviewCount) && Intrinsics.LJFF(this.noRating, poiGeneralCard.noRating) && Intrinsics.LJFF(this.poiTags, poiGeneralCard.poiTags) && Intrinsics.LJFF(this.upperTag, poiGeneralCard.upperTag) && Intrinsics.LJFF(this.addressInfo, poiGeneralCard.addressInfo) && Intrinsics.LJFF(this.hotelShelfInfo, poiGeneralCard.hotelShelfInfo) && Intrinsics.LJFF(this.productInfo, poiGeneralCard.productInfo) && Intrinsics.LJFF(this.aiSummary, poiGeneralCard.aiSummary) && Intrinsics.LJFF(this.regionLevel, poiGeneralCard.regionLevel) && this.poiStatus == poiGeneralCard.poiStatus && this.isClaimed == poiGeneralCard.isClaimed && Intrinsics.LJFF(this.poiMapPinInfo, poiGeneralCard.poiMapPinInfo) && Intrinsics.LJFF(this.categoryForMarker, poiGeneralCard.categoryForMarker) && Intrinsics.LJFF(this.isHotelMarkerSpecial, poiGeneralCard.isHotelMarkerSpecial) && Intrinsics.LJFF(this.poiCropHeadImg, poiGeneralCard.poiCropHeadImg) && Intrinsics.LJFF(this.isPoiHasProduct, poiGeneralCard.isPoiHasProduct) && Intrinsics.LJFF(this.sortDistanceMeter, poiGeneralCard.sortDistanceMeter) && Intrinsics.LJFF(this.sortPoiRating, poiGeneralCard.sortPoiRating) && Intrinsics.LJFF(this.nearbyTabKey, poiGeneralCard.nearbyTabKey) && this.LL == poiGeneralCard.LL && Intrinsics.LJFF(this.LLILLJJLI, poiGeneralCard.LLILLJJLI);
    }

    public int hashCode() {
        String str = this.poiId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.schema;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.poiName;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.ttKeyCategory;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.typeCode;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.typeLevel;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.formattedAddress;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.cityCode;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.regionCode;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.countryCode;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.collectInfo;
        int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Location location = this.location;
        int iHashCode12 = (iHashCode11 + (location == null ? 0 : location.hashCode())) * 31;
        Integer num = this.poiCardDisplayStyle;
        int iHashCode13 = (iHashCode12 + (num == null ? 0 : num.hashCode())) * 31;
        String str12 = this.coverImg;
        int iHashCode14 = (iHashCode13 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.categoryName;
        int iHashCode15 = (iHashCode14 + (str13 == null ? 0 : str13.hashCode())) * 31;
        Boolean bool = this.isCollected;
        int iHashCode16 = (iHashCode15 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str14 = this.reviewScore;
        int iHashCode17 = (iHashCode16 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.reviewMaxScore;
        int iHashCode18 = (iHashCode17 + (str15 == null ? 0 : str15.hashCode())) * 31;
        Long l = this.reviewCount;
        int iHashCode19 = (iHashCode18 + (l == null ? 0 : l.hashCode())) * 31;
        Boolean bool2 = this.noRating;
        int iHashCode20 = (iHashCode19 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        List<PoiDetailTag> list = this.poiTags;
        int iHashCode21 = (iHashCode20 + (list == null ? 0 : list.hashCode())) * 31;
        PoiDetailTag poiDetailTag = this.upperTag;
        int iHashCode22 = (iHashCode21 + (poiDetailTag == null ? 0 : poiDetailTag.hashCode())) * 31;
        AddressInfo addressInfo = this.addressInfo;
        int iHashCode23 = (iHashCode22 + (addressInfo == null ? 0 : addressInfo.hashCode())) * 31;
        HotelShelfInfo hotelShelfInfo = this.hotelShelfInfo;
        int iHashCode24 = (iHashCode23 + (hotelShelfInfo == null ? 0 : hotelShelfInfo.hashCode())) * 31;
        FeedProductInfo feedProductInfo = this.productInfo;
        int iHashCode25 = (iHashCode24 + (feedProductInfo == null ? 0 : feedProductInfo.hashCode())) * 31;
        PoiCardAiSummary poiCardAiSummary = this.aiSummary;
        int iHashCode26 = (iHashCode25 + (poiCardAiSummary == null ? 0 : poiCardAiSummary.hashCode())) * 31;
        String str16 = this.regionLevel;
        int iHashCode27 = (((((iHashCode26 + (str16 == null ? 0 : str16.hashCode())) * 31) + this.poiStatus) * 31) + C786410Ut5.Z2(this.isClaimed)) * 31;
        PoiMapPinInfo poiMapPinInfo = this.poiMapPinInfo;
        int iHashCode28 = (iHashCode27 + (poiMapPinInfo == null ? 0 : poiMapPinInfo.hashCode())) * 31;
        String str17 = this.categoryForMarker;
        int iHashCode29 = (iHashCode28 + (str17 == null ? 0 : str17.hashCode())) * 31;
        Boolean bool3 = this.isHotelMarkerSpecial;
        int iHashCode30 = (iHashCode29 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str18 = this.poiCropHeadImg;
        int iHashCode31 = (iHashCode30 + (str18 == null ? 0 : str18.hashCode())) * 31;
        Boolean bool4 = this.isPoiHasProduct;
        int iHashCode32 = (iHashCode31 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Long l2 = this.sortDistanceMeter;
        int iHashCode33 = (iHashCode32 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Double d = this.sortPoiRating;
        int iHashCode34 = (iHashCode33 + (d == null ? 0 : d.hashCode())) * 31;
        String str19 = this.nearbyTabKey;
        int iHashCode35 = (((iHashCode34 + (str19 == null ? 0 : str19.hashCode())) * 31) + this.LL) * 31;
        HotelShelfInfo hotelShelfInfo2 = this.LLILLJJLI;
        return iHashCode35 + (hotelShelfInfo2 != null ? hotelShelfInfo2.hashCode() : 0);
    }

    public String toString() {
        return "PoiGeneralCard(poiId=" + this.poiId + ", schema=" + this.schema + ", poiName=" + this.poiName + ", ttKeyCategory=" + this.ttKeyCategory + ", typeCode=" + this.typeCode + ", typeLevel=" + this.typeLevel + ", formattedAddress=" + this.formattedAddress + ", cityCode=" + this.cityCode + ", regionCode=" + this.regionCode + ", countryCode=" + this.countryCode + ", collectInfo=" + this.collectInfo + ", location=" + this.location + ", poiCardDisplayStyle=" + this.poiCardDisplayStyle + ", coverImg=" + this.coverImg + ", categoryName=" + this.categoryName + ", isCollected=" + this.isCollected + ", reviewScore=" + this.reviewScore + ", reviewMaxScore=" + this.reviewMaxScore + ", reviewCount=" + this.reviewCount + ", noRating=" + this.noRating + ", poiTags=" + this.poiTags + ", upperTag=" + this.upperTag + ", addressInfo=" + this.addressInfo + ", hotelShelfInfo=" + this.hotelShelfInfo + ", productInfo=" + this.productInfo + ", aiSummary=" + this.aiSummary + ", regionLevel=" + this.regionLevel + ", poiStatus=" + this.poiStatus + ", isClaimed=" + this.isClaimed + ", poiMapPinInfo=" + this.poiMapPinInfo + ", categoryForMarker=" + this.categoryForMarker + ", isHotelMarkerSpecial=" + this.isHotelMarkerSpecial + ", poiCropHeadImg=" + this.poiCropHeadImg + ", isPoiHasProduct=" + this.isPoiHasProduct + ", sortDistanceMeter=" + this.sortDistanceMeter + ", sortPoiRating=" + this.sortPoiRating + ", nearbyTabKey=" + this.nearbyTabKey + ", originalIndex=" + this.LL + ", currentPoiHotelShelfInfo=" + this.LLILLJJLI + ')';
    }

    @Override // X.InterfaceC1175110ggX
    public String cellId() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cellId: typeLevel = ");
        sbLIZ.append(typeLevel());
        sbLIZ.append(", keyCategory = ");
        sbLIZ.append(keyCategory());
        C2188811AlT.LIZIZ(sbLIZ);
        return Intrinsics.LJFF(typeLevel(), EnumC1184730gw3.REGIONAL.getTypeCode$poi_release()) ? "poi_regional_card" : Intrinsics.LJFF(keyCategory(), EnumC1177990glB.HOTEL.getCategory()) ? "poi_hotel_card" : "poi_common_card";
    }

    public final AddressInfo getAddressInfo() {
        return this.addressInfo;
    }

    public final PoiCardAiSummary getAiSummary() {
        return this.aiSummary;
    }

    public final String getCategoryForMarker() {
        return this.categoryForMarker;
    }

    public final String getCategoryName() {
        return this.categoryName;
    }

    public final String getCityCode() {
        return this.cityCode;
    }

    public final String getCollectInfo() {
        return this.collectInfo;
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public final String getCoverImg() {
        return this.coverImg;
    }

    public final HotelShelfInfo getCurrentPoiHotelShelfInfo() {
        return this.LLILLJJLI;
    }

    public final String getFormattedAddress() {
        return this.formattedAddress;
    }

    public final HotelShelfInfo getHotelShelfInfo() {
        return this.hotelShelfInfo;
    }

    public final Location getLocation() {
        return this.location;
    }

    public final String getNearbyTabKey() {
        return this.nearbyTabKey;
    }

    public final Boolean getNoRating() {
        return this.noRating;
    }

    public final int getOriginalIndex() {
        return this.LL;
    }

    public final Integer getPoiCardDisplayStyle() {
        return this.poiCardDisplayStyle;
    }

    public final String getPoiCropHeadImg() {
        return this.poiCropHeadImg;
    }

    public final String getPoiId() {
        return this.poiId;
    }

    public final PoiMapPinInfo getPoiMapPinInfo() {
        return this.poiMapPinInfo;
    }

    public final String getPoiName() {
        return this.poiName;
    }

    public final int getPoiStatus() {
        return this.poiStatus;
    }

    public final List<PoiDetailTag> getPoiTags() {
        return this.poiTags;
    }

    public final FeedProductInfo getProductInfo() {
        return this.productInfo;
    }

    public final String getRegionCode() {
        return this.regionCode;
    }

    public final String getRegionLevel() {
        return this.regionLevel;
    }

    public final Long getReviewCount() {
        return this.reviewCount;
    }

    public final String getReviewMaxScore() {
        return this.reviewMaxScore;
    }

    public final String getReviewScore() {
        return this.reviewScore;
    }

    public final String getSchema() {
        return this.schema;
    }

    public final Long getSortDistanceMeter() {
        return this.sortDistanceMeter;
    }

    public final Double getSortPoiRating() {
        return this.sortPoiRating;
    }

    public final String getTtKeyCategory() {
        return this.ttKeyCategory;
    }

    public final String getTypeCode() {
        return this.typeCode;
    }

    public final String getTypeLevel() {
        return this.typeLevel;
    }

    public final PoiDetailTag getUpperTag() {
        return this.upperTag;
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

    @Override // X.InterfaceC1175110ggX
    public String keyCategory() {
        return this.ttKeyCategory;
    }

    @Override // X.InterfaceC1175110ggX
    public String typeLevel() {
        return this.typeLevel;
    }

    public final void setCollected(Boolean bool) {
        this.isCollected = bool;
    }

    public final void setOriginalIndex(int i) {
        this.LL = i;
    }

    public PoiGeneralCard(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Location location, Integer num, String str12, String str13, Boolean bool, String str14, String str15, Long l, Boolean bool2, List<PoiDetailTag> list, PoiDetailTag poiDetailTag, AddressInfo addressInfo, HotelShelfInfo hotelShelfInfo, FeedProductInfo feedProductInfo, PoiCardAiSummary poiCardAiSummary, String str16, int i, boolean z, PoiMapPinInfo poiMapPinInfo, String str17, Boolean bool3, String str18, Boolean bool4, Long l2, Double d, String str19, int i2, HotelShelfInfo hotelShelfInfo2) {
        this.poiId = str;
        this.schema = str2;
        this.poiName = str3;
        this.ttKeyCategory = str4;
        this.typeCode = str5;
        this.typeLevel = str6;
        this.formattedAddress = str7;
        this.cityCode = str8;
        this.regionCode = str9;
        this.countryCode = str10;
        this.collectInfo = str11;
        this.location = location;
        this.poiCardDisplayStyle = num;
        this.coverImg = str12;
        this.categoryName = str13;
        this.isCollected = bool;
        this.reviewScore = str14;
        this.reviewMaxScore = str15;
        this.reviewCount = l;
        this.noRating = bool2;
        this.poiTags = list;
        this.upperTag = poiDetailTag;
        this.addressInfo = addressInfo;
        this.hotelShelfInfo = hotelShelfInfo;
        this.productInfo = feedProductInfo;
        this.aiSummary = poiCardAiSummary;
        this.regionLevel = str16;
        this.poiStatus = i;
        this.isClaimed = z;
        this.poiMapPinInfo = poiMapPinInfo;
        this.categoryForMarker = str17;
        this.isHotelMarkerSpecial = bool3;
        this.poiCropHeadImg = str18;
        this.isPoiHasProduct = bool4;
        this.sortDistanceMeter = l2;
        this.sortPoiRating = d;
        this.nearbyTabKey = str19;
        this.LL = i2;
        this.LLILLJJLI = hotelShelfInfo2;
    }
}
