package com.ss.android.ugc.aweme.poi_api.experiment;

import X.C09CT;
import X.C0C64;
import X.C1189060h32;
import X.C1367960lha;
import X.C2188811AlT;
import X.C306700C0m;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.agilelogger.ALog;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiEnableExperiment {
    public static Boolean LIZ;
    public static Boolean LIZIZ;
    public static boolean LIZJ = true;

    public static final class PoiSdkConfig {

        @C09CT("poi_cache_valid_time")
        public long poiCacheValidTime;

        public PoiSdkConfig() {
            this(86400L);
        }

        public PoiSdkConfig(long j) {
            this.poiCacheValidTime = j;
        }
    }

    public static Config LIZ() {
        Config config = (Config) SettingsManager.LIZLLL().LJIIIIZZ("poi_config", Config.class, null);
        return config == null ? new Config(null, null, null, 3600000, null, null, Float.valueOf(1.0f), 1L, new PoiSdkConfig(86400L)) : config;
    }

    public static String LIZIZ() {
        return LIZ().poiKey;
    }

    public static boolean LIZJ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("poi_config enable:");
        sbLIZ.append(LIZ().enable);
        sbLIZ.append(" ; regionCode = ");
        C1367960lha.LIZ.getClass();
        sbLIZ.append(C1367960lha.LIZIZ());
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("poi", C2188811AlT.LIZIZ(sbLIZ));
        if (!C306700C0m.LIZ()) {
            return C1189060h32.LJIIZILJ(LIZ().enable);
        }
        Boolean bool = LIZ().enable;
        Boolean bool2 = Boolean.TRUE;
        return Intrinsics.LJFF(bool, bool2) || Intrinsics.LJFF(LIZIZ, bool2);
    }

    public static boolean LIZLLL() {
        if (C306700C0m.LIZ()) {
            Boolean bool = LIZ().enable;
            Boolean bool2 = Boolean.TRUE;
            return Intrinsics.LJFF(bool, bool2) || Intrinsics.LJFF(LIZIZ, bool2);
        }
        int iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, 0, "poi_enable_using_anchor", false);
        if (iLJIJ != 1 && iLJIJ != 2 && iLJIJ != 3) {
            return LIZJ();
        }
        if (LIZ().enable == null && LIZ == null) {
            return false;
        }
        return (LIZ().enable == null || LIZ == null) ? C1189060h32.LJIIZILJ(LIZ().enable) || C1189060h32.LJIIZILJ(LIZ) : C1189060h32.LJIIZILJ(LIZ().enable);
    }

    public static final class Config {

        @C09CT("enable")
        public final Boolean enable;

        @C09CT("location_cache_time")
        public final int locationCacheTime;

        @C09CT("location_map_settings")
        public final String mapKey;

        @C09CT("map_size_scale")
        public final Float mapSizeScale;

        @C09CT("poi_aweme_cache_count")
        public final Long poiAwemeCacheCount;

        @C09CT("poi_service_settings")
        public final String poiKey;

        @C09CT("poi_sdk_config")
        public PoiSdkConfig poiSdkConfig;

        @C09CT("static_map_url")
        public final String staticMapUrl;

        @C09CT("waze_url")
        public final String wazeUrl;

        public Config() {
            this(null, null, null, 3600000, null, null, Float.valueOf(1.0f), 1L, new PoiSdkConfig(86400L));
        }

        public Config(Boolean bool, String str, String str2, int i, String str3, String str4, Float f, Long l, PoiSdkConfig poiSdkConfig) {
            this.enable = bool;
            this.poiKey = str;
            this.mapKey = str2;
            this.locationCacheTime = i;
            this.wazeUrl = str3;
            this.staticMapUrl = str4;
            this.mapSizeScale = f;
            this.poiAwemeCacheCount = l;
            this.poiSdkConfig = poiSdkConfig;
        }
    }
}
