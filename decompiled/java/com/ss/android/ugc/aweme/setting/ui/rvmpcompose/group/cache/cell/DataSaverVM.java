package com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.cache.cell;

import X.C1668880tWw;
import X.C1669660tYC;
import X.C1928507gx;
import X.C2013507uf;
import X.C20684815ws;
import X.C2344009Gk;
import X.InterfaceC0148002o;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.net.mutli.network.SpeedModeServiceImpl;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.BaseCellSettingsVM;
import kotlin.jvm.internal.AwS617S0100000_3;

/* JADX INFO: loaded from: classes4.dex */
public final class DataSaverVM extends BaseCellSettingsVM<C2013507uf> {
    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        boolean zEnable = SpeedModeServiceImpl.LIZLLL().enable();
        int i = !zEnable ? 2131830502 : 2131848353;
        C1668880tWw c1668880tWw = !zEnable ? C1669660tYC.LLIILZL : C1669660tYC.LJJJJLL;
        return new C2013507uf(i, c1668880tWw, new C1928507gx(this), c1668880tWw, Integer.valueOf(i), !zEnable ? C1669660tYC.LLIILII : C1669660tYC.LJJJJLL, new AwS617S0100000_3(this, 50), !zEnable ? "data_saver" : "data_usage");
    }

    public final void vQ2(Context context, String str) {
        SmartRouter.buildRoute(context, "aweme://setting/datasaver").open();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        C20684815ws.LJIILLIIL("enter_data_saver", c2344009Gk.LIZ);
    }
}
