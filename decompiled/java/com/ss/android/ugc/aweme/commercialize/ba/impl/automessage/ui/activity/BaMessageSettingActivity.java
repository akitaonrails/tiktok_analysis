package com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity;

import X.AbstractActivityC483870IyH;
import X.AbstractC2238408pq;
import X.AbstractC848400XPy;
import X.C01GW;
import X.C06C4;
import X.C099G;
import X.C0DTU;
import X.C0J21;
import X.C0OM1;
import X.C0PEM;
import X.C0XI4;
import X.C0XQ7;
import X.C1202420hOa;
import X.C1238760iLC;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1308910kAL;
import X.C14EU;
import X.C1697810uHb;
import X.C19292910dr;
import X.C19318810i2;
import X.C19319010i4;
import X.C19319110i5;
import X.C19319810iC;
import X.C19323610io;
import X.C1DFH;
import X.C2107308Nj;
import X.C2188811AlT;
import X.C23250099c;
import X.C2344009Gk;
import X.C299020Bno;
import X.C335910DEv;
import X.C444960Hcc;
import X.C452501pT;
import X.C483670Ixx;
import X.C483680Ixy;
import X.C483700Iy0;
import X.C483760Iy6;
import X.C483790Iy9;
import X.C483820IyC;
import X.C483830IyD;
import X.C484220Iyq;
import X.EnumC335920DEw;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ACListenerS139S0100000_4;
import Y.ACListenerS142S0100000_7;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.commerce.BizAccountInfo;
import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.controller.IBaAutoMessageService;
import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.helper.BaAutoMessageServiceImpl;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.main.service.ILanguageService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS115S0101000_7;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class BaMessageSettingActivity extends AbstractActivityC483870IyH {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYjJCI2OiYlKCM6MiBiKy59ISg8JWEyHELIOSPTEjJCogOyQrLGEmIWstKjs6Piw4MGERKQgpOjwyLyAfLDsnISsrCCwnITMlPTY=";
    public ViewOnAttachStateChangeListenerC20604515jv LLILLJJLI;
    public TuxNavBar LLILLL;
    public LinearLayout LLILZ;
    public C099G LLILZIL;
    public final IBaAutoMessageService LLILZLL = BaAutoMessageServiceImpl.LJIJ();
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS551S0100000_7(this, 131));
    public final Boolean LLIZLLLIL;
    public C19292910dr LLJ;
    public C19292910dr LLJI;
    public C19292910dr LLJIJIL;
    public C1238760iLC LLJILJIL;
    public C1238760iLC LLJILJILJ;
    public C1238760iLC LLJILLL;
    public int LLJJ;
    public boolean LLJJI;
    public int LLJJIII;
    public int LLJJIJI;
    public final C483830IyD LLJJIJIIJIL;

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaMessageSettingActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaMessageSettingActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaMessageSettingActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public static void LLLLLZL() {
        C0XI4 c0xi4 = new C0XI4("https://feedback.tiktokv.com/falcon/tiktok/feedback/main/index.html#/?hide_nav_bar=1");
        c0xi4.LJ("entrance", "BA_auto_message");
        c0xi4.LJ("locale", ((ILanguageService) ServiceManager.get().getService(ILanguageService.class)).getAppLanguage());
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(C1202420hOa.LIZ(), "aweme://webview/");
        smartRouteBuildRoute.withParam("url", c0xi4.LJFF());
        smartRouteBuildRoute.withParam("hide_nav_bar", true);
        smartRouteBuildRoute.open();
        C0J21.LJFF();
    }

    public final C19318810i2 LLLLZIL() {
        return (C19318810i2) this.LLIZ.getValue();
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaMessageSettingActivity", "onResume", true);
        super.onResume();
        this.LLILZIL = C23250099c.LIZIZ(this, C0PEM.LIZJ, null, new C06C4(null), 2);
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C23250099c.LIZLLL(this, abstractC2238408pq, null, new C0DTU(this, null), 2);
        C23250099c.LIZLLL(this, abstractC2238408pq, null, new C483790Iy9(this, null), 2);
        C23250099c.LIZLLL(this, null, null, new C483680Ixy(this, null), 3);
        C23250099c.LIZLLL(this, null, null, new C483670Ixx(this, null), 3);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaMessageSettingActivity", "onResume", false);
    }

    public BaMessageSettingActivity() {
        BizAccountInfo bizAccountInfo;
        User curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
        this.LLIZLLLIL = (curUser == null || (bizAccountInfo = curUser.getBizAccountInfo()) == null) ? null : Boolean.valueOf(bizAccountInfo.enableSuggestedQuestion());
        this.LLJJI = true;
        this.LLJJIJI = 3;
        this.LLJJIJIIJIL = new C483830IyD(3, 0);
    }

    @Override // X.AbstractActivityC483870IyH, com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        EventBus.LIZLLL().LJJI(this);
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

    public final String LLLLZI(C483830IyD c483830IyD) {
        this.LLJJIJI = c483830IyD.LIZ;
        StringBuilder sb = new StringBuilder();
        sb.append(getResources().getText(2131850865));
        if (C444960Hcc.LIZIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('(');
            sbLIZ.append(c483830IyD.LIZ);
            sbLIZ.append('/');
            sbLIZ.append(c483830IyD.LIZIZ);
            sbLIZ.append(')');
            sb.append(C2188811AlT.LIZIZ(sbLIZ));
        } else {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(" (");
            sbLIZ2.append(c483830IyD.LIZIZ);
            sbLIZ2.append('/');
            sbLIZ2.append(c483830IyD.LIZ);
            sbLIZ2.append(')');
            sb.append(C2188811AlT.LIZIZ(sbLIZ2));
        }
        return sb.toString();
    }

    public final void LLLLZLL(C19292910dr c19292910dr) {
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(this, C2107308Nj.LIZ, null, new C483760Iy6(this, c19292910dr, null), 2);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void exitSuggestedPage(C484220Iyq c484220Iyq) {
        int i;
        JSONObject jSONObject = c484220Iyq.LIZ;
        if (jSONObject != null && TextUtils.equals(JSONObjectProtectorUtils.getString(jSONObject, "eventName"), "suggested_questions_manage_page_exit")) {
            JSONObject jSONObjectOptJSONObject = c484220Iyq.LIZ.optJSONObject("data");
            if (jSONObjectOptJSONObject != null) {
                i = JSONObjectProtectorUtils.getInt(jSONObjectOptJSONObject, "qa_count");
            } else {
                i = 0;
            }
            C1238760iLC c1238760iLC = this.LLJILLL;
            if (c1238760iLC == null) {
                c1238760iLC = null;
            }
            c1238760iLC.LJI(new AwS115S0101000_7(this, i, 3));
        }
    }

    @Override // X.AbstractActivityC483870IyH, com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String stringExtra;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaMessageSettingActivity", "onCreate", true);
        super.onCreate(bundle);
        setTheme(R.style.my);
        this.LLILZLL.LJFF();
        setContentView(R.layout.f5q);
        EventBus.LIZLLL().LJIJJ(this);
        TuxNavBar tuxNavBar = this.LLILLL;
        View view = tuxNavBar;
        if (tuxNavBar == null) {
            View viewFindViewById = findViewById(R.id.y1z);
            this.LLILLL = (TuxNavBar) viewFindViewById;
            view = viewFindViewById;
        }
        C0OM1 c0om1 = new C0OM1();
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_arrow_left_ltr;
        c1251150ifB.LIZLLL = true;
        c1251150ifB.LIZJ(new AwS551S0100000_7(this, 129));
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        boolean z17 = false;
        boolean z18 = false;
        boolean z19 = false;
        boolean z20 = false;
        boolean z21 = false;
        c0om1.LJ(c1251150ifB);
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = getString(2131822188);
        c0om1.LIZJ = c1250250idj;
        C1251150ifB c1251150ifB2 = new C1251150ifB();
        c1251150ifB2.LIZLLL();
        c1251150ifB2.LIZJ = R.raw.icon_pen_on_doc;
        c1251150ifB2.LIZLLL = true;
        c1251150ifB2.LIZJ(new AwS551S0100000_7(this, 130));
        c0om1.LIZIZ(c1251150ifB2);
        ((TuxNavBar) view).setNavActions(c0om1);
        CharSequence charSequence = null;
        boolean z22 = false;
        boolean z23 = false;
        boolean z24 = false;
        boolean z25 = false;
        boolean z26 = false;
        boolean z27 = false;
        boolean z28 = false;
        boolean z29 = false;
        boolean z30 = false;
        boolean z31 = false;
        boolean z32 = false;
        boolean z33 = false;
        boolean z34 = false;
        boolean z35 = false;
        boolean z36 = false;
        boolean z37 = false;
        boolean z38 = false;
        boolean z39 = false;
        boolean z40 = false;
        this.LLJ = new C19292910dr(new C19319810iC(false, getString(2131858446), new ACListenerS142S0100000_7(this, 127), false, null, null, null, getString(2131858447), false, false, false, null, 129529));
        this.LLJI = new C19292910dr(new C19319810iC(false, getString(2131836298), new ACListenerS142S0100000_7(this, 128), false, null, null, null, getString(2131836299), false, false, false, null, 130041));
        this.LLJILJIL = new C1238760iLC(new C19323610io(getString(2131822190), null, new ACListenerS142S0100000_7(this, 129), null, true, null, null, null, true, false, null, null, false, false, null, null, null, 16768746));
        StringBuilder sb = new StringBuilder();
        sb.append(getResources().getText(2131822189));
        if (C444960Hcc.LIZIZ()) {
            sb.append("(4/0) ");
        } else {
            sb.append(" (0/4)");
        }
        this.LLJILJILJ = new C1238760iLC(new C19323610io(sb.toString(), null, new ACListenerS142S0100000_7(this, 130), null, true, null, null, getResources().getString(2131833181), true, false, null, null, false, false, null, null, null, 16768618));
        try {
            stringExtra = getIntent().getStringExtra("enter_from");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (stringExtra == null) {
            stringExtra = "";
        }
        C483820IyC c483820IyC = C483820IyC.LL;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", stringExtra);
        c483820IyC.invoke("enter_business_message_setting", c2344009Gk.LIZ);
        LLLLZIL().LIZ(new C19319110i5(new C19319010i4(getString(2131850868), z, z21 ? 1 : 0, z20 ? 1 : 0, z19 ? 1 : 0, charSequence, z40 ? 1 : 0, z39 ? 1 : 0, z38 ? 1 : 0, z37 ? 1 : 0, z18 ? 1 : 0, z17 ? 1 : 0, 65534)));
        C19318810i2 c19318810i2LLLLZIL = LLLLZIL();
        C19292910dr c19292910dr = this.LLJ;
        if (c19292910dr == null) {
            c19292910dr = null;
        }
        c19318810i2LLLLZIL.LIZ(c19292910dr);
        C19318810i2 c19318810i2LLLLZIL2 = LLLLZIL();
        C1238760iLC c1238760iLC = this.LLJILJIL;
        if (c1238760iLC == null) {
            c1238760iLC = null;
        }
        c19318810i2LLLLZIL2.LIZ(c1238760iLC);
        boolean z41 = true;
        LLLLZIL().LIZ(new C19319110i5(new C19319010i4(getString(2131850862), z41, z16 ? 1 : 0, z15 ? 1 : 0, z14 ? 1 : 0, z36 ? 1 : 0, z35 ? 1 : 0, z34 ? 1 : 0, z33 ? 1 : 0, z32 ? 1 : 0, z13 ? 1 : 0, z12 ? 1 : 0, 65532)));
        C19318810i2 c19318810i2LLLLZIL3 = LLLLZIL();
        C19292910dr c19292910dr2 = this.LLJI;
        if (c19292910dr2 == null) {
            c19292910dr2 = null;
        }
        c19318810i2LLLLZIL3.LIZ(c19292910dr2);
        C19318810i2 c19318810i2LLLLZIL4 = LLLLZIL();
        C1238760iLC c1238760iLC2 = this.LLJILJILJ;
        if (c1238760iLC2 == null) {
            c1238760iLC2 = null;
        }
        c19318810i2LLLLZIL4.LIZ(c1238760iLC2);
        if (Intrinsics.LJFF(this.LLIZLLLIL, Boolean.TRUE)) {
            this.LLJIJIL = new C19292910dr(new C19319810iC(false, getString(2131850867), new ACListenerS142S0100000_7(this, 294), false, null, null, null, getString(2131850864), false, false, false, null, 127993));
            StringBuilder sb2 = new StringBuilder();
            sb2.append(getResources().getText(2131850865));
            if (C444960Hcc.LIZIZ()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append('(');
                sbLIZ.append(this.LLJJIJIIJIL.LIZ);
                sbLIZ.append('/');
                sbLIZ.append(this.LLJJIJIIJIL.LIZIZ);
                sbLIZ.append(") ");
                sb2.append(C2188811AlT.LIZIZ(sbLIZ));
            } else {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(" (");
                sbLIZ2.append(this.LLJJIJIIJIL.LIZIZ);
                sbLIZ2.append('/');
                sbLIZ2.append(this.LLJJIJIIJIL.LIZ);
                sbLIZ2.append(')');
                sb2.append(C2188811AlT.LIZIZ(sbLIZ2));
            }
            this.LLJILLL = new C1238760iLC(new C19323610io(sb2.toString(), null, new ACListenerS139S0100000_4(this, 99), null, true, null, null, null, true, false, null, null, false, false, null, null, null, 16768746));
            z41 = true;
            LLLLZIL().LIZ(new C19319110i5(new C19319010i4(getString(2131850866), z41, z11 ? 1 : 0, z10 ? 1 : 0, z9 ? 1 : 0, z31 ? 1 : 0, z30 ? 1 : 0, z29 ? 1 : 0, z28 ? 1 : 0, z27 ? 1 : 0, z8 ? 1 : 0, z7 ? 1 : 0, 65532)));
            C19318810i2 c19318810i2LLLLZIL5 = LLLLZIL();
            C19292910dr c19292910dr3 = this.LLJIJIL;
            if (c19292910dr3 == null) {
                c19292910dr3 = null;
            }
            c19318810i2LLLLZIL5.LIZ(c19292910dr3);
            C19318810i2 c19318810i2LLLLZIL6 = LLLLZIL();
            C1238760iLC c1238760iLC3 = this.LLJILLL;
            if (c1238760iLC3 == null) {
                c1238760iLC3 = null;
            }
            c19318810i2LLLLZIL6.LIZ(c1238760iLC3);
            C23250099c.LIZLLL(this, null, null, new C483700Iy0(this, null), 3);
        }
        LLLLZIL().LIZ(new C19319110i5(new C19319010i4("", z41, z6 ? 1 : 0, z5 ? 1 : 0, z4 ? 1 : 0, z26 ? 1 : 0, z25 ? 1 : 0, z24 ? 1 : 0, z23 ? 1 : 0, z22 ? 1 : 0, z3 ? 1 : 0, z2 ? 1 : 0, 65532)));
        this.LLILZLL.LJIILIIL();
        this.LLILZLL.LJIILL();
        this.LLILZLL.LJ();
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zp, this);
        if (numLIZJ != null) {
            numLIZJ.intValue();
            View viewFindViewById2 = this.LLILZ;
            if (viewFindViewById2 == null) {
                viewFindViewById2 = findViewById(R.id.tsc);
                this.LLILZ = (LinearLayout) viewFindViewById2;
            }
            viewFindViewById2.setBackgroundColor(numLIZJ.intValue());
            TuxNavBar tuxNavBar2 = this.LLILLL;
            View view2 = tuxNavBar2;
            if (tuxNavBar2 == null) {
                View viewFindViewById3 = findViewById(R.id.y1z);
                this.LLILLL = (TuxNavBar) viewFindViewById3;
                view2 = viewFindViewById3;
            }
            ((TuxNavBar) view2).setNavBackground(numLIZJ.intValue());
            LLLLZIL().LJ();
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaMessageSettingActivity", "onCreate", false);
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
