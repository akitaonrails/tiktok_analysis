package com.bytedance.applog.util;

import X.C2209791BeD;
import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes33.dex */
public class BlockHelper {
    public static long LIZ = 100;
    public static volatile boolean LIZIZ = false;
    public static volatile long LIZJ = -1;
    public static volatile boolean enableBlock = true;

    public static void beginBlock() {
        LIZIZ = true;
        LIZJ = SystemClock.elapsedRealtime();
    }

    public static void endBlock() {
        LIZIZ = false;
        LIZJ = -1L;
    }

    public static void tryBlock() {
        if (enableBlock) {
            while (LIZIZ) {
                if (LIZIZ) {
                    try {
                        if (Math.abs(SystemClock.elapsedRealtime() - LIZJ) < 10000) {
                            Thread.sleep(LIZ);
                        } else {
                            endBlock();
                        }
                    } catch (InterruptedException e) {
                        TryCatchGuardChecker.doCheck(e);
                        C2209791BeD.LJIJJ().LJIILL("BlockHelper: block interrupted!", e, new Object[0]);
                    }
                }
            }
        }
    }

    public static long getBlockInterval() {
        return LIZ;
    }

    public static void setBlockInterval(long j) {
        LIZ = Math.max(j, 1L);
    }

    public static void setEnableBlock(boolean z) {
        enableBlock = z;
    }
}
