package com.ss.android.ugc.aweme.tako.aivideo.detail.page;

import X.C05VZ;
import X.C099G;
import X.C0QSJ;
import X.C1308910kAL;
import X.C1602740roG;
import X.C1606550ruP;
import X.C1697810uHb;
import X.C23250099c;
import X.C299020Bno;
import X.C335910DEv;
import X.C673150Qan;
import X.C687700QyG;
import X.C844340XAi;
import X.EnumC335920DEw;
import X.InterfaceC1146704e9;
import X.InterfaceC1682240tsU;
import X.InterfaceC1687280u0c;
import X.InterfaceC214902198i;
import X.InterfaceC665370Q7z;
import X.InterfaceC687730QyJ;
import X.InterfaceC737790Swr;
import android.os.Bundle;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.detail.ui.DetailActivity;
import com.ss.android.ugc.aweme.tako.aivideo.detail.ability.TakoAIVideoOverlayAbility;
import com.ss.android.ugc.aweme.tako.aivideo.detail.scope.TakoAIVideoDetailScope;
import com.ss.android.ugc.aweme.tako.aivideo.rtc.ability.ITakoRTCAbility;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS264S0000000_24;
import org.json.JSONException;

/* JADX INFO: loaded from: classes25.dex */
public final class TakoAiVideoDetailActivity extends DetailActivity implements InterfaceC1687280u0c, InterfaceC737790Swr, C0QSJ, InterfaceC1146704e9 {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjEtIiB9KSw6ICs2J2HELIOSsoLDsyISliOS40LWsYKCQ8CSwaICs2JwEpPS46JAQvPSYlITE1";
    public String LLILZLL;
    public C099G LLIZ;
    public final TakoAiVideoDetailActivity LLIZLLLIL = this;
    public InterfaceC1682240tsU LLJ;
    public TakoAIVideoOverlayAbility LLJI;
    public InterfaceC1687280u0c LLJIJIL;
    public C05VZ LLJILJIL;
    public ITakoRTCAbility LLJILJILJ;

    @Override // com.ss.android.ugc.aweme.detail.ui.DetailActivity
    public final void LLLLZI() {
        this.LLILLJJLI = null;
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        if (cls == InterfaceC1682240tsU.class) {
            this.LLJ = (InterfaceC1682240tsU) obj;
        } else if (cls == TakoAIVideoOverlayAbility.class) {
            this.LLJI = (TakoAIVideoOverlayAbility) obj;
        } else if (cls == InterfaceC1687280u0c.class) {
            this.LLJIJIL = (InterfaceC1687280u0c) obj;
        } else if (cls == C05VZ.class) {
            this.LLJILJIL = (C05VZ) obj;
        } else if (cls == ITakoRTCAbility.class) {
            this.LLJILJILJ = (ITakoRTCAbility) obj;
        }
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{TakoAIVideoDetailScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        if (cls == InterfaceC1682240tsU.class) {
            return this.LLJ;
        }
        if (cls == TakoAIVideoOverlayAbility.class) {
            return this.LLJI;
        }
        if (cls == InterfaceC1687280u0c.class) {
            return this.LLJIJIL;
        }
        if (cls == C05VZ.class) {
            return this.LLJILJIL;
        }
        if (cls == ITakoRTCAbility.class) {
            return this.LLJILJILJ;
        }
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(TakoAIVideoDetailScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(TakoAIVideoDetailScope.class);
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.detail.ui.DetailActivity, X.C199Y, com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.tako.aivideo.detail.page.TakoAiVideoDetailActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.tako.aivideo.detail.page.TakoAiVideoDetailActivity", "onResume", false);
    }

    @Override // com.ss.android.ugc.aweme.detail.ui.DetailActivity, X.C199Y, com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.tako.aivideo.detail.page.TakoAiVideoDetailActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.tako.aivideo.detail.page.TakoAiVideoDetailActivity", "onStart", false);
    }

    @Override // com.ss.android.ugc.aweme.detail.ui.DetailActivity, com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.tako.aivideo.detail.page.TakoAiVideoDetailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        if (cls == InterfaceC1682240tsU.class) {
            this.LLJ = null;
        } else if (cls == TakoAIVideoOverlayAbility.class) {
            this.LLJI = null;
        } else if (cls == InterfaceC1687280u0c.class) {
            this.LLJIJIL = null;
        } else if (cls == C05VZ.class) {
            this.LLJILJIL = null;
        } else if (cls == ITakoRTCAbility.class) {
            this.LLJILJILJ = null;
        }
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
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

    @Override // X.InterfaceC1687280u0c
    public final String LLF() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC1687280u0c
    public final C099G LLILLIZIL() {
        return this.LLIZ;
    }

    @Override // com.ss.android.ugc.aweme.detail.ui.DetailActivity, X.C199Y
    public final Class<? extends InterfaceC214902198i> getRootFragmentClz() {
        return TakoAiVideoDetailSafRootFragment.class;
    }

    @Override // com.ss.android.ugc.aweme.detail.ui.DetailActivity, X.C199Y
    public final Function0<InterfaceC214902198i> getRootFragmentFactory() {
        return C1602740roG.LL;
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{TakoAIVideoDetailScope.class}).unbindAbility(this.LLIZLLLIL, InterfaceC1687280u0c.class);
    }

    @Override // com.ss.android.ugc.aweme.detail.ui.DetailActivity, X.C199Y, com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) throws JSONException {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.tako.aivideo.detail.page.TakoAiVideoDetailActivity", "onCreate", true);
        C687700QyG.LJII(this);
        super.onCreate(bundle);
        activityConfiguration(AFwS264S0000000_24.get$arr$(415));
        C1606550ruP.LIZ.getClass();
        if (C1606550ruP.LIZ()) {
            getWindow().setWindowAnimations(R.style.f938o0);
        }
        this.LLIZ = C23250099c.LIZIZ(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C844340XAi(this, null), 3);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.tako.aivideo.detail.page.TakoAiVideoDetailActivity", "onCreate", false);
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{TakoAIVideoDetailScope.class}).bindAbility(this.LLIZLLLIL, InterfaceC1687280u0c.class);
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
