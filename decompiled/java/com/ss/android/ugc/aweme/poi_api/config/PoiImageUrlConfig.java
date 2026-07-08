package com.ss.android.ugc.aweme.poi_api.config;

import X.C09CT;
import com.bytedance.ies.abmock.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiImageUrlConfig {
    public static Config LIZ() {
        Config config = (Config) SettingsManager.LIZLLL().LJIIIIZZ("local_service_image_url_configuration", Config.class, null);
        if (config != null) {
            return config;
        }
        return null;
    }

    public static final class Config {

        @C09CT("poi_detail_address_bg_img_dark")
        public final String poiDetailAddressBgDark;

        @C09CT("poi_detail_address_bg_img_dark_rtl")
        public final String poiDetailAddressBgDarkRTL;

        @C09CT("poi_detail_address_bg_img_light")
        public final String poiDetailAddressBgLight;

        @C09CT("poi_detail_address_bg_img_light_rtl")
        public final String poiDetailAddressBgLightRTL;

        @C09CT("poi_detail_address_bg_img_dark_v2")
        public final String poiDetailBottomAddressBgDark;

        @C09CT("poi_detail_address_bg_img_dark_rtl_v2")
        public final String poiDetailBottomAddressBgDarkRtl;

        @C09CT("poi_detail_address_bg_img_light_v2")
        public final String poiDetailBottomAddressBgLight;

        @C09CT("poi_detail_address_bg_img_light_rtl_v2")
        public final String poiDetailBottomAddressBgLightRtl;

        @C09CT("poi_detail_address_bg_img_dark_double_column_v2")
        public final String poiDetailMiddleAddressBgDark;

        @C09CT("poi_detail_address_bg_img_dark_rtl_double_column_v2")
        public final String poiDetailMiddleAddressBgDarkRtl;

        @C09CT("poi_detail_address_bg_img_light_double_column_v2")
        public final String poiDetailMiddleAddressBgLight;

        @C09CT("poi_detail_address_bg_img_light_rtl_double_column_v2")
        public final String poiDetailMiddleAddressBgLightRtl;

        public Config() {
            this(null, null, null, null, null, null, null, null, null, null, null, null);
        }

        public Config(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
            this.poiDetailAddressBgLight = str;
            this.poiDetailAddressBgDark = str2;
            this.poiDetailAddressBgLightRTL = str3;
            this.poiDetailAddressBgDarkRTL = str4;
            this.poiDetailMiddleAddressBgDark = str5;
            this.poiDetailMiddleAddressBgDarkRtl = str6;
            this.poiDetailBottomAddressBgDarkRtl = str7;
            this.poiDetailBottomAddressBgDark = str8;
            this.poiDetailBottomAddressBgLight = str9;
            this.poiDetailBottomAddressBgLightRtl = str10;
            this.poiDetailMiddleAddressBgLight = str11;
            this.poiDetailMiddleAddressBgLightRtl = str12;
        }
    }
}
