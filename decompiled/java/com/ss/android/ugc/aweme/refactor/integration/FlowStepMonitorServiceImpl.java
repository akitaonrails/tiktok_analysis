package com.ss.android.ugc.aweme.refactor.integration;

import X.C10NW;
import X.C10P7;
import X.C10PL;
import X.C10R5;
import X.C1911410zq7;
import X.C19235810Ng;
import X.C19240810Pe;
import X.C2188811AlT;
import androidx.lifecycle.ViewModel;
import com.bytedance.keva.Keva;

/* JADX INFO: loaded from: classes29.dex */
public final class FlowStepMonitorServiceImpl extends ViewModel implements C10PL {
    public C10NW LL;
    public C10NW LLILLJJLI;

    @Override // X.C10P9
    public final void Is1(C10P7<?> c10p7, C19240810Pe c19240810Pe) {
    }

    @Override // X.C10P9
    public final void S62() {
    }

    @Override // X.C10P9
    public final void onStart() {
    }

    @Override // X.C10PL
    public final int LE0() {
        C10NW c10nw = this.LL;
        if (c10nw != null) {
            return c10nw.getId();
        }
        return -1;
    }

    @Override // X.C10P9
    public final void onComplete() {
        Keva keva = C10R5.LJIIJ;
        C19235810Ng c19235810Ng = C10NW.Companion;
        C10NW c10nw = this.LL;
        Integer numValueOf = Integer.valueOf(c10nw != null ? c10nw.getId() : -1);
        c19235810Ng.getClass();
        keva.storeString("last_step", C19235810Ng.LIZ(numValueOf));
    }

    @Override // X.C10P9
    public final void VT1(C10P7<?> c10p7) {
        if (c10p7.LIZJ()) {
            this.LL = this.LLILLJJLI;
            this.LLILLJJLI = c10p7.type();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onComponentExecute lastShownPage:");
        sbLIZ.append(this.LL);
        sbLIZ.append(",currentShowingPage:");
        sbLIZ.append(this.LLILLJJLI);
        C1911410zq7.LIZ("IFlowStepMonitor", C2188811AlT.LIZIZ(sbLIZ));
    }
}
