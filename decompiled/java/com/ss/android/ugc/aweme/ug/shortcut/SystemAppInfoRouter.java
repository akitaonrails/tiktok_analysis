package com.ss.android.ugc.aweme.ug.shortcut;

import X.C098200Yq;
import X.C0WZX;
import X.C1701330uNH;
import X.C189200o6;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C2431609fu;
import X.C2431709fv;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.router.route.IRouteAction;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes4.dex */
public final class SystemAppInfoRouter implements IRouteAction {
    public static final C2431709fv Companion = new Object() { // from class: X.09fv
    };

    @Override // com.bytedance.router.route.IRouteAction
    public Object open(Context context, String str, Bundle bundle) {
        Object c098200Yq;
        if (context != null) {
            C2431609fu.LIZ.getClass();
            try {
                Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("package:");
                sbLIZ.append(context.getPackageName());
                intent.setData(UriProtector.parse(C2188811AlT.LIZIZ(sbLIZ)));
                RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
                C1701330uNH.LIZ(intent, context);
                C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP+vLYzG0yA0HpWX1EK2AxN9ZlY7z3P4j+1iBxnCpgR3FyCfsQ8=", null));
                c098200Yq = Integer.valueOf(Log.d("UninstallRemoveKeep", "tryOpenAppSettingPage success"));
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            C189200o6.m5exceptionOrNullimpl(c098200Yq);
        }
        return Boolean.TRUE;
    }
}
