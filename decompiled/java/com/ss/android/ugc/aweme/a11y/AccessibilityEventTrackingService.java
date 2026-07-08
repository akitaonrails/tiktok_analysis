package com.ss.android.ugc.aweme.a11y;

import X.C04TD;
import X.C1305840k5O;
import android.content.Context;
import com.ss.android.ugc.aweme.performanceopt.api.IAccessibilityEventTrackingService;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public final class AccessibilityEventTrackingService implements IAccessibilityEventTrackingService {
    public static IAccessibilityEventTrackingService LIZJ() {
        Object objLIZ = C04TD.LIZ(IAccessibilityEventTrackingService.class, false);
        if (objLIZ != null) {
            return (IAccessibilityEventTrackingService) objLIZ;
        }
        if (C04TD.LJJZZIII == null) {
            synchronized (IAccessibilityEventTrackingService.class) {
                if (C04TD.LJJZZIII == null) {
                    C04TD.LJJZZIII = new AccessibilityEventTrackingService();
                }
            }
        }
        return C04TD.LJJZZIII;
    }

    @Override // com.ss.android.ugc.aweme.performanceopt.api.IAccessibilityEventTrackingService
    public final JSONObject LIZ() {
        C1305840k5O.LIZ.getClass();
        return C1305840k5O.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.performanceopt.api.IAccessibilityEventTrackingService
    public final void LIZIZ(Context context) {
        if (context != null) {
            AccessibilityEventTrackingMonitor.INSTANCE.init(context);
        }
    }
}
