package com.ss.android.ugc.aweme.pipo.cashier.cashier.router;

import X.C098200Yq;
import X.C1504130pFD;
import X.C1708990uZd;
import X.C1709050uZj;
import X.C189200o6;
import X.C2188811AlT;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.pipo.probe.IProbeService;
import kotlin.Unit;

/* JADX INFO: loaded from: classes27.dex */
public final class CashierFragmentStarter$addDestroyObserver$1 implements LifecycleEventObserver {
    public final /* synthetic */ C1709050uZj LL;
    public final /* synthetic */ C1708990uZd LLILLJJLI;

    public CashierFragmentStarter$addDestroyObserver$1(C1709050uZj c1709050uZj, C1708990uZd c1708990uZd) {
        this.LL = c1709050uZj;
        this.LLILLJJLI = c1708990uZd;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            this.LL.getClass();
            C1709050uZj.LIZJ = false;
            C1709050uZj.LIZLLL = 0L;
            C1708990uZd c1708990uZd = this.LLILLJJLI;
            if (c1708990uZd != null) {
                try {
                    IProbeService iProbeService = (IProbeService) PluggableExtentionKt.pluggableSpi$default(IProbeService.class, false, false, false, 14, null);
                    if (iProbeService != null) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(c1708990uZd.LJ);
                        sbLIZ.append("_cashier");
                        iProbeService.LJIIJJI(new C1504130pFD(C2188811AlT.LIZIZ(sbLIZ)));
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                    return;
                }
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        }
    }
}
