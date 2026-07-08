package com.ss.android.ugc.aweme.manage.joinquestion;

import X.C01GW;
import X.C0R96;
import X.C0Y8T;
import X.C0YNP;
import X.C0Z58;
import X.C1159280gH0;
import X.C1559260qg8;
import X.C2097908Jt;
import X.C452501pT;
import X.InterfaceC0148002o;
import X.InterfaceC863600XuI;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.manage.joinquestion.EditJoinQuestionViewModel;
import kotlin.Pair;
import kotlin.jvm.internal.AwS127S1200000_11;
import kotlin.jvm.internal.AwS384S0200000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class EditJoinQuestionViewModel extends AssemViewModel<C1159280gH0> {
    public final C1559260qg8 LL = new C1559260qg8(new AwS127S1200000_11((AssemViewModel) this, (AssemViewModel<Object>) C0R96.class, (Class<Object>) null, (String) 13), true);
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS562S0100000_18(this, 361));

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1159280gH0((String) this.LLILLJJLI.getValue(), 29);
    }

    public final void wQ2() {
        setState(new AwS597S0100000_18(this, 883));
        C0Z58 c0z58 = C0Z58.LIZ;
        String str = ((C0R96) this.LL.getValue()).LL;
        String str2 = getState().LLILLJJLI;
        InterfaceC863600XuI<C0Y8T> interfaceC863600XuI = new InterfaceC863600XuI<C0Y8T>() { // from class: X.0gPo
            @Override // X.InterfaceC863600XuI
            public final void LIZIZ(C0YMW c0ymw) {
                EditJoinQuestionViewModel editJoinQuestionViewModel = this.LIZ;
                editJoinQuestionViewModel.setState(new AwS384S0200000_18(editJoinQuestionViewModel, c0ymw, 226));
            }

            @Override // X.InterfaceC863600XuI
            public final void onSuccess(C0Y8T c0y8t) {
                EditJoinQuestionViewModel editJoinQuestionViewModel = this.LIZ;
                editJoinQuestionViewModel.setState(new AwS597S0100000_18(editJoinQuestionViewModel, 884));
            }
        };
        c0z58.getClass();
        C0YNP.LIZIZ(str).LJIL(C2097908Jt.LIZJ(new Pair("a:audit_question", str2)), interfaceC863600XuI);
    }

    public final C1159280gH0 vQ2(C1159280gH0 c1159280gH0) {
        return C1159280gH0.LIZ(c1159280gH0, !Intrinsics.LJFF(this.LLILLJJLI.getValue(), c1159280gH0.LLILLJJLI), null, false, null, null, 30);
    }
}
