package com.ss.android.ugc.aweme.poi.experiment;

import X.C09CT;
import X.C0C64;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiDetailVideoReviewListExp {
    public static final PoiDetailVideoReviewListExp LIZ = new PoiDetailVideoReviewListExp();

    public static final class Config {

        @C09CT("poi_video_review_list_config")
        public final List<PoiDetailVideoReviewListConfig> poiDetailVideoReviewListConfig;

        public Config() {
            this(null);
        }

        public Config(List<PoiDetailVideoReviewListConfig> list) {
            this.poiDetailVideoReviewListConfig = list;
        }
    }

    public static boolean LIZ(String str) {
        Config config;
        List<PoiDetailVideoReviewListConfig> list;
        PoiDetailVideoReviewListConfig poiDetailVideoReviewListConfig = null;
        if (str != null && (config = (Config) C0C64.LJIILLIIL().LJJII(Config.class, null, "poi_video_review_list_exp", true)) != null && (list = config.poiDetailVideoReviewListConfig) != null) {
            Iterator<PoiDetailVideoReviewListConfig> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                PoiDetailVideoReviewListConfig next = it2.next();
                if (Intrinsics.LJFF(String.valueOf(next.typeLevel), str)) {
                    poiDetailVideoReviewListConfig = next;
                    break;
                }
            }
            PoiDetailVideoReviewListConfig poiDetailVideoReviewListConfig2 = poiDetailVideoReviewListConfig;
            if (poiDetailVideoReviewListConfig2 != null && poiDetailVideoReviewListConfig2.isTwoColumn) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final class PoiDetailVideoReviewListConfig {

        @C09CT("two_column")
        public final boolean isTwoColumn;

        @C09CT("type_level")
        public final int typeLevel;

        public PoiDetailVideoReviewListConfig() {
            this(false, -1);
        }

        public PoiDetailVideoReviewListConfig(boolean z, int i) {
            this.isTwoColumn = z;
            this.typeLevel = i;
        }
    }
}
