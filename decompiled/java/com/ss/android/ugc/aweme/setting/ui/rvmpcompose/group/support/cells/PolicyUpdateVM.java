package com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.support.cells;

import X.C0TTZ;
import X.C0XI4;
import X.C1233040iBy;
import X.C1388190mED;
import X.C1926907gh;
import X.C2014707ur;
import X.C20684815ws;
import X.C2097608Jq;
import X.InterfaceC0148002o;
import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.locale.LocalServiceImpl;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.BaseCellSettingsVM;
import kotlin.Pair;
import kotlin.jvm.internal.AwS617S0100000_3;

/* JADX INFO: loaded from: classes13.dex */
public final class PolicyUpdateVM extends BaseCellSettingsVM<C2014707ur> {
    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C2014707ur(2131844873, new C1926907gh(this), new AwS617S0100000_3(this, 4));
    }

    public final void vQ2(Context context) {
        Activity activityLIZ;
        if (context != null && (activityLIZ = C1388190mED.LIZ(context)) != null) {
            C0TTZ.LIZ.getClass();
            if (!C0TTZ.LIZ()) {
                C1233040iBy c1233040iBy = new C1233040iBy(activityLIZ);
                c1233040iBy.LIZIZ(2131837962);
                c1233040iBy.LIZLLL();
                return;
            }
            C0XI4 c0xi4 = new C0XI4("https://www.tiktok.com/policy-updates");
            c0xi4.LJ("lang", LocalServiceImpl.LIZIZ().LIZ(activityLIZ));
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(activityLIZ, "aweme://webview");
            smartRouteBuildRoute.withParam("url", c0xi4.LJFF());
            smartRouteBuildRoute.withParam("title", activityLIZ.getString(2131844873));
            smartRouteBuildRoute.withParam("show_separate_line", false);
            smartRouteBuildRoute.open();
            C20684815ws.LJIILLIIL("enter_policy_updates", C2097608Jq.LJIIIIZZ(new Pair("enter_from", "settings_page"), new Pair("page_tag", "policy_updates")));
        }
    }
}
