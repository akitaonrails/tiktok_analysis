package com.bytedance.android.livesdk.livesetting.performance;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS217S0000000_28;

/* JADX INFO: loaded from: classes29.dex */
public final class LiveDiskCleanWithCepExperiment {
    public static final LiveDiskCleanRule LIZ = new LiveDiskCleanRule(false, null, null);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(47));

    public static final class LiveDiskCleanRule {

        @C09CT("enable")
        public final boolean enable;

        @C09CT("immediate_rules")
        public final Map<String, List<String>> immediateRules;

        @C09CT("long_rules")
        public final Map<String, List<String>> longRules;

        public LiveDiskCleanRule() {
            this(false, null, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public LiveDiskCleanRule(boolean z, Map<String, ? extends List<String>> map, Map<String, ? extends List<String>> map2) {
            this.enable = z;
            this.longRules = map;
            this.immediateRules = map2;
        }
    }
}
