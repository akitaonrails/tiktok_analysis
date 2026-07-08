package com.ss.android.ugc.aweme.pns.agegate.view;

import X.C01GW;
import X.C1308910kAL;
import X.C1389600mGU;
import X.C1697810uHb;
import X.C19257310Vn;
import X.C19257910Vt;
import X.C19EH;
import X.C299020Bno;
import X.C335910DEv;
import X.C452501pT;
import X.C786410Ut5;
import X.EnumC335920DEw;
import X.InterfaceC19257010Vk;
import android.os.Bundle;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.pns.agegate.ui.view.PNSAgeGateContainerFragment;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AwS40S0010000_28;
import kotlin.jvm.internal.AwS572S0100000_28;

/* JADX INFO: loaded from: classes29.dex */
public final class PNSAgeGateContainerActivity extends BaseActivity {
    public static PNSAgeGateContainerActivity LLILLL = null;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjUiOmEyLyArKDHELIOSs2ZjMlLDh9GAsfCCg2DyQ4LAw8JjEtICE2OgQvPSYlITE1";
    public final C01GW LL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 501));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS572S0100000_28(this, 500));

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.pns.agegate.view.PNSAgeGateContainerActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.pns.agegate.view.PNSAgeGateContainerActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.pns.agegate.view.PNSAgeGateContainerActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.pns.agegate.view.PNSAgeGateContainerActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.pns.agegate.view.PNSAgeGateContainerActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity
    public final void finish() {
        super.finish();
        if (((C19257310Vn) this.LL.getValue()).getHasTransitionAnimation()) {
            return;
        }
        try {
            C1389600mGU.LIZIZ(this);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        overridePendingTransition(0, 0);
    }

    @Override // android.app.Activity
    public final void finishAffinity() {
        super.finishAffinity();
        if (((C19257310Vn) this.LL.getValue()).getHasTransitionAnimation()) {
            return;
        }
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
        LLILLL = null;
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
        boolean z;
        Bundle extras;
        Bundle bundleData;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.pns.agegate.view.PNSAgeGateContainerActivity", "onCreate", true);
        InterfaceC19257010Vk interfaceC19257010Vk = (InterfaceC19257010Vk) ((LinkedHashMap) C19257910Vt.LIZ).get(((C19257310Vn) this.LL.getValue()).getScene());
        if (interfaceC19257010Vk != null && (bundleData = interfaceC19257010Vk.data()) != null && bundleData.getBoolean("bg_base_immersive", false)) {
            z = true;
        } else {
            z = false;
        }
        activityConfiguration(new AwS40S0010000_28(z, 6));
        super.onCreate(bundle);
        LLILLL = this;
        setContentView(R.layout.f856mf);
        if (bundle == null) {
            Bundle bundle2 = new Bundle();
            try {
                extras = getIntent().getExtras();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                extras = null;
            }
            C786410Ut5.LJJIIJZLJL(bundle2, extras);
            bundle2.putBoolean("is_from_container_activity", true);
            C19EH c19ehLJIIJ = getSupportFragmentManager().LJIIJ();
            PNSAgeGateContainerFragment pNSAgeGateContainerFragment = new PNSAgeGateContainerFragment();
            pNSAgeGateContainerFragment.setArguments(bundle2);
            c19ehLJIIJ.LJIJ(R.id.iiv, pNSAgeGateContainerFragment, null);
            c19ehLJIIJ.LJIIJJI();
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.pns.agegate.view.PNSAgeGateContainerActivity", "onCreate", false);
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
