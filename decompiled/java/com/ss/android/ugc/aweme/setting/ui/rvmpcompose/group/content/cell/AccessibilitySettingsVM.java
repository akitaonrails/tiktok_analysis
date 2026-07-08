package com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.content.cell;

import X.C1474810oTv;
import X.C1669660tYC;
import X.C1927907gr;
import X.C2015707v1;
import X.C2016807vC;
import X.C2016907vD;
import X.C2017107vF;
import X.C20642515q3;
import X.C20684815ws;
import X.C2344009Gk;
import X.C293260BeW;
import X.InterfaceC0148002o;
import android.content.Context;
import android.os.Build;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.keva.Keva;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.BaseCellSettingsVM;
import kotlin.jvm.internal.AwS582S0100000_3;
import kotlin.jvm.internal.AwS617S0100000_3;

/* JADX INFO: loaded from: classes4.dex */
public final class AccessibilitySettingsVM extends BaseCellSettingsVM<C2016907vD> {
    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C2016907vD(((Build.VERSION.SDK_INT < 24 || !C1474810oTv.LJJJJZI() || C2015707v1.LIZ() != 1 || Keva.getRepo("keva_a11y_settings_unit").getBoolean("keva_has_show_a11y_hdr_switch", false)) && !(((C2017107vF.LIZ() == 1 || C2017107vF.LIZ() == 2) && C293260BeW.LIZ() && Keva.getRepo("keva_a11y_settings_unit").getBoolean("keva_has_show_a11y_caption_switch", true)) || Keva.getRepo("keva_a11y_settings_unit").getBoolean("keva_has_show_a11y_reduce_motion_switch", true))) ? new C2016807vC(null, false) : new C2016807vC(C20642515q3.LJI(2131824472), true), new C1927907gr(this), C1669660tYC.LIZLLL, 2131823130, null, C1669660tYC.LIZJ, null, new AwS617S0100000_3(this, 55), null);
    }

    public final void vQ2(Context context, String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("enter_method", "click_setting");
        C20684815ws.LJIILLIIL("enter_a11y_settings", c2344009Gk.LIZ);
        SmartRouter.buildRoute(context, "aweme://setting/accessibility").open();
        withState(new AwS582S0100000_3(this, 52));
    }
}
