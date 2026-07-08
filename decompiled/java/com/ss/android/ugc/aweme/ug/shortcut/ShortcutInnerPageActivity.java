package com.ss.android.ugc.aweme.ug.shortcut;

import X.C01GW;
import X.C1308910kAL;
import X.C1697810uHb;
import X.C299020Bno;
import X.C335910DEv;
import X.EnumC335920DEw;
import android.os.Bundle;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.IMainService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS232S0000000_4;

/* JADX INFO: loaded from: classes5.dex */
public final class ShortcutInnerPageActivity extends BaseActivity {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjArZzw7JzHELIOSc4KjonZhYkJj0nKzA4ACE9LTccKCg2CSY4IDk6PDw=";
    public final C01GW shortcutName$delegate = RouteArgExtension.INSTANCE.optionalArg(this, AFwS232S0000000_4.get$arr$(101), "shortcut_name", String.class);

    public void com_ss_android_ugc_aweme_ug_shortcut_ShortcutInnerPageActivity__onStop$___twin___() {
        super.onStop();
    }

    public void com_ss_android_ugc_aweme_ug_shortcut_ShortcutInnerPageActivity__setTheme$___twin___(int i) {
        super.setTheme(i);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ug.shortcut.ShortcutInnerPageActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ug.shortcut.ShortcutInnerPageActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ug.shortcut.ShortcutInnerPageActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ug.shortcut.ShortcutInnerPageActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public void onStop() {
        com_ss_android_ugc_aweme_ug_shortcut_ShortcutInnerPageActivity_com_ss_android_ugc_aweme_lancet_ActivityEnterTransitionCoordinatorLancet_onStop(this);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ug.shortcut.ShortcutInnerPageActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        com_ss_android_ugc_aweme_ug_shortcut_ShortcutInnerPageActivity_com_ss_android_ugc_aweme_tux_business_lancet_ThemeLancet_setTheme(this, i);
    }

    private final String getShortcutName() {
        return (String) this.shortcutName$delegate.getValue();
    }

    private final void processBusinessShortcut() {
        IMainService iMainService = (IMainService) PluggableExtentionKt.pluggableSpi$default(IMainService.class, false, false, false, 14, null);
        if (iMainService == null || !iMainService.isAppHot()) {
            SmartRouter.buildRoute(this, "//main").open();
        }
    }

    public static void com_ss_android_ugc_aweme_ug_shortcut_ShortcutInnerPageActivity_com_bytedance_sysoptimizer_EnterTransitionLancet_onStop(ShortcutInnerPageActivity shortcutInnerPageActivity) {
        shortcutInnerPageActivity.com_ss_android_ugc_aweme_ug_shortcut_ShortcutInnerPageActivity__onStop$___twin___();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            try {
                shortcutInnerPageActivity.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public static void com_ss_android_ugc_aweme_ug_shortcut_ShortcutInnerPageActivity_com_ss_android_ugc_aweme_lancet_ActivityEnterTransitionCoordinatorLancet_onStop(ShortcutInnerPageActivity shortcutInnerPageActivity) {
        com_ss_android_ugc_aweme_ug_shortcut_ShortcutInnerPageActivity_com_bytedance_sysoptimizer_EnterTransitionLancet_onStop(shortcutInnerPageActivity);
        try {
            shortcutInnerPageActivity.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public void onCreate(Bundle bundle) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ug.shortcut.ShortcutInnerPageActivity", "onCreate", true);
        super.onCreate(bundle);
        String shortcutName = getShortcutName();
        if (shortcutName != null && shortcutName.length() != 0) {
            processBusinessShortcut();
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.ug.shortcut.ShortcutInnerPageActivity", "onCreate", false);
        } else {
            SmartRouter.buildRoute(this, "//main").open();
            finish();
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.ug.shortcut.ShortcutInnerPageActivity", "onCreate", false);
        }
    }

    public static void com_ss_android_ugc_aweme_ug_shortcut_ShortcutInnerPageActivity_com_ss_android_ugc_aweme_tux_business_lancet_ThemeLancet_setTheme(ShortcutInnerPageActivity shortcutInnerPageActivity, int i) {
        boolean z;
        shortcutInnerPageActivity.com_ss_android_ugc_aweme_ug_shortcut_ShortcutInnerPageActivity__setTheme$___twin___(i);
        if (C299020Bno.LIZ() != 0) {
            boolean z2 = false;
            if (!C1697810uHb.LJIIJJI(Integer.valueOf(R.style.a9t), Integer.valueOf(R.style.a9u), Integer.valueOf(R.style.a9v), Integer.valueOf(R.style.a9s)).contains(Integer.valueOf(i))) {
                Integer numLIZ = C1308910kAL.LIZ(R.attr.g0c, shortcutInnerPageActivity);
                if (numLIZ != null && numLIZ.intValue() == -1) {
                    z = true;
                } else {
                    z = false;
                }
                Integer numLIZ2 = C1308910kAL.LIZ(R.attr.g0d, shortcutInnerPageActivity);
                if (numLIZ2 == null || numLIZ2.intValue() != 0) {
                    z2 = true;
                }
                if (z) {
                    shortcutInnerPageActivity.getTheme().applyStyle(R.style.a9u, true);
                } else {
                    shortcutInnerPageActivity.getTheme().applyStyle(R.style.a9t, true);
                }
                if (z2) {
                    shortcutInnerPageActivity.getTheme().applyStyle(R.style.a9v, true);
                } else {
                    shortcutInnerPageActivity.getTheme().applyStyle(R.style.a9s, true);
                }
            }
        }
        EnumC335920DEw enumC335920DEwLIZ = C335910DEv.LIZ();
        if (enumC335920DEwLIZ == EnumC335920DEw.V1) {
            shortcutInnerPageActivity.getTheme().applyStyle(R.style.a9x, true);
        } else {
            if (enumC335920DEwLIZ != EnumC335920DEw.V2) {
                return;
            }
            shortcutInnerPageActivity.getTheme().applyStyle(R.style.a9y, true);
        }
    }
}
