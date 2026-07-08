package com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.framework.card;

import X.C098200Yq;
import X.C1155600gB4;
import X.C1559260qg8;
import X.C189200o6;
import X.C20441214yg;
import X.C2188811AlT;
import X.C293501Bt;
import X.InterfaceC0148002o;
import X.InterfaceC1881340z3c;
import X.InterfaceC1882750z5t;
import X.InterfaceC1884840z9G;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.internal.AwS127S1200000_11;

/* JADX INFO: loaded from: classes29.dex */
public abstract class MixCardBaseViewModel<M, S extends InterfaceC0148002o> extends AssemViewModel<S> implements InterfaceC1882750z5t {
    public final InterfaceC1884840z9G LL;
    public final C1559260qg8 LLILLJJLI = new C1559260qg8(new AwS127S1200000_11((AssemViewModel) this, (AssemViewModel<Object>) C1155600gB4.class, (Class<Object>) "initial_data", (String) 13), true);
    public M LLILLL;

    public abstract Class<M> wQ2();

    public void xQ2(Object obj, String str) {
    }

    public abstract void yQ2();

    public final InterfaceC1881340z3c vQ2() {
        return this.LL.LIZJ();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public void onPrepared() {
        Object c098200Yq;
        super.onPrepared();
        try {
            this.LLILLL = (M) C293501Bt.LIZ().LJII(((C1155600gB4) this.LLILLJJLI.getValue()).LLILLJJLI, wQ2());
            yQ2();
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("handleData exception: ");
            sbLIZ.append(thM5exceptionOrNullimpl.getMessage());
            C20441214yg.LJFF("CardBaseAssemViewModel", C2188811AlT.LIZIZ(sbLIZ), thM5exceptionOrNullimpl);
        }
    }

    public MixCardBaseViewModel(InterfaceC1884840z9G interfaceC1884840z9G) {
        this.LL = interfaceC1884840z9G;
        System.currentTimeMillis();
    }

    @Override // X.InterfaceC1882750z5t
    public final void y60(Object obj, String str) {
        xQ2(obj, str);
    }
}
