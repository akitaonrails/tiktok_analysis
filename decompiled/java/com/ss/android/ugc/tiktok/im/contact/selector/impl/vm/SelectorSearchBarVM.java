package com.ss.android.ugc.tiktok.im.contact.selector.impl.vm;

import X.C1223910hxF;
import X.C291001Au;
import X.InterfaceC0148002o;
import X.InterfaceC1224370hxz;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS257S0000000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class SelectorSearchBarVM extends AssemViewModel<C1223910hxF> implements InterfaceC1224370hxz {
    public static C1223910hxF vQ2() {
        Unit unit = Unit.LIZ;
        return new C1223910hxF("", new C291001Au(unit), new C291001Au(unit), new C291001Au(unit), new C291001Au(Boolean.TRUE), new C291001Au(unit));
    }

    @Override // X.InterfaceC1224370hxz
    public final void LJJIL() {
        setStateImmediate(AFwS257S0000000_19.get$arr$(532));
    }

    @Override // X.InterfaceC1224370hxz
    public final void cU0() {
        setStateImmediate(AFwS257S0000000_19.get$arr$(533));
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final /* bridge */ /* synthetic */ InterfaceC0148002o defaultState() {
        return vQ2();
    }
}
