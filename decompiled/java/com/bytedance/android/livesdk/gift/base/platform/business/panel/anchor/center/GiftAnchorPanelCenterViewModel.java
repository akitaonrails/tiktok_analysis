package com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center;

import X.C1146120fvm;
import X.C1146210fvv;
import X.C13BV;
import X.C1559260qg8;
import X.EnumC1146170fvr;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import kotlin.Pair;
import kotlin.jvm.internal.AwS127S1200000_11;

/* JADX INFO: loaded from: classes18.dex */
public final class GiftAnchorPanelCenterViewModel extends AssemViewModel<C1146210fvv> {
    public final C1559260qg8 LL = new C1559260qg8(new AwS127S1200000_11((AssemViewModel) this, (AssemViewModel<Object>) C1146120fvm.class, (Class<Object>) null, (String) 13), true);

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1146210fvv(new Pair(C13BV.INSTANCE, 0), new Pair(EnumC1146170fvr.NONE, 0));
    }
}
