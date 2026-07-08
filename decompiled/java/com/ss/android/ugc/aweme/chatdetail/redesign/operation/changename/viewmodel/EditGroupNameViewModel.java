package com.ss.android.ugc.aweme.chatdetail.redesign.operation.changename.viewmodel;

import X.C01GW;
import X.C1509305vX;
import X.C1559260qg8;
import X.C291001Au;
import X.C452501pT;
import X.C723600SZy;
import X.C910010Zmx;
import X.C910030Zmz;
import X.C910770ZoB;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class EditGroupNameViewModel extends AssemViewModel<C910770ZoB> {
    public final C1559260qg8 LL = new C1559260qg8(new C723600SZy(this, C910030Zmz.class, null), true);
    public final C01GW LLILLJJLI = C1509305vX.LIZ(new AwS558S0100000_14(this, 121));
    public final C01GW LLILLL = C1509305vX.LIZ(new AwS558S0100000_14(this, 119));
    public final C01GW LLILZ = C1509305vX.LIZ(new AwS558S0100000_14(this, 120));
    public final C01GW LLILZIL = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(64));
    public final C01GW LLILZLL = C1509305vX.LIZ(AFwS201S0000000_14.get$arr$(63));

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C910770ZoB(false, true, new C291001Au(Boolean.FALSE), null);
    }

    public final C910010Zmx vQ2() {
        return (C910010Zmx) this.LLILZIL.getValue();
    }
}
