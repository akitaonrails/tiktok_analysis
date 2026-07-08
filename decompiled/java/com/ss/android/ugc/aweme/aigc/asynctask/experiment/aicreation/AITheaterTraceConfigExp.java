package com.ss.android.ugc.aweme.aigc.asynctask.experiment.aicreation;

import X.C01GW;
import X.C09CT;
import X.C2188811AlT;
import X.C452501pT;
import X.C786410Ut5;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class AITheaterTraceConfigExp {
    public static final AITheaterTraceConfig LIZ = new AITheaterTraceConfig(false, 2, true, 100, new ArrayList(), new ArrayList());
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(49));

    public static final class AITheaterTraceConfig {

        @C09CT("allow_level")
        public final int allowLevel;

        @C09CT("business_block_list")
        public final List<String> businessBlockList;

        @C09CT("enable_log_collection")
        public final boolean enableLogCollection;

        @C09CT("event_block_list")
        public final List<String> eventBlockList;

        @C09CT("max_quota")
        public final int maxQuota;

        @C09CT("trace_enable")
        public final boolean traceEnable;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AITheaterTraceConfig)) {
                return false;
            }
            AITheaterTraceConfig aITheaterTraceConfig = (AITheaterTraceConfig) obj;
            return this.enableLogCollection == aITheaterTraceConfig.enableLogCollection && this.allowLevel == aITheaterTraceConfig.allowLevel && this.traceEnable == aITheaterTraceConfig.traceEnable && this.maxQuota == aITheaterTraceConfig.maxQuota && Intrinsics.LJFF(this.eventBlockList, aITheaterTraceConfig.eventBlockList) && Intrinsics.LJFF(this.businessBlockList, aITheaterTraceConfig.businessBlockList);
        }

        public final int hashCode() {
            return (((((((((C786410Ut5.Z2(this.enableLogCollection) * 31) + this.allowLevel) * 31) + C786410Ut5.Z2(this.traceEnable)) * 31) + this.maxQuota) * 31) + this.eventBlockList.hashCode()) * 31) + this.businessBlockList.hashCode();
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("AITheaterTraceConfig(enableLogCollection=");
            sbLIZ.append(this.enableLogCollection);
            sbLIZ.append(", allowLevel=");
            sbLIZ.append(this.allowLevel);
            sbLIZ.append(", traceEnable=");
            sbLIZ.append(this.traceEnable);
            sbLIZ.append(", maxQuota=");
            sbLIZ.append(this.maxQuota);
            sbLIZ.append(", eventBlockList=");
            sbLIZ.append(this.eventBlockList);
            sbLIZ.append(", businessBlockList=");
            sbLIZ.append(this.businessBlockList);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public AITheaterTraceConfig() {
            this(false, 2, true, 100, new ArrayList(), new ArrayList());
        }

        public AITheaterTraceConfig(boolean z, int i, boolean z2, int i2, List<String> list, List<String> list2) {
            this.enableLogCollection = z;
            this.allowLevel = i;
            this.traceEnable = z2;
            this.maxQuota = i2;
            this.eventBlockList = list;
            this.businessBlockList = list2;
        }
    }
}
