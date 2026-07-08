package com.ss.android.ugc.tiktok.im.contact.selector.impl.vm;

import X.C1223260hwC;
import X.EnumC1223310hwH;
import X.InterfaceC0148002o;
import X.InterfaceC1223330hwJ;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import kotlin.jvm.internal.AwS598S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class SelectorStatusVM extends AssemViewModel<C1223260hwC> implements InterfaceC1223330hwJ {
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1223260hwC(null);
    }

    @Override // X.InterfaceC1223330hwJ
    public final void sU0(EnumC1223310hwH enumC1223310hwH) {
        setStateImmediate(new AwS598S0100000_19(enumC1223310hwH, 508));
    }
}
