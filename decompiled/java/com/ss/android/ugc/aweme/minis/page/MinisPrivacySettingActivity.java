package com.ss.android.ugc.aweme.minis.page;

import X.C08S3;
import X.C0OM1;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1308910kAL;
import X.C1697810uHb;
import X.C1943007jI;
import X.C2188811AlT;
import X.C2195221Avo;
import X.C2196681AyA;
import X.C2196701AyC;
import X.C2344009Gk;
import X.C299020Bno;
import X.C335910DEv;
import X.C786410Ut5;
import X.C960203pA;
import X.EnumC1222620hvA;
import X.EnumC335920DEw;
import Y.ACListenerS122S0200000_19;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.immersionbar.ImmersionBar;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.system.TuxImmersionBar;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.minis.common.SchemaParserData;
import com.ss.android.ugc.aweme.minis.model.MinisMetaResp;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class MinisPrivacySettingActivity extends BaseActivity {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiglJyYgZjHELIOSUtLip9BSwiIDwDOiw6KCwqGyA4PSY9LwQvPSYlITE1";
    public View LL;
    public TuxNavBar LLILLJJLI;
    public LinearLayout LLILLL;
    public MinisMetaResp LLILZ;
    public long LLILZIL;

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.minis.page.MinisPrivacySettingActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.minis.page.MinisPrivacySettingActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.minis.page.MinisPrivacySettingActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.minis.page.MinisPrivacySettingActivity", "onResume", true);
        super.onResume();
        this.LLILZIL = System.currentTimeMillis();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        MinisMetaResp minisMetaResp = this.LLILZ;
        sbLIZ.append(C1943007jI.LIZJ(minisMetaResp != null ? minisMetaResp.minisUrl : null));
        sbLIZ.append("/minis-PrivacySettingActivity");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C2196701AyC.LIZ.getClass();
        C2196701AyC.LJJI(strLIZIZ);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.minis.page.MinisPrivacySettingActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        C2196681AyA.LIZ.getClass();
        C2196681AyA.LJI(this);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onPause() {
        super.onPause();
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LLILZIL;
        if (jCurrentTimeMillis <= 0) {
            jCurrentTimeMillis = 0;
        }
        C2196701AyC.LIZ.getClass();
        C2196701AyC.LJJ(jCurrentTimeMillis, CardStruct.IStatusCode.DEFAULT);
        this.LLILZIL = System.currentTimeMillis();
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
        LinearLayout linearLayout;
        EnumC1222620hvA enumC1222620hvA;
        TuxIconView tuxIconView;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.minis.page.MinisPrivacySettingActivity", "onCreate", true);
        super.onCreate(bundle);
        C2196681AyA.LIZ.getClass();
        C2196681AyA.LJFF(this);
        Map<String, String> mapLIZLLL = null;
        View viewSd = C786410Ut5.Sd(R.layout.k3, C786410Ut5.ne(this), null);
        this.LL = viewSd;
        if (viewSd != null) {
            tuxNavBar = (TuxNavBar) viewSd.findViewById(R.id.rui);
        } else {
            tuxNavBar = null;
        }
        this.LLILLJJLI = tuxNavBar;
        View view = this.LL;
        if (view != null) {
            linearLayout = (LinearLayout) view.findViewById(R.id.ffp);
        } else {
            linearLayout = null;
        }
        this.LLILLL = linearLayout;
        setContentView(this.LL);
        C2196701AyC c2196701AyC = C2196701AyC.LIZ;
        boolean z = !C960203pA.LIZIZ(this);
        c2196701AyC.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        if (z) {
            enumC1222620hvA = EnumC1222620hvA.LIGHT;
        } else {
            enumC1222620hvA = EnumC1222620hvA.DARK;
        }
        c2344009Gk.LJFF("background", enumC1222620hvA.getValue());
        SchemaParserData schemaParserData = C2195221Avo.LJII;
        if (schemaParserData != null) {
            mapLIZLLL = schemaParserData.LIZLLL();
        }
        c2344009Gk.LJII(mapLIZLLL);
        C08S3 c08s3 = C08S3.LIZ;
        Map<String, String> map = c2344009Gk.LIZ;
        c08s3.getClass();
        C08S3.LIZJ("tm_privacy_settings_page_show", map);
        this.LLILZ = (MinisMetaResp) getIntent().getParcelableExtra("MinisData");
        ImmersionBar immersionBarLJIILJJIL = ImmersionBar.LJIILJJIL(this);
        TuxImmersionBar tuxImmersionBar = new TuxImmersionBar(this, immersionBarLJIILJJIL);
        immersionBarLJIILJJIL.LJIIL();
        immersionBarLJIILJJIL.LJIIJJI();
        tuxImmersionBar.LJIIJJI();
        tuxImmersionBar.LIZ(false);
        immersionBarLJIILJJIL.LJIIJ(!C960203pA.LIZIZ(this));
        tuxImmersionBar.LIZLLL();
        TuxNavBar tuxNavBar2 = this.LLILLJJLI;
        if (tuxNavBar2 != null) {
            C0OM1 c0om1 = new C0OM1();
            C1251150ifB c1251150ifB = new C1251150ifB();
            c1251150ifB.LIZLLL();
            c1251150ifB.LIZJ = R.raw.icon_chevron_left_ltr;
            c1251150ifB.LIZLLL = true;
            c1251150ifB.LIZJ(new AwS563S0100000_19(this, 3314));
            c0om1.LJ(c1251150ifB);
            C1250250idj c1250250idj = new C1250250idj();
            c1250250idj.LIZJ = getResources().getString(2131822228);
            c0om1.LIZJ = c1250250idj;
            tuxNavBar2.setNavActions(c0om1);
        }
        LinearLayout linearLayout2 = this.LLILLL;
        if (linearLayout2 != null && (tuxIconView = (TuxIconView) linearLayout2.findViewById(R.id.t8h)) != null) {
            tuxIconView.setIconRes(R.raw.icon_chevron_right_ltr);
            tuxIconView.setTintColorRes(R.attr.a1k);
        }
        LinearLayout linearLayout3 = this.LLILLL;
        if (linearLayout3 != null) {
            C786410Ut5.R7(linearLayout3, new ACListenerS122S0200000_19(this, linearLayout3, 86));
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.minis.page.MinisPrivacySettingActivity", "onCreate", false);
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
