package com.ss.android.ugc.aweme.refactor.business.slogan;

import X.C10NW;
import X.C10P4;
import X.C10P6;
import X.C10P7;
import X.C10P9;
import X.C10PO;
import X.C1911410zq7;
import X.C19240810Pe;
import X.C2188811AlT;
import X.InterfaceC1912440zrm;
import android.os.SystemClock;
import androidx.lifecycle.ViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AwS572S0100000_28;

/* JADX INFO: loaded from: classes29.dex */
public final class SloganPageServiceImpl extends ViewModel implements C10P9, InterfaceC1912440zrm {
    public Function0<Unit> LL = AFwS217S0000000_28.get$arr$(333);
    public long LLILLJJLI = Long.MAX_VALUE;

    @Override // X.C10P9
    public final void Is1(C10P7<?> c10p7, C19240810Pe c19240810Pe) {
    }

    @Override // X.C10P9
    public final void S62() {
    }

    @Override // X.C10P9
    public final void onComplete() {
    }

    @Override // X.C10P9
    public final void onStart() {
    }

    @Override // X.InterfaceC1912440zrm
    public final long Jz1() {
        return SystemClock.elapsedRealtime() - this.LLILLJJLI;
    }

    @Override // X.C10P9
    public final void VT1(C10P7<?> c10p7) {
        if (c10p7.type() != C10NW.JOURNEY_SLOGAN_ID && c10p7.LIZJ()) {
            this.LL.invoke();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(c10p7.type());
            sbLIZ.append(" run, call onSloganScreenFinish");
            C1911410zq7.LIZ("ISloganPageService", C2188811AlT.LIZIZ(sbLIZ));
            C10PO.LIZ.getClass();
            C10P6 c10p6 = C10PO.LIZIZ;
            if (c10p6 != null) {
                C10P4 c10p4 = c10p6.LIZIZ;
                c10p4.getClass();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("unregisterListener flowListener:");
                sbLIZ2.append(this);
                C1911410zq7.LIZ("NUJFlowEngineV2", C2188811AlT.LIZIZ(sbLIZ2));
                c10p4.LIZLLL.remove(this);
            }
        }
    }

    @Override // X.InterfaceC1912440zrm
    public final void Vb0(AwS572S0100000_28 awS572S0100000_28) {
        this.LL = awS572S0100000_28;
        C10PO.LIZ.getClass();
        C10P6 c10p6 = C10PO.LIZIZ;
        if (c10p6 != null) {
            c10p6.LIZIZ(this);
        }
    }

    @Override // X.InterfaceC1912440zrm
    public final void cH2(long j) {
        this.LLILLJJLI = j;
    }
}
