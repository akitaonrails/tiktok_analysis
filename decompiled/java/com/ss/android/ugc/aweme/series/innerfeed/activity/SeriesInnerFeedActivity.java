package com.ss.android.ugc.aweme.series.innerfeed.activity;

import X.AbstractC1581540rG4;
import X.C0P0V;
import X.C0QSJ;
import X.C0SFV;
import X.C0SFW;
import X.C0SHU;
import X.C1254880ilC;
import X.C1308910kAL;
import X.C1389600mGU;
import X.C1600860rlE;
import X.C1602230rnR;
import X.C1606520ruM;
import X.C1606610ruV;
import X.C1606650ruZ;
import X.C1611670s2f;
import X.C1611810s2t;
import X.C1612090s3L;
import X.C1612800s4U;
import X.C1612950s4j;
import X.C1697810uHb;
import X.C2095008Iq;
import X.C299020Bno;
import X.C335910DEv;
import X.C517260KQi;
import X.C673150Qan;
import X.C687700QyG;
import X.EnumC1616780sAu;
import X.EnumC335920DEw;
import X.InterfaceC1146704e9;
import X.InterfaceC1253240iiY;
import X.InterfaceC1613270s5F;
import X.InterfaceC1613530s5f;
import X.InterfaceC214902198i;
import X.InterfaceC687730QyJ;
import X.RunnableC1606490ruJ;
import Y.ARunnableS88S0200000_19;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.Window;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.appdiff.ISeriesInnerFeedAppDiffProtocol;
import com.ss.android.ugc.aweme.detail.ui.DetailActivity;
import com.ss.android.ugc.aweme.minidrama.common.component.ad.DetailFeedFragmentScope;
import com.ss.android.ugc.aweme.minidrama.common.component.api.MiniDramaCacheService;
import com.ss.android.ugc.aweme.series.feed.appdiff.IPopularPushPopupService;
import com.ss.android.ugc.aweme.service.IDramaInnerFeedSyncupService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: loaded from: classes25.dex */
public final class SeriesInnerFeedActivity extends DetailActivity implements InterfaceC1253240iiY, C0QSJ, InterfaceC1146704e9 {
    public static int LLJ = -1;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYpOyY2O2slJyE2OiHELIOSMpLCt9KSY4IDk6PDxiGiohISA/ACE9LTcKLCo3CSY4IDk6PDw=";
    public final RunnableC1606490ruJ LLILZLL = new Runnable() { // from class: X.0ruJ
        @Override // java.lang.Runnable
        public final void run() {
            boolean zLIZ;
            C1C7U.LIZ("SeriesInnerFeedActivity@a8a1.disableTranslucentRunnable$1");
            try {
                if (Build.VERSION.SDK_INT >= 30 && !this.LL.isFinishing() && !this.LL.isDestroyed()) {
                    this.LL.setTranslucent(false);
                }
            } finally {
                if (!zLIZ) {
                }
            }
            C1C7U.LIZIZ("SeriesInnerFeedActivity@a8a1.disableTranslucentRunnable$1");
        }
    };
    public InterfaceC1613270s5F LLIZ;
    public InterfaceC1613530s5f LLIZLLLIL;

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        if (cls == InterfaceC1613270s5F.class) {
            this.LLIZ = (InterfaceC1613270s5F) obj;
        } else if (cls == InterfaceC1613530s5f.class) {
            this.LLIZLLLIL = (InterfaceC1613530s5f) obj;
        }
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{DetailFeedFragmentScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        if (cls == InterfaceC1613270s5F.class) {
            return this.LLIZ;
        }
        if (cls == InterfaceC1613530s5f.class) {
            return this.LLIZLLLIL;
        }
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(DetailFeedFragmentScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(DetailFeedFragmentScope.class);
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.detail.ui.DetailActivity, X.C199Y, com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.series.innerfeed.activity.SeriesInnerFeedActivity", "onResume", true);
        LLJ = hashCode();
        super.onResume();
        Long lLJIILIIL = C2095008Iq.LJIILIIL(LLLLZLL());
        if (lLJIILIIL != null) {
            if (C0SFV.LIZJ == lLJIILIIL.longValue() && C0SFV.LIZLLL == C0SFW.PAUSE) {
                C0SFV.LIZIZ = System.currentTimeMillis();
                C0SFV.LIZLLL = C0SFW.START;
            }
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.series.innerfeed.activity.SeriesInnerFeedActivity", "onResume", false);
    }

    @Override // com.ss.android.ugc.aweme.detail.ui.DetailActivity, X.C199Y, com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.series.innerfeed.activity.SeriesInnerFeedActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.series.innerfeed.activity.SeriesInnerFeedActivity", "onStart", false);
    }

    @Override // com.ss.android.ugc.aweme.detail.ui.DetailActivity, com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.series.innerfeed.activity.SeriesInnerFeedActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        if (cls == InterfaceC1613270s5F.class) {
            this.LLIZ = null;
        } else if (cls == InterfaceC1613530s5f.class) {
            this.LLIZLLLIL = null;
        }
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // com.ss.android.ugc.aweme.detail.ui.DetailActivity, X.C199Y, com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity
    public final void finish() {
        IPopularPushPopupService.LIZ.getClass();
        C0SHU.LIZIZ.getValue().LIZ();
        super.finish();
        IDramaInnerFeedSyncupService.LIZ.getClass();
        C1600860rlE.LIZIZ.getValue().LIZLLL(C2095008Iq.LJIILIIL(LLLLZLL()));
    }

    public final String LLLLZLL() {
        String stringExtra;
        try {
            stringExtra = getIntent().getStringExtra("collection_id");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            stringExtra = null;
        }
        return stringExtra == null ? String.valueOf(getIntent().getLongExtra("collection_id", 0L)) : stringExtra;
    }

    @Override // com.ss.android.ugc.aweme.detail.ui.DetailActivity, X.C199Y, com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        HandlerHook.viewRemoveCallbacks(getWindow().getDecorView(), this.LLILZLL);
        MiniDramaCacheService.LIZ.getClass();
        MiniDramaCacheService miniDramaCacheServiceLIZ = C1606610ruV.LIZ();
        if (miniDramaCacheServiceLIZ != null) {
            miniDramaCacheServiceLIZ.LJ(C2095008Iq.LJIILIIL(LLLLZLL()));
        }
        C0P0V.LIZ.getClass();
        if (!C0P0V.LIZ()) {
            C1606520ruM.LIZ.getClass();
            if (!C1606520ruM.LIZ()) {
                return;
            }
        }
        C1606650ruZ.LIZIZ.clearAll();
    }

    @Override // com.ss.android.ugc.aweme.detail.ui.DetailActivity, X.C199Y, com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onPause() {
        super.onPause();
        Long lLJIILIIL = C2095008Iq.LJIILIIL(LLLLZLL());
        if (lLJIILIIL != null) {
            if (C0SFV.LIZJ == lLJIILIIL.longValue() && C0SFV.LIZIZ > 0 && C0SFV.LIZLLL == C0SFW.START) {
                C0SFV.LIZLLL = C0SFW.PAUSE;
                C0SFV.LIZ += System.currentTimeMillis() - C0SFV.LIZIZ;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.ui.DetailActivity, X.C199Y, com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
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

    @Override // com.ss.android.ugc.aweme.detail.ui.DetailActivity, X.C199Y
    public final Class<? extends InterfaceC214902198i> getRootFragmentClz() {
        return SeriesInnerFeedSafRootFragment.class;
    }

    @Override // com.ss.android.ugc.aweme.detail.ui.DetailActivity, X.C199Y
    public final Function0<InterfaceC214902198i> getRootFragmentFactory() {
        return C1602230rnR.LL;
    }

    @Override // com.ss.android.ugc.aweme.detail.ui.DetailActivity, X.C199Y, com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) throws JSONException {
        String strLJFF;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.series.innerfeed.activity.SeriesInnerFeedActivity", "onCreate", true);
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 30 && getIntent().getIntExtra("is_from_seven_split", 0) == 1) {
            setTranslucent(true);
        }
        String strLLLLZLL = LLLLZLL();
        C1611670s2f.LIZ.getClass();
        C1611810s2t c1611810s2tLIZIZ = C1611670s2f.LIZIZ(strLLLLZLL);
        c1611810s2tLIZIZ.getClass();
        if (!Intrinsics.LJFF(c1611810s2tLIZIZ, C1611670s2f.LIZJ) && c1611810s2tLIZIZ.LIZLLL == 0) {
            c1611810s2tLIZIZ.LIZLLL = SystemClock.elapsedRealtime();
            C1611810s2t.LIZIZ(c1611810s2tLIZIZ, "activityCreateStart");
        }
        MiniDramaCacheService.LIZ.getClass();
        MiniDramaCacheService miniDramaCacheServiceLIZ = C1606610ruV.LIZ();
        if (miniDramaCacheServiceLIZ != null) {
            miniDramaCacheServiceLIZ.LIZJ(C2095008Iq.LJIILIIL(strLLLLZLL));
        }
        ISeriesInnerFeedAppDiffProtocol.LIZ.getClass();
        C1612090s3L.LIZ().LJ();
        try {
            C1389600mGU.LIZIZ(this);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        overridePendingTransition(0, 0);
        activityConfiguration(AFwS264S0000000_24.get$arr$(317));
        C1254880ilC.LIZ.getClass();
        C1254880ilC.LIZ(this, true, 2);
        C1254880ilC.LIZ(this, false, 2);
        if (C517260KQi.LIZ()) {
            C1612800s4U c1612800s4U = C1612800s4U.LIZ;
            EnumC1616780sAu enumC1616780sAu = EnumC1616780sAu.SHORT_DRAMA;
            c1612800s4U.getClass();
            strLJFF = C1612800s4U.LJFF(enumC1616780sAu, strLLLLZLL);
        } else {
            strLJFF = "aweme://roma_redirect/?spark_page=short_drama_iap_paywall";
        }
        C1612800s4U.LIZ.getClass();
        C1612800s4U.LJIIIIZZ(strLJFF);
        C1612800s4U.LJIIIIZZ("aweme://roma_redirect/?spark_page=short_drama_iap_purchase_panel");
        if (C1612950s4j.LIZIZ.LJ()) {
            C1606650ruZ.LIZIZ.LIZLLL(Collections.singletonList(new AbstractC1581540rG4() { // from class: X.0ruL
                @Override // X.AbstractC1581540rG4
                public final String LIZ() {
                    return "short_drama_favorite_guide_popup";
                }

                @Override // X.AbstractC1581540rG4
                public final String LJI() {
                    return "aweme://roma_redirect/?spark_page=favorite_drama_modal";
                }

                @Override // X.AbstractC1581540rG4
                public final EnumC1548460qOi LJFF() {
                    return C1548470qOj.LIZ("short_drama_favorite_guide_popup");
                }
            }));
        }
        C1606520ruM.LIZ.getClass();
        if (C1606520ruM.LIZ()) {
            C1606650ruZ.LIZIZ.LIZLLL(C1697810uHb.LJIIJJI(new AbstractC1581540rG4() { // from class: X.0ruK
                @Override // X.AbstractC1581540rG4
                public final String LIZ() {
                    return "short_drama_purchase_panel";
                }

                @Override // X.AbstractC1581540rG4
                public final boolean LJ() {
                    return true;
                }

                @Override // X.AbstractC1581540rG4
                public final String LJI() {
                    return "aweme://roma_redirect/?spark_page=short_drama_iap_purchase_panel";
                }

                @Override // X.AbstractC1581540rG4
                public final EnumC1548460qOi LJFF() {
                    return C1548470qOj.LIZ("short_drama_purchase_panel");
                }
            }, new AbstractC1581540rG4() { // from class: X.0rG8
                @Override // X.AbstractC1581540rG4
                public final String LIZ() {
                    return "short_drama_paywall";
                }

                @Override // X.AbstractC1581540rG4
                public final String LJI() {
                    return "aweme://roma_redirect/?spark_page=short_drama_iap_paywall";
                }

                @Override // X.AbstractC1581540rG4
                public final EnumC1548460qOi LJFF() {
                    return C1548470qOj.LIZ("short_drama_paywall");
                }
            }));
        }
        C1606650ruZ.LIZIZ.LJ();
        if (getIntent().getIntExtra("is_from_seven_split", 0) == 1) {
            Window window = getWindow();
            window.addFlags(2);
            window.setDimAmount(0.36f);
            if (Build.VERSION.SDK_INT >= 30) {
                View decorView = getWindow().getDecorView();
                HandlerHook.viewPost(decorView, new ARunnableS88S0200000_19(decorView, this, 40));
            }
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.series.innerfeed.activity.SeriesInnerFeedActivity", "onCreate", false);
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

    @Override // android.app.Activity
    public final void overridePendingTransition(int i, int i2) {
        if (getIntent().getIntExtra("is_from_seven_split", 0) == 1) {
            super.overridePendingTransition(R.anim.ly, R.anim.lz);
        } else {
            super.overridePendingTransition(i, i2);
        }
    }
}
