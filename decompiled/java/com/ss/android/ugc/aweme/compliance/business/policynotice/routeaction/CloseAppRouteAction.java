package com.ss.android.ugc.aweme.compliance.business.policynotice.routeaction;

import X.C2214201BlK;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Process;
import com.bytedance.router.route.IRouteAction;

/* JADX INFO: loaded from: classes14.dex */
public final class CloseAppRouteAction implements IRouteAction {
    @Override // com.bytedance.router.route.IRouteAction
    public final Object open(Context context, String str, Bundle bundle) {
        Activity activityLJFF = C2214201BlK.LJFF();
        if (activityLJFF != null) {
            activityLJFF.finishAffinity();
        }
        Process.killProcess(Process.myPid());
        System.exit(0);
        throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
    }
}
