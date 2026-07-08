package com.ss.android.ugc.aweme.login.ui;

import X.C01GW;
import X.C1308910kAL;
import X.C1391850mK7;
import X.C1697810uHb;
import X.C1766570w4V;
import X.C1896207bk;
import X.C21566519ah;
import X.C21566919al;
import X.C299020Bno;
import X.C335910DEv;
import X.C452501pT;
import X.DialogInterfaceOnClickListenerC854600Xfm;
import X.EnumC335920DEw;
import android.os.Bundle;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS548S0100000_4;

/* JADX INFO: loaded from: classes14.dex */
public final class LogoutDialogActivity extends BaseActivity {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZikjHELIOSLiY9ZjAlZwM8Lyo5PQs6KSkjLg4wPCw6IDsq";
    public final C01GW LL = C452501pT.LIZIZ(new AwS548S0100000_4(this, 168));

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.login.ui.LogoutDialogActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.login.ui.LogoutDialogActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.login.ui.LogoutDialogActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.login.ui.LogoutDialogActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.login.ui.LogoutDialogActivity", "onWindowFocusChanged", true);
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
        String string;
        boolean zLJI = MethodIDManager.LJI(202389);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.login.ui.LogoutDialogActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.d_q);
        C21566919al c21566919al = new C21566919al(this);
        c21566919al.LIZIZ = getString(2131836793);
        String str = (String) this.LL.getValue();
        if (str != null && str.length() != 0) {
            string = (String) this.LL.getValue();
        } else {
            string = getString(2131836792);
        }
        c21566919al.LIZJ = string;
        c21566919al.LJIIJJI(new DialogInterfaceOnClickListenerC854600Xfm(this, 2), getString(2131830645), false);
        c21566919al.LJII = false;
        C21566519ah c21566519ah = new C21566519ah(c21566919al);
        C1391850mK7.LIZIZ(c21566519ah, "118");
        c21566519ah.LIZLLL();
        C1766570w4V c1766570w4V = C1766570w4V.LIZ;
        C1896207bk c1896207bk = new C1896207bk(this);
        c1766570w4V.getClass();
        C1766570w4V.LIZ(c1896207bk);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.login.ui.LogoutDialogActivity", "onCreate", false);
        if (zLJI) {
            MethodIDManager.LJ();
        }
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
