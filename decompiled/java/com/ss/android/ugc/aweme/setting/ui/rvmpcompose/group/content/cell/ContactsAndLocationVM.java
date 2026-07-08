package com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.content.cell;

import X.C1928807h0;
import X.C2014007uk;
import X.C20684815ws;
import X.C2097608Jq;
import X.InterfaceC0148002o;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.BaseCellSettingsVM;
import kotlin.Pair;
import kotlin.jvm.internal.AwS617S0100000_3;

/* JADX INFO: loaded from: classes4.dex */
public final class ContactsAndLocationVM extends BaseCellSettingsVM<C2014007uk> {
    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C2014007uk(2131847748, new C1928807h0(this), new AwS617S0100000_3(this, 60));
    }

    public final void vQ2(Context context, String str) {
        C20684815ws.LJIILLIIL("enter_contacts_and_location", C2097608Jq.LJIIIIZZ(new Pair("enter_method", "click"), new Pair("enter_from", str)));
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "aweme://privacy/setting/page");
        smartRouteBuildRoute.withParam("page_tag", "contacts_and_location");
        smartRouteBuildRoute.withParam("enter_from", str);
        smartRouteBuildRoute.open();
    }
}
