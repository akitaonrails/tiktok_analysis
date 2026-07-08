package com.ss.android.ugc.aweme.poi.revisit.api;

import X.C09CT;
import X.C13LP;
import X.C2188811AlT;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.poi.PoiRevisitBannerRelatedResponse;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiDetailTag;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiDetailTagStyle;
import com.ss.android.ugc.aweme.poi.mapmode.model.PoiDiscoveryCard;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.ss.android.ugc.aweme.poi.revisit.model.PoiRevisitCardItem;
import com.ss.android.ugc.aweme.poi_api.model.PoiLocation;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public interface PoiRevisitApi {

    public static final class PoiRevisitCardModel {
        public final boolean LIZ;
        public final List<PoiDiscoveryCard> LIZIZ;

        @C09CT("category_name")
        public final String categoryName;

        @C09CT("city_code")
        public final String cityCode;

        @C09CT("collect_info")
        public final String collectInfo;

        @C09CT("cover")
        public final UrlModel cover;

        @C09CT("detail_page_poi_display")
        public final String detailPagePoiDisplay;

        @C09CT("distance")
        public final String distance;

        @C09CT("is_claimed")
        public final boolean isClaimed;

        @C09CT("is_collected")
        public final Boolean isCollected;

        @C09CT("key_category")
        public final String keyCategory;

        @C09CT("location")
        public final PoiLocation location;

        @C09CT("formatted_address")
        public final String poiAddress;

        @C09CT("poi_detail_tags")
        public final List<PoiDetailTag> poiDetailTag;

        @C09CT("poi_detail_tag_style_map")
        public final Map<String, PoiDetailTagStyle> poiDetailTagStyleMap;

        @C09CT("poi_distance_for_show")
        public final String poiDistanceForShow;

        @C09CT("poi_geo_info")
        public final PoiGeoInfo poiGeoInfo;

        @C09CT("poi_id")
        public final String poiId;

        @C09CT("poi_info_source")
        public final String poiInfoSource;

        @C09CT("poi_name")
        public final String poiName;

        @C09CT("poi_review_summary")
        public final PoiReviewsApi.PoiReviewSummaryModel poiReviewSummary;

        @C09CT("poi_status")
        public final int poiStatus;

        @C09CT("real_time_fav_cnt")
        public final Long realFavoriteCnt;

        @C09CT("region_code")
        public final String regionCode;

        @C09CT("region_level")
        public final String regionLevel;

        @C09CT("type_level")
        public final String typeLevel;

        @C09CT("upper_tag")
        public final PoiDetailTag upperTag;

        public PoiRevisitCardModel() {
            this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, false, null, null, null, null, null, null, false, null);
        }

        public final PoiRevisitCardItem LIZIZ() {
            Long l;
            Double d;
            Double d2;
            List<String> urlList;
            String str = this.poiId;
            UrlModel urlModel = this.cover;
            String str2 = (urlModel == null || (urlList = urlModel.getUrlList()) == null) ? null : (String) C13LP.LJJJLL(urlList);
            String str3 = this.poiName;
            PoiReviewsApi.PoiReviewSummaryModel poiReviewSummaryModel = this.poiReviewSummary;
            String string = (poiReviewSummaryModel == null || (d2 = poiReviewSummaryModel.score) == null) ? null : d2.toString();
            PoiReviewsApi.PoiReviewSummaryModel poiReviewSummaryModel2 = this.poiReviewSummary;
            String string2 = (poiReviewSummaryModel2 == null || (d = poiReviewSummaryModel2.maxScore) == null) ? null : Integer.valueOf((int) d.doubleValue()).toString();
            PoiReviewsApi.PoiReviewSummaryModel poiReviewSummaryModel3 = this.poiReviewSummary;
            long jLongValue = (poiReviewSummaryModel3 == null || (l = poiReviewSummaryModel3.totalCount) == null) ? 0L : l.longValue();
            PoiDetailTag poiDetailTag = this.upperTag;
            String str4 = this.categoryName;
            String str5 = this.distance;
            String str6 = this.poiDistanceForShow;
            List<PoiDetailTag> list = this.poiDetailTag;
            Map<String, PoiDetailTagStyle> map = this.poiDetailTagStyleMap;
            String str7 = this.cityCode;
            String str8 = this.typeLevel;
            String str9 = this.regionCode;
            String str10 = this.collectInfo;
            String str11 = this.poiAddress;
            Boolean bool = this.isCollected;
            boolean z = this.isClaimed;
            String str12 = this.detailPagePoiDisplay;
            String str13 = this.keyCategory;
            int i = this.poiStatus;
            String str14 = this.regionLevel;
            PoiReviewsApi.PoiReviewSummaryModel poiReviewSummaryModel4 = this.poiReviewSummary;
            return new PoiRevisitCardItem(false, true, this.location, false, str, str2, str3, string, string2, jLongValue, poiDetailTag, str4, null, str5, list, null, str6, map, str7, str8, str9, str10, str11, bool, z, str12, str13, i, str14, poiReviewSummaryModel4 != null ? poiReviewSummaryModel4.noRating : null, this.realFavoriteCnt, this.poiGeoInfo);
        }

        public static PoiRevisitCardModel LIZ(PoiRevisitCardModel poiRevisitCardModel, Boolean bool, boolean z, List list, int i) {
            String str;
            String str2;
            String str3;
            PoiLocation poiLocation;
            String str4;
            String str5;
            PoiReviewsApi.PoiReviewSummaryModel poiReviewSummaryModel;
            String str6;
            PoiDetailTag poiDetailTag;
            String str7;
            Map<String, PoiDetailTagStyle> map;
            List<PoiDetailTag> list2;
            String str8;
            String str9;
            int i2;
            String str10;
            String str11;
            boolean z2;
            String str12;
            UrlModel urlModel;
            String str13;
            String str14;
            Long l;
            List list3 = list;
            boolean z3 = z;
            Boolean bool2 = bool;
            PoiGeoInfo poiGeoInfo = null;
            if ((i & 1) != 0) {
                str = poiRevisitCardModel.poiName;
            } else {
                str = null;
            }
            if ((i & 2) != 0) {
                str2 = poiRevisitCardModel.poiAddress;
            } else {
                str2 = null;
            }
            if ((i & 4) != 0) {
                str3 = poiRevisitCardModel.poiId;
            } else {
                str3 = null;
            }
            if ((i & 8) != 0) {
                poiLocation = poiRevisitCardModel.location;
            } else {
                poiLocation = null;
            }
            if ((i & 16) != 0) {
                str4 = poiRevisitCardModel.typeLevel;
            } else {
                str4 = null;
            }
            if ((i & 32) != 0) {
                str5 = poiRevisitCardModel.poiInfoSource;
            } else {
                str5 = null;
            }
            if ((i & 64) != 0) {
                poiReviewSummaryModel = poiRevisitCardModel.poiReviewSummary;
            } else {
                poiReviewSummaryModel = null;
            }
            if ((i & 128) != 0) {
                str6 = poiRevisitCardModel.categoryName;
            } else {
                str6 = null;
            }
            if ((i & 256) != 0) {
                poiDetailTag = poiRevisitCardModel.upperTag;
            } else {
                poiDetailTag = null;
            }
            if ((i & 512) != 0) {
                str7 = poiRevisitCardModel.distance;
            } else {
                str7 = null;
            }
            if ((i & 1024) != 0) {
                map = poiRevisitCardModel.poiDetailTagStyleMap;
            } else {
                map = null;
            }
            if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
                list2 = poiRevisitCardModel.poiDetailTag;
            } else {
                list2 = null;
            }
            if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
                str8 = poiRevisitCardModel.poiDistanceForShow;
            } else {
                str8 = null;
            }
            if ((i & 8192) != 0) {
                str9 = poiRevisitCardModel.detailPagePoiDisplay;
            } else {
                str9 = null;
            }
            if ((i & 16384) != 0) {
                i2 = poiRevisitCardModel.poiStatus;
            } else {
                i2 = 0;
            }
            if ((32768 & i) != 0) {
                str10 = poiRevisitCardModel.regionCode;
            } else {
                str10 = null;
            }
            if ((65536 & i) != 0) {
                str11 = poiRevisitCardModel.collectInfo;
            } else {
                str11 = null;
            }
            if ((131072 & i) != 0) {
                bool2 = poiRevisitCardModel.isCollected;
            }
            if ((262144 & i) != 0) {
                z2 = poiRevisitCardModel.isClaimed;
            } else {
                z2 = false;
            }
            if ((524288 & i) != 0) {
                str12 = poiRevisitCardModel.keyCategory;
            } else {
                str12 = null;
            }
            if ((1048576 & i) != 0) {
                urlModel = poiRevisitCardModel.cover;
            } else {
                urlModel = null;
            }
            if ((2097152 & i) != 0) {
                str13 = poiRevisitCardModel.cityCode;
            } else {
                str13 = null;
            }
            if ((4194304 & i) != 0) {
                str14 = poiRevisitCardModel.regionLevel;
            } else {
                str14 = null;
            }
            if ((8388608 & i) != 0) {
                l = poiRevisitCardModel.realFavoriteCnt;
            } else {
                l = null;
            }
            if ((16777216 & i) != 0) {
                poiGeoInfo = poiRevisitCardModel.poiGeoInfo;
            }
            if ((33554432 & i) != 0) {
                z3 = poiRevisitCardModel.LIZ;
            }
            if ((i & 67108864) != 0) {
                list3 = poiRevisitCardModel.LIZIZ;
            }
            poiRevisitCardModel.getClass();
            return new PoiRevisitCardModel(str, str2, str3, poiLocation, str4, str5, poiReviewSummaryModel, str6, poiDetailTag, str7, map, list2, str8, str9, i2, str10, str11, bool2, z2, str12, urlModel, str13, str14, l, poiGeoInfo, z3, list3);
        }

        public PoiRevisitCardModel(String str, String str2, String str3, PoiLocation poiLocation, String str4, String str5, PoiReviewsApi.PoiReviewSummaryModel poiReviewSummaryModel, String str6, PoiDetailTag poiDetailTag, String str7, Map<String, PoiDetailTagStyle> map, List<PoiDetailTag> list, String str8, String str9, int i, String str10, String str11, Boolean bool, boolean z, String str12, UrlModel urlModel, String str13, String str14, Long l, PoiGeoInfo poiGeoInfo, boolean z2, List<PoiDiscoveryCard> list2) {
            this.poiName = str;
            this.poiAddress = str2;
            this.poiId = str3;
            this.location = poiLocation;
            this.typeLevel = str4;
            this.poiInfoSource = str5;
            this.poiReviewSummary = poiReviewSummaryModel;
            this.categoryName = str6;
            this.upperTag = poiDetailTag;
            this.distance = str7;
            this.poiDetailTagStyleMap = map;
            this.poiDetailTag = list;
            this.poiDistanceForShow = str8;
            this.detailPagePoiDisplay = str9;
            this.poiStatus = i;
            this.regionCode = str10;
            this.collectInfo = str11;
            this.isCollected = bool;
            this.isClaimed = z;
            this.keyCategory = str12;
            this.cover = urlModel;
            this.cityCode = str13;
            this.regionLevel = str14;
            this.realFavoriteCnt = l;
            this.poiGeoInfo = poiGeoInfo;
            this.LIZ = z2;
            this.LIZIZ = list2;
        }
    }

    @InterfaceC1501160pAQ("/tiktok/ls/collection/items/related_poi_list/v1")
    Object getBannerInfo(@InterfaceC1501070pAH("item_archive_id") String str, InterfaceC1364105Vn<? super PoiRevisitBannerRelatedResponse> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/tiktok/ls/collection/related_poi_card/v1")
    Object getPoiCardList(@InterfaceC1501070pAH("poi_list") String str, @InterfaceC1501070pAH("enc_lat") String str2, @InterfaceC1501070pAH("enc_lng") String str3, InterfaceC1364105Vn<? super PoiRevisitCardListResponse> interfaceC1364105Vn);

    public static final class GeoInfo implements Serializable {

        @C09CT("geo_name")
        public final String geoName;

        @C09CT("geo_name_id")
        public final String geoNameId;

        public GeoInfo() {
            this(null, null);
        }

        public int hashCode() {
            String str = this.geoName;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.geoNameId;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public GeoInfo(String str, String str2) {
            this.geoName = str;
            this.geoNameId = str2;
        }
    }

    /* JADX INFO: loaded from: classes10.dex */
    public static final class PoiRevisitCardListResponse extends BaseResponse {

        @C09CT("distance_index")
        public final List<Integer> distanceIndex;

        @C09CT("poi_card_list")
        public final List<PoiRevisitCardModel> poiCardList;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PoiRevisitCardListResponse)) {
                return false;
            }
            PoiRevisitCardListResponse poiRevisitCardListResponse = (PoiRevisitCardListResponse) obj;
            return Intrinsics.LJFF(this.poiCardList, poiRevisitCardListResponse.poiCardList) && Intrinsics.LJFF(this.distanceIndex, poiRevisitCardListResponse.distanceIndex);
        }

        public final int hashCode() {
            List<PoiRevisitCardModel> list = this.poiCardList;
            int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
            List<Integer> list2 = this.distanceIndex;
            return iHashCode + (list2 != null ? list2.hashCode() : 0);
        }

        @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PoiRevisitCardListResponse(poiCardList=");
            sbLIZ.append(this.poiCardList);
            sbLIZ.append(", distanceIndex=");
            sbLIZ.append(this.distanceIndex);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public PoiRevisitCardListResponse(List<PoiRevisitCardModel> list, List<Integer> list2) {
            this.poiCardList = list;
            this.distanceIndex = list2;
        }
    }

    public static final class PoiGeoInfo implements Serializable {

        @C09CT("l0")
        public final GeoInfo l0;

        @C09CT("l1")
        public final GeoInfo l1;

        @C09CT("l2")
        public final GeoInfo l2;

        @C09CT("l3")
        public final GeoInfo l3;

        @C09CT("l4")
        public final GeoInfo l4;

        public PoiGeoInfo() {
            this(null, null, null, null, null);
        }

        public int hashCode() {
            GeoInfo geoInfo = this.l0;
            int iHashCode = (geoInfo == null ? 0 : geoInfo.hashCode()) * 31;
            GeoInfo geoInfo2 = this.l1;
            int iHashCode2 = (iHashCode + (geoInfo2 == null ? 0 : geoInfo2.hashCode())) * 31;
            GeoInfo geoInfo3 = this.l2;
            int iHashCode3 = (iHashCode2 + (geoInfo3 == null ? 0 : geoInfo3.hashCode())) * 31;
            GeoInfo geoInfo4 = this.l3;
            int iHashCode4 = (iHashCode3 + (geoInfo4 == null ? 0 : geoInfo4.hashCode())) * 31;
            GeoInfo geoInfo5 = this.l4;
            return iHashCode4 + (geoInfo5 != null ? geoInfo5.hashCode() : 0);
        }

        public PoiGeoInfo(GeoInfo geoInfo, GeoInfo geoInfo2, GeoInfo geoInfo3, GeoInfo geoInfo4, GeoInfo geoInfo5) {
            this.l0 = geoInfo;
            this.l1 = geoInfo2;
            this.l2 = geoInfo3;
            this.l3 = geoInfo4;
            this.l4 = geoInfo5;
        }
    }
}
