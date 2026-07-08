package com.ss.android.ugc.aweme.passkey;

import X.C0WWG;
import X.C0WZX;
import X.C1308910kAL;
import X.C1389600mGU;
import X.C1697810uHb;
import X.C1701330uNH;
import X.C2204961BRm;
import X.C2429209fW;
import X.C299020Bno;
import X.C335910DEv;
import X.C821630WKz;
import X.EnumC335920DEw;
import X.InterfaceC848670XQz;
import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes14.dex */
public final class AdActTransitionActivity extends BaseActivity {
    public static InterfaceC848670XQz LL = null;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjUtOjHELIOSw4LTxiCCsSKzEYOy49Oyw4ICA9CSY4IDk6PDw=";

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.passkey.AdActTransitionActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.passkey.AdActTransitionActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.passkey.AdActTransitionActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.passkey.AdActTransitionActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.passkey.AdActTransitionActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        Bundle extras;
        String string;
        super.onDestroy();
        try {
            extras = getIntent().getExtras();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            extras = null;
        }
        InterfaceC848670XQz interfaceC848670XQz = LL;
        if (interfaceC848670XQz != null) {
            if (extras == null || (string = extras.getString("outer_url")) == null) {
                string = "";
            }
            interfaceC848670XQz.LJJJLIIL(string);
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
        Bundle extras;
        boolean z;
        Bundle extras2;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.passkey.AdActTransitionActivity", "onCreate", true);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
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
        InterfaceC848670XQz interfaceC848670XQz = LL;
        if (interfaceC848670XQz != null) {
            interfaceC848670XQz.LIZ();
        }
        try {
            extras2 = getIntent().getExtras();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (extras2 == null) {
            string = null;
        } else {
            string = extras2.getString("url");
        }
        try {
            extras = getIntent().getExtras();
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            extras = null;
        }
        if (extras != null && extras.getBoolean("supportCustomTabs")) {
            z = true;
        } else {
            z = false;
        }
        if (string != null) {
            if (!z) {
                C821630WKz.LIZ.getClass();
                try {
                    Intent intent = new Intent("android.intent.action.VIEW");
                    intent.setData(UriProtector.parse(string));
                    C2429209fW.LIZ().appendDataFlowId(intent, 1207967489);
                    RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(this, intent, "Context_startActivity_1");
                    C1701330uNH.LIZ(intent, this);
                    C2204961BRm.LJJJJJL(this, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPqpcIzF2StQLi5owmSiMi425w==", null));
                } catch (Exception e3) {
                    TryCatchGuardChecker.doCheck(e3);
                }
                ActivityAgent.onTrace("com.ss.android.ugc.aweme.passkey.AdActTransitionActivity", "onCreate", false);
                return;
            }
            C821630WKz.LIZ.getClass();
            if (string.length() != 0) {
                new C0WWG().LIZ().LIZ(this, UriProtector.parse(string));
            }
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.passkey.AdActTransitionActivity", "onCreate", false);
    }

    @Override // X.ActivityC21503719Dn, androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
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
