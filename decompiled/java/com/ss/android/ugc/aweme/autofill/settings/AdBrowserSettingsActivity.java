package com.ss.android.ugc.aweme.autofill.settings;

import X.AbstractC426530Gnz;
import X.C098200Yq;
import X.C0OM1;
import X.C0WT9;
import X.C1077060e8O;
import X.C11G4;
import X.C11GO;
import X.C1250250idj;
import X.C1251150ifB;
import X.C127A;
import X.C127K;
import X.C1308910kAL;
import X.C1697810uHb;
import X.C189200o6;
import X.C197039127h;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2344009Gk;
import X.C275680ArG;
import X.C299020Bno;
import X.C305310Bxx;
import X.C305320Bxy;
import X.C335910DEv;
import X.C431260Gvc;
import X.C444910HcX;
import X.C444920HcY;
import X.C786410Ut5;
import X.EnumC335920DEw;
import Y.ACListenerS137S0100000_2;
import Y.ACListenerS151S0100000_16;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.KeyEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.autofill.IAdAutofillService;
import com.ss.android.ugc.aweme.autofill.setting.AdAutofillConfigSettings;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.web.experiment.AutofillPrefillConfigExp;
import com.zhiliaoapp.musically.R;
import java.text.SimpleDateFormat;
import java.util.Locale;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlin.jvm.internal.AwS417S0200000_16;
import kotlin.jvm.internal.AwS548S0100000_4;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.text.u;

/* JADX INFO: loaded from: classes17.dex */
public final class AdBrowserSettingsActivity extends BaseActivity {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiQ5PSA1ISkgZzHELIOSw2PDElJyggZgQoCz08PzYpOxw2PDElJyggCSY4IDk6PDw=";
    public C127K LL;
    public C127K LLILLJJLI;
    public C127K LLILLL;
    public TuxNavBar LLILZ;
    public LinearLayout LLILZIL;
    public LinearLayout LLILZLL;
    public TuxTextView LLIZ;
    public C127K LLIZLLLIL;
    public C127K LLJ;
    public C127K LLJI;
    public LinearLayout LLJIJIL;
    public C127K LLJILJIL;
    public String LLJILJILJ = "";

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.autofill.settings.AdBrowserSettingsActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.autofill.settings.AdBrowserSettingsActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.autofill.settings.AdBrowserSettingsActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final C127K LLLLLZL() {
        KeyEvent.Callback callbackFindViewById = this.LLJILJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.dzw);
            this.LLJILJIL = (C127K) callbackFindViewById;
        }
        return (C127K) callbackFindViewById;
    }

    public final C127K LLLLZI() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.eq_);
            this.LLILLJJLI = (C127K) callbackFindViewById;
        }
        return (C127K) callbackFindViewById;
    }

    public final C127K LLLLZIL() {
        KeyEvent.Callback callbackFindViewById = this.LLJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.eqh);
            this.LLJ = (C127K) callbackFindViewById;
        }
        return (C127K) callbackFindViewById;
    }

    public final C127K LLLLZLL() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.q4h);
            this.LL = (C127K) callbackFindViewById;
        }
        return (C127K) callbackFindViewById;
    }

    public final C127K LLLLZLLIL() {
        KeyEvent.Callback callbackFindViewById = this.LLIZLLLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.q4o);
            this.LLIZLLLIL = (C127K) callbackFindViewById;
        }
        return (C127K) callbackFindViewById;
    }

    public final C127K LLLLZLLLI() {
        KeyEvent.Callback callbackFindViewById = this.LLJI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.ro5);
            this.LLJI = (C127K) callbackFindViewById;
        }
        return (C127K) callbackFindViewById;
    }

    public final void LLLZIL() {
        String str;
        C0WT9.LIZ.getClass();
        long j = Keva.getRepo("IABClearCookieManager").getLong("iab_clear_cookie_time", 0L);
        if (j > 0) {
            try {
                str = new SimpleDateFormat("yy/MM/dd, HH:mm", Locale.getDefault()).format(Long.valueOf(j));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                Object c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                    c098200Yq = null;
                }
                Object obj = (Void) c098200Yq;
                str = obj != null ? (String) obj : "";
            }
            if (str != null && str.length() != 0) {
                LLLLLZL().setSubtitle(u.LJJIFFI(getString(2131828852), "{date}", str, false));
                return;
            }
        }
        LLLLLZL().setSubtitle(null);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.autofill.settings.AdBrowserSettingsActivity", "onResume", true);
        super.onResume();
        if (C305310Bxx.LIZ()) {
            LLLLZLL().setSubTitleMaxLines(1);
            LLLLZLL().setSubtitle(((IAdAutofillService) ServiceManager.get().getService(IAdAutofillService.class)).LJIL());
            LLLLZI().setSubTitleMaxLines(1);
            LLLLZI().setSubtitle(((IAdAutofillService) ServiceManager.get().getService(IAdAutofillService.class)).LJIJ());
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.autofill.settings.AdBrowserSettingsActivity", "onResume", false);
            return;
        }
        if (C305320Bxy.LIZ()) {
            KeyEvent.Callback callbackFindViewById = this.LLILLL;
            if (callbackFindViewById == null) {
                callbackFindViewById = findViewById(R.id.bff);
                this.LLILLL = (C127K) callbackFindViewById;
            }
            C127K c127k = (C127K) callbackFindViewById;
            C11G4 c11g4 = new C11G4(this, null);
            c11g4.LJIILJJIL(((IAdAutofillService) ServiceManager.get().getService(IAdAutofillService.class)).LJIIJ() ? getString(2131829473) : "");
            c11g4.LJIILL(new ACListenerS151S0100000_16(this, 10));
            c127k.setAccessory(c11g4);
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.autofill.settings.AdBrowserSettingsActivity", "onResume", false);
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

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity
    public final void finish() {
        super.finish();
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String stringExtra;
        int i;
        boolean z;
        String uid;
        int i2;
        boolean z2;
        User currentUser;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.autofill.settings.AdBrowserSettingsActivity", "onCreate", true);
        activityConfiguration(AFwS252S0000000_16.get$arr$(95));
        super.onCreate(bundle);
        supportRequestWindowFeature(10);
        setTheme(R.style.my);
        setContentView(R.layout.kx);
        try {
            stringExtra = getIntent().getStringExtra("enter_from");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.LLJILJILJ = stringExtra;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", this.LLJILJILJ);
        C20684815ws.LJIILLIIL("enter_browser_setting_page", c2344009Gk.LIZ);
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.xzp);
            this.LLILZ = (TuxNavBar) callbackFindViewById;
        }
        C0OM1 c0om1 = new C0OM1();
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_arrow_left_ltr;
        c1251150ifB.LIZLLL = true;
        c1251150ifB.LIZJ(new AwS560S0100000_16(this, 617));
        c0om1.LJ(c1251150ifB);
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = getString(2131835652);
        c0om1.LIZJ = c1250250idj;
        ((TuxNavBar) callbackFindViewById).setNavActions(c0om1);
        if (((Boolean) C275680ArG.LIZ.getValue()).booleanValue()) {
            KeyEvent.Callback callbackFindViewById2 = this.LLJIJIL;
            if (callbackFindViewById2 == null) {
                callbackFindViewById2 = findViewById(R.id.dzy);
                this.LLJIJIL = (LinearLayout) callbackFindViewById2;
            }
            C786410Ut5.LJZL(0, (LinearLayout) callbackFindViewById2);
            C0WT9 c0wt9 = C0WT9.LIZ;
            String str = this.LLJILJILJ;
            c0wt9.getClass();
            C0WT9.LJ("iab_clear_cookie_exposure", null, str);
            LLLLLZL().setTitle(getString(2131827903));
            C127K c127kLLLLLZL = LLLLLZL();
            C1077060e8O c1077060e8O = new C1077060e8O(this, null);
            c1077060e8O.LIZIZ.setButtonVariant(1);
            c1077060e8O.LJIILIIL(getString(2131828849));
            c1077060e8O.LJIIL(new ACListenerS137S0100000_2(this, 52));
            C197039127h c197039127h = c1077060e8O.LIZIZ;
            if ((c197039127h instanceof C197039127h) && c197039127h != null) {
                c197039127h.setButtonSize(0);
            }
            c127kLLLLLZL.setAccessory(c1077060e8O);
            LLLLLZL().LJ(true, true);
            LLLZIL();
        } else {
            KeyEvent.Callback callbackFindViewById3 = this.LLJIJIL;
            if (callbackFindViewById3 == null) {
                callbackFindViewById3 = findViewById(R.id.dzy);
                this.LLJIJIL = (LinearLayout) callbackFindViewById3;
            }
            C786410Ut5.LJZL(8, (LinearLayout) callbackFindViewById3);
        }
        if (C305310Bxx.LIZ()) {
            KeyEvent.Callback callbackFindViewById4 = this.LLILZIL;
            if (callbackFindViewById4 == null) {
                callbackFindViewById4 = findViewById(R.id.bft);
                this.LLILZIL = (LinearLayout) callbackFindViewById4;
            }
            C786410Ut5.LJZL(0, (LinearLayout) callbackFindViewById4);
            LLLLZLLIL().setTitle(getString(2131835648));
            C127K c127kLLLLZLLIL = LLLLZLLIL();
            C127A c127a = new C127A(this);
            c127a.LJIILJJIL(((IAdAutofillService) ServiceManager.get().getService(IAdAutofillService.class)).LJI());
            c127a.LJIILL(new AwS417S0200000_16(this, c127a, 41));
            c127kLLLLZLLIL.setAccessory(c127a);
            C127K c127kLLLLZLL = LLLLZLL();
            if (((C11GO) LLLLZLLIL().getAccessory()).LJIILIIL()) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LLZLL(c127kLLLLZLL, i);
            C127K c127kLLLLZLLIL2 = LLLLZLLIL();
            if (LLLLZLL().getVisibility() == 8) {
                z = true;
            } else {
                z = false;
            }
            c127kLLLLZLLIL2.LJ(true, z);
            LLLLZLL().setTitle(getString(2131835649));
            C127K c127kLLLLZLL2 = LLLLZLL();
            C11G4 c11g4 = new C11G4(this, null);
            c11g4.LJIILL(new ACListenerS151S0100000_16(this, 59));
            c127kLLLLZLL2.setAccessory(c11g4);
            LLLLZLL().LJ(false, true);
            LLLLZIL().setTitle(getString(2131835651));
            C127K c127kLLLLZIL = LLLLZIL();
            C127A c127a2 = new C127A(this);
            c127a2.LJIILJJIL(((IAdAutofillService) ServiceManager.get().getService(IAdAutofillService.class)).LJIIL());
            c127a2.LJIILL(new AwS417S0200000_16(this, c127a2, 42));
            c127kLLLLZIL.setAccessory(c127a2);
            if (!AutofillPrefillConfigExp.LIZ()) {
                C786410Ut5.LLZLL(LLLLZLLLI(), 8);
            } else {
                C786410Ut5.LLZLL(LLLLZLLLI(), 0);
            }
            LLLLZLLLI().LJ(false, false);
            LLLLZLLLI().setTitle(getString(2131845037));
            C127K c127kLLLLZLLLI = LLLLZLLLI();
            C127A c127a3 = new C127A(this);
            Keva repo = KevaImpl.getRepo("autofill_info", 1);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("prefillAutofillContact");
            IUserService iUserService = (IUserService) PluggableExtentionKt.pluggableSpi$default(IUserService.class, false, false, false, 14, null);
            if (iUserService == null || (currentUser = iUserService.getCurrentUser()) == null || (uid = currentUser.getUid()) == null) {
                uid = "default";
            }
            sbLIZ.append(uid);
            c127a3.LJIILJJIL(repo.getBoolean(C2188811AlT.LIZIZ(sbLIZ), false));
            c127a3.LJIILL(new AwS548S0100000_4(c127a3, 417));
            c127kLLLLZLLLI.setAccessory(c127a3);
            C127K c127kLLLLZI = LLLLZI();
            if (((C11GO) LLLLZIL().getAccessory()).LJIILIIL()) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            C786410Ut5.LLZLL(c127kLLLLZI, i2);
            C127K c127kLLLLZIL2 = LLLLZIL();
            if (LLLLZI().getVisibility() == 8) {
                z2 = true;
            } else {
                z2 = false;
            }
            c127kLLLLZIL2.LJ(true, z2);
            LLLLZI().setTitle(getString(2131835650));
            C127K c127kLLLLZI2 = LLLLZI();
            C11G4 c11g42 = new C11G4(this, null);
            c11g42.LJIILL(new ACListenerS151S0100000_16(this, 60));
            c127kLLLLZI2.setAccessory(c11g42);
            LLLLZI().LJ(false, true);
        } else {
            KeyEvent.Callback callbackFindViewById5 = this.LLILZIL;
            if (callbackFindViewById5 == null) {
                callbackFindViewById5 = findViewById(R.id.bft);
                this.LLILZIL = (LinearLayout) callbackFindViewById5;
            }
            C786410Ut5.LJZL(8, (LinearLayout) callbackFindViewById5);
        }
        if (!C305310Bxx.LIZ() && C305320Bxy.LIZ()) {
            KeyEvent.Callback callbackFindViewById6 = this.LLILZLL;
            if (callbackFindViewById6 == null) {
                callbackFindViewById6 = findViewById(R.id.f675bfk);
                this.LLILZLL = (LinearLayout) callbackFindViewById6;
            }
            C786410Ut5.LJZL(0, (LinearLayout) callbackFindViewById6);
            KeyEvent.Callback callbackFindViewById7 = this.LLIZ;
            if (callbackFindViewById7 == null) {
                callbackFindViewById7 = findViewById(R.id.bfx);
                this.LLIZ = (TuxTextView) callbackFindViewById7;
            }
            String string = getString(2131826946);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(' ');
            sbLIZ2.append(getString(2131826945));
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            int length = string.length() - 1;
            int length2 = string.length() + strLIZIZ.length();
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(string);
            sbLIZ3.append(strLIZIZ);
            C444910HcX c444910HcX = new C444910HcX(C2188811AlT.LIZIZ(sbLIZ3));
            c444910HcX.LIZ(61);
            int i3 = length + 1;
            C786410Ut5.s2(c444910HcX, new AbstractC426530Gnz() { // from class: X.0duv
                @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                public final void updateDrawState(TextPaint textPaint) {
                }

                @Override // android.text.style.ClickableSpan
                public final void onClick(View view) {
                    ((IAdAutofillService) ServiceManager.get().getService(IAdAutofillService.class)).LIZJ(view.getContext(), this.LL.LLJILJILJ, AdAutofillConfigSettings.LIZ().learnMoreLink);
                }
            }, i3, length2, 33);
            C786410Ut5.s2(c444910HcX, new C444920HcY(62, true), i3, length2, 33);
            ((TextView) callbackFindViewById7).setText(c444910HcX);
            KeyEvent.Callback callbackFindViewById8 = this.LLIZ;
            if (callbackFindViewById8 == null) {
                callbackFindViewById8 = findViewById(R.id.bfx);
                this.LLIZ = (TuxTextView) callbackFindViewById8;
            }
            ((TextView) callbackFindViewById8).setMovementMethod(C431260Gvc.LIZ);
            KeyEvent.Callback callbackFindViewById9 = this.LLILLL;
            if (callbackFindViewById9 == null) {
                callbackFindViewById9 = findViewById(R.id.bff);
                this.LLILLL = (C127K) callbackFindViewById9;
            }
            ((C127K) callbackFindViewById9).setTitle(getString(2131829474));
        } else {
            KeyEvent.Callback callbackFindViewById10 = this.LLILZLL;
            if (callbackFindViewById10 == null) {
                callbackFindViewById10 = findViewById(R.id.f675bfk);
                this.LLILZLL = (LinearLayout) callbackFindViewById10;
            }
            C786410Ut5.LJZL(8, (LinearLayout) callbackFindViewById10);
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.autofill.settings.AdBrowserSettingsActivity", "onCreate", false);
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

    public static void LLLZ(AdBrowserSettingsActivity adBrowserSettingsActivity, int i, int i2, int i3) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        adBrowserSettingsActivity.getClass();
        IAdAutofillService iAdAutofillService = (IAdAutofillService) ServiceManager.get().getService(IAdAutofillService.class);
        boolean zLJIIL = iAdAutofillService.LJIIL();
        boolean zLJI = iAdAutofillService.LJI();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZJ(zLJIIL ? 1 : 0, "allow_contact");
        c2344009Gk.LIZJ(zLJI ? 1 : 0, "allow_payment");
        c2344009Gk.LIZJ(i, "click_contact_info");
        c2344009Gk.LIZJ(i2, "click_payment_info");
        c2344009Gk.LJIIIIZZ("enter_source", "autofill_project");
        C20684815ws.LJIILLIIL("edit_autofill_permissions", c2344009Gk.LIZ);
    }
}
