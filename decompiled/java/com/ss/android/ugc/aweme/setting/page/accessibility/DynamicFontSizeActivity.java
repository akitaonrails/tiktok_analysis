package com.ss.android.ugc.aweme.setting.page.accessibility;

import X.C1308910kAL;
import X.C1697810uHb;
import X.C19EH;
import X.C299020Bno;
import X.C335910DEv;
import X.EnumC335920DEw;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS232S0000000_4;

/* JADX INFO: loaded from: classes5.dex */
public final class DynamicFontSizeActivity extends BaseActivity {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYpPTs6JiJiOS40LWHELIOSstKiw2OzYlKyY/ITE1ZwsqJiQhICwVJys4GiYpLQQvPSYlITE1";
    public DynamicFontSizeFragment LL;

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.setting.page.accessibility.DynamicFontSizeActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.setting.page.accessibility.DynamicFontSizeActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.setting.page.accessibility.DynamicFontSizeActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.setting.page.accessibility.DynamicFontSizeActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.setting.page.accessibility.DynamicFontSizeActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStop() {
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        try {
            getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        DynamicFontSizeFragment dynamicFontSizeFragment;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.setting.page.accessibility.DynamicFontSizeActivity", "onCreate", true);
        activityConfiguration(AFwS232S0000000_4.get$arr$(63));
        super.onCreate(bundle);
        setTheme(R.style.my);
        setContentView(R.layout.f6l);
        Fragment fragmentLJJJJZI = getSupportFragmentManager().LJJJJZI("dynamic_font_size_fragment");
        if (!(fragmentLJJJJZI instanceof DynamicFontSizeFragment) || (dynamicFontSizeFragment = (DynamicFontSizeFragment) fragmentLJJJJZI) == null) {
            dynamicFontSizeFragment = new DynamicFontSizeFragment();
        }
        this.LL = dynamicFontSizeFragment;
        Bundle bundle2 = new Bundle();
        DynamicFontSizeFragment dynamicFontSizeFragment2 = this.LL;
        if (dynamicFontSizeFragment2 == null) {
            dynamicFontSizeFragment2 = null;
        }
        dynamicFontSizeFragment2.setArguments(bundle2);
        DynamicFontSizeFragment dynamicFontSizeFragment3 = this.LL;
        if (dynamicFontSizeFragment3 == null) {
            dynamicFontSizeFragment3 = null;
        }
        if (!dynamicFontSizeFragment3.isAdded()) {
            C19EH c19ehLJIIJ = getSupportFragmentManager().LJIIJ();
            DynamicFontSizeFragment dynamicFontSizeFragment4 = this.LL;
            if (dynamicFontSizeFragment4 == null) {
                dynamicFontSizeFragment4 = null;
            }
            c19ehLJIIJ.LIZJ(R.id.iiv, dynamicFontSizeFragment4, "dynamic_font_size_fragment");
            c19ehLJIIJ.LJII(null);
            c19ehLJIIJ.LJIIJ();
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.setting.page.accessibility.DynamicFontSizeActivity", "onCreate", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        boolean z;
        super.setTheme(i);
        if (C299020Bno.LIZ() != 0) {
            boolean z2 = false;
            if (!C1697810uHb.LJIIJJI(Integer.valueOf(R.style.a9t), Integer.valueOf(R.style.a9u), Integer.valueOf(R.style.a9v), Integer.valueOf(R.style.a9s)).contains(Integer.valueOf(i))) {
                Integer numLIZ = C1308910kAL.LIZ(R.attr.g0c, this);
                if (numLIZ != null && numLIZ.intValue() == -1) {
                    z = true;
                } else {
                    z = false;
                }
                Integer numLIZ2 = C1308910kAL.LIZ(R.attr.g0d, this);
                if (numLIZ2 == null || numLIZ2.intValue() != 0) {
                    z2 = true;
                }
                if (z) {
                    getTheme().applyStyle(R.style.a9u, true);
                } else {
                    getTheme().applyStyle(R.style.a9t, true);
                }
                if (z2) {
                    getTheme().applyStyle(R.style.a9v, true);
                } else {
                    getTheme().applyStyle(R.style.a9s, true);
                }
            }
        }
        EnumC335920DEw enumC335920DEwLIZ = C335910DEv.LIZ();
        if (enumC335920DEwLIZ == EnumC335920DEw.V1) {
            getTheme().applyStyle(R.style.a9x, true);
        } else {
            if (enumC335920DEwLIZ != EnumC335920DEw.V2) {
                return;
            }
            getTheme().applyStyle(R.style.a9y, true);
        }
    }
}
