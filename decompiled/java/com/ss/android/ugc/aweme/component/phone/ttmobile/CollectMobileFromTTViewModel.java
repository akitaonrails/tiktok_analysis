package com.ss.android.ugc.aweme.component.phone.ttmobile;

import X.C099R;
import X.C0PEM;
import X.C1411330mpX;
import X.C1718390uon;
import X.C1DFH;
import X.C2107308Nj;
import X.C23250099c;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import kotlin.Unit;

/* JADX INFO: loaded from: classes23.dex */
public final class CollectMobileFromTTViewModel extends AssemViewModel<C1718390uon> {
    public String LL = "";
    public boolean LLILLJJLI;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1718390uon(0);
    }

    public final Object vQ2(String str, String str2, String str3, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) throws Throwable {
        C1DFH c1dfh = C0PEM.LIZ;
        Object objLJI = C23250099c.LJI(interfaceC1364105Vn, C2107308Nj.LIZ, new C1411330mpX(this, str, str3, str2, null));
        if (objLJI == C099R.LJFF()) {
            return objLJI;
        }
        return Unit.LIZ;
    }
}
