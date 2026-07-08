package com.ss.android.ugc.trill.main.shortcut;

import X.C1308910kAL;
import X.C1697810uHb;
import X.C299020Bno;
import X.C335910DEv;
import X.C580810MqF;
import X.EnumC335920DEw;
import android.os.Bundle;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes5.dex */
public class ShortcutShootingActivity extends BaseActivity {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZjE+ICM/ZigtICF9OyHELIOS0jOzswPTFiGic8OjEvPDsAICojPSY9LwQvPSYlITE1";

    public void com_ss_android_ugc_trill_main_shortcut_ShortcutShootingActivity__onStop$___twin___() {
        super.onStop();
    }

    public void com_ss_android_ugc_trill_main_shortcut_ShortcutShootingActivity__setTheme$___twin___(int i) {
        super.setTheme(i);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public void onCreate(Bundle bundle) {
        ActivityAgent.onTrace("com.ss.android.ugc.trill.main.shortcut.ShortcutShootingActivity", "onCreate", true);
        super.onCreate(bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.trill.main.shortcut.ShortcutShootingActivity", "onCreate", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.trill.main.shortcut.ShortcutShootingActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.trill.main.shortcut.ShortcutShootingActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.trill.main.shortcut.ShortcutShootingActivity", "onStart", true);
        super.onStart();
        ((IExternalService) ServiceManager.get().getService(IExternalService.class)).asyncServiceWithActivity(this, "shortcut", new C580810MqF(this, 4));
        ActivityAgent.onTrace("com.ss.android.ugc.trill.main.shortcut.ShortcutShootingActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public void onStop() {
        com_ss_android_ugc_trill_main_shortcut_ShortcutShootingActivity_com_ss_android_ugc_aweme_lancet_ActivityEnterTransitionCoordinatorLancet_onStop(this);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.trill.main.shortcut.ShortcutShootingActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        com_ss_android_ugc_trill_main_shortcut_ShortcutShootingActivity_com_ss_android_ugc_aweme_tux_business_lancet_ThemeLancet_setTheme(this, i);
    }

    public static void com_ss_android_ugc_trill_main_shortcut_ShortcutShootingActivity_com_bytedance_sysoptimizer_EnterTransitionLancet_onStop(ShortcutShootingActivity shortcutShootingActivity) {
        shortcutShootingActivity.com_ss_android_ugc_trill_main_shortcut_ShortcutShootingActivity__onStop$___twin___();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            try {
                shortcutShootingActivity.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public static void com_ss_android_ugc_trill_main_shortcut_ShortcutShootingActivity_com_ss_android_ugc_aweme_lancet_ActivityEnterTransitionCoordinatorLancet_onStop(ShortcutShootingActivity shortcutShootingActivity) {
        com_ss_android_ugc_trill_main_shortcut_ShortcutShootingActivity_com_bytedance_sysoptimizer_EnterTransitionLancet_onStop(shortcutShootingActivity);
        try {
            shortcutShootingActivity.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static void com_ss_android_ugc_trill_main_shortcut_ShortcutShootingActivity_com_ss_android_ugc_aweme_tux_business_lancet_ThemeLancet_setTheme(ShortcutShootingActivity shortcutShootingActivity, int i) {
        boolean z;
        shortcutShootingActivity.com_ss_android_ugc_trill_main_shortcut_ShortcutShootingActivity__setTheme$___twin___(i);
        if (C299020Bno.LIZ() != 0) {
            boolean z2 = false;
            if (!C1697810uHb.LJIIJJI(Integer.valueOf(R.style.a9t), Integer.valueOf(R.style.a9u), Integer.valueOf(R.style.a9v), Integer.valueOf(R.style.a9s)).contains(Integer.valueOf(i))) {
                Integer numLIZ = C1308910kAL.LIZ(R.attr.g0c, shortcutShootingActivity);
                if (numLIZ != null && numLIZ.intValue() == -1) {
                    z = true;
                } else {
                    z = false;
                }
                Integer numLIZ2 = C1308910kAL.LIZ(R.attr.g0d, shortcutShootingActivity);
                if (numLIZ2 == null || numLIZ2.intValue() != 0) {
                    z2 = true;
                }
                if (z) {
                    shortcutShootingActivity.getTheme().applyStyle(R.style.a9u, true);
                } else {
                    shortcutShootingActivity.getTheme().applyStyle(R.style.a9t, true);
                }
                if (z2) {
                    shortcutShootingActivity.getTheme().applyStyle(R.style.a9v, true);
                } else {
                    shortcutShootingActivity.getTheme().applyStyle(R.style.a9s, true);
                }
            }
        }
        EnumC335920DEw enumC335920DEwLIZ = C335910DEv.LIZ();
        if (enumC335920DEwLIZ == EnumC335920DEw.V1) {
            shortcutShootingActivity.getTheme().applyStyle(R.style.a9x, true);
        } else {
            if (enumC335920DEwLIZ != EnumC335920DEw.V2) {
                return;
            }
            shortcutShootingActivity.getTheme().applyStyle(R.style.a9y, true);
        }
    }
}
