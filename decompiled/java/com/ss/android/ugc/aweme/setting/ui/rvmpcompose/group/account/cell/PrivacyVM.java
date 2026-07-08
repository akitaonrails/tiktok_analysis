package com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.account.cell;

import X.C1928407gw;
import X.C2015007uu;
import X.C20684815ws;
import X.C2082308Dt;
import X.C735800Ste;
import X.InterfaceC0148002o;
import X.InterfaceC1210900hcG;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.BaseCellSettingsVM;
import kotlin.jvm.internal.AwS617S0100000_3;

/* JADX INFO: loaded from: classes4.dex */
public final class PrivacyVM extends BaseCellSettingsVM<C2015007uu> {
    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C2015007uu(2131821937, new C1928407gw(this), new AwS617S0100000_3(this, 45));
    }

    public final void vQ2(Context context, String str) {
        C735800Ste c735800Ste = new C735800Ste("enter_privacy_setting");
        C2082308Dt c2082308Dt = InterfaceC1210900hcG.LIZ;
        c735800Ste.LJFF("previous_page", "settings_page", c2082308Dt);
        c735800Ste.LJFF("enter_method", "click_button", c2082308Dt);
        c735800Ste.LJFF("enter_from", str, c2082308Dt);
        c735800Ste.LJIILJJIL();
        if (context != null) {
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//privacy/setting");
            smartRouteBuildRoute.withParam("key_launch_time", System.currentTimeMillis());
            smartRouteBuildRoute.withParam("key_launch_mode", 2);
            smartRouteBuildRoute.open();
        }
        MobClick mobClickObtain = MobClick.obtain();
        mobClickObtain.setEventName("privacy");
        mobClickObtain.setLabelName("settings");
        C20684815ws.onEvent(mobClickObtain);
    }
}
