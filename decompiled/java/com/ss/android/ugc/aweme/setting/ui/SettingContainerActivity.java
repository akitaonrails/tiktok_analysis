package com.ss.android.ugc.aweme.setting.ui;

import X.C0C64;
import X.C1207504nx;
import X.C1308910kAL;
import X.C1554960qZC;
import X.C1558360qeg;
import X.C1590810rV1;
import X.C1697810uHb;
import X.C19277410bM;
import X.C19328810je;
import X.C19328910jf;
import X.C20684815ws;
import X.C2174441A8c;
import X.C2344009Gk;
import X.C299020Bno;
import X.C335910DEv;
import X.C707370Rot;
import X.C786410Ut5;
import X.EnumC335920DEw;
import Y.AObserverS216S0100000_12;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.router.fragment.FragmentNavigationContainer;
import com.bytedance.router.fragment.FragmentRoute;
import com.bytedance.router.fragment.NavigationUtils;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IPrivacySettingAPIService;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AFwS271S0000000_28;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes29.dex */
public final class SettingContainerActivity extends BaseActivity implements FragmentNavigationContainer {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYpPTs6HELIOSJiJiPCZ9GyA4PSY9LwYjJzsyISspOw4wPCw6IDsq";

    @Override // com.bytedance.router.fragment.FragmentNavigationContainer
    public final boolean addFragmentToBackStack() {
        return true;
    }

    @Override // com.bytedance.router.fragment.FragmentNavigationContainer
    public final int getFragmentContainer() {
        return R.id.trb;
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.setting.ui.SettingContainerActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.setting.ui.SettingContainerActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.setting.ui.SettingContainerActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.setting.ui.SettingContainerActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.setting.ui.SettingContainerActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity
    public final void finish() {
        if (!C1207504nx.LIZ()) {
            super.finish();
            return;
        }
        IPrivacySettingAPIService iPrivacySettingAPIService = (IPrivacySettingAPIService) PluggableExtentionKt.pluggableSpi$default(IPrivacySettingAPIService.class, false, false, false, 14, null);
        if (iPrivacySettingAPIService != null) {
            iPrivacySettingAPIService.LJIILLIIL(this, new AwS572S0100000_28(this, 532));
        } else {
            super.finish();
        }
    }

    @Override // X.ActivityC21503719Dn, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        super.onBackPressed();
        C1590810rV1.LJ("setting_2_profile", C1590810rV1.LIZIZ(this));
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() throws JSONException {
        String strJ3;
        super.onDestroy();
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "enable_settings_consumption_track", true, false)) {
            C19328810je.LIZ.getClass();
            Map<String, C19328910jf> map = C19328810je.LIZIZ;
            if (map.isEmpty()) {
                strJ3 = "{}";
            } else {
                HashMap map2 = new HashMap(map);
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry entry : map2.entrySet()) {
                    String str = (String) entry.getKey();
                    C19328910jf c19328910jf = (C19328910jf) entry.getValue();
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("show", c19328910jf.LIZ > 0 ? 1 : 0);
                    jSONObject2.put("click", c19328910jf.LIZIZ > 0 ? 1 : 0);
                    jSONObject.put(str, jSONObject2);
                }
                strJ3 = C786410Ut5.J3(jSONObject);
            }
            if (Intrinsics.LJFF(strJ3, "{}")) {
                ((LinkedHashMap) C19328810je.LIZIZ).clear();
                return;
            }
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("consumptions", strJ3);
            C20684815ws.LJIILLIIL("settings_consumption_report", c2344009Gk.LIZ);
            ((LinkedHashMap) C19328810je.LIZIZ).clear();
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.setting.ui.SettingContainerActivity", "onCreate", true);
        activityConfiguration(AFwS271S0000000_28.get$arr$(206));
        super.onCreate(bundle);
        setTheme(R.style.my);
        setContentView(R.layout.f62);
        if (bundle == null) {
            FragmentRoute fragmentRouteFragmentNavigation = SmartRouter.fragmentNavigation(this);
            fragmentRouteFragmentNavigation.push("//setting_scoped_compose_fragment", null, null);
            fragmentRouteFragmentNavigation.withNavArg((Parcelable) RouteArgExtension.INSTANCE.navArg(this).getValue());
            fragmentRouteFragmentNavigation.withParam(getIntent());
            fragmentRouteFragmentNavigation.commit(Boolean.FALSE);
        }
        C707370Rot.LIZ.LIZ("email_consent_status").observe(this, new AObserverS216S0100000_12(this, 28));
        C1554960qZC.LIZ(C1558360qeg.LJI(this, null), new C19277410bM(true), C19277410bM.class, "source_default_key");
        C2174441A8c.LIZIZ.LIZIZ(getIntent());
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.setting.ui.SettingContainerActivity", "onCreate", false);
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

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Fragment fragmentFindTopFragment = NavigationUtils.INSTANCE.findTopFragment(this);
        if (fragmentFindTopFragment != null) {
            fragmentFindTopFragment.onActivityResult(i, i2, intent);
        }
    }
}
