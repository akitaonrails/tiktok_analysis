package com.ss.android.ugc.aweme.account.otl;

import X.C01GW;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C0XGR;
import X.C0XO0;
import X.C0XO2;
import X.C0XPY;
import X.C0XQS;
import X.C0XQT;
import X.C1308910kAL;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1331750klB;
import X.C1390410mHn;
import X.C1701330uNH;
import X.C197039127h;
import X.C20684815ws;
import X.C2429209fW;
import X.C418440Gaw;
import X.C427870Gq9;
import X.C438710HIf;
import X.C452501pT;
import X.C786410Ut5;
import X.C854720Xfy;
import X.DialogC1389620mGW;
import X.InterfaceC427710Gpt;
import Y.ACListenerS148S0100000_13;
import Y.ARunnableS113S0100000_13;
import Y.ARunnableS82S0200000_13;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.ILoginService;
import com.ss.android.ugc.aweme.account.network.StandaloneAidInterceptor;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS200S0000000_13;
import kotlin.jvm.internal.AwS545S0100000_1;

/* JADX INFO: loaded from: classes14.dex */
public class BaseOTLIntentHandlerActivity extends BaseActivity implements InterfaceC427710Gpt {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiQvKiAmJjFiHELIOSJjs/ZgctOiocHAkFJzs2JjEEKCE3JCA+CCwnITMlPTY=";
    public TuxIconView LL;
    public C197039127h LLILLJJLI;
    public LinearLayout LLILLL;
    public TuxTextView LLILZ;
    public TuxTextView LLILZIL;
    public C1390410mHn LLILZLL;
    public C427870Gq9 LLIZ;
    public TuxTextView LLIZLLLIL;
    public final C01GW LLJ = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(89));
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS545S0100000_1(this, 37));
    public DialogC1389620mGW LLJIJIL;
    public boolean LLJILJIL;
    public long LLJILJILJ;

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.otl.BaseOTLIntentHandlerActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.otl.BaseOTLIntentHandlerActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.otl.BaseOTLIntentHandlerActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.otl.BaseOTLIntentHandlerActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.otl.BaseOTLIntentHandlerActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final IAccountService LLLLLZL() {
        return (IAccountService) this.LLJ.getValue();
    }

    public final TuxTextView LLLLZI() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.pvl);
            this.LLILZIL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final C197039127h LLLLZIL() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.pvm);
            this.LLILLJJLI = (C197039127h) callbackFindViewById;
        }
        return (C197039127h) callbackFindViewById;
    }

    public final LinearLayout LLLLZLL() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.pvn);
            this.LLILLL = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final C1390410mHn LLLLZLLIL() {
        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.pvp);
            this.LLILZLL = (C1390410mHn) callbackFindViewById;
        }
        return (C1390410mHn) callbackFindViewById;
    }

    public final String LLLLZLLLI() {
        return (String) this.LLJI.getValue();
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        StandaloneAidInterceptor.LL.getClass();
        StandaloneAidInterceptor.LLILLJJLI = null;
        LLLLLZL().LJIIJ().LJIILLIIL(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v21 */
    public final void LLLZIL(boolean z) {
        boolean z2;
        Activity activity;
        int i;
        Intent intent;
        Activity activity2;
        if (!z) {
            String strLLLLZLLLI = LLLLZLLLI();
            if (strLLLLZLLLI == null) {
                strLLLLZLLLI = "";
            }
            LLLZ(strLLLLZLLLI, "3");
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LLJILJILJ;
        boolean booleanExtra = getIntent().getBooleanExtra("skip_refresh_token", false);
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZ(z ? 1 : 0, "is_success");
        c0xgr.LIZ(this.LLJILJIL ? 1 : 0, "has_tt_login");
        c0xgr.LIZ(booleanExtra ? 1 : 0, "is_skip");
        c0xgr.LIZIZ(jCurrentTimeMillis, "duration");
        c0xgr.LIZLLL("origin_appid", LLLLZLLLI());
        C20684815ws.LJIILLIIL("otl_return_to_caller", c0xgr.LIZ);
        C0WZX c0wzx = new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOurYJDb0ibECup+5Cdr0aZIsrMfH7O30d6MnF16aZtYqDs0hcIWd00=", null);
        C0WST c0wst = new C0WST();
        int iIntValue = -1;
        Object[] objArr = {-1};
        C0WZW c0wzw = new C0WZW(false, "(I)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11071, "com/ss/android/ugc/aweme/account/otl/BaseOTLIntentHandlerActivity", "setResult", this, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11071, "com/ss/android/ugc/aweme/account/otl/BaseOTLIntentHandlerActivity", "setResult", null, objArr, this, c0wzw, false);
            i = 1;
        } else {
            Object[] objArr2 = c0wsuLIZIZ.LIZJ;
            if (objArr2 != null) {
                Object obj = objArr2[0];
                if (obj != null) {
                    activity = (Activity) obj;
                } else {
                    activity = this;
                }
                z2 = true;
                z2 = true;
                Object obj2 = objArr2[1];
                if (obj2 != null) {
                    iIntValue = ((Integer) obj2).intValue();
                }
            } else {
                z2 = true;
                activity = this;
            }
            activity.setResult(iIntValue);
            c0wst.LIZ(11071, "com/ss/android/ugc/aweme/account/otl/BaseOTLIntentHandlerActivity", "setResult", null, objArr, activity, c0wzw, z2);
            i = z2;
        }
        finish();
        try {
            String stringExtra = getIntent().getStringExtra("redirect_uri");
            if (stringExtra != null) {
                Intent intent2 = new Intent();
                intent2.setAction("android.intent.action.VIEW");
                intent2.setData(UriProtector.parse(stringExtra));
                Bundle bundle = new Bundle();
                bundle.putBoolean("is_success", z);
                bundle.putBoolean("is_login", i);
                bundle.putBoolean("has_tt_login", this.LLJILJIL);
                intent2.putExtras(bundle);
                if (Build.VERSION.SDK_INT >= 29) {
                    intent2.setIdentifier("one_tap_login_identifier");
                }
                C2429209fW.LIZ().appendDataFlowId(intent2, 1207969290);
                RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(this, intent2, "Context_startActivity_1");
                C1701330uNH.LIZ(intent2, this);
                C0WZX c0wzx2 = new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOurYJDb0ibECup+5Cdr0aZIsrMfH7O30d6MnF16aZtYqDs0hcIWd00=", null);
                C0WST c0wst2 = new C0WST();
                Object[] objArr3 = new Object[i];
                objArr3[0] = intent2;
                C0WZW c0wzw2 = new C0WZW(false, "(Landroid/content/Intent;)V", c0wzx2);
                C0WSU c0wsuLIZIZ2 = c0wst2.LIZIZ(11098, "com/ss/android/ugc/aweme/account/otl/BaseOTLIntentHandlerActivity", "startActivity", this, objArr3, "void", c0wzw2);
                if (c0wsuLIZIZ2.LIZ) {
                    c0wst2.LIZ(11098, "com/ss/android/ugc/aweme/account/otl/BaseOTLIntentHandlerActivity", "startActivity", null, objArr3, this, c0wzw2, false);
                    return;
                }
                Object[] objArr4 = c0wsuLIZIZ2.LIZJ;
                if (objArr4 != null) {
                    Object obj3 = objArr4[0];
                    if (obj3 != null) {
                        activity2 = (Activity) obj3;
                    } else {
                        activity2 = this;
                    }
                    Object obj4 = objArr4[i];
                    if (obj4 != null) {
                        intent = (Intent) obj4;
                    } else {
                        intent = intent2;
                    }
                } else {
                    intent = intent2;
                    activity2 = this;
                }
                activity2.startActivity(intent);
                c0wst2.LIZ(11098, "com/ss/android/ugc/aweme/account/otl/BaseOTLIntentHandlerActivity", "startActivity", null, objArr3, activity2, c0wzw2, i);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void LLLZLZ(User user) {
        int iIntValue;
        C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(user.getAvatarLarger()));
        KeyEvent.Callback callbackFindViewById = this.LLIZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.pvk);
            this.LLIZ = (C427870Gq9) callbackFindViewById;
        }
        c1331670kl3LJIIIIZZ.LJJI((ImageView) callbackFindViewById);
        C1331750klB c1331750klB = new C1331750klB();
        c1331750klB.LIZ = true;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ng, this);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        c1331750klB.LIZJ = iIntValue;
        c1331750klB.LIZIZ = C418440Gaw.LIZIZ(1);
        c1331670kl3LJIIIIZZ.LJJI = c1331750klB.LIZ();
        C786410Ut5.h3(c1331670kl3LJIIIIZZ);
        KeyEvent.Callback callbackFindViewById2 = this.LLIZLLLIL;
        if (callbackFindViewById2 == null) {
            callbackFindViewById2 = findViewById(R.id.pvr);
            this.LLIZLLLIL = (TuxTextView) callbackFindViewById2;
        }
        ((TextView) callbackFindViewById2).setText(user.getUniqueId());
    }

    public final void LLLZZIL(User user) {
        DialogC1389620mGW dialogC1389620mGW = this.LLJIJIL;
        if (dialogC1389620mGW == null) {
            dialogC1389620mGW = null;
        }
        C786410Ut5.LJIIJ(dialogC1389620mGW);
        C786410Ut5.LJZL(0, LLLLZLL());
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.pvq);
            this.LLILZ = (TuxTextView) callbackFindViewById;
        }
        ((TextView) callbackFindViewById).setText(getString(2131839901));
        C786410Ut5.LLLLZLL(LLLLZI(), 0);
        LLLLZI().setText(getString(2131839904));
        C786410Ut5.LLLZZIL(LLLLZLLIL(), 8);
        LLLLZIL().setText(getString(R.string.f1_));
        C786410Ut5.LLLLLLJ(LLLLZIL(), 0);
        if (user != null) {
            LLLZLZ(user);
        }
    }

    public final void LLZ(User user) {
        C786410Ut5.LJZL(0, LLLLZLL());
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.pvq);
            this.LLILZ = (TuxTextView) callbackFindViewById;
        }
        ((TextView) callbackFindViewById).setText(getString(2131839902));
        C786410Ut5.LLLLZLL(LLLLZI(), 8);
        C786410Ut5.LLLZZIL(LLLLZLLIL(), 0);
        C786410Ut5.LLLLLLJ(LLLLZIL(), 8);
        LLLLZLLIL().LIZJ();
        LLLZLZ(user);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.otl.BaseOTLIntentHandlerActivity", "onCreate", true);
        super.onCreate(bundle);
        this.LLJILJILJ = System.currentTimeMillis();
        StandaloneAidInterceptor standaloneAidInterceptor = StandaloneAidInterceptor.LL;
        String strLLLLZLLLI = LLLLZLLLI();
        standaloneAidInterceptor.getClass();
        StandaloneAidInterceptor.LLILLJJLI = strLLLLZLLLI;
        DialogC1389620mGW dialogC1389620mGW = new DialogC1389620mGW(this);
        dialogC1389620mGW.LJJLJ(R.string.txr);
        this.LLJIJIL = dialogC1389620mGW;
        LLLLLZL().LJIIJ().LJJIFFI(this);
        setContentView(R.layout.zn);
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.f783pvo);
            this.LL = (TuxIconView) callbackFindViewById;
        }
        C786410Ut5.a9((TuxIconView) callbackFindViewById, new ACListenerS148S0100000_13(this, 22));
        C786410Ut5.U8(LLLLZIL(), new ACListenerS148S0100000_13(this, 23));
        C0XPY.LIZ.getClass();
        this.LLJILJIL = C0XO0.LIZLLL(C0XPY.LIZ()).LLJZIJLIL;
        if (!getIntent().getBooleanExtra("open_login_screen", false) && this.LLJILJIL) {
            if (LLLLLZL().LJIIJ().LIZ()) {
                String strLLLLZLLLI2 = LLLLZLLLI();
                if (strLLLLZLLLI2 != null && strLLLLZLLLI2.equals("259")) {
                    LLZ(LLLLLZL().LJIIJ().getCurUser());
                    LLLLLZL().LJIIJ().LJJIII(Boolean.FALSE, Boolean.TRUE);
                } else {
                    LLLZZIL(LLLLLZL().LJIIJ().getCurUser());
                }
            } else if (getIntent().getBooleanExtra("skip_refresh_token", false)) {
                LLLZIL(true);
            } else {
                LLZ(LLLLLZL().LJIIJ().getCurUser());
                LLLLLZL().LJIIJ().LJJIII(Boolean.FALSE, Boolean.TRUE);
            }
        } else {
            DialogC1389620mGW dialogC1389620mGW2 = this.LLJIJIL;
            if (dialogC1389620mGW2 == null) {
                dialogC1389620mGW2 = null;
            }
            C786410Ut5.J4(dialogC1389620mGW2);
            C786410Ut5.LJZL(8, LLLLZLL());
            ILoginService iLoginServiceLIZJ = LLLLLZL().LIZJ();
            C0XQS c0xqs = new C0XQS();
            c0xqs.LIZ = this;
            c0xqs.LIZIZ = LLLLZLLLI();
            c0xqs.LIZJ = "1p_app";
            c0xqs.LJ = new C854720Xfy(this, 13);
            iLoginServiceLIZJ.showLoginAndRegisterView(new C0XQT(c0xqs));
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.otl.BaseOTLIntentHandlerActivity", "onCreate", false);
    }

    public static void LLLZ(String str, String str2) {
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZLLL("enter_from", str);
        c0xgr.LIZLLL("enter_method", "1p_app");
        c0xgr.LIZLLL("login_panel_type", "login");
        c0xgr.LIZLLL("exit_method", str2);
        C20684815ws.LJIILLIIL("login_redirect", c0xgr.LIZ);
    }

    @Override // X.InterfaceC427710Gpt
    public final void LLLLLLZZ(int i, User user, User user2) {
        C0XPY.LIZ.getClass();
        C0XO2 c0xo2 = C0XO0.LIZLLL(C0XPY.LIZ()).LLLIIIL;
        c0xo2.LJII = c0xo2.LJII;
        boolean z = c0xo2.LJIILL;
        if (i != 4) {
            String str = "";
            if (i != 13) {
                if (i == 14) {
                    String strLLLLZLLLI = LLLLZLLLI();
                    if (strLLLLZLLLI != null) {
                        str = strLLLLZLLLI;
                    }
                    LLLZ(str, "2");
                    if (!z) {
                        runOnUiThread(new ARunnableS82S0200000_13(user2, this, 95));
                        return;
                    }
                    return;
                }
                return;
            }
            String strLLLLZLLLI2 = LLLLZLLLI();
            if (strLLLLZLLLI2 != null) {
                str = strLLLLZLLLI2;
            }
            LLLZ(str, "1");
            runOnUiThread(new ARunnableS113S0100000_13((Object) this, 260));
            return;
        }
        if (user2 == null) {
            return;
        }
        LLLZLZ(user2);
    }
}
