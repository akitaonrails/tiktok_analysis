package com.ss.android.ugc.aweme.account.login.twostep;

import X.C0OM1;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1239800iMs;
import X.C1239810iMt;
import X.C1239820iMu;
import X.C1239830iMv;
import X.C1239840iMw;
import X.C1239850iMx;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1266160j3O;
import X.C1308910kAL;
import X.C15O7;
import X.C1697810uHb;
import X.C1701330uNH;
import X.C2188811AlT;
import X.C299020Bno;
import X.C335910DEv;
import X.C852980XdA;
import X.C852990XdB;
import X.C960203pA;
import X.EnumC335920DEw;
import X.InterfaceC1239890iN1;
import X.InterfaceC1916090zxf;
import Y.ACallableS424S0100000_19;
import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewStub;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.account.verify.TransparentCodeVerificationActivity;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class TwoStepAuthActivity extends BaseActivity implements InterfaceC1239890iN1, InterfaceC1916090zxf {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiQvKiAmJjFiHELIOSJSA0IStiPTg8OzEpOWEHPyofPSojCTA4IQ4wPCw6IDsq";
    public TuxNavBar LL;
    public ViewStub LLILLJJLI;
    public ViewStub LLILLL;
    public C1239830iMv LLILZ;
    public int LLILZIL = -1;
    public String LLILZLL;
    public String LLIZ;
    public String LLIZLLLIL;
    public boolean LLJ;
    public C1239800iMs LLJI;

    @Override // X.InterfaceC1239890iN1
    public final void LLLII() {
    }

    @Override // X.InterfaceC1916090zxf
    public final boolean getCanCollectConsent() {
        return false;
    }

    @Override // X.ActivityC21503719Dn, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        this.LLJ = true;
        finish();
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity
    public final void finish() {
        if (this.LLJ) {
            C852980XdA.LIZ().LIZIZ(new C852990XdB(null, null, 0, "User left TwoStepAuthActivity before completing auth process"));
        }
        super.finish();
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        this.LLJI = null;
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
        Activity activity;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthActivity", "onCreate", true);
        activityConfiguration(AFwS257S0000000_19.get$arr$(50));
        String strLLLLLZL = LLLLLZL(getIntent(), "code");
        if (strLLLLLZL != null) {
            Intent intent = new Intent(this, (Class<?>) TransparentCodeVerificationActivity.class);
            intent.putExtra("code", strLLLLLZL);
            intent.putExtra("type", LLLLLZL(getIntent(), "type"));
            RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(this, intent, "Context_startActivity_1");
            C1701330uNH.LIZ(intent, this);
            C0WZX c0wzx = new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOurYJDb0ibECfF1owsk1rRolYszAemGlkmVPRjvqltq7tF2TpI4p0M0", null);
            C0WST c0wst = new C0WST();
            Object[] objArr = {intent};
            C0WZW c0wzw = new C0WZW(false, "(Landroid/content/Intent;)V", c0wzx);
            C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11098, "com/ss/android/ugc/aweme/account/login/twostep/TwoStepAuthActivity", "startActivity", this, objArr, "void", c0wzw);
            if (c0wsuLIZIZ.LIZ) {
                c0wst.LIZ(11098, "com/ss/android/ugc/aweme/account/login/twostep/TwoStepAuthActivity", "startActivity", null, objArr, this, c0wzw, false);
            } else {
                Object[] objArr2 = c0wsuLIZIZ.LIZJ;
                if (objArr2 != null) {
                    Object obj = objArr2[0];
                    if (obj != null) {
                        activity = (Activity) obj;
                    } else {
                        activity = this;
                    }
                    Object obj2 = objArr2[1];
                    if (obj2 != null) {
                        intent = (Intent) obj2;
                    }
                } else {
                    activity = this;
                }
                activity.startActivity(intent);
                c0wst.LIZ(11098, "com/ss/android/ugc/aweme/account/login/twostep/TwoStepAuthActivity", "startActivity", null, objArr, activity, c0wzw, true);
            }
            finish();
        }
        super.onCreate(bundle);
        setContentView(R.layout.xa);
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.two_step_auth_title_bar);
            this.LL = (TuxNavBar) callbackFindViewById;
        }
        C0OM1 c0om1 = new C0OM1();
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_chevron_left_ltr;
        c1251150ifB.LIZJ(new AwS563S0100000_19(this, 174));
        c0om1.LJ(c1251150ifB);
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = getString(2131829396);
        c0om1.LIZJ = c1250250idj;
        c0om1.LIZLLL = false;
        ((TuxNavBar) callbackFindViewById).setNavActions(c0om1);
        KeyEvent.Callback callbackFindViewById2 = this.LLILLJJLI;
        if (callbackFindViewById2 == null) {
            callbackFindViewById2 = findViewById(R.id.two_step_auth_content_stub);
            this.LLILLJJLI = (ViewStub) callbackFindViewById2;
        }
        this.LLILLL = (ViewStub) callbackFindViewById2;
        this.LLILZIL = getIntent().getIntExtra("auth_type", -1);
        this.LLIZ = LLLLLZL(getIntent(), "auth_data");
        this.LLILZLL = LLLLLZL(getIntent(), "url_path");
        if (this.LLILZIL == -1) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Unknown TwoStepAuthType: ");
            sbLIZ.append(this.LLILZIL);
            C2188811AlT.LIZIZ(sbLIZ);
            finish();
        } else if (TextUtils.isEmpty(this.LLIZ)) {
            finish();
        } else {
            int i = this.LLILZIL;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                ViewStub viewStub = this.LLILLL;
                                if (viewStub == null) {
                                    viewStub = null;
                                }
                                this.LLILZ = new C1239820iMu(this, viewStub, this);
                            }
                        } else {
                            ViewStub viewStub2 = this.LLILLL;
                            if (viewStub2 == null) {
                                viewStub2 = null;
                            }
                            this.LLILZ = new C1239840iMw(this, viewStub2, this);
                        }
                    } else {
                        ViewStub viewStub3 = this.LLILLL;
                        if (viewStub3 == null) {
                            viewStub3 = null;
                        }
                        this.LLILZ = new C1239800iMs(this, viewStub3, this);
                    }
                } else {
                    ViewStub viewStub4 = this.LLILLL;
                    if (viewStub4 == null) {
                        viewStub4 = null;
                    }
                    this.LLILZ = new C1239810iMt(this, viewStub4, this);
                }
            } else {
                ViewStub viewStub5 = this.LLILLL;
                if (viewStub5 == null) {
                    viewStub5 = null;
                }
                this.LLILZ = new C1239850iMx(this, viewStub5, this);
            }
            C15O7.LIZJ(new ACallableS424S0100000_19(this, 9)).LJ(new C1266160j3O(this, 18), C15O7.LJIIIIZZ, null);
        }
        getWindow().setBackgroundDrawable(new ColorDrawable(C960203pA.LIZ(R.attr.bx, this)));
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthActivity", "onCreate", false);
    }

    @Override // X.ActivityC21503719Dn, androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        String strLLLLLZL;
        C1239840iMw c1239840iMw;
        super.onNewIntent(intent);
        if ((this.LLILZ instanceof C1239840iMw) && (strLLLLLZL = LLLLLZL(intent, "code")) != null) {
            C1239830iMv c1239830iMv = this.LLILZ;
            if ((c1239830iMv instanceof C1239840iMw) && (c1239840iMw = (C1239840iMw) c1239830iMv) != null) {
                c1239840iMw.Tk(strLLLLLZL, "link");
            }
        }
    }

    @Override // X.InterfaceC1239890iN1
    public final void onSuccess(String str) {
        C852980XdA.LIZ().LIZIZ(new C852990XdB(str, this.LLIZLLLIL, 0, null));
        finish();
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

    public static String LLLLLZL(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C1239800iMs c1239800iMs = this.LLJI;
        if (c1239800iMs != null) {
            c1239800iMs.LJIIIZ(i, i2, intent);
        }
    }
}
