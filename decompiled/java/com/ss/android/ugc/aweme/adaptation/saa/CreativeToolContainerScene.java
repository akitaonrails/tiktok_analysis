package com.ss.android.ugc.aweme.adaptation.saa;

import X.AbstractC214814194y;
import X.AnonymousClass1991;
import X.C01GW;
import X.C090A;
import X.C098200Yq;
import X.C0CHQ;
import X.C0MWI;
import X.C0MWV;
import X.C0Y8U;
import X.C128Y;
import X.C12WG;
import X.C1309570kBP;
import X.C140D;
import X.C143O;
import X.C15Q1;
import X.C1602110rnF;
import X.C1634660sdk;
import X.C1654320t9S;
import X.C1664590tQ1;
import X.C1664600tQ2;
import X.C1664640tQ6;
import X.C1800490wxD;
import X.C189200o6;
import X.C1954807lC;
import X.C198A;
import X.C198H;
import X.C198L;
import X.C198M;
import X.C198Q;
import X.C19A3;
import X.C19EH;
import X.C201954140i;
import X.C201955140j;
import X.C20622515mp;
import X.C20629915o1;
import X.C214899198f;
import X.C214900198g;
import X.C214936199q;
import X.C2188811AlT;
import X.C2350509Ix;
import X.C259800zU;
import X.C264810AZj;
import X.C275660ArE;
import X.C280980Azo;
import X.C280990Azp;
import X.C289940BYa;
import X.C290160BYw;
import X.C293940Bfc;
import X.C294780Bgy;
import X.C299090Bnv;
import X.C365090ETb;
import X.C452501pT;
import X.C524780Ki4;
import X.C554740LpI;
import X.C554870LpV;
import X.C560380LyO;
import X.C569770MWh;
import X.C682490Qpr;
import X.C755440TkE;
import X.C786410Ut5;
import X.C790260UzI;
import X.C801140Vbk;
import X.C960203pA;
import X.EnumC682280QpW;
import X.InterfaceC1452540nu0;
import X.InterfaceC1711206n0;
import X.InterfaceC20011613Rq;
import X.InterfaceC20596815ig;
import X.InterfaceC20597015ii;
import X.InterfaceC20597515in;
import X.InterfaceC20622815ms;
import X.InterfaceC214897198d;
import X.InterfaceC214902198i;
import X.InterfaceC362610EJn;
import X.InterfaceC484050IyZ;
import X.InterfaceC855400Xh4;
import Y.ARunnableS108S0100000_8;
import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import com.bytedance.als.h0;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.scene.Scene;
import com.bytedance.scene.navigation.NavigationScene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.adaptation.saa.CreativeToolContainerScene;
import com.ss.android.ugc.aweme.adaptation.saa.fragment.TikTokSAARootFragmentGroupScene;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.internal.ICreationEventMonitorService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.performance.ICrashReportService;
import com.ss.android.ugc.aweme.services.performance.OpenCameraStep;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS223S0000000_32;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.AFwS278S0000000_32;
import kotlin.jvm.internal.AwS116S1000000_32;
import kotlin.jvm.internal.AwS433S0200000_32;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.AwS587S0100000_8;
import kotlin.jvm.internal.AwS611S0100000_32;
import kotlin.jvm.internal.Intrinsics;
import lgo.a;

/* JADX INFO: loaded from: classes33.dex */
public final class CreativeToolContainerScene extends TikTokSAARootFragmentGroupScene implements InterfaceC20597015ii, C198Q {
    public final HashMap<String, Boolean> LLJJJJJIL;
    public volatile int LLJJJJLIIL;
    public int LLJJL;
    public volatile boolean LLJJLIIIJLLLLLLLZ;
    public final LinkedHashSet<C198M> LLJL;
    public NavigationScene LLJLIL;
    public final h0 LLJLILLLLZIIL;
    public final ICrashReportService LLJLL;
    public final C01GW LLJLLIL;
    public final C01GW LLJLLL;
    public final C01GW LLJZ;
    public final boolean LLJZIJLIL;
    public final C198A LLL;
    public final C01GW LLLF;
    public final C01GW LLLFF;
    public boolean LLLFFI;
    public boolean LLLFZ;
    public boolean LLLI;
    public final CopyOnWriteArrayList<Function0<Unit>> LLLII;

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
        this.LLJJLIIIJLLLLLLLZ = false;
    }

    @Override // X.InterfaceC20597015ii
    public final void Ye() {
        this.LLJJLIIIJLLLLLLLZ = true;
    }

    @Override // X.InterfaceC20622815ms
    public final C198H getRootSAFSceneWrapper() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC20597015ii
    public final Lifecycle EI() {
        C259800zU c259800zU = new C259800zU();
        new AwS433S0200000_32(c259800zU, (C259800zU<Lifecycle>) this, (CreativeToolContainerScene) 8).invoke();
        T t = c259800zU.element;
        if (t != 0) {
            return (Lifecycle) t;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // X.InterfaceC20597015ii
    public final C198H LC() {
        NavigationScene navigationScene = this.LLJLIL;
        Scene sceneLLLLIIIILLL = navigationScene != null ? navigationScene.LLLLIIIILLL() : null;
        if (sceneLLLLIIIILLL instanceof C198H) {
            return (C198H) sceneLLLLIIIILLL;
        }
        return null;
    }

    @Override // X.C19A3
    public final void LLLILZLLLI() {
        C524780Ki4.LIZ.step("av_video_open_camera_track", OpenCameraStep.SAA_ON_CREATE_END.getStepName());
    }

    @Override // X.C19A3
    public final void LLLIZZ() {
        C524780Ki4.LIZ.step("av_video_open_camera_track", OpenCameraStep.SAA_ON_RESUME_END.getStepName());
    }

    @Override // X.C19A3
    public final void LLLJ() {
        C524780Ki4.LIZ.step("av_video_open_camera_track", OpenCameraStep.SAA_ON_START_END.getStepName());
    }

    public final void LLLLLILLIL() {
        ZN(new AwS576S0100000_32(this, 76));
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(requireContext(), "aweme://main");
        smartRouteBuildRoute.addFlags(268468224);
        smartRouteBuildRoute.open();
    }

    public final void LLLLLJIL() {
        this.LLJJL--;
    }

    public final void LLLLLL() {
        this.LLJJL++;
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
        ZN(new AwS576S0100000_32(this, 78));
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e5  */
    @Override // X.AbstractC214814194y, X.C198H
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void finish() {
        /*
            Method dump skipped, instruction units count: 462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.adaptation.saa.CreativeToolContainerScene.finish():void");
    }

    @Override // X.InterfaceC20011613Rq
    public final boolean isRecording() {
        List<Scene> sceneList;
        NavigationScene navigationScene = this.LLJLIL;
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
        NavigationScene navigationScene = this.LLJLIL;
        if (navigationScene != null) {
            return navigationScene.getSceneList();
        }
        return null;
    }

    @Override // X.AbstractC214814194y, X.C198H
    public final boolean onBackPressed() {
        NavigationScene navigationScene = this.LLJLIL;
        if (navigationScene != null) {
            C198H c198hLC = LC();
            if (navigationScene.LLLLLJIL(c198hLC != null ? c198hLC.buildPopOptions() : null)) {
                return true;
            }
        }
        return super.onBackPressed();
    }

    @Override // com.ss.android.ugc.aweme.adaptation.saa.fragment.TikTokSAARootFragmentGroupScene, com.bytedance.scene.Scene
    public final void onDestroy() {
        C201954140i c201954140i = C201954140i.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this);
        sbLIZ.append(" onDestroy");
        C201955140j.LJIILL(c201954140i, "CreativeToolContainerScene LifecycleLog_LogCat", C2188811AlT.LIZIZ(sbLIZ));
        C560380LyO.LIZ.getClass();
        C560380LyO.LJ();
        C201955140j.LIZIZ("CreativeToolStayTimeMonitor", "CreativeToolContainerScene Destroyed");
        LLLLLIL(false);
        super.onDestroy();
        for (Fragment fragment : getFragmentManager().LJJLIIIJL()) {
            C19EH c19ehLJIIJ = getFragmentManager().LJIIJ();
            c19ehLJIIJ.LJIIZILJ(fragment);
            c19ehLJIIJ.LJIIL();
        }
        C0CHQ.LIZ().LJIIIZ();
        C1634660sdk.LIZ();
        C090A.LIZ = false;
        C140D.LIZ.getClass();
        C140D.LJIIIIZZ.clear();
        C0CHQ.LIZ().LJIIZILJ();
    }

    @Override // com.ss.android.ugc.aweme.adaptation.saa.fragment.TikTokSAARootFragmentGroupScene, X.AbstractC214814194y, com.bytedance.scene.Scene
    public final void onPause() {
        C201954140i c201954140i = C201954140i.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this);
        sbLIZ.append(" onPause");
        C201955140j.LJIILL(c201954140i, "CreativeToolContainerScene LifecycleLog_LogCat", C2188811AlT.LIZIZ(sbLIZ));
        super.onPause();
        C201955140j.LIZIZ("CreativeToolStayTimeMonitor", "CreativeToolContainerScene Paused");
    }

    @Override // com.ss.android.ugc.aweme.adaptation.saa.fragment.TikTokSAARootFragmentGroupScene, X.AbstractC214814194y, com.bytedance.scene.Scene
    public final void onResume() {
        a.LIZIZ.recordService().LJFF();
        C198L c198l = (C198L) this.LLJZ.getValue();
        if (c198l != null) {
            c198l.onResume();
        }
        C524780Ki4.LIZ.step("av_video_open_camera_track", OpenCameraStep.SAA_ON_RESUME_BEGIN.getStepName());
        super.onResume();
        C201954140i c201954140i = C201954140i.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this);
        sbLIZ.append(" onResume");
        C201955140j.LJIILL(c201954140i, "CreativeToolContainerScene LifecycleLog_LogCat", C2188811AlT.LIZIZ(sbLIZ));
        C201955140j.LIZIZ("CreativeToolStayTimeMonitor", "CreativeToolContainerScene Resumed");
        if (this.LLLFFI) {
            this.LLLFFI = false;
        }
    }

    @Override // com.ss.android.ugc.aweme.adaptation.saa.fragment.TikTokSAARootFragmentGroupScene, X.AbstractC214814194y, com.bytedance.scene.Scene
    public final void onStart() {
        C198L c198l = (C198L) this.LLJZ.getValue();
        if (c198l != null) {
            c198l.onStart();
        }
        C524780Ki4.LIZ.step("av_video_open_camera_track", OpenCameraStep.SAA_ON_START_BEGIN.getStepName());
        super.onStart();
        C201954140i c201954140i = C201954140i.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this);
        sbLIZ.append(" onStart");
        C201955140j.LJIILL(c201954140i, "CreativeToolContainerScene LifecycleLog_LogCat", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.ss.android.ugc.aweme.adaptation.saa.fragment.TikTokSAARootFragmentGroupScene, X.AbstractC214814194y, com.bytedance.scene.Scene
    public final void onStop() {
        C201954140i c201954140i = C201954140i.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this);
        sbLIZ.append(" onStop");
        C201955140j.LJIILL(c201954140i, "CreativeToolContainerScene LifecycleLog_LogCat", C2188811AlT.LIZIZ(sbLIZ));
        super.onStop();
    }

    /* JADX WARN: Type inference failed for: r0v24, types: [X.198A] */
    public CreativeToolContainerScene() {
        LLLLJ(AFwS278S0000000_32.get$arr$(13));
        this.LLJJJJJIL = new HashMap<>();
        this.LLJL = new LinkedHashSet<>();
        this.LLJLILLLLZIIL = new h0(null);
        Object objPluggableSpi$default = PluggableExtentionKt.pluggableSpi$default(IExternalService.class, false, false, false, 14, null);
        if (objPluggableSpi$default == null) {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        this.LLJLL = ((IExternalService) objPluggableSpi$default).provideErrorReporter();
        this.LLJLLIL = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(33));
        this.LLJLLL = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(34));
        this.LLJZ = C452501pT.LIZIZ(new AwS576S0100000_32(this, 81));
        this.LLJZIJLIL = ((Number) C275660ArE.LIZ.getValue()).intValue() == 1;
        this.LLL = new InterfaceC20597515in() { // from class: X.198A
            @Override // X.InterfaceC20597515in
            public final FragmentManager LIZ() {
                return this.LIZ.getFragmentManager();
            }

            @Override // X.InterfaceC20597515in
            public final void LIZIZ(Function0<Unit> function0) {
                CreativeToolContainerScene creativeToolContainerScene = this.LIZ;
                if (creativeToolContainerScene.LLLI) {
                    function0.invoke();
                } else {
                    creativeToolContainerScene.LLLII.add(function0);
                }
            }
        };
        this.LLLF = C452501pT.LIZIZ(new AwS576S0100000_32(this, 77));
        this.LLLFF = C452501pT.LIZIZ(new AwS576S0100000_32(this, 80));
        this.LLLFFI = true;
        this.LLLII = new CopyOnWriteArrayList<>();
    }

    @Override // X.InterfaceC20622815ms
    public final FragmentManager getContainerFragmentManager() {
        return getSupportFragmentManager();
    }

    @Override // X.AbstractC214814194y
    public final int getFinishAnimationType() {
        return C0MWV.LIZ(getArgumentsSafely());
    }

    @Override // X.InterfaceC20597015ii
    public final FragmentManager getSupportFragmentManager() {
        return C290160BYw.LIZ() ? (FragmentManager) this.LLLF.getValue() : getFragmentManager();
    }

    @Override // X.AbstractC214814194y
    public final void onEnterAnimationComplete() {
        AbstractC214814194y abstractC214814194y;
        super.onEnterAnimationComplete();
        View viewFindViewById = findViewById(R.id.ty_);
        if (viewFindViewById != null) {
            C786410Ut5.LJLLLLLL(8, viewFindViewById);
        }
        a.LIZIZ.recordService().LJ();
        Activity activity = this.mActivity;
        if (activity != null && C20622515mp.LJIILJJIL(activity) && C15Q1.LIZ().transitionType > 0) {
            new SafeHandler(this).post(new ARunnableS108S0100000_8(this, 6));
            return;
        }
        C198H c198hLC = LC();
        if (!(c198hLC instanceof AbstractC214814194y) || (abstractC214814194y = (AbstractC214814194y) c198hLC) == null) {
            return;
        }
        abstractC214814194y.onEnterAnimationComplete();
    }

    @Override // X.InterfaceC20597015ii
    public final void finishAfterTransition() {
        finish();
    }

    @Override // X.InterfaceC20622815ms
    public final InterfaceC20597515in getAbility() {
        return this.LLL;
    }

    @Override // X.InterfaceC20597015ii, X.InterfaceC20622815ms
    public final NavigationScene getNavigationScene() {
        return this.LLJLIL;
    }

    @Override // X.InterfaceC524950KiL
    public final void AH(InterfaceC362610EJn interfaceC362610EJn) {
        throw new RuntimeException("implement in TikTokSAARootGroupScene");
    }

    @Override // X.InterfaceC20597015ii
    public final void HB(C198M c198m) {
        this.LLJL.remove(c198m);
    }

    @Override // X.InterfaceC1563380qmm
    public final Boolean LLFF(EnumC682280QpW enumC682280QpW) {
        boolean z;
        String strLLLLLJLJLL = LLLLLJLJLL(enumC682280QpW);
        if (strLLLLLJLJLL == null) {
            if (this.LLJJJJLIIL <= 0) {
                z = true;
            } else {
                z = false;
            }
            Boolean boolValueOf = Boolean.valueOf(z);
            this.LLJJJJLIIL++;
            return boolValueOf;
        }
        Boolean bool = this.LLJJJJJIL.get(strLLLLLJLJLL);
        this.LLJJJJJIL.put(strLLLLLJLJLL, Boolean.FALSE);
        return bool;
    }

    @Override // X.AnonymousClass1995
    public final void LLLLIILLL(Bundle bundle) {
        LLLLJI().LIZJ();
        processNewArguments(bundle);
    }

    public final void LLLLLIL(boolean z) {
        InterfaceC20622815ms interfaceC20622815ms;
        InterfaceC214902198i interfaceC214902198iLIZ;
        AnonymousClass1991 anonymousClass1991LIZIZ;
        if (!this.LLJZIJLIL) {
            return;
        }
        ComponentCallbacks2 componentCallbacks2 = this.mActivity;
        if ((componentCallbacks2 instanceof InterfaceC214897198d) && (interfaceC20622815ms = (InterfaceC20622815ms) componentCallbacks2) != null && (interfaceC214902198iLIZ = C20629915o1.LIZ(interfaceC20622815ms)) != null && (interfaceC214902198iLIZ instanceof InterfaceC1711206n0) && (anonymousClass1991LIZIZ = C1800490wxD.LIZIZ(interfaceC214902198iLIZ)) != null) {
            anonymousClass1991LIZIZ.LJIILLIIL = z;
        }
    }

    public final String LLLLLJLJLL(EnumC682280QpW enumC682280QpW) {
        switch (C682490Qpr.LIZ[enumC682280QpW.ordinal()]) {
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

    public final boolean LLLLLLIL(Scene scene) {
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
        this.LLJL.add(c198m);
    }

    @Override // X.InterfaceC524950KiL
    public final void T4(InterfaceC484050IyZ interfaceC484050IyZ) {
        throw new RuntimeException("implement in TikTokSAARootGroupScene");
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001b  */
    @Override // X.InterfaceC20597015ii
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> T ZN(kotlin.jvm.functions.Function0<? extends T> r4) {
        /*
            r3 = this;
            int r0 = r3.LLJJJJLIIL
            int r0 = r0 + 1
            r3.LLJJJJLIIL = r0
            android.app.Activity r2 = r3.mActivity
            X.19FO r2 = (X.C19FO) r2
            if (r2 == 0) goto L1b
            kotlin.jvm.internal.AwS576S0100000_32 r1 = new kotlin.jvm.internal.AwS576S0100000_32
            r0 = 79
            r1.<init>(r4, r0)
            X.0QpW r0 = X.EnumC682280QpW.MAIN
            java.lang.Object r1 = X.C1563370qml.LIZ(r2, r0, r1)
            if (r1 != 0) goto L1f
        L1b:
            java.lang.Object r1 = r4.invoke()
        L1f:
            int r0 = r3.LLJJJJLIIL
            int r0 = r0 + (-1)
            r3.LLJJJJLIIL = r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.adaptation.saa.CreativeToolContainerScene.ZN(kotlin.jvm.functions.Function0):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC20597015ii
    public final void ac(Scene scene) {
        List<Scene> sceneList;
        InterfaceC1452540nu0 interfaceC1452540nu0;
        NavigationScene navigationScene = this.LLJLIL;
        if (navigationScene != null && (sceneList = navigationScene.getSceneList()) != null) {
            for (Scene scene2 : sceneList) {
                if (!Intrinsics.LJFF(scene2, scene) && (!LLLLLLIL(scene2) || !LLLLLLIL(scene))) {
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

    @Override // X.AbstractC214814194y
    public final void dispatchTouchEvent(MotionEvent motionEvent) {
        AbstractC214814194y abstractC214814194y;
        C198H c198hLC = LC();
        if ((c198hLC instanceof AbstractC214814194y) && (abstractC214814194y = (AbstractC214814194y) c198hLC) != null) {
            abstractC214814194y.dispatchTouchEvent(motionEvent);
        }
        super.dispatchTouchEvent(motionEvent);
    }

    @Override // X.InterfaceC524950KiL
    public final void kF(InterfaceC362610EJn interfaceC362610EJn) {
        throw new RuntimeException("implement in TikTokSAARootGroupScene");
    }

    @Override // com.ss.android.ugc.aweme.adaptation.saa.fragment.TikTokSAARootFragmentGroupScene, X.AbstractC214814194y, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        boolean z;
        boolean z2;
        boolean z3;
        String string;
        String string2;
        Boolean boolValueOf;
        boolean z4;
        String string3;
        CreativeToolsPluginService creativeToolsPluginService;
        ICreationEventMonitorService iCreationEventMonitorService;
        Window window;
        C201954140i c201954140i = C201954140i.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CreativeToolContainerScene onActivityCreated savedInstanceState is not null ");
        if (bundle != null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        C201955140j.LIZJ(c201954140i, C2188811AlT.LIZIZ(sbLIZ));
        C198L c198l = (C198L) this.LLJZ.getValue();
        if (c198l != null) {
            c198l.onCreate();
        }
        C524780Ki4.LIZ.step("av_video_open_camera_track", OpenCameraStep.SAA_ON_CREATE_BEGIN.getStepName());
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(this);
        sbLIZ2.append(" onCreate");
        C201955140j.LJIILL(c201954140i, "CreativeToolContainerScene LifecycleLog_LogCat", C2188811AlT.LIZIZ(sbLIZ2));
        LLLLLIL(true);
        if (C290160BYw.LIZ() && (window = getWindow()) != null) {
            window.setSoftInputMode(32);
        }
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            z2 = bundle2.getBoolean("creative_saa_window_translucent", false);
        } else {
            z2 = false;
        }
        if (z2 && (this.mActivity instanceof SAASceneWrapperActivity)) {
            C569770MWh.LJ(requireActivity());
            View viewFindViewById = findViewById(R.id.tya);
            if (viewFindViewById != null) {
                viewFindViewById.setBackground(null);
            }
        }
        this.LLJJL = 0;
        if (C801140Vbk.LIZ() && bundle != null && (iCreationEventMonitorService = (ICreationEventMonitorService) PluggableExtentionKt.pluggableSpi$default(ICreationEventMonitorService.class, false, false, false, 14, null)) != null) {
            iCreationEventMonitorService.LIZ();
        }
        super.onActivityCreated(bundle);
        C1309570kBP.LIZ(requireFragmentActivity()).LIZJ = true;
        C1664640tQ6.LIZ();
        Bundle bundle3 = this.mArguments;
        if (bundle3 == null) {
            LLLLLILLIL();
            return;
        }
        C554870LpV.LIZ.getClass();
        if (C299090Bnv.LIZ() && !C554870LpV.LIZ()) {
            if (bundle != null) {
                NavigationScene navigationScene = (NavigationScene) findSceneByTag("CreativeToolContainerScene");
                Bundle bundle4 = this.mArguments;
                if (bundle4 != null && bundle4.getBoolean("ignoreVEPluginCheck", false)) {
                    if (((Boolean) C264810AZj.LIZ.getValue()).booleanValue() && navigationScene == null) {
                        C554740LpI c554740LpI = C554740LpI.LIZIZ;
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("CreativeToolContainerScene");
                        sbLIZ3.append(" ab key changed, backToHomePage because previousScene is null");
                        C201955140j.LIZJ(c554740LpI, C2188811AlT.LIZIZ(sbLIZ3));
                    }
                    z3 = false;
                } else {
                    if (navigationScene != null) {
                        C554740LpI c554740LpI2 = C554740LpI.LIZIZ;
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("CreativeToolContainerScene");
                        sbLIZ4.append(" ab key changed, disable NavigationScene restore");
                        C201955140j.LIZJ(c554740LpI2, C2188811AlT.LIZIZ(sbLIZ4));
                        navigationScene.LLJI = false;
                    }
                    C554740LpI c554740LpI3 = C554740LpI.LIZIZ;
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append("CreativeToolContainerScene");
                    sbLIZ5.append(" ab key changed, backToHomePage because ignoreVEPluginCheck is false");
                    C201955140j.LIZJ(c554740LpI3, C2188811AlT.LIZIZ(sbLIZ5));
                }
                C201955140j.LIZJ(C554740LpI.LIZIZ, "CreativeToolContainerScene backToHomePage because backToHomeIfVEPluginNotReady is true");
                CreativeToolsPluginService creativeToolsPluginService2 = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
                if (creativeToolsPluginService2 != null) {
                    creativeToolsPluginService2.LIZJ(requireActivity(), "CreativeToolContainerScene", false);
                }
                LLLLLILLIL();
                return;
            }
            z3 = true;
        } else if (bundle == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        Bundle bundle5 = this.mArguments;
        if (bundle5 != null) {
            string = bundle5.getString("enter_from");
        } else {
            string = null;
        }
        Bundle bundle6 = this.mArguments;
        if (bundle6 != null) {
            string2 = bundle6.getString("shoot_way");
        } else {
            string2 = null;
        }
        Bundle bundle7 = this.mArguments;
        if (bundle7 != null) {
            boolValueOf = Boolean.valueOf(bundle7.getBoolean("isFromDraft", false));
        } else {
            boolValueOf = null;
        }
        Bundle bundle8 = this.mArguments;
        if (bundle8 != null) {
            z4 = bundle8.getBoolean("ignoreVEPluginCheck", false);
        } else {
            z4 = false;
        }
        C143O.LIZ(boolValueOf, string, string2);
        if (!z4 && (creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null)) != null) {
            creativeToolsPluginService.LJII(boolValueOf, z3, string, string2);
        }
        C1654320t9S.LIZIZ(this, AFwS239S0000000_8.get$arr$(18));
        C1664590tQ1.LIZLLL(this, null, false, new AwS587S0100000_8(this, 24), 3);
        C1664600tQ2.LIZ(this, null, new AwS611S0100000_32(this, 34));
        NavigationScene navigationScene2 = (NavigationScene) findSceneByTag("CreativeToolContainerScene");
        if (navigationScene2 == null) {
            C0MWI c0mwiLJIJJ = C0CHQ.LIZ().LJIJJ();
            Bundle bundle9 = this.mArguments;
            if (bundle9 == null || (string3 = bundle9.getString("creative_saa_page")) == null) {
                string3 = "";
            }
            Class<? extends C19A3> clsLJIIZILJ = c0mwiLJIJJ.LJIIZILJ(string3);
            this.LLJLL.setCustomTag("saa_page", clsLJIIZILJ.getName());
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append("CreativeToolContainerScene buildNavigationSceneWithRootScene rootScene ");
            sbLIZ6.append(clsLJIIZILJ);
            C201955140j.LIZJ(c201954140i, C2188811AlT.LIZIZ(sbLIZ6));
            float fLIZ = C289940BYa.LIZ();
            C214936199q c214936199q = new C214936199q(bundle3, clsLJIIZILJ);
            c214936199q.LIZJ = false;
            c214936199q.LIZLLL = false;
            c214936199q.LJ = 0;
            c214936199q.LJIIZILJ = C293940Bfc.LIZ();
            c214936199q.LJFF = true;
            c214936199q.LJI = fLIZ;
            NavigationScene navigationScene3 = (NavigationScene) C2350509Ix.LIZ(c214936199q.LIZ(), NavigationScene.class);
            C365090ETb.LIZIZ();
            add(R.id.tya, navigationScene3, "CreativeToolContainerScene");
            this.LLJLIL = navigationScene3;
        } else {
            this.LLJLIL = navigationScene2;
            if (!(this.mActivity instanceof SAASceneWrapperActivity)) {
                C12WG.LIZJ(navigationScene2, new ARunnableS108S0100000_8(this, 5));
            }
        }
        this.LLJLILLLLZIIL.LJII(this.LLJLIL);
        this.LLLI = true;
        Iterator<Function0<Unit>> it2 = this.LLLII.iterator();
        while (it2.hasNext()) {
            it2.next().invoke();
        }
        NavigationScene navigationScene4 = this.LLJLIL;
        if (navigationScene4 != null) {
            navigationScene4.registerChildSceneLifecycleCallbacks(new C0Y8U() { // from class: X.198I
                @Override // X.C0Y8U, X.C19AH
                public final void LJIILJJIL() {
                    this.LIZ.LLLLLL();
                }

                @Override // X.C0Y8U, X.C19AH
                public final void LJJJI() {
                    this.LIZ.LLLLLL();
                }

                @Override // X.C0Y8U, X.C19AH
                public final void LJJJJ() {
                    this.LIZ.LLLLLL();
                }

                @Override // X.C0Y8U, X.C19AH
                public final void LIZ(Scene scene) {
                    this.LIZ.LLLLLJIL();
                }

                @Override // X.C0Y8U, X.C19AH
                public final void LIZLLL(Scene scene) {
                    this.LIZ.LLLLLJIL();
                }

                @Override // X.C0Y8U, X.C19AH
                public final void LJIILIIL(Scene scene) {
                    this.LIZ.LLLLLL();
                }

                @Override // X.C0Y8U, X.C19AH
                public final void LJIJJ(Scene scene) {
                    this.LIZ.LLLLLL();
                }

                @Override // X.C0Y8U, X.C19AH
                public final void LJJ(Scene scene) {
                    this.LIZ.LLLLLL();
                }

                @Override // X.C0Y8U, X.C19AH
                public final void LJJIFFI(Scene scene) {
                    this.LIZ.LLLLLJIL();
                }

                @Override // X.C0Y8U, X.C19AH
                public final void LJJIII(Scene scene) {
                    this.LIZ.LLLLLJIL();
                }

                @Override // X.C0Y8U, X.C19AH
                public final void LJJIIZI(Scene scene) {
                    this.LIZ.LLLLLJIL();
                }

                @Override // X.C0Y8U, X.C19AH
                public final void LJJIZ(Scene scene) {
                    this.LIZ.LLLLLJIL();
                }

                @Override // X.C0Y8U, X.C19AH
                public final void LJJJ(Scene scene) {
                    this.LIZ.LLLLLJIL();
                }

                @Override // X.C0Y8U, X.C19AH
                public final void LJJJJIZL(Scene scene) {
                    this.LIZ.LLLLLL();
                }

                @Override // X.C0Y8U, X.C19AH
                public final void LJJJJL(Scene scene) {
                    this.LIZ.LLLLLL();
                }

                @Override // X.C0Y8U, X.C19AH
                public final void LJJI(Scene scene, Bundle bundle10) {
                    this.LIZ.LLLLLJIL();
                }

                @Override // X.C0Y8U, X.C19AH
                public final void LJJIJIIJIL(Scene scene, Bundle bundle10) {
                    this.LIZ.LLLLLL();
                }

                @Override // X.C0Y8U, X.C19AH
                public final void LJJJJZ(Scene scene, Bundle bundle10) {
                    this.LIZ.LLLLLJIL();
                }
            }, true);
        }
        NavigationScene navigationScene5 = this.LLJLIL;
        if (navigationScene5 != null) {
            navigationScene5.registerChildSceneLifecycleCallbacks(new C0Y8U() { // from class: X.198B
                /* JADX WARN: Multi-variable type inference failed */
                @Override // X.C0Y8U, X.C19AH
                public final void LIZ(Scene scene) {
                    InterfaceC1452540nu0 interfaceC1452540nu0;
                    if ((scene instanceof InterfaceC1452540nu0) && (interfaceC1452540nu0 = (InterfaceC1452540nu0) scene) != null) {
                        interfaceC1452540nu0.r7();
                    }
                    if (C523670KgH.LIZ()) {
                        C0CHQ.LIZ().getPublishService().LJIIL().LJJ(new AwS116S1000000_32(scene.getClass().getSimpleName(), 1));
                    }
                }

                @Override // X.C0Y8U, X.C19AH
                public final void LJJ(Scene scene) {
                    this.LIZ.LLJLL.setCustomTag("saa_page", scene.getClass().getName());
                }

                @Override // X.C0Y8U, X.C19AH
                public final void LJJJ(Scene scene) {
                    C0CHQ.LIZ().LJIJI();
                }

                @Override // X.C0Y8U, X.C19AH
                public final void LJJIJIIJIL(Scene scene, Bundle bundle10) {
                    AbstractC214814194y abstractC214814194y;
                    this.LIZ.LLJLL.setCustomTag("saa_page", scene.getClass().getName());
                    if ((scene instanceof AbstractC214814194y) && (abstractC214814194y = (AbstractC214814194y) scene) != null) {
                        CreativeToolContainerScene creativeToolContainerScene = this.LIZ;
                        creativeToolContainerScene.ZN(new AwS433S0200000_32(creativeToolContainerScene, abstractC214814194y, 73));
                    }
                }
            }, false);
        }
        C201955140j.LIZIZ("CreativeToolStayTimeMonitor", "CreativeToolContainerScene onActivityCreated");
        C560380LyO c560380LyO = C560380LyO.LIZ;
        Lifecycle lifecycle = getLifecycle();
        c560380LyO.getClass();
        C560380LyO.LIZIZ(lifecycle, false);
        C560380LyO.LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.adaptation.saa.fragment.TikTokSAARootFragmentGroupScene, X.AbstractC214814194y, X.AnonymousClass1995
    public final void onConfigurationChanged(Configuration configuration) {
        AbstractC214814194y abstractC214814194y;
        super.onConfigurationChanged(configuration);
        NavigationScene navigationScene = this.LLJLIL;
        if (navigationScene != null) {
            navigationScene.onConfigurationChanged(configuration);
        }
        for (Scene scene : kI()) {
            if ((scene instanceof AbstractC214814194y) && (abstractC214814194y = (AbstractC214814194y) scene) != null) {
                abstractC214814194y.processConfigurationChanged$tools_camera_base_release(configuration);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.adaptation.saa.fragment.TikTokSAARootFragmentGroupScene, X.AbstractC214814194y, X.C19A3, com.bytedance.scene.Scene
    public final void onCreate(Bundle bundle) {
        Object c098200Yq;
        C554870LpV.LIZ.getClass();
        if (bundle != null && C299090Bnv.LIZ() && !C554870LpV.LIZ() && ((Boolean) C264810AZj.LIZ.getValue()).booleanValue()) {
            C554740LpI c554740LpI = C554740LpI.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("CreativeToolContainerScene");
            sbLIZ.append(" begin GroupSceneBundleParser");
            C201955140j.LIZJ(c554740LpI, C2188811AlT.LIZIZ(sbLIZ));
            List listLIZ = C214899198f.LIZ(bundle);
            ArrayList<C790260UzI> arrayList = new ArrayList();
            for (Object obj : listLIZ) {
                if (Intrinsics.LJFF(((C790260UzI) obj).LIZ, NavigationScene.class.getName())) {
                    arrayList.add(obj);
                }
            }
            C554740LpI c554740LpI2 = C554740LpI.LIZIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("CreativeToolContainerScene");
            sbLIZ2.append(" parserResult size ");
            sbLIZ2.append(arrayList.size());
            C201955140j.LIZJ(c554740LpI2, C2188811AlT.LIZIZ(sbLIZ2));
            Bundle bundle2 = this.mArguments;
            if (bundle2 != null && !bundle2.getBoolean("ignoreVEPluginCheck", false)) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((C790260UzI) it2.next()).LIZLLL.invoke();
                }
                C554740LpI c554740LpI3 = C554740LpI.LIZIZ;
                C201955140j.LIZJ(c554740LpI3, "CreativeToolContainerScene all GroupScene child removed because of ignoreVEPluginCheck false");
                C201955140j.LIZJ(c554740LpI3, "CreativeToolContainerScene finish GroupSceneBundleParser");
            } else {
                int size = arrayList.size();
                int i = 0;
                for (C790260UzI c790260UzI : arrayList) {
                    Bundle bundle3 = c790260UzI.LIZJ;
                    if (bundle3 != null) {
                        C554740LpI c554740LpI4 = C554740LpI.LIZIZ;
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("CreativeToolContainerScene");
                        sbLIZ3.append(" begin NavigationSceneBundleParser");
                        C201955140j.LIZJ(c554740LpI4, C2188811AlT.LIZIZ(sbLIZ3));
                        List<C1602110rnF> listLIZ2 = C214900198g.LIZ(bundle3, null);
                        int i2 = 0;
                        for (C1602110rnF c1602110rnF : listLIZ2) {
                            if (c1602110rnF.LIZ.length() > 0) {
                                try {
                                    c098200Yq = Class.forName(c1602110rnF.LIZ);
                                    C189200o6.m2constructorimpl(c098200Yq);
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    c098200Yq = new C098200Yq(th);
                                    C189200o6.m2constructorimpl(c098200Yq);
                                }
                                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                                    c098200Yq = null;
                                }
                                Class cls = (Class) c098200Yq;
                                if (cls != null && InterfaceC855400Xh4.class.isAssignableFrom(cls)) {
                                    C201955140j.LIZJ(C554740LpI.LIZIZ, "CreativeToolContainerScene remove " + cls + " page which dependent on VE");
                                    c1602110rnF.LIZJ.invoke();
                                    i2++;
                                }
                            }
                        }
                        if (listLIZ2.size() == i2) {
                            C554740LpI c554740LpI5 = C554740LpI.LIZIZ;
                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                            sbLIZ4.append("CreativeToolContainerScene");
                            sbLIZ4.append(" remove NavigationScene which all children dependent on VE");
                            C201955140j.LIZJ(c554740LpI5, C2188811AlT.LIZIZ(sbLIZ4));
                            c790260UzI.LIZLLL.invoke();
                            i++;
                        }
                        C554740LpI c554740LpI6 = C554740LpI.LIZIZ;
                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                        sbLIZ5.append("CreativeToolContainerScene");
                        sbLIZ5.append(" finish NavigationSceneBundleParser");
                        C201955140j.LIZJ(c554740LpI6, C2188811AlT.LIZIZ(sbLIZ5));
                    }
                }
                if (i == size) {
                    C554740LpI c554740LpI7 = C554740LpI.LIZIZ;
                    StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                    sbLIZ6.append("CreativeToolContainerScene");
                    sbLIZ6.append(" all GroupScene child removed");
                    C201955140j.LIZJ(c554740LpI7, C2188811AlT.LIZIZ(sbLIZ6));
                }
                C554740LpI c554740LpI8 = C554740LpI.LIZIZ;
                StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                sbLIZ7.append("CreativeToolContainerScene");
                sbLIZ7.append(" finish GroupSceneBundleParser");
                C201955140j.LIZJ(c554740LpI8, C2188811AlT.LIZIZ(sbLIZ7));
            }
        }
        super.onCreate(bundle);
    }

    @Override // com.ss.android.ugc.aweme.adaptation.saa.fragment.TikTokSAARootFragmentGroupScene, X.AbstractC214814194y, X.C19A3, com.bytedance.scene.Scene
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
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    @Override // X.AbstractC214814194y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean processNewArguments(android.os.Bundle r5) {
        /*
            r4 = this;
            X.140i r1 = X.C201954140i.LIZIZ
            java.lang.String r0 = "CreativeToolContainerScene processNewArguments"
            X.C201955140j.LIZJ(r1, r0)
            X.198H r3 = r4.LC()
            r2 = 1
            r1 = 0
            if (r5 == 0) goto L33
            java.lang.String r0 = "start_live_single_activity"
            boolean r0 = r5.getBoolean(r0, r1)
            if (r0 != r2) goto L2b
            boolean r0 = r3 instanceof X.InterfaceC20630715o9
            if (r0 == 0) goto L29
            X.15o9 r3 = (X.InterfaceC20630715o9) r3
            X.198i r0 = r3.F0()
            boolean r0 = r0 instanceof X.InterfaceC20596815ig
            if (r0 == 0) goto L29
            r3.LLLLIILLL(r5)
            return r2
        L29:
            if (r5 == 0) goto L33
        L2b:
            java.lang.String r0 = "creative_saa_page"
            java.lang.String r1 = r5.getString(r0)
            if (r1 != 0) goto L3c
        L33:
            java.lang.String r1 = ""
            if (r5 != 0) goto L3c
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
        L3c:
            r0 = 0
            X.C0MWH.LJII(r4, r1, r5, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.adaptation.saa.CreativeToolContainerScene.processNewArguments(android.os.Bundle):boolean");
    }

    @Override // X.C198Q
    public final void vg(boolean z) {
        C198Q c198q;
        C198H c198hLC = LC();
        if ((c198hLC instanceof C198Q) && (c198q = (C198Q) c198hLC) != null) {
            c198q.vg(z);
        }
    }

    @Override // X.InterfaceC1563380qmm
    public final void LLJILJILJ(EnumC682280QpW enumC682280QpW, Boolean bool) {
        String strLLLLLJLJLL = LLLLLJLJLL(enumC682280QpW);
        if (strLLLLLJLJLL == null) {
            if (!Intrinsics.LJFF(bool, Boolean.FALSE)) {
                this.LLJJJJLIIL--;
                return;
            } else {
                this.LLJJJJLIIL++;
                return;
            }
        }
        if (bool == null) {
            this.LLJJJJJIL.remove(strLLLLLJLJLL);
        } else {
            this.LLJJJJJIL.put(strLLLLLJLJLL, bool);
        }
    }

    @Override // X.InterfaceC1563380qmm
    public final <T> T LLLIIL(EnumC682280QpW enumC682280QpW, Function0<? extends T> function0) {
        switch (C682490Qpr.LIZ[enumC682280QpW.ordinal()]) {
            case 1:
                return (T) ZN(function0);
            case 2:
            case 3:
            case 4:
                return function0.invoke();
            case 5:
            case 6:
            case 7:
                return function0.invoke();
            case 8:
                return function0.invoke();
            case BdTuring.TYPE_ECAF /* 9 */:
                return function0.invoke();
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return function0.invoke();
            default:
                throw new C1954807lC();
        }
    }

    @Override // X.InterfaceC20597015ii
    public final <T> T Ss(String str, Function0<? extends T> function0) {
        return function0.invoke();
    }

    @Override // X.AbstractC214814194y
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        Object obj;
        Boolean boolOnActivityKeyDown;
        NavigationScene navigationScene = this.LLJLIL;
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

    @Override // X.AbstractC214814194y
    public final boolean onKeyLongPress(int i, KeyEvent keyEvent) {
        Object obj;
        Boolean boolOnActivityKeyLongPress;
        NavigationScene navigationScene = this.LLJLIL;
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

    @Override // X.AbstractC214814194y
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        Object obj;
        Boolean boolOnActivityKeyUp;
        NavigationScene navigationScene = this.LLJLIL;
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

    @Override // X.AbstractC214814194y
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

    @Override // X.AbstractC1447660nm8, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        InterfaceC214897198d interfaceC214897198d;
        BaseActivity baseActivity;
        Activity activity = this.mActivity;
        if (activity != null && C960203pA.LIZIZ(activity)) {
            ComponentCallbacks2 componentCallbacks2 = this.mActivity;
            Boolean boolValueOf = null;
            if (!C294780Bgy.LIZ() ? !(!(componentCallbacks2 instanceof InterfaceC214897198d) || (interfaceC214897198d = (InterfaceC214897198d) componentCallbacks2) == null || !interfaceC214897198d.getEnableSAF()) : !(!(componentCallbacks2 instanceof InterfaceC214897198d) || (interfaceC214897198d = (InterfaceC214897198d) componentCallbacks2) == null)) {
                boolValueOf = Boolean.valueOf(interfaceC214897198d.migrateDarkModeImplToFragment());
            }
            if (Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
                Activity activity2 = this.mActivity;
                if ((activity2 instanceof BaseActivity) && (baseActivity = (BaseActivity) activity2) != null) {
                    C755440TkE.LIZ(baseActivity);
                }
            }
            setTheme(R.style.y0);
        }
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.ena, viewGroup, false);
    }

    @Override // X.AbstractC214814194y
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        C0CHQ.LIZ().LJJJJJ().getAlbumService().tryPreloadMediaAfterAlbumPermissionGranted(requireFragmentActivity());
    }
}
