package com.bytedance.pumbaa.utility.utils;

import X.C0C64;
import X.C0WSW;
import X.C0WSX;
import X.C13LP;
import X.C1C7U;
import X.C2188811AlT;
import X.C786410Ut5;
import Y.ARunnableS18S1100000_13;
import android.os.SystemClock;
import com.bytedance.pumbaa.utility.worker.PumbaaWorkerThread;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AwS557S0100000_13;

/* JADX INFO: loaded from: classes14.dex */
public final class CostTimeline {
    public final CopyOnWriteArrayList<CostTimeLog> costTimeLogs;
    public final long init;
    public final long start;

    public static /* synthetic */ void lambda$semisugar$printLog$lambda$0$0(String str, CostTimeline costTimeline) {
        C1C7U.LIZ("CostTimeline@b858.com_bytedance_pumbaa_utility_utils_CostTimeline__printLog$___twin___$1L");
        printLog$lambda$0(str, costTimeline);
        C1C7U.LIZIZ("CostTimeline@b858.com_bytedance_pumbaa_utility_utils_CostTimeline__printLog$___twin___$1L");
    }

    public final void printLog(String str) {
        com_bytedance_pumbaa_utility_utils_CostTimeline_com_ss_android_ugc_aweme_lancet_CpuUsageLancet_printLog(this, str);
    }

    public CostTimeline() {
        this(SystemClock.elapsedRealtimeNanos());
    }

    public final CopyOnWriteArrayList<CostTimeLog> getCostTimeLogs() {
        return this.costTimeLogs;
    }

    public final long getInit() {
        return this.init;
    }

    public final long getStart() {
        return this.start;
    }

    public CostTimeline(long j) {
        this.init = j;
        this.start = System.currentTimeMillis();
        this.costTimeLogs = new CopyOnWriteArrayList<>();
    }

    public final void com_bytedance_pumbaa_utility_utils_CostTimeline__printLog$___twin___(String str) {
        C786410Ut5.LJJZZIII(PumbaaWorkerThread.getHandler(), new ARunnableS18S1100000_13(this, str, 16));
    }

    public static void com_bytedance_pumbaa_utility_utils_CostTimeline_com_ss_android_ugc_aweme_lancet_CpuUsageLancet_printLog(CostTimeline costTimeline, String str) {
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "cpu_usage_print_log_exp", true) <= 0) {
            costTimeline.com_bytedance_pumbaa_utility_utils_CostTimeline__printLog$___twin___(str);
        }
    }

    public static final void printLog$lambda$0(String str, CostTimeline costTimeline) {
        CopyOnWriteArrayList<C0WSX> copyOnWriteArrayList = C0WSW.LIZ;
        C0WSW.LIZ(str, new AwS557S0100000_13(costTimeline, 24), 2, null);
    }

    public final void logTotal(String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("(total)");
        this.costTimeLogs.add(new CostTimeLog(C2188811AlT.LIZIZ(sbLIZ), Long.valueOf(this.init), SystemClock.elapsedRealtimeNanos(), str2));
    }

    public final void logCostTime(String str, Long l, long j, String str2) {
        long jLongValue;
        CostTimeLog costTimeLog = (CostTimeLog) C13LP.LJJLIIIJL(this.costTimeLogs);
        if (l != null) {
            jLongValue = l.longValue();
        } else if (costTimeLog != null) {
            jLongValue = costTimeLog.end;
        } else {
            jLongValue = this.init;
        }
        this.costTimeLogs.add(new CostTimeLog(str, Long.valueOf(jLongValue), j, str2));
    }
}
