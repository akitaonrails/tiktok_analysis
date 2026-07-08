package com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.top.cell;

import X.C1928207gu;
import X.C2012707uX;
import X.C20684815ws;
import X.C2097608Jq;
import X.InterfaceC0148002o;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.BaseCellSettingsVM;
import kotlin.Pair;
import kotlin.jvm.internal.AwS617S0100000_3;

/* JADX INFO: loaded from: classes4.dex */
public final class ManagePostsVM extends BaseCellSettingsVM<C2012707uX> {
    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C2012707uX(2131847750, new C1928207gu(this), new AwS617S0100000_3(this, 24));
    }

    public final void vQ2(Context context, String str) {
        C20684815ws.LJIILLIIL("enter_manage_posts", C2097608Jq.LJIIIIZZ(new Pair("enter_method", "click"), new Pair("enter_from", str)));
        SmartRouter.buildRoute(context, "aweme://pns/activity_center?libra_key=privacy_setting_manage_posts&enter_from=setting_page&biometrics_lock=1").open();
    }
}
