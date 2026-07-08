package com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.content.cell;

import X.C1927207gk;
import X.C2000707sb;
import X.C2013707uh;
import X.C20684815ws;
import X.InterfaceC0148002o;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.BaseCellSettingsVM;
import com.ss.android.ugc.aweme.ug.settings.UgcPermission;
import kotlin.jvm.internal.AwS617S0100000_3;

/* JADX INFO: loaded from: classes4.dex */
public final class JoinAmplifyVM extends BaseCellSettingsVM<C2013707uh> {
    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        C1927207gk c1927207gk = new C1927207gk(this);
        UgcPermission ugcPermissionLIZ = C2000707sb.LIZ();
        return new C2013707uh(ugcPermissionLIZ != null ? ugcPermissionLIZ.desc : null, c1927207gk, new AwS617S0100000_3(this, 54));
    }

    public final void vQ2(Context context) {
        UgcPermission ugcPermissionLIZ = C2000707sb.LIZ();
        if (ugcPermissionLIZ != null) {
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//webview");
            smartRouteBuildRoute.withParam(UriProtector.parse(ugcPermissionLIZ.url));
            smartRouteBuildRoute.open();
            C20684815ws.onEventV3("click_amplify_setting");
        }
    }
}
