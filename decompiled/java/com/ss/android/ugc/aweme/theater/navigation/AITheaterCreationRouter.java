package com.ss.android.ugc.aweme.theater.navigation;

import X.C1388190mED;
import X.C549720LhC;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.router.route.IRouteAction;
import com.ss.android.ugc.aweme.theater.service.IAITheaterCreationLauncher;
import com.ss.android.ugc.aweme.theater.service.IAITheaterFeatureService;

/* JADX INFO: loaded from: classes9.dex */
public final class AITheaterCreationRouter implements IRouteAction {
    @Override // com.bytedance.router.route.IRouteAction
    public final Object open(Context context, String str, Bundle bundle) {
        Activity activityLIZ;
        IAITheaterCreationLauncher iAITheaterCreationLauncherLIZ;
        if (context != null && (activityLIZ = C1388190mED.LIZ(context)) != null) {
            if (bundle == null) {
                return Boolean.FALSE;
            }
            IAITheaterFeatureService.LIZ.getClass();
            IAITheaterFeatureService iAITheaterFeatureServiceLIZ = C549720LhC.LIZ();
            if (iAITheaterFeatureServiceLIZ != null && (iAITheaterCreationLauncherLIZ = iAITheaterFeatureServiceLIZ.LIZ()) != null) {
                return Boolean.valueOf(iAITheaterCreationLauncherLIZ.LIZIZ(activityLIZ, bundle));
            }
            return Boolean.FALSE;
        }
        return Boolean.FALSE;
    }
}
