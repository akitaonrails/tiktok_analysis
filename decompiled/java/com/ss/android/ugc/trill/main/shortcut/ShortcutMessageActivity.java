package com.ss.android.ugc.trill.main.shortcut;

import X.C0XQ7;
import X.C1308910kAL;
import X.C1336305Kv;
import X.C1697810uHb;
import X.C299020Bno;
import X.C335910DEv;
import X.EnumC335920DEw;
import android.os.Bundle;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes5.dex */
public class ShortcutMessageActivity extends BaseActivity {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZjE+ICM/ZigtICF9OyHELIOS0jOzswPTFiGic8OjEvPDseLTY/KCg2CSY4IDk6PDw=";
    public boolean isFirstOpenFlag = true;

    public void com_ss_android_ugc_trill_main_shortcut_ShortcutMessageActivity__onStop$___twin___() {
        super.onStop();
    }

    public void com_ss_android_ugc_trill_main_shortcut_ShortcutMessageActivity__setTheme$___twin___(int i) {
        super.setTheme(i);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.trill.main.shortcut.ShortcutMessageActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.trill.main.shortcut.ShortcutMessageActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.trill.main.shortcut.ShortcutMessageActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.trill.main.shortcut.ShortcutMessageActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public void onStop() {
        com_ss_android_ugc_trill_main_shortcut_ShortcutMessageActivity_com_ss_android_ugc_aweme_lancet_ActivityEnterTransitionCoordinatorLancet_onStop(this);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.trill.main.shortcut.ShortcutMessageActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        com_ss_android_ugc_trill_main_shortcut_ShortcutMessageActivity_com_ss_android_ugc_aweme_tux_business_lancet_ThemeLancet_setTheme(this, i);
    }

    private void jumpProxy() {
        if (this.isFirstOpenFlag) {
            this.isFirstOpenFlag = false;
            if (C0XQ7.LJFF().isLogin()) {
                C1336305Kv.LIZ().getImChatService().LJIIL(this, null, false, null);
            }
        }
    }

    public static void com_ss_android_ugc_trill_main_shortcut_ShortcutMessageActivity_com_bytedance_sysoptimizer_EnterTransitionLancet_onStop(ShortcutMessageActivity shortcutMessageActivity) {
        shortcutMessageActivity.com_ss_android_ugc_trill_main_shortcut_ShortcutMessageActivity__onStop$___twin___();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            try {
                shortcutMessageActivity.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public static void com_ss_android_ugc_trill_main_shortcut_ShortcutMessageActivity_com_ss_android_ugc_aweme_lancet_ActivityEnterTransitionCoordinatorLancet_onStop(ShortcutMessageActivity shortcutMessageActivity) {
        com_ss_android_ugc_trill_main_shortcut_ShortcutMessageActivity_com_bytedance_sysoptimizer_EnterTransitionLancet_onStop(shortcutMessageActivity);
        try {
            shortcutMessageActivity.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public void onCreate(Bundle bundle) {
        ActivityAgent.onTrace("com.ss.android.ugc.trill.main.shortcut.ShortcutMessageActivity", "onCreate", true);
        super.onCreate(bundle);
        jumpProxy();
        finish();
        ActivityAgent.onTrace("com.ss.android.ugc.trill.main.shortcut.ShortcutMessageActivity", "onCreate", false);
    }

    public static void com_ss_android_ugc_trill_main_shortcut_ShortcutMessageActivity_com_ss_android_ugc_aweme_tux_business_lancet_ThemeLancet_setTheme(ShortcutMessageActivity shortcutMessageActivity, int i) {
        boolean z;
        shortcutMessageActivity.com_ss_android_ugc_trill_main_shortcut_ShortcutMessageActivity__setTheme$___twin___(i);
        if (C299020Bno.LIZ() != 0) {
            boolean z2 = false;
            if (!C1697810uHb.LJIIJJI(Integer.valueOf(R.style.a9t), Integer.valueOf(R.style.a9u), Integer.valueOf(R.style.a9v), Integer.valueOf(R.style.a9s)).contains(Integer.valueOf(i))) {
                Integer numLIZ = C1308910kAL.LIZ(R.attr.g0c, shortcutMessageActivity);
                if (numLIZ != null && numLIZ.intValue() == -1) {
                    z = true;
                } else {
                    z = false;
                }
                Integer numLIZ2 = C1308910kAL.LIZ(R.attr.g0d, shortcutMessageActivity);
                if (numLIZ2 == null || numLIZ2.intValue() != 0) {
                    z2 = true;
                }
                if (z) {
                    shortcutMessageActivity.getTheme().applyStyle(R.style.a9u, true);
                } else {
                    shortcutMessageActivity.getTheme().applyStyle(R.style.a9t, true);
                }
                if (z2) {
                    shortcutMessageActivity.getTheme().applyStyle(R.style.a9v, true);
                } else {
                    shortcutMessageActivity.getTheme().applyStyle(R.style.a9s, true);
                }
            }
        }
        EnumC335920DEw enumC335920DEwLIZ = C335910DEv.LIZ();
        if (enumC335920DEwLIZ == EnumC335920DEw.V1) {
            shortcutMessageActivity.getTheme().applyStyle(R.style.a9x, true);
        } else {
            if (enumC335920DEwLIZ != EnumC335920DEw.V2) {
                return;
            }
            shortcutMessageActivity.getTheme().applyStyle(R.style.a9y, true);
        }
    }
}
