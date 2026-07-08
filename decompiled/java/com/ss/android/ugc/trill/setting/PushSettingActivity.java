package com.ss.android.ugc.trill.setting;

import X.AbstractActivityC20138213qu;
import X.AbstractC848400XPy;
import X.C0OM1;
import X.C0XQ7;
import X.C1237450iJ5;
import X.C1308910kAL;
import X.C1387640mDK;
import X.C1697810uHb;
import X.C19292910dr;
import X.C19318810i2;
import X.C19319810iC;
import X.C20684815ws;
import X.C299020Bno;
import X.C335910DEv;
import X.C736480Suk;
import X.EnumC335920DEw;
import X.InterfaceC20138413qw;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ACListenerS165S0100000_31;
import Y.AObjectS128S0000000_31;
import android.os.Bundle;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes32.dex */
@InterfaceC20138413qw(C1387640mDK.class)
public class PushSettingActivity extends AbstractActivityC20138213qu<C1387640mDK> implements View.OnClickListener {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZjE+ICM/ZjYpHELIOSPTs6JiJiGTogIBYpPTs6JiINKjs6Piw4MA==";
    public TuxNavBar LLILLJJLI;
    public C19318810i2 LLILLL;
    public C19292910dr LLILZ;
    public C19292910dr LLILZIL;
    public C19292910dr LLILZLL;

    @Override // X.AbstractActivityC20138213qu, com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.trill.setting.PushSettingActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.trill.setting.PushSettingActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.trill.setting.PushSettingActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.trill.setting.PushSettingActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.trill.setting.PushSettingActivity", "onWindowFocusChanged", true);
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

    public static C19319810iC LLLLLZL(C19319810iC c19319810iC) {
        return C19319810iC.LJJIJL(c19319810iC, !c19319810iC.LLJJIJIL, null, null, false, null, false, false, false, false, null, false, 131070);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        view.getId();
    }

    @Override // X.AbstractActivityC20138213qu, com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        ActivityAgent.onTrace("com.ss.android.ugc.trill.setting.PushSettingActivity", "onCreate", true);
        activityConfiguration(new AObjectS128S0000000_31(2));
        super.onCreate(bundle);
        setContentView(R.layout.jx);
        this.LLILLJJLI = (TuxNavBar) findViewById(R.id.y1z);
        this.LLILLL = new C19318810i2((ViewOnAttachStateChangeListenerC20604515jv) findViewById(R.id.rn0));
        TuxNavBar tuxNavBar = this.LLILLJJLI;
        C0OM1 c0om1 = new C0OM1();
        C1237450iJ5.LIZ(c0om1, getString(R.string.rps), this);
        tuxNavBar.setNavActions(c0om1);
        User curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
        if (curUser.getShieldFollowNotice() != 1) {
            z = true;
        } else {
            z = false;
        }
        this.LLILZ = new C19292910dr(new C19319810iC(getString(R.string.jq4), new ACListenerS165S0100000_31(this, 141), z));
        if (curUser.getShieldDiggNotice() != 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.LLILZIL = new C19292910dr(new C19319810iC(getString(2131836469), new ACListenerS165S0100000_31(this, 142), z2));
        if (curUser.getShieldCommentNotice() == 1) {
            z3 = false;
        }
        this.LLILZLL = new C19292910dr(new C19319810iC(getString(2131829179), new ACListenerS165S0100000_31(this, 143), z3));
        this.LLILLL.LIZ(this.LLILZ);
        this.LLILLL.LIZ(this.LLILZIL);
        this.LLILLL.LIZ(this.LLILZLL);
        ActivityAgent.onTrace("com.ss.android.ugc.trill.setting.PushSettingActivity", "onCreate", false);
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

    public final void LLLLZI(String str, boolean z) {
        String str2;
        C736480Suk c736480Suk = new C736480Suk();
        if (z) {
            str2 = "on";
        } else {
            str2 = "off";
        }
        c736480Suk.LIZ("to_status", str2);
        MobClick mobClickObtain = MobClick.obtain();
        mobClickObtain.setEventName("notification_switch");
        mobClickObtain.setLabelName(str);
        mobClickObtain.setJsonObject(c736480Suk.LIZIZ());
        C20684815ws.onEvent(mobClickObtain);
    }
}
