package com.ss.android.ugc.aweme.notice.api.ab;

import X.C01GW;
import X.C09CT;
import X.C2188811AlT;
import X.C313060COy;
import X.C452501pT;

/* JADX INFO: loaded from: classes5.dex */
public final class InboxNoticeCountStrategyExperiment {
    public static final MetaData LIZ = new MetaData(0, 8000);
    public static final C01GW LIZIZ;
    public static final long LIZJ;

    static {
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new C313060COy());
        LIZIZ = c01gwLIZIZ;
        LIZJ = ((MetaData) c01gwLIZIZ.getValue()).delayMilliSeconds;
    }

    public static final class MetaData {

        @C09CT("delay_milli_seconds")
        public final long delayMilliSeconds;

        @C09CT("strategy")
        public final int strategy;

        public MetaData() {
            this(0, 8000L);
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("MetaData(strategy=");
            sbLIZ.append(this.strategy);
            sbLIZ.append(", delayMilliSeconds=");
            sbLIZ.append(this.delayMilliSeconds);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public MetaData(int i, long j) {
            this.strategy = i;
            this.delayMilliSeconds = j;
        }
    }
}
