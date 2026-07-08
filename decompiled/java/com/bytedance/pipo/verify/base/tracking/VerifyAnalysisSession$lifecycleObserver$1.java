package com.bytedance.pipo.verify.base.tracking;

import X.C1707050uWV;
import X.C1713750uhJ;
import X.C1714140uhw;
import X.C1714240ui6;
import X.C356901a3;
import X.EnumC1714130uhv;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes27.dex */
public final class VerifyAnalysisSession$lifecycleObserver$1 implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public final /* synthetic */ VerifyAnalysisSession LL;

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onDestroy(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZLLL(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    public VerifyAnalysisSession$lifecycleObserver$1(VerifyAnalysisSession verifyAnalysisSession) {
        this.LL = verifyAnalysisSession;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(LifecycleOwner lifecycleOwner) {
        EnumC1714130uhv enumC1714130uhv;
        String str;
        VerifyAnalysisSession verifyAnalysisSession = this.LL;
        synchronized (verifyAnalysisSession.LJIIL) {
            try {
                if (verifyAnalysisSession.LJIILJJIL != EnumC1714130uhv.LLIZLLLIL) {
                    return;
                }
                EnumC1714130uhv enumC1714130uhv2 = verifyAnalysisSession.LJIILLIIL;
                if (enumC1714130uhv2 == null) {
                    enumC1714130uhv = EnumC1714130uhv.LLILLL;
                } else {
                    enumC1714130uhv = enumC1714130uhv2;
                }
                if (enumC1714130uhv2 == null) {
                    str = null;
                } else {
                    str = enumC1714130uhv2.LL;
                }
                verifyAnalysisSession.LIZIZ(System.currentTimeMillis());
                verifyAnalysisSession.LJIILJJIL = enumC1714130uhv;
                verifyAnalysisSession.LJIILL = System.currentTimeMillis();
                verifyAnalysisSession.LJIILLIIL = null;
                long jCurrentTimeMillis = System.currentTimeMillis() - verifyAnalysisSession.LJJIIZ;
                if (verifyAnalysisSession.LJJIIZ > 0 && jCurrentTimeMillis > verifyAnalysisSession.LJJIIJ) {
                    verifyAnalysisSession.LJJIIJ = jCurrentTimeMillis;
                    verifyAnalysisSession.LJJIIJZLJL = str;
                }
                verifyAnalysisSession.LJJIIZ = 0L;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(LifecycleOwner lifecycleOwner) {
        C1713750uhJ c1713750uhJ;
        VerifyAnalysisSession verifyAnalysisSession = this.LL;
        synchronized (verifyAnalysisSession.LJIIL) {
            try {
                EnumC1714130uhv enumC1714130uhv = verifyAnalysisSession.LJIILJJIL;
                EnumC1714130uhv enumC1714130uhv2 = EnumC1714130uhv.LLIZLLLIL;
                if (enumC1714130uhv == enumC1714130uhv2) {
                    return;
                }
                String str = enumC1714130uhv.LL;
                verifyAnalysisSession.LJIILLIIL = enumC1714130uhv;
                verifyAnalysisSession.LIZIZ(System.currentTimeMillis());
                verifyAnalysisSession.LJIILJJIL = enumC1714130uhv2;
                verifyAnalysisSession.LJIILL = System.currentTimeMillis();
                verifyAnalysisSession.LJJIII.incrementAndGet();
                verifyAnalysisSession.LJJIIZ = System.currentTimeMillis();
                WeakReference<C1713750uhJ> weakReference = verifyAnalysisSession.LJIIJJI;
                if (weakReference != null && (c1713750uhJ = weakReference.get()) != null) {
                    int i = verifyAnalysisSession.LJIIZILJ;
                    long jCurrentTimeMillis = System.currentTimeMillis() - verifyAnalysisSession.LIZJ;
                    int i2 = verifyAnalysisSession.LJ.get();
                    int i3 = verifyAnalysisSession.LJFF.get();
                    if (C1714240ui6.LIZIZ()) {
                        C1707050uWV.LIZ(new C1714140uhw(c1713750uhJ, str, i, jCurrentTimeMillis, i2, i3));
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
