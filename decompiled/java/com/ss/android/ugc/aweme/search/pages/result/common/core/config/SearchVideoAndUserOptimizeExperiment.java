package com.ss.android.ugc.aweme.search.pages.result.common.core.config;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS196S0000000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchVideoAndUserOptimizeExperiment {
    public static final SearchVideoAndUserOptimizeExperiment LIZ = new SearchVideoAndUserOptimizeExperiment();
    public static final OptimizeConfig LIZIZ = new OptimizeConfig(true, false, false, false, false, false, false);
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(285));

    public static boolean LIZ() {
        return !((OptimizeConfig) LIZJ.getValue()).isDefault;
    }

    public static final class OptimizeConfig {

        @C09CT("click_search_optimize")
        public final boolean clickSearchOptimize;

        @C09CT("hashtag_optimize")
        public final boolean hashTagOptimize;

        @C09CT("is_default")
        public final boolean isDefault;

        @C09CT("listener_optimize")
        public final boolean listenerOptimize;

        @C09CT("user_image_async_load")
        public final boolean userImageAsyncLoad;

        @C09CT("user_layout_optimize")
        public final boolean userLayoutOptimize;

        @C09CT("video_image_async_load")
        public final boolean videoImageAsyncLoad;

        public OptimizeConfig() {
            this(true, false, false, false, false, false, false);
        }

        public OptimizeConfig(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
            this.isDefault = z;
            this.videoImageAsyncLoad = z2;
            this.userImageAsyncLoad = z3;
            this.userLayoutOptimize = z4;
            this.clickSearchOptimize = z5;
            this.hashTagOptimize = z6;
            this.listenerOptimize = z7;
        }
    }
}
