package com.ss.android.ugc.aweme.adaptation.saa;

import X.AbstractActivityC19422710yn;
import X.AbstractC214814194y;
import X.AbstractC903280Zc6;
import X.AnonymousClass1950;
import X.C013C;
import X.C01GW;
import X.C090A;
import X.C0C64;
import X.C0CHQ;
import X.C0MWH;
import X.C0MWI;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C0Y8U;
import X.C126Y;
import X.C128Y;
import X.C12WG;
import X.C1309570kBP;
import X.C1409905fV;
import X.C140D;
import X.C1442410ndf;
import X.C1634660sdk;
import X.C1654320t9S;
import X.C1664590tQ1;
import X.C1664600tQ2;
import X.C1664640tQ6;
import X.C1954807lC;
import X.C197U;
import X.C198D;
import X.C198F;
import X.C198H;
import X.C198L;
import X.C198M;
import X.C19A3;
import X.C19AK;
import X.C19C8;
import X.C19EH;
import X.C201954140i;
import X.C201955140j;
import X.C20629915o1;
import X.C214868197a;
import X.C214932199m;
import X.C259800zU;
import X.C280980Azo;
import X.C280990Azp;
import X.C289940BYa;
import X.C290160BYw;
import X.C299090Bnv;
import X.C452501pT;
import X.C524780Ki4;
import X.C560380LyO;
import X.C569770MWh;
import X.C571900Mbs;
import X.C682500Qps;
import X.C786410Ut5;
import X.C801140Vbk;
import X.EnumC682280QpW;
import X.InterfaceC1452540nu0;
import X.InterfaceC1664670tQ9;
import X.InterfaceC20011613Rq;
import X.InterfaceC20596815ig;
import X.InterfaceC20597015ii;
import X.InterfaceC20597515in;
import X.InterfaceC20630715o9;
import X.InterfaceC214897198d;
import X.InterfaceC214902198i;
import X.InterfaceC362610EJn;
import X.InterfaceC484050IyZ;
import Y.ARunnableS103S0100000_3;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import com.bytedance.als.h0;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.scene.Scene;
import com.bytedance.scene.navigation.NavigationScene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.adaptation.saa.SAAActivity;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.internal.ICreationEventMonitorService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.performance.ICrashReportService;
import com.ss.android.ugc.aweme.services.performance.OpenCameraStep;
import com.ss.android.ugc.aweme.shortvideo.util.j;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import joo.f;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS219S0000000_30;
import kotlin.jvm.internal.AFwS223S0000000_32;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.AwS116S1000000_32;
import kotlin.jvm.internal.AwS146S0110000_30;
import kotlin.jvm.internal.AwS276S0300000_32;
import kotlin.jvm.internal.AwS425S0200000_24;
import kotlin.jvm.internal.AwS431S0200000_30;
import kotlin.jvm.internal.AwS433S0200000_32;
import kotlin.jvm.internal.AwS574S0100000_30;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.AwS587S0100000_8;
import kotlin.jvm.internal.AwS611S0100000_32;
import kotlin.jvm.internal.Intrinsics;
import lgo.a;

/* JADX INFO: loaded from: classes33.dex */
public class SAAActivity extends AbstractActivityC19422710yn implements InterfaceC1664670tQ9, InterfaceC214897198d, InterfaceC20597015ii {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiHELIOSQoKD8nKTElJiF9OyQtZxwSCQQvPSYlITE1";
    public volatile int LLILLJJLI;
    public int LLILLL;
    public volatile boolean LLILZ;
    public C19C8 LLILZLL;
    public NavigationScene LLIZ;
    public boolean LLJJIII;
    public final HashMap<String, Boolean> LL = new HashMap<>();
    public final LinkedHashSet<C198M> LLILZIL = new LinkedHashSet<>();
    public final h0 LLIZLLLIL = new h0(null);
    public final ICrashReportService LLJ = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).provideErrorReporter();
    public final C01GW LLJI = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(35));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(57));
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 87));
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new AwS574S0100000_30(this, 20));
    public final C01GW LLJILLL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 88));
    public final C198F LLJJ = new InterfaceC20597515in() { // from class: X.198F
        @Override // X.InterfaceC20597515in
        public final FragmentManager LIZ() {
            return this.LIZ.getOriginSupportFragmentManager();
        }

        @Override // X.InterfaceC20597515in
        public final void LIZIZ(Function0<Unit> function0) {
            SAAActivity sAAActivity = this.LIZ;
            if (sAAActivity.LLJJIII) {
                function0.invoke();
            } else {
                sAAActivity.LLJJIJI.add(function0);
            }
        }
    };
    public final C01GW LLJJI = C452501pT.LIZIZ(new AwS576S0100000_32(this, 85));
    public final CopyOnWriteArrayList<Function0<Unit>> LLJJIJI = new CopyOnWriteArrayList<>();
    public final C198D LLJJIJIIJIL = new AnonymousClass1950() { // from class: X.198D
        @Override // X.AnonymousClass1950
        public final void LIZ() {
            SAAActivity sAAActivity = this.LIZ;
            if (sAAActivity.LLIZ == null) {
                sAAActivity.LLJJIII = true;
                Iterator<Function0<Unit>> it2 = sAAActivity.LLJJIJI.iterator();
                while (it2.hasNext()) {
                    it2.next().invoke();
                }
            }
        }
    };

    @Override // X.InterfaceC1616690sAl
    public final void LJJJJZI() {
    }

    @Override // X.InterfaceC569700MWa
    public final boolean LJLJJI() {
        return false;
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

    @Override // X.InterfaceC20597015ii
    public final void Vv() {
        this.LLILZ = false;
    }

    @Override // X.InterfaceC20597015ii
    public final void Ye() {
        this.LLILZ = true;
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

    @Override // X.InterfaceC214897198d
    public final boolean migrateDarkModeImplToFragment() {
        return false;
    }

    @Override // X.InterfaceC214897198d
    public final boolean migrateImmersiveBarImplToFragment() {
        return false;
    }

    @Override // X.InterfaceC214897198d
    public final void setDynamicParentScene(C214932199m c214932199m) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC20597015ii
    public final Lifecycle EI() {
        C259800zU c259800zU = new C259800zU();
        Ss("getLifecycle", new AwS425S0200000_24(c259800zU, (C259800zU<Lifecycle>) this, (SAAActivity) 5));
        T t = c259800zU.element;
        if (t != 0) {
            return (Lifecycle) t;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // X.InterfaceC20597015ii
    public final C198H LC() {
        NavigationScene navigationScene = this.LLIZ;
        Scene sceneLLLLIIIILLL = navigationScene != null ? navigationScene.LLLLIIIILLL() : null;
        if (sceneLLLLIIIILLL instanceof C198H) {
            return (C198H) sceneLLLLIIIILLL;
        }
        return null;
    }

    @Override // X.InterfaceC1664670tQ9
    public final void LJJIL() {
        this.LLILLJJLI--;
    }

    @Override // X.InterfaceC1664670tQ9
    public final void LLLLJI() {
        this.LLILLJJLI++;
    }

    public final void LLLLZLLIL() {
        ZN(new AwS576S0100000_32(this, 82));
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(this, "aweme://main");
        smartRouteBuildRoute.addFlags(268468224);
        smartRouteBuildRoute.open();
    }

    public final void LLLLZLLLI() {
        this.LLILLL--;
    }

    public final void LLLZIL() {
        this.LLILLL++;
    }

    @Override // X.InterfaceC1848690yCx
    public final boolean enableSkipGatherRegion() {
        return ((Boolean) C280990Azp.LIZ.getValue()).booleanValue();
    }

    @Override // X.InterfaceC1848690yCx
    public final boolean enableSkipInset() {
        return ((Boolean) C280980Azo.LIZ.getValue()).booleanValue();
    }

    @Override // X.InterfaceC20597015ii
    public final void fM() {
        ZN(new AwS576S0100000_32(this, 86));
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity
    public final void finish() {
        AbstractC214814194y abstractC214814194y;
        LLLZZIL("finish", "Use TikTokSAARootGroupScene.finish instead.");
        super.finish();
        C198H c198hLC = LC();
        if (!(c198hLC instanceof AbstractC214814194y) || (abstractC214814194y = (AbstractC214814194y) c198hLC) == null) {
            return;
        }
        C569770MWh.LIZ(abstractC214814194y.getFinishAnimationType(), this);
    }

    @Override // androidx.activity.ComponentActivity, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final AbstractC903280Zc6 getDefaultViewModelCreationExtras() {
        return (AbstractC903280Zc6) Ss("getIntent", new AwS576S0100000_32(this, 83));
    }

    @Override // androidx.activity.ComponentActivity, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return (ViewModelProvider.Factory) Ss("getIntent", new AwS576S0100000_32(this, 84));
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, android.app.Activity
    public final Intent getIntent() {
        LLLZZIL("getIntent", "Use TikTokSAARootGroupScene.getArgumentsSafely instead.");
        return super.getIntent();
    }

    @Override // androidx.activity.ComponentActivity, X.C19FO, androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        LLLZZIL("getLifecycle", "use Scene.getLifecycle() instead");
        return super.getLifecycle();
    }

    @Override // X.InterfaceC20011613Rq
    public final boolean isRecording() {
        List<Scene> sceneList;
        NavigationScene navigationScene = this.LLIZ;
        if (navigationScene == null || (sceneList = navigationScene.getSceneList()) == null) {
            return false;
        }
        for (C128Y c128y : sceneList) {
            if ((c128y instanceof InterfaceC20011613Rq) && ((InterfaceC20011613Rq) c128y).isRecording()) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC20597015ii
    public final List<Scene> kI() {
        NavigationScene navigationScene = this.LLIZ;
        if (navigationScene != null) {
            return navigationScene.getSceneList();
        }
        return null;
    }

    @Override // X.ActivityC21503719Dn, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        NavigationScene navigationScene = this.LLIZ;
        if (navigationScene != null) {
            C198H c198hLC = LC();
            if (navigationScene.LLLLLJIL(c198hLC != null ? c198hLC.buildPopOptions() : null)) {
                return;
            }
        }
        super.onBackPressed();
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        C19C8 c19c8 = this.LLILZLL;
        if (c19c8 != null) {
            c19c8.LJII();
        }
        C560380LyO.LIZ.getClass();
        C560380LyO.LJ();
        C201955140j.LIZIZ("CreativeToolStayTimeMonitor", "SAAActivity Destroyed");
        super.onDestroy();
        for (Fragment fragment : getSupportFragmentManager().LJJLIIIJL()) {
            C19EH c19ehLJIIJ = getSupportFragmentManager().LJIIJ();
            c19ehLJIIJ.LJIIZILJ(fragment);
            c19ehLJIIJ.LJIIL();
        }
        C0CHQ.LIZ().LJIIIZ();
        C1634660sdk.LIZ();
        C090A.LIZ = false;
        C140D.LIZ.getClass();
        C140D.LJIIIIZZ.clear();
        C0CHQ.LIZ().LJIIZILJ();
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "studio_fix_saa_navigation_scene_leak", true, true)) {
            this.LLILZLL = null;
            this.LLIZ = null;
            this.LLIZLLLIL.LJII(null);
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onPause() {
        C19C8 c19c8 = this.LLILZLL;
        if (c19c8 != null) {
            c19c8.LIZJ();
        }
        super.onPause();
        C201955140j.LIZIZ("CreativeToolStayTimeMonitor", "SAAActivity Paused");
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.adaptation.saa.SAAActivity", "onResume", true);
        a.LIZIZ.recordService().LJFF();
        super.onResume();
        C198L c198l = (C198L) this.LLJILJIL.getValue();
        if (c198l != null) {
            c198l.onResume();
        }
        j jVar = C524780Ki4.LIZ;
        jVar.step("av_video_open_camera_track", OpenCameraStep.SAA_ON_RESUME_BEGIN.getStepName());
        C19C8 c19c8 = this.LLILZLL;
        if (c19c8 != null) {
            c19c8.LIZLLL();
        }
        jVar.step("av_video_open_camera_track", OpenCameraStep.SAA_ON_RESUME_END.getStepName());
        C201955140j.LIZIZ("CreativeToolStayTimeMonitor", "SAAActivity Resumed");
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.adaptation.saa.SAAActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.adaptation.saa.SAAActivity", "onStart", true);
        super.onStart();
        C198L c198l = (C198L) this.LLJILJIL.getValue();
        if (c198l != null) {
            c198l.onStart();
        }
        j jVar = C524780Ki4.LIZ;
        jVar.step("av_video_open_camera_track", OpenCameraStep.SAA_ON_START_BEGIN.getStepName());
        C19C8 c19c8 = this.LLILZLL;
        if (c19c8 != null) {
            c19c8.LJFF();
        }
        jVar.step("av_video_open_camera_track", OpenCameraStep.SAA_ON_START_END.getStepName());
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.adaptation.saa.SAAActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public void onStop() {
        C19C8 c19c8 = this.LLILZLL;
        if (c19c8 != null) {
            c19c8.LJI();
        }
        super.onStop();
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
        if (C290160BYw.LIZ()) {
            return (ViewModelStore) this.LLJILLL.getValue();
        }
        LLLZZIL("getViewModelStore", "use SAAViewModelProviders instead");
        return super.getViewModelStore();
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
        a.LIZIZ.recordService().LJ();
        C198H c198hLC = LC();
        if (!(c198hLC instanceof AbstractC214814194y) || (abstractC214814194y = (AbstractC214814194y) c198hLC) == null) {
            return;
        }
        abstractC214814194y.onEnterAnimationComplete();
    }

    @Override // android.app.Activity, X.InterfaceC20597015ii
    public final void finishAfterTransition() {
        super.finishAfterTransition();
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
        return this.LLIZ;
    }

    @Override // X.InterfaceC214897198d
    public final AnonymousClass1950 provideSAFActivityCallBack() {
        return this.LLJJIJIIJIL;
    }

    @Override // X.InterfaceC524950KiL
    public final void AH(InterfaceC362610EJn interfaceC362610EJn) {
        throw new RuntimeException("implement in TikTokSAARootGroupScene");
    }

    @Override // X.InterfaceC20597015ii
    public final void HB(C198M c198m) {
        this.LLILZIL.remove(c198m);
    }

    @Override // X.InterfaceC1563380qmm
    public final Boolean LLFF(EnumC682280QpW enumC682280QpW) {
        boolean z;
        String strLLLZ = LLLZ(enumC682280QpW);
        if (strLLLZ == null) {
            if (this.LLILLJJLI <= 0) {
                z = true;
            } else {
                z = false;
            }
            Boolean boolValueOf = Boolean.valueOf(z);
            this.LLILLJJLI++;
            return boolValueOf;
        }
        Boolean bool = this.LL.get(strLLLZ);
        this.LL.put(strLLLZ, Boolean.FALSE);
        return bool;
    }

    public final String LLLZ(EnumC682280QpW enumC682280QpW) {
        switch (C682500Qps.LIZ[enumC682280QpW.ordinal()]) {
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

    public final boolean LLLZLZ(Scene scene) {
        if (scene == null) {
            return false;
        }
        if (!C0CHQ.LIZ().LJIJJ().LJIIIZ(scene) && !C0CHQ.LIZ().LJIJJ().LIZLLL(scene)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC524950KiL
    public final void Qh(InterfaceC484050IyZ interfaceC484050IyZ) {
        throw new RuntimeException("implement in TikTokSAARootGroupScene");
    }

    @Override // X.InterfaceC20597015ii
    public final void SI(C198M c198m) {
        this.LLILZIL.add(c198m);
    }

    @Override // X.InterfaceC524950KiL
    public final void T4(InterfaceC484050IyZ interfaceC484050IyZ) {
        throw new RuntimeException("implement in TikTokSAARootGroupScene");
    }

    @Override // X.InterfaceC20597015ii
    public final <T> T ZN(Function0<? extends T> function0) {
        this.LLILLJJLI++;
        this.LLILLJJLI--;
        return function0.invoke();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC20597015ii
    public final void ac(Scene scene) {
        List<Scene> sceneList;
        InterfaceC1452540nu0 interfaceC1452540nu0;
        NavigationScene navigationScene = this.LLIZ;
        if (navigationScene != null && (sceneList = navigationScene.getSceneList()) != null) {
            for (Scene scene2 : sceneList) {
                if (!Intrinsics.LJFF(scene2, scene) && (!LLLZLZ(scene2) || !LLLZLZ(scene))) {
                    if ((scene2 instanceof InterfaceC1452540nu0) && (interfaceC1452540nu0 = (InterfaceC1452540nu0) scene2) != null) {
                        interfaceC1452540nu0.LLLJIL();
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC524950KiL
    public final void b8(InterfaceC362610EJn interfaceC362610EJn) {
        throw new RuntimeException("implement in TikTokSAARootGroupScene");
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

    @Override // X.InterfaceC524950KiL
    public final void kF(InterfaceC362610EJn interfaceC362610EJn) {
        throw new RuntimeException("implement in TikTokSAARootGroupScene");
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        AbstractC214814194y abstractC214814194y;
        super.onConfigurationChanged(configuration);
        NavigationScene navigationScene = this.LLIZ;
        if (navigationScene != null) {
            navigationScene.onConfigurationChanged(configuration);
        }
        for (Scene scene : kI()) {
            if ((scene instanceof AbstractC214814194y) && (abstractC214814194y = (AbstractC214814194y) scene) != null) {
                abstractC214814194y.processConfigurationChanged$tools_camera_base_release(configuration);
            }
        }
    }

    @Override // X.AbstractActivityC19422710yn, com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public void onCreate(Bundle bundle) {
        Bundle bundle2;
        boolean z;
        String stringExtra;
        AbstractC214814194y abstractC214814194y;
        CreativeToolsPluginService creativeToolsPluginService;
        ICreationEventMonitorService iCreationEventMonitorService;
        if (C1442410ndf.LIZ() > 0) {
            C1409905fV.LJ.execute(new ARunnableS103S0100000_3((Context) this, 10));
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.adaptation.saa.SAAActivity", "onCreate", true);
        C198L c198l = (C198L) this.LLJILJIL.getValue();
        if (c198l != null) {
            c198l.onCreate();
        }
        C524780Ki4.LIZ.step("av_video_open_camera_track", OpenCameraStep.SAA_ON_CREATE_BEGIN.getStepName());
        if (C290160BYw.LIZ()) {
            getWindow().setSoftInputMode(32);
        }
        if (getIntent().getBooleanExtra("creative_saa_window_translucent", false)) {
            C569770MWh.LJ(this);
        }
        this.LLILLL = 0;
        Intent intent = getIntent();
        C01GW c01gw = C126Y.LIZ;
        if (!((Boolean) c01gw.getValue()).booleanValue() && intent.getIntExtra("enable_story_shared_element_transition_mode", 0) != 0) {
            getWindow().requestFeature(12);
            Intent intent2 = getIntent();
            if (!((Boolean) c01gw.getValue()).booleanValue() && intent2.getIntExtra("enable_story_shared_element_transition_mode", 0) != 0 && !intent2.getBooleanExtra("extra_from_permission_requesting", false)) {
                postponeEnterTransition();
            }
        }
        if (bundle != null && !C290160BYw.LIZ() && bundle.getBoolean("saa:onSaveInstanceState_top_is_live_host_tag", false)) {
            bundle2 = null;
        } else {
            bundle2 = bundle;
        }
        if (C801140Vbk.LIZ() && bundle != null && (iCreationEventMonitorService = (ICreationEventMonitorService) PluggableExtentionKt.pluggableSpi$default(ICreationEventMonitorService.class, false, false, false, 14, null)) != null) {
            iCreationEventMonitorService.LIZ();
        }
        super.onCreate(bundle2);
        C1309570kBP.LIZ(this).LIZJ = true;
        C1664640tQ6.LIZ();
        setContentView(R.layout.k4);
        Intent intent3 = getIntent();
        try {
            f.LIZ.getClass();
            f.LIZJ(this, intent3, bundle2);
            try {
                Bundle extras = getIntent().getExtras();
                if (extras != null) {
                    if (C299090Bnv.LIZ()) {
                        if (bundle != null) {
                            C013C c013c = new C013C();
                            ZN(new AwS431S0200000_30(c013c, this, 51));
                            if (!c013c.element && ((creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null)) == null || !creativeToolsPluginService.LIZJ(this, "SAAActivity", false))) {
                                LLLLZLLIL();
                                ActivityAgent.onTrace("com.ss.android.ugc.aweme.adaptation.saa.SAAActivity", "onCreate", false);
                                return;
                            }
                            z = false;
                        }
                        z = true;
                    } else if (bundle != null) {
                        z = false;
                    } else {
                        z = true;
                    }
                    ZN(new AwS146S0110000_30(this, z, 0));
                    C1654320t9S.LIZ(this, AFwS239S0000000_8.get$arr$(19));
                    C1664590tQ1.LIZIZ(this, new AwS587S0100000_8(this, 25));
                    C1664600tQ2.LIZIZ(this, new AwS611S0100000_32(this, 35));
                    C0MWI c0mwiLJIJJ = C0CHQ.LIZ().LJIJJ();
                    try {
                        stringExtra = getIntent().getStringExtra("creative_saa_page");
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    if (stringExtra == null) {
                        stringExtra = "";
                    }
                    Class<? extends C19A3> clsLJIIZILJ = c0mwiLJIJJ.LJIIZILJ(stringExtra);
                    this.LLJ.setCustomTag("saa_page", clsLJIIZILJ.getName());
                    Pair<NavigationScene, C19AK<?>> pairLIZIZ = C214868197a.LIZIZ(this, clsLJIIZILJ, extras, R.id.tya, true, C289940BYa.LIZ());
                    NavigationScene first = pairLIZIZ.getFirst();
                    C19AK<?> second = pairLIZIZ.getSecond();
                    this.LLIZ = first;
                    this.LLIZLLLIL.LJII(first);
                    this.LLJJIII = true;
                    Iterator<Function0<Unit>> it2 = this.LLJJIJI.iterator();
                    while (it2.hasNext()) {
                        it2.next().invoke();
                    }
                    NavigationScene navigationScene = this.LLIZ;
                    if (navigationScene != null) {
                        navigationScene.registerChildSceneLifecycleCallbacks(new C0Y8U() { // from class: X.198J
                            @Override // X.C0Y8U, X.C19AH
                            public final void LJIILJJIL() {
                                this.LIZ.LLLZIL();
                            }

                            @Override // X.C0Y8U, X.C19AH
                            public final void LJJJI() {
                                this.LIZ.LLLZIL();
                            }

                            @Override // X.C0Y8U, X.C19AH
                            public final void LJJJJ() {
                                this.LIZ.LLLZIL();
                            }

                            @Override // X.C0Y8U, X.C19AH
                            public final void LIZ(Scene scene) {
                                this.LIZ.LLLLZLLLI();
                            }

                            @Override // X.C0Y8U, X.C19AH
                            public final void LIZLLL(Scene scene) {
                                this.LIZ.LLLLZLLLI();
                            }

                            @Override // X.C0Y8U, X.C19AH
                            public final void LJIILIIL(Scene scene) {
                                this.LIZ.LLLZIL();
                            }

                            @Override // X.C0Y8U, X.C19AH
                            public final void LJIJJ(Scene scene) {
                                this.LIZ.LLLZIL();
                            }

                            @Override // X.C0Y8U, X.C19AH
                            public final void LJJ(Scene scene) {
                                this.LIZ.LLLZIL();
                            }

                            @Override // X.C0Y8U, X.C19AH
                            public final void LJJIFFI(Scene scene) {
                                this.LIZ.LLLLZLLLI();
                            }

                            @Override // X.C0Y8U, X.C19AH
                            public final void LJJIII(Scene scene) {
                                this.LIZ.LLLLZLLLI();
                            }

                            @Override // X.C0Y8U, X.C19AH
                            public final void LJJIIZI(Scene scene) {
                                this.LIZ.LLLLZLLLI();
                            }

                            @Override // X.C0Y8U, X.C19AH
                            public final void LJJIZ(Scene scene) {
                                this.LIZ.LLLLZLLLI();
                            }

                            @Override // X.C0Y8U, X.C19AH
                            public final void LJJJ(Scene scene) {
                                this.LIZ.LLLLZLLLI();
                            }

                            @Override // X.C0Y8U, X.C19AH
                            public final void LJJJJIZL(Scene scene) {
                                this.LIZ.LLLZIL();
                            }

                            @Override // X.C0Y8U, X.C19AH
                            public final void LJJJJL(Scene scene) {
                                this.LIZ.LLLZIL();
                            }

                            @Override // X.C0Y8U, X.C19AH
                            public final void LJJI(Scene scene, Bundle bundle3) {
                                this.LIZ.LLLLZLLLI();
                            }

                            @Override // X.C0Y8U, X.C19AH
                            public final void LJJIJIIJIL(Scene scene, Bundle bundle3) {
                                this.LIZ.LLLZIL();
                            }

                            @Override // X.C0Y8U, X.C19AH
                            public final void LJJJJZ(Scene scene, Bundle bundle3) {
                                this.LIZ.LLLLZLLLI();
                            }
                        }, true);
                    }
                    NavigationScene navigationScene2 = this.LLIZ;
                    if (navigationScene2 != null) {
                        navigationScene2.registerChildSceneLifecycleCallbacks(new C0Y8U() { // from class: X.198C
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // X.C0Y8U, X.C19AH
                            public final void LIZ(Scene scene) {
                                InterfaceC1452540nu0 interfaceC1452540nu0;
                                if ((scene instanceof InterfaceC1452540nu0) && (interfaceC1452540nu0 = (InterfaceC1452540nu0) scene) != null) {
                                    interfaceC1452540nu0.r7();
                                }
                                if (C523670KgH.LIZ()) {
                                    C0CHQ.LIZ().getPublishService().LJIIL().LJJ(new AwS116S1000000_32(scene.getClass().getSimpleName(), 2));
                                }
                            }

                            @Override // X.C0Y8U, X.C19AH
                            public final void LJJ(Scene scene) {
                                this.LIZ.LLJ.setCustomTag("saa_page", scene.getClass().getName());
                            }

                            @Override // X.C0Y8U, X.C19AH
                            public final void LJJJ(Scene scene) {
                                C0CHQ.LIZ().LJIJI();
                            }

                            @Override // X.C0Y8U, X.C19AH
                            public final void LJJIJIIJIL(Scene scene, Bundle bundle3) {
                                AbstractC214814194y abstractC214814194y2;
                                this.LIZ.LLJ.setCustomTag("saa_page", scene.getClass().getName());
                                if ((scene instanceof AbstractC214814194y) && (abstractC214814194y2 = (AbstractC214814194y) scene) != null) {
                                    SAAActivity sAAActivity = this.LIZ;
                                    sAAActivity.ZN(new AwS433S0200000_32(sAAActivity, abstractC214814194y2, 74));
                                }
                            }
                        }, false);
                    }
                    C19C8 c19c8 = new C19C8(second);
                    this.LLILZLL = c19c8;
                    try {
                        c19c8.LIZIZ(this, bundle2);
                        C198H c198hLC = LC();
                        if ((c198hLC instanceof AbstractC214814194y) && (abstractC214814194y = (AbstractC214814194y) c198hLC) != null) {
                            C569770MWh.LIZLLL(abstractC214814194y.getStartAnimationType(), this);
                        }
                    } catch (OutOfMemoryError e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        this.LLILLL = 0;
                        LLLLZLLIL();
                        C571900Mbs.LIZ("OOM in SAAActivity onCreate");
                    }
                    C524780Ki4.LIZ.step("av_video_open_camera_track", OpenCameraStep.SAA_ON_CREATE_END.getStepName());
                    C201955140j.LIZIZ("CreativeToolStayTimeMonitor", "SAAActivity Created");
                    C560380LyO c560380LyO = C560380LyO.LIZ;
                    Lifecycle lifecycle = getLifecycle();
                    c560380LyO.getClass();
                    C560380LyO.LIZIZ(lifecycle, false);
                    C560380LyO.LIZLLL();
                    ActivityAgent.onTrace("com.ss.android.ugc.aweme.adaptation.saa.SAAActivity", "onCreate", false);
                    return;
                }
            } catch (Exception e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            LLLLZLLIL();
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.adaptation.saa.SAAActivity", "onCreate", false);
        } catch (Exception e4) {
            TryCatchGuardChecker.doCheck(e4);
            intent3.replaceExtras((Bundle) null);
            LLLLZLLIL();
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.adaptation.saa.SAAActivity", "onCreate", false);
        }
    }

    @Override // X.ActivityC21503719Dn, androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        String stringExtra;
        Bundle bundle;
        super.onNewIntent(intent);
        C201955140j.LIZJ(C201954140i.LIZIZ, "SAAActivity onNewIntent");
        f.LIZ.getClass();
        Bundle extras = null;
        f.LIZJ(this, intent, null);
        C198H c198hLC = LC();
        if (intent.getBooleanExtra("start_live_single_activity", false) && (c198hLC instanceof InterfaceC20630715o9)) {
            InterfaceC20630715o9 interfaceC20630715o9 = (InterfaceC20630715o9) c198hLC;
            if (interfaceC20630715o9.F0() instanceof InterfaceC20596815ig) {
                try {
                    extras = intent.getExtras();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                interfaceC20630715o9.LLLLIILLL(extras);
                return;
            }
        }
        try {
            stringExtra = intent.getStringExtra("creative_saa_page");
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        if (stringExtra == null) {
            stringExtra = "";
        }
        try {
            bundle = intent.getExtras();
        } catch (Exception e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        if (bundle == null) {
            bundle = new Bundle();
        }
        C0MWH.LJIIIIZZ(this, stringExtra, bundle, null);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (C290160BYw.LIZ()) {
            bundle.putBoolean("saa:onSaveInstanceState_top_is_live_host_tag", C20629915o1.LIZJ(this) instanceof InterfaceC20596815ig);
        }
        bundle.remove("android:fragments");
        Bundle bundle2 = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
        if (bundle2 != null) {
            C786410Ut5.LJJIIZI(bundle2, new Bundle(), "android:support:fragments");
        }
        C19C8 c19c8 = this.LLILZLL;
        if (c19c8 != null) {
            c19c8.LJ(bundle);
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.adaptation.saa.SAAActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.InterfaceC1563380qmm
    public final void LLJILJILJ(EnumC682280QpW enumC682280QpW, Boolean bool) {
        String strLLLZ = LLLZ(enumC682280QpW);
        if (strLLLZ == null) {
            if (!Intrinsics.LJFF(bool, Boolean.FALSE)) {
                this.LLILLJJLI--;
                return;
            } else {
                this.LLILLJJLI++;
                return;
            }
        }
        if (bool == null) {
            this.LL.remove(strLLLZ);
        } else {
            this.LL.put(strLLLZ, bool);
        }
    }

    @Override // X.InterfaceC1563380qmm
    public final <T> T LLLIIL(EnumC682280QpW enumC682280QpW, Function0<? extends T> function0) {
        switch (C682500Qps.LIZ[enumC682280QpW.ordinal()]) {
            case 1:
                return (T) ZN(function0);
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

    /* JADX WARN: Removed duplicated region for block: B:30:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLZZIL(java.lang.String r6, java.lang.String r7) {
        /*
            Method dump skipped, instruction units count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.adaptation.saa.SAAActivity.LLLZZIL(java.lang.String, java.lang.String):void");
    }

    @Override // X.InterfaceC20597015ii
    public final <T> T Ss(String str, Function0<? extends T> function0) {
        this.LL.put(str, Boolean.FALSE);
        T tInvoke = function0.invoke();
        this.LL.put(str, Boolean.TRUE);
        return tInvoke;
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19GS, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        Object obj;
        Boolean boolOnActivityKeyDown;
        NavigationScene navigationScene = this.LLIZ;
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
        NavigationScene navigationScene = this.LLIZ;
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
        NavigationScene navigationScene = this.LLIZ;
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
        Ss("getLifecycle", new AwS276S0300000_32(this, bundle, persistableBundle, 2));
    }

    @Override // X.AbstractActivityC19422710yn, com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
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
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(11051, "com/ss/android/ugc/aweme/adaptation/saa/SAAActivity", "onRequestPermissionsResult", this, new Object[]{Integer.valueOf(iIntValue), strArr2, iArr2}, "void", new C0WZW(false, "(I[Ljava/lang/String;[I)V", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOusYo/a3Sb5FC8T5ldegbV0peQ7RHQ0A87U", null)));
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
        C0CHQ.LIZ().LJJJJJ().getAlbumService().tryPreloadMediaAfterAlbumPermissionGranted(this);
    }
}
