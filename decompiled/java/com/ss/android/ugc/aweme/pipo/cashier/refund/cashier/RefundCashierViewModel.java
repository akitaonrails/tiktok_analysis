package com.ss.android.ugc.aweme.pipo.cashier.refund.cashier;

import X.C09YA;
import X.C0PEM;
import X.C1165560gR8;
import X.C1708030uY5;
import X.C1708080uYA;
import X.C1709090uZn;
import X.C1709110uZp;
import X.C1711150ud7;
import X.C1DFH;
import X.C2107308Nj;
import X.C23250099c;
import X.C817503Hh;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.AFwS268S0000000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class RefundCashierViewModel extends AssemViewModel<C1711150ud7> {
    public C1709110uZp LL;
    public final C09YA LLILLJJLI = new C09YA(this, AFwS215S0000000_26.get$arr$(240));

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1711150ud7(null, null, null, null, null, null, null, null, 255);
    }

    public final void vQ2() {
        C1709110uZp c1709110uZp = this.LL;
        if (c1709110uZp == null) {
            setState(AFwS268S0000000_26.get$arr$(441));
            return;
        }
        C1708030uY5.LIZ.LIZ(new C1708080uYA(c1709110uZp.LJIIJ)).LIZJ("request_cbi", null);
        C817503Hh c817503Hh = C817503Hh.LL;
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(c817503Hh, C2107308Nj.LIZ, null, new C1165560gR8(this, null), 2);
        C23250099c.LIZLLL(c817503Hh, C0PEM.LIZJ, null, new C1709090uZn(this, c1709110uZp, null), 2);
    }
}
