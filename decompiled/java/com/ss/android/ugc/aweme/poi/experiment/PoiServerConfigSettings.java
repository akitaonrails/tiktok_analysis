package com.ss.android.ugc.aweme.poi.experiment;

import X.C09CT;
import X.C0C64;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiServerConfigSettings {
    public static final Config LIZ = new Config(0, 0, 0, 0);

    public static Config LIZ() {
        Config config = (Config) C0C64.LJIILLIIL().LJJII(Config.class, LIZ, "poi_core", false);
        return config == null ? new Config(0, 0, 0, 0) : config;
    }

    public static boolean LIZIZ() {
        Integer num = LIZ().regionPoiDiscovery;
        return num != null && num.intValue() > 0;
    }

    public static final class Config {

        @C09CT("poi_consumption_reverse")
        public final Integer poiConsumptionReverse;

        @C09CT("publish_landing_nearby")
        public final Integer publishLandingNearby;

        @C09CT("region_poi_discovery")
        public final Integer regionPoiDiscovery;

        @C09CT("region_poi_discovery_gps_freq")
        public final Integer regionPoiDiscoveryGpsFreq;

        public Config() {
            this(0, 0, 0, 0);
        }

        public Config(Integer num, Integer num2, Integer num3, Integer num4) {
            this.poiConsumptionReverse = num;
            this.publishLandingNearby = num2;
            this.regionPoiDiscovery = num3;
            this.regionPoiDiscoveryGpsFreq = num4;
        }
    }
}
