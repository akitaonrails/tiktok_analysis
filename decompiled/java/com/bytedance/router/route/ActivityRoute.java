package com.bytedance.router.route;

import X.C0WZX;
import X.C1701330uNH;
import X.C19EG;
import X.C19EH;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C786410Ut5;
import X.C838410Wul;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.router.FakeFragment;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.router.util.ContextExtensionKt;
import com.bytedance.router.util.Logger;

/* JADX INFO: loaded from: classes33.dex */
public class ActivityRoute extends SysComponentRoute {
    public static void INVOKEVIRTUAL_com_bytedance_router_route_ActivityRoute_com_bytedance_analytics_lancet_StartActivityLancet_startActivity(Context context, Intent intent) {
        C1701330uNH.LIZ(intent, context);
        C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEgAjS8/YVFkiQFyWaSvdY+nE7S4OZMgsUFX8omSHJaDM1aF/bA==", null));
    }

    public static void INVOKEVIRTUAL_com_bytedance_router_route_ActivityRoute_com_bytedance_router_monitor_page_PageLancet_startActivity(Context context, Intent intent) {
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
        INVOKEVIRTUAL_com_bytedance_router_route_ActivityRoute_com_bytedance_analytics_lancet_StartActivityLancet_startActivity(context, intent);
    }

    @Override // com.bytedance.router.route.SysComponentRoute
    public void openComponent(Context context, Intent intent) throws Throwable {
        Activity activity;
        RouteIntent routeIntent = getRouteIntent();
        if (routeIntent != null) {
            if (context != null && (activity = ContextExtensionKt.getActivity(context)) != null) {
                context = activity;
            }
            if (context instanceof Activity) {
                if (routeIntent.getAnimationBundle() == null) {
                    normalStart(context, routeIntent, intent);
                    return;
                } else {
                    activityCompatStart(context, routeIntent, intent);
                    return;
                }
            }
            applicationStart(context, routeIntent, intent);
        }
    }

    public static void INVOKEVIRTUAL_com_bytedance_router_route_ActivityRoute_com_bytedance_analytics_lancet_StartActivityLancet_startActivityForResult(Activity activity, Intent intent, int i) throws Throwable {
        C1701330uNH.LIZ(intent, activity);
        C2204961BRm.LJIIZILJ(i, activity, intent, new C0WZX("dzBzEgAjS8/YVFkiQFyWaSvdY+nE7S4OZMgsUFX8omSHJaDM1aF/bA==", null));
    }

    public static void INVOKEVIRTUAL_com_bytedance_router_route_ActivityRoute_com_bytedance_analytics_lancet_StartActivityLancet_startActivityForResultInFragment(Fragment fragment, Intent intent, int i) throws Throwable {
        C1701330uNH.LIZ(intent, fragment);
        C2204961BRm.LLJL(fragment, intent, i, new C0WZX("dzBzEgAjS8/YVFkiQFyWaSvdY+nE7S4OZMgsUFX8omSHJaDM1aF/bA==", null));
    }

    public static void INVOKEVIRTUAL_com_bytedance_router_route_ActivityRoute_com_bytedance_router_monitor_page_PageLancet_startActivityForResult(Activity activity, Intent intent, int i) throws Throwable {
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity, intent, "Activity_startActivityForResult_2");
        INVOKEVIRTUAL_com_bytedance_router_route_ActivityRoute_com_bytedance_analytics_lancet_StartActivityLancet_startActivityForResult(activity, intent, i);
    }

    private void activityCompatStart(Context context, RouteIntent routeIntent, Intent intent) throws Throwable {
        if (routeIntent != null) {
            if (routeIntent.getData() != null) {
                intent.setData(routeIntent.getData());
            }
            Bundle animationBundle = routeIntent.getAnimationBundle();
            C1701330uNH.LIZ(intent, context);
            C838410Wul.LJIIIIZZ(context, intent, animationBundle);
        }
    }

    private void applicationStart(Context context, RouteIntent routeIntent, Intent intent) {
        if (routeIntent.getData() != null) {
            intent.setData(routeIntent.getData());
        }
        intent.addFlags(268435456);
        INVOKEVIRTUAL_com_bytedance_router_route_ActivityRoute_com_bytedance_router_monitor_page_PageLancet_startActivity(context, intent);
        if (routeIntent.hasRequestCode()) {
            Logger.e("SmartRoute.open(int requestCode):the context must be Activity !!!");
        }
        if (routeIntent.getEnterAnim() != -1 || routeIntent.getExitAnim() != -1) {
            Logger.e("SmartRoute.withAnimation(int enterAnim, int exitAnim):the context must be Activity !!!");
        }
    }

    private void normalStart(Context context, RouteIntent routeIntent, Intent intent) throws Throwable {
        if (routeIntent.getData() != null) {
            intent.setData(routeIntent.getData());
        }
        if (routeIntent.hasRequestCode()) {
            Activity activity = (Activity) context;
            Fragment fragment = routeIntent.getFragment();
            if (fragment != null) {
                INVOKEVIRTUAL_com_bytedance_router_route_ActivityRoute_com_bytedance_analytics_lancet_StartActivityLancet_startActivityForResultInFragment(fragment, intent, routeIntent.getRequestCode());
            } else if (routeIntent.getOnActivityResultCallback() != null && (activity instanceof C19EG)) {
                FakeFragment fakeFragment = new FakeFragment();
                fakeFragment.setCallback(routeIntent.getOnActivityResultCallback());
                C19EH c19ehLJIIJ = ((C19EG) activity).getSupportFragmentManager().LJIIJ();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(System.currentTimeMillis());
                sbLIZ.append("");
                c19ehLJIIJ.LIZLLL(fakeFragment, C2188811AlT.LIZIZ(sbLIZ));
                c19ehLJIIJ.LJIIJJI();
                INVOKEVIRTUAL_com_bytedance_router_route_ActivityRoute_com_bytedance_analytics_lancet_StartActivityLancet_startActivityForResultInFragment(fakeFragment, intent, routeIntent.getRequestCode());
            } else {
                INVOKEVIRTUAL_com_bytedance_router_route_ActivityRoute_com_bytedance_router_monitor_page_PageLancet_startActivityForResult(activity, intent, routeIntent.getRequestCode());
            }
        } else {
            INVOKEVIRTUAL_com_bytedance_router_route_ActivityRoute_com_bytedance_router_monitor_page_PageLancet_startActivity(context, intent);
        }
        if (routeIntent.getEnterAnim() != -1 || routeIntent.getExitAnim() != -1) {
            C786410Ut5.ae(routeIntent.getEnterAnim(), (Activity) context, routeIntent.getExitAnim());
        }
    }

    public static void INVOKEVIRTUAL_com_bytedance_router_route_ActivityRoute_com_bytedance_analytics_lancet_StartActivityLancet_startActivityForResultInFragment(FakeFragment fakeFragment, Intent intent, int i) throws Throwable {
        C1701330uNH.LIZ(intent, fakeFragment);
        C2204961BRm.LLLLIIL(fakeFragment, intent, i, new C0WZX("dzBzEgAjS8/YVFkiQFyWaSvdY+nE7S4OZMgsUFX8omSHJaDM1aF/bA==", null));
    }
}
