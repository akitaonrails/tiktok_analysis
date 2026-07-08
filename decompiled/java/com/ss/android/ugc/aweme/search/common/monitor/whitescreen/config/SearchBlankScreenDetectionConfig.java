package com.ss.android.ugc.aweme.search.common.monitor.whitescreen.config;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import java.util.List;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: loaded from: classes4.dex */
public final class SearchBlankScreenDetectionConfig {
    public static final Config LIZ = new Config(null, null, null, null, null);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(532));

    public static final class SearchBlankDetailStrategy {

        @C09CT("enable")
        public final Boolean enable;

        @C09CT("ratio")
        public final Double ratio;

        @C09CT("threshold")
        public final Double threshold;

        public SearchBlankDetailStrategy(Boolean bool, Double d, Double d2) {
            this.enable = bool;
            this.ratio = d;
            this.threshold = d2;
        }
    }

    /* JADX INFO: loaded from: classes11.dex */
    public static final class SearchBlankSamplePointsStrategy {

        @C09CT("columns")
        public final Integer columns;

        @C09CT("enable")
        public final Boolean enable;

        @C09CT("rows")
        public final Integer rows;

        @C09CT("threshold")
        public final Double threshold;

        public SearchBlankSamplePointsStrategy(Boolean bool, Integer num, Integer num2, Double d) {
            this.enable = bool;
            this.rows = num;
            this.columns = num2;
            this.threshold = d;
        }
    }

    public static final class Config {

        @C09CT("search_blank_check_delay")
        public final Integer searchBlankCheckDelay;

        @C09CT("search_blank_check_enable_scenes")
        public final List<String> searchBlankCheckEnableScenes;

        @C09CT("search_blank_color_standard")
        public final SearchBlankColorStandard searchBlankColorStandard;

        @C09CT("search_blank_detail_strategy")
        public final SearchBlankDetailStrategy searchBlankDetailStrategy;

        @C09CT("search_blank_sample_points_strategy")
        public final SearchBlankSamplePointsStrategy searchBlankSamplePointsStrategy;

        public Config() {
            this(null, null, null, null, null);
        }

        public Config(List<String> list, Integer num, SearchBlankSamplePointsStrategy searchBlankSamplePointsStrategy, SearchBlankDetailStrategy searchBlankDetailStrategy, SearchBlankColorStandard searchBlankColorStandard) {
            this.searchBlankCheckEnableScenes = list;
            this.searchBlankCheckDelay = num;
            this.searchBlankSamplePointsStrategy = searchBlankSamplePointsStrategy;
            this.searchBlankDetailStrategy = searchBlankDetailStrategy;
            this.searchBlankColorStandard = searchBlankColorStandard;
        }
    }

    /* JADX INFO: loaded from: classes11.dex */
    public static final class SearchBlankColorStandard {

        @C09CT("compared_a")
        public final Integer comparedA;

        @C09CT("compared_b")
        public final Integer comparedB;

        @C09CT("compared_l")
        public final Integer comparedL;

        @C09CT("delta_a")
        public final Integer deltaA;

        @C09CT("delta_b")
        public final Integer deltaB;

        @C09CT("delta_l")
        public final Integer deltaL;

        public SearchBlankColorStandard(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6) {
            this.deltaA = num;
            this.deltaB = num2;
            this.deltaL = num3;
            this.comparedA = num4;
            this.comparedB = num5;
            this.comparedL = num6;
        }
    }
}
