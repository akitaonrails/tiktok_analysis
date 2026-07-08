package com.ss.android.ugc.aweme.live.smoothhost;

import X.AbstractC214814194y;
import X.AnonymousClass1950;
import X.C01GW;
import X.C0TVI;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C0Y8U;
import X.C12WG;
import X.C1308910kAL;
import X.C1338270kvh;
import X.C1389890mGx;
import X.C14K9;
import X.C150Y;
import X.C1697810uHb;
import X.C1954807lC;
import X.C197U;
import X.C198E;
import X.C198G;
import X.C198H;
import X.C198M;
import X.C199E;
import X.C19AK;
import X.C19C8;
import X.C19EH;
import X.C20629915o1;
import X.C214868197a;
import X.C214932199m;
import X.C290160BYw;
import X.C299020Bno;
import X.C335910DEv;
import X.C339190DRl;
import X.C452501pT;
import X.C500260Jjc;
import X.C569770MWh;
import X.C571900Mbs;
import X.C682510Qpt;
import X.C786410Ut5;
import X.EnumC335920DEw;
import X.EnumC682280QpW;
import X.InterfaceC1563380qmm;
import X.InterfaceC1664670tQ9;
import X.InterfaceC20596815ig;
import X.InterfaceC20596915ih;
import X.InterfaceC20597515in;
import X.InterfaceC20630715o9;
import X.InterfaceC214897198d;
import X.InterfaceC214902198i;
import X.InterfaceC362610EJn;
import X.InterfaceC484050IyZ;
import X.InterfaceC524950KiL;
import X.InterfaceC569700MWa;
import X.InterfaceC775460UbQ;
import X.InterfaceC782970UnX;
import X.ViewOnTouchListenerC1087080eOY;
import Y.ARunnableS17S0400000_8;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelStore;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMultiTabBackInterceptionData;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveSmoothInteractionOptimizeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LinkMicMgPreviewLivePageSetting;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.scene.Scene;
import com.bytedance.scene.navigation.NavigationScene;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.live.smoothhost.LiveMultiTabWrapperActivity;
import com.ss.android.ugc.aweme.social.creation.api.mediapicker.EnterStoryParam;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS278S0000000_32;
import kotlin.jvm.internal.AwS276S0300000_32;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes33.dex */
public final class LiveMultiTabWrapperActivity extends BaseActivity implements InterfaceC1664670tQ9, InterfaceC775460UbQ, InterfaceC524950KiL, InterfaceC214897198d, InterfaceC1563380qmm, InterfaceC782970UnX, InterfaceC569700MWa, InterfaceC20596915ih {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiklPyp9OygjJjHELIOSs7ICo/PWEfITMpBDo/PCwYKC0EOiQ8OSohCSY4IDk6PDw=";
    public int LLILZ;
    public FrameLayout LLILZIL;
    public Drawable LLILZLL;
    public C19C8 LLIZLLLIL;
    public NavigationScene LLJ;
    public SurfaceView LLJI;
    public long LLJILJIL;
    public boolean LLJILJILJ;
    public boolean LLJJIII;
    public final C01GW LL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS278S0000000_32.get$arr$(64), "story_param", EnterStoryParam.class);
    public final HashMap<String, Boolean> LLILLJJLI = new HashMap<>();
    public volatile boolean LLILLL = true;
    public final LinkedHashSet<C198M> LLIZ = new LinkedHashSet<>();
    public final ArrayList<InterfaceC484050IyZ> LLJIJIL = new ArrayList<>();
    public final C01GW LLJILLL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 223));
    public final C198G LLJJ = new InterfaceC20597515in() { // from class: X.198G
        @Override // X.InterfaceC20597515in
        public final FragmentManager LIZ() {
            return this.LIZ.getOriginSupportFragmentManager();
        }

        @Override // X.InterfaceC20597515in
        public final void LIZIZ(Function0<Unit> function0) {
            LiveMultiTabWrapperActivity liveMultiTabWrapperActivity = this.LIZ;
            if (liveMultiTabWrapperActivity.LLJJIII) {
                function0.invoke();
            } else {
                liveMultiTabWrapperActivity.LLJJIJI.add(function0);
            }
        }
    };
    public final C01GW LLJJI = C452501pT.LIZIZ(new AwS576S0100000_32(this, 221));
    public final CopyOnWriteArrayList<Function0<Unit>> LLJJIJI = new CopyOnWriteArrayList<>();
    public final C198E LLJJIJIIJIL = new AnonymousClass1950() { // from class: X.198E
        @Override // X.AnonymousClass1950
        public final void LIZ() {
            LiveMultiTabWrapperActivity liveMultiTabWrapperActivity = this.LIZ;
            if (liveMultiTabWrapperActivity.LLJ == null) {
                liveMultiTabWrapperActivity.LLJJIII = true;
                Iterator<Function0<Unit>> it2 = liveMultiTabWrapperActivity.LLJJIJI.iterator();
                while (it2.hasNext()) {
                    it2.next().invoke();
                }
            }
        }
    };

    @Override // X.InterfaceC524950KiL
    public final void AH(InterfaceC362610EJn interfaceC362610EJn) {
    }

    @Override // X.InterfaceC1664670tQ9
    public final void LJJIL() {
        this.LLILLL = true;
    }

    @Override // X.InterfaceC569700MWa
    public final boolean LJLJJI() {
        return true;
    }

    @Override // X.InterfaceC569700MWa
    public final void LJLJLLL() {
    }

    @Override // X.InterfaceC569700MWa
    public final void LLIL() {
    }

    @Override // X.InterfaceC569700MWa
    public final boolean LLLLIIL() {
        return false;
    }

    @Override // X.InterfaceC1664670tQ9
    public final void LLLLJI() {
        this.LLILLL = false;
    }

    @Override // X.InterfaceC524950KiL
    public final void b8(InterfaceC362610EJn interfaceC362610EJn) {
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
        return false;
    }

    @Override // X.InterfaceC524950KiL
    public final void kF(InterfaceC362610EJn interfaceC362610EJn) {
    }

    @Override // X.InterfaceC214897198d
    public final boolean migrateDarkModeImplToFragment() {
        return false;
    }

    @Override // X.InterfaceC214897198d
    public final boolean migrateImmersiveBarImplToFragment() {
        return true;
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.smoothhost.LiveMultiTabWrapperActivity", "onResume", true);
        super.onResume();
        C19C8 c19c8 = this.LLIZLLLIL;
        if (c19c8 != null) {
            c19c8.LIZLLL();
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.smoothhost.LiveMultiTabWrapperActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.smoothhost.LiveMultiTabWrapperActivity", "onStart", true);
        super.onStart();
        C19C8 c19c8 = this.LLIZLLLIL;
        if (c19c8 != null) {
            c19c8.LJFF();
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.smoothhost.LiveMultiTabWrapperActivity", "onStart", false);
    }

    @Override // X.InterfaceC214897198d
    public final void setDynamicParentScene(C214932199m c214932199m) {
    }

    public final C198H LC() {
        NavigationScene navigationScene = this.LLJ;
        Scene sceneLLLLIIIILLL = navigationScene != null ? navigationScene.LLLLIIIILLL() : null;
        if (sceneLLLLIIIILLL instanceof C198H) {
            return (C198H) sceneLLLLIIIILLL;
        }
        return null;
    }

    @Override // X.InterfaceC775460UbQ
    public final void LJIIJ() {
        LiveMultiTabRootScene liveMultiTabRootScene;
        ViewOnTouchListenerC1087080eOY viewOnTouchListenerC1087080eOY;
        NavigationScene navigationScene = this.LLJ;
        if ((navigationScene != null ? navigationScene.LLLLIIIILLL() : null) instanceof LiveMultiTabRootScene) {
            NavigationScene navigationScene2 = this.LLJ;
            Scene sceneLLLLIIIILLL = navigationScene2 != null ? navigationScene2.LLLLIIIILLL() : null;
            if (!(sceneLLLLIIIILLL instanceof LiveMultiTabRootScene) || (liveMultiTabRootScene = (LiveMultiTabRootScene) sceneLLLLIIIILLL) == null || (viewOnTouchListenerC1087080eOY = liveMultiTabRootScene.LLJJJIL) == null) {
                return;
            }
            C786410Ut5.LJLLLLLL(4, viewOnTouchListenerC1087080eOY);
        }
    }

    @Override // X.InterfaceC775460UbQ
    public final void LJIILIIL() {
        LiveMultiTabRootScene liveMultiTabRootScene;
        ViewOnTouchListenerC1087080eOY viewOnTouchListenerC1087080eOY;
        NavigationScene navigationScene = this.LLJ;
        if ((navigationScene != null ? navigationScene.LLLLIIIILLL() : null) instanceof LiveMultiTabRootScene) {
            NavigationScene navigationScene2 = this.LLJ;
            Scene sceneLLLLIIIILLL = navigationScene2 != null ? navigationScene2.LLLLIIIILLL() : null;
            if (!(sceneLLLLIIIILLL instanceof LiveMultiTabRootScene) || (liveMultiTabRootScene = (LiveMultiTabRootScene) sceneLLLLIIIILLL) == null || (viewOnTouchListenerC1087080eOY = liveMultiTabRootScene.LLJJJIL) == null) {
                return;
            }
            C339190DRl.LIZLLL(viewOnTouchListenerC1087080eOY);
        }
    }

    @Override // X.InterfaceC782970UnX
    public final void LLLJIL() {
        C500260Jjc.LJIILIIL(this.LLJI);
    }

    public final void LLLLZLLIL() {
        this.LLILZ--;
    }

    public final void LLLZ() {
        this.LLILZ++;
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity
    public final void finish() {
        LLLZIL("finish", "Use TikTokSAARootGroupScene.finish instead.");
        super.finish();
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, android.app.Activity
    public final Intent getIntent() {
        LLLZIL("getIntent", "Use TikTokSAARootGroupScene.getArgumentsSafely instead.");
        return super.getIntent();
    }

    @Override // androidx.activity.ComponentActivity, X.C19FO, androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        LLLZIL("getLifecycle", "use Scene.getLifecycle() instead");
        return super.getLifecycle();
    }

    @Override // X.InterfaceC775460UbQ
    public final void hideBottomTab() {
        LiveMultiTabRootScene liveMultiTabRootScene;
        NavigationScene navigationScene = this.LLJ;
        if ((navigationScene != null ? navigationScene.LLLLIIIILLL() : null) instanceof LiveMultiTabRootScene) {
            NavigationScene navigationScene2 = this.LLJ;
            Scene sceneLLLLIIIILLL = navigationScene2 != null ? navigationScene2.LLLLIIIILLL() : null;
            if (!(sceneLLLLIIIILLL instanceof LiveMultiTabRootScene) || (liveMultiTabRootScene = (LiveMultiTabRootScene) sceneLLLLIIIILLL) == null) {
                return;
            }
            liveMultiTabRootScene.LLLLL(false);
        }
    }

    @Override // X.ActivityC21503719Dn, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() throws Throwable {
        NavigationScene navigationScene = this.LLJ;
        if (navigationScene != null) {
            C198H c198hLC = LC();
            if (navigationScene.LLLLLJIL(c198hLC != null ? c198hLC.buildPopOptions() : null)) {
                return;
            }
        }
        LiveMultiTabBackInterceptionData value = LiveSmoothInteractionOptimizeSetting.INSTANCE.getValue();
        if (!value.enableBackInterception) {
            super.onBackPressed();
            return;
        }
        long j = value.interval;
        AwS576S0100000_32 awS576S0100000_32 = new AwS576S0100000_32(this, 222);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (this.LLJILJILJ && jCurrentTimeMillis - this.LLJILJIL <= j) {
            this.LLJILJILJ = false;
            this.LLJILJIL = 0L;
            awS576S0100000_32.invoke();
        } else {
            this.LLJILJILJ = true;
            this.LLJILJIL = jCurrentTimeMillis;
            C1389890mGx c1389890mGx = new C1389890mGx(this);
            c1389890mGx.LJIIIZ(2131857058);
            c1389890mGx.LJIIJJI();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        C19C8 c19c8 = this.LLIZLLLIL;
        if (c19c8 != null) {
            c19c8.LJII();
        }
        super.onDestroy();
        for (Fragment fragment : getSupportFragmentManager().LJJLIIIJL()) {
            C19EH c19ehLJIIJ = getSupportFragmentManager().LJIIJ();
            c19ehLJIIJ.LJIIZILJ(fragment);
            c19ehLJIIJ.LJIIL();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onPause() {
        C19C8 c19c8 = this.LLIZLLLIL;
        if (c19c8 != null) {
            c19c8.LIZJ();
        }
        super.onPause();
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStop() {
        C19C8 c19c8 = this.LLIZLLLIL;
        if (c19c8 != null) {
            c19c8.LJI();
        }
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

    @Override // X.InterfaceC775460UbQ
    public final void showBottomTab() {
        LiveMultiTabRootScene liveMultiTabRootScene;
        NavigationScene navigationScene = this.LLJ;
        if ((navigationScene != null ? navigationScene.LLLLIIIILLL() : null) instanceof LiveMultiTabRootScene) {
            NavigationScene navigationScene2 = this.LLJ;
            Scene sceneLLLLIIIILLL = navigationScene2 != null ? navigationScene2.LLLLIIIILLL() : null;
            if (!(sceneLLLLIIIILLL instanceof LiveMultiTabRootScene) || (liveMultiTabRootScene = (LiveMultiTabRootScene) sceneLLLLIIIILLL) == null) {
                return;
            }
            liveMultiTabRootScene.LLLLL(true);
        }
    }

    @Override // X.InterfaceC20622815ms
    public final FragmentManager getContainerFragmentManager() {
        return C197U.LIZIZ(this);
    }

    public final FragmentManager getOriginSupportFragmentManager() {
        return super.getSupportFragmentManager();
    }

    @Override // X.C19EG
    public final FragmentManager getSupportFragmentManager() {
        return C290160BYw.LIZ() ? (FragmentManager) this.LLJJI.getValue() : super.getSupportFragmentManager();
    }

    @Override // androidx.activity.ComponentActivity, androidx.lifecycle.ViewModelStoreOwner
    public final ViewModelStore getViewModelStore() {
        return C290160BYw.LIZ() ? (ViewModelStore) this.LLJILLL.getValue() : super.getViewModelStore();
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity
    public final boolean isDarkModeSupported() {
        return !(C20629915o1.LIZJ(this) instanceof InterfaceC20596815ig);
    }

    @Override // X.InterfaceC214897198d
    public final boolean isDelegateFragmentManager() {
        return C290160BYw.LIZ();
    }

    @Override // android.app.Activity
    public final void onEnterAnimationComplete() {
        AbstractC214814194y abstractC214814194y;
        super.onEnterAnimationComplete();
        C198H c198hLC = LC();
        if (!(c198hLC instanceof AbstractC214814194y) || (abstractC214814194y = (AbstractC214814194y) c198hLC) == null) {
            return;
        }
        abstractC214814194y.onEnterAnimationComplete();
    }

    @Override // X.InterfaceC782970UnX
    public final SurfaceView LJLIIIL() {
        return this.LLJI;
    }

    @Override // X.InterfaceC214897198d
    public final void finishLastPage() {
        C197U.LIZ(this);
    }

    @Override // X.InterfaceC20622815ms
    public final InterfaceC20597515in getAbility() {
        return this.LLJJ;
    }

    @Override // X.InterfaceC20622815ms
    public final NavigationScene getNavigationScene() {
        return this.LLJ;
    }

    @Override // X.InterfaceC214897198d
    public final AnonymousClass1950 provideSAFActivityCallBack() {
        return this.LLJJIJIIJIL;
    }

    public static Bundle LLLLLZL(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @Override // X.InterfaceC1563380qmm
    public final Boolean LLFF(EnumC682280QpW enumC682280QpW) {
        String strLLLLZLLLI = LLLLZLLLI(enumC682280QpW);
        if (strLLLLZLLLI == null) {
            Boolean boolValueOf = Boolean.valueOf(this.LLILLL);
            this.LLILLL = false;
            return boolValueOf;
        }
        Boolean bool = this.LLILLJJLI.get(strLLLLZLLLI);
        this.LLILLJJLI.put(strLLLLZLLLI, Boolean.FALSE);
        return bool;
    }

    public final String LLLLZLLLI(EnumC682280QpW enumC682280QpW) {
        switch (C682510Qpt.LIZ[enumC682280QpW.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                return null;
            case 5:
            case 6:
            case 7:
                return "getLifecycle";
            case 8:
                return "finish";
            case BdTuring.TYPE_ECAF /* 9 */:
                return "getViewModelStore";
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return "getIntent";
            default:
                throw new C1954807lC();
        }
    }

    @Override // X.InterfaceC524950KiL
    public final void Qh(InterfaceC484050IyZ interfaceC484050IyZ) {
        this.LLJIJIL.add(interfaceC484050IyZ);
    }

    @Override // X.InterfaceC524950KiL
    public final void T4(InterfaceC484050IyZ interfaceC484050IyZ) {
        this.LLJIJIL.remove(interfaceC484050IyZ);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        AbstractC214814194y abstractC214814194y;
        C198H c198hLC = LC();
        if ((c198hLC instanceof AbstractC214814194y) && (abstractC214814194y = (AbstractC214814194y) c198hLC) != null) {
            abstractC214814194y.dispatchTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) throws Throwable {
        AbstractC214814194y abstractC214814194y;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.smoothhost.LiveMultiTabWrapperActivity", "onCreate", true);
        Map<String, Object> map = C1338270kvh.LIZ;
        this.LLILZ = 0;
        getWindow().setSoftInputMode(32);
        super.onCreate(bundle);
        if (LinkMicMgPreviewLivePageSetting.INSTANCE.showLayoutInPreviewLivePage()) {
            setContentView(R.layout.dbf);
        } else {
            setContentView(R.layout.dbc);
        }
        this.LLILZIL = (FrameLayout) findViewById(R.id.mtg);
        Fragment fragmentLJJJJZI = getSupportFragmentManager().LJJJJZI("LivePreviewTabScene");
        if (fragmentLJJJJZI != null) {
            C19EH c19ehLJIIJ = getSupportFragmentManager().LJIIJ();
            c19ehLJIIJ.LJIIZILJ(fragmentLJJJJZI);
            c19ehLJIIJ.LJIIL();
        }
        BottomTabManager bottomTabManager = BottomTabManager.LIZ;
        C150Y c150y = new C150Y(this, (EnterStoryParam) this.LL.getValue(), LLLLLZL(getIntent()));
        bottomTabManager.getClass();
        BottomTabManager.LIZIZ(c150y);
        Bundle bundleLLLLLZL = LLLLLZL(getIntent());
        if (bundleLLLLLZL == null) {
            bundleLLLLLZL = new Bundle();
        }
        Pair<NavigationScene, C19AK<?>> pairLIZIZ = C214868197a.LIZIZ(this, LiveMultiTabRootScene.class, bundleLLLLLZL, R.id.mtg, true, 0.0f);
        NavigationScene first = pairLIZIZ.getFirst();
        C19AK<?> second = pairLIZIZ.getSecond();
        this.LLJ = first;
        if (first != null) {
            first.LLJI = false;
        }
        this.LLJJIII = true;
        Iterator<Function0<Unit>> it2 = this.LLJJIJI.iterator();
        while (it2.hasNext()) {
            it2.next().invoke();
        }
        NavigationScene navigationScene = this.LLJ;
        if (navigationScene != null) {
            navigationScene.registerChildSceneLifecycleCallbacks(new C0Y8U() { // from class: X.198K
                @Override // X.C0Y8U, X.C19AH
                public final void LJIILJJIL() {
                    this.LIZ.LLLZ();
                }

                @Override // X.C0Y8U, X.C19AH
                public final void LJJJI() {
                    this.LIZ.LLLZ();
                }

                @Override // X.C0Y8U, X.C19AH
                public final void LJJJJ() {
                    this.LIZ.LLLZ();
                }

                @Override // X.C0Y8U, X.C19AH
                public final void LIZ(Scene scene) {
                    this.LIZ.LLLLZLLIL();
                }

                @Override // X.C0Y8U, X.C19AH
                public final void LIZLLL(Scene scene) {
                    this.LIZ.LLLLZLLIL();
                }

                @Override // X.C0Y8U, X.C19AH
                public final void LJIILIIL(Scene scene) {
                    this.LIZ.LLLZ();
                }

                @Override // X.C0Y8U, X.C19AH
                public final void LJIJJ(Scene scene) {
                    this.LIZ.LLLZ();
                }

                @Override // X.C0Y8U, X.C19AH
                public final void LJJ(Scene scene) {
                    this.LIZ.LLLZ();
                }

                @Override // X.C0Y8U, X.C19AH
                public final void LJJIFFI(Scene scene) {
                    this.LIZ.LLLLZLLIL();
                }

                @Override // X.C0Y8U, X.C19AH
                public final void LJJIII(Scene scene) {
                    this.LIZ.LLLLZLLIL();
                }

                @Override // X.C0Y8U, X.C19AH
                public final void LJJIIZI(Scene scene) {
                    this.LIZ.LLLLZLLIL();
                }

                @Override // X.C0Y8U, X.C19AH
                public final void LJJIZ(Scene scene) {
                    this.LIZ.LLLLZLLIL();
                }

                @Override // X.C0Y8U, X.C19AH
                public final void LJJJ(Scene scene) {
                    this.LIZ.LLLLZLLIL();
                }

                @Override // X.C0Y8U, X.C19AH
                public final void LJJJJIZL(Scene scene) {
                    this.LIZ.LLLZ();
                }

                @Override // X.C0Y8U, X.C19AH
                public final void LJJJJL(Scene scene) {
                    this.LIZ.LLLZ();
                }

                @Override // X.C0Y8U, X.C19AH
                public final void LJJI(Scene scene, Bundle bundle2) {
                    this.LIZ.LLLLZLLIL();
                }

                @Override // X.C0Y8U, X.C19AH
                public final void LJJIJIIJIL(Scene scene, Bundle bundle2) {
                    this.LIZ.LLLZ();
                }

                @Override // X.C0Y8U, X.C19AH
                public final void LJJJJZ(Scene scene, Bundle bundle2) {
                    this.LIZ.LLLLZLLIL();
                }
            }, true);
        }
        C19C8 c19c8 = new C19C8(second);
        this.LLIZLLLIL = c19c8;
        try {
            c19c8.LIZIZ(this, bundle);
            C198H c198hLC = LC();
            if ((c198hLC instanceof AbstractC214814194y) && (abstractC214814194y = (AbstractC214814194y) c198hLC) != null) {
                C569770MWh.LIZLLL(abstractC214814194y.getStartAnimationType(), this);
            }
        } catch (OutOfMemoryError e) {
            TryCatchGuardChecker.doCheck(e);
            AwS576S0100000_32 awS576S0100000_32 = new AwS576S0100000_32(this, 708);
            this.LLILLL = false;
            awS576S0100000_32.invoke();
            this.LLILLL = true;
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(this, "aweme://main");
            smartRouteBuildRoute.addFlags(268468224);
            smartRouteBuildRoute.open();
            C571900Mbs.LIZ("OOM in SAAActivity onCreate");
        }
        this.LLJI = (SurfaceView) findViewById(R.id.n25);
        final View viewFindViewById = findViewById(R.id.hkt);
        if (viewFindViewById != null) {
            if (Build.VERSION.SDK_INT >= 35) {
                C14K9.LJIJJ(viewFindViewById, new C0TVI() { // from class: X.10JY
                    @Override // X.C0TVI
                    public final C20246014Ju onApplyWindowInsets(View view, C20246014Ju c20246014Ju) {
                        C20244914Jj c20244914JjLIZ = c20246014Ju.LIZ(7);
                        viewFindViewById.getLayoutParams().height = c20244914JjLIZ.LIZLLL;
                        View view2 = viewFindViewById;
                        C786410Ut5.W5(view2, view2.getLayoutParams());
                        return C20246014Ju.LIZIZ;
                    }
                });
            } else {
                C500260Jjc.LJIILIIL(viewFindViewById);
            }
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.smoothhost.LiveMultiTabWrapperActivity", "onCreate", false);
    }

    @Override // X.ActivityC21503719Dn, androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        AbstractC214814194y abstractC214814194y;
        super.onNewIntent(intent);
        Fragment fragmentLJJJJZI = getSupportFragmentManager().LJJJJZI("LivePreviewTabScene");
        if (fragmentLJJJJZI != null) {
            C19EH c19ehLJIIJ = getSupportFragmentManager().LJIIJ();
            c19ehLJIIJ.LJIIZILJ(fragmentLJJJJZI);
            c19ehLJIIJ.LJIIL();
        }
        C198H c198hLC = LC();
        if (intent.getBooleanExtra("start_live_single_activity", false) && (c198hLC instanceof InterfaceC20630715o9)) {
            InterfaceC20630715o9 interfaceC20630715o9 = (InterfaceC20630715o9) c198hLC;
            if (interfaceC20630715o9.F0() instanceof InterfaceC20596815ig) {
                interfaceC20630715o9.LLLLIILLL(LLLLLZL(intent));
                return;
            }
        }
        if (LC() instanceof LiveMultiTabRootScene) {
            C198H c198hLC2 = LC();
            if (!(c198hLC2 instanceof LiveMultiTabRootScene) || (abstractC214814194y = (AbstractC214814194y) c198hLC2) == null) {
                return;
            }
            abstractC214814194y.processNewArguments(LLLLLZL(intent));
            return;
        }
        BottomTabManager bottomTabManager = BottomTabManager.LIZ;
        C150Y c150y = new C150Y(this, (EnterStoryParam) this.LL.getValue(), LLLLLZL(intent));
        bottomTabManager.getClass();
        BottomTabManager.LIZIZ(c150y);
        Bundle bundleLLLLLZL = LLLLLZL(intent);
        if (bundleLLLLLZL == null) {
            bundleLLLLLZL = new Bundle();
        }
        LiveMultiTabRootScene liveMultiTabRootScene = new LiveMultiTabRootScene();
        C199E c199e = C199E.SINGLE_TASK;
        NavigationScene navigationScene = this.LLJ;
        if (navigationScene == null) {
            return;
        }
        C12WG.LIZJ(navigationScene, new ARunnableS17S0400000_8(c199e, this, liveMultiTabRootScene, bundleLLLLLZL, 5));
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        C19C8 c19c8 = this.LLIZLLLIL;
        if (c19c8 != null) {
            c19c8.LJ(bundle);
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.smoothhost.LiveMultiTabWrapperActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.C19FO, android.app.Activity
    public final void setRequestedOrientation(int i) {
        super.setRequestedOrientation(i);
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

    @Override // X.InterfaceC1563380qmm
    public final void LLJILJILJ(EnumC682280QpW enumC682280QpW, Boolean bool) {
        String strLLLLZLLLI = LLLLZLLLI(enumC682280QpW);
        if (strLLLLZLLLI == null) {
            if (!Intrinsics.LJFF(bool, Boolean.FALSE)) {
                this.LLILLL = true;
                return;
            } else {
                this.LLILLL = false;
                return;
            }
        }
        if (bool == null) {
            this.LLILLJJLI.remove(strLLLLZLLLI);
        } else {
            this.LLILLJJLI.put(strLLLLZLLLI, bool);
        }
    }

    @Override // X.InterfaceC1563380qmm
    public final <T> T LLLIIL(EnumC682280QpW enumC682280QpW, Function0<? extends T> function0) {
        switch (C682510Qpt.LIZ[enumC682280QpW.ordinal()]) {
            case 1:
                this.LLILLL = false;
                T tInvoke = function0.invoke();
                this.LLILLL = true;
                return tInvoke;
            case 2:
            case 3:
            case 4:
                return function0.invoke();
            case 5:
            case 6:
            case 7:
                return (T) Ss("getLifecycle", function0);
            case 8:
                return (T) Ss("finish", function0);
            case BdTuring.TYPE_ECAF /* 9 */:
                return (T) Ss("getViewModelStore", function0);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return (T) Ss("getIntent", function0);
            default:
                throw new C1954807lC();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLZIL(java.lang.String r6, java.lang.String r7) {
        /*
            Method dump skipped, instruction units count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.live.smoothhost.LiveMultiTabWrapperActivity.LLLZIL(java.lang.String, java.lang.String):void");
    }

    public final <T> T Ss(String str, Function0<? extends T> function0) {
        this.LLILLJJLI.put(str, Boolean.FALSE);
        T tInvoke = function0.invoke();
        this.LLILLJJLI.put(str, Boolean.TRUE);
        return tInvoke;
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19GS, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        Object obj;
        Boolean boolOnActivityKeyDown;
        NavigationScene navigationScene = this.LLJ;
        if (navigationScene != null) {
            Scene sceneLLLLIIIILLL = navigationScene.LLLLIIIILLL();
            obj = sceneLLLLIIIILLL;
            if (sceneLLLLIIIILLL != null) {
                boolean zLIZIZ = C12WG.LIZIZ(sceneLLLLIIIILLL);
                obj = sceneLLLLIIIILLL;
                if (zLIZIZ) {
                    return super.onKeyDown(i, keyEvent);
                }
            }
        } else {
            obj = null;
        }
        if ((obj instanceof C198H) && (boolOnActivityKeyDown = ((C198H) obj).onActivityKeyDown(i, keyEvent)) != null) {
            return boolOnActivityKeyDown.booleanValue();
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // X.ActivityC21503719Dn, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyLongPress(int i, KeyEvent keyEvent) {
        Object obj;
        Boolean boolOnActivityKeyLongPress;
        NavigationScene navigationScene = this.LLJ;
        if (navigationScene != null) {
            Scene sceneLLLLIIIILLL = navigationScene.LLLLIIIILLL();
            obj = sceneLLLLIIIILLL;
            if (sceneLLLLIIIILLL != null) {
                boolean zLIZIZ = C12WG.LIZIZ(sceneLLLLIIIILLL);
                obj = sceneLLLLIIIILLL;
                if (zLIZIZ) {
                    return super.onKeyLongPress(i, keyEvent);
                }
            }
        } else {
            obj = null;
        }
        if ((obj instanceof C198H) && (boolOnActivityKeyLongPress = ((C198H) obj).onActivityKeyLongPress(i, keyEvent)) != null) {
            return boolOnActivityKeyLongPress.booleanValue();
        }
        return super.onKeyLongPress(i, keyEvent);
    }

    @Override // X.ActivityC21503719Dn, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        Object obj;
        Boolean boolOnActivityKeyUp;
        NavigationScene navigationScene = this.LLJ;
        if (navigationScene != null) {
            Scene sceneLLLLIIIILLL = navigationScene.LLLLIIIILLL();
            obj = sceneLLLLIIIILLL;
            if (sceneLLLLIIIILLL != null) {
                boolean zLIZIZ = C12WG.LIZIZ(sceneLLLLIIIILLL);
                obj = sceneLLLLIIIILLL;
                if (zLIZIZ) {
                    return super.onKeyUp(i, keyEvent);
                }
            }
        } else {
            obj = null;
        }
        if ((obj instanceof C198H) && (boolOnActivityKeyUp = ((C198H) obj).onActivityKeyUp(i, keyEvent)) != null) {
            return boolOnActivityKeyUp.booleanValue();
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle, PersistableBundle persistableBundle) {
        Ss("getLifecycle", new AwS276S0300000_32(this, bundle, persistableBundle, 5));
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        Iterator<InterfaceC484050IyZ> it2 = this.LLJIJIL.iterator();
        while (it2.hasNext()) {
            it2.next().onActivityResult(i, i2, intent);
        }
        C198H c198hLC = LC();
        if (c198hLC == null) {
            super.onActivityResult(i, i2, intent);
            return;
        }
        if (c198hLC instanceof AbstractC214814194y) {
            AbstractC214814194y abstractC214814194y = (AbstractC214814194y) c198hLC;
            if (abstractC214814194y.onInterceptActivityResult(i, i2, intent)) {
                return;
            }
            super.onActivityResult(i, i2, intent);
            abstractC214814194y.onActivityResult(i, i2, intent);
            return;
        }
        if (!c198hLC.onResult(i, i2, intent)) {
            super.onActivityResult(i, i2, intent);
        }
    }

    @Override // X.C19EG, androidx.activity.ComponentActivity, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) throws Throwable {
        int iIntValue = i;
        int[] iArr2 = iArr;
        String[] strArr2 = strArr;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(11051, "com/ss/android/ugc/aweme/live/smoothhost/LiveMultiTabWrapperActivity", "onRequestPermissionsResult", this, new Object[]{Integer.valueOf(iIntValue), strArr2, iArr2}, "void", new C0WZW(false, "(I[Ljava/lang/String;[I)V", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOahdZqAzz/Vu2qBuhWgZfkNPgU5/plVlP7CkRPRG9WJ28RhfCG6B+SfL88=", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null) {
            Object obj = objArr[0];
            if (obj != null) {
                iIntValue = ((Integer) obj).intValue();
            }
            Object[] objArr2 = c0wsuLIZIZ.LIZJ;
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                strArr2 = (String[]) obj2;
            }
            Object obj3 = objArr2[2];
            if (obj3 != null) {
                iArr2 = (int[]) obj3;
            }
        }
        super.onRequestPermissionsResult(iIntValue, strArr2, iArr2);
    }
}
