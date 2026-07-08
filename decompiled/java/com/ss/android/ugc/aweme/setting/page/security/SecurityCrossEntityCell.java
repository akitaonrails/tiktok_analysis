package com.ss.android.ugc.aweme.setting.page.security;

import X.C20662815tK;
import X.C20684815ws;
import X.C2344009Gk;
import android.app.Activity;
import android.view.View;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.setting.page.base.RightTextCell;

/* JADX INFO: loaded from: classes13.dex */
public final class SecurityCrossEntityCell extends RightTextCell<C20662815tK> {
    @Override // com.ss.android.ugc.aweme.setting.page.base.RightTextCell, android.view.View.OnClickListener
    public final void onClick(View view) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "settings_security");
        C20684815ws.LJIILLIIL("click_cross_entity_permissions", c2344009Gk.LIZ);
        Activity activity = this.LL;
        if (activity != null) {
            SettingsManager.LIZLLL().getClass();
            String str = "";
            String strLJI = SettingsManager.LJI("org_account_cross_entity_webview_url", "");
            if (strLJI != null) {
                str = strLJI;
            }
            if (str.length() > 0) {
                SmartRouter.buildRoute(activity, str).open();
            }
        }
    }
}
