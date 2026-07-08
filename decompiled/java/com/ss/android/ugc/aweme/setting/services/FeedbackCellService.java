package com.ss.android.ugc.aweme.setting.services;

import X.C036E;
import X.C1233040iBy;
import X.C2018907vX;
import X.C20684815ws;
import X.C2344009Gk;
import X.C2508209sG;
import android.content.Context;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes5.dex */
public final class FeedbackCellService implements IFeedbackCellService {
    @Override // com.ss.android.ugc.aweme.setting.services.IFeedbackCellService
    public final void LIZIZ() {
    }

    @Override // com.ss.android.ugc.aweme.setting.services.IFeedbackCellService
    public final void LIZ(Context context, String str) {
        try {
            if (C036E.LIZ.LIZIZ()) {
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("enter_from", str);
                C20684815ws.LJIILLIIL("enter_feedback_page", c2344009Gk.LIZ);
                C2344009Gk c2344009Gk2 = new C2344009Gk();
                c2344009Gk2.LJIIIIZZ("enter_from", "settings");
                C20684815ws.LJIILLIIL("FAQ", c2344009Gk2.LIZ);
                C2344009Gk c2344009Gk3 = new C2344009Gk();
                c2344009Gk3.LJIIIIZZ("enter_from", "settings");
                C20684815ws.LJIILLIIL("click_feedback_entrance", c2344009Gk3.LIZ);
                String str2 = C2508209sG.LIZ;
                if (!C2018907vX.LIZ || str2.length() <= 0) {
                    str2 = "aweme://setting/reportproblem/home";
                }
                SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, str2);
                smartRouteBuildRoute.withParam("enter_time", String.valueOf(System.currentTimeMillis()));
                smartRouteBuildRoute.withParam("start_time", System.currentTimeMillis());
                smartRouteBuildRoute.withParam("entrance", "rap_main");
                smartRouteBuildRoute.withParam("enter_from", "rap_main");
                smartRouteBuildRoute.open();
                return;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C1233040iBy c1233040iBy = new C1233040iBy(context);
        c1233040iBy.LIZIZ(2131837962);
        c1233040iBy.LIZLLL();
    }
}
