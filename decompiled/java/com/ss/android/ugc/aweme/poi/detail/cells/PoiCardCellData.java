package com.ss.android.ugc.aweme.poi.detail.cells;

import X.C09CT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiDetailTag;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiDetailTagStyle;
import com.ss.android.ugc.aweme.slash.cell.arc.BaseSlashCellData;
import com.ss.android.ugc.aweme.slash.cell.arc.Padding;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiCardCellData extends BaseSlashCellData {
    public final Padding LIZ;

    @C09CT("address_info")
    public final AddressInfo addressInfo;

    @C09CT("category_name")
    public final String categoryName;

    @C09CT("city_code")
    public final String cityCode;

    @C09CT("collect_info")
    public final String collectInfo;

    @C09CT("cover_img")
    public final String coverImg;

    @C09CT("cover_page_tag")
    public final String coverPageTag;

    @C09CT("cover_scene_tag")
    public final String coverSceneTag;

    @C09CT("detail_page_poi_display")
    public final String detailPagePoiDisplay;

    @C09CT("distance")
    public final String distance;

    @C09CT("formatted_address")
    public final String formattedAddress;

    @C09CT("is_claimed")
    public final boolean isClaimed;

    @C09CT("is_collected")
    public final Boolean isCollected;

    @C09CT("key_category")
    public final String keyCategory;

    @C09CT("no_rating")
    public final Boolean noRating;

    @C09CT("poi_detail_tag_style_map")
    public final Map<String, PoiDetailTagStyle> poiDetailTagStyleMap;

    @C09CT("poi_id")
    public final String poiId;

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
    public final long reviewCount;

    @C09CT("review_max_score")
    public final String reviewMaxScore;

    @C09CT("review_score")
    public final String reviewScore;

    @C09CT("type_level")
    public final String typeLevel;

    @C09CT("upper_tag")
    public final PoiDetailTag upperTag;

    public PoiCardCellData() {
        this(null, null, null, null, null, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, 0, null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PoiCardCellData)) {
            return false;
        }
        PoiCardCellData poiCardCellData = (PoiCardCellData) obj;
        return Intrinsics.LJFF(this.poiId, poiCardCellData.poiId) && Intrinsics.LJFF(this.coverImg, poiCardCellData.coverImg) && Intrinsics.LJFF(this.poiName, poiCardCellData.poiName) && Intrinsics.LJFF(this.reviewScore, poiCardCellData.reviewScore) && Intrinsics.LJFF(this.reviewMaxScore, poiCardCellData.reviewMaxScore) && this.reviewCount == poiCardCellData.reviewCount && Intrinsics.LJFF(this.upperTag, poiCardCellData.upperTag) && Intrinsics.LJFF(this.categoryName, poiCardCellData.categoryName) && Intrinsics.LJFF(this.addressInfo, poiCardCellData.addressInfo) && Intrinsics.LJFF(this.distance, poiCardCellData.distance) && Intrinsics.LJFF(this.poiTags, poiCardCellData.poiTags) && Intrinsics.LJFF(this.productInfo, poiCardCellData.productInfo) && Intrinsics.LJFF(this.poiDetailTagStyleMap, poiCardCellData.poiDetailTagStyleMap) && Intrinsics.LJFF(this.cityCode, poiCardCellData.cityCode) && Intrinsics.LJFF(this.typeLevel, poiCardCellData.typeLevel) && Intrinsics.LJFF(this.regionCode, poiCardCellData.regionCode) && Intrinsics.LJFF(this.collectInfo, poiCardCellData.collectInfo) && Intrinsics.LJFF(this.formattedAddress, poiCardCellData.formattedAddress) && Intrinsics.LJFF(this.isCollected, poiCardCellData.isCollected) && this.isClaimed == poiCardCellData.isClaimed && Intrinsics.LJFF(this.detailPagePoiDisplay, poiCardCellData.detailPagePoiDisplay) && Intrinsics.LJFF(this.keyCategory, poiCardCellData.keyCategory) && this.poiStatus == poiCardCellData.poiStatus && Intrinsics.LJFF(this.regionLevel, poiCardCellData.regionLevel) && Intrinsics.LJFF(this.noRating, poiCardCellData.noRating) && Intrinsics.LJFF(this.coverSceneTag, poiCardCellData.coverSceneTag) && Intrinsics.LJFF(this.coverPageTag, poiCardCellData.coverPageTag) && Intrinsics.LJFF(this.LIZ, poiCardCellData.LIZ);
    }

    public final int hashCode() {
        String str = this.poiId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.coverImg;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.poiName;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.reviewScore;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.reviewMaxScore;
        int iHashCode5 = (((iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31) + C786410Ut5.Y2(this.reviewCount)) * 31;
        PoiDetailTag poiDetailTag = this.upperTag;
        int iHashCode6 = (iHashCode5 + (poiDetailTag == null ? 0 : poiDetailTag.hashCode())) * 31;
        String str6 = this.categoryName;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        AddressInfo addressInfo = this.addressInfo;
        int iHashCode8 = (iHashCode7 + (addressInfo == null ? 0 : addressInfo.hashCode())) * 31;
        String str7 = this.distance;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        List<PoiDetailTag> list = this.poiTags;
        int iHashCode10 = (iHashCode9 + (list == null ? 0 : list.hashCode())) * 31;
        FeedProductInfo feedProductInfo = this.productInfo;
        int iHashCode11 = (iHashCode10 + (feedProductInfo == null ? 0 : feedProductInfo.hashCode())) * 31;
        Map<String, PoiDetailTagStyle> map = this.poiDetailTagStyleMap;
        int iHashCode12 = (iHashCode11 + (map == null ? 0 : map.hashCode())) * 31;
        String str8 = this.cityCode;
        int iHashCode13 = (iHashCode12 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.typeLevel;
        int iHashCode14 = (iHashCode13 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.regionCode;
        int iHashCode15 = (iHashCode14 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.collectInfo;
        int iHashCode16 = (iHashCode15 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.formattedAddress;
        int iHashCode17 = (iHashCode16 + (str12 == null ? 0 : str12.hashCode())) * 31;
        Boolean bool = this.isCollected;
        int iHashCode18 = (((iHashCode17 + (bool == null ? 0 : bool.hashCode())) * 31) + C786410Ut5.Z2(this.isClaimed)) * 31;
        String str13 = this.detailPagePoiDisplay;
        int iHashCode19 = (iHashCode18 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.keyCategory;
        int iHashCode20 = (((iHashCode19 + (str14 == null ? 0 : str14.hashCode())) * 31) + this.poiStatus) * 31;
        String str15 = this.regionLevel;
        int iHashCode21 = (iHashCode20 + (str15 == null ? 0 : str15.hashCode())) * 31;
        Boolean bool2 = this.noRating;
        int iHashCode22 = (iHashCode21 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str16 = this.coverSceneTag;
        int iHashCode23 = (iHashCode22 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.coverPageTag;
        int iHashCode24 = (iHashCode23 + (str17 == null ? 0 : str17.hashCode())) * 31;
        Padding padding = this.LIZ;
        return iHashCode24 + (padding != null ? padding.hashCode() : 0);
    }

    public final String toString() {
        return "PoiCardCellData(poiId=" + this.poiId + ", coverImg=" + this.coverImg + ", poiName=" + this.poiName + ", reviewScore=" + this.reviewScore + ", reviewMaxScore=" + this.reviewMaxScore + ", reviewCount=" + this.reviewCount + ", upperTag=" + this.upperTag + ", categoryName=" + this.categoryName + ", addressInfo=" + this.addressInfo + ", distance=" + this.distance + ", poiTags=" + this.poiTags + ", productInfo=" + this.productInfo + ", poiDetailTagStyleMap=" + this.poiDetailTagStyleMap + ", cityCode=" + this.cityCode + ", typeLevel=" + this.typeLevel + ", regionCode=" + this.regionCode + ", collectInfo=" + this.collectInfo + ", formattedAddress=" + this.formattedAddress + ", isCollected=" + this.isCollected + ", isClaimed=" + this.isClaimed + ", detailPagePoiDisplay=" + this.detailPagePoiDisplay + ", keyCategory=" + this.keyCategory + ", poiStatus=" + this.poiStatus + ", regionLevel=" + this.regionLevel + ", noRating=" + this.noRating + ", coverSceneTag=" + this.coverSceneTag + ", coverPageTag=" + this.coverPageTag + ", overridePadding=" + this.LIZ + ')';
    }

    public PoiCardCellData(String str, String str2, String str3, String str4, String str5, long j, PoiDetailTag poiDetailTag, String str6, AddressInfo addressInfo, String str7, List<PoiDetailTag> list, FeedProductInfo feedProductInfo, Map<String, PoiDetailTagStyle> map, String str8, String str9, String str10, String str11, String str12, Boolean bool, boolean z, String str13, String str14, int i, String str15, Boolean bool2, String str16, String str17, Padding padding) {
        super(padding, null);
        this.poiId = str;
        this.coverImg = str2;
        this.poiName = str3;
        this.reviewScore = str4;
        this.reviewMaxScore = str5;
        this.reviewCount = j;
        this.upperTag = poiDetailTag;
        this.categoryName = str6;
        this.addressInfo = addressInfo;
        this.distance = str7;
        this.poiTags = list;
        this.productInfo = feedProductInfo;
        this.poiDetailTagStyleMap = map;
        this.cityCode = str8;
        this.typeLevel = str9;
        this.regionCode = str10;
        this.collectInfo = str11;
        this.formattedAddress = str12;
        this.isCollected = bool;
        this.isClaimed = z;
        this.detailPagePoiDisplay = str13;
        this.keyCategory = str14;
        this.poiStatus = i;
        this.regionLevel = str15;
        this.noRating = bool2;
        this.coverSceneTag = str16;
        this.coverPageTag = str17;
        this.LIZ = padding;
    }
}
