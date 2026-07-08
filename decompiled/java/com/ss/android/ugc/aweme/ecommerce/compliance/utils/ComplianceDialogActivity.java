package com.ss.android.ugc.aweme.ecommerce.compliance.utils;

import X.AbstractActivityC1743740vTg;
import X.C01GW;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1308910kAL;
import X.C1389600mGU;
import X.C1697810uHb;
import X.C1701330uNH;
import X.C189200o6;
import X.C197039127h;
import X.C23260099m;
import X.C299020Bno;
import X.C335910DEv;
import X.C338760DPu;
import X.C452501pT;
import X.EnumC335920DEw;
import android.app.Activity;
import android.content.Intent;
import android.view.KeyEvent;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS570S0100000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class ComplianceDialogActivity extends AbstractActivityC1743740vTg {
    public static C23260099m LLJJIJIL = null;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTcvLGEwJyg8HELIOSJSYyJiYpZzonISk/Zww8JTUgIC49KyAIIC4/JyINKjs6Piw4MA==";
    public ConstraintLayout LLILZIL;
    public LinearLayout LLILZLL;
    public TuxTextView LLIZ;
    public TuxTextView LLIZLLLIL;
    public TuxTextView LLJ;
    public TuxTextView LLJI;
    public C197039127h LLJIJIL;
    public C338760DPu LLJILJIL;
    public TuxIconView LLJILJILJ;
    public final C01GW LLJILLL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 610));
    public final C01GW LLJJ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 612));
    public final C01GW LLJJI = C452501pT.LIZIZ(new AwS570S0100000_26(this, 611));
    public int LLJJIII;
    public boolean LLJJIJI;
    public int LLJJIJIIJIL;

    @Override // X.ActivityC21503719Dn, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
    }

    @Override // X.AbstractActivityC1743740vTg, com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.compliance.utils.ComplianceDialogActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.compliance.utils.ComplianceDialogActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.compliance.utils.ComplianceDialogActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.compliance.utils.ComplianceDialogActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.compliance.utils.ComplianceDialogActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final C197039127h LLLLZLLIL() {
        KeyEvent.Callback callbackFindViewById = this.LLJIJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.enu);
            this.LLJIJIL = (C197039127h) callbackFindViewById;
        }
        return (C197039127h) callbackFindViewById;
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onPause() throws Throwable {
        int i;
        Activity activity;
        super.onPause();
        if (this.LLJJIJI || (i = this.LLJJIII) > 10) {
            return;
        }
        this.LLJJIII = i + 1;
        Intent intent = new Intent(this, (Class<?>) ComplianceDialogActivity.class);
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(this, intent, "Context_startActivity_1");
        C1701330uNH.LIZ(intent, this);
        C0WZX c0wzx = new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnunYepNpqoZjfA5k7w2/VR4V2syErHlkG8RPi7Og+S9c1HSjlAPN8AjuQ==", null);
        C0WST c0wst = new C0WST();
        Object[] objArr = {intent};
        C0WZW c0wzw = new C0WZW(false, "(Landroid/content/Intent;)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11098, "com/ss/android/ugc/aweme/ecommerce/compliance/utils/ComplianceDialogActivity", "startActivity", this, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11098, "com/ss/android/ugc/aweme/ecommerce/compliance/utils/ComplianceDialogActivity", "startActivity", null, objArr, this, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            activity = obj != null ? (Activity) obj : this;
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                intent = (Intent) obj2;
            }
        } else {
            activity = this;
        }
        activity.startActivity(intent);
        c0wst.LIZ(11098, "com/ss/android/ugc/aweme/ecommerce/compliance/utils/ComplianceDialogActivity", "startActivity", null, objArr, activity, c0wzw, true);
    }

    @Override // X.AbstractActivityC1743740vTg, com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity
    public final void finish() {
        int i;
        int i2;
        super.finish();
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        if (C1389600mGU.LIZIZ(this)) {
            i = 0;
            i2 = 0;
        } else {
            i = R.anim.b8;
            i2 = R.anim.b7;
        }
        overridePendingTransition(i, i2);
    }

    @Override // X.AbstractActivityC1743740vTg, com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        int i = this.LLJJIJIIJIL;
        C23260099m c23260099m = LLJJIJIL;
        if (c23260099m != null) {
            Integer numValueOf = Integer.valueOf(i);
            C189200o6.m2constructorimpl(numValueOf);
            c23260099m.resumeWith(numValueOf);
            LLJJIJIL = null;
        }
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

    /* JADX WARN: Removed duplicated region for block: B:102:0x0252  */
    @Override // X.AbstractActivityC1743740vTg, com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r18) {
        /*
            Method dump skipped, instruction units count: 668
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.compliance.utils.ComplianceDialogActivity.onCreate(android.os.Bundle):void");
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
