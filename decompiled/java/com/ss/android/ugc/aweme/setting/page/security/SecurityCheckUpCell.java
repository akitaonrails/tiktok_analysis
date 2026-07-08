package com.ss.android.ugc.aweme.setting.page.security;

import X.C20662715tJ;
import X.C786410Ut5;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.account.security.SecurityCheckUpActivity;
import com.ss.android.ugc.aweme.setting.page.base.RightTextCell;

/* JADX INFO: loaded from: classes13.dex */
public final class SecurityCheckUpCell extends RightTextCell<C20662715tJ> {
    @Override // com.ss.android.ugc.aweme.setting.page.base.RightTextCell, android.view.View.OnClickListener
    public final void onClick(View view) {
        String str = SecurityCheckUpActivity._pnsPageId;
        Activity activity = this.LL;
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("enter_from", "settings_page", bundle);
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(activity, "//account/security/security_check_up");
        smartRouteBuildRoute.withParam(bundle);
        smartRouteBuildRoute.open();
    }
}
