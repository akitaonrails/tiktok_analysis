package com.bytedance.apm.profiler;

import X.C2073508Aj;
import Y.ARunnableS103S0100000_3;
import Y.ARunnableS83S0000000_3;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.librarian.Librarian;
import com.bytedance.shadowhook.ShadowHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public class Profiler {
    public static volatile boolean enabled;
    public static volatile boolean inited;
    public static final AtomicReference<Boolean> sIsCompatible = new AtomicReference<>(null);
    public static volatile boolean bench = false;

    public static native boolean nAttachThread(int i);

    public static native boolean nCheck();

    public static native void nClear();

    public static native boolean nDetachThread(int i);

    public static native String nDump(long j, long j2);

    public static native String nGetStack(int i);

    public static native boolean nInit();

    public static native void nSetAlog(long j);

    public static native boolean nStart(int i);

    public static native boolean nStop();

    public synchronized void benchMark() {
        if (!bench) {
            init();
            start(20);
            attachThread(Process.myPid());
            new BPEAThread(new ARunnableS103S0100000_3(this, 18), "xp_get_stack").start();
            new BPEAThread(new ARunnableS103S0100000_3(this, 19), "xp_dump").start();
            new BPEAThread(new ARunnableS83S0000000_3(2), "xp_fake_loop").start();
            bench = true;
        }
    }

    public synchronized void clear() {
        if (inited && isCompatible()) {
            nClear();
        }
    }

    public synchronized void init() {
        if (!inited && isCompactVersion()) {
            try {
                ShadowHook.init();
                INVOKESTATIC_com_bytedance_apm_profiler_Profiler_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("profiler");
                inited = nInit();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                inited = false;
            }
        }
    }

    public synchronized void stop() {
        if (inited && isCompatible() && enabled && nStop()) {
            enabled = false;
        }
    }

    public static boolean isCompactVersion() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public boolean isCompatible() {
        AtomicReference<Boolean> atomicReference = sIsCompatible;
        Boolean bool = atomicReference.get();
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z = isCompactVersion() && nCheck();
        Boolean boolValueOf = Boolean.valueOf(z);
        while (!atomicReference.compareAndSet(null, boolValueOf)) {
            if (atomicReference.get() != null) {
                return sIsCompatible.get().booleanValue();
            }
        }
        return z;
    }

    public Profiler() {
    }

    public static Profiler getInstance() {
        return C2073508Aj.LIZ;
    }

    public /* synthetic */ Profiler(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        this();
    }

    public static void INVOKESTATIC_com_bytedance_apm_profiler_Profiler_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(String str) {
        LoadSoLancet.LIZJ(str);
        long jUptimeMillis = SystemClock.uptimeMillis();
        Librarian.LJFF(str);
        LoadSoLancet.LJ(jUptimeMillis, str);
        LoadSoLancet.LIZLLL(jUptimeMillis, str);
        LoadSoLancet.LIZIZ(str);
    }

    public void attachThread(int i) {
        if (inited && isCompatible()) {
            nAttachThread(i);
        }
    }

    public void detachThread(int i) {
        if (inited && isCompatible()) {
            nDetachThread(i);
        }
    }

    public synchronized String getStackTrace(int i) {
        if (inited && isCompatible()) {
            return nGetStack(i);
        }
        return "not compact";
    }

    public void setAlog(long j) {
        if (!inited) {
            return;
        }
        nSetAlog(j);
    }

    public synchronized void start(int i) {
        if (inited && isCompatible() && !enabled && nStart(i)) {
            enabled = true;
        }
    }

    public String dumpStack(long j, long j2) {
        if (inited && isCompatible()) {
            return nDump(j, j2);
        }
        return "not enabled";
    }
}
