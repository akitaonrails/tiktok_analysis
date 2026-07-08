package com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.support.cells;

import X.C1928107gt;
import X.C2013107ub;
import X.C20684815ws;
import X.C2344009Gk;
import X.C844470XAv;
import X.InterfaceC0148002o;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.BaseCellSettingsVM;
import kotlin.jvm.internal.AwS617S0100000_3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class SupportCellVM extends BaseCellSettingsVM<C2013107ub> {
    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C2013107ub(2131847819, new C1928107gt(this), new AwS617S0100000_3(this, 10));
    }

    public SupportCellVM() {
        C844470XAv.LIZ.getClass();
        Intrinsics.LJFF(C844470XAv.LJIILL, "local_test");
    }

    public final void vQ2(Context context, String str) {
        SmartRouter.buildRoute(context, "//setting/support").open();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        C20684815ws.LJIILLIIL("enter_settings_support", c2344009Gk.LIZ);
    }
}
