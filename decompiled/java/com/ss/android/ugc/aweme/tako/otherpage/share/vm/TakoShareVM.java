package com.ss.android.ugc.aweme.tako.otherpage.share.vm;

import X.C01GW;
import X.C09YA;
import X.C1158910gGP;
import X.C2217381BqS;
import X.C452501pT;
import X.InterfaceC0148002o;
import X.InterfaceC1858000yRy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class TakoShareVM extends AssemViewModel<C1158910gGP> {
    public final C09YA LL = new C09YA(this, AFwS206S0000000_18.get$arr$(623));
    public final List<InterfaceC1858000yRy> LLILLJJLI = new ArrayList();
    public String LLILLL = "";
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS562S0100000_18(this, 2323));

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1158910gGP(0);
    }

    public final void vQ2(Function0<Unit> function0) {
        AssemViewModel.selectSubscribe$default(this, new C2217381BqS() { // from class: X.0gQ5
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1158910gGP) obj).LLILLJJLI;
            }
        }, null, null, null, new AwS597S0100000_18(function0, (Function0<Unit>) 589), 14, null);
    }

    public final void wQ2(Function0<Unit> function0) {
        AssemViewModel.selectSubscribe$default(this, new C2217381BqS() { // from class: X.0gQ6
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1158910gGP) obj).LLILLL;
            }
        }, null, null, null, new AwS597S0100000_18(function0, (Function0<Unit>) 590), 14, null);
    }
}
