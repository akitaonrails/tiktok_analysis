package com.ss.android.ugc.aweme.sticker.senor.presenter;

import X.AbstractC2218781Bsi;
import X.C1300690jx5;
import X.C1DI4;
import X.C201955140j;
import X.C786410Ut5;
import X.C823920WTu;
import X.C838130WuJ;
import X.InterfaceC1623040sL0;
import Y.ARunnableS81S0200000_12;
import android.content.Context;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseIntArray;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes35.dex */
public abstract class BaseSenorPresenter implements InterfaceC1623040sL0, GenericLifecycleObserver {
    public final Context LL;
    public final Handler LLILLJJLI;
    public boolean LLILLL;
    public final SensorManager LLILZ;
    public final SparseIntArray LLILZIL = new SparseIntArray();
    public final List<AbstractC2218781Bsi> LLILZLL = new CopyOnWriteArrayList();

    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            unRegister();
        }
    }

    @Override // X.InterfaceC1623040sL0
    public void register() {
        this.LLILLL = true;
    }

    @Override // X.InterfaceC1623040sL0
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void unRegister() {
        this.LLILLL = false;
        Iterator it2 = ((CopyOnWriteArrayList) this.LLILZLL).iterator();
        while (it2.hasNext()) {
            try {
                C1300690jx5.LJ(this.LLILZ, (AbstractC2218781Bsi) it2.next(), C1DI4.LJIIIIZZ);
            } catch (C838130WuJ e) {
                TryCatchGuardChecker.doCheck(e);
                C201955140j.LJIIJ(C823920WTu.LIZIZ, "sandbox", e);
            }
        }
    }

    @Override // X.InterfaceC1623040sL0
    public final boolean co1() {
        return this.LLILLL;
    }

    public final void LIZ(AbstractC2218781Bsi abstractC2218781Bsi) {
        ((CopyOnWriteArrayList) this.LLILZLL).add(abstractC2218781Bsi);
    }

    @Override // X.InterfaceC1623040sL0
    public final void oY0(boolean z) {
        Iterator it2 = ((CopyOnWriteArrayList) this.LLILZLL).iterator();
        while (it2.hasNext()) {
            ((AbstractC2218781Bsi) it2.next()).LL = z;
        }
    }

    public BaseSenorPresenter(Context context, LifecycleOwner lifecycleOwner, Handler handler) {
        this.LL = context;
        this.LLILLJJLI = handler;
        this.LLILZ = (SensorManager) C786410Ut5.H2(context, "sensor");
        C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS81S0200000_12(this, lifecycleOwner, 62));
    }
}
