package com.ss.android.ugc.aweme.compliance.business.kidsmode;

import X.C01GW;
import X.C1238130iKB;
import X.C1308910kAL;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C1697810uHb;
import X.C1766570w4V;
import X.C1896207bk;
import X.C19241810Po;
import X.C20684815ws;
import X.C2344009Gk;
import X.C299020Bno;
import X.C335910DEv;
import X.C452501pT;
import X.C929103k9;
import X.EnumC335920DEw;
import X.InterfaceC1916090zxf;
import android.os.Bundle;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS232S0000000_4;
import kotlin.jvm.internal.AwS557S0100000_13;
import kotlin.jvm.internal.AwS592S0100000_13;

/* JADX INFO: loaded from: classes14.dex */
public final class KidsRelaunchPopup extends BaseActivity implements InterfaceC1916090zxf {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYjJD8/ISQiKip9HELIOSKjA/ICE2OzZiIiY3OygjLSp9AywoOh02JCQ5Jyw7GCo8PD8=";
    public final C01GW LL = C452501pT.LIZIZ(new AwS557S0100000_13(this, 114));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS557S0100000_13(this, 116));
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS557S0100000_13(this, 115));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS557S0100000_13(this, 118));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS557S0100000_13(this, 117));
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS557S0100000_13(this, 113));

    @Override // X.InterfaceC1916090zxf
    public final boolean getCanCollectConsent() {
        return false;
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.business.kidsmode.KidsRelaunchPopup", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.business.kidsmode.KidsRelaunchPopup", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.business.kidsmode.KidsRelaunchPopup", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.business.kidsmode.KidsRelaunchPopup", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.business.kidsmode.KidsRelaunchPopup", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final boolean LLLLLZL() {
        return ((Boolean) this.LLILLJJLI.getValue()).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0057 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onStop() {
        /*
            r4 = this;
            super.onStop()
            X.0mCc r0 = X.C1906580ziK.LJFF()
            if (r0 == 0) goto L28
            android.app.Activity r3 = r0.LIZIZ()
            r2 = 0
            if (r3 == 0) goto L29
            java.lang.Class r0 = r3.getClass()
            java.lang.String r1 = r0.getName()
            java.lang.String r0 = "KidsRelaunchPopup"
            boolean r1 = kotlin.text.a0.LJJIIZI(r1, r0, r2)
            r0 = 1
            if (r1 != r0) goto L29
        L21:
            android.content.Context r0 = com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer.getContext()
            if (r0 == 0) goto L6b
            goto L57
        L28:
            r3 = 0
        L29:
            r4.finish()
            if (r3 != 0) goto L37
            X.0XAv r0 = X.C844470XAv.LIZ
            r0.getClass()
            android.content.Context r3 = X.C844470XAv.LIZ()
        L37:
            java.lang.String r0 = "//ftc/relaunch"
            com.bytedance.router.SmartRoute r2 = com.bytedance.router.SmartRouter.buildRoute(r3, r0)
            X.01GW r0 = r4.LL
            java.lang.Object r1 = r0.getValue()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = "enter_from"
            r2.withParam(r0, r1)
            java.lang.String r1 = "is_sign_up"
            boolean r0 = r4.LLLLLZL()
            r2.withParam(r1, r0)
            r2.open()
            goto L21
        L57:
            android.view.Window r0 = r4.getWindow()     // Catch: java.lang.Throwable -> L67
            android.view.View r0 = r0.getDecorView()     // Catch: java.lang.Throwable -> L67
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()     // Catch: java.lang.Throwable -> L67
            r0.dispatchOnPreDraw()     // Catch: java.lang.Throwable -> L67
            goto L6b
        L67:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L6b:
            android.view.Window r0 = r4.getWindow()     // Catch: java.lang.Throwable -> L7b
            android.view.View r0 = r0.getDecorView()     // Catch: java.lang.Throwable -> L7b
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()     // Catch: java.lang.Throwable -> L7b
            r0.dispatchOnPreDraw()     // Catch: java.lang.Throwable -> L7b
            return
        L7b:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.compliance.business.kidsmode.KidsRelaunchPopup.onStop():void");
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.business.kidsmode.KidsRelaunchPopup", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.bca);
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZJ(C19241810Po.LIZ(), "is_in_personalized_nuj");
        c2344009Gk.LJFF("enter_from", (String) this.LL.getValue());
        C20684815ws.LJIILLIIL("show_relaunch_app_popup", c2344009Gk.LIZ);
        C1397580mTM c1397580mTM = new C1397580mTM(this);
        C929103k9.LIZ(c1397580mTM, (View) this.LLILLL.getValue(), AFwS232S0000000_4.get$arr$(238));
        c1397580mTM.LJI((String) this.LLILZ.getValue());
        c1397580mTM.LIZIZ((String) this.LLILZIL.getValue());
        C1238130iKB.LIZ(c1397580mTM, new AwS592S0100000_13(this, 93));
        c1397580mTM.LJII = false;
        new C1397510mTF(c1397580mTM).LJ();
        C1766570w4V c1766570w4V = C1766570w4V.LIZ;
        C1896207bk c1896207bk = new C1896207bk(this);
        c1766570w4V.getClass();
        C1766570w4V.LIZ(c1896207bk);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.business.kidsmode.KidsRelaunchPopup", "onCreate", false);
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
