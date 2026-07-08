package com.ss.android.ugc.aweme.series.payment.activity;

import X.C01GW;
import X.C1250250idj;
import X.C1308910kAL;
import X.C1697810uHb;
import X.C197039127h;
import X.C299020Bno;
import X.C335910DEv;
import X.C452501pT;
import X.C786410Ut5;
import X.EnumC335920DEw;
import Y.ACListenerS139S0100000_4;
import android.os.Bundle;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS232S0000000_4;
import kotlin.jvm.internal.AwS548S0100000_4;

/* JADX INFO: loaded from: classes5.dex */
public final class SeriesRefundConfirmationActivity extends BaseActivity {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYpOyY2O2s8KDY+LSs4ZyHELIOS4wPCw6IDsqZhYpOyY2OxcpLzo9LAYjJyk6OigtPSY8JgQvPSYlITE1";
    public final C01GW LL = C452501pT.LIZIZ(new AwS548S0100000_4(this, 208));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS548S0100000_4(this, 207));

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.series.payment.activity.SeriesRefundConfirmationActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.series.payment.activity.SeriesRefundConfirmationActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.series.payment.activity.SeriesRefundConfirmationActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.series.payment.activity.SeriesRefundConfirmationActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.series.payment.activity.SeriesRefundConfirmationActivity", "onWindowFocusChanged", true);
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.series.payment.activity.SeriesRefundConfirmationActivity", "onCreate", true);
        activityConfiguration(AFwS232S0000000_4.get$arr$(62));
        super.onCreate(bundle);
        setContentView(R.layout.bhp);
        TuxNavBar tuxNavBar = (TuxNavBar) findViewById(R.id.pz1);
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = getResources().getString(2131847520);
        tuxNavBar.LJIJJ(c1250250idj);
        ((TextView) findViewById(R.id.t29)).setText((String) this.LL.getValue());
        ((TextView) findViewById(R.id.t2_)).setText((String) this.LLILLJJLI.getValue());
        C786410Ut5.U8((C197039127h) findViewById(R.id.pz0), new ACListenerS139S0100000_4(this, 47));
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.series.payment.activity.SeriesRefundConfirmationActivity", "onCreate", false);
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
