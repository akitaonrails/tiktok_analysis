package com.ss.android.ugc.aweme.inbox.land;

import X.C01GW;
import X.C09CT;
import X.C1EC4;
import X.C1EC5;
import X.C1EC6;
import X.C1EC7;
import X.C1EC8;
import X.C1EC9;
import X.C452501pT;

/* JADX INFO: loaded from: classes36.dex */
public final class LandInboxExperiment {
    public static final Meta LIZ = new Meta(false, 0, 0, 0, 0);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C1EC9());
    public static final C01GW LIZJ = C452501pT.LIZIZ(new C1EC8());
    public static final C01GW LIZLLL = C452501pT.LIZIZ(new C1EC4());
    public static final C01GW LJ = C452501pT.LIZIZ(new C1EC7());
    public static final C01GW LJFF = C452501pT.LIZIZ(new C1EC6());
    public static final C01GW LJI = C452501pT.LIZIZ(new C1EC5());

    public static int LIZ() {
        return ((Number) LIZJ.getValue()).intValue();
    }

    public static final class Meta {

        @C09CT("inbox_search_modifier")
        public final int inboxSearchModifier;

        @C09CT("enable")
        public final boolean isEnable;

        @C09CT("land_count_factor")
        public final int landCountFactor;

        @C09CT("msg_time_factor")
        public final int msgTimeFactor;

        @C09CT("strategy_type")
        public final int strategyType;

        public Meta() {
            this(false, 0, 0, 0, 0);
        }

        public Meta(boolean z, int i, int i2, int i3, int i4) {
            this.isEnable = z;
            this.strategyType = i;
            this.msgTimeFactor = i2;
            this.landCountFactor = i3;
            this.inboxSearchModifier = i4;
        }
    }
}
