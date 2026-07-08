package com.bytedance.ies.ugc.aweme.commercialize.splash.setting;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class TopViewGeckoExperiment {
    public static final /* synthetic */ int LIZ = 0;

    public static final class GeckoOptimizeSetting {

        @C09CT("did_optimize")
        public final boolean didOptimize;

        @C09CT("expire_time_for_long_time_channel")
        public final Long longTimeBuffer;

        @C09CT("long_time_channel")
        public final List<String> longTimeChannel;

        @C09CT("normal_buffer")
        public final long normalBuffer;

        public GeckoOptimizeSetting(boolean z, long j, List<String> list, Long l) {
            this.didOptimize = z;
            this.normalBuffer = j;
            this.longTimeChannel = list;
            this.longTimeBuffer = l;
        }
    }
}
