package com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.account.cell;

import X.C1932207hY;
import X.C2012807uY;
import X.C2026107wh;
import X.C20684815ws;
import X.C2344009Gk;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.BaseCellSettingsVM;
import kotlin.jvm.internal.AwS582S0100000_3;
import kotlin.jvm.internal.AwS617S0100000_3;

/* JADX INFO: loaded from: classes4.dex */
public final class AccountVM extends BaseCellSettingsVM<C2012807uY> {
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    /* JADX INFO: renamed from: vQ2, reason: merged with bridge method [inline-methods] */
    public final C2012807uY defaultState() {
        return new C2012807uY(2131847815, new C1932207hY(this), new AwS617S0100000_3(this, 18), C2026107wh.LIZ());
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (lifecycleOwner.getLifecycle().getCurrentState() == Lifecycle.State.RESUMED) {
            setState(new AwS582S0100000_3(this, 50));
        }
    }

    public final void wQ2(Context context, String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("enter_method", "click_button");
        c2344009Gk.LJIIIIZZ("previous_page", "settings_page");
        C20684815ws.LJIILLIIL("enter_account_safety", c2344009Gk.LIZ);
        SmartRouter.buildRoute(context, "//account/setting").open();
    }
}
