package com.ss.android.ugc.aweme.ecommercelive.common.infra.region.ab;

import X.C09CT;
import X.C0C64;
import X.C2097608Jq;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes28.dex */
public final class ECRegionSyncSettings {
    public static final EcomRegionConfig LIZ;

    public static final class EcomCodeConfig {

        @C09CT("custom")
        public final Map<String, List<String>> custom;

        @C09CT("default_code")
        public final String defaultCode;

        public EcomCodeConfig() {
            this("", C2097608Jq.LJ());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public EcomCodeConfig(String str, Map<String, ? extends List<String>> map) {
            this.defaultCode = str;
            this.custom = map;
        }
    }

    static {
        EcomRegionConfig ecomRegionConfig = new EcomRegionConfig(2, false, C2097608Jq.LJ());
        EcomRegionConfig ecomRegionConfig2 = (EcomRegionConfig) C0C64.LJIILLIIL().LJJII(EcomRegionConfig.class, ecomRegionConfig, "ttkec_region_update_opt", true);
        if (ecomRegionConfig2 != null) {
            ecomRegionConfig = ecomRegionConfig2;
        }
        LIZ = ecomRegionConfig;
    }

    public static final class EcomRegionConfig {

        @C09CT("region_match_config")
        public final Map<String, EcomCodeConfig> codeConfigMap;

        @C09CT("region_update_type")
        public final int regionUpdateType;

        @C09CT("live_room_static_region")
        public final boolean staticRegionInRoom;

        public EcomRegionConfig() {
            this(2, false, C2097608Jq.LJ());
        }

        public EcomRegionConfig(int i, boolean z, Map<String, EcomCodeConfig> map) {
            this.regionUpdateType = i;
            this.staticRegionInRoom = z;
            this.codeConfigMap = map;
        }
    }
}
