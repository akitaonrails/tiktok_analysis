package com.ss.android.ugc.aweme.setting.ui;

import X.C0OM1;
import X.C1237450iJ5;
import X.C1308910kAL;
import X.C1389600mGU;
import X.C1697810uHb;
import X.C19EH;
import X.C2277881EDy;
import X.C299020Bno;
import X.C335910DEv;
import X.C786410Ut5;
import X.C824390WVp;
import X.EnumC335920DEw;
import android.os.Bundle;
import android.view.KeyEvent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.immersionbar.ImmersionBar;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.system.TuxImmersionBar;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS232S0000000_4;
import kotlin.jvm.internal.AwS548S0100000_4;

/* JADX INFO: loaded from: classes5.dex */
public final class PushSettingNotificationChoiceActivity extends BaseActivity {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYpPTs6JiJiPCZ9GDHELIOSA/IRw2PDElJygdJzElLyYwKTElJiEQIColKioSKzElPyYnMQ==";
    public TuxNavBar LL;

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.setting.ui.PushSettingNotificationChoiceActivity", "onResume", true);
        super.onResume();
        if (!C824390WVp.LIZJ(this)) {
            finish();
            try {
                C1389600mGU.LIZIZ(this);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            overridePendingTransition(0, 0);
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.setting.ui.PushSettingNotificationChoiceActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.setting.ui.PushSettingNotificationChoiceActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.setting.ui.PushSettingNotificationChoiceActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.setting.ui.PushSettingNotificationChoiceActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final TuxNavBar LLLLLZL() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.y1z);
            this.LL = (TuxNavBar) callbackFindViewById;
        }
        return (TuxNavBar) callbackFindViewById;
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
        String stringExtra;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.setting.ui.PushSettingNotificationChoiceActivity", "onCreate", true);
        activityConfiguration(AFwS232S0000000_4.get$arr$(64));
        super.onCreate(bundle);
        setTheme(R.style.my);
        setContentView(R.layout.f67);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Fragment fragmentLJJJJZI = supportFragmentManager.LJJJJZI("FRAGMENT_PUSH_MANAGER_LIST");
        if (fragmentLJJJJZI == null) {
            fragmentLJJJJZI = C2277881EDy.LIZIZ.providePushSettingNotificationChoiceFragment();
        }
        Bundle bundle2 = new Bundle();
        try {
            stringExtra = getIntent().getStringExtra("enter_from");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            stringExtra = null;
        }
        C786410Ut5.LJJJI("enter_from", stringExtra, bundle2);
        fragmentLJJJJZI.setArguments(bundle2);
        C19EH c19ehLJIIJ = supportFragmentManager.LJIIJ();
        c19ehLJIIJ.LJIJ(R.id.iiv, fragmentLJJJJZI, "FRAGMENT_PUSH_MANAGER_LIST");
        c19ehLJIIJ.LJIIJ();
        TuxNavBar tuxNavBarLLLLLZL = LLLLLZL();
        C0OM1 c0om1 = new C0OM1();
        C1237450iJ5.LIZIZ(c0om1, getString(2131843185), new AwS548S0100000_4(this, 448));
        tuxNavBarLLLLLZL.setNavActions(c0om1);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zp, this);
        if (numLIZJ != null) {
            int iIntValue = numLIZJ.intValue();
            LLLLLZL().setNavBackground(iIntValue);
            LLLLLZL().LJIIZILJ(false);
            TuxImmersionBar tuxImmersionBar = new TuxImmersionBar(this, ImmersionBar.LJIILJJIL(this));
            tuxImmersionBar.LJIIIZ(iIntValue);
            tuxImmersionBar.LJFF(iIntValue);
            tuxImmersionBar.LIZ(true);
            tuxImmersionBar.LIZLLL();
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.setting.ui.PushSettingNotificationChoiceActivity", "onCreate", false);
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
