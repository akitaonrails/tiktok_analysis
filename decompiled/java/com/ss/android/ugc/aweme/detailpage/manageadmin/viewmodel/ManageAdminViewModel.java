package com.ss.android.ugc.aweme.detailpage.manageadmin.viewmodel;

import X.C01GW;
import X.C1218020hnk;
import X.C13BV;
import X.C1559260qg8;
import X.C1616606Uq;
import X.C291001Au;
import X.C452501pT;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import kotlin.jvm.internal.AwS127S1200000_11;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class ManageAdminViewModel extends AssemViewModel<C1218020hnk> {
    public final C1559260qg8 LL = new C1559260qg8(new AwS127S1200000_11((AssemViewModel) this, (AssemViewModel<Object>) C1616606Uq.class, (Class<Object>) null, (String) 13), true);
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1070));

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1218020hnk(C13BV.INSTANCE, new C291001Au(""), new C291001Au(""), new C291001Au(""));
    }

    public final C1616606Uq vQ2() {
        return (C1616606Uq) this.LL.getValue();
    }
}
