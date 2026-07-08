package com.ss.android.ugc.aweme.ecommerce.mall.mixhome.mallentry.route;

import X.C0QSJ;
import X.C1400070mXN;
import X.C1558360qeg;
import X.C1976907ol;
import X.C19EG;
import X.C343710Ddh;
import X.C687700QyG;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class EcMallRouteInterceptor implements IInterceptor {
    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C1976907ol.LIZ(this, routeIntent);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        if (routeIntent != null && Intrinsics.LJFF(routeIntent.getHost(), "ec")) {
            if (Intrinsics.LJFF(routeIntent.getPath(), "/mall") || Intrinsics.LJFF(routeIntent.getPath(), "/fashion_mall")) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean LIZ(C19EG c19eg, String str) {
        Object ability;
        if (Intrinsics.LJFF(str, "SHOP_MALL")) {
            return Intrinsics.LJFF("SHOP_MALL", C343710Ddh.LIZ(c19eg).CQ2());
        }
        if (Intrinsics.LJFF(str, "Shop")) {
            if (!C1400070mXN.LIZ(c19eg)) {
                if (Intrinsics.LJFF(C343710Ddh.LIZ(c19eg).CQ2(), "HOME")) {
                    Object obj = null;
                    C0QSJ c0qsjLIZJ = C687700QyG.LIZJ(C1558360qeg.LJI(c19eg, null), MainActivityScope.class);
                    if (c0qsjLIZJ != null) {
                        ability = c0qsjLIZJ.getAbility(HomeViewPagerAbility.class);
                    } else {
                        ability = null;
                    }
                    if (ability instanceof HomeViewPagerAbility) {
                        obj = ability;
                    }
                    HomeViewPagerAbility homeViewPagerAbility = (HomeViewPagerAbility) obj;
                    if (homeViewPagerAbility != null && homeViewPagerAbility.gk1() == 42) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x03f8 A[EDGE_INSN: B:250:0x03f8->B:234:0x03f8 BREAK  A[LOOP:1: B:97:0x019e->B:232:0x03f1]] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b6  */
    @Override // com.bytedance.router.interceptor.IInterceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptRoute(android.content.Context r26, com.bytedance.router.RouteIntent r27) {
        /*
            Method dump skipped, instruction units count: 1030
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.mall.mixhome.mallentry.route.EcMallRouteInterceptor.onInterceptRoute(android.content.Context, com.bytedance.router.RouteIntent):boolean");
    }
}
