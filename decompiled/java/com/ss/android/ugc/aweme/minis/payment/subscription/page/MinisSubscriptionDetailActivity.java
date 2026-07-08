package com.ss.android.ugc.aweme.minis.payment.subscription.page;

import X.AbstractC1250290idn;
import X.AbstractC1335900krs;
import X.C08S3;
import X.C0HTI;
import X.C0OM1;
import X.C1017903yT;
import X.C1227904rF;
import X.C1232610iBH;
import X.C1232790iBZ;
import X.C1232880iBi;
import X.C1251150ifB;
import X.C127K;
import X.C1308910kAL;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1378990lzN;
import X.C1390410mHn;
import X.C1697810uHb;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C197039127h;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2195221Avo;
import X.C2196291AxX;
import X.C2196681AyA;
import X.C2344009Gk;
import X.C299020Bno;
import X.C335910DEv;
import X.C418440Gaw;
import X.C427870Gq9;
import X.C786410Ut5;
import X.C801280Vby;
import X.C814420VxA;
import X.C960203pA;
import X.EnumC1216700hlc;
import X.EnumC1232660iBM;
import X.EnumC1232870iBh;
import X.EnumC335920DEw;
import X.InterfaceC1232530iB9;
import X.InterfaceC197023126r;
import X.ViewOnClickListenerC1232630iBJ;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.immersionbar.ImmersionBar;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.system.TuxImmersionBar;
import com.ss.android.ugc.aweme.minis.common.SchemaParserData;
import com.ss.android.ugc.aweme.minis.model.MinisMetaResp;
import com.ss.android.ugc.aweme.minis.model.payment.common.MinisPaymentNetworkResponse;
import com.ss.android.ugc.aweme.minis.model.payment.subscription.MinisSubscriptionInfo;
import com.ss.android.ugc.aweme.minis.model.payment.subscription.TiktokMinisSubscriptionListRequest;
import com.ss.android.ugc.aweme.minis.model.payment.subscription.TiktokMinisSubscriptionListResponse;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class MinisSubscriptionDetailActivity extends BaseActivity {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiglJyYgZjUtMCI2JjFiOjoxOyY+HELIOSID8nISoiZz8yLyBiBCY9ITYfPC0gKzclOTs6JysILDsyISkNKjs6Piw4MA==";
    public TuxNavBar LL;
    public C1390410mHn LLILLJJLI;
    public RelativeLayout LLILLL;
    public C1749280vcc LLILZ;
    public RelativeLayout LLILZIL;
    public TuxTextView LLILZLL;
    public TuxTextView LLIZ;
    public C127K LLIZLLLIL;
    public C127K LLJ;
    public C127K LLJI;
    public C427870Gq9 LLJIJIL;
    public C197039127h LLJILJIL;
    public C197039127h LLJILJILJ;
    public C197039127h LLJILLL;
    public C197039127h LLJJ;
    public MinisSubscriptionConfirmCancelFragment LLJJI;
    public MinisSubscriptionConfirmGpStoreFragment LLJJIII;
    public MinisPaymentNetworkResponse<TiktokMinisSubscriptionListResponse> LLJJIJIIJIL;
    public MinisSubscriptionInfo LLJJIJIL;
    public String LLJJJ;
    public final C1232790iBZ LLJJIJI = new C1232790iBZ();
    public final ViewOnClickListenerC1232630iBJ LLJJJIL = new View.OnClickListener() { // from class: X.0iBJ
        /* JADX WARN: Removed duplicated region for block: B:104:0x0248 A[PHI: r9
          0x0248: PHI (r9v2 java.lang.String) = (r9v0 java.lang.String), (r9v3 java.lang.String) binds: [B:70:0x01b8, B:68:0x01b5] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:96:0x0219  */
        /* JADX WARN: Removed duplicated region for block: B:98:0x021e  */
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
        @Override // android.view.View.OnClickListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void onClick(android.view.View r14) {
            /*
                Method dump skipped, instruction units count: 633
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: X.ViewOnClickListenerC1232630iBJ.onClick(android.view.View):void");
        }
    };

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.minis.payment.subscription.page.MinisSubscriptionDetailActivity", "onResume", true);
        super.onResume();
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onResume, instance:");
        sbLIZ.append(this);
        C2188811AlT.LIZIZ(sbLIZ);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.minis.payment.subscription.page.MinisSubscriptionDetailActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.minis.payment.subscription.page.MinisSubscriptionDetailActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.minis.payment.subscription.page.MinisSubscriptionDetailActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.minis.payment.subscription.page.MinisSubscriptionDetailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void LLLLLZL() {
        int i = C2187451AjH.LIZ;
        String strLIZ = C1017903yT.LIZ();
        SchemaParserData schemaParserData = C2195221Avo.LJII;
        TiktokMinisSubscriptionListRequest tiktokMinisSubscriptionListRequest = new TiktokMinisSubscriptionListRequest(null, strLIZ, schemaParserData != null ? schemaParserData.LIZ() : "");
        final long jCurrentTimeMillis = System.currentTimeMillis();
        this.LLJJIJI.LIZ(tiktokMinisSubscriptionListRequest, new InterfaceC1232530iB9() { // from class: X.0iBR
            /* JADX WARN: Removed duplicated region for block: B:21:0x0053  */
            /* JADX WARN: Removed duplicated region for block: B:53:0x0132  */
            /* JADX WARN: Removed duplicated region for block: B:55:0x0137  */
            /* JADX WARN: Removed duplicated region for block: B:58:0x0144  */
            /* JADX WARN: Removed duplicated region for block: B:63:0x0150 A[PHI: r1
              0x0150: PHI (r1v5 java.util.Map<java.lang.String, com.ss.android.ugc.aweme.minis.model.payment.subscription.MinisSubscriptionInfo>) = 
              (r1v4 java.util.Map<java.lang.String, com.ss.android.ugc.aweme.minis.model.payment.subscription.MinisSubscriptionInfo>)
              (r1v9 java.util.Map<java.lang.String, com.ss.android.ugc.aweme.minis.model.payment.subscription.MinisSubscriptionInfo>)
              (r1v9 java.util.Map<java.lang.String, com.ss.android.ugc.aweme.minis.model.payment.subscription.MinisSubscriptionInfo>)
             binds: [B:61:0x014d, B:47:0x0123, B:49:0x0127] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:64:0x0152  */
            @Override // X.InterfaceC1232530iB9
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ(boolean r14, com.ss.android.ugc.aweme.minis.model.payment.common.MinisPaymentNetworkResponse<com.ss.android.ugc.aweme.minis.model.payment.subscription.TiktokMinisSubscriptionListResponse> r15, java.lang.Throwable r16) {
                /*
                    Method dump skipped, instruction units count: 377
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1232710iBR.LIZ(boolean, com.ss.android.ugc.aweme.minis.model.payment.common.MinisPaymentNetworkResponse, java.lang.Throwable):void");
            }
        });
    }

    @Override // X.ActivityC21503719Dn, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        super.onBackPressed();
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
        int iIntValue;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.minis.payment.subscription.page.MinisSubscriptionDetailActivity", "onCreate", true);
        super.onCreate(bundle);
        C2196681AyA.LIZ.getClass();
        C2196681AyA.LJFF(this);
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onCreate, instance:");
        sbLIZ.append(this);
        C2188811AlT.LIZIZ(sbLIZ);
        setContentView(R.layout.dnr);
        MinisSubscriptionInfo minisSubscriptionInfo = (MinisSubscriptionInfo) getIntent().getParcelableExtra("intent_key_subscription_detail_data");
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
        c1251150ifB.LIZ = new InterfaceC197023126r() { // from class: X.0iBN
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
        this.LLILLJJLI = (C1390410mHn) findViewById(R.id.gap);
        this.LLILLL = (RelativeLayout) findViewById(R.id.eux);
        this.LLILZ = (C1749280vcc) findViewById(R.id.ogt);
        this.LLILZIL = (RelativeLayout) findViewById(R.id.t4d);
        this.LLJIJIL = (C427870Gq9) findViewById(R.id.vmc);
        findViewById(R.id.mqh);
        C197039127h c197039127h = (C197039127h) findViewById(R.id.cru);
        this.LLJILJIL = c197039127h;
        if (c197039127h != null) {
            C786410Ut5.U8(c197039127h, this.LLJJJIL);
        }
        C197039127h c197039127h2 = (C197039127h) findViewById(R.id.ct4);
        this.LLJILLL = c197039127h2;
        if (c197039127h2 != null) {
            C786410Ut5.U8(c197039127h2, this.LLJJJIL);
        }
        C197039127h c197039127h3 = (C197039127h) findViewById(R.id.cug);
        this.LLJJ = c197039127h3;
        if (c197039127h3 != null) {
            C786410Ut5.U8(c197039127h3, this.LLJJJIL);
        }
        C197039127h c197039127h4 = (C197039127h) findViewById(R.id.cql);
        this.LLJILJILJ = c197039127h4;
        if (c197039127h4 != null) {
            C786410Ut5.U8(c197039127h4, this.LLJJJIL);
        }
        TuxTextView tuxTextView = (TuxTextView) findViewById(R.id.zxn);
        this.LLILZLL = tuxTextView;
        if (tuxTextView != null) {
            tuxTextView.LJJJJI(28.0f);
        }
        this.LLIZ = (TuxTextView) findViewById(R.id.zxo);
        C127K c127k = (C127K) findViewById(R.id.dlu);
        this.LLIZLLLIL = c127k;
        if (c127k != null) {
            c127k.setCellEnabled(true);
        }
        C127K c127k2 = this.LLIZLLLIL;
        if (c127k2 != null) {
            c127k2.setIconEnableColor(R.attr.a1h);
        }
        C127K c127k3 = this.LLIZLLLIL;
        if (c127k3 != null) {
            c127k3.setTitle("Subscription debug");
        }
        C127K c127k4 = this.LLIZLLLIL;
        if (c127k4 != null) {
            c127k4.setSubtitle("All subscription expiration periods are set to 5 minutes and will automatically renew upon expiration.");
        }
        C127K c127k5 = (C127K) findViewById(R.id.dlt);
        this.LLJ = c127k5;
        if (c127k5 != null) {
            c127k5.setCellEnabled(true);
        }
        C127K c127k6 = this.LLJ;
        if (c127k6 != null) {
            c127k6.setIconEnableColor(R.attr.a1h);
        }
        C127K c127k7 = (C127K) findViewById(R.id.dlf);
        this.LLJI = c127k7;
        if (c127k7 != null) {
            c127k7.setCellEnabled(true);
        }
        C127K c127k8 = this.LLJI;
        if (c127k8 != null) {
            c127k8.setIconEnableColor(R.attr.a1h);
        }
        C1378990lzN.LIZIZ(findViewById(R.id.mqf), Float.valueOf(C418440Gaw.LIZIZ(8)), Float.valueOf(C418440Gaw.LIZIZ(8)), Float.valueOf(C418440Gaw.LIZIZ(8)), Float.valueOf(C418440Gaw.LIZIZ(8)), null, 16);
        if (minisSubscriptionInfo == null) {
            t4(true);
            LLLLLZL();
        } else {
            this.LLJJIJIL = minisSubscriptionInfo;
            this.LLJJJ = minisSubscriptionInfo.subscriptionId;
            t4(false);
            LLLLZI(minisSubscriptionInfo, true);
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.minis.payment.subscription.page.MinisSubscriptionDetailActivity", "onCreate", false);
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

    public final void t4(boolean z) {
        if (z) {
            C1390410mHn c1390410mHn = this.LLILLJJLI;
            if (c1390410mHn != null) {
                C786410Ut5.LLLZZIL(c1390410mHn, 0);
            }
            C1390410mHn c1390410mHn2 = this.LLILLJJLI;
            if (c1390410mHn2 != null) {
                c1390410mHn2.LIZJ();
            }
            RelativeLayout relativeLayout = this.LLILLL;
            if (relativeLayout != null) {
                C786410Ut5.LLIIL(relativeLayout, 8);
                return;
            }
            return;
        }
        C1390410mHn c1390410mHn3 = this.LLILLJJLI;
        if (c1390410mHn3 != null) {
            C786410Ut5.LLLZZIL(c1390410mHn3, 8);
        }
        C1390410mHn c1390410mHn4 = this.LLILLJJLI;
        if (c1390410mHn4 != null) {
            c1390410mHn4.LIZLLL();
        }
        RelativeLayout relativeLayout2 = this.LLILLL;
        if (relativeLayout2 == null) {
            return;
        }
        C786410Ut5.LLIIL(relativeLayout2, 0);
    }

    public final void LLLLZI(MinisSubscriptionInfo minisSubscriptionInfo, boolean z) {
        String string;
        long jLongValue;
        long jLongValue2;
        long jLongValue3;
        int i;
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("refreshUI, minisSubscriptionInfo:");
        sbLIZ.append(minisSubscriptionInfo);
        C2188811AlT.LIZIZ(sbLIZ);
        LLLLZIL(false, z);
        final String str = minisSubscriptionInfo.clientIcon;
        C427870Gq9 c427870Gq9 = this.LLJIJIL;
        if (c427870Gq9 != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("loadIconImg, minisIconUrl:");
            sbLIZ2.append(str);
            C2188811AlT.LIZIZ(sbLIZ2);
            if (str != null) {
                C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
                c1331670kl3LJIIIZ.LJJ(c427870Gq9);
                c1331670kl3LJIIIZ.LIZLLL("MinisStatusView");
                c1331670kl3LJIIIZ.LJIIJ(new AbstractC1335900krs() { // from class: X.0iML
                    @Override // X.InterfaceC427850Gq7
                    public final void cm(Uri uri, View view, Throwable th) {
                        int i3 = C2187451AjH.LIZ;
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("onFailed，url:");
                        sbLIZ3.append(uri);
                        sbLIZ3.append(", minisIconUrl:");
                        sbLIZ3.append(str);
                        sbLIZ3.append(", view:");
                        sbLIZ3.append(view);
                        sbLIZ3.append(", throwable:");
                        sbLIZ3.append(th);
                        C2188811AlT.LIZIZ(sbLIZ3);
                    }

                    @Override // X.InterfaceC427850Gq7
                    public final void Ad(Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
                        int i3 = C2187451AjH.LIZ;
                    }
                });
            }
        }
        String str2 = minisSubscriptionInfo.minisDesc;
        TuxTextView tuxTextView = this.LLIZ;
        String str3 = "";
        if (tuxTextView != null) {
            if (str2 == null) {
                str2 = "";
            }
            tuxTextView.setText(str2);
        }
        C127K c127k = this.LLIZLLLIL;
        if (c127k != null) {
            if (Intrinsics.LJFF(minisSubscriptionInfo.isMock, Boolean.TRUE)) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LLZLL(c127k, i);
        }
        String str4 = minisSubscriptionInfo.clientName;
        TuxTextView tuxTextView2 = this.LLILZLL;
        if (tuxTextView2 != null) {
            if (str4 == null) {
                str4 = "";
            }
            tuxTextView2.setText(str4);
        }
        String str5 = minisSubscriptionInfo.status;
        Integer num = minisSubscriptionInfo.deductCycle;
        if (num == null) {
            string = "";
        } else {
            int iIntValue = num.intValue();
            EnumC1232870iBh.Companion.getClass();
            EnumC1232870iBh enumC1232870iBh = EnumC1232870iBh.map.get(Integer.valueOf(iIntValue));
            if (enumC1232870iBh == null) {
                string = "";
            } else {
                switch (C1232880iBi.LIZ[enumC1232870iBh.ordinal()]) {
                    case 2:
                        string = getString(2131822320);
                        break;
                    case 3:
                        string = getString(2131822305);
                        break;
                    case 4:
                        string = getString(2131822321);
                        break;
                    case 5:
                        string = getString(2131822324);
                        break;
                    case 6:
                        string = getString(2131822323);
                        break;
                    case 7:
                        string = getString(2131822322);
                        break;
                    default:
                        string = "";
                        break;
                }
            }
        }
        C127K c127k2 = this.LLJ;
        if (c127k2 != null) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(minisSubscriptionInfo.symbol);
            sbLIZ3.append(minisSubscriptionInfo.amount);
            sbLIZ3.append(' ');
            sbLIZ3.append(string);
            c127k2.setTitle(C2188811AlT.LIZIZ(sbLIZ3));
        }
        String str6 = minisSubscriptionInfo.clientName;
        if (str6 == null) {
            str6 = "";
        }
        long jLongValue4 = 0;
        if (Intrinsics.LJFF(str5, EnumC1232660iBM.ACTIVE.getValue())) {
            Long l = minisSubscriptionInfo.nextDeductTime;
            if (l != null) {
                jLongValue4 = l.longValue();
            }
            String strLIZ = C801280Vby.LIZ(jLongValue4);
            C127K c127k3 = this.LLJI;
            if (c127k3 != null) {
                c127k3.setTitle(getString(2131822290, strLIZ));
            }
            String string2 = getString(2131822291);
            C197039127h c197039127h = this.LLJILJIL;
            if (c197039127h != null) {
                c197039127h.setText(string2);
            }
        } else if (Intrinsics.LJFF(str5, EnumC1232660iBM.CANCELED.getValue())) {
            Long l2 = minisSubscriptionInfo.endTime;
            if (l2 != null) {
                jLongValue3 = l2.longValue();
            } else {
                jLongValue3 = 0;
            }
            String strLIZ2 = C801280Vby.LIZ(jLongValue3);
            C127K c127k4 = this.LLJI;
            if (c127k4 != null) {
                c127k4.setTitle(getString(2131822317, strLIZ2));
            }
            C127K c127k5 = this.LLJI;
            if (c127k5 != null) {
                c127k5.setVariant(EnumC1216700hlc.DESTRUCTIVE);
            }
            Long l3 = minisSubscriptionInfo.cancelTime;
            if (l3 != null) {
                jLongValue4 = l3.longValue();
            }
            String strLIZ3 = C801280Vby.LIZ(jLongValue4);
            C127K c127k6 = this.LLJI;
            if (c127k6 != null) {
                c127k6.setSubtitle(getString(2131822315, strLIZ3));
            }
            C197039127h c197039127h2 = this.LLJILJIL;
            if (c197039127h2 != null) {
                c197039127h2.setText(getString(2131822316, str6));
            }
        } else if (Intrinsics.LJFF(str5, EnumC1232660iBM.ONHOLD.getValue())) {
            Long l4 = minisSubscriptionInfo.endTime;
            if (l4 != null) {
                jLongValue2 = l4.longValue();
            } else {
                jLongValue2 = 0;
            }
            String strLIZ4 = C801280Vby.LIZ(jLongValue2);
            C127K c127k7 = this.LLJI;
            if (c127k7 != null) {
                c127k7.setTitle(getString(2131822318, strLIZ4));
            }
            C127K c127k8 = this.LLJI;
            if (c127k8 != null) {
                c127k8.setVariant(EnumC1216700hlc.DESTRUCTIVE);
            }
            Long l5 = minisSubscriptionInfo.onholdEndTime;
            if (l5 != null) {
                jLongValue4 = l5.longValue();
            }
            String strLIZ5 = C801280Vby.LIZ(jLongValue4);
            C127K c127k9 = this.LLJI;
            if (c127k9 != null) {
                c127k9.setSubtitle(getString(2131822319, strLIZ5));
            }
            String string3 = getString(2131822285);
            C197039127h c197039127h3 = this.LLJILJIL;
            if (c197039127h3 != null) {
                c197039127h3.setText(string3);
            }
        } else if (Intrinsics.LJFF(str5, EnumC1232660iBM.EXPIRED.getValue())) {
            Long l6 = minisSubscriptionInfo.endTime;
            if (l6 != null) {
                jLongValue = l6.longValue();
            } else {
                jLongValue = 0;
            }
            String strLIZ6 = C801280Vby.LIZ(jLongValue);
            C127K c127k10 = this.LLJI;
            if (c127k10 != null) {
                c127k10.setTitle(getString(2131822318, strLIZ6));
            }
            C127K c127k11 = this.LLJI;
            if (c127k11 != null) {
                c127k11.setVariant(EnumC1216700hlc.DESTRUCTIVE);
            }
            Long l7 = minisSubscriptionInfo.cancelTime;
            if ((l7 != null && l7.longValue() != 0) || (l7 = minisSubscriptionInfo.endTime) != null) {
                jLongValue4 = l7.longValue();
            }
            String strLIZ7 = C801280Vby.LIZ(jLongValue4);
            C127K c127k12 = this.LLJI;
            if (c127k12 != null) {
                c127k12.setSubtitle(getString(2131822315, strLIZ7));
            }
            C197039127h c197039127h4 = this.LLJILJIL;
            if (c197039127h4 != null) {
                c197039127h4.setText(getString(2131822316, str6));
            }
        }
        String str7 = minisSubscriptionInfo.clientKey;
        if (str7 == null) {
            str7 = "";
        }
        SchemaParserData.Companion.getClass();
        String strLIZ8 = C2196291AxX.LIZ(str7);
        String str8 = minisSubscriptionInfo.tierId;
        if (str8 == null) {
            str8 = "";
        }
        String str9 = minisSubscriptionInfo.symbol;
        String str10 = minisSubscriptionInfo.amount;
        Integer num2 = minisSubscriptionInfo.deductCycle;
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append(str9);
        sbLIZ4.append(str10);
        sbLIZ4.append('/');
        sbLIZ4.append(num2);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ4);
        C1232610iBH c1232610iBH = C1232610iBH.LIZ;
        if (str5 != null) {
            str3 = str5;
        }
        c1232610iBH.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJFF("minis_id", str7);
        c2344009Gk.LJFF("minis_type", strLIZ8);
        c2344009Gk.LJFF("product_id", str8);
        c2344009Gk.LJFF("product_name", strLIZIZ);
        c2344009Gk.LJFF("sub_status", str3);
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("onSubscriptionDetailPageShow, ");
        C1227904rF c1227904rF = C1227904rF.LIZ;
        Map<String, String> map = c2344009Gk.LIZ;
        c1227904rF.getClass();
        sbLIZ5.append(C1227904rF.LJI(map));
        C2188811AlT.LIZIZ(sbLIZ5);
        C08S3 c08s3 = C08S3.LIZ;
        Map<String, String> map2 = c2344009Gk.LIZ;
        c08s3.getClass();
        C08S3.LIZJ("tm_subscription_detail_page_show", map2);
    }

    public final void LLLLZIL(boolean z, boolean z2) {
        String str;
        String str2;
        MinisMetaResp minisMetaResp = C2195221Avo.LJIIJ;
        if (minisMetaResp == null || (str = minisMetaResp.name) == null) {
            str = "";
        }
        if (z2) {
            String string = getString(2131822314);
            String string2 = getString(2131822312, str);
            C0HTI c0hti = new C0HTI();
            c0hti.LIZ = R.drawable.nd;
            Drawable drawableLIZ = c0hti.LIZ(this);
            C1749280vcc c1749280vcc = this.LLILZ;
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
        } else {
            String string3 = getString(2131822208);
            C0HTI c0hti2 = new C0HTI();
            c0hti2.LIZ = R.drawable.nj;
            Drawable drawableLIZ2 = c0hti2.LIZ(this);
            C1749280vcc c1749280vcc2 = this.LLILZ;
            if (c1749280vcc2 != null) {
                C1722300uv6 c1722300uv62 = new C1722300uv6();
                c1722300uv62.LIZJ = 0;
                c1722300uv62.LIZ = drawableLIZ2;
                c1722300uv62.LJI = string3;
                int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(130));
                int iLIZIZ4 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(96));
                c1722300uv62.LIZLLL = iLIZIZ3;
                c1722300uv62.LJ = iLIZIZ4;
                c1749280vcc2.setStatus(c1722300uv62);
            }
        }
        if (z2) {
            C197039127h c197039127h = this.LLJJ;
            if (c197039127h != null) {
                C786410Ut5.LLLLLLJ(c197039127h, 8);
            }
            if (!z) {
                C1749280vcc c1749280vcc3 = this.LLILZ;
                if (c1749280vcc3 != null) {
                    C786410Ut5.LLLZLZ(c1749280vcc3, 8);
                }
                RelativeLayout relativeLayout = this.LLILZIL;
                if (relativeLayout != null) {
                    C786410Ut5.LLIIL(relativeLayout, 0);
                }
                C197039127h c197039127h2 = this.LLJILJIL;
                if (c197039127h2 != null) {
                    C786410Ut5.LLLLLLJ(c197039127h2, 0);
                }
                C197039127h c197039127h3 = this.LLJILJILJ;
                if (c197039127h3 != null) {
                    C786410Ut5.LLLLLLJ(c197039127h3, 8);
                }
            } else {
                C1749280vcc c1749280vcc4 = this.LLILZ;
                if (c1749280vcc4 != null) {
                    C786410Ut5.LLLZLZ(c1749280vcc4, 0);
                }
                RelativeLayout relativeLayout2 = this.LLILZIL;
                if (relativeLayout2 != null) {
                    C786410Ut5.LLIIL(relativeLayout2, 8);
                }
                C197039127h c197039127h4 = this.LLJILJIL;
                if (c197039127h4 != null) {
                    C786410Ut5.LLLLLLJ(c197039127h4, 8);
                }
                C197039127h c197039127h5 = this.LLJILJILJ;
                if (c197039127h5 != null) {
                    C786410Ut5.LLLLLLJ(c197039127h5, 0);
                }
            }
            String strLIZ = C2195221Avo.LIZ();
            MinisSubscriptionInfo minisSubscriptionInfo = this.LLJJIJIL;
            if (minisSubscriptionInfo == null || ((str2 = minisSubscriptionInfo.clientKey) != null && str2.equals(strLIZ))) {
                C197039127h c197039127h6 = this.LLJILLL;
                if (c197039127h6 != null) {
                    C786410Ut5.LLLLLLJ(c197039127h6, 0);
                    return;
                }
                return;
            }
            C197039127h c197039127h7 = this.LLJILLL;
            if (c197039127h7 == null) {
                return;
            }
            C786410Ut5.LLLLLLJ(c197039127h7, 8);
            return;
        }
        C1749280vcc c1749280vcc5 = this.LLILZ;
        if (c1749280vcc5 != null) {
            C786410Ut5.LLLZLZ(c1749280vcc5, 0);
        }
        RelativeLayout relativeLayout3 = this.LLILZIL;
        if (relativeLayout3 != null) {
            C786410Ut5.LLIIL(relativeLayout3, 8);
        }
        C197039127h c197039127h8 = this.LLJJ;
        if (c197039127h8 != null) {
            C786410Ut5.LLLLLLJ(c197039127h8, 0);
        }
        C197039127h c197039127h9 = this.LLJILJIL;
        if (c197039127h9 != null) {
            C786410Ut5.LLLLLLJ(c197039127h9, 8);
        }
        C197039127h c197039127h10 = this.LLJILJILJ;
        if (c197039127h10 != null) {
            C786410Ut5.LLLLLLJ(c197039127h10, 8);
        }
        C197039127h c197039127h11 = this.LLJILLL;
        if (c197039127h11 == null) {
            return;
        }
        C786410Ut5.LLLLLLJ(c197039127h11, 8);
    }
}
