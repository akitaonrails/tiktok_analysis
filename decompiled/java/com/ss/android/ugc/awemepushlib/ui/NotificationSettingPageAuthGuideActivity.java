package com.ss.android.ugc.awemepushlib.ui;

import X.C01GW;
import X.C09AZ;
import X.C0W9A;
import X.C1295960jpS;
import X.C1308910kAL;
import X.C1389600mGU;
import X.C1697810uHb;
import X.C1720106oR;
import X.C19ME;
import X.C20684815ws;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2344009Gk;
import X.C2451409j6;
import X.C299020Bno;
import X.C335910DEv;
import X.C336590DHl;
import X.C341940Daq;
import X.C452501pT;
import X.C786410Ut5;
import X.EnumC335920DEw;
import Y.ACListenerS139S0100000_4;
import Y.ALAdapterS1S0200000_4;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.api.INotificationSettingPageAuthGuideService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.awemepushlib.experiments.NotificationSettingPageAuthGuideAutoDismissCountExp;
import com.ss.android.ugc.awemepushlib.experiments.NotificationSettingPageAuthGuideAutoDismissCountSamsungExp;
import com.ss.android.ugc.awemepushlib.experiments.NotificationSettingPageAuthGuideAutoDismissCountXiaomiExp;
import com.ss.android.ugc.awemepushlib.experiments.NotificationSettingPageAuthGuideAutoDismissExp;
import com.ss.android.ugc.awemepushlib.experiments.NotificationSettingPageAuthGuideAutoDismissSamsungExp;
import com.ss.android.ugc.awemepushlib.experiments.NotificationSettingPageAuthGuideAutoDismissXiaomiExp;
import com.ss.android.ugc.awemepushlib.experiments.NotificationSettingPageAuthGuideMarginEndExp;
import com.ss.android.ugc.awemepushlib.experiments.NotificationSettingPageAuthGuideMarginTopExp;
import com.ss.android.ugc.awemepushlib.experiments.NotificationSettingPageAuthGuideSamsungMarginEndExp;
import com.ss.android.ugc.awemepushlib.experiments.NotificationSettingPageAuthGuideSamsungMarginTopExp;
import com.ss.android.ugc.awemepushlib.experiments.NotificationSettingPageAuthGuideXiaomiMarginEndExp;
import com.ss.android.ugc.awemepushlib.experiments.NotificationSettingPageAuthGuideXiaomiMarginTopExp;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS548S0100000_4;
import kotlin.jvm.internal.AwS583S0100000_4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class NotificationSettingPageAuthGuideActivity extends BaseActivity {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ODA/ISM6Kms5IGEdJzHELIOSElLyYwKTElJiEALTE4ICE0GCQrLA4mPC0LPCY3LQQvPSYlITE1";
    public C1295960jpS LL;
    public ConstraintLayout LLILLJJLI;
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS548S0100000_4(this, 303));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS548S0100000_4(this, 302));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS548S0100000_4(this, 304));

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.awemepushlib.ui.NotificationSettingPageAuthGuideActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.awemepushlib.ui.NotificationSettingPageAuthGuideActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.awemepushlib.ui.NotificationSettingPageAuthGuideActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.awemepushlib.ui.NotificationSettingPageAuthGuideActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.awemepushlib.ui.NotificationSettingPageAuthGuideActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.ActivityC21503719Dn, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI("NotificationSettingPageAuthGuideActivity", "onBackPressed");
        C336590DHl c336590DHl = C336590DHl.LIZ;
        String str = (String) this.LLILZ.getValue();
        String str2 = C2451409j6.LIZ() ? "1" : "2";
        c336590DHl.getClass();
        C336590DHl.LIZ(str, str2, false);
        super.onBackPressed();
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity
    public final void finish() {
        super.finish();
        try {
            C1389600mGU.LIZIZ(this);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        overridePendingTransition(0, 0);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        this.LL = null;
        this.LLILLJJLI = null;
        INotificationSettingPageAuthGuideService iNotificationSettingPageAuthGuideService = (INotificationSettingPageAuthGuideService) PluggableExtentionKt.pluggableSpi$default(INotificationSettingPageAuthGuideService.class, false, false, false, 14, null);
        if (iNotificationSettingPageAuthGuideService != null) {
            iNotificationSettingPageAuthGuideService.LIZJ();
        }
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
        int i2;
        ViewGroup.LayoutParams layoutParams;
        String str;
        int i3;
        boolean zEnabled;
        int value;
        int value2;
        int value3;
        ActivityAgent.onTrace("com.ss.android.ugc.awemepushlib.ui.NotificationSettingPageAuthGuideActivity", "onCreate", true);
        int i4 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isInDarkMode: ");
        sbLIZ.append(((Boolean) this.LLILLL.getValue()).booleanValue());
        C1720106oR.LJI("NotificationSettingPageAuthGuideActivity", C2188811AlT.LIZIZ(sbLIZ));
        try {
            C1389600mGU.LIZIZ(this);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        overridePendingTransition(0, 0);
        Resources resources = getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        Configuration configuration = resources.getConfiguration();
        C1720106oR.LJI("NotificationSettingPageAuthGuideActivity", C09AZ.LIZJ("\n        ===== Brand =====\n        brand: " + Build.BRAND + "\n        manufacturer: " + Build.MANUFACTURER + "\n        getManufacturerName: " + C0W9A.LIZIZ() + "\n        ===== Basic Params =====\n        density: " + displayMetrics.density + "\n        densityDpi: " + displayMetrics.densityDpi + "\n        scaledDensity: " + displayMetrics.scaledDensity + "\n        \n        ===== Screen Size =====\n        widthPixels: " + displayMetrics.widthPixels + "\n        heightPixels: " + displayMetrics.heightPixels + "\n        \n        ===== Configuration =====\n        smallestScreenWidthDp: " + configuration.smallestScreenWidthDp + "\n        screenWidthDp: " + configuration.screenWidthDp + "\n        screenHeightDp: " + configuration.screenHeightDp + "\n        fontScale: " + configuration.fontScale + "\n        \n        ===== Calculation =====\n        170dp -> " + ((int) (170 * displayMetrics.density)) + " px\n    "));
        if (((Boolean) this.LLILLL.getValue()).booleanValue()) {
            i = R.style.y0;
        } else {
            i = R.style.y3;
        }
        setTheme(i);
        activityConfiguration(new AwS583S0100000_4(this, 155));
        super.onCreate(bundle);
        ViewGroup.MarginLayoutParams marginLayoutParams = null;
        getWindow().setEnterTransition(null);
        getWindow().setExitTransition(null);
        if (C2451409j6.LIZ()) {
            i2 = R.layout.dt_;
        } else {
            i2 = R.layout.dta;
        }
        setContentView(i2);
        this.LL = (C1295960jpS) findViewById(R.id.hyx);
        this.LLILLJJLI = (ConstraintLayout) findViewById(R.id.mek);
        C1295960jpS c1295960jpS = this.LL;
        if (c1295960jpS != null) {
            layoutParams = c1295960jpS.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams instanceof C19ME) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        }
        if (marginLayoutParams != null) {
            String strLIZIZ = C0W9A.LIZIZ();
            if (Intrinsics.LJFF(strLIZIZ, "xiaomi")) {
                value2 = NotificationSettingPageAuthGuideXiaomiMarginEndExp.INSTANCE.getValue();
            } else if (Intrinsics.LJFF(strLIZIZ, "samsung")) {
                value2 = NotificationSettingPageAuthGuideSamsungMarginEndExp.INSTANCE.getValue();
            } else {
                value2 = NotificationSettingPageAuthGuideMarginEndExp.INSTANCE.getValue();
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("manufacturer: ");
            sbLIZ2.append(strLIZIZ);
            sbLIZ2.append(", auth guide margin end: ");
            sbLIZ2.append(value2);
            C1720106oR.LJI("NotificationSettingPageAuthGuideHelper", C2188811AlT.LIZIZ(sbLIZ2));
            marginLayoutParams.setMarginEnd(C341940Daq.LIZ(value2));
            String strLIZIZ2 = C0W9A.LIZIZ();
            if (Intrinsics.LJFF(strLIZIZ2, "xiaomi")) {
                value3 = NotificationSettingPageAuthGuideXiaomiMarginTopExp.INSTANCE.getValue();
            } else if (Intrinsics.LJFF(strLIZIZ2, "samsung")) {
                value3 = NotificationSettingPageAuthGuideSamsungMarginTopExp.INSTANCE.getValue();
            } else {
                value3 = NotificationSettingPageAuthGuideMarginTopExp.INSTANCE.getValue();
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("manufacturer: ");
            sbLIZ3.append(strLIZIZ2);
            sbLIZ3.append(", auth guide margin top: ");
            sbLIZ3.append(value3);
            C1720106oR.LJI("NotificationSettingPageAuthGuideHelper", C2188811AlT.LIZIZ(sbLIZ3));
            marginLayoutParams.topMargin = C341940Daq.LIZ(value3);
        }
        ConstraintLayout constraintLayout = this.LLILLJJLI;
        if (constraintLayout != null) {
            if (!C2451409j6.LIZ()) {
                constraintLayout.setBackgroundColor(((Number) this.LLILZIL.getValue()).intValue());
            }
            C786410Ut5.Y7(constraintLayout, new ACListenerS139S0100000_4(this, 51));
        }
        C1295960jpS c1295960jpS2 = this.LL;
        if (c1295960jpS2 != null) {
            if (((Boolean) this.LLILLL.getValue()).booleanValue()) {
                i3 = R.raw.ug_authorization_guidance_dark_tux_lottie;
            } else {
                i3 = R.raw.ug_authorization_guidance_tux_lottie;
            }
            c1295960jpS2.setAnimation(i3);
            String strLIZIZ3 = C0W9A.LIZIZ();
            if (Intrinsics.LJFF(strLIZIZ3, "xiaomi")) {
                zEnabled = NotificationSettingPageAuthGuideAutoDismissXiaomiExp.INSTANCE.enabled();
            } else if (Intrinsics.LJFF(strLIZIZ3, "samsung")) {
                zEnabled = NotificationSettingPageAuthGuideAutoDismissSamsungExp.INSTANCE.enabled();
            } else {
                zEnabled = NotificationSettingPageAuthGuideAutoDismissExp.INSTANCE.enabled();
            }
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("manufacturer: ");
            sbLIZ4.append(strLIZIZ3);
            sbLIZ4.append(", autoDismiss: ");
            sbLIZ4.append(zEnabled);
            C1720106oR.LJI("NotificationSettingPageAuthGuideHelper", C2188811AlT.LIZIZ(sbLIZ4));
            if (zEnabled) {
                String strLIZIZ4 = C0W9A.LIZIZ();
                if (Intrinsics.LJFF(strLIZIZ4, "xiaomi")) {
                    value = NotificationSettingPageAuthGuideAutoDismissCountXiaomiExp.INSTANCE.getValue();
                } else if (Intrinsics.LJFF(strLIZIZ4, "samsung")) {
                    value = NotificationSettingPageAuthGuideAutoDismissCountSamsungExp.INSTANCE.getValue();
                } else {
                    value = NotificationSettingPageAuthGuideAutoDismissCountExp.INSTANCE.getValue();
                }
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("manufacturer: ");
                sbLIZ5.append(strLIZIZ4);
                sbLIZ5.append(", get auth guide auto dismiss count: ");
                sbLIZ5.append(value);
                C1720106oR.LJI("NotificationSettingPageAuthGuideHelper", C2188811AlT.LIZIZ(sbLIZ5));
                c1295960jpS2.setRepeatCount(value - 1);
                c1295960jpS2.addAnimatorListener(new ALAdapterS1S0200000_4(c1295960jpS2, this, 0));
            }
        }
        C336590DHl c336590DHl = C336590DHl.LIZ;
        String str2 = (String) this.LLILZ.getValue();
        if (C2451409j6.LIZ()) {
            str = "1";
        } else {
            str = "2";
        }
        c336590DHl.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJFF("enter_from", str2);
        c2344009Gk.LJFF("popup_type", str);
        C20684815ws.LJIILLIIL("push_permission_setting_guide_show", c2344009Gk.LIZ);
        ActivityAgent.onTrace("com.ss.android.ugc.awemepushlib.ui.NotificationSettingPageAuthGuideActivity", "onCreate", false);
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
