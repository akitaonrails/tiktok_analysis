package com.ss.android.ugc.aweme.commercialize.ba.impl.service;

import X.C04TD;
import X.C0DTS;
import X.C1050610dRj;
import android.content.Context;
import com.bytedance.ies.ugc.aweme.commwecialize.ba.service.IBABusinessSuitePageService;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.commerce.PotentialBizAccountInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.Pair;

/* JADX INFO: loaded from: classes20.dex */
public final class BABusinessSuitePageServiceImp implements IBABusinessSuitePageService {
    public static IBABusinessSuitePageService LIZIZ() {
        Object objLIZ = C04TD.LIZ(IBABusinessSuitePageService.class, false);
        if (objLIZ != null) {
            return (IBABusinessSuitePageService) objLIZ;
        }
        if (C04TD.LLJLILLLLZIIL == null) {
            synchronized (IBABusinessSuitePageService.class) {
                if (C04TD.LLJLILLLLZIIL == null) {
                    C04TD.LLJLILLLLZIIL = new BABusinessSuitePageServiceImp();
                }
            }
        }
        return C04TD.LLJLILLLLZIIL;
    }

    @Override // com.bytedance.ies.ugc.aweme.commwecialize.ba.service.IBABusinessSuitePageService
    public final void LIZ(Context context, User user, String str) {
        PotentialBizAccountInfo potentialBizAccountInfo;
        if (user.getAccountType() != 3 && (potentialBizAccountInfo = user.getPotentialBizAccountInfo()) != null && potentialBizAccountInfo.isPotentialBA()) {
            C0DTS.LIZ.getClass();
            SmartRouter.buildRoute(context, C0DTS.LIZ(4, str)).open();
        } else {
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//setting/business_suite");
            smartRouteBuildRoute.withParam("enter_from", "personal_homepage");
            smartRouteBuildRoute.open();
        }
        new C1050610dRj().LJI("ttelite_setting_business_entry_clicked", new Pair[0]);
    }
}
