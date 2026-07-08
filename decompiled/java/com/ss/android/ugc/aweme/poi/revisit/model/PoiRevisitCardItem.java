package com.ss.android.ugc.aweme.poi.revisit.model;

import X.C09CT;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.poi.detail.cells.AddressInfo;
import com.ss.android.ugc.aweme.poi.detail.cells.FeedProductInfo;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiDetailTag;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiDetailTagStyle;
import com.ss.android.ugc.aweme.poi.revisit.api.PoiRevisitApi;
import com.ss.android.ugc.aweme.poi_api.model.PoiLocation;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiRevisitCardItem implements InterfaceC1891350zJl {
    public final boolean LL;
    public final boolean LLILLJJLI;
    public final PoiLocation LLILLL;
    public final boolean LLILZ;

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

    @C09CT("poi_distance_for_show")
    public final String poiDistanceForShow;

    @C09CT("poi_geo_info")
    public final PoiRevisitApi.PoiGeoInfo poiGeoInfo;

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

    @C09CT("real_time_fav_cnt")
    public final Long realFavoriteCnt;

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

    public PoiRevisitCardItem() {
        this(false, true, null, false, null, null, null, null, null, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, 0, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PoiRevisitCardItem)) {
            return false;
        }
        PoiRevisitCardItem poiRevisitCardItem = (PoiRevisitCardItem) obj;
        return this.LL == poiRevisitCardItem.LL && this.LLILLJJLI == poiRevisitCardItem.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, poiRevisitCardItem.LLILLL) && this.LLILZ == poiRevisitCardItem.LLILZ && Intrinsics.LJFF(this.poiId, poiRevisitCardItem.poiId) && Intrinsics.LJFF(this.coverImg, poiRevisitCardItem.coverImg) && Intrinsics.LJFF(this.poiName, poiRevisitCardItem.poiName) && Intrinsics.LJFF(this.reviewScore, poiRevisitCardItem.reviewScore) && Intrinsics.LJFF(this.reviewMaxScore, poiRevisitCardItem.reviewMaxScore) && this.reviewCount == poiRevisitCardItem.reviewCount && Intrinsics.LJFF(this.upperTag, poiRevisitCardItem.upperTag) && Intrinsics.LJFF(this.categoryName, poiRevisitCardItem.categoryName) && Intrinsics.LJFF(this.addressInfo, poiRevisitCardItem.addressInfo) && Intrinsics.LJFF(this.distance, poiRevisitCardItem.distance) && Intrinsics.LJFF(this.poiTags, poiRevisitCardItem.poiTags) && Intrinsics.LJFF(this.productInfo, poiRevisitCardItem.productInfo) && Intrinsics.LJFF(this.poiDistanceForShow, poiRevisitCardItem.poiDistanceForShow) && Intrinsics.LJFF(this.poiDetailTagStyleMap, poiRevisitCardItem.poiDetailTagStyleMap) && Intrinsics.LJFF(this.cityCode, poiRevisitCardItem.cityCode) && Intrinsics.LJFF(this.typeLevel, poiRevisitCardItem.typeLevel) && Intrinsics.LJFF(this.regionCode, poiRevisitCardItem.regionCode) && Intrinsics.LJFF(this.collectInfo, poiRevisitCardItem.collectInfo) && Intrinsics.LJFF(this.formattedAddress, poiRevisitCardItem.formattedAddress) && Intrinsics.LJFF(this.isCollected, poiRevisitCardItem.isCollected) && this.isClaimed == poiRevisitCardItem.isClaimed && Intrinsics.LJFF(this.detailPagePoiDisplay, poiRevisitCardItem.detailPagePoiDisplay) && Intrinsics.LJFF(this.keyCategory, poiRevisitCardItem.keyCategory) && this.poiStatus == poiRevisitCardItem.poiStatus && Intrinsics.LJFF(this.regionLevel, poiRevisitCardItem.regionLevel) && Intrinsics.LJFF(this.noRating, poiRevisitCardItem.noRating) && Intrinsics.LJFF(this.realFavoriteCnt, poiRevisitCardItem.realFavoriteCnt) && Intrinsics.LJFF(this.poiGeoInfo, poiRevisitCardItem.poiGeoInfo);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iZ2 = ((C786410Ut5.Z2(this.LL) * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31;
        PoiLocation poiLocation = this.LLILLL;
        int iHashCode = (((iZ2 + (poiLocation == null ? 0 : poiLocation.hashCode())) * 31) + C786410Ut5.Z2(this.LLILZ)) * 31;
        String str = this.poiId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.coverImg;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.poiName;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.reviewScore;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.reviewMaxScore;
        int iHashCode6 = (((iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31) + C786410Ut5.Y2(this.reviewCount)) * 31;
        PoiDetailTag poiDetailTag = this.upperTag;
        int iHashCode7 = (iHashCode6 + (poiDetailTag == null ? 0 : poiDetailTag.hashCode())) * 31;
        String str6 = this.categoryName;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        AddressInfo addressInfo = this.addressInfo;
        int iHashCode9 = (iHashCode8 + (addressInfo == null ? 0 : addressInfo.hashCode())) * 31;
        String str7 = this.distance;
        int iHashCode10 = (iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        List<PoiDetailTag> list = this.poiTags;
        int iHashCode11 = (iHashCode10 + (list == null ? 0 : list.hashCode())) * 31;
        FeedProductInfo feedProductInfo = this.productInfo;
        int iHashCode12 = (iHashCode11 + (feedProductInfo == null ? 0 : feedProductInfo.hashCode())) * 31;
        String str8 = this.poiDistanceForShow;
        int iHashCode13 = (iHashCode12 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Map<String, PoiDetailTagStyle> map = this.poiDetailTagStyleMap;
        int iHashCode14 = (iHashCode13 + (map == null ? 0 : map.hashCode())) * 31;
        String str9 = this.cityCode;
        int iHashCode15 = (iHashCode14 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.typeLevel;
        int iHashCode16 = (iHashCode15 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.regionCode;
        int iHashCode17 = (iHashCode16 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.collectInfo;
        int iHashCode18 = (iHashCode17 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.formattedAddress;
        int iHashCode19 = (iHashCode18 + (str13 == null ? 0 : str13.hashCode())) * 31;
        Boolean bool = this.isCollected;
        int iHashCode20 = (((iHashCode19 + (bool == null ? 0 : bool.hashCode())) * 31) + C786410Ut5.Z2(this.isClaimed)) * 31;
        String str14 = this.detailPagePoiDisplay;
        int iHashCode21 = (iHashCode20 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.keyCategory;
        int iHashCode22 = (((iHashCode21 + (str15 == null ? 0 : str15.hashCode())) * 31) + this.poiStatus) * 31;
        String str16 = this.regionLevel;
        int iHashCode23 = (iHashCode22 + (str16 == null ? 0 : str16.hashCode())) * 31;
        Boolean bool2 = this.noRating;
        int iHashCode24 = (iHashCode23 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Long l = this.realFavoriteCnt;
        int iHashCode25 = (iHashCode24 + (l == null ? 0 : l.hashCode())) * 31;
        PoiRevisitApi.PoiGeoInfo poiGeoInfo = this.poiGeoInfo;
        return iHashCode25 + (poiGeoInfo != null ? poiGeoInfo.hashCode() : 0);
    }

    public final String toString() {
        return "PoiRevisitCardItem(showSkeleton=" + this.LL + ", showNavigateIcon=" + this.LLILLJJLI + ", location=" + this.LLILLL + ", justUpdateCollectedStatus=" + this.LLILZ + ", poiId=" + this.poiId + ", coverImg=" + this.coverImg + ", poiName=" + this.poiName + ", reviewScore=" + this.reviewScore + ", reviewMaxScore=" + this.reviewMaxScore + ", reviewCount=" + this.reviewCount + ", upperTag=" + this.upperTag + ", categoryName=" + this.categoryName + ", addressInfo=" + this.addressInfo + ", distance=" + this.distance + ", poiTags=" + this.poiTags + ", productInfo=" + this.productInfo + ", poiDistanceForShow=" + this.poiDistanceForShow + ", poiDetailTagStyleMap=" + this.poiDetailTagStyleMap + ", cityCode=" + this.cityCode + ", typeLevel=" + this.typeLevel + ", regionCode=" + this.regionCode + ", collectInfo=" + this.collectInfo + ", formattedAddress=" + this.formattedAddress + ", isCollected=" + this.isCollected + ", isClaimed=" + this.isClaimed + ", detailPagePoiDisplay=" + this.detailPagePoiDisplay + ", keyCategory=" + this.keyCategory + ", poiStatus=" + this.poiStatus + ", regionLevel=" + this.regionLevel + ", noRating=" + this.noRating + ", realFavoriteCnt=" + this.realFavoriteCnt + ", poiGeoInfo=" + this.poiGeoInfo + ')';
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof PoiRevisitCardItem)) {
            return false;
        }
        if (this.LLILLJJLI) {
            if (!areItemTheSame(interfaceC1891350zJl) || !Intrinsics.LJFF(this.isCollected, ((PoiRevisitCardItem) interfaceC1891350zJl).isCollected)) {
                return false;
            }
            return true;
        }
        return areItemTheSame(interfaceC1891350zJl);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof PoiRevisitCardItem) || this.LLILLJJLI || !Intrinsics.LJFF(this.poiId, ((PoiRevisitCardItem) interfaceC1891350zJl).poiId)) {
            return false;
        }
        return true;
    }

    public static PoiRevisitCardItem LIZ(PoiRevisitCardItem poiRevisitCardItem, boolean z, int i) {
        boolean z2;
        boolean z3;
        PoiLocation poiLocation;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        long j;
        PoiDetailTag poiDetailTag;
        String str6;
        AddressInfo addressInfo;
        String str7;
        List<PoiDetailTag> list;
        FeedProductInfo feedProductInfo;
        String str8;
        Map<String, PoiDetailTagStyle> map;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        Boolean bool;
        boolean z4;
        String str14;
        String str15;
        String str16;
        Boolean bool2;
        Long l;
        boolean z5 = z;
        int i2 = 0;
        if ((i & 1) != 0) {
            z2 = poiRevisitCardItem.LL;
        } else {
            z2 = false;
        }
        if ((i & 2) != 0) {
            z3 = poiRevisitCardItem.LLILLJJLI;
        } else {
            z3 = false;
        }
        PoiRevisitApi.PoiGeoInfo poiGeoInfo = null;
        if ((i & 4) != 0) {
            poiLocation = poiRevisitCardItem.LLILLL;
        } else {
            poiLocation = null;
        }
        if ((i & 8) != 0) {
            z5 = poiRevisitCardItem.LLILZ;
        }
        if ((i & 16) != 0) {
            str = poiRevisitCardItem.poiId;
        } else {
            str = null;
        }
        if ((i & 32) != 0) {
            str2 = poiRevisitCardItem.coverImg;
        } else {
            str2 = null;
        }
        if ((i & 64) != 0) {
            str3 = poiRevisitCardItem.poiName;
        } else {
            str3 = null;
        }
        if ((i & 128) != 0) {
            str4 = poiRevisitCardItem.reviewScore;
        } else {
            str4 = null;
        }
        if ((i & 256) != 0) {
            str5 = poiRevisitCardItem.reviewMaxScore;
        } else {
            str5 = null;
        }
        if ((i & 512) != 0) {
            j = poiRevisitCardItem.reviewCount;
        } else {
            j = 0;
        }
        if ((i & 1024) != 0) {
            poiDetailTag = poiRevisitCardItem.upperTag;
        } else {
            poiDetailTag = null;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            str6 = poiRevisitCardItem.categoryName;
        } else {
            str6 = null;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            addressInfo = poiRevisitCardItem.addressInfo;
        } else {
            addressInfo = null;
        }
        if ((i & 8192) != 0) {
            str7 = poiRevisitCardItem.distance;
        } else {
            str7 = null;
        }
        if ((i & 16384) != 0) {
            list = poiRevisitCardItem.poiTags;
        } else {
            list = null;
        }
        if ((32768 & i) != 0) {
            feedProductInfo = poiRevisitCardItem.productInfo;
        } else {
            feedProductInfo = null;
        }
        if ((65536 & i) != 0) {
            str8 = poiRevisitCardItem.poiDistanceForShow;
        } else {
            str8 = null;
        }
        if ((131072 & i) != 0) {
            map = poiRevisitCardItem.poiDetailTagStyleMap;
        } else {
            map = null;
        }
        if ((262144 & i) != 0) {
            str9 = poiRevisitCardItem.cityCode;
        } else {
            str9 = null;
        }
        if ((524288 & i) != 0) {
            str10 = poiRevisitCardItem.typeLevel;
        } else {
            str10 = null;
        }
        if ((1048576 & i) != 0) {
            str11 = poiRevisitCardItem.regionCode;
        } else {
            str11 = null;
        }
        if ((2097152 & i) != 0) {
            str12 = poiRevisitCardItem.collectInfo;
        } else {
            str12 = null;
        }
        if ((4194304 & i) != 0) {
            str13 = poiRevisitCardItem.formattedAddress;
        } else {
            str13 = null;
        }
        if ((8388608 & i) != 0) {
            bool = poiRevisitCardItem.isCollected;
        } else {
            bool = null;
        }
        if ((16777216 & i) != 0) {
            z4 = poiRevisitCardItem.isClaimed;
        } else {
            z4 = false;
        }
        if ((33554432 & i) != 0) {
            str14 = poiRevisitCardItem.detailPagePoiDisplay;
        } else {
            str14 = null;
        }
        if ((67108864 & i) != 0) {
            str15 = poiRevisitCardItem.keyCategory;
        } else {
            str15 = null;
        }
        if ((134217728 & i) != 0) {
            i2 = poiRevisitCardItem.poiStatus;
        }
        if ((268435456 & i) != 0) {
            str16 = poiRevisitCardItem.regionLevel;
        } else {
            str16 = null;
        }
        if ((536870912 & i) != 0) {
            bool2 = poiRevisitCardItem.noRating;
        } else {
            bool2 = null;
        }
        if ((1073741824 & i) != 0) {
            l = poiRevisitCardItem.realFavoriteCnt;
        } else {
            l = null;
        }
        if ((i & Integer.MIN_VALUE) != 0) {
            poiGeoInfo = poiRevisitCardItem.poiGeoInfo;
        }
        poiRevisitCardItem.getClass();
        return new PoiRevisitCardItem(z2, z3, poiLocation, z5, str, str2, str3, str4, str5, j, poiDetailTag, str6, addressInfo, str7, list, feedProductInfo, str8, map, str9, str10, str11, str12, str13, bool, z4, str14, str15, i2, str16, bool2, l, poiGeoInfo);
    }

    public PoiRevisitCardItem(boolean z, boolean z2, PoiLocation poiLocation, boolean z3, String str, String str2, String str3, String str4, String str5, long j, PoiDetailTag poiDetailTag, String str6, AddressInfo addressInfo, String str7, List<PoiDetailTag> list, FeedProductInfo feedProductInfo, String str8, Map<String, PoiDetailTagStyle> map, String str9, String str10, String str11, String str12, String str13, Boolean bool, boolean z4, String str14, String str15, int i, String str16, Boolean bool2, Long l, PoiRevisitApi.PoiGeoInfo poiGeoInfo) {
        this.LL = z;
        this.LLILLJJLI = z2;
        this.LLILLL = poiLocation;
        this.LLILZ = z3;
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
        this.poiDistanceForShow = str8;
        this.poiDetailTagStyleMap = map;
        this.cityCode = str9;
        this.typeLevel = str10;
        this.regionCode = str11;
        this.collectInfo = str12;
        this.formattedAddress = str13;
        this.isCollected = bool;
        this.isClaimed = z4;
        this.detailPagePoiDisplay = str14;
        this.keyCategory = str15;
        this.poiStatus = i;
        this.regionLevel = str16;
        this.noRating = bool2;
        this.realFavoriteCnt = l;
        this.poiGeoInfo = poiGeoInfo;
    }
}
