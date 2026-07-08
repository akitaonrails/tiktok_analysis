package com.ss.android.ugc.aweme.im.ai.impl.smartreply.instruction.edit;

import X.C01GW;
import X.C13BV;
import X.C1512005vy;
import X.C1527205yQ;
import X.C1559260qg8;
import X.C452501pT;
import X.InterfaceC0148002o;
import X.InterfaceC1411705fn;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AwS127S1200000_11;

/* JADX INFO: loaded from: classes3.dex */
public final class InstructionEditVM extends AssemViewModel<C1512005vy> {
    public static final C01GW<InterfaceC1411705fn> LLILLJJLI = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(333));
    public final C1559260qg8<C1527205yQ> LL = new C1559260qg8<>(new AwS127S1200000_11((AssemViewModel) this, (AssemViewModel<Object>) C1527205yQ.class, (Class<Object>) null, (String) 13), true);

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1512005vy(this.LL.getValue().LL.currentText, this.LL.getValue().LL.currentText, C13BV.INSTANCE, 32);
    }
}
