package com.ss.android.ugc.aweme.feed.adapter.widget.degrade.exps;

import X.C01GW;
import X.C09CT;
import X.C269050AgZ;
import X.C292401Bi;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AFwS199S0000000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class LiveCardDegradeConfigStore {
    public static final LivePreviewCardDegradeConfig LIZ = new LivePreviewCardDegradeConfig(new LinkedHashMap(), Mp4ScreenVideoLoadTimeout.CONTROL, Mp4ScreenVideoLoadTimeout.CONTROL, 15000);
    public static final C01GW LIZIZ = C292401Bi.LIZ(AFwS199S0000000_12.get$arr$(191));

    public static final class LivePreviewCardDegradeConfig {

        @C09CT("degradeItemConfigs")
        public final Map<String, LivePreviewCardDegradeConfigItem> degradeItemConfigs;

        @C09CT("perfEvaluateIntervalMs")
        public final long perfEvaluateIntervalMs;

        @C09CT("perfEvaluateMinIntervalMs")
        public final long perfEvaluateMinIntervalMs;

        @C09CT("scoreCacheValidIntervalMs")
        public final long scoreCacheValidInterval;

        public LivePreviewCardDegradeConfig() {
            this(new LinkedHashMap(), Mp4ScreenVideoLoadTimeout.CONTROL, Mp4ScreenVideoLoadTimeout.CONTROL, 15000L);
        }

        public LivePreviewCardDegradeConfig(Map<String, LivePreviewCardDegradeConfigItem> map, long j, long j2, long j3) {
            this.degradeItemConfigs = map;
            this.scoreCacheValidInterval = j;
            this.perfEvaluateMinIntervalMs = j2;
            this.perfEvaluateIntervalMs = j3;
        }
    }

    public static boolean LIZ() {
        return ((Boolean) C269050AgZ.LIZ.getValue()).booleanValue() || (((LivePreviewCardDegradeConfig) LIZIZ.getValue()).degradeItemConfigs.isEmpty() ^ true);
    }

    public static final class LivePreviewCardDegradeConfigItem {

        @C09CT("degradeOnlyOnceOnLifecycle")
        public final Boolean degradeOnlyOnceOnLifecycle;

        @C09CT("degradeType")
        public final int degradeType;

        @C09CT("threshold")
        public final Float threshold;

        public LivePreviewCardDegradeConfigItem(Float f, Boolean bool, int i) {
            this.threshold = f;
            this.degradeOnlyOnceOnLifecycle = bool;
            this.degradeType = i;
        }
    }
}
