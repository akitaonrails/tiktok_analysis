package com.ss.android.ugc.aweme.minis.page;

import X.C08S3;
import X.C0OM1;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1265730j2h;
import X.C1308910kAL;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1378990lzN;
import X.C1697810uHb;
import X.C1943007jI;
import X.C2095008Iq;
import X.C2188811AlT;
import X.C2195221Avo;
import X.C2196681AyA;
import X.C2196701AyC;
import X.C2344009Gk;
import X.C299020Bno;
import X.C335910DEv;
import X.C418440Gaw;
import X.C786410Ut5;
import X.C960203pA;
import X.EnumC1222620hvA;
import X.EnumC335920DEw;
import Y.ACListenerS168S0100000_34;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.immersionbar.ImmersionBar;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.system.TuxImmersionBar;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.minis.common.SchemaParserData;
import com.ss.android.ugc.aweme.minis.model.MinisMetaResp;
import com.zhiliaoapp.musically.R;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class MinisAboutActivity extends BaseActivity {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiglHELIOSJyYgZjUtLip9BSwiIDwSKio5PQ4wPCw6IDsq";
    public MinisMetaResp LL;
    public View LLILLJJLI;
    public TuxNavBar LLILLL;
    public long LLILZ;
    public int LLILZIL;
    public LinearLayout LLILZLL;
    public TuxTextView LLIZ;

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.minis.page.MinisAboutActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.minis.page.MinisAboutActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.minis.page.MinisAboutActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.minis.page.MinisAboutActivity", "onResume", true);
        super.onResume();
        this.LLILZ = System.currentTimeMillis();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        MinisMetaResp minisMetaResp = this.LL;
        sbLIZ.append(C1943007jI.LIZJ(minisMetaResp != null ? minisMetaResp.minisUrl : null));
        sbLIZ.append("/minis-AboutActivity");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C2196701AyC.LIZ.getClass();
        C2196701AyC.LJJI(strLIZIZ);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.minis.page.MinisAboutActivity", "onResume", false);
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
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LLILZ;
        if (jCurrentTimeMillis <= 0) {
            jCurrentTimeMillis = 0;
        }
        C2196701AyC.LIZ.getClass();
        C2196701AyC.LJJ(jCurrentTimeMillis, CardStruct.IStatusCode.DEFAULT);
        this.LLILZ = System.currentTimeMillis();
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

    public static String LLLLLZL(String str) {
        return UriProtector.parse("aweme://webview").buildUpon().appendQueryParameter("url", str).appendQueryParameter("use_spark", "1").toString();
    }

    public final String LLLLZI(String str) {
        MinisMetaResp minisMetaResp;
        String str2;
        Long lLJIILIIL;
        String str3;
        if (str == null) {
            return "";
        }
        if (Intrinsics.LJFF(str, getResources().getString(2131822197))) {
            MinisMetaResp minisMetaResp2 = this.LL;
            if (minisMetaResp2 != null && (str3 = minisMetaResp2.entity) != null) {
                return str3;
            }
        } else if (Intrinsics.LJFF(str, getResources().getString(2131822199)) && (minisMetaResp = this.LL) != null && (str2 = minisMetaResp.updateTime) != null && str2.length() != 0 && (lLJIILIIL = C2095008Iq.LJIILIIL(str2)) != null) {
            return new SimpleDateFormat("M/d/yyyy", Locale.getDefault()).format(new Date(lLJIILIIL.longValue() * ((long) LSPassThroughRecordSizeConfig.DEFAULT)));
        }
        return "";
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
        TuxTextView tuxTextView;
        EnumC1222620hvA enumC1222620hvA;
        Map<String, String> mapLIZLLL;
        View viewFindViewById;
        SmartImageView smartImageView;
        String str;
        View viewFindViewById2;
        LinearLayout linearLayout2;
        LinearLayout linearLayout3;
        View viewFindViewById3;
        TextView textView;
        TextView textView2;
        TuxTextView tuxTextView2;
        String str2;
        TuxTextView tuxTextView3;
        String str3;
        String str4;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.minis.page.MinisAboutActivity", "onCreate", true);
        super.onCreate(bundle);
        C2196681AyA.LIZ.getClass();
        C2196681AyA.LJFF(this);
        View viewFindViewById4 = null;
        View viewSd = C786410Ut5.Sd(R.layout.jd, C786410Ut5.ne(this), null);
        this.LLILLJJLI = viewSd;
        if (viewSd != null) {
            tuxNavBar = (TuxNavBar) viewSd.findViewById(R.id.ym);
        } else {
            tuxNavBar = null;
        }
        this.LLILLL = tuxNavBar;
        View view = this.LLILLJJLI;
        if (view != null) {
            view.findViewById(R.id.ye);
        }
        View view2 = this.LLILLJJLI;
        if (view2 != null) {
            view2.findViewById(R.id.yg);
        }
        View view3 = this.LLILLJJLI;
        if (view3 != null) {
            linearLayout = (LinearLayout) view3.findViewById(R.id.fgl);
        } else {
            linearLayout = null;
        }
        this.LLILZLL = linearLayout;
        View view4 = this.LLILLJJLI;
        if (view4 != null) {
            tuxTextView = (TuxTextView) view4.findViewById(R.id.fgn);
        } else {
            tuxTextView = null;
        }
        this.LLIZ = tuxTextView;
        setContentView(this.LLILLJJLI);
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
        } else {
            mapLIZLLL = null;
        }
        c2344009Gk.LJII(mapLIZLLL);
        C08S3 c08s3 = C08S3.LIZ;
        Map<String, String> map = c2344009Gk.LIZ;
        c08s3.getClass();
        C08S3.LIZJ("tm_about_page_show", map);
        this.LL = (MinisMetaResp) getIntent().getParcelableExtra("MinisData");
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
            c1251150ifB.LIZJ(new AwS563S0100000_19(this, 3313));
            c0om1.LJ(c1251150ifB);
            C1250250idj c1250250idj = new C1250250idj();
            c1250250idj.LIZJ = getResources().getString(2131822226);
            c0om1.LIZJ = c1250250idj;
            tuxNavBar2.setNavActions(c0om1);
        }
        View view5 = this.LLILLJJLI;
        if (view5 != null) {
            viewFindViewById = view5.findViewById(R.id.yf);
        } else {
            viewFindViewById = null;
        }
        C1378990lzN.LIZIZ(viewFindViewById, Float.valueOf(C418440Gaw.LIZIZ(8)), Float.valueOf(C418440Gaw.LIZIZ(8)), Float.valueOf(C418440Gaw.LIZIZ(8)), Float.valueOf(C418440Gaw.LIZIZ(8)), null, 16);
        View view6 = this.LLILLJJLI;
        if (view6 != null) {
            smartImageView = (SmartImageView) view6.findViewById(R.id.ofk);
        } else {
            smartImageView = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("iconUrl:");
        MinisMetaResp minisMetaResp = this.LL;
        if (minisMetaResp != null) {
            str = minisMetaResp.iconUrl;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        sbLIZ.append(", minisViewModel:");
        sbLIZ.append(this.LL);
        C2188811AlT.LIZIZ(sbLIZ);
        MinisMetaResp minisMetaResp2 = this.LL;
        if (minisMetaResp2 != null && (str4 = minisMetaResp2.iconUrl) != null) {
            C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str4);
            c1331670kl3LJIIIZ.LJJ(smartImageView);
            c1331670kl3LJIIIZ.LIZLLL("MinisLogoLoading");
            c1331670kl3LJIIIZ.LJJIIZ(R.drawable.cn0);
            c1331670kl3LJIIIZ.LJIIJ(new C1265730j2h(this, 4));
        }
        View view7 = this.LLILLJJLI;
        if (view7 != null && (tuxTextView3 = (TuxTextView) view7.findViewById(R.id.yq)) != null) {
            MinisMetaResp minisMetaResp3 = this.LL;
            if (minisMetaResp3 != null) {
                str3 = minisMetaResp3.name;
            } else {
                str3 = null;
            }
            tuxTextView3.setText(str3);
            tuxTextView3.setTuxFont(13);
            C786410Ut5.h9(tuxTextView3, new ACListenerS168S0100000_34(this, 41));
        }
        View view8 = this.LLILLJJLI;
        if (view8 != null && (tuxTextView2 = (TuxTextView) view8.findViewById(R.id.yp)) != null) {
            MinisMetaResp minisMetaResp4 = this.LL;
            if (minisMetaResp4 != null) {
                str2 = minisMetaResp4.description;
            } else {
                str2 = null;
            }
            tuxTextView2.setText(str2);
            tuxTextView2.setTuxFont(41);
            tuxTextView2.setMaxLines(4);
            tuxTextView2.setEllipsize(TextUtils.TruncateAt.END);
        }
        View view9 = this.LLILLJJLI;
        if (view9 != null) {
            viewFindViewById2 = view9.findViewById(R.id.yh);
        } else {
            viewFindViewById2 = null;
        }
        C1378990lzN.LIZIZ(viewFindViewById2, Float.valueOf(C418440Gaw.LIZIZ(8)), Float.valueOf(C418440Gaw.LIZIZ(8)), Float.valueOf(C418440Gaw.LIZIZ(8)), Float.valueOf(C418440Gaw.LIZIZ(8)), null, 16);
        View view10 = this.LLILLJJLI;
        if (view10 != null) {
            viewFindViewById4 = view10.findViewById(R.id.h79);
        }
        if (viewFindViewById4 != null && (textView2 = (TextView) viewFindViewById4.findViewById(R.id.yj)) != null) {
            textView2.setText(LLLLZI(viewFindViewById4.getResources().getString(2131822197)));
        }
        View view11 = this.LLILLJJLI;
        if (view11 != null && (viewFindViewById3 = view11.findViewById(R.id.m6f)) != null && (textView = (TextView) viewFindViewById3.findViewById(R.id.yj)) != null) {
            textView.setText(LLLLZI(viewFindViewById3.getResources().getString(2131822199)));
        }
        View view12 = this.LLILLJJLI;
        if (view12 != null && (linearLayout3 = (LinearLayout) view12.findViewById(R.id.ru8)) != null) {
            C786410Ut5.R7(linearLayout3, new ACListenerS168S0100000_34(this, 42));
        }
        View view13 = this.LLILLJJLI;
        if (view13 != null && (linearLayout2 = (LinearLayout) view13.findViewById(R.id.uu9)) != null) {
            C786410Ut5.R7(linearLayout2, new ACListenerS168S0100000_34(this, 43));
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.minis.page.MinisAboutActivity", "onCreate", false);
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
