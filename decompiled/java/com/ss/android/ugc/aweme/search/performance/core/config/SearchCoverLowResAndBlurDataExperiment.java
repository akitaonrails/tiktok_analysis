package com.ss.android.ugc.aweme.search.performance.core.config;

import X.C01GW;
import X.C07F9;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS196S0000000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchCoverLowResAndBlurDataExperiment {
    public static final Config LIZ = new Config(0, Boolean.FALSE, 0, 0);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(343));

    public static final boolean LIZ() {
        Boolean bool;
        return (C07F9.LIZ() & 2) == 2 && (bool = ((Config) LIZIZ.getValue()).switchPool) != null && bool.booleanValue();
    }

    public static final class Config {

        @C09CT("fade_duration")
        public final Integer fadeDuration;

        @C09CT("placeholder_default_height")
        public final Integer placeholderDefaultHeight;

        @C09CT("placeholder_default_width")
        public final Integer placeholderDefaultWidth;

        @C09CT("switch_pool")
        public final Boolean switchPool;

        public Config() {
            this(0, Boolean.FALSE, 0, 0);
        }

        public Config(Integer num, Boolean bool, Integer num2, Integer num3) {
            this.fadeDuration = num;
            this.switchPool = bool;
            this.placeholderDefaultWidth = num2;
            this.placeholderDefaultHeight = num3;
        }
    }
}
