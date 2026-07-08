package com.bytedance.touchpoint.data.monitor;

import X.C01GW;
import X.C093Y;
import X.C09CT;
import X.C2178708gD;
import X.C452501pT;
import java.util.HashSet;

/* JADX INFO: loaded from: classes4.dex */
public final class TouchPointActionRecordUtils {
    public static final HashSet<Integer> LIZ = C093Y.LIZJ(1);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C2178708gD());

    public static final class TouchPointActionRecord {

        @C09CT("action_type")
        public final int actionType;

        @C09CT("end_time")
        public final long endTime;

        @C09CT("timestamp")
        public final long now;

        @C09CT("launch_plan_id")
        public final int planId;

        @C09CT("touch_point_id")
        public final int touchPointId;

        public TouchPointActionRecord(int i, int i2, int i3, long j, long j2) {
            this.touchPointId = i;
            this.planId = i2;
            this.actionType = i3;
            this.now = j;
            this.endTime = j2;
        }
    }
}
