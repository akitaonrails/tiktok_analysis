package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.view;

import X.AbstractActivityC1743740vTg;
import X.C1308910kAL;
import X.C1389600mGU;
import X.C1697810uHb;
import X.C1725790v0j;
import X.C2188811AlT;
import X.C2341109Fh;
import X.C299020Bno;
import X.C335910DEv;
import X.C935403lA;
import X.EnumC335920DEw;
import X.InterfaceC935503lB;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.WindowManager;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes2.dex */
public final class PaymentTransitionActivity extends AbstractActivityC1743740vTg {
    public static InterfaceC935503lB LLILZIL = null;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTcvLGExKTYpZyAgHELIOSOGs8KDY+LSs4Zzk6LTJiGS4qJSAiPRshKSs/IDs6JysNKjs6Piw4MA==";

    static {
        new C935403lA();
    }

    @Override // X.AbstractActivityC1743740vTg, com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.base.osp.payment.view.PaymentTransitionActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.base.osp.payment.view.PaymentTransitionActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.base.osp.payment.view.PaymentTransitionActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.base.osp.payment.view.PaymentTransitionActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.base.osp.payment.view.PaymentTransitionActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void LLLLZLLIL() {
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("finishSelf: ");
        sbLIZ.append(isFinishing());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c2341109Fh.getClass();
        C2341109Fh.LIZ(strLIZIZ);
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

    @Override // X.AbstractActivityC1743740vTg, com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onDestroy: ");
        sbLIZ.append(getIntent().getData());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c2341109Fh.getClass();
        C2341109Fh.LIZ(strLIZIZ);
        super.onDestroy();
        Uri data = getIntent().getData();
        InterfaceC935503lB interfaceC935503lB = LLILZIL;
        if (interfaceC935503lB != null) {
            boolean z = false;
            if (data != null && a0.LJJIIZI(data.toString(), "/pipo/cashier/transition_page", false)) {
                z = true;
            }
            interfaceC935503lB.onFinish(z);
        }
        LLILZIL = null;
    }

    @Override // android.app.Activity
    public final void onRestart() {
        super.onRestart();
        LLLLZLLIL();
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

    @Override // X.AbstractActivityC1743740vTg, com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) throws Throwable {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.base.osp.payment.view.PaymentTransitionActivity", "onCreate", true);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        String string = null;
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
        InterfaceC935503lB interfaceC935503lB = LLILZIL;
        if (interfaceC935503lB != null) {
            interfaceC935503lB.LIZ();
        }
        try {
            Bundle extras = getIntent().getExtras();
            if (extras != null) {
                string = extras.getString("url");
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (string != null) {
            C1725790v0j.LIZ.getClass();
            C1725790v0j.LIZLLL(this, string, false);
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.base.osp.payment.view.PaymentTransitionActivity", "onCreate", false);
    }

    @Override // X.ActivityC21503719Dn, androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onNewIntent: ");
        sbLIZ.append(intent.getData());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c2341109Fh.getClass();
        C2341109Fh.LIZ(strLIZIZ);
        super.onNewIntent(intent);
        setIntent(intent);
        LLLLZLLIL();
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
