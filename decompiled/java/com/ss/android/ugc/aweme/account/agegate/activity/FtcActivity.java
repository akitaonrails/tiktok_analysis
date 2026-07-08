package com.ss.android.ugc.aweme.account.agegate.activity;

import X.AbstractActivityC1237560iJG;
import X.C01GW;
import X.C0XPY;
import X.C0XQ5;
import X.C0XTQ;
import X.C0XVI;
import X.C1233040iBy;
import X.C1308910kAL;
import X.C13LQ;
import X.C1697810uHb;
import X.C293980Bfg;
import X.C299020Bno;
import X.C335910DEv;
import X.C786410Ut5;
import X.C849800XVi;
import X.C852970Xd9;
import X.C853670XeH;
import X.EnumC335920DEw;
import X.EnumC852910Xd3;
import X.InterfaceC586170Myt;
import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.keva.KevaImpl;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.account.login.v2.base.ActionResultModel;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS247S0000000_13;

/* JADX INFO: loaded from: classes14.dex */
public final class FtcActivity extends AbstractActivityC1237560iJG {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiQvKiAmJjHELIOSFiKCg2LyQ4LGEyKzElPyYnMWsKPSwSKzElPyYnMQ==";
    public final C01GW LLILZIL = RouteArgExtension.INSTANCE.optionalArgNotNull(this, AFwS247S0000000_13.get$arr$(7), "next_page", Integer.class);
    public final C01GW LLILZLL = RouteArgExtension.INSTANCE.optionalArgNotNull(this, AFwS247S0000000_13.get$arr$(5), "child_account_not_expected_upon_signup_success", Boolean.class);

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.agegate.activity.FtcActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.agegate.activity.FtcActivity", "onResume", false);
    }

    @Override // X.AbstractActivityC1237560iJG, com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.agegate.activity.FtcActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.agegate.activity.FtcActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.agegate.activity.FtcActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final int LLLZIL() {
        return ((Number) this.LLILZIL.getValue()).intValue();
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

    @Override // X.AbstractActivityC1237560iJG
    public final void LLLLZLLIL(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        int i = bundle.getInt("current_page", -1);
        C852970Xd9 c852970Xd9 = EnumC852910Xd3.Companion;
        int i2 = bundle.getInt("next_page", EnumC852910Xd3.FTC_CREATE_ACCOUNT.getValue());
        c852970Xd9.getClass();
        EnumC852910Xd3 enumC852910Xd3LIZ = C852970Xd9.LIZ(i2);
        if (enumC852910Xd3LIZ == EnumC852910Xd3.DELETE_VIDEO_ALERT) {
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(this, "aweme://hyd_action/delete_video_us");
            smartRouteBuildRoute.withParam(bundle);
            smartRouteBuildRoute.open();
            finish();
            return;
        }
        bundle.putInt("previous_page", i);
        bundle.putInt("current_page", enumC852910Xd3LIZ.getValue());
        bundle.remove("next_page");
        C853670XeH.LIZ.getClass();
        AbstractActivityC1237560iJG.LLLZ(this, C853670XeH.LIZ(enumC852910Xd3LIZ), bundle);
    }

    @Override // X.AbstractActivityC1237560iJG
    public final void LLLLZLLLI(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (!TextUtils.isEmpty(C0XTQ.LIZIZ)) {
            C786410Ut5.LJJJI("enter_from", C0XTQ.LIZIZ, bundle);
        }
        if (!TextUtils.isEmpty(C0XTQ.LIZJ)) {
            C786410Ut5.LJJJI("login_panel_type", C0XTQ.LIZJ, bundle);
        }
        if (((Boolean) this.LLILZLL.getValue()).booleanValue()) {
            bundle.putBoolean("child_account_not_expected_upon_signup_success", true);
        }
        C786410Ut5.LJJJI("platform", "account", bundle);
        KevaImpl.getRepo("kids_login_keva", 1).storeBoolean("is_sign_up", true);
        if (((Boolean) this.LLILZLL.getValue()).booleanValue()) {
            List<InterfaceC586170Myt> list = C0XQ5.LIZ;
            C1233040iBy c1233040iBy = new C1233040iBy(C0XPY.LIZIZ);
            c1233040iBy.LIZIZ(2131826792);
            c1233040iBy.LIZ(Mp4ScreenVideoLoadTimeout.CONTROL);
            c1233040iBy.LIZLLL();
        }
        if (C293980Bfg.LIZIZ()) {
            C849800XVi.LIZIZ(new C0XVI(bundle, null, false), null);
        } else {
            C849800XVi.LIZ(bundle, AFwS247S0000000_13.get$arr$(6));
        }
        for (Activity activity : C13LQ.LJIJ(1, ActivityStack.getActivityStack())) {
            if (!activity.isFinishing() && !(activity instanceof FtcActivity)) {
                activity.finish();
            }
        }
    }

    @Override // X.AbstractActivityC1237560iJG, com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Bundle bundle2;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.agegate.activity.FtcActivity", "onCreate", true);
        activityConfiguration(AFwS247S0000000_13.get$arr$(8));
        super.onCreate(bundle);
        if (bundle == null) {
            if (LLLZIL() == EnumC852910Xd3.NONE.getValue()) {
                finish();
            }
            MediatorLiveData<Bundle> mediatorLiveData = ((ActionResultModel) ViewModelProviders.of(this).get(ActionResultModel.class)).LL;
            try {
                bundle2 = getIntent().getExtras();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            bundle2.putInt("next_page", LLLZIL());
            mediatorLiveData.postValue(bundle2);
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.agegate.activity.FtcActivity", "onCreate", false);
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
