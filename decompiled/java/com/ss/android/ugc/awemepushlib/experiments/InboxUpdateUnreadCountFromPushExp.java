package com.ss.android.ugc.awemepushlib.experiments;

import X.C01GW;
import X.C09CT;
import X.C13BV;
import X.C452501pT;
import java.util.List;
import kotlin.jvm.internal.AFwS200S0000000_13;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes14.dex */
public final class InboxUpdateUnreadCountFromPushExp {
    public static final Config LIZ = new Config(false, null, 0, 7, null);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(183));
    public static long LIZJ;

    public static final class Config {

        @C09CT("enable")
        public final boolean enable;

        @C09CT("push_labels")
        public final List<String> pushLabels;

        @C09CT("time_interval_s")
        public final long timeIntervalS;

        public Config() {
            this(false, null, 0L, 7, null);
        }

        public Config(boolean z, List<String> list, long j) {
            this.enable = z;
            this.pushLabels = list;
            this.timeIntervalS = j;
        }

        public Config(boolean z, List list, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? C13BV.INSTANCE : list, (i & 4) != 0 ? 0L : j);
        }
    }
}
