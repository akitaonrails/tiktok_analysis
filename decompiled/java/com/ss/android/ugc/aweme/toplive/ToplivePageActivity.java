package com.ss.android.ugc.aweme.toplive;

import X.AbstractActivityC484150Iyj;
import X.AnonymousClass0956;
import X.C01K3;
import X.C0A56;
import X.C0PEM;
import X.C1308910kAL;
import X.C1389600mGU;
import X.C1697810uHb;
import X.C1906580ziK;
import X.C19EH;
import X.C20441214yg;
import X.C20684815ws;
import X.C2097608Jq;
import X.C2296808zG;
import X.C23250099c;
import X.C289701Ah;
import X.C299020Bno;
import X.C335910DEv;
import X.C480000Is2;
import X.C480010Is3;
import X.C482280Ivi;
import X.EnumC335920DEw;
import android.os.Bundle;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ab.ToplivePageLoadAdvanceSetting;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes8.dex */
public final class ToplivePageActivity extends AbstractActivityC484150Iyj {
    public static Map<String, String> LLILLJJLI = null;
    public static long LLILLL = 0;
    public static AnonymousClass0956 LLILZ = null;
    public static long LLILZIL = 0;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjEjHELIOSOSM6PiBiHSAjJCw6LB8yLyANKjs6Piw4MA==";
    public long LL;

    @Override // X.AbstractActivityC484150Iyj, X.InterfaceC20573715ex
    public final boolean K6() {
        return true;
    }

    @Override // X.AbstractActivityC484150Iyj, com.bytedance.ies.foundation.activity.BaseActivity
    public final boolean isDarkModeSupported() {
        return true;
    }

    @Override // X.AbstractActivityC484150Iyj, com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.toplive.ToplivePageActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.toplive.ToplivePageActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.toplive.ToplivePageActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.toplive.ToplivePageActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.toplive.ToplivePageActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.AbstractActivityC484150Iyj, X.InterfaceC20573715ex
    public final boolean wy() {
        return true;
    }

    @Override // X.AbstractActivityC484150Iyj, com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("duration", String.valueOf((System.currentTimeMillis() - this.LL) - C480000Is2.LIZ)), new Pair("leave_method", "slide"), new Pair("content_type", "square"));
        Map<String, String> map = LLILLJJLI;
        if (map != null) {
            mapLJIIJ.putAll(map);
        }
        C20684815ws.LJIILLIIL("livesdk_toplive_leave", mapLJIIJ);
        AnonymousClass0956 anonymousClass0956 = LLILZ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        AnonymousClass0956 anonymousClass09562 = C289701Ah.LIZ;
        if (anonymousClass09562 != null) {
            anonymousClass09562.LIZIZ(null);
        }
        C289701Ah.LIZ = null;
        C482280Ivi.LIZ.getClass();
        C482280Ivi.LIZJ.LIZ();
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

    @Override // X.AbstractActivityC484150Iyj, com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        int i2;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.toplive.ToplivePageActivity", "onCreate", true);
        super.onCreate(bundle);
        if (ToplivePageLoadAdvanceSetting.LIZ().enableActivityAnim) {
            try {
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            if (!C1389600mGU.LIZIZ(this)) {
                i = R.anim.fv;
                i2 = R.anim.g0;
            } else {
                i = 0;
                i2 = 0;
            }
            overridePendingTransition(i, i2);
        }
        if (((Boolean) C0A56.LIZ.getValue()).booleanValue()) {
            setTheme(R.style.y0);
        }
        setContentView(R.layout.dbi);
        vQ();
        ToplivePageFragment toplivePageFragment = new ToplivePageFragment();
        C19EH c19ehLJIIJ = getSupportFragmentManager().LJIIJ();
        c19ehLJIIJ.LJIJ(R.id.iiv, toplivePageFragment, null);
        c19ehLJIIJ.LJIIIZ();
        this.LL = System.currentTimeMillis();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map<String, String> map = LLILLJJLI;
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        C20684815ws.LJIILLIIL("livesdk_enter_live_merge", linkedHashMap);
        if (ToplivePageLoadAdvanceSetting.LIZ().enableLayoutPreload) {
            AnonymousClass0956 anonymousClass0956 = C289701Ah.LIZ;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            try {
                C289701Ah.LIZ = C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C01K3(this, null), 3);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C20441214yg.LJI("TopLivePreloadHelper", e);
            }
        }
        C480000Is2.LIZ = 0L;
        C480000Is2.LIZIZ = 0L;
        C1906580ziK.LIZJ().LIZ().LJLLLL(getLifecycle(), C480010Is3.LL);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.toplive.ToplivePageActivity", "onCreate", false);
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
