package com.ss.android.ugc.aweme.adaptation.analysis;

import X.C15O7;
import X.C20684815ws;
import X.C2077808Ca;
import X.InterfaceC2077908Cb;
import android.text.TextUtils;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.adaptation.analysis.Analysis;
import com.ss.android.ugc.aweme.adaptation.analysis.AnalysisActivityComponent;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public class AnalysisActivityComponent implements GenericLifecycleObserver {
    public long LL;
    public final WeakReference<InterfaceC2077908Cb> LLILLJJLI;
    public final LifecycleOwner LLILLL;

    public final Analysis LIZ() {
        InterfaceC2077908Cb interfaceC2077908Cb;
        WeakReference<InterfaceC2077908Cb> weakReference = this.LLILLJJLI;
        if (weakReference == null || (interfaceC2077908Cb = weakReference.get()) == null) {
            return null;
        }
        return interfaceC2077908Cb.getAnalysis();
    }

    public AnalysisActivityComponent(LifecycleOwner lifecycleOwner, InterfaceC2077908Cb interfaceC2077908Cb) {
        this.LLILLL = lifecycleOwner;
        this.LLILLJJLI = new WeakReference<>(interfaceC2077908Cb);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (lifecycleOwner != this.LLILLL) {
            return;
        }
        int i = C2077808Ca.LIZ[event.ordinal()];
        if (i != 1) {
            if (i == 2 && this.LL != -1) {
                final long jCurrentTimeMillis = System.currentTimeMillis() - this.LL;
                if (LIZ() != null && jCurrentTimeMillis > LIZ().getMinValidStayDuration()) {
                    C15O7.LIZIZ(new Callable() { // from class: X.08t6
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            AnalysisActivityComponent analysisActivityComponent = this.LL;
                            long j = jCurrentTimeMillis;
                            analysisActivityComponent.getClass();
                            C1C7U.LIZ("AnalysisActivityComponent@2547.onPause$1L");
                            Analysis analysisLIZ = analysisActivityComponent.LIZ();
                            if (analysisLIZ != null && !TextUtils.isEmpty(analysisLIZ.getLabelName())) {
                                C0LAB c0lab = new C0LAB();
                                c0lab.LJ("enter_from", analysisLIZ.getLabelName());
                                c0lab.LJ("creation_id", analysisLIZ.getCreationId());
                                c0lab.LJ("from_group_id", C1443560nfW.LJIIIIZZ());
                                c0lab.LIZIZ(j, "duration");
                                if (analysisLIZ.getExtraMap() != null && !analysisLIZ.getExtraMap().isEmpty()) {
                                    c0lab.LJI(analysisLIZ.getExtraMap());
                                }
                                C20684815ws.LJIILLIIL("stay_time", c0lab.LIZ);
                            }
                            C1C7U.LIZIZ("AnalysisActivityComponent@2547.onPause$1L");
                            return null;
                        }
                    }, C20684815ws.LJFF(), null);
                }
                this.LL = -1L;
                return;
            }
            return;
        }
        this.LL = System.currentTimeMillis();
    }
}
