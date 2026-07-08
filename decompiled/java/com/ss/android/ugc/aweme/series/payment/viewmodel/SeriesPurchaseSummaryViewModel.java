package com.ss.android.ugc.aweme.series.payment.viewmodel;

import X.AbstractC1159090gGh;
import X.C01GW;
import X.C1159080gGg;
import X.C1159100gGi;
import X.C1159110gGj;
import X.C1159120gGk;
import X.C1159130gGl;
import X.C1159140gGm;
import X.C1159150gGn;
import X.C1159260gGy;
import X.C1954807lC;
import X.C452501pT;
import X.InterfaceC0148002o;
import X.InterfaceC1614350s6z;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.service.MiniDramaPaymentService;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class SeriesPurchaseSummaryViewModel extends AssemViewModel<C1159080gGg> implements InterfaceC1614350s6z {
    public long LL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(579));

    @Override // X.InterfaceC1614350s6z
    public final void jI1(boolean z) {
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1159080gGg(null, null, null);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        MiniDramaPaymentService miniDramaPaymentService = (MiniDramaPaymentService) this.LLILLJJLI.getValue();
        if (miniDramaPaymentService != null) {
            miniDramaPaymentService.LIZ(this);
        }
    }

    @Override // X.InterfaceC1614350s6z
    public final void sX0(AbstractC1159090gGh abstractC1159090gGh) {
        if (abstractC1159090gGh.LIZ() != this.LL) {
            return;
        }
        if (abstractC1159090gGh instanceof C1159110gGj) {
            setState(AFwS256S0000000_18.get$arr$(747));
            return;
        }
        if ((abstractC1159090gGh instanceof C1159150gGn) || (abstractC1159090gGh instanceof C1159100gGi) || (abstractC1159090gGh instanceof C1159140gGm)) {
            return;
        }
        if (abstractC1159090gGh instanceof C1159130gGl) {
            if (((C1159130gGl) abstractC1159090gGh).LIZJ != null) {
                return;
            }
            setState(AFwS256S0000000_18.get$arr$(1048));
        } else if (abstractC1159090gGh instanceof C1159260gGy) {
            setState(AFwS256S0000000_18.get$arr$(1048));
        } else {
            if (abstractC1159090gGh instanceof C1159120gGk) {
                setState(AFwS256S0000000_18.get$arr$(748));
                return;
            }
            throw new C1954807lC();
        }
    }
}
