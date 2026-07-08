package com.ss.android.ugc.aweme.reducemotion;

import X.C098200Yq;
import X.C1389600mGU;
import X.C1607780rwO;
import X.C189200o6;
import X.C1976907ol;
import X.C2188811AlT;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.fragment.FragmentNavigationRouteIntent;
import com.bytedance.router.fragment.PushOp;
import com.bytedance.router.interceptor.IInterceptor;
import com.bytedance.router.saf.SAFRouteIntent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: loaded from: classes33.dex */
public final class ReduceMotionSmartRouteInterceptor implements IInterceptor {
    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C1976907ol.LIZ(this, routeIntent);
    }

    public static void LIZ(RouteIntent routeIntent) {
        Unit unit;
        if (routeIntent == null) {
            unit = null;
        } else {
            try {
                if (C1389600mGU.LIZ()) {
                    if (routeIntent instanceof FragmentNavigationRouteIntent) {
                        PushOp pushOp = ((FragmentNavigationRouteIntent) routeIntent).getPushOp();
                        if (pushOp != null) {
                            pushOp.setExitAnim(0);
                        }
                        PushOp pushOp2 = ((FragmentNavigationRouteIntent) routeIntent).getPushOp();
                        if (pushOp2 != null) {
                            pushOp2.setEnterAnim(0);
                        }
                        PushOp pushOp3 = ((FragmentNavigationRouteIntent) routeIntent).getPushOp();
                        if (pushOp3 != null) {
                            pushOp3.setPopExitAnim(0);
                        }
                        PushOp pushOp4 = ((FragmentNavigationRouteIntent) routeIntent).getPushOp();
                        if (pushOp4 != null) {
                            pushOp4.setPopEnterAnim(0);
                        }
                        Bundle animationBundle = ((FragmentNavigationRouteIntent) routeIntent).getAnimationBundle();
                        if (animationBundle != null) {
                            C1607780rwO.LIZ(animationBundle);
                        }
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("ReduceMotionSmartRouteInterceptor FragmentNavigationRouteIntent:");
                        sbLIZ.append(((FragmentNavigationRouteIntent) routeIntent).getPushOp());
                        C2188811AlT.LIZIZ(sbLIZ);
                    } else if (routeIntent instanceof SAFRouteIntent) {
                        ((SAFRouteIntent) routeIntent).setFinishAnim(new Pair<>(-1, -1));
                        Bundle animationBundle2 = ((SAFRouteIntent) routeIntent).getAnimationBundle();
                        if (animationBundle2 != null) {
                            C1607780rwO.LIZ(animationBundle2);
                        }
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("ReduceMotionSmartRouteInterceptor SAFRouteIntent: finishAnim:");
                        sbLIZ2.append(((SAFRouteIntent) routeIntent).getFinishAnim());
                        C2188811AlT.LIZIZ(sbLIZ2);
                    } else {
                        Bundle animationBundle3 = routeIntent.getAnimationBundle();
                        if (animationBundle3 != null) {
                            C1607780rwO.LIZ(animationBundle3);
                        }
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("ReduceMotionSmartRouteInterceptor Other: enterAnim:");
                        sbLIZ3.append(routeIntent.getEnterAnim());
                        sbLIZ3.append(" exitAnim:");
                        sbLIZ3.append(routeIntent.getExitAnim());
                        sbLIZ3.append(" animationBundle:");
                        sbLIZ3.append(routeIntent.getAnimationBundle());
                        C2188811AlT.LIZIZ(sbLIZ3);
                    }
                }
                unit = Unit.LIZ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return;
            }
        }
        C189200o6.m2constructorimpl(unit);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        LIZ(routeIntent);
        return false;
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        LIZ(routeIntent);
        return false;
    }
}
