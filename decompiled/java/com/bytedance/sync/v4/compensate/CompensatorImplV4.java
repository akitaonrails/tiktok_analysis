package com.bytedance.sync.v4.compensate;

import X.AbstractC1526380pp6;
import X.C1525630pnt;
import X.C1526570ppP;
import X.C1526890ppv;
import X.C1526970pq3;
import X.C1527000pq6;
import X.C1527290pqZ;
import X.C1527340pqe;
import X.C1527350pqf;
import X.C1527860prU;
import X.C1527890prX;
import X.C786410Ut5;
import X.InterfaceC1525970poR;
import X.InterfaceC1527480pqs;
import X.InterfaceC1527570pr1;
import X.InterfaceC1527580pr2;
import X.InterfaceC596980NbE;
import X.RunnableC1527370pqh;
import Y.ARunnableS123S0100000_23;
import Y.ARunnableS92S0200000_23;
import android.content.Context;
import android.os.Handler;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.sync.v4.compensate.CompensatorImplV4;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes24.dex */
public final class CompensatorImplV4 implements InterfaceC596980NbE, InterfaceC1527580pr2, GenericLifecycleObserver {
    public final Context LL;
    public final C1527000pq6 LLILLL;
    public final C1526570ppP LLILZ;
    public volatile InterfaceC1525970poR LLILZIL;
    public volatile InterfaceC1527480pqs LLILZLL;
    public boolean LLIZ;
    public final AtomicBoolean LLIZLLLIL = new AtomicBoolean(false);
    public final AtomicBoolean LLJ = new AtomicBoolean(false);
    public final RunnableC1527370pqh LLJI = new Runnable() { // from class: X.0pqh
        public final void LIZ() {
            InterfaceC1525970poR interfaceC1525970poRLIZIZ = C1526890ppv.LIZJ(this.LL.LL).LIZIZ();
            C1526890ppv c1526890ppvLIZJ = C1526890ppv.LIZJ(this.LL.LL);
            CompensatorImplV4 compensatorImplV4 = this.LL;
            synchronized (c1526890ppvLIZJ.LLILZ) {
                try {
                    ((ArrayList) c1526890ppvLIZJ.LLILZ).add(compensatorImplV4);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            this.LL.LIZ(interfaceC1525970poRLIZIZ);
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean zLIZ;
            C1C7U.LIZ("CompensatorImplV4@ca22.<field>$1");
            try {
                LIZ();
            } finally {
                if (!zLIZ) {
                }
            }
            C1C7U.LIZIZ("CompensatorImplV4@ca22.<field>$1");
        }
    };
    public final C1527290pqZ LLILLJJLI = new AbstractC1526380pp6<Handler>() { // from class: X.0pqZ
        @Override // X.AbstractC1526380pp6
        public final Handler LIZ(Object[] objArr) {
            return new BPEAHandler(((InterfaceC1525560pnm) C808470VnZ.LIZ(InterfaceC1525560pnm.class)).get());
        }
    };

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_STOP) {
            onAppBackground();
        } else if (event == Lifecycle.Event.ON_START) {
            onAppForeground();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    private void onAppBackground() {
        C1527890prX.LIZJ("[CompensatorV4] startCompensate ON_STOP");
        C786410Ut5.LJJZZIII(LIZIZ(new Object[0]), new ARunnableS123S0100000_23(this, 21));
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    private void onAppForeground() {
        C1527890prX.LIZJ("[CompensatorV4] startCompensate ON_START");
        C786410Ut5.LJJZZIII(LIZIZ(new Object[0]), new Runnable() { // from class: X.0pqi
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("CompensatorImplV4@ca22.onAppForeground$1");
                try {
                    this.LL.LLIZ = true;
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("CompensatorImplV4@ca22.onAppForeground$1");
            }
        });
    }

    public final void LIZ(InterfaceC1525970poR interfaceC1525970poR) {
        InterfaceC1527480pqs c1527860prU;
        InterfaceC1527480pqs c1527860prU2;
        if (interfaceC1525970poR == null) {
            return;
        }
        InterfaceC1525970poR interfaceC1525970poR2 = this.LLILZIL;
        InterfaceC1527480pqs interfaceC1527480pqs = this.LLILZLL;
        if (interfaceC1525970poR2 != null && interfaceC1527480pqs != null) {
            if ((this.LLILZIL.LJIIIIZZ() && !interfaceC1525970poR.LJIIIIZZ()) || (!this.LLILZIL.LJIIIIZZ() && interfaceC1525970poR.LJIIIIZZ())) {
                interfaceC1527480pqs.destroy();
                if (interfaceC1525970poR.LJIIIIZZ()) {
                    c1527860prU2 = new C1527340pqe(this, this.LLILLL, this.LLILZ);
                } else {
                    c1527860prU2 = new C1527860prU(this, this.LLILLJJLI, this.LLILLL, false, true);
                }
                c1527860prU2.LIZ(interfaceC1525970poR, this.LLIZLLLIL.get());
                this.LLILZLL = c1527860prU2;
            } else {
                interfaceC1527480pqs.LIZJ(interfaceC1525970poR, this.LLIZLLLIL.get());
            }
        } else {
            if (interfaceC1525970poR.LJIIIIZZ()) {
                c1527860prU = new C1527340pqe(this, this.LLILLL, this.LLILZ);
            } else {
                c1527860prU = new C1527860prU(this, this.LLILLJJLI, this.LLILLL, false, true);
            }
            c1527860prU.LIZ(interfaceC1525970poR, this.LLIZLLLIL.get());
            this.LLILZLL = c1527860prU;
        }
        this.LLILZIL = interfaceC1525970poR;
        this.LLJ.set(true);
    }

    @Override // X.InterfaceC596980NbE
    public final void LJ(C1525630pnt c1525630pnt) {
        C786410Ut5.LJJZZIII(LIZIZ(new Object[0]), new ARunnableS92S0200000_23(C1526890ppv.LIZJ(this.LL).LIZIZ(), this, 17));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0pqh] */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.0pqZ] */
    public CompensatorImplV4(Context context, C1526570ppP c1526570ppP, InterfaceC1527570pr1 interfaceC1527570pr1) {
        this.LL = context;
        this.LLILZ = c1526570ppP;
        this.LLILLL = new C1527000pq6(context, new C1527350pqf(this, new C1526970pq3(context, interfaceC1527570pr1, null)));
    }
}
