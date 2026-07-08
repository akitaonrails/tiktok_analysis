package com.ss.android.ugc.aweme.rich.reward.ui;

import X.C098200Yq;
import X.C1032880cz8;
import X.C1032900czA;
import X.C1308910kAL;
import X.C1697810uHb;
import X.C189200o6;
import X.C19EH;
import X.C2188811AlT;
import X.C299020Bno;
import X.C335910DEv;
import X.EnumC335920DEw;
import X.InterfaceC1032120cxu;
import X.InterfaceC1032240cy6;
import X.InterfaceC1032700cyq;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AFwS252S0000000_16;
import org.json.JSONException;

/* JADX INFO: loaded from: classes17.dex */
public final class RewardAdActivity extends BaseActivity implements InterfaceC1032700cyq {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjclKiHELIOSd9OiA7KD03ZjAlZx02PyQ+LQ43CSY4IDk6PDw=";
    public InterfaceC1032120cxu LL;
    public GmtRewardAdContainer LLILLJJLI = new GmtRewardAdContainer();

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.rich.reward.ui.RewardAdActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.rich.reward.ui.RewardAdActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.rich.reward.ui.RewardAdActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.rich.reward.ui.RewardAdActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.rich.reward.ui.RewardAdActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.InterfaceC1032700cyq
    public final void LLLIL() throws JSONException {
        C1032900czA.LJFF(this.LL);
        C1032900czA.LIZ = 0L;
        C1032900czA.LIZIZ = 0L;
        C1032900czA.LIZJ = 0L;
        C1032900czA.LIZLLL = 0L;
        C1032900czA.LJ = 0L;
        this.LLILLJJLI.clear();
        InterfaceC1032120cxu interfaceC1032120cxu = this.LL;
        if (interfaceC1032120cxu != null) {
            C1032880cz8.LIZ.put(RewardAdActivity.class, interfaceC1032120cxu);
        }
        GmtRewardAdContainer gmtRewardAdContainer = new GmtRewardAdContainer();
        this.LLILLJJLI = gmtRewardAdContainer;
        LLLLLZL(gmtRewardAdContainer);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity
    public final void finish() throws JSONException {
        super.finish();
        C1032900czA.LJFF(this.LLILLJJLI.LLJJ);
        C1032900czA.LIZ = 0L;
        C1032900czA.LIZIZ = 0L;
        C1032900czA.LIZJ = 0L;
        C1032900czA.LIZLLL = 0L;
        C1032900czA.LJ = 0L;
    }

    @Override // X.ActivityC21503719Dn, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        InterfaceC1032240cy6 landingPageManager;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("initData()  use can not back press only click close button, fragments: ");
        sbLIZ.append(getSupportFragmentManager().LJJLIIIJL());
        C2188811AlT.LIZIZ(sbLIZ);
        InterfaceC1032120cxu interfaceC1032120cxu = this.LL;
        if (interfaceC1032120cxu == null || !interfaceC1032120cxu.shouldDirectOpenLandingPage() || this.LLILLJJLI.LLJJJ) {
            this.LLILLJJLI.ZR();
            return;
        }
        InterfaceC1032120cxu interfaceC1032120cxu2 = this.LL;
        if (interfaceC1032120cxu2 == null || (landingPageManager = interfaceC1032120cxu2.getLandingPageManager()) == null) {
            return;
        }
        landingPageManager.LIZ(getSupportFragmentManager());
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

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onPause() {
        super.onPause();
    }

    public final void LLLLLZL(Fragment fragment) {
        Object c098200Yq;
        if (fragment == null) {
            return;
        }
        try {
            C19EH c19ehLJIIJ = getSupportFragmentManager().LJIIJ();
            c19ehLJIIJ.LJIJ(R.id.tiz, fragment, null);
            c098200Yq = Integer.valueOf(c19ehLJIIJ.LJIIJ());
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("replaceFragment() add fragment failed cause ");
            sbLIZ.append(thM5exceptionOrNullimpl.getMessage());
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) throws JSONException {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.rich.reward.ui.RewardAdActivity", "onCreate", true);
        activityConfiguration(AFwS252S0000000_16.get$arr$(335));
        setTheme(R.style.ir);
        super.onCreate(bundle);
        setContentView(R.layout.cco);
        LinkedHashMap linkedHashMap = (LinkedHashMap) C1032880cz8.LIZ;
        if (linkedHashMap.get(RewardAdActivity.class) != null) {
            this.LL = (InterfaceC1032120cxu) linkedHashMap.get(RewardAdActivity.class);
        } else {
            finish();
        }
        LLLLLZL(this.LLILLJJLI);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.rich.reward.ui.RewardAdActivity", "onCreate", false);
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
