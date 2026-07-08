package com.ss.android.ugc.aweme.base.component;

import X.C15O7;
import X.C20684815ws;
import X.InterfaceC744170THb;
import X.InterfaceC744180THc;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.ss.android.ugc.aweme.analysis.Analysis;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes13.dex */
public class AnalysisStayTimeFragmentComponent implements GenericLifecycleObserver {
    public final WeakReference<InterfaceC744180THc> LLILLJJLI;
    public InterfaceC744170THb LLILZ;
    public long LL = -1;
    public boolean LLILLL = true;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_RESUME) {
            onResume();
        } else if (event == Lifecycle.Event.ON_PAUSE) {
            onPause();
        }
    }

    public final Analysis LIZ() {
        InterfaceC744180THc interfaceC744180THc;
        WeakReference<InterfaceC744180THc> weakReference = this.LLILLJJLI;
        if (weakReference == null || (interfaceC744180THc = weakReference.get()) == null) {
            return null;
        }
        return interfaceC744180THc.getAnalysis();
    }

    public final void LIZJ() {
        if (this.LL != -1) {
            final long jCurrentTimeMillis = System.currentTimeMillis() - this.LL;
            if (jCurrentTimeMillis > 100 && LIZ() != null && !TextUtils.isEmpty(LIZ().getLabelName())) {
                C15O7.LIZIZ(new Callable<Object>() { // from class: X.0THa
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        C1C7U.LIZ("AnalysisStayTimeFragmentComponent@68cd.stopCalTime$1");
                        C1386470mBR c1386470mBR = new C1386470mBR();
                        c1386470mBR.LJJLIIIJ = String.valueOf(jCurrentTimeMillis);
                        c1386470mBR.LJJIJL(this.LLILLJJLI.LIZ().getLabelName());
                        InterfaceC744170THb interfaceC744170THb = this.LLILLJJLI.LLILZ;
                        if (interfaceC744170THb != null) {
                            interfaceC744170THb.LIZ(c1386470mBR);
                        }
                        c1386470mBR.LJIILJJIL();
                        C1C7U.LIZIZ("AnalysisStayTimeFragmentComponent@68cd.stopCalTime$1");
                        return null;
                    }
                }, C20684815ws.LJFF(), null);
            }
            this.LL = -1L;
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPause() {
        if (this.LLILLL) {
            LIZJ();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume() {
        if (this.LLILLL) {
            this.LL = System.currentTimeMillis();
        }
    }

    public AnalysisStayTimeFragmentComponent(Fragment fragment) {
        if (fragment instanceof InterfaceC744180THc) {
            this.LLILLJJLI = new WeakReference<>(fragment);
        }
        fragment.getLifecycle().addObserver(this);
    }

    public final void LIZIZ(boolean z) {
        this.LLILLL = z;
        if (z) {
            this.LL = System.currentTimeMillis();
        } else {
            LIZJ();
        }
    }
}
