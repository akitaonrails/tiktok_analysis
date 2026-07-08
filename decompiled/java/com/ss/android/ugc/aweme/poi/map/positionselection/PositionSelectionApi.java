package com.ss.android.ugc.aweme.poi.map.positionselection;

import X.C09CT;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501200pAU;
import java.io.Serializable;

/* JADX INFO: loaded from: classes19.dex */
public interface PositionSelectionApi {
    @InterfaceC1501200pAU("/tiktok/map_location/helper/get/v1")
    Object locationDetailInfo(@InterfaceC1501070pAH("lat") String str, @InterfaceC1501070pAH("lng") String str2, @InterfaceC1501070pAH("type") int i, InterfaceC1364105Vn<? super String> interfaceC1364105Vn);

    public static final class LocationDetailInfoResponse implements Serializable {

        @C09CT("city_name")
        public final String cityName;

        @C09CT("geo_name_id")
        public final Object geoNameId;

        @C09CT("in_poi_region")
        public final Boolean inPoiRegion;

        @C09CT("status_code")
        public final Integer statusCode;

        @C09CT("status_msg")
        public final String statusMsg;

        @C09CT("zoom_level")
        public final Integer zoomLevel;

        public LocationDetailInfoResponse() {
            this(null, null, null, null, null, null);
        }

        public LocationDetailInfoResponse(Integer num, String str, Boolean bool, Integer num2, Object obj, String str2) {
            this.statusCode = num;
            this.statusMsg = str;
            this.inPoiRegion = bool;
            this.zoomLevel = num2;
            this.geoNameId = obj;
            this.cityName = str2;
        }
    }
}
