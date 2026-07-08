package com.ss.android.ugc.aweme.feed.experiment;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import java.io.Serializable;
import kotlin.jvm.internal.AFwS223S0000000_32;

/* JADX INFO: loaded from: classes33.dex */
public final class FlexiblePanelPerformanceSettings {
    public static final FlexiblePanelPerformanceConfig LIZ = new FlexiblePanelPerformanceConfig(3000.0f, 7.0f, 0.3f, new PrerenderConfig(false, null, null, 0.0d, 0, 31, null), new ReuseConfig(false, null, 0.0d, 0, null, 31, null));
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(73));

    public static final class FlexiblePanelPerformanceConfig implements Serializable {

        @C09CT("preload_device_score")
        public final float deviceScoreLimit;

        @C09CT("preload_memory_limit")
        public final float memoryLimit;

        @C09CT("prerender_config")
        public final PrerenderConfig prerenderConfig;

        @C09CT("reuse_config")
        public final ReuseConfig reuseConfig;

        @C09CT("start_preload_time")
        public final float startPreloadTime;

        public FlexiblePanelPerformanceConfig() {
            this(3000.0f, 7.0f, 0.3f, new PrerenderConfig(false, null, null, 0.0d, 0, 31, null), new ReuseConfig(false, null, 0.0d, 0, null, 31, null));
        }

        public FlexiblePanelPerformanceConfig(float f, float f2, float f3, PrerenderConfig prerenderConfig, ReuseConfig reuseConfig) {
            this.startPreloadTime = f;
            this.deviceScoreLimit = f2;
            this.memoryLimit = f3;
            this.prerenderConfig = prerenderConfig;
            this.reuseConfig = reuseConfig;
        }
    }
}
