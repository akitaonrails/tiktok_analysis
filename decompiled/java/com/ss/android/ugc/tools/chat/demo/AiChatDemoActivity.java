package com.ss.android.ugc.tools.chat.demo;

import X.AbstractC214814194y;
import X.AnonymousClass1950;
import X.C1308910kAL;
import X.C1697810uHb;
import X.C197U;
import X.C197W;
import X.C198H;
import X.C19AK;
import X.C19C8;
import X.C20629915o1;
import X.C214868197a;
import X.C214932199m;
import X.C2188811AlT;
import X.C299020Bno;
import X.C335910DEv;
import X.C569770MWh;
import X.C571900Mbs;
import X.EnumC335920DEw;
import X.InterfaceC20597515in;
import X.InterfaceC214897198d;
import X.InterfaceC214902198i;
import X.InterfaceC362610EJn;
import X.InterfaceC484050IyZ;
import X.InterfaceC524950KiL;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.KeyEvent;
import androidx.fragment.app.FragmentManager;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.scene.Scene;
import com.bytedance.scene.navigation.NavigationScene;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes33.dex */
public final class AiChatDemoActivity extends BaseActivity implements InterfaceC214897198d, InterfaceC524950KiL {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZjEjJiMgZiYkHELIOSKDt9LCAhJmESIQYkKDsXLSgjCCwnITMlPTY=";
    public NavigationScene LL;
    public C19C8 LLILLL;
    public final C197W LLILLJJLI = new InterfaceC20597515in() { // from class: X.197W
        @Override // X.InterfaceC20597515in
        public final void LIZIZ(Function0<Unit> function0) {
        }

        @Override // X.InterfaceC20597515in
        public final FragmentManager LIZ() {
            return this.LIZ.getSupportFragmentManager();
        }
    };
    public final ArrayList<InterfaceC484050IyZ> LLILZ = new ArrayList<>();
    public final ArrayList<InterfaceC362610EJn> LLILZIL = new ArrayList<>();

    @Override // X.InterfaceC524950KiL
    public final void AH(InterfaceC362610EJn interfaceC362610EJn) {
    }

    @Override // X.InterfaceC214897198d
    public final void beforeNavigating(Scene scene, Scene scene2) {
    }

    @Override // X.InterfaceC214897198d
    public final InterfaceC214902198i getDynamicParentRootFragment() {
        return null;
    }

    @Override // X.InterfaceC214897198d
    public final C214932199m getDynamicParentScene() {
        return null;
    }

    @Override // X.InterfaceC214897198d
    public final boolean getEnableSAF() {
        return true;
    }

    @Override // X.InterfaceC20622815ms
    public final C198H getRootSAFSceneWrapper() {
        return null;
    }

    @Override // X.InterfaceC214897198d
    public final boolean getUseRootFragmentForPageCallbacks() {
        return true;
    }

    @Override // X.InterfaceC214897198d
    public final boolean isDelegateFragmentManager() {
        return false;
    }

    @Override // X.InterfaceC214897198d
    public final boolean migrateDarkModeImplToFragment() {
        return false;
    }

    @Override // X.InterfaceC214897198d
    public final boolean migrateImmersiveBarImplToFragment() {
        return false;
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.tools.chat.demo.AiChatDemoActivity", "onResume", true);
        super.onResume();
        C19C8 c19c8 = this.LLILLL;
        if (c19c8 != null) {
            c19c8.LIZLLL();
        }
        ActivityAgent.onTrace("com.ss.android.ugc.tools.chat.demo.AiChatDemoActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.tools.chat.demo.AiChatDemoActivity", "onStart", true);
        super.onStart();
        C19C8 c19c8 = this.LLILLL;
        if (c19c8 != null) {
            c19c8.LJFF();
        }
        ActivityAgent.onTrace("com.ss.android.ugc.tools.chat.demo.AiChatDemoActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.tools.chat.demo.AiChatDemoActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.InterfaceC214897198d
    public final AnonymousClass1950 provideSAFActivityCallBack() {
        return null;
    }

    @Override // X.InterfaceC214897198d
    public final void setDynamicParentScene(C214932199m c214932199m) {
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        C19C8 c19c8 = this.LLILLL;
        if (c19c8 != null) {
            c19c8.LJII();
        }
        super.onDestroy();
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity
    public final void finish() {
        AbstractC214814194y abstractC214814194y;
        super.finish();
        C198H c198hLIZLLL = C20629915o1.LIZLLL(this);
        if (!(c198hLIZLLL instanceof AbstractC214814194y) || (abstractC214814194y = (AbstractC214814194y) c198hLIZLLL) == null) {
            return;
        }
        C569770MWh.LIZ(abstractC214814194y.getFinishAnimationType(), this);
    }

    @Override // X.InterfaceC20622815ms
    public final FragmentManager getContainerFragmentManager() {
        return C197U.LIZIZ(this);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onPause() {
        super.onPause();
        C19C8 c19c8 = this.LLILLL;
        if (c19c8 != null) {
            c19c8.LIZJ();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStop() {
        super.onStop();
        C19C8 c19c8 = this.LLILLL;
        if (c19c8 != null) {
            c19c8.LJI();
        }
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

    @Override // X.InterfaceC214897198d
    public final void finishLastPage() {
        C197U.LIZ(this);
    }

    @Override // X.InterfaceC20622815ms
    public final InterfaceC20597515in getAbility() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC20622815ms
    public final NavigationScene getNavigationScene() {
        return this.LL;
    }

    @Override // X.InterfaceC524950KiL
    public final void Qh(InterfaceC484050IyZ interfaceC484050IyZ) {
        this.LLILZ.add(interfaceC484050IyZ);
    }

    @Override // X.InterfaceC524950KiL
    public final void T4(InterfaceC484050IyZ interfaceC484050IyZ) {
        this.LLILZ.remove(interfaceC484050IyZ);
    }

    @Override // X.InterfaceC524950KiL
    public final void b8(InterfaceC362610EJn interfaceC362610EJn) {
        this.LLILZIL.remove(interfaceC362610EJn);
    }

    @Override // X.InterfaceC524950KiL
    public final void kF(InterfaceC362610EJn interfaceC362610EJn) {
        this.LLILZIL.add(interfaceC362610EJn);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        NavigationScene navigationScene = this.LL;
        if (navigationScene != null) {
            navigationScene.onConfigurationChanged(configuration);
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Bundle bundle2;
        AbstractC214814194y abstractC214814194y;
        ActivityAgent.onTrace("com.ss.android.ugc.tools.chat.demo.AiChatDemoActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.bje);
        try {
            bundle2 = getIntent().getExtras();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        Pair<NavigationScene, C19AK<?>> pairLIZIZ = C214868197a.LIZIZ(this, AiChatDemoRootScene.class, bundle2, R.id.f7n, true, 0.0f);
        NavigationScene first = pairLIZIZ.getFirst();
        C19AK<?> second = pairLIZIZ.getSecond();
        this.LL = first;
        C19C8 c19c8 = new C19C8(second);
        this.LLILLL = c19c8;
        try {
            c19c8.LIZIZ(this, bundle);
            C198H c198hLIZLLL = C20629915o1.LIZLLL(this);
            if ((c198hLIZLLL instanceof AbstractC214814194y) && (abstractC214814194y = (AbstractC214814194y) c198hLIZLLL) != null) {
                C569770MWh.LIZLLL(abstractC214814194y.getStartAnimationType(), this);
            }
        } catch (OutOfMemoryError e2) {
            TryCatchGuardChecker.doCheck(e2);
            finish();
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(this, "aweme://main");
            smartRouteBuildRoute.addFlags(268468224);
            smartRouteBuildRoute.open();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("OOM in AiChatDemoctivity onCreate: ");
            sbLIZ.append(e2.getMessage());
            C571900Mbs.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        }
        ActivityAgent.onTrace("com.ss.android.ugc.tools.chat.demo.AiChatDemoActivity", "onCreate", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        C19C8 c19c8 = this.LLILLL;
        if (c19c8 != null) {
            c19c8.LJ(bundle);
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

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19GS, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        Iterator<InterfaceC362610EJn> it2 = this.LLILZIL.iterator();
        while (it2.hasNext()) {
            if (it2.next().onKeyDown(i, keyEvent)) {
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        Iterator<InterfaceC484050IyZ> it2 = this.LLILZ.iterator();
        while (it2.hasNext()) {
            if (it2.next().onActivityResult(i, i2, intent)) {
                return;
            }
        }
        super.onActivityResult(i, i2, intent);
    }
}
