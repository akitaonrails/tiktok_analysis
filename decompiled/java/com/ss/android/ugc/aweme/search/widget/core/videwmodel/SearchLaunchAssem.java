package com.ss.android.ugc.aweme.search.widget.core.videwmodel;

import X.C0RUJ;
import X.C1030680cva;
import X.C1150504el;
import X.C123100dR;
import X.C19EG;
import X.C724240Sb0;
import X.C786410Ut5;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.BaseMainContainerAssem;

/* JADX INFO: loaded from: classes12.dex */
public final class SearchLaunchAssem extends BaseMainContainerAssem implements C0RUJ {
    @Override // X.C0RUJ
    public final void Ie() {
    }

    @Override // X.C0RUJ
    public final String T1() {
        return "search_launch";
    }

    @Override // X.C0RUJ
    public final void a6() {
    }

    @Override // X.C0RUJ
    public final void lj() {
    }

    @Override // X.C0RUJ
    public final boolean m8() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        Intent intent;
        String stringExtra;
        Intent intent2;
        String strJ4 = C786410Ut5.j4("main_act_assem_lifecycle_%s_%s", new Object[]{"SearchLaunchAssem", "onCreate"});
        C1150504el.LIZ().LIZLLL(strJ4, false);
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null && (intent2 = c19egLIZ.getIntent()) != null && intent2.getBooleanExtra("search_widget_to_inbox", false)) {
            C1030680cva.LIZ.getClass();
            C1030680cva.LJIIZILJ = false;
        }
        super.onCreate();
        C19EG c19egLIZ2 = C724240Sb0.LIZ(this);
        if (c19egLIZ2 != null && (intent = c19egLIZ2.getIntent()) != null) {
            boolean booleanExtra = intent.getBooleanExtra("extra_need_route_to_search", false);
            try {
                stringExtra = intent.getStringExtra("extra_search_route_url");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                stringExtra = null;
            }
            if (booleanExtra && C123100dR.LIZ(stringExtra)) {
                Bundle bundleG3 = C786410Ut5.g3(intent, "search_extra");
                C19EG c19egLIZ3 = C724240Sb0.LIZ(this);
                if (c19egLIZ3 != null) {
                    SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(c19egLIZ3, stringExtra);
                    smartRouteBuildRoute.withParam(bundleG3);
                    smartRouteBuildRoute.open();
                }
            }
        }
        C1150504el.LIZ().LJI(strJ4, false);
    }
}
