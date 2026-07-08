package com.ss.android.ugc.aweme.friendstab;

import X.AbstractC848400XPy;
import X.C0XQ7;
import X.C15438062q;
import X.C1589640rT8;
import X.C1976907ol;
import X.C319860CgK;
import X.C817650W5r;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.interceptor.IInterceptor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes5.dex */
public final class FriendsV3PageRouterInterceptor implements IInterceptor {
    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C1976907ol.LIZ(this, routeIntent);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        Uri uri;
        if (routeIntent != null && (uri = routeIntent.getUri()) != null) {
            return C817650W5r.LIZIZ(uri);
        }
        return false;
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        Bundle extras;
        boolean z;
        String string;
        if (!C319860CgK.LIZ() || context == null || routeIntent == null) {
            return false;
        }
        Intent extra = routeIntent.getExtra();
        String string2 = null;
        if (extra != null) {
            try {
                extras = extra.getExtras();
                if (extras != null) {
                    string2 = extras.getString("enter_from");
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                extras = null;
            }
        } else {
            extras = null;
        }
        boolean zLJFF = Intrinsics.LJFF(string2, "push");
        if (extras != null) {
            z = extras.getBoolean("form_cold_start");
        } else {
            z = false;
        }
        if (!zLJFF || !z || !((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            return false;
        }
        if (extras != null && (string = extras.getString(FollowStatusChangeMethod.PARAM_UID)) != null) {
            List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(string, new String[]{","}, 0, 6);
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJJLIIIJILLIZJL, 10));
            Iterator it2 = listLJJLIIIJILLIZJL.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next());
            }
            C1589640rT8.LIZIZ.k2(arrayList, false);
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//main");
        smartRouteBuildRoute.addFlags(67108864);
        smartRouteBuildRoute.withParam("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "FRIENDS_FEED");
        if (extras != null) {
            smartRouteBuildRoute.withParam(extras);
        }
        smartRouteBuildRoute.open();
        return true;
    }
}
