package com.ss.android.ugc.aweme.series.deeplink;

import X.AbstractC1387200mCc;
import X.C0DMM;
import X.C0RRR;
import X.C0S4U;
import X.C0WZX;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1585070rLl;
import X.C1701330uNH;
import X.C1906580ziK;
import X.C1976907ol;
import X.C19EG;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C2421209eE;
import X.C343710Ddh;
import X.C844470XAv;
import X.EnumC1570580qyO;
import X.EnumC1584360rKc;
import X.InterfaceC1577520r9a;
import X.InterfaceC1583870rJp;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.interceptor.IInterceptor;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.top.ITabStrip;
import com.ss.android.ugc.aweme.main.TabChangeManager;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.series.feed.ISeriesFeedService;
import com.ss.android.ugc.aweme.services.IMainService;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class DramaTabRouterInterceptor implements IInterceptor {
    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C1976907ol.LIZ(this, routeIntent);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        String scheme;
        String host;
        Uri uri;
        Uri uri2;
        Uri uri3;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        String path = null;
        if (routeIntent != null && (uri3 = routeIntent.getUri()) != null) {
            scheme = uri3.getScheme();
        } else {
            scheme = null;
        }
        sbLIZ.append(scheme);
        sbLIZ.append("://");
        if (routeIntent != null && (uri2 = routeIntent.getUri()) != null) {
            host = uri2.getHost();
        } else {
            host = null;
        }
        sbLIZ.append(host);
        if (routeIntent != null && (uri = routeIntent.getUri()) != null) {
            path = uri.getPath();
        }
        sbLIZ.append(path);
        return Intrinsics.LJFF(C2188811AlT.LIZIZ(sbLIZ), "aweme://drama/tab");
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        Bundle extras;
        C19EG c19eg;
        Object next;
        boolean z;
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        InterfaceC1577520r9a interfaceC1577520r9aLIZIZ;
        InterfaceC1577520r9a interfaceC1577520r9aLIZIZ2;
        InterfaceC1577520r9a interfaceC1577520r9aLIZIZ3;
        String strU31;
        String strCQ2;
        Activity activityLIZIZ;
        MainActivityScope mainActivityScopeLIZJ;
        HomeTabAbility homeTabAbilityLIZ;
        List listL32;
        Intent extra;
        String string6 = null;
        if (routeIntent != null && (extra = routeIntent.getExtra()) != null) {
            try {
                extras = extra.getExtras();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                extras = null;
            }
        } else {
            extras = null;
        }
        Activity activityLIZ = C2421209eE.LIZ();
        if (activityLIZ instanceof C19EG) {
            c19eg = (C19EG) activityLIZ;
        } else {
            c19eg = null;
        }
        if (c19eg != null && (mainActivityScopeLIZJ = C0S4U.LIZJ(c19eg)) != null && (homeTabAbilityLIZ = C0DMM.LIZ(mainActivityScopeLIZJ)) != null && (listL32 = homeTabAbilityLIZ.l32()) != null) {
            Iterator it2 = listL32.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(((InterfaceC1583870rJp) next).tag(), "Drama")) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
        } else {
            next = null;
        }
        if (next != null) {
            z = true;
        } else {
            z = false;
        }
        C1585070rLl c1585070rLl = C1585070rLl.LIZ;
        EnumC1584360rKc enumC1584360rKc = EnumC1584360rKc.SERIES;
        c1585070rLl.getClass();
        boolean zLJFF = C1585070rLl.LJFF(enumC1584360rKc, null);
        if (extras != null) {
            string = extras.getString("enter_from");
            string2 = extras.getString("enter_method");
            string3 = extras.getString("force_insert_id");
            string4 = extras.getString("fallback_url");
        } else {
            string = null;
            string2 = null;
            string3 = null;
            string4 = null;
        }
        if (!zLJFF && !z) {
            if (string4 != null && string4.length() != 0 && !Intrinsics.LJFF(string2, "deeplink")) {
                C844470XAv.LIZ.getClass();
                SmartRouter.buildRoute(C844470XAv.LIZ(), string4).open();
            } else {
                AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
                if (abstractC1387200mCcLJ != null) {
                    activityLIZIZ = abstractC1387200mCcLJ.LIZIZ();
                } else {
                    activityLIZIZ = null;
                }
                Intent mainActivityIntent = ((IMainService) ServiceManager.get().getService(IMainService.class)).getMainActivityIntent(activityLIZIZ);
                if (mainActivityIntent != null) {
                    mainActivityIntent.putExtra("extra_from_deeplink", true);
                    mainActivityIntent.setFlags(335544320);
                    mainActivityIntent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "HOME");
                    mainActivityIntent.putExtra("tab", EnumC1570580qyO.FOR_YOU.getValue());
                    mainActivityIntent.putExtra("need_post", true);
                    mainActivityIntent.putExtra(FollowStatusChangeMethod.PARAM_UID, string3);
                    mainActivityIntent.putExtra("gids", string3);
                    mainActivityIntent.putExtra("share_expose_sharer", true);
                    mainActivityIntent.putExtra("is_from_drama_tab_deeplink", true);
                } else {
                    mainActivityIntent = null;
                }
                if (activityLIZIZ != null) {
                    RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activityLIZIZ, mainActivityIntent, "Context_startActivity_1");
                    C1701330uNH.LIZ(mainActivityIntent, activityLIZIZ);
                    C2204961BRm.LJJJJJL(activityLIZIZ, mainActivityIntent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmtcZbLz3wnT83Or0K+a+VK+v2a1891saYcfJm9h4kF3gMuxbPE/GW5", null));
                    return true;
                }
            }
            return true;
        }
        if (c19eg != null) {
            TabChangeManager tabChangeManagerLIZ = C343710Ddh.LIZ(c19eg);
            ITabStrip iTabStrip = (ITabStrip) C1558520qew.LIZ(C1558360qeg.LJI(c19eg, null), ITabStrip.class, null);
            if (iTabStrip != null) {
                strU31 = iTabStrip.U31(false);
            } else {
                strU31 = null;
            }
            boolean zLJFF2 = Intrinsics.LJFF(strU31, "Drama");
            if (tabChangeManagerLIZ != null) {
                strCQ2 = tabChangeManagerLIZ.CQ2();
            } else {
                strCQ2 = null;
            }
            if (Intrinsics.LJFF(strCQ2, "HOME") && zLJFF2) {
                return true;
            }
        }
        if (extras != null) {
            string5 = extras.getString("force_insert_last_watch");
        } else {
            string5 = null;
        }
        boolean zLJFF3 = Intrinsics.LJFF(string5, "1");
        if (extras != null) {
            string6 = extras.getString("is_force_landing_picks");
        }
        boolean zLJFF4 = Intrinsics.LJFF(string6, "1");
        ISeriesFeedService iSeriesFeedServiceLIZIZ = C0RRR.LIZIZ();
        if (iSeriesFeedServiceLIZIZ != null && (interfaceC1577520r9aLIZIZ3 = iSeriesFeedServiceLIZIZ.LIZIZ()) != null) {
            interfaceC1577520r9aLIZIZ3.LJIIIZ(string, string2);
        }
        ISeriesFeedService iSeriesFeedServiceLIZIZ2 = C0RRR.LIZIZ();
        if (iSeriesFeedServiceLIZIZ2 != null && (interfaceC1577520r9aLIZIZ2 = iSeriesFeedServiceLIZIZ2.LIZIZ()) != null) {
            interfaceC1577520r9aLIZIZ2.LJIIJ(string3, zLJFF3);
        }
        ISeriesFeedService iSeriesFeedServiceLIZIZ3 = C0RRR.LIZIZ();
        if (iSeriesFeedServiceLIZIZ3 != null && (interfaceC1577520r9aLIZIZ = iSeriesFeedServiceLIZIZ3.LIZIZ()) != null) {
            interfaceC1577520r9aLIZIZ.LJIIL(zLJFF4);
        }
        C844470XAv.LIZ.getClass();
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(C844470XAv.LIZ(), "//main");
        smartRouteBuildRoute.addFlags(67108864);
        smartRouteBuildRoute.withParam("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "HOME");
        smartRouteBuildRoute.withParam("tab", EnumC1570580qyO.DRAMA_TAB.getValue());
        smartRouteBuildRoute.open();
        return true;
    }
}
