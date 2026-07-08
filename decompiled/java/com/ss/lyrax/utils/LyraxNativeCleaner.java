package com.ss.lyrax.utils;

import X.C1C7U;
import X.C2179971ATj;
import X.C2188811AlT;
import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.Cleaner;
import java.lang.ref.Reference;

/* JADX INFO: loaded from: classes20.dex */
public class LyraxNativeCleaner {
    public static Cleaner CLEANER;

    public static class CleanerThunk implements Runnable {
        public final long freeFunction;
        public long nativeObjectPtr;

        @Override // java.lang.Runnable
        public void run() {
            C1C7U.LIZ("LyraxNativeCleaner$CleanerThunk@debf.run");
            com_ss_lyrax_utils_LyraxNativeCleaner$CleanerThunk_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            C1C7U.LIZIZ("LyraxNativeCleaner$CleanerThunk@debf.run");
        }

        public void com_ss_lyrax_utils_LyraxNativeCleaner$CleanerThunk__run$___twin___() {
            long j = this.nativeObjectPtr;
            if (j != 0) {
                LyraxNativeCleaner.nativeApplyFreeFunction(this.freeFunction, j);
            }
        }

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(super.toString());
            sbLIZ.append("(freeFunction = 0x");
            sbLIZ.append(Long.toHexString(this.freeFunction));
            sbLIZ.append(", nativeObjectPtr = 0x");
            sbLIZ.append(Long.toHexString(this.nativeObjectPtr));
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public static void com_ss_lyrax_utils_LyraxNativeCleaner$CleanerThunk_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(CleanerThunk cleanerThunk) {
            try {
                cleanerThunk.com_ss_lyrax_utils_LyraxNativeCleaner$CleanerThunk__run$___twin___();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                if (!C2179971ATj.LIZ(th)) {
                    throw th;
                }
            }
        }

        public CleanerThunk(long j, long j2) {
            this.nativeObjectPtr = j2;
            this.freeFunction = j;
        }
    }

    public static native void nativeApplyFreeFunction(long j, long j2);

    public static synchronized void register(Object obj, long j, long j2) {
        if (obj != null) {
            if (Build.VERSION.SDK_INT < 33) {
                return;
            }
            if (CLEANER == null) {
                CLEANER = Cleaner.create();
            }
            try {
                CLEANER.register(obj, new CleanerThunk(j2, j));
                Reference.reachabilityFence(obj);
                return;
            } catch (VirtualMachineError e) {
                TryCatchGuardChecker.doCheck(e);
                nativeApplyFreeFunction(j2, j);
                throw e;
            }
        }
        throw new IllegalArgumentException("referent is null");
    }
}
