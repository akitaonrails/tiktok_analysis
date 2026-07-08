package com.ss.android.ugc.aweme.home;

import X.C01GW;
import X.C09R9;
import X.C0PEM;
import X.C1158990gGX;
import X.C13LE;
import X.C1722790uvt;
import X.C1722840uvy;
import X.C1722960uwA;
import X.C1723640uxG;
import X.C1776140wJw;
import X.C2296808zG;
import X.C23250099c;
import X.C452501pT;
import X.C491101vh;
import X.C759410Tqd;
import X.InterfaceC0148002o;
import X.InterfaceC1722860uw0;
import X.InterfaceC736910SvR;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: loaded from: classes27.dex */
public final class WalletHomeViewModel extends AssemViewModel<C1158990gGX> {
    public C1722790uvt LL;
    public C759410Tqd LLILLJJLI;
    public final C09R9 LLILLL = new C09R9(this, C13LE.LIZ(C1723640uxG.class));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 736));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 737));
    public final C1776140wJw LLILZLL = new C1776140wJw(CoroutineExceptionHandler.LJJLIL, 1);

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1158990gGX(null, C491101vh.LIZ, true);
    }

    public final InterfaceC736910SvR<InterfaceC1722860uw0> wQ2() {
        return (InterfaceC736910SvR) this.LLILLL.getValue();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ.plus(this.LLILZLL)), null, null, new C1722840uvy(this, null), 3);
    }

    public final void vQ2() {
        C23250099c.LIZLLL(getLifecycleScope(), this.LLILZLL, null, new C1722960uwA(this, null), 2);
    }
}
