package com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.support.cells;

import X.C1928007gs;
import X.C2012907uZ;
import X.C20684815ws;
import X.C2344009Gk;
import X.InterfaceC0148002o;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.BaseCellSettingsVM;
import kotlin.jvm.internal.AwS617S0100000_3;

/* JADX INFO: loaded from: classes4.dex */
public final class AboutCellVM extends BaseCellSettingsVM<C2012907uZ> {
    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C2012907uZ(2131847809, new C1928007gs(this), new AwS617S0100000_3(this, 5));
    }

    public final void vQ2(Context context, String str) {
        SmartRouter.buildRoute(context, "//setting/about").open();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        C20684815ws.LJIILLIIL("enter_settings_about", c2344009Gk.LIZ);
    }
}
