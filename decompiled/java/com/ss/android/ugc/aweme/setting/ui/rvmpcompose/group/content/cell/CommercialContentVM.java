package com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.content.cell;

import X.C1927407gm;
import X.C2014307un;
import X.C20684815ws;
import X.C2344009Gk;
import X.InterfaceC0148002o;
import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.BaseCellSettingsVM;
import kotlin.jvm.internal.AwS617S0100000_3;

/* JADX INFO: loaded from: classes4.dex */
public final class CommercialContentVM extends BaseCellSettingsVM<C2014307un> {
    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C2014307un(2131822119, new C1927407gm(this), new AwS617S0100000_3(this, 66));
    }

    public final void vQ2(Context context) {
        String strLJJIZ = ComplianceServiceProvider.LJIILIIL().LJJIZ();
        if (!TextUtils.isEmpty(strLJJIZ)) {
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//webview");
            smartRouteBuildRoute.withParam("url", strLJJIZ);
            smartRouteBuildRoute.open();
            C20684815ws.LJIILLIIL("click_commercial_content_lib_link", new C2344009Gk().LIZ);
        }
    }
}
