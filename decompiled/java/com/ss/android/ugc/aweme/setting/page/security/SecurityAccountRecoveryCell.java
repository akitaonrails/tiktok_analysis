package com.ss.android.ugc.aweme.setting.page.security;

import X.C0PEM;
import X.C20684815ws;
import X.C2296808zG;
import X.C23250099c;
import X.C2344009Gk;
import X.C848700XRc;
import X.C848730XRf;
import X.C848740XRg;
import X.C848760XRi;
import android.view.View;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.setting.page.base.RightIconCell;

/* JADX INFO: loaded from: classes14.dex */
public final class SecurityAccountRecoveryCell extends RightIconCell<C848740XRg> {
    @Override // com.ss.android.ugc.aweme.setting.page.base.RightIconCell, android.view.View.OnClickListener
    public final void onClick(View view) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "settings_security");
        C20684815ws.LJIILLIIL("click_account_recovery", c2344009Gk.LIZ);
        SmartRouter.buildRoute(this.LL, C848760XRi.LIZ().lynxUrl).open();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated(Object obj) {
        super.onItemViewCreated();
        setItem((C848730XRf) obj);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onResume(boolean z) {
        super.onResume(z);
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C848700XRc(this, null), 3);
    }

    public static void L5(String str, String str2) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("should_show_red_dot", str);
        c2344009Gk.LJIIIIZZ("error_code", str2);
        C20684815ws.LJIILLIIL("fetch_help_friend_recover_result", c2344009Gk.LIZ);
    }
}
