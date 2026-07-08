package com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.account.cell;

import X.C1928307gv;
import X.C2013307ud;
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
public final class SecurityAndPermissionsVM extends BaseCellSettingsVM<C2013307ud> {
    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C2013307ud(2131826824, new C1928307gv(this), new AwS617S0100000_3(this, 37));
    }

    public final void vQ2(Context context, String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        C20684815ws.LJIILLIIL("enter_account_security", c2344009Gk.LIZ);
        SmartRouter.buildRoute(context, "//setting/security").open();
    }
}
