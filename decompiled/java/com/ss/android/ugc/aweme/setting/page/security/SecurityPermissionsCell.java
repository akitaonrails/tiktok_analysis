package com.ss.android.ugc.aweme.setting.page.security;

import X.C01GW;
import X.C20663015tM;
import X.C20684815ws;
import X.C2344009Gk;
import X.C452501pT;
import android.view.View;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.setting.page.base.RightTextCell;
import kotlin.jvm.internal.AwS556S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class SecurityPermissionsCell extends RightTextCell<C20663015tM> {
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS556S0100000_12(this, 591));

    @Override // com.ss.android.ugc.aweme.setting.page.base.RightTextCell, android.view.View.OnClickListener
    public final void onClick(View view) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("previous_page", "security and login");
        c2344009Gk.LJIIIIZZ("settings_security", "settings_security");
        C20684815ws.LJIILLIIL("enter_manage_apps_permissions", c2344009Gk.LIZ);
        SmartRouter.buildRoute(this.LL, "//authmanagement").open();
    }
}
