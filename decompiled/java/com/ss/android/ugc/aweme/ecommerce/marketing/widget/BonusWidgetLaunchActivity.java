package com.ss.android.ugc.aweme.ecommerce.marketing.widget;

import X.C1308910kAL;
import X.C13LQ;
import X.C1507790pL7;
import X.C1697810uHb;
import X.C1840680y02;
import X.C2409809cO;
import X.C299020Bno;
import X.C335910DEv;
import X.EnumC335920DEw;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.marketing.widget.pip.BonusWidgetPipTutorialFragment;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.Locale;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class BonusWidgetLaunchActivity extends BaseActivity {
    public static final Set<String> LL = C13LQ.LJLIIL(new String[]{"aweme", "sslocal", "snssdk1180", "snssdk1233", "https"});
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTcvLGE+KTcnHELIOSLDs6JiJiPiY3LyA4Zw08JjA/HiY3LyA4BS4mJiYkCCwnITMlPTY=";

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.marketing.widget.BonusWidgetLaunchActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.marketing.widget.BonusWidgetLaunchActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.marketing.widget.BonusWidgetLaunchActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.marketing.widget.BonusWidgetLaunchActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.marketing.widget.BonusWidgetLaunchActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
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
    public final void onCreate(Bundle bundle) throws JSONException {
        String stringExtra;
        Activity activity;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.marketing.widget.BonusWidgetLaunchActivity", "onCreate", true);
        super.onCreate(bundle);
        try {
            stringExtra = getIntent().getStringExtra("extra_schema");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            stringExtra = null;
        }
        String str = "";
        if (stringExtra == null) {
            stringExtra = "";
        }
        C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
        JSONObject jSONObject = new JSONObject();
        C1840680y02.LIZ.getClass();
        C1840680y02.LIZ(jSONObject);
        C1840680y02.LIZIZ(jSONObject);
        c1507790pL7.getClass();
        C1507790pL7.LIZLLL("tiktokec_widget_click", jSONObject);
        if (stringExtra.length() == 0) {
            finish();
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.marketing.widget.BonusWidgetLaunchActivity", "onCreate", false);
            return;
        }
        try {
            String scheme = UriProtector.parse(stringExtra).getScheme();
            if (scheme != null) {
                String lowerCase = scheme.toLowerCase(Locale.ROOT);
                if (lowerCase != null) {
                    str = lowerCase;
                }
            }
            if (!LL.contains(str)) {
                finish();
                ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.marketing.widget.BonusWidgetLaunchActivity", "onCreate", false);
                return;
            }
            WeakReference<Activity> andSet = BonusWidgetPipTutorialFragment.LLJJIJIIJIL.getAndSet(null);
            if (andSet != null && (activity = andSet.get()) != null && !activity.isFinishing() && !activity.isDestroyed()) {
                activity.finish();
            }
            Context applicationContext = getApplicationContext();
            if (C2409809cO.LIZIZ && applicationContext == null) {
                applicationContext = C2409809cO.LIZ;
            }
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(applicationContext, stringExtra);
            smartRouteBuildRoute.withCaller("bonus_widget");
            smartRouteBuildRoute.addFlags(268435456);
            smartRouteBuildRoute.open();
            finish();
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.marketing.widget.BonusWidgetLaunchActivity", "onCreate", false);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            finish();
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.marketing.widget.BonusWidgetLaunchActivity", "onCreate", false);
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
