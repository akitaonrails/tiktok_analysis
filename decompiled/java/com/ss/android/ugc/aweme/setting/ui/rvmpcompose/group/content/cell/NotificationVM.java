package com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.content.cell;

import X.C1928907h1;
import X.C2015507uz;
import X.C20684815ws;
import X.C2081508Dl;
import X.C2344009Gk;
import X.C824390WVp;
import X.InterfaceC0148002o;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.appdiff.IPushSettingsAppDiffProtocol;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.BaseCellSettingsVM;
import kotlin.jvm.internal.AwS617S0100000_3;

/* JADX INFO: loaded from: classes4.dex */
public final class NotificationVM extends BaseCellSettingsVM<C2015507uz> {
    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        C1928907h1 c1928907h1 = new C1928907h1(this);
        IPushSettingsAppDiffProtocol.LIZ.getClass();
        C2081508Dl.LIZIZ.getValue().LIZIZ();
        return new C2015507uz(c1928907h1, 2131847661, new AwS617S0100000_3(this, 65));
    }

    public final void vQ2(Context context, String str) {
        String str2;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("previous_page", "settings_page");
        c2344009Gk.LJIIIIZZ("enter_method", "click_button");
        c2344009Gk.LJIIIIZZ("enter_from", str);
        if (C824390WVp.LIZJ(context)) {
            str2 = "on";
        } else {
            str2 = "off";
        }
        c2344009Gk.LJIIIIZZ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str2);
        C20684815ws.LJIILLIIL("enter_notification_setting", c2344009Gk.LIZ);
        MobClick mobClickObtain = MobClick.obtain();
        mobClickObtain.setEventName("notification_setting");
        mobClickObtain.setLabelName("settings_page");
        C20684815ws.onEvent(mobClickObtain);
        SmartRouter.buildRoute(context, "aweme://push_setting_manager").open();
    }
}
