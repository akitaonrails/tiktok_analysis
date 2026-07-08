package com.ss.android.ugc.aweme.poi.detail.videolist;

import X.C09CT;
import X.C1227904rF;
import X.C2188811AlT;
import android.content.Context;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi_api.model.PoiLocation;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiPostHelper {
    public static final PoiPostHelper LIZ = new PoiPostHelper();

    public static PoiInfo LIZIZ(String str, PoiListApi.PoiDetailResponse poiDetailResponse) {
        Double d;
        String categoryName = poiDetailResponse.getCategoryName();
        String address = poiDetailResponse.getAddress();
        PoiLocation poiLocation = poiDetailResponse.getPoiLocation();
        Double d2 = null;
        if (poiLocation != null) {
            d = poiLocation.lng;
        } else {
            d = null;
        }
        PoiLocation poiLocation2 = poiDetailResponse.getPoiLocation();
        if (poiLocation2 != null) {
            d2 = poiLocation2.lat;
        }
        return new PoiInfo(str, categoryName, address, d, d2, str, new PoiDetails(poiDetailResponse.getProvinceCode(), poiDetailResponse.getTtTypeCode(), poiDetailResponse.getCollectInfo(), poiDetailResponse.getGeoNameIds(), poiDetailResponse.getTtTypeNameSuper(), poiDetailResponse.getTypeLevel(), poiDetailResponse.getCityPoiName(), poiDetailResponse.getCityPoiId(), poiDetailResponse.getCityCode(), poiDetailResponse.getCityName(), poiDetailResponse.getTtTypeNameMedium(), poiDetailResponse.getCountryCode(), poiDetailResponse.getTtTypeNameTiny()), poiDetailResponse.getAddress(), poiDetailResponse.getName());
    }

    public static final class PoiBizInfo {

        @C09CT("poi_enter_from")
        public final String enterFrom;

        @C09CT("poi_enter_method")
        public final String enterMethod;

        @C09CT("poi_info")
        public final PoiInfo poiInfo;

        @C09CT("show_intro_sheet")
        public final int showIntroSheet;

        public PoiBizInfo(PoiInfo poiInfo, int i, String str, String str2) {
            this.poiInfo = poiInfo;
            this.showIntroSheet = i;
            this.enterFrom = str;
            this.enterMethod = str2;
        }
    }

    public static void LIZ(Context context, String str, String str2, PoiInfo poiInfo) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("aweme://openShoot?type=poi&enter_from=ttls_poi_detail&shoot_way=ttls_poi_detail&poi_biz_info=");
        C1227904rF c1227904rF = C1227904rF.LIZ;
        PoiBizInfo poiBizInfo = new PoiBizInfo(poiInfo, 0, str, str2);
        c1227904rF.getClass();
        sbLIZ.append(C1227904rF.LJI(poiBizInfo));
        SmartRouter.buildRoute(context, C2188811AlT.LIZIZ(sbLIZ)).open();
    }

    public static final class PoiInfo {

        @C09CT("address")
        public final String address;

        @C09CT("display_category")
        public final String displayCategory;

        @C09CT("formatted_address")
        public final String formattedAddress;

        @C09CT(FollowStatusChangeMethod.PARAM_UID)
        public final String id;

        @C09CT("latitude")
        public final Double latitude;

        @C09CT("longitude")
        public final Double longitude;

        @C09CT("name")
        public final String name;

        @C09CT("details")
        public final PoiDetails poiDetails;

        @C09CT("service_id")
        public final String serviceId;

        public PoiInfo() {
            this(null, null, null, null, null, null, null, null, null);
        }

        public PoiInfo(String str, String str2, String str3, Double d, Double d2, String str4, PoiDetails poiDetails, String str5, String str6) {
            this.id = str;
            this.displayCategory = str2;
            this.formattedAddress = str3;
            this.longitude = d;
            this.latitude = d2;
            this.serviceId = str4;
            this.poiDetails = poiDetails;
            this.address = str5;
            this.name = str6;
        }
    }

    public static final class PoiDetails {

        @C09CT("city_code")
        public final String cityCode;

        @C09CT("city_name")
        public final String cityName;

        @C09CT("city_poi_id")
        public final String cityPoiId;

        @C09CT("city_poi_name")
        public final String cityPoiName;

        @C09CT("collect_info")
        public final String collectInfo;

        @C09CT("country_code")
        public final String countryCode;

        @C09CT("geo_name_ids")
        public final String geoNameIds;

        @C09CT("province_code")
        public final String provinceCode;

        @C09CT("tt_type_code")
        public final String ttTypeCode;

        @C09CT("tt_type_name_medium")
        public final String ttTypeNameMedium;

        @C09CT("tt_type_name_super")
        public final String ttTypeNameSuper;

        @C09CT("tt_type_name_tiny")
        public final String ttTypeNameTiny;

        @C09CT("type_level")
        public final String typeLevel;

        public PoiDetails() {
            this(null, null, null, null, null, null, null, null, null, null, null, null, null);
        }

        public PoiDetails(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13) {
            this.provinceCode = str;
            this.ttTypeCode = str2;
            this.collectInfo = str3;
            this.geoNameIds = str4;
            this.ttTypeNameSuper = str5;
            this.typeLevel = str6;
            this.cityPoiName = str7;
            this.cityPoiId = str8;
            this.cityCode = str9;
            this.cityName = str10;
            this.ttTypeNameMedium = str11;
            this.countryCode = str12;
            this.ttTypeNameTiny = str13;
        }
    }
}
