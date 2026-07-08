package com.ss.android.ugc.aweme.minis.page;

import X.C08S3;
import X.C0OM1;
import X.C1077130e8V;
import X.C1222660hvE;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1308910kAL;
import X.C1378990lzN;
import X.C14EU;
import X.C1697810uHb;
import X.C1943007jI;
import X.C20642515q3;
import X.C2188811AlT;
import X.C2195221Avo;
import X.C2196681AyA;
import X.C2196701AyC;
import X.C2344009Gk;
import X.C299020Bno;
import X.C335910DEv;
import X.C418440Gaw;
import X.C484220Iyq;
import X.C508401yU;
import X.C622680Oba;
import X.C786410Ut5;
import X.C960203pA;
import X.EnumC1222070huH;
import X.EnumC1222620hvA;
import X.EnumC335920DEw;
import X.InterfaceC1141530foN;
import Y.ACListenerS154S0100000_19;
import Y.ARunnableS119S0100000_19;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.RelativeSizeSpan;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.immersionbar.ImmersionBar;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.system.TuxImmersionBar;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.minis.common.SchemaParserData;
import com.ss.android.ugc.aweme.minis.model.MinisMetaResp;
import com.ss.android.ugc.aweme.minis.page.MinisReportActivity;
import com.ss.android.ugc.aweme.minis.settings.MinisConfigSettings;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes20.dex */
public final class MinisReportActivity extends BaseActivity {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiglJyHELIOSYgZjUtLip9BSwiIDwBLTUjOzsSKzElPyYnMQ==";
    public TuxTextView LL;
    public View LLILLJJLI;
    public TuxNavBar LLILLL;
    public LinearLayout LLILZ;
    public LinearLayout LLILZIL;
    public LinearLayout LLILZLL;
    public FrameLayout LLIZ;
    public FrameLayout LLIZLLLIL;
    public LinearLayout LLJ;
    public LinearLayout LLJI;
    public FrameLayout LLJIJIL;
    public TuxTextView LLJILJIL;
    public String LLJILJILJ;
    public long LLJJI;
    public long LLJJIII;
    public MinisMetaResp LLJJIJI;
    public final String LLJILLL = C20642515q3.LJI(2131822262);
    public final String LLJJ = C20642515q3.LJI(2131822263);
    public final C1222660hvE LLJJIJIIJIL = new InterfaceC1141530foN() { // from class: X.0hvE
        @Override // X.InterfaceC1141530foN
        public final void mh2(C262100zr c262100zr) {
            if (Intrinsics.LJFF(c262100zr.LIZ, "minis.functionReportFinish")) {
                MinisReportActivity minisReportActivity = this.LL;
                minisReportActivity.runOnUiThread(new ARunnableS119S0100000_19(minisReportActivity, 83));
                C1548820qPI.LJIIIIZZ("minis.functionReportFinish", this);
            }
        }
    };

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.minis.page.MinisReportActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.minis.page.MinisReportActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.minis.page.MinisReportActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.minis.page.MinisReportActivity", "onResume", true);
        super.onResume();
        this.LLJJI = System.currentTimeMillis();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        MinisMetaResp minisMetaResp = this.LLJJIJI;
        sbLIZ.append(C1943007jI.LIZJ(minisMetaResp != null ? minisMetaResp.minisUrl : null));
        sbLIZ.append("/minis-ReportActivity");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C2196701AyC.LIZ.getClass();
        C2196701AyC.LJJI(strLIZIZ);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.minis.page.MinisReportActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        C508401yU c508401yU = C508401yU.LJIIJJI;
        if (c508401yU != null) {
            c508401yU.LIZLLL.LIZIZ(null);
            ((ArrayList) c508401yU.LIZJ).clear();
            C508401yU.LJIIJJI = null;
        }
        C622680Oba.LIZLLL(this);
        C2196681AyA.LIZ.getClass();
        C2196681AyA.LJI(this);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onPause() {
        super.onPause();
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LLJJI;
        if (jCurrentTimeMillis <= 0) {
            jCurrentTimeMillis = 0;
        }
        C2196701AyC.LIZ.getClass();
        C2196701AyC.LJJ(jCurrentTimeMillis, CardStruct.IStatusCode.DEFAULT);
        this.LLJJI = System.currentTimeMillis();
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

    /* JADX WARN: Removed duplicated region for block: B:23:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LLLLZI(X.EnumC1222640hvC r4) {
        /*
            com.ss.android.ugc.aweme.minis.settings.MinisConfigSettings$TtopMinisConfigModel r0 = com.ss.android.ugc.aweme.minis.settings.MinisConfigSettings.LIZ()
            com.ss.android.ugc.aweme.minis.settings.MinisConfigSettings$Report r0 = r0.report
            r3 = 1
            if (r0 == 0) goto L12
            boolean r0 = r0.minisReportRevampSwitch
            if (r0 != r3) goto L12
            r0 = 1
        Le:
            r2 = 0
            if (r0 != 0) goto L14
            return r2
        L12:
            r0 = 0
            goto Le
        L14:
            int[] r1 = X.C1222630hvB.LIZ
            int r0 = r4.ordinal()
            r1 = r1[r0]
            if (r1 == r3) goto L50
            r0 = 2
            if (r1 == r0) goto L45
            r0 = 3
            if (r1 == r0) goto L3a
            r0 = 4
            if (r1 != r0) goto L5b
            com.ss.android.ugc.aweme.minis.settings.MinisConfigSettings$TtopMinisConfigModel r0 = com.ss.android.ugc.aweme.minis.settings.MinisConfigSettings.LIZ()
            com.ss.android.ugc.aweme.minis.settings.MinisConfigSettings$Report r0 = r0.report
            if (r0 == 0) goto L5b
            java.lang.String r1 = r0.minisAdsReportRevampPageSchema
        L31:
            if (r1 == 0) goto L5b
            int r0 = r1.length()
            if (r0 <= 0) goto L5b
            return r1
        L3a:
            com.ss.android.ugc.aweme.minis.settings.MinisConfigSettings$TtopMinisConfigModel r0 = com.ss.android.ugc.aweme.minis.settings.MinisConfigSettings.LIZ()
            com.ss.android.ugc.aweme.minis.settings.MinisConfigSettings$Report r0 = r0.report
            if (r0 == 0) goto L5b
            java.lang.String r1 = r0.minisFeedbackReportRevampPageSchema
            goto L31
        L45:
            com.ss.android.ugc.aweme.minis.settings.MinisConfigSettings$TtopMinisConfigModel r0 = com.ss.android.ugc.aweme.minis.settings.MinisConfigSettings.LIZ()
            com.ss.android.ugc.aweme.minis.settings.MinisConfigSettings$Report r0 = r0.report
            if (r0 == 0) goto L5b
            java.lang.String r1 = r0.minisPaymentReportRevampPageSchema
            goto L31
        L50:
            com.ss.android.ugc.aweme.minis.settings.MinisConfigSettings$TtopMinisConfigModel r0 = com.ss.android.ugc.aweme.minis.settings.MinisConfigSettings.LIZ()
            com.ss.android.ugc.aweme.minis.settings.MinisConfigSettings$Report r0 = r0.report
            if (r0 == 0) goto L5b
            java.lang.String r1 = r0.minisExperienceReportRevampPageSchema
            goto L31
        L5b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.minis.page.MinisReportActivity.LLLLZI(X.0hvC):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLLLZL(X.EnumC1222640hvC r12) {
        /*
            r11 = this;
            java.lang.String r4 = X.C2195221Avo.LIZ()
            if (r4 != 0) goto L7
            return
        L7:
            com.ss.android.ugc.aweme.minis.model.MinisMetaResp r0 = r11.LLJJIJI
            if (r0 == 0) goto L3b
            java.lang.Integer r2 = r0.minisType
            X.0lzQ r0 = X.EnumC1379020lzQ.MINIS_TYPE_GAME
            int r1 = r0.ordinal()
            if (r2 == 0) goto L3b
            int r0 = r2.intValue()
            if (r0 != r1) goto L3b
            X.0lzQ r0 = X.EnumC1379020lzQ.MINIS_TYPE_GAME
            int r3 = r0.ordinal()
        L21:
            java.lang.Class<com.ss.android.ugc.aweme.minis.report.api.IMinisReportService> r5 = com.ss.android.ugc.aweme.minis.report.api.IMinisReportService.class
            r6 = 0
            r9 = 14
            r10 = 0
            r7 = r6
            r8 = r6
            java.lang.Object r2 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r5, r6, r7, r8, r9, r10)
            com.ss.android.ugc.aweme.minis.report.api.IMinisReportService r2 = (com.ss.android.ugc.aweme.minis.report.api.IMinisReportService) r2
            if (r2 == 0) goto L3a
            kotlin.jvm.internal.AwS455S0200000_19 r1 = new kotlin.jvm.internal.AwS455S0200000_19
            r0 = 7
            r1.<init>(r11, r12, r0)
            r2.LJII(r4, r12, r3, r1)
        L3a:
            return
        L3b:
            X.0lzQ r0 = X.EnumC1379020lzQ.MINIS_TYPE_APP
            int r3 = r0.ordinal()
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.minis.page.MinisReportActivity.LLLLLZL(X.0hvC):void");
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        TuxNavBar tuxNavBar;
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        LinearLayout linearLayout3;
        LinearLayout linearLayout4;
        LinearLayout linearLayout5;
        TuxTextView tuxTextView;
        FrameLayout frameLayout3;
        Object value;
        Map<String, String> mapLIZLLL;
        boolean z;
        boolean z2;
        int i;
        int i2;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.minis.page.MinisReportActivity", "onCreate", true);
        super.onCreate(bundle);
        this.LLJJIII = System.currentTimeMillis();
        C2196681AyA.LIZ.getClass();
        C2196681AyA.LJFF(this);
        String str = null;
        View viewSd = C786410Ut5.Sd(R.layout.jg, C786410Ut5.ne(this), null);
        this.LLILLJJLI = viewSd;
        if (viewSd != null) {
            tuxNavBar = (TuxNavBar) viewSd.findViewById(R.id.t8w);
        } else {
            tuxNavBar = null;
        }
        this.LLILLL = tuxNavBar;
        View view = this.LLILLJJLI;
        int i3 = 8;
        if (view != null && (frameLayout = (FrameLayout) view.findViewById(R.id.uil)) != null) {
            C1378990lzN.LIZIZ(frameLayout, Float.valueOf(C418440Gaw.LIZIZ(8)), null, null, null, null, 30);
        } else {
            frameLayout = null;
        }
        this.LLIZ = frameLayout;
        View view2 = this.LLILLJJLI;
        if (view2 != null && (frameLayout2 = (FrameLayout) view2.findViewById(R.id.uim)) != null) {
            C1378990lzN.LIZIZ(frameLayout2, Float.valueOf(C418440Gaw.LIZIZ(8)), null, null, null, null, 30);
        } else {
            frameLayout2 = null;
        }
        this.LLIZLLLIL = frameLayout2;
        View view3 = this.LLILLJJLI;
        if (view3 != null) {
            linearLayout = (LinearLayout) view3.findViewById(R.id.hvy);
        } else {
            linearLayout = null;
        }
        this.LLILZ = linearLayout;
        View view4 = this.LLILLJJLI;
        if (view4 != null) {
            linearLayout2 = (LinearLayout) view4.findViewById(R.id.q55);
        } else {
            linearLayout2 = null;
        }
        this.LLILZIL = linearLayout2;
        View view5 = this.LLILLJJLI;
        if (view5 != null) {
            linearLayout3 = (LinearLayout) view5.findViewById(R.id.violation_layout);
        } else {
            linearLayout3 = null;
        }
        this.LLILZLL = linearLayout3;
        View view6 = this.LLILLJJLI;
        if (view6 != null) {
            linearLayout4 = (LinearLayout) view6.findViewById(R.id.aii);
        } else {
            linearLayout4 = null;
        }
        this.LLJ = linearLayout4;
        View view7 = this.LLILLJJLI;
        if (view7 != null) {
            linearLayout5 = (LinearLayout) view7.findViewById(R.id.hwh);
        } else {
            linearLayout5 = null;
        }
        this.LLJI = linearLayout5;
        View view8 = this.LLILLJJLI;
        if (view8 != null) {
            tuxTextView = (TuxTextView) view8.findViewById(R.id.hwa);
        } else {
            tuxTextView = null;
        }
        this.LLJILJIL = tuxTextView;
        View view9 = this.LLILLJJLI;
        if (view9 != null && (frameLayout3 = (FrameLayout) view9.findViewById(R.id.hwb)) != null) {
            C1378990lzN.LIZIZ(frameLayout3, Float.valueOf(C418440Gaw.LIZIZ(8)), null, null, null, null, 30);
        } else {
            frameLayout3 = null;
        }
        this.LLJIJIL = frameLayout3;
        setContentView(this.LLILLJJLI);
        C2196701AyC c2196701AyC = C2196701AyC.LIZ;
        boolean z3 = !C960203pA.LIZIZ(this);
        c2196701AyC.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        if (z3) {
            value = EnumC1222620hvA.LIGHT.getValue();
        } else {
            value = EnumC1222620hvA.DARK;
        }
        c2344009Gk.LJ(value, "background");
        SchemaParserData schemaParserData = C2195221Avo.LJII;
        if (schemaParserData != null) {
            mapLIZLLL = schemaParserData.LIZLLL();
        } else {
            mapLIZLLL = null;
        }
        c2344009Gk.LJII(mapLIZLLL);
        C08S3 c08s3 = C08S3.LIZ;
        Map<String, String> map = c2344009Gk.LIZ;
        c08s3.getClass();
        C08S3.LIZJ("tm_report_page_show", map);
        this.LLJJIJI = (MinisMetaResp) getIntent().getParcelableExtra("MinisData");
        ImmersionBar immersionBarLJIILJJIL = ImmersionBar.LJIILJJIL(this);
        TuxImmersionBar tuxImmersionBar = new TuxImmersionBar(this, immersionBarLJIILJJIL);
        immersionBarLJIILJJIL.LJIIL();
        immersionBarLJIILJJIL.LJIIJJI();
        tuxImmersionBar.LJIIJJI();
        tuxImmersionBar.LIZ(false);
        immersionBarLJIILJJIL.LJIIJ(!C960203pA.LIZIZ(this));
        tuxImmersionBar.LIZLLL();
        TuxNavBar tuxNavBar2 = this.LLILLL;
        if (tuxNavBar2 != null) {
            C0OM1 c0om1 = new C0OM1();
            C1251150ifB c1251150ifB = new C1251150ifB();
            c1251150ifB.LIZLLL();
            c1251150ifB.LIZJ = R.raw.icon_chevron_left_ltr;
            c1251150ifB.LIZLLL = true;
            c1251150ifB.LIZJ(new AwS563S0100000_19(this, 3316));
            c0om1.LJ(c1251150ifB);
            C1250250idj c1250250idj = new C1250250idj();
            c1250250idj.LIZJ = getResources().getString(2131822227);
            c0om1.LIZJ = c1250250idj;
            tuxNavBar2.setNavActions(c0om1);
        }
        LinearLayout linearLayout6 = this.LLILZ;
        if (linearLayout6 != null) {
            C786410Ut5.R7(linearLayout6, new ACListenerS154S0100000_19(this, 286));
        }
        LinearLayout linearLayout7 = this.LLILZIL;
        if (linearLayout7 != null) {
            C786410Ut5.R7(linearLayout7, new ACListenerS154S0100000_19(this, 287));
        }
        MinisConfigSettings.Report report = MinisConfigSettings.LIZ().report;
        if (report != null && report.minisReportRevampSwitch) {
            z = true;
        } else {
            z = false;
        }
        LinearLayout linearLayout8 = this.LLJ;
        if (linearLayout8 != null) {
            if (z) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            C786410Ut5.LJZL(i2, linearLayout8);
        }
        LinearLayout linearLayout9 = this.LLJ;
        if (linearLayout9 != null) {
            C786410Ut5.R7(linearLayout9, new ACListenerS154S0100000_19(this, 284));
        }
        MinisConfigSettings.Report report2 = MinisConfigSettings.LIZ().report;
        if (report2 != null && report2.minisReportRevampSwitch) {
            z2 = true;
        } else {
            z2 = false;
        }
        TuxTextView tuxTextView2 = this.LLJILJIL;
        if (tuxTextView2 != null) {
            if (z2) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LLLLZLL(tuxTextView2, i);
        }
        FrameLayout frameLayout4 = this.LLJIJIL;
        if (frameLayout4 != null) {
            if (z2) {
                i3 = 0;
            }
            C786410Ut5.LJZ(i3, frameLayout4);
        }
        LinearLayout linearLayout10 = this.LLJI;
        if (linearLayout10 != null) {
            C786410Ut5.R7(linearLayout10, new ACListenerS154S0100000_19(this, 285));
        }
        LinearLayout linearLayout11 = this.LLILZLL;
        if (linearLayout11 != null) {
            C786410Ut5.R7(linearLayout11, new ACListenerS154S0100000_19(this, 288));
        }
        C1077130e8V c1077130e8V = new C1077130e8V(this, C1308910kAL.LIZJ(R.attr.a1h, this), 2);
        String strJ4 = C786410Ut5.j4(this.LLJILLL, Arrays.copyOf(new Object[]{this.LLJJ}, 1));
        int iLJJJ = a0.LJJJ(strJ4, this.LLJJ, 0, false, 6);
        SpannableString spannableString = new SpannableString(strJ4);
        C786410Ut5.p2(spannableString, c1077130e8V, iLJJJ, this.LLJJ.length() + iLJJJ, 33);
        C786410Ut5.p2(spannableString, new RelativeSizeSpan(1.118f), iLJJJ, this.LLJJ.length() + iLJJJ, 33);
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.t8_);
            this.LL = (TuxTextView) callbackFindViewById;
        }
        ((TextView) callbackFindViewById).setText(spannableString);
        KeyEvent.Callback callbackFindViewById2 = this.LL;
        if (callbackFindViewById2 == null) {
            callbackFindViewById2 = findViewById(R.id.t8_);
            this.LL = (TuxTextView) callbackFindViewById2;
        }
        ((TextView) callbackFindViewById2).setMovementMethod(LinkMovementMethod.getInstance());
        C622680Oba.LIZJ(this);
        MinisConfigSettings.UrlSetting urlSetting = MinisConfigSettings.LIZ().urlSetting;
        if (urlSetting != null) {
            str = urlSetting.communityGuidelines;
        }
        this.LLJILJILJ = str;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.minis.page.MinisReportActivity", "onCreate", false);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onJsBroadCastEvent(C484220Iyq c484220Iyq) {
        if (Intrinsics.LJFF(JSONObjectProtectorUtils.getString(c484220Iyq.LIZ, "eventName"), "minis_report_submit")) {
            C2196701AyC c2196701AyC = C2196701AyC.LIZ;
            boolean z = !C960203pA.LIZIZ(this);
            String value = EnumC1222070huH.SUCCESS.getValue();
            c2196701AyC.getClass();
            C2196701AyC.LJIJJLI("", "", value, z);
        }
    }

    @Override // X.ActivityC21503719Dn, androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
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
