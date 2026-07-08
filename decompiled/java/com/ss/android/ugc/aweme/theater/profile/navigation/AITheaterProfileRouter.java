package com.ss.android.ugc.aweme.theater.profile.navigation;

import X.C1388190mED;
import X.C563290M7j;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.router.route.IRouteAction;
import com.ss.android.ugc.aweme.theater.service.AITheaterProfileService;

/* JADX INFO: loaded from: classes5.dex */
public final class AITheaterProfileRouter implements IRouteAction {
    @Override // com.bytedance.router.route.IRouteAction
    public final Object open(Context context, String str, Bundle bundle) {
        Activity activityLIZ;
        if (context != null && (activityLIZ = C1388190mED.LIZ(context)) != null) {
            if (bundle == null) {
                return Boolean.FALSE;
            }
            AITheaterProfileService.LIZ.getClass();
            AITheaterProfileService aITheaterProfileServiceLIZ = C563290M7j.LIZ();
            if (aITheaterProfileServiceLIZ != null) {
                return Boolean.valueOf(aITheaterProfileServiceLIZ.S8(activityLIZ, bundle));
            }
            return Boolean.FALSE;
        }
        return Boolean.FALSE;
    }
}
