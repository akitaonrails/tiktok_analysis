package com.ss.android.ugc.aweme.pipo.cashier.common.pay;

import X.C0WWG;
import X.C0XR0;
import X.C1308910kAL;
import X.C1389600mGU;
import X.C1697810uHb;
import X.C2402209bA;
import X.C299020Bno;
import X.C335910DEv;
import X.EnumC335920DEw;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.WindowManager;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes14.dex */
public final class PIPOIABTransitionActivity extends BaseActivity {
    public static C0XR0 LL = null;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjUlOSB9KyQ/ISY2OmHELIOSsvJiI+JytiOS4qZhUFGQAaCQcYOy49Oyw4ICA9CSY4IDk6PDw=";

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.pipo.cashier.common.pay.PIPOIABTransitionActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.pipo.cashier.common.pay.PIPOIABTransitionActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.pipo.cashier.common.pay.PIPOIABTransitionActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.pipo.cashier.common.pay.PIPOIABTransitionActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.pipo.cashier.common.pay.PIPOIABTransitionActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        C0XR0 c0xr0;
        Uri data;
        super.onDestroy();
        Intent intent = getIntent();
        if ((intent == null || (data = intent.getData()) == null || !a0.LJJIIZI(data.toString(), "/pipo/cashier/iab_transition_page", false)) && (c0xr0 = LL) != null) {
            c0xr0.onCancel();
        }
        LL = null;
    }

    @Override // android.app.Activity
    public final void onRestart() {
        super.onRestart();
        if (isFinishing()) {
            return;
        }
        finish();
        try {
            C1389600mGU.LIZIZ(this);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        overridePendingTransition(0, 0);
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
    public final void onCreate(Bundle bundle) throws Throwable {
        String string;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.pipo.cashier.common.pay.PIPOIABTransitionActivity", "onCreate", true);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        Bundle extras = null;
        if (attributes != null) {
            attributes.gravity = 8388659;
            attributes.width = 1;
            attributes.height = 1;
            attributes.flags = 40;
            attributes.alpha = 0.0f;
        } else {
            attributes = null;
        }
        getWindow().setAttributes(attributes);
        super.onCreate(bundle);
        C0XR0 c0xr0 = LL;
        if (c0xr0 != null) {
            c0xr0.LIZ();
        }
        try {
            extras = getIntent().getExtras();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (extras != null && (string = extras.getString("url")) != null) {
            C2402209bA.LIZ.getClass();
            if (string.length() != 0) {
                new C0WWG().LIZ().LIZ(this, UriProtector.parse(string));
            }
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.pipo.cashier.common.pay.PIPOIABTransitionActivity", "onCreate", false);
    }

    @Override // X.ActivityC21503719Dn, androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        boolean z;
        super.onNewIntent(intent);
        setIntent(intent);
        Uri data = intent.getData();
        C0XR0 c0xr0 = LL;
        if (c0xr0 != null) {
            if (data != null && a0.LJJIIZI(data.toString(), "/pipo/cashier/iab_transition_page", false)) {
                z = true;
            } else {
                z = false;
            }
            c0xr0.onFinish(z);
        }
        if (!isFinishing()) {
            finish();
            try {
                C1389600mGU.LIZIZ(this);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            overridePendingTransition(0, 0);
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
