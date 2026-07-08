package com.ss.android.ugc.aweme.publicgroup.vm;

import X.C1157150gDZ;
import X.C1160340gIi;
import X.C13BV;
import X.C1559260qg8;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import kotlin.jvm.internal.AwS127S1200000_11;

/* JADX INFO: loaded from: classes19.dex */
public final class IMWhoCanJoinVM extends AssemViewModel<C1157150gDZ> {
    public final C1559260qg8 LL = new C1559260qg8(new AwS127S1200000_11((AssemViewModel) this, (AssemViewModel<Object>) C1160340gIi.class, (Class<Object>) null, (String) 13), true);

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1157150gDZ(null, C13BV.INSTANCE);
    }

    public final C1160340gIi vQ2() {
        return (C1160340gIi) this.LL.getValue();
    }
}
