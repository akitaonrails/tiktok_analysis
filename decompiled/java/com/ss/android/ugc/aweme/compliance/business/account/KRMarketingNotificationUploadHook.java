package com.ss.android.ugc.aweme.compliance.business.account;

import X.AbstractC2252651DEx;
import X.C0PEM;
import X.C0XQ7;
import X.C0XVH;
import X.C0XVI;
import X.C1DFH;
import X.C20684815ws;
import X.C2107308Nj;
import X.C2286608xc;
import X.C2344009Gk;
import X.InterfaceC1364105Vn;
import com.ss.android.ugc.aweme.account.hook.AfterLoginHook;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import kotlin.Unit;

/* JADX INFO: loaded from: classes14.dex */
public final class KRMarketingNotificationUploadHook implements AfterLoginHook {
    public final C0XVH LIZIZ = C0XVH.KR_MARKETING_NOTIFICATION_UPLOAD_HOOK;

    @Override // com.ss.android.ugc.aweme.account.hook.AfterLoginHook
    public final boolean LIZIZ() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.account.hook.AfterLoginHook
    public final AbstractC2252651DEx LJJJLL() {
        C1DFH c1dfh = C0PEM.LIZ;
        return C2107308Nj.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.account.hook.AfterLoginHook
    public final C0XVH LIZJ() {
        return this.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.account.hook.AfterLoginHook
    public final boolean LJ(C0XVI c0xvi) {
        return !C0XQ7.LJFF().getCurUser().isUserCancelled();
    }

    @Override // com.ss.android.ugc.aweme.account.hook.AfterLoginHook
    public final Object LIZ(C0XVI c0xvi, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        String str;
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i = c0xvi.LIZ.getInt("kr_marketing_notification_operation", 0);
        if (i != 0) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            if (i == 2) {
                str = "on";
            } else {
                str = "off";
            }
            c2344009Gk.LJIIIIZZ("trending", str);
            C20684815ws.LJIILLIIL("tns_trending_setting", c2344009Gk.LIZ);
            ComplianceServiceProvider.LJIJI().LJII("kr_consent_market_message", "v20200629", "bottom", null, C2286608xc.LJ(i), C2286608xc.LJ(0), false, null, null);
        }
        C2344009Gk c2344009Gk2 = new C2344009Gk();
        c2344009Gk2.LJIIIIZZ("enter_from", "KRMarketingNotificationUploadHook");
        c2344009Gk2.LJIIIIZZ("enter_method", "login");
        c2344009Gk2.LIZJ(1, "is_hook");
        c2344009Gk2.LIZLLL(System.currentTimeMillis() - jCurrentTimeMillis, "duration");
        C20684815ws.LJIILLIIL("account_after_auth_action", c2344009Gk2.LIZ);
        return Unit.LIZ;
    }
}
