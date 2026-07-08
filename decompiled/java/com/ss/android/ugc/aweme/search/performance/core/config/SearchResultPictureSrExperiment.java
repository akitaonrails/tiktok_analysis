package com.ss.android.ugc.aweme.search.performance.core.config;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS196S0000000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchResultPictureSrExperiment {
    public static final SearchSrAbModel LIZ = new SearchSrAbModel(0, 0.0f, 0.0f, 0, 0, 0);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(347));

    public static float LIZ() {
        return ((SearchSrAbModel) LIZIZ.getValue()).srLevel;
    }

    public static final class SearchSrAbModel {

        @C09CT("enable_adaptive")
        public final int enableAdaptive;

        @C09CT("search_result_picture_optimize")
        public final int optType;

        @C09CT("sr_level")
        public final float srLevel;

        @C09CT("adaptive_threshold_height")
        public final int thresholdHeight;

        @C09CT("adaptive_threshold_width")
        public final int thresholdWidth;

        @C09CT("usersr_level")
        public final float userSrLevel;

        public SearchSrAbModel() {
            this(0, 0.0f, 0.0f, 0, 0, 0);
        }

        public SearchSrAbModel(int i, float f, float f2, int i2, int i3, int i4) {
            this.optType = i;
            this.srLevel = f;
            this.userSrLevel = f2;
            this.enableAdaptive = i2;
            this.thresholdWidth = i3;
            this.thresholdHeight = i4;
        }
    }
}
