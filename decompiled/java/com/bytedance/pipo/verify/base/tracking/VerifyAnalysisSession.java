package com.bytedance.pipo.verify.base.tracking;

import X.C098200Yq;
import X.C1707070uWX;
import X.C1713750uhJ;
import X.C1714120uhu;
import X.C1714240ui6;
import X.C189200o6;
import X.EnumC1714130uhv;
import X.InterfaceC1707080uWY;
import android.os.Looper;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class VerifyAnalysisSession implements InterfaceC1707080uWY {
    public final String LIZ;
    public volatile String LJIIIIZZ;
    public volatile String LJIIIZ;
    public volatile String LJIIJ;
    public volatile WeakReference<C1713750uhJ> LJIIJJI;
    public long LJIILL;
    public EnumC1714130uhv LJIILLIIL;
    public volatile int LJIIZILJ;
    public volatile long LJIJ;
    public volatile String LJIJI;
    public volatile long LJIJJ;
    public volatile long LJIJJLI;
    public volatile String LJJ;
    public volatile long LJJI;
    public volatile long LJJIFFI;
    public volatile long LJJIIJ;
    public volatile String LJJIIJZLJL;
    public volatile long LJJIIZ;
    public final C1714120uhu LIZIZ = new C1714120uhu();
    public final long LIZJ = System.currentTimeMillis();
    public final BPEAHandler LIZLLL = new BPEAHandler(Looper.getMainLooper());
    public final AtomicInteger LJ = new AtomicInteger(0);
    public final AtomicInteger LJFF = new AtomicInteger(0);
    public final List<String> LJI = Collections.synchronizedList(new ArrayList());
    public final ConcurrentHashMap<String, Pair<String, String>> LJII = new ConcurrentHashMap<>();
    public final Object LJIIL = new Object();
    public final Map<EnumC1714130uhv, Long> LJIILIIL = new LinkedHashMap();
    public EnumC1714130uhv LJIILJJIL = EnumC1714130uhv.LLILLJJLI;
    public final AtomicInteger LJIL = new AtomicInteger(0);
    public final AtomicBoolean LJJII = new AtomicBoolean(false);
    public final AtomicInteger LJJIII = new AtomicInteger(0);
    public final VerifyAnalysisSession$lifecycleObserver$1 LJJIIZI = new VerifyAnalysisSession$lifecycleObserver$1(this);
    public final AtomicBoolean LJJIJ = new AtomicBoolean(false);

    public final void LJFF() {
        synchronized (this.LJIIL) {
            try {
                if (this.LJIILJJIL != EnumC1714130uhv.LLIZ) {
                    return;
                }
                this.LJJI = System.currentTimeMillis();
                LIZLLL(this, EnumC1714130uhv.LLILLL);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LIZJ() {
        if (C1714240ui6.LIZIZ() && this.LJJIJ.compareAndSet(false, true)) {
            try {
                ProcessLifecycleOwner.Companion.get().getLifecycle().addObserver(this.LJJIIZI);
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
    }

    public VerifyAnalysisSession(String str) {
        this.LIZ = str;
    }

    @Override // X.InterfaceC1707080uWY
    public final void LIZ(String str) {
        if (!Intrinsics.LJFF(str, this.LIZ)) {
            return;
        }
        if (this.LJJII.compareAndSet(true, false)) {
            C1707070uWX.LIZ.remove(this);
        }
        LJFF();
    }

    public final void LIZIZ(long j) {
        long jLongValue;
        long j2 = this.LJIILL;
        if (1 <= j2 && j2 < j) {
            Map<EnumC1714130uhv, Long> map = this.LJIILIIL;
            EnumC1714130uhv enumC1714130uhv = this.LJIILJJIL;
            Long l = (Long) ((LinkedHashMap) map).get(enumC1714130uhv);
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            map.put(enumC1714130uhv, Long.valueOf(jLongValue + (j - this.LJIILL)));
        }
    }

    public final void LJI(String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (this.LJIJI == null) {
            this.LJIJI = str;
            this.LJIJJ = jCurrentTimeMillis;
        }
        this.LJIJJLI = jCurrentTimeMillis;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0035 A[Catch: all -> 0x01c9, TryCatch #1 {all -> 0x01c9, blocks: (B:4:0x0005, B:6:0x000f, B:8:0x0013, B:15:0x0023, B:25:0x0039, B:27:0x004b, B:28:0x004f, B:29:0x0059, B:24:0x0035), top: B:97:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map<java.lang.String, java.lang.String> LJII(long r19) {
        /*
            Method dump skipped, instruction units count: 463
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.pipo.verify.base.tracking.VerifyAnalysisSession.LJII(long):java.util.Map");
    }

    public static void LIZLLL(VerifyAnalysisSession verifyAnalysisSession, EnumC1714130uhv enumC1714130uhv) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (verifyAnalysisSession.LJIIL) {
            try {
                if (verifyAnalysisSession.LJIILJJIL == enumC1714130uhv) {
                    return;
                }
                verifyAnalysisSession.LIZIZ(jCurrentTimeMillis);
                verifyAnalysisSession.LJIILJJIL = enumC1714130uhv;
                verifyAnalysisSession.LJIILL = jCurrentTimeMillis;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJ(C1713750uhJ c1713750uhJ, String str) {
        String str2 = this.LJIIJ;
        String str3 = this.LJIIIZ;
        if (str2 != null && str3 != null) {
            this.LJII.put(str, new Pair<>(str2, str3));
            this.LJIIIZ = null;
        }
        this.LJI.add(str);
        this.LJIIJ = str;
        if (c1713750uhJ != null) {
            this.LJIIJJI = new WeakReference<>(c1713750uhJ);
        }
        synchronized (this.LJIIL) {
            try {
                ((LinkedHashMap) this.LJIILIIL).clear();
                this.LJIILJJIL = EnumC1714130uhv.LLILLJJLI;
                this.LJIILL = System.currentTimeMillis();
                this.LJIILLIIL = null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
