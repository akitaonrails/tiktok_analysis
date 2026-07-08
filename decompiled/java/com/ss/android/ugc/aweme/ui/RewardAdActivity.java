package com.ss.android.ugc.aweme.ui;

import X.C01GW;
import X.C098200Yq;
import X.C1032890cz9;
import X.C128Y;
import X.C1308910kAL;
import X.C1697810uHb;
import X.C189200o6;
import X.C19EH;
import X.C2188811AlT;
import X.C299020Bno;
import X.C335910DEv;
import X.C452501pT;
import X.C989530brD;
import X.EnumC335920DEw;
import X.InterfaceC1031540cwy;
import X.InterfaceC1034470d1h;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AFwS252S0000000_16;

/* JADX INFO: loaded from: classes17.dex */
public final class RewardAdActivity extends BaseActivity {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCHELIOSI2ZjAlZx02PyQ+LQ43CSY4IDk6PDw=";
    public InterfaceC1031540cwy LL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(278));

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ui.RewardAdActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ui.RewardAdActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ui.RewardAdActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ui.RewardAdActivity", "onResume", true);
        super.onResume();
        C989530brD.LIZ();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ui.RewardAdActivity", "onResume", false);
    }

    @Override // X.ActivityC21503719Dn, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        C128Y next;
        InterfaceC1034470d1h interfaceC1034470d1h;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("initData()  use can not back press only click close button, fragments: ");
        sbLIZ.append(getSupportFragmentManager().LJJLIIIJL());
        C2188811AlT.LIZIZ(sbLIZ);
        C989530brD.LIZ();
        InterfaceC1031540cwy interfaceC1031540cwy = this.LL;
        if (interfaceC1031540cwy == null || !interfaceC1031540cwy.shouldDirectOpenLandingPage() || ((RewardAdContainer) this.LLILLJJLI.getValue()).LLJJI) {
            ((RewardAdContainer) this.LLILLJJLI.getValue()).SR();
            return;
        }
        Iterator<Fragment> it2 = getSupportFragmentManager().LJJLIIIJL().iterator();
        do {
            next = null;
            if (!it2.hasNext()) {
                break;
            } else {
                next = it2.next();
            }
        } while (!(next instanceof InterfaceC1034470d1h));
        C128Y c128y = (Fragment) next;
        if (c128y == null || !(c128y instanceof InterfaceC1034470d1h) || (interfaceC1034470d1h = (InterfaceC1034470d1h) c128y) == null) {
            return;
        }
        interfaceC1034470d1h.SQ();
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onPause() {
        super.onPause();
        C989530brD.LIZ();
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
        Object c098200Yq;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ui.RewardAdActivity", "onCreate", true);
        activityConfiguration(AFwS252S0000000_16.get$arr$(354));
        setTheme(R.style.y0);
        super.onCreate(bundle);
        setContentView(R.layout.em3);
        C1032890cz9.LIZ.getClass();
        LinkedHashMap linkedHashMap = (LinkedHashMap) C1032890cz9.LIZIZ;
        if (linkedHashMap.get(RewardAdActivity.class) != null) {
            this.LL = (InterfaceC1031540cwy) linkedHashMap.get(RewardAdActivity.class);
        } else {
            C989530brD.LIZ();
            finish();
        }
        Fragment fragment = (Fragment) this.LLILLJJLI.getValue();
        if (fragment == null) {
            C989530brD.LIZ();
        } else {
            try {
                C19EH c19ehLJIIJ = getSupportFragmentManager().LJIIJ();
                c19ehLJIIJ.LIZIZ(R.id.tiz, fragment);
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
                C989530brD.LIZ();
            }
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ui.RewardAdActivity", "onCreate", false);
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
