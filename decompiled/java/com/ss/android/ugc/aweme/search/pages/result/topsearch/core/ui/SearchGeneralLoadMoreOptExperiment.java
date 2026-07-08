package com.ss.android.ugc.aweme.search.pages.result.topsearch.core.ui;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchGeneralLoadMoreOptExperiment {
    public static final Config LIZ = new Config(Boolean.FALSE, Boolean.FALSE, 4, Integer.valueOf(LSPassThroughRecordSizeConfig.DEFAULT), 30, 100, 5000, Boolean.FALSE, Boolean.FALSE, 2, Boolean.FALSE, 0);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(319));

    public static final class Config {

        @C09CT("debounce_time")
        public final Integer debounceTime;

        @C09CT("enable")
        public final Boolean enable;

        @C09CT("extra_layout_space_opt")
        public final Boolean extraLayoutSpaceOpt;

        @C09CT("extra_layout_space_scale")
        public final Integer extraLayoutSpaceScale;

        @C09CT("fast_scroll_opt")
        public final Boolean fastScrollOpt;

        @C09CT("fling_threshold")
        public final Integer flingThreshold;

        @C09CT("idle_accumulated_dy")
        public final Integer idleAccumulatedDy;

        @C09CT("item_view_cache_size_count")
        public final Integer itemViewCacheSizeCount;

        @C09CT("item_view_cache_size_opt")
        public final Boolean itemViewCacheSizeOpt;

        @C09CT("offset")
        public final Integer offset;

        @C09CT("replace_current_offset")
        public final Boolean replaceCurrentOffset;

        @C09CT("scroll_accumulated_dy")
        public final Integer scrollAccumulatedDy;

        public Config() {
            this(Boolean.FALSE, Boolean.FALSE, 4, Integer.valueOf(LSPassThroughRecordSizeConfig.DEFAULT), 30, 100, 5000, Boolean.FALSE, Boolean.FALSE, 2, Boolean.FALSE, 0);
        }

        public Config(Boolean bool, Boolean bool2, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Boolean bool3, Boolean bool4, Integer num6, Boolean bool5, Integer num7) {
            this.enable = bool;
            this.replaceCurrentOffset = bool2;
            this.offset = num;
            this.debounceTime = num2;
            this.scrollAccumulatedDy = num3;
            this.idleAccumulatedDy = num4;
            this.flingThreshold = num5;
            this.fastScrollOpt = bool3;
            this.itemViewCacheSizeOpt = bool4;
            this.itemViewCacheSizeCount = num6;
            this.extraLayoutSpaceOpt = bool5;
            this.extraLayoutSpaceScale = num7;
        }
    }

    public static Config LIZIZ() {
        return (Config) LIZIZ.getValue();
    }

    public static boolean LIZ() {
        return Intrinsics.LJFF(LIZIZ().enable, Boolean.TRUE);
    }
}
