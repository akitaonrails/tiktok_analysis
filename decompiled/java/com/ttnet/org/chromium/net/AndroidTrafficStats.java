package com.ttnet.org.chromium.net;

import X.C786410Ut5;
import android.net.TrafficStats;
import android.os.Process;

/* JADX INFO: loaded from: classes14.dex */
public class AndroidTrafficStats {
    public static long getCurrentUidRxBytes() {
        long uidRxBytes = TrafficStats.getUidRxBytes(Process.myUid());
        if (uidRxBytes == -1) {
            return 0L;
        }
        return uidRxBytes;
    }

    public static long getCurrentUidTxBytes() {
        long uidTxBytes = TrafficStats.getUidTxBytes(Process.myUid());
        if (uidTxBytes == -1) {
            return 0L;
        }
        return uidTxBytes;
    }

    public static long getTotalRxBytes() {
        long jA4 = C786410Ut5.a4();
        if (jA4 == -1) {
            return 0L;
        }
        return jA4;
    }

    public static long getTotalTxBytes() {
        long totalTxBytes = TrafficStats.getTotalTxBytes();
        if (totalTxBytes == -1) {
            return 0L;
        }
        return totalTxBytes;
    }
}
