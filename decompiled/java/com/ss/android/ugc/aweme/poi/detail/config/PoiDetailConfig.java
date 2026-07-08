package com.ss.android.ugc.aweme.poi.detail.config;

import X.C09CT;
import X.C0C64;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiDetailConfig {
    public static final PoiDetailConfig LIZ = new PoiDetailConfig();

    public static final class Config {

        @C09CT("poi_detail_video_list_config")
        public final List<PoiDetailVideoListConfig> poiDetailVideoListConfig;

        public Config(List<PoiDetailVideoListConfig> list) {
            this.poiDetailVideoListConfig = list;
        }
    }

    public static int LIZ(String str) {
        Config config;
        PoiDetailVideoListConfig poiDetailVideoListConfig = null;
        if (str != null && (config = (Config) C0C64.LJIILLIIL().LJJII(Config.class, null, "poi_detail_config", false)) != null) {
            Iterator<PoiDetailVideoListConfig> it2 = config.poiDetailVideoListConfig.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                PoiDetailVideoListConfig next = it2.next();
                if (Intrinsics.LJFF(next.typeLevel, str)) {
                    poiDetailVideoListConfig = next;
                    break;
                }
            }
            PoiDetailVideoListConfig poiDetailVideoListConfig2 = poiDetailVideoListConfig;
            if (poiDetailVideoListConfig2 != null) {
                return poiDetailVideoListConfig2.poiDetailVideoFetchCount;
            }
            return 18;
        }
        return 18;
    }

    public static final class PoiDetailVideoListConfig {

        @C09CT("auto_play_for_high_end_devices")
        public final int autoPlayForHighEndDevice;

        @C09CT("fetch_count")
        public final int poiDetailVideoFetchCount;

        @C09CT("search_api")
        public final String poiDetailVideoSearchApi;

        @C09CT("two_column")
        public final int poiDetailVideoTwoColumn;

        @C09CT("type_level")
        public final String typeLevel;

        public PoiDetailVideoListConfig() {
            this(0, null, 18, null, 0);
        }

        public PoiDetailVideoListConfig(int i, String str, int i2, String str2, int i3) {
            this.poiDetailVideoTwoColumn = i;
            this.poiDetailVideoSearchApi = str;
            this.poiDetailVideoFetchCount = i2;
            this.typeLevel = str2;
            this.autoPlayForHighEndDevice = i3;
        }
    }
}
