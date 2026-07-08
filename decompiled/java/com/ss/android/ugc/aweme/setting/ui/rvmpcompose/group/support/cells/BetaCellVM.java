package com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.support.cells;

import X.C1669660tYC;
import X.C1926607ge;
import X.C2018407vS;
import X.C20684815ws;
import X.C2344009Gk;
import X.InterfaceC0148002o;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.keva.Keva;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.setting.experiment.BetaAppExperiment;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.BaseCellSettingsVM;
import kotlin.jvm.internal.AFwS231S0000000_3;
import kotlin.jvm.internal.AwS617S0100000_3;

/* JADX INFO: loaded from: classes4.dex */
public final class BetaCellVM extends BaseCellSettingsVM<C2018407vS> {
    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        boolean zLIZ = BetaAppExperiment.LIZ();
        return new C2018407vS(C1669660tYC.LJJIJIIJIL, C1669660tYC.LJJIJIIJI, 2131827352, null, null, null, new C1926607ge(this), new AwS617S0100000_3(this, 9), zLIZ);
    }

    public final void vQ2(Context context) {
        String str;
        setState(AFwS231S0000000_3.get$arr$(66));
        C2344009Gk c2344009Gk = new C2344009Gk();
        Keva keva = BetaAppExperiment.LJI;
        c2344009Gk.LJIIIIZZ("beta_version", keva.getString(BetaAppExperiment.LJ, ""));
        c2344009Gk.LIZJ(keva.getInt(BetaAppExperiment.LIZLLL, -1), "beta_build");
        String str2 = "1";
        if (BetaAppExperiment.LIZ()) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJIIIIZZ("has_new_label", str);
        if (!BetaAppExperiment.LJIIIIZZ) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJIIIIZZ("has_update", str2);
        C20684815ws.LJIILLIIL("tiktok_beta_setting_entrance_click", c2344009Gk.LIZ);
        String str3 = BetaAppExperiment.LIZJ;
        if (!keva.contains(str3) && BetaAppExperiment.LIZ()) {
            keva.storeBoolean(str3, true);
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//setting/beta_register");
        smartRouteBuildRoute.withParam("enter_from", "settings_page");
        smartRouteBuildRoute.open();
    }
}
