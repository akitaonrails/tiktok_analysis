package com.ss.android.ugc.tiktok.pns.ui;

import X.C0HTI;
import X.C0OM1;
import X.C1104704Tt;
import X.C1251150ifB;
import X.C1308910kAL;
import X.C14EU;
import X.C1697810uHb;
import X.C299020Bno;
import X.C335910DEv;
import X.C444920HcY;
import X.C484220Iyq;
import X.C622680Oba;
import X.C785810Us7;
import X.C786410Ut5;
import X.EnumC20537515Xx;
import X.EnumC335920DEw;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.view.KeyEvent;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.router.SmartRouter;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.tiktok.pns.IPnSFamilyPairingService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS245S0000000_12;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.text.a0;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes13.dex */
public final class ManageByParentIntermediateActivity extends BaseActivity {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZjElIjs8I2s8Jzx9PSxiBCHELIOS49KSIpCzYDKTcpJzsaJjEpOyI2LCwtPSoSKzElPyYnMQ==";
    public TuxNavBar LL;
    public ImageView LLILLJJLI;
    public TuxTextView LLILLL;

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.tiktok.pns.ui.ManageByParentIntermediateActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.tiktok.pns.ui.ManageByParentIntermediateActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.tiktok.pns.ui.ManageByParentIntermediateActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.tiktok.pns.ui.ManageByParentIntermediateActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.tiktok.pns.ui.ManageByParentIntermediateActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        C622680Oba.LIZLLL(this);
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
        int i;
        int iIntValue;
        int iIntValue2;
        ActivityAgent.onTrace("com.ss.android.ugc.tiktok.pns.ui.ManageByParentIntermediateActivity", "onCreate", true);
        activityConfiguration(AFwS245S0000000_12.get$arr$(94));
        super.onCreate(bundle);
        setContentView(R.layout.c61);
        C622680Oba.LIZJ(this);
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.y1z);
            this.LL = (TuxNavBar) callbackFindViewById;
        }
        C0OM1 c0om1 = new C0OM1();
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_arrow_left_ltr;
        c1251150ifB.LIZLLL = true;
        c1251150ifB.LIZJ(new AwS556S0100000_12(this, 677));
        c0om1.LJ(c1251150ifB);
        ((TuxNavBar) callbackFindViewById).setNavActions(c0om1);
        C0HTI c0hti = new C0HTI();
        c0hti.LIZ = R.drawable.pk;
        Drawable drawableLIZ = c0hti.LIZ(this);
        KeyEvent.Callback callbackFindViewById2 = this.LLILLJJLI;
        if (callbackFindViewById2 == null) {
            callbackFindViewById2 = findViewById(R.id.nxk);
            this.LLILLJJLI = (ImageView) callbackFindViewById2;
        }
        ((ImageView) callbackFindViewById2).setImageDrawable(drawableLIZ);
        int intExtra = getIntent().getIntExtra("last_page_type", -1);
        SpannableString spannableString = new SpannableString(getString(2131846671, getString(2131829013), getString(2131821659)));
        String string = getString(2131829013);
        String string2 = getString(2131821659);
        int iLJJJ = a0.LJJJ(spannableString, string, 0, false, 6);
        int iLJJJ2 = a0.LJJJ(spannableString, string2, 0, false, 6);
        if (iLJJJ >= 0) {
            C786410Ut5.p2(spannableString, new C444920HcY(32, false), iLJJJ, string.length() + iLJJJ, 33);
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, this);
            if (numLIZJ != null) {
                iIntValue2 = numLIZJ.intValue();
            } else {
                iIntValue2 = 0;
            }
            C786410Ut5.p2(spannableString, new ForegroundColorSpan(iIntValue2), iLJJJ, string.length() + iLJJJ, 33);
        }
        if (iLJJJ2 >= 0) {
            C786410Ut5.p2(spannableString, new C785810Us7(this, 3), iLJJJ2, string2.length() + iLJJJ2, 33);
            C786410Ut5.p2(spannableString, new C444920HcY(32, false), iLJJJ2, string2.length() + iLJJJ2, 33);
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1h, this);
            if (numLIZJ2 != null) {
                iIntValue = numLIZJ2.intValue();
            } else {
                iIntValue = 0;
            }
            C786410Ut5.p2(spannableString, new ForegroundColorSpan(iIntValue), iLJJJ2, string2.length() + iLJJJ2, 33);
        }
        IPnSFamilyPairingService.LIZ.getClass();
        if (C1104704Tt.LIZ().LIZIZ() == EnumC20537515Xx.CHILD) {
            KeyEvent.Callback callbackFindViewById3 = this.LLILLL;
            if (callbackFindViewById3 == null) {
                callbackFindViewById3 = findViewById(R.id.nxl);
                this.LLILLL = (TuxTextView) callbackFindViewById3;
            }
            TextView textView = (TextView) callbackFindViewById3;
            textView.setText(spannableString);
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        } else {
            KeyEvent.Callback callbackFindViewById4 = this.LLILLL;
            if (callbackFindViewById4 == null) {
                callbackFindViewById4 = findViewById(R.id.nxl);
                this.LLILLL = (TuxTextView) callbackFindViewById4;
            }
            TextView textView2 = (TextView) callbackFindViewById4;
            if (intExtra == 0) {
                i = 2131846673;
            } else {
                i = 2131834376;
            }
            textView2.setText(getString(i));
        }
        ActivityAgent.onTrace("com.ss.android.ugc.tiktok.pns.ui.ManageByParentIntermediateActivity", "onCreate", false);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onParentalModeChanged(C484220Iyq c484220Iyq) {
        if (TextUtils.equals("guardian_platform_child_unlink", JSONObjectProtectorUtils.getString(c484220Iyq.LIZ, "eventName"))) {
            finish();
            SmartRouter.buildRoute(this, "aweme://setting").open();
            ComplianceServiceProvider.LJIL().LJJIJL(null, "");
        }
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
