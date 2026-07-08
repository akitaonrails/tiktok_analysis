package com.bytedance.router.monitor;

import X.AbstractC813200VvC;
import X.C19EG;
import X.EnumC682280QpW;
import X.InterfaceC1563380qmm;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.router.monitor.Constants;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes33.dex */
public final class MonitorFragmentLifecycleCallback extends AbstractC813200VvC {
    public final C19EG activity;

    public MonitorFragmentLifecycleCallback(C19EG c19eg) {
        this.activity = c19eg;
    }

    public static String INVOKEVIRTUAL_com_bytedance_router_monitor_MonitorFragmentLifecycleCallback_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public final void reportFragmentPageJump(Fragment fragment, C19EG c19eg) {
        try {
            RouterMonitor routerMonitor = RouterMonitor.INSTANCE;
            String name = fragment.getClass().getName();
            Intent intent = c19eg.getIntent();
            Constants.Companion companion = Constants.Companion;
            routerMonitor.reportPageJump(name, intent.getBooleanExtra(companion.getKEY_ROUTER_JUMP_MARK(), false), INVOKEVIRTUAL_com_bytedance_router_monitor_MonitorFragmentLifecycleCallback_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(c19eg.getIntent(), companion.getKEY_CATEGORY_ROUTE_HOST_PATH()));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void INVOKESPECIAL_com_bytedance_router_monitor_MonitorFragmentLifecycleCallback_com_ss_android_ugc_aweme_main_lancet_KtSafLancet_reportFragmentPageJump(MonitorFragmentLifecycleCallback monitorFragmentLifecycleCallback, Fragment fragment, C19EG c19eg) {
        if (c19eg instanceof InterfaceC1563380qmm) {
            InterfaceC1563380qmm interfaceC1563380qmm = (InterfaceC1563380qmm) c19eg;
            EnumC682280QpW enumC682280QpW = EnumC682280QpW.GET_INTENT;
            Boolean boolLLFF = interfaceC1563380qmm.LLFF(enumC682280QpW);
            monitorFragmentLifecycleCallback.reportFragmentPageJump(fragment, c19eg);
            interfaceC1563380qmm.LLJILJILJ(enumC682280QpW, boolLLFF);
            return;
        }
        monitorFragmentLifecycleCallback.reportFragmentPageJump(fragment, c19eg);
    }

    @Override // X.AbstractC813200VvC
    public void onFragmentCreated(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        super.onFragmentCreated(fragmentManager, fragment, bundle);
        INVOKESPECIAL_com_bytedance_router_monitor_MonitorFragmentLifecycleCallback_com_ss_android_ugc_aweme_main_lancet_KtSafLancet_reportFragmentPageJump(this, fragment, this.activity);
    }
}
