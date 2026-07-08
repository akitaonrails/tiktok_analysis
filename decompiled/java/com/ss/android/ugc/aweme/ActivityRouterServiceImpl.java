package com.ss.android.ugc.aweme;

import X.AbstractC1041580dDA;
import X.C04TD;
import X.C120W;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* JADX INFO: loaded from: classes30.dex */
public final class ActivityRouterServiceImpl implements IActivityRouterService {
    public static IActivityRouterService LIZJ() {
        Object objLIZ = C04TD.LIZ(IActivityRouterService.class, false);
        if (objLIZ != null) {
            return (IActivityRouterService) objLIZ;
        }
        if (C04TD.LJJLIIIJJIZ == null) {
            synchronized (IActivityRouterService.class) {
                if (C04TD.LJJLIIIJJIZ == null) {
                    C04TD.LJJLIIIJJIZ = new ActivityRouterServiceImpl();
                }
            }
        }
        return C04TD.LJJLIIIJJIZ;
    }

    @Override // com.ss.android.ugc.aweme.IActivityRouterService
    public final Intent LIZ(Context context, Uri uri) {
        return AbstractC1041580dDA.LJFF(context, uri);
    }

    @Override // com.ss.android.ugc.aweme.IActivityRouterService
    public final void LIZIZ(Activity activity, Uri uri) throws Throwable {
        C120W.LIZ.getClass();
        C120W.LIZLLL(activity, uri);
    }
}
