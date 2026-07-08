package com.ss.android.ugc.aweme.compliance.business.utils;

import X.C018G;
import X.C1388190mED;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.router.route.IRouteAction;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: loaded from: classes20.dex */
public final class EditDobRouteAction implements IRouteAction {
    public static final int $stable = 0;

    @Override // com.bytedance.router.route.IRouteAction
    public Object open(Context context, String str, Bundle bundle) {
        Activity activityLIZ;
        C018G.LIZIZ(str, "default_birthdate");
        C018G.LIZIZ(str, "upper_bound_date");
        try {
            CastIntegerProtector.valueOf(C018G.LIZIZ(str, "edibility_birthdate_type"));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        String strLIZIZ = C018G.LIZIZ(str, "enter_method");
        try {
            CastIntegerProtector.valueOf(C018G.LIZIZ(str, "desc_type"));
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        if (context != null && (activityLIZ = C1388190mED.LIZ(context)) != null) {
            ((IAgeGateService) ServiceManager.get().getService(IAgeGateService.class)).LJIIIIZZ(activityLIZ, null, strLIZIZ);
        }
        return Boolean.TRUE;
    }
}
