package com.ss.android.ugc.aweme.friendstab.router;

import X.AbstractC848400XPy;
import X.C0XQ7;
import X.C13LP;
import X.C15438062q;
import X.C1589640rT8;
import X.C1976907ol;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.interceptor.IInterceptor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes5.dex */
public final class FriendsFeedRouterInterceptor implements IInterceptor {
    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C1976907ol.LIZ(this, routeIntent);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        String url;
        if (routeIntent == null || (url = routeIntent.getUrl()) == null || !a0.LJJIIZI(url, "//friends_tab", false)) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        Bundle extras;
        String string;
        List listLJJLIIIJILLIZJL;
        String str;
        if (context == null || routeIntent == null || !((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            return false;
        }
        String url = routeIntent.getUrl();
        if (url != null && !a0.LJJIIZI(url, "//friends_tab", false)) {
            return false;
        }
        Intent extra = routeIntent.getExtra();
        String string2 = null;
        if (extra != null) {
            try {
                extras = extra.getExtras();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                extras = null;
            }
        } else {
            extras = null;
        }
        String str2 = "";
        if (C1589640rT8.LIZIZ.shouldShowFriendsTab()) {
            if (extras != null) {
                string2 = extras.getString("refer", "");
            }
            if (Intrinsics.LJFF(string2, "inner_push")) {
                ((IFriendsFeedService) ServiceManager.get().getService(IFriendsFeedService.class)).X2();
            }
            if (extras != null) {
                String string3 = extras.getString("insert_ids");
                if (string3 != null) {
                    List listLJJLIIIJILLIZJL2 = a0.LJJLIIIJILLIZJL(string3, new String[]{","}, 0, 6);
                    ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJJLIIIJILLIZJL2, 10));
                    Iterator it2 = listLJJLIIIJILLIZJL2.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(it2.next());
                    }
                    C1589640rT8.LIZIZ.k2(arrayList, false);
                }
                C1589640rT8.LIZIZ.R2(extras.getBoolean("insert_asc"));
            }
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//main");
            smartRouteBuildRoute.addFlags(67108864);
            smartRouteBuildRoute.withParam("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "FRIENDS_FEED");
            if (extras != null) {
                smartRouteBuildRoute.withParam(extras);
            }
            smartRouteBuildRoute.open();
            return false;
        }
        if (extras != null && (string = extras.getString("insert_ids")) != null && (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(string, new String[]{","}, 0, 6)) != null && (str = (String) C13LP.LJJJLZIJ(0, listLJJLIIIJILLIZJL)) != null) {
            str2 = str;
        }
        if (str2.length() > 0) {
            SmartRoute smartRouteBuildRoute2 = SmartRouter.buildRoute(context, "//aweme/detail");
            smartRouteBuildRoute2.withParam(FollowStatusChangeMethod.PARAM_UID, str2);
            smartRouteBuildRoute2.withParam(extras);
            smartRouteBuildRoute2.open();
            return true;
        }
        SmartRoute smartRouteBuildRoute3 = SmartRouter.buildRoute(context, "//main");
        smartRouteBuildRoute3.withParam(extras);
        smartRouteBuildRoute3.withParam("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "HOME");
        smartRouteBuildRoute3.open();
        return true;
    }
}
