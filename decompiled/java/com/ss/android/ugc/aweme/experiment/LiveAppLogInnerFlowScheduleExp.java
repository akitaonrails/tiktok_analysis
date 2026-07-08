package com.ss.android.ugc.aweme.experiment;

import X.C01GW;
import X.C09CT;
import X.C13BV;
import X.C452501pT;
import java.util.List;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes29.dex */
public final class LiveAppLogInnerFlowScheduleExp {
    public static final LiveAppLogFlowScheduleConfig LIZ = new LiveAppLogFlowScheduleConfig(false, null, 3, null);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(158));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(157));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(156));

    public static final class LiveAppLogFlowScheduleConfig {

        @C09CT("enable")
        public final boolean enable;

        @C09CT("schedule_black_list")
        public final List<String> scheduleBlackList;

        public LiveAppLogFlowScheduleConfig() {
            this(false, null, 3, null);
        }

        public LiveAppLogFlowScheduleConfig(boolean z, List<String> list) {
            this.enable = z;
            this.scheduleBlackList = list;
        }

        public LiveAppLogFlowScheduleConfig(boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? C13BV.INSTANCE : list);
        }
    }
}
