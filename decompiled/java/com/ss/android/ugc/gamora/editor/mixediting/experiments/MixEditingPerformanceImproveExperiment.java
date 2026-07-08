package com.ss.android.ugc.gamora.editor.mixediting.experiments;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS210S0000000_22;

/* JADX INFO: loaded from: classes23.dex */
public final class MixEditingPerformanceImproveExperiment {
    public static final MixEditingPerformanceImproveExperiment LIZ = new MixEditingPerformanceImproveExperiment();
    public static final MixEditPerformanceConfig LIZIZ = new MixEditPerformanceConfig(0, 0, 0, 0, false, Integer.MAX_VALUE);
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(217));

    public static final class MixEditPerformanceConfig {

        @C09CT("enable_far_away_scroll_cancellation")
        public final boolean enableCancellation;

        @C09CT("far_away_cancellation_distance")
        public final int farAwayThreshold;

        @C09CT("first_preload_maxCount")
        public final int firstPredownloadCount;

        @C09CT("leading_preload_maxCount")
        public final int leadingCount;

        @C09CT("preload_queue_maxCount")
        public final int preloadMaxConcurrency;

        @C09CT("trailing_preload_maxCount")
        public final int trailCount;

        public MixEditPerformanceConfig() {
            this(0, 0, 0, 0, false, Integer.MAX_VALUE);
        }

        public MixEditPerformanceConfig(int i, int i2, int i3, int i4, boolean z, int i5) {
            this.firstPredownloadCount = i;
            this.leadingCount = i2;
            this.trailCount = i3;
            this.preloadMaxConcurrency = i4;
            this.enableCancellation = z;
            this.farAwayThreshold = i5;
        }
    }

    public static MixEditPerformanceConfig LIZ() {
        return (MixEditPerformanceConfig) LIZJ.getValue();
    }
}
