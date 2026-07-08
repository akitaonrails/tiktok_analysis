package com.ss.android.ugc.aweme.setting.experiment;

import X.C1976907ol;
import X.C2097608Jq;
import X.C2188811AlT;
import android.content.Context;
import android.net.Uri;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.interceptor.IInterceptor;
import java.util.HashMap;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AFwS215S0000000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class InboxMsgInterceptor implements IInterceptor {
    public final HashMap<String, Function0<String>> LL;
    public final Set<String> LLILLJJLI;

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C1976907ol.LIZ(this, routeIntent);
    }

    public InboxMsgInterceptor() {
        HashMap<String, Function0<String>> mapLJI = C2097608Jq.LJI(new Pair("betaTesting/joinTester", AFwS215S0000000_26.get$arr$(256)), new Pair("betaTesting/joinSuccess", AFwS215S0000000_26.get$arr$(257)), new Pair("betaTesting/joinTasks", AFwS215S0000000_26.get$arr$(258)), new Pair("setting/beta_register", AFwS199S0000000_12.get$arr$(204)));
        this.LL = mapLJI;
        this.LLILLJJLI = mapLJI.keySet();
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        Uri uri;
        if (routeIntent != null && (uri = routeIntent.getUri()) != null) {
            Set<String> set = this.LLILLJJLI;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(uri.getHost());
            sbLIZ.append(uri.getPath());
            return set.contains(C2188811AlT.LIZIZ(sbLIZ));
        }
        return false;
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        Uri uri;
        if (context == null || routeIntent == null || (uri = routeIntent.getUri()) == null) {
            return false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(uri.getHost());
        sbLIZ.append(uri.getPath());
        Function0<String> function0 = this.LL.get(C2188811AlT.LIZIZ(sbLIZ));
        if (function0 == null) {
            return false;
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, function0.invoke());
        smartRouteBuildRoute.withParam("enter_from", "inbox_notification");
        smartRouteBuildRoute.open();
        return true;
    }
}
