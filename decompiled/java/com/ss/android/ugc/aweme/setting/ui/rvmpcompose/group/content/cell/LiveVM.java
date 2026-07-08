package com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.content.cell;

import X.C1928707gz;
import X.C2013907uj;
import X.C20684815ws;
import X.C2344009Gk;
import X.InterfaceC0148002o;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.BaseCellSettingsVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS617S0100000_3;

/* JADX INFO: loaded from: classes4.dex */
public final class LiveVM extends BaseCellSettingsVM<C2013907uj> {
    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C2013907uj(Integer.valueOf(R.string.l1c), new C1928707gz(this), new AwS617S0100000_3(this, 59));
    }

    public final void vQ2(Context context, String str) {
        SmartRouter.buildRoute(context, "//setting/live").open();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        C20684815ws.LJIILLIIL("enter_settings_live", c2344009Gk.LIZ);
    }
}
