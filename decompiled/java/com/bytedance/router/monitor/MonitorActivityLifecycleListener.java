package com.bytedance.router.monitor;

import X.C19EG;
import X.EnumC682280QpW;
import X.InterfaceC1563380qmm;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.router.monitor.Constants;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes33.dex */
public final class MonitorActivityLifecycleListener implements Application.ActivityLifecycleCallbacks {
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityDestroyed(activity);
    }

    public final void reportActivityPageJump(Activity activity) {
        Intent intent = activity.getIntent();
        if (intent != null) {
            try {
                RouterMonitor routerMonitor = RouterMonitor.INSTANCE;
                String name = activity.getClass().getName();
                Constants.Companion companion = Constants.Companion;
                routerMonitor.reportPageJump(name, intent.getBooleanExtra(companion.getKEY_ROUTER_JUMP_MARK(), false), INVOKEVIRTUAL_com_bytedance_router_monitor_MonitorActivityLifecycleListener_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(intent, companion.getKEY_CATEGORY_ROUTE_HOST_PATH()));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void INVOKESPECIAL_com_bytedance_router_monitor_MonitorActivityLifecycleListener_com_ss_android_ugc_aweme_main_lancet_KtSafLancet_reportActivityPageJump(MonitorActivityLifecycleListener monitorActivityLifecycleListener, Activity activity) {
        if (activity instanceof InterfaceC1563380qmm) {
            InterfaceC1563380qmm interfaceC1563380qmm = (InterfaceC1563380qmm) activity;
            EnumC682280QpW enumC682280QpW = EnumC682280QpW.GET_INTENT;
            Boolean boolLLFF = interfaceC1563380qmm.LLFF(enumC682280QpW);
            monitorActivityLifecycleListener.reportActivityPageJump(activity);
            interfaceC1563380qmm.LLJILJILJ(enumC682280QpW, boolLLFF);
            return;
        }
        monitorActivityLifecycleListener.reportActivityPageJump(activity);
    }

    public static String INVOKEVIRTUAL_com_bytedance_router_monitor_MonitorActivityLifecycleListener_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityCreated(activity);
        INVOKESPECIAL_com_bytedance_router_monitor_MonitorActivityLifecycleListener_com_ss_android_ugc_aweme_main_lancet_KtSafLancet_reportActivityPageJump(this, activity);
        if (activity instanceof C19EG) {
            C19EG c19eg = (C19EG) activity;
            c19eg.getSupportFragmentManager().LJZL(new MonitorFragmentLifecycleCallback(c19eg), true);
        }
    }
}
