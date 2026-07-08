package com.ss.android.ugc.aweme.setting.page.security;

import X.C20662515tH;
import X.C20684815ws;
import X.C2344009Gk;
import X.EnumC1059300dfk;
import android.app.Activity;
import android.view.View;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.autofill.IAdAutofillService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.setting.page.base.RightTextCell;

/* JADX INFO: loaded from: classes14.dex */
public final class SecurityBrowserSettingCell extends RightTextCell<C20662515tH> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        boolean zLJI = MethodIDManager.LJI(72080);
        super.onItemViewCreated();
        Activity activity = this.LL;
        if (activity != null && activity.getBaseContext() != null && (((IAdAutofillService) ServiceManager.get().getService(IAdAutofillService.class)).autofillEnable() || ((IAdAutofillService) ServiceManager.get().getService(IAdAutofillService.class)).LJIIJJI())) {
            ((IAdAutofillService) ServiceManager.get().getService(IAdAutofillService.class)).LJIJI(EnumC1059300dfk.AD);
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.setting.page.base.RightTextCell, android.view.View.OnClickListener
    public final void onClick(View view) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "settings_security");
        C20684815ws.LJIILLIIL("click_browser_setting", c2344009Gk.LIZ);
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(this.LL, "//adbrowser/settings");
        smartRouteBuildRoute.withParam("enter_from", "settings_security");
        smartRouteBuildRoute.open();
    }
}
