package com.ss.android.ugc.aweme.shortcut;

import X.C0W8Y;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C0XQ9;
import X.C1308910kAL;
import X.C1697810uHb;
import X.C1701330uNH;
import X.C19308310gL;
import X.C20684815ws;
import X.C2344009Gk;
import X.C299020Bno;
import X.C335910DEv;
import X.EnumC335920DEw;
import X.EnumC815990Vzh;
import X.InterfaceC1294060jmO;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouteSet;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.launcher.service.shortcut.IShortcutService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
@InterfaceC1294060jmO
public final class ShortcutProxyActivity extends BaseActivity {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYkJjHELIOS0nKzA4Zxw7Jzc4KjonGDcjMTYSKzElPyYnMQ==";
    public static final C0XQ9 Companion = new Object() { // from class: X.0XQ9
    };
    public static final int $stable = 8;

    public void com_ss_android_ugc_aweme_shortcut_ShortcutProxyActivity__onStop$___twin___() {
        super.onStop();
    }

    public void com_ss_android_ugc_aweme_shortcut_ShortcutProxyActivity__setTheme$___twin___(int i) {
        super.setTheme(i);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortcut.ShortcutProxyActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortcut.ShortcutProxyActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortcut.ShortcutProxyActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortcut.ShortcutProxyActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public void onStop() {
        com_ss_android_ugc_aweme_shortcut_ShortcutProxyActivity_com_ss_android_ugc_aweme_lancet_ActivityEnterTransitionCoordinatorLancet_onStop(this);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortcut.ShortcutProxyActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        com_ss_android_ugc_aweme_shortcut_ShortcutProxyActivity_com_ss_android_ugc_aweme_tux_business_lancet_ThemeLancet_setTheme(this, i);
    }

    private final void openShootingPage() {
        SmartRouteSet smartRouteSetBuildRoute = SmartRouteSet.Companion.buildRoute(this);
        smartRouteSetBuildRoute.addRoute(SmartRouter.buildRoute(this, "//main"));
        smartRouteSetBuildRoute.addRoute(SmartRouter.buildRoute(this, "//shortcut/shooting"));
        smartRouteSetBuildRoute.open();
    }

    private final void openMoneyGrowthPage() {
        String strINVOKEVIRTUAL_com_ss_android_ugc_aweme_shortcut_ShortcutProxyActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra = INVOKEVIRTUAL_com_ss_android_ugc_aweme_shortcut_ShortcutProxyActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(getIntent(), "open_url");
        C19308310gL.LJII.getClass();
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(this, "aweme://webview/");
        smartRouteBuildRoute.withParam("url", strINVOKEVIRTUAL_com_ss_android_ugc_aweme_shortcut_ShortcutProxyActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra);
        smartRouteBuildRoute.open();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "feed_popup");
        C20684815ws.LJIILLIIL("enter_activity_page", c2344009Gk.LIZ);
    }

    public static void com_ss_android_ugc_aweme_shortcut_ShortcutProxyActivity_com_bytedance_sysoptimizer_EnterTransitionLancet_onStop(ShortcutProxyActivity shortcutProxyActivity) {
        shortcutProxyActivity.com_ss_android_ugc_aweme_shortcut_ShortcutProxyActivity__onStop$___twin___();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            try {
                shortcutProxyActivity.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public static void com_ss_android_ugc_aweme_shortcut_ShortcutProxyActivity_com_ss_android_ugc_aweme_lancet_ActivityEnterTransitionCoordinatorLancet_onStop(ShortcutProxyActivity shortcutProxyActivity) {
        com_ss_android_ugc_aweme_shortcut_ShortcutProxyActivity_com_bytedance_sysoptimizer_EnterTransitionLancet_onStop(shortcutProxyActivity);
        try {
            shortcutProxyActivity.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    private final boolean needBlock(boolean z) throws Throwable {
        Class<?> clsLJIIIZ;
        if (z || (clsLJIIIZ = ((IShortcutService) ServiceManager.get().getService(IShortcutService.class)).LJIIIZ()) == null) {
            return false;
        }
        Intent intent = new Intent(this, clsLJIIIZ);
        intent.putExtra("type", INVOKEVIRTUAL_com_ss_android_ugc_aweme_shortcut_ShortcutProxyActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(getIntent(), "type"));
        intent.putExtra("open_url", INVOKEVIRTUAL_com_ss_android_ugc_aweme_shortcut_ShortcutProxyActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(getIntent(), "open_url"));
        INVOKEVIRTUAL_com_ss_android_ugc_aweme_shortcut_ShortcutProxyActivity_com_bytedance_router_monitor_page_PageLancet_startActivity(this, intent);
        return true;
    }

    private final void openNormalPage(String str) {
        SmartRouter.buildRoute(this, str).open();
    }

    private final void openPage(String str) {
        if (Intrinsics.LJFF(str, EnumC815990Vzh.WILL_GET_MOST.getShortcutId())) {
            openMoneyGrowthPage();
            return;
        }
        if (Intrinsics.LJFF(str, EnumC815990Vzh.WITHDRAWAL.getShortcutId())) {
            openMoneyGrowthPage();
        } else if (Intrinsics.LJFF(str, EnumC815990Vzh.NOTIFICATION.getShortcutId())) {
            openNormalPage("//shortcut/message");
        } else {
            if (!Intrinsics.LJFF(str, EnumC815990Vzh.SHOOTING.getShortcutId())) {
                return;
            }
            openShootingPage();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public void onCreate(Bundle bundle) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortcut.ShortcutProxyActivity", "onCreate", true);
        super.onCreate(bundle);
        boolean booleanExtra = getIntent().getBooleanExtra("from_live_block_dialog", false);
        String strINVOKEVIRTUAL_com_ss_android_ugc_aweme_shortcut_ShortcutProxyActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra = INVOKEVIRTUAL_com_ss_android_ugc_aweme_shortcut_ShortcutProxyActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(getIntent(), "type");
        if (strINVOKEVIRTUAL_com_ss_android_ugc_aweme_shortcut_ShortcutProxyActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra == null) {
            strINVOKEVIRTUAL_com_ss_android_ugc_aweme_shortcut_ShortcutProxyActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra = "";
        }
        if (!booleanExtra) {
            C0W8Y.LIZ(strINVOKEVIRTUAL_com_ss_android_ugc_aweme_shortcut_ShortcutProxyActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra);
        }
        if (needBlock(booleanExtra)) {
            finish();
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortcut.ShortcutProxyActivity", "onCreate", false);
        } else {
            openPage(strINVOKEVIRTUAL_com_ss_android_ugc_aweme_shortcut_ShortcutProxyActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra);
            finish();
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortcut.ShortcutProxyActivity", "onCreate", false);
        }
    }

    public static void INVOKEVIRTUAL_com_ss_android_ugc_aweme_shortcut_ShortcutProxyActivity_com_bytedance_analytics_lancet_StartActivityLancet_startActivity(ShortcutProxyActivity shortcutProxyActivity, Intent intent) throws Throwable {
        Intent intent2 = intent;
        Activity activity = shortcutProxyActivity;
        C1701330uNH.LIZ(intent2, activity);
        C0WZX c0wzx = new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3a3yc6cYua47x8zyfa/u2XKJ4j6TNOSNsmlA==", null);
        C0WST c0wst = new C0WST();
        Object[] objArr = {intent2};
        C0WZW c0wzw = new C0WZW(false, "(Landroid/content/Intent;)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11098, "com/ss/android/ugc/aweme/shortcut/ShortcutProxyActivity", "startActivity", activity, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11098, "com/ss/android/ugc/aweme/shortcut/ShortcutProxyActivity", "startActivity", null, objArr, activity, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                activity = (Activity) obj;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                intent2 = (Intent) obj2;
            }
        }
        activity.startActivity(intent2);
        c0wst.LIZ(11098, "com/ss/android/ugc/aweme/shortcut/ShortcutProxyActivity", "startActivity", null, objArr, activity, c0wzw, true);
    }

    public static void INVOKEVIRTUAL_com_ss_android_ugc_aweme_shortcut_ShortcutProxyActivity_com_bytedance_router_monitor_page_PageLancet_startActivity(ShortcutProxyActivity shortcutProxyActivity, Intent intent) throws Throwable {
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(shortcutProxyActivity, intent, "Context_startActivity_1");
        INVOKEVIRTUAL_com_ss_android_ugc_aweme_shortcut_ShortcutProxyActivity_com_bytedance_analytics_lancet_StartActivityLancet_startActivity(shortcutProxyActivity, intent);
    }

    public static String INVOKEVIRTUAL_com_ss_android_ugc_aweme_shortcut_ShortcutProxyActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static void com_ss_android_ugc_aweme_shortcut_ShortcutProxyActivity_com_ss_android_ugc_aweme_tux_business_lancet_ThemeLancet_setTheme(ShortcutProxyActivity shortcutProxyActivity, int i) {
        boolean z;
        shortcutProxyActivity.com_ss_android_ugc_aweme_shortcut_ShortcutProxyActivity__setTheme$___twin___(i);
        if (C299020Bno.LIZ() != 0) {
            boolean z2 = false;
            if (!C1697810uHb.LJIIJJI(Integer.valueOf(R.style.a9t), Integer.valueOf(R.style.a9u), Integer.valueOf(R.style.a9v), Integer.valueOf(R.style.a9s)).contains(Integer.valueOf(i))) {
                Integer numLIZ = C1308910kAL.LIZ(R.attr.g0c, shortcutProxyActivity);
                if (numLIZ != null && numLIZ.intValue() == -1) {
                    z = true;
                } else {
                    z = false;
                }
                Integer numLIZ2 = C1308910kAL.LIZ(R.attr.g0d, shortcutProxyActivity);
                if (numLIZ2 == null || numLIZ2.intValue() != 0) {
                    z2 = true;
                }
                if (z) {
                    shortcutProxyActivity.getTheme().applyStyle(R.style.a9u, true);
                } else {
                    shortcutProxyActivity.getTheme().applyStyle(R.style.a9t, true);
                }
                if (z2) {
                    shortcutProxyActivity.getTheme().applyStyle(R.style.a9v, true);
                } else {
                    shortcutProxyActivity.getTheme().applyStyle(R.style.a9s, true);
                }
            }
        }
        EnumC335920DEw enumC335920DEwLIZ = C335910DEv.LIZ();
        if (enumC335920DEwLIZ == EnumC335920DEw.V1) {
            shortcutProxyActivity.getTheme().applyStyle(R.style.a9x, true);
        } else {
            if (enumC335920DEwLIZ != EnumC335920DEw.V2) {
                return;
            }
            shortcutProxyActivity.getTheme().applyStyle(R.style.a9y, true);
        }
    }
}
