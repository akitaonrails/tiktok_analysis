package com.ss.android.ugc.feed.platform.performance;

import X.C01GW;
import X.C08CX;
import X.C09CT;
import X.C452501pT;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AFwS226S0000000_35;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes36.dex */
public final class FeedInfraPerfConfig {
    public static final PFPerfConfigBean LIZ = new PFPerfConfigBean(null, null, 0, null, 15, null);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(314));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(316));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(317));
    public static final C01GW LJ = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(315));
    public static final C01GW LJFF = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(318));

    public static final class PFPerfConfigBean {

        @C09CT("delay_to_loadtime")
        public final long delayToLoadTime;

        @C09CT("enable_feed_type_set")
        public final Set<Integer> enableFeedType;

        @C09CT("enable_page_type_set")
        public final Set<Integer> enablePageType;

        @C09CT("mock_execution_time")
        public final Map<String, Long> mockExcution;

        public PFPerfConfigBean() {
            this(null, null, 0L, null, 15, null);
        }

        public PFPerfConfigBean(Set<Integer> set, Set<Integer> set2, long j, Map<String, Long> map) {
            this.enableFeedType = set;
            this.enablePageType = set2;
            this.delayToLoadTime = j;
            this.mockExcution = map;
        }

        public PFPerfConfigBean(Set set, Set set2, long j, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? C08CX.INSTANCE : set, (i & 2) != 0 ? C08CX.INSTANCE : set2, (i & 4) != 0 ? 2000L : j, (i & 8) != 0 ? null : map);
        }
    }
}
