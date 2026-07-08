package com.ss.android.ugc.aweme.minis.payment.subscription.page;

import X.AbstractC1250290idn;
import X.C08S3;
import X.C0HTI;
import X.C0OM1;
import X.C1227904rF;
import X.C1232610iBH;
import X.C1251150ifB;
import X.C1308910kAL;
import X.C1697810uHb;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C197039127h;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2196291AxX;
import X.C2196681AyA;
import X.C2344009Gk;
import X.C299020Bno;
import X.C335910DEv;
import X.C418440Gaw;
import X.C786410Ut5;
import X.C801280Vby;
import X.C814420VxA;
import X.C960203pA;
import X.EnumC335920DEw;
import X.InterfaceC197023126r;
import Y.ACListenerS154S0100000_19;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.immersionbar.ImmersionBar;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.system.TuxImmersionBar;
import com.ss.android.ugc.aweme.minis.common.SchemaParserData;
import com.ss.android.ugc.aweme.minis.model.payment.subscription.MinisSubscriptionInfo;
import com.zhiliaoapp.musically.R;
import java.util.Map;

/* JADX INFO: loaded from: classes20.dex */
public final class MinisSubscriptionCanceledActivity extends BaseActivity {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiglJyYgZjUtMCI2JjFiOjoxOyY+HELIOSID8nISoiZz8yLyBiBCY9ITYfPC0gKzclOTs6JysPKCEwLSkpLQ4wPCw6IDsq";
    public TuxNavBar LL;
    public C1749280vcc LLILLJJLI;
    public final ACListenerS154S0100000_19 LLILLL = new ACListenerS154S0100000_19(this, 115);

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.minis.payment.subscription.page.MinisSubscriptionCanceledActivity", "onResume", true);
        super.onResume();
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onResume, instance:");
        sbLIZ.append(this);
        C2188811AlT.LIZIZ(sbLIZ);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.minis.payment.subscription.page.MinisSubscriptionCanceledActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.minis.payment.subscription.page.MinisSubscriptionCanceledActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.minis.payment.subscription.page.MinisSubscriptionCanceledActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.minis.payment.subscription.page.MinisSubscriptionCanceledActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.ActivityC21503719Dn, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        super.onBackPressed();
        finish();
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onBackPressed, instance:");
        sbLIZ.append(this);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        C2196681AyA.LIZ.getClass();
        C2196681AyA.LJI(this);
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onDestroy, instance:");
        sbLIZ.append(this);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onPause() {
        super.onPause();
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPause, instance:");
        sbLIZ.append(this);
        C2188811AlT.LIZIZ(sbLIZ);
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
        String str;
        String str2;
        String str3;
        String str4;
        int iIntValue;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.minis.payment.subscription.page.MinisSubscriptionCanceledActivity", "onCreate", true);
        super.onCreate(bundle);
        C2196681AyA.LIZ.getClass();
        C2196681AyA.LJFF(this);
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onCreate, instance:");
        sbLIZ.append(this);
        C2188811AlT.LIZIZ(sbLIZ);
        setContentView(R.layout.dnq);
        long longExtra = getIntent().getLongExtra("intent_key_canceled_end_time", 0L);
        this.LL = (TuxNavBar) findViewById(R.id.aeb);
        ImmersionBar immersionBarLJIILJJIL = ImmersionBar.LJIILJJIL(this);
        TuxImmersionBar tuxImmersionBar = new TuxImmersionBar(this, immersionBarLJIILJJIL);
        immersionBarLJIILJJIL.LJIIL();
        immersionBarLJIILJJIL.LJIIJJI();
        tuxImmersionBar.LJIIJJI();
        tuxImmersionBar.LIZ(false);
        immersionBarLJIILJJIL.LJIIJ(!C960203pA.LIZIZ(this));
        tuxImmersionBar.LIZLLL();
        C0OM1 c0om1 = new C0OM1();
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LJI = true;
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_chevron_left_ltr;
        c1251150ifB.LIZIZ = "nav_back";
        c1251150ifB.LJIIIIZZ = "nav_back";
        c1251150ifB.LIZ = new InterfaceC197023126r() { // from class: X.0iBA
            @Override // X.InterfaceC197023126r
            public final void LIZ() {
                int i2 = C2187451AjH.LIZ;
                this.LIZ.finish();
            }
        };
        c0om1.LJ(c1251150ifB);
        c0om1.LIZIZ(new AbstractC1250290idn[0]);
        TuxNavBar tuxNavBar = this.LL;
        if (tuxNavBar != null) {
            tuxNavBar.setNavActions(c0om1);
            tuxNavBar.LJIIZILJ(false);
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zp, tuxNavBar.getContext());
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = 0;
            }
            tuxNavBar.setNavBackground(iIntValue);
        }
        this.LLILLJJLI = (C1749280vcc) findViewById(R.id.ogs);
        String strLIZ = C801280Vby.LIZ(longExtra);
        C0HTI c0hti = new C0HTI();
        c0hti.LIZ = R.drawable.mr;
        Drawable drawableLIZ = c0hti.LIZ(this);
        String string = getString(2131822327);
        String string2 = getString(2131822326, strLIZ);
        C1749280vcc c1749280vcc = this.LLILLJJLI;
        if (c1749280vcc != null) {
            C1722300uv6 c1722300uv6 = new C1722300uv6();
            c1722300uv6.LIZJ = 0;
            c1722300uv6.LIZ = drawableLIZ;
            c1722300uv6.LJI = string;
            c1722300uv6.LJIIIIZZ = string2;
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(130));
            int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(96));
            c1722300uv6.LIZLLL = iLIZIZ;
            c1722300uv6.LJ = iLIZIZ2;
            c1749280vcc.setStatus(c1722300uv6);
        }
        C197039127h c197039127h = (C197039127h) findViewById(R.id.cql);
        if (c197039127h != null) {
            C786410Ut5.U8(c197039127h, this.LLILLL);
        }
        MinisSubscriptionInfo minisSubscriptionInfo = (MinisSubscriptionInfo) getIntent().getParcelableExtra("intent_key_subscription_info");
        String str5 = "";
        if (minisSubscriptionInfo == null || (str = minisSubscriptionInfo.clientKey) == null) {
            str = "";
        }
        SchemaParserData.Companion.getClass();
        String strLIZ2 = C2196291AxX.LIZ(str);
        if (minisSubscriptionInfo != null && (str4 = minisSubscriptionInfo.tierId) != null) {
            str5 = str4;
        }
        Integer num = null;
        if (minisSubscriptionInfo != null) {
            str2 = minisSubscriptionInfo.symbol;
            str3 = minisSubscriptionInfo.amount;
            num = minisSubscriptionInfo.deductCycle;
        } else {
            str2 = null;
            str3 = null;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(str2);
        sbLIZ2.append(str3);
        sbLIZ2.append('/');
        sbLIZ2.append(num);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        C1232610iBH.LIZ.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJFF("minis_id", str);
        c2344009Gk.LJFF("minis_type", strLIZ2);
        c2344009Gk.LJFF("product_id", str5);
        c2344009Gk.LJFF("product_name", strLIZIZ);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("onSubscriptionCancelSuccessPageShow, ");
        C1227904rF c1227904rF = C1227904rF.LIZ;
        Map<String, String> map = c2344009Gk.LIZ;
        c1227904rF.getClass();
        sbLIZ3.append(C1227904rF.LJI(map));
        C2188811AlT.LIZIZ(sbLIZ3);
        C08S3 c08s3 = C08S3.LIZ;
        Map<String, String> map2 = c2344009Gk.LIZ;
        c08s3.getClass();
        C08S3.LIZJ("tm_subscription_cancel_success_page_show", map2);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.minis.payment.subscription.page.MinisSubscriptionCanceledActivity", "onCreate", false);
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
