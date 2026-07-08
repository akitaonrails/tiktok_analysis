package com.ss.android.ugc.aweme.poi.experiment;

import X.C09CT;
import X.C0C64;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiDetailVideoListAutoPlayExp {
    public static final PoiDetailVideoListAutoPlayExp LIZ = new PoiDetailVideoListAutoPlayExp();

    public static final class Config {

        @C09CT("poi_detail_video_list_config")
        public final List<PoiDetailVideoListConfig> poiDetailVideoListConfig;

        public Config() {
            this(null);
        }

        public Config(List<PoiDetailVideoListConfig> list) {
            this.poiDetailVideoListConfig = list;
        }
    }

    public static PoiDetailVideoListConfig LIZ(String str) {
        Config config;
        List<PoiDetailVideoListConfig> list;
        PoiDetailVideoListConfig poiDetailVideoListConfig = null;
        if (str == null || (config = (Config) C0C64.LJIILLIIL().LJJII(Config.class, null, "poi_video_list_exp", false)) == null || (list = config.poiDetailVideoListConfig) == null) {
            return null;
        }
        Iterator<PoiDetailVideoListConfig> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            PoiDetailVideoListConfig next = it2.next();
            if (Intrinsics.LJFF(String.valueOf(next.typeLevel), str)) {
                poiDetailVideoListConfig = next;
                break;
            }
        }
        return poiDetailVideoListConfig;
    }

    public static boolean LIZIZ(String str) {
        PoiDetailVideoListConfig poiDetailVideoListConfigLIZ = LIZ(str);
        if (poiDetailVideoListConfigLIZ != null && poiDetailVideoListConfigLIZ.isAutoPlay) {
            return true;
        }
        return false;
    }

    public static final class PoiDetailVideoListConfig {

        @C09CT("auto_play")
        public final boolean isAutoPlay;

        @C09CT("two_column")
        public final boolean isTwoColumn;

        @C09CT("type_level")
        public final int typeLevel;

        public PoiDetailVideoListConfig() {
            this(false, -1, false);
        }

        public PoiDetailVideoListConfig(boolean z, int i, boolean z2) {
            this.isTwoColumn = z;
            this.typeLevel = i;
            this.isAutoPlay = z2;
        }
    }
}
