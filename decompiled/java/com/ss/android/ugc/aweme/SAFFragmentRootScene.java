package com.ss.android.ugc.aweme;

import X.AbstractC214793194d;
import X.AbstractC813200VvC;
import X.AnonymousClass1991;
import X.C01GW;
import X.C07RK;
import X.C1242904tf;
import X.C13LQ;
import X.C1447800nmM;
import X.C1800490wxD;
import X.C195R;
import X.C198R;
import X.C19BK;
import X.C19BM;
import X.C20630415o6;
import X.C20674915vH;
import X.C20675015vI;
import X.C21390118nL;
import X.C214895198b;
import X.C214896198c;
import X.C214898198e;
import X.C214903198j;
import X.C214910198q;
import X.C214911198r;
import X.C214912198s;
import X.C214916198w;
import X.C214917198x;
import X.C2188811AlT;
import X.C2214291BlT;
import X.C294780Bgy;
import X.C452501pT;
import X.C560320LyI;
import X.C786410Ut5;
import X.InterfaceC1737690vJv;
import X.InterfaceC20630715o9;
import X.InterfaceC214897198d;
import X.InterfaceC214902198i;
import X.InterfaceC214915198v;
import X.InterfaceC214918198y;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleRegistry;
import com.bytedance.scene.Scene;
import com.bytedance.scene.navigation.NavigationScene;
import com.ss.android.agilelogger.ALog;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS223S0000000_32;
import kotlin.jvm.internal.AwS433S0200000_32;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: loaded from: classes33.dex */
public final class SAFFragmentRootScene extends Scene implements C19BK, InterfaceC20630715o9 {
    public InterfaceC214902198i LLJJ;
    public Function0<? extends InterfaceC214902198i> LLJJI;
    public AnonymousClass1991 LLJJIII;
    public boolean LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public boolean LLJJL;
    public AwS433S0200000_32 LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJI = C452501pT.LIZIZ(new C214910198q(this));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new C20675015vI(this));
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new C214911198r(this));
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new C214912198s(this));
    public final C01GW LLJILLL = C452501pT.LIZIZ(new C214898198e(this));
    public final OnBackPressedDispatcher LLJJIJI = new OnBackPressedDispatcher(new Runnable() { // from class: X.16Ch
        @Override // java.lang.Runnable
        public final void run() {
            boolean zLIZ;
            C1C7U.LIZ("SAFFragmentRootScene@9be1.dispatcher$1");
            try {
                C19BM c19bmBuildPopOptions = this.LL.buildPopOptions();
                NavigationScene navigationSceneLIZ = C1447800nmM.LIZ(this.LL);
                if (navigationSceneLIZ != null) {
                    navigationSceneLIZ.LLLLLJIL(c19bmBuildPopOptions);
                } else {
                    this.LL.onBackPressed();
                }
            } finally {
                if (!zLIZ) {
                }
            }
            C1C7U.LIZIZ("SAFFragmentRootScene@9be1.dispatcher$1");
        }
    });
    public final LifecycleRegistry LLJJJ = new LifecycleRegistry(this);
    public final C01GW LLJJJIL = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(30));
    public final C01GW LLJJJJ = C452501pT.LIZIZ(new C214903198j(this));
    public final C01GW LLJJJJJIL = C452501pT.LIZIZ(new C214896198c(this));
    public final C01GW LLJJJJLIIL = C452501pT.LIZIZ(new C214895198b(this));
    public final C01GW LLJL = C452501pT.LIZIZ(new C20674915vH(this));
    public final ConcurrentHashMap<AbstractC813200VvC, Boolean> LLJLIL = new ConcurrentHashMap<>();

    @Override // X.C19BK
    public final void disableSupportRestore() {
    }

    @Override // X.C198H
    public final Scene getScene() {
        return this;
    }

    @Override // X.C19BK
    public final String getSceneDebugInfo(Scene scene) {
        return null;
    }

    @Override // X.C19BK
    public final boolean isSupportChildReplaceParentScene() {
        return false;
    }

    @Override // X.C19BK
    public final boolean isSupportRestore() {
        return true;
    }

    @Override // X.InterfaceC20630815oA
    public final boolean LJJJ() {
        AnonymousClass1991 anonymousClass1991LIZIZ;
        InterfaceC214902198i interfaceC214902198i = this.LLJJ;
        if (interfaceC214902198i == null || (anonymousClass1991LIZIZ = C1800490wxD.LIZIZ(interfaceC214902198i)) == null) {
            return false;
        }
        return !anonymousClass1991LIZIZ.LJIILLIIL;
    }

    @Override // com.bytedance.scene.Scene
    public final LayoutInflater LLJJJJJIL() {
        return ((Boolean) this.LLJI.getValue()).booleanValue() ? requireActivity().getLayoutInflater().cloneInContext(onGetSceneContext()) : requireActivity().getLayoutInflater();
    }

    public final AnonymousClass1991 LLLIIIIL() {
        if (Intrinsics.LJFF(C1242904tf.LIZ.getValue(), Integer.valueOf(C1242904tf.LIZIZ))) {
            return this.LLJJIII;
        }
        InterfaceC214902198i interfaceC214902198i = this.LLJJ;
        if (interfaceC214902198i != null) {
            return C1800490wxD.LIZIZ(interfaceC214902198i);
        }
        return null;
    }

    public final C198R LLLIILIL() {
        return (C198R) this.LLJJJJJIL.getValue();
    }

    public final Fragment LLLILZ() {
        Object obj = this.LLJJ;
        if (obj != null) {
            return (Fragment) obj;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public final InterfaceC214902198i LLLILZLLLI() {
        InterfaceC214902198i interfaceC214902198i = this.LLJJ;
        if (interfaceC214902198i != null) {
            return interfaceC214902198i;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // X.InterfaceC214942199w
    public final boolean W1() {
        Bundle bundle;
        return (this.LLJJIJIIJIL || (bundle = this.mArguments) == null || !bundle.getBoolean("arg_navigate_with_reuse")) ? false : true;
    }

    @Override // X.InterfaceC20630715o9
    public final FragmentManager getFragmentManager() {
        return (FragmentManager) this.LLJJJJLIIL.getValue();
    }

    @Override // X.C19BK
    public final List<Scene> getSceneList() {
        return new ArrayList();
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0106 A[DONT_GENERATE] */
    @Override // com.bytedance.scene.Scene
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDestroy() {
        /*
            Method dump skipped, instruction units count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.SAFFragmentRootScene.onDestroy():void");
    }

    @Override // com.bytedance.scene.Scene
    public final Context onGetSceneContext() {
        return (((SAFContextThemeConfig) this.LLJIJIL.getValue()).getEnableUnifyFragmentContextAndInflater() || ((Boolean) this.LLJI.getValue()).booleanValue()) ? (Context) this.LLJL.getValue() : requireActivity();
    }

    @Override // com.bytedance.scene.Scene
    public final void onPause() {
        InterfaceC214918198y interfaceC214918198yU5;
        InterfaceC214918198y interfaceC214918198yU52;
        String str = "onPause Start (" + this + ')';
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogE("SAFFragmentRootScene", str);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SAFFragmentRootScene");
        sbLIZ.append(": ");
        sbLIZ.append(str);
        System.out.println((Object) C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("[RootScene] onPause() ");
        sbLIZ2.append(hashCode());
        C2188811AlT.LIZIZ(sbLIZ2);
        InterfaceC214902198i interfaceC214902198i = this.LLJJ;
        if (interfaceC214902198i != null && (interfaceC214918198yU52 = interfaceC214902198i.U5()) != null) {
            interfaceC214918198yU52.LIZIZ();
        }
        super.onPause();
        LLLIILIL().LIZ.LLILZ.LJJIL(5);
        this.LLJJJ.handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
        InterfaceC214902198i interfaceC214902198i2 = this.LLJJ;
        if (interfaceC214902198i2 == null || (interfaceC214918198yU5 = interfaceC214902198i2.U5()) == null) {
            return;
        }
        interfaceC214918198yU5.LIZ();
    }

    @Override // com.bytedance.scene.Scene
    public final void onStop() {
        String str = "onStop Start (" + this + ')';
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogE("SAFFragmentRootScene", str);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SAFFragmentRootScene");
        sbLIZ.append(": ");
        sbLIZ.append(str);
        System.out.println((Object) C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("[RootScene] onStop() ");
        sbLIZ2.append(hashCode());
        C2188811AlT.LIZIZ(sbLIZ2);
        super.onStop();
        while (LLLIL(getFragmentManager(), Lifecycle.State.CREATED)) {
        }
        LLLIILIL().LIZ.LLILZ.LJJIZ();
        this.LLJJJ.handleLifecycleEvent(Lifecycle.Event.ON_STOP);
    }

    @Override // X.C198H
    public final C19BM buildPopOptions() {
        AbstractC214793194d abstractC214793194dLIZJ;
        LLLILZLLLI().zB();
        AnonymousClass1991 anonymousClass1991LLLIIIIL = LLLIIIIL();
        C560320LyI c560320LyI = new C560320LyI();
        c560320LyI.LIZIZ = true;
        c560320LyI.LIZJ = false;
        c560320LyI.LIZLLL = anonymousClass1991LLLIIIIL != null && anonymousClass1991LLLIIIIL.LJIILL;
        if (anonymousClass1991LLLIIIIL != null && (abstractC214793194dLIZJ = C195R.LIZJ(anonymousClass1991LLLIIIIL, requireActivity(), false)) != null) {
            c560320LyI.LIZ = abstractC214793194dLIZJ;
        }
        return c560320LyI.LIZ();
    }

    @Override // X.C198H
    public final boolean onBackPressed() {
        return LLLILZLLLI().onBackPressed();
    }

    @Override // com.bytedance.scene.Scene
    public final void onDestroyView() {
        super.onDestroyView();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[RootScene] onDestroyView() ");
        sbLIZ.append(hashCode());
        C2188811AlT.LIZIZ(sbLIZ);
        this.LLJJIJIIJIL = true;
    }

    @Override // X.InterfaceC214942199w
    public final void onRelease() {
        ViewGroup viewGroup;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[RootScene] onRelease() ");
        sbLIZ.append(hashCode());
        C2188811AlT.LIZIZ(sbLIZ);
        InterfaceC214902198i interfaceC214902198i = this.LLJJ;
        if (interfaceC214902198i != null) {
            interfaceC214902198i.onRelease();
        }
        if (W1()) {
            View view = this.mView;
            ViewParent parent = view != null ? view.getParent() : null;
            if (!(parent instanceof ViewGroup) || (viewGroup = (ViewGroup) parent) == null) {
                return;
            }
            C786410Ut5.LJJJLZIJ(this.mView, viewGroup);
        }
    }

    @Override // com.bytedance.scene.Scene
    public final void onResume() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[RootScene] onResume() ");
        sbLIZ.append(hashCode());
        C2188811AlT.LIZIZ(sbLIZ);
        String str = "onResume Start (" + this + ')';
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogE("SAFFragmentRootScene", str);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("SAFFragmentRootScene");
        sbLIZ2.append(": ");
        sbLIZ2.append(str);
        System.out.println((Object) C2188811AlT.LIZIZ(sbLIZ2));
        LLLIILIL().LIZJ();
        super.onResume();
        LLLIILIL().LIZIZ();
        this.LLJJJ.handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
        LLLIILIL().LIZ.LLILZ.LJJIJL();
    }

    @Override // com.bytedance.scene.Scene
    public final void onStart() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[RootScene] onStart() ");
        sbLIZ.append(hashCode());
        C2188811AlT.LIZIZ(sbLIZ);
        String str = "onStart Start (" + this + ')';
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogE("SAFFragmentRootScene", str);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("SAFFragmentRootScene");
        sbLIZ2.append(": ");
        sbLIZ2.append(str);
        System.out.println((Object) C2188811AlT.LIZIZ(sbLIZ2));
        LLLIILIL().LIZJ();
        super.onStart();
        LLLIILIL().LIZIZ();
        this.LLJJJ.handleLifecycleEvent(Lifecycle.Event.ON_START);
        LLLIILIL().LIZ.LLILZ.LJJIJLIJ();
        AwS433S0200000_32 awS433S0200000_32 = this.LLJJLIIIJLLLLLLLZ;
        if (awS433S0200000_32 != null) {
            awS433S0200000_32.invoke();
        }
    }

    @Override // X.InterfaceC20630715o9
    public final InterfaceC214902198i F0() {
        return this.LLJJ;
    }

    @Override // X.C198H
    public final void finish() {
        C20630415o6.LIZ(this);
    }

    public static void LLLII(Fragment fragment) {
        ViewGroup viewGroup;
        View view = fragment.getView();
        ViewParent parent = null;
        if (view != null) {
            parent = view.getParent();
        }
        if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
            viewGroup.startViewTransition(view);
        }
        Iterator<Fragment> it2 = fragment.getChildFragmentManager().LJJLIIIJL().iterator();
        while (it2.hasNext()) {
            LLLII(it2.next());
        }
    }

    @Override // X.AnonymousClass1995
    public final void LLLLIILLL(Bundle bundle) {
        LLLIILIL().LIZJ();
        LLLILZLLLI().LLLLIILLL(bundle);
    }

    @Override // X.InterfaceC20630715o9
    public final void Rj(AbstractC813200VvC abstractC813200VvC) {
        this.LLJLIL.remove(abstractC813200VvC);
        getFragmentManager().LLIILZL(abstractC813200VvC);
    }

    @Override // X.InterfaceC214942199w
    public final void U1(Bundle bundle) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[RootScene] onPrepare() ");
        sbLIZ.append(hashCode());
        C2188811AlT.LIZIZ(sbLIZ);
        C214917198x.LIZ(LLLILZ(), this.mArguments);
        InterfaceC214902198i interfaceC214902198i = this.LLJJ;
        if (interfaceC214902198i != null) {
            interfaceC214902198i.U1(bundle);
        }
    }

    @Override // com.bytedance.scene.Scene
    public final void dispatchCreate(Bundle bundle) {
        Bundle bundle2;
        Set<String> setKeySet;
        Bundle bundle3;
        if (bundle != null && !bundle.getBoolean("bd-scene-nav:scene_argument_has") && bundle.getBoolean("scene:support:use_fragment_arguments_as_scene_arguments_flag", false)) {
            Parcelable parcelable = bundle.getParcelable("scene:support:fragments");
            Bundle bundle4 = null;
            if ((parcelable instanceof Bundle) && (bundle2 = (Bundle) parcelable) != null && (setKeySet = bundle2.keySet()) != null) {
                for (String str : setKeySet) {
                    if (u.LJJIIJZLJL(str, "fragment_", false)) {
                        bundle4 = bundle2.getBundle(str);
                    }
                }
                if (bundle4 != null && (bundle3 = bundle4.getBundle("arguments")) != null) {
                    bundle.putBoolean("bd-scene-nav:scene_argument_has", true);
                    C786410Ut5.LJJIIZI(bundle, bundle3, "bd-scene-nav:scene_argument");
                }
            }
        }
        super.dispatchCreate(bundle);
    }

    @Override // com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[RootScene] onActivityCreated() ");
        sbLIZ.append(hashCode());
        C2188811AlT.LIZIZ(sbLIZ);
        String str = "onActivityCreated Start (" + this + ')';
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogE("SAFFragmentRootScene", str);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("SAFFragmentRootScene");
        sbLIZ2.append(": ");
        sbLIZ2.append(str);
        System.out.println((Object) C2188811AlT.LIZIZ(sbLIZ2));
        LLLIILIL().LIZ.LLILZ.LJIIZILJ();
        super.onActivityCreated(bundle);
        ComponentCallbacks2 componentCallbacks2RequireActivity = requireActivity();
        if (!C294780Bgy.LIZ() ? !(!(componentCallbacks2RequireActivity instanceof InterfaceC214897198d) || !((InterfaceC214897198d) componentCallbacks2RequireActivity).getEnableSAF()) : (componentCallbacks2RequireActivity instanceof InterfaceC214897198d)) {
            NavigationScene navigationSceneLIZ = C1447800nmM.LIZ(this);
            if (navigationSceneLIZ != null) {
                navigationSceneLIZ.LLLIILIL(this, new InterfaceC1737690vJv() { // from class: X.198k
                    @Override // X.InterfaceC1737690vJv
                    public final boolean onBackPressed() {
                        boolean zOnBackPressed = this.LL.onBackPressed();
                        if (!zOnBackPressed && C07GT.LIZ()) {
                            C214905198l.LIZIZ(this.LL.LLJJ);
                        }
                        return zOnBackPressed;
                    }
                });
                return;
            }
            return;
        }
        "host activity should be a ISAFActivity".toString();
        throw new IllegalStateException("host activity should be a ISAFActivity");
    }

    @Override // X.AnonymousClass1995
    public final void onConfigurationChanged(Configuration configuration) {
        String str = "onConfigurationChanged Start (" + this + ')';
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogE("SAFFragmentRootScene", str);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SAFFragmentRootScene");
        sbLIZ.append(": ");
        sbLIZ.append(str);
        System.out.println((Object) C2188811AlT.LIZIZ(sbLIZ));
        LLLIILIL().LIZJ();
        LLLIILIL().LIZ.LLILZ.LJIJI(true, configuration);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0257  */
    /* JADX WARN: Type inference failed for: r0v25, types: [X.198i] */
    /* JADX WARN: Type inference failed for: r0v75 */
    /* JADX WARN: Type inference failed for: r0v83 */
    /* JADX WARN: Type inference failed for: r0v84 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [X.198i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5 */
    @Override // com.bytedance.scene.Scene
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r14) {
        /*
            Method dump skipped, instruction units count: 705
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.SAFFragmentRootScene.onCreate(android.os.Bundle):void");
    }

    @Override // com.bytedance.scene.Scene
    public final void onSaveInstanceState(Bundle bundle) {
        Parcelable parcelableLLFZ;
        Bundle bundle2;
        Set<String> setKeySet;
        Bundle bundle3;
        super.onSaveInstanceState(bundle);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[RootScene] onSaveInstanceState() ");
        sbLIZ.append(hashCode());
        C2188811AlT.LIZIZ(sbLIZ);
        String str = "onSaveInstanceState Start (" + this + ')';
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogE("SAFFragmentRootScene", str);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("SAFFragmentRootScene");
        sbLIZ2.append(": ");
        sbLIZ2.append(str);
        System.out.println((Object) C2188811AlT.LIZIZ(sbLIZ2));
        while (LLLIL(getFragmentManager(), Lifecycle.State.CREATED)) {
        }
        this.LLJJJ.handleLifecycleEvent(Lifecycle.Event.ON_STOP);
        AnonymousClass1991 anonymousClass1991LLLIIIIL = LLLIIIIL();
        if ((anonymousClass1991LLLIIIIL == null || anonymousClass1991LLLIIIIL.LJIIIIZZ) && (parcelableLLFZ = LLLIILIL().LIZ.LLILZ.LLFZ()) != null) {
            C786410Ut5.LJJIJL(bundle, "scene:support:fragments", parcelableLLFZ);
            if (((Boolean) this.LLJILJILJ.getValue()).booleanValue() && bundle.getBoolean("bd-scene-nav:scene_argument_has")) {
                Parcelable parcelable = bundle.getParcelable("scene:support:fragments");
                Bundle bundle4 = null;
                if ((parcelable instanceof Bundle) && (bundle2 = (Bundle) parcelable) != null && (setKeySet = bundle2.keySet()) != null) {
                    for (String str2 : setKeySet) {
                        if (u.LJJIIJZLJL(str2, "fragment_", false)) {
                            bundle4 = bundle2.getBundle(str2);
                        }
                    }
                    if (bundle4 != null && (bundle3 = bundle4.getBundle("arguments")) != null && Intrinsics.LJFF(bundle3, bundle.getBundle("bd-scene-nav:scene_argument"))) {
                        bundle.remove("bd-scene-nav:scene_argument_has");
                        bundle.remove("bd-scene-nav:scene_argument");
                        bundle.putBoolean("scene:support:use_fragment_arguments_as_scene_arguments_flag", true);
                    }
                }
            }
        }
        C214916198w c214916198w = InterfaceC214915198v.LJIIJJI;
        int i = bundle.getInt("bd-scene:scene_save_instance_state_reason", 0);
        c214916198w.getClass();
        C13LQ.LJJIJ(i, C214916198w.LIZIZ);
    }

    @Override // com.bytedance.scene.Scene
    public final void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        String str = "onViewStateRestored Start (" + this + ')';
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogE("SAFFragmentRootScene", str);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SAFFragmentRootScene");
        sbLIZ.append(": ");
        sbLIZ.append(str);
        System.out.println((Object) C2188811AlT.LIZIZ(sbLIZ));
        if (LLLILZ().getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
            LLLILZLLLI().onRestoreInstanceState(bundle);
        } else {
            this.LLJJLIIIJLLLLLLLZ = new AwS433S0200000_32(this, bundle, 7);
        }
    }

    @Override // X.AnonymousClass1995
    public final void onWindowFocusChanged(boolean z) {
        String string;
        StringBuilder sb = new StringBuilder();
        Bundle bundle = this.mArguments;
        if (bundle != null) {
            string = bundle.getString("fragmentClass");
        } else {
            string = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onWindowFocusChanged: ");
        sbLIZ.append(string);
        sbLIZ.append(", ");
        sbLIZ.append(this.LLJJ);
        sbLIZ.append(", ");
        sbLIZ.append(this.LLJJL);
        sb.append(C2188811AlT.LIZIZ(sbLIZ));
        sb.append(" (");
        sb.append(this);
        sb.append(')');
        String string2 = sb.toString();
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogE("SAFFragmentRootScene", string2);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("SAFFragmentRootScene");
        sbLIZ2.append(": ");
        sbLIZ2.append(string2);
        System.out.println((Object) C2188811AlT.LIZIZ(sbLIZ2));
        LLLILZLLLI().onWindowFocusChanged(z);
    }

    @Override // X.InterfaceC20630715o9
    public final void ze(Bundle bundle) {
        this.mArguments = bundle;
    }

    public static boolean LLLIL(FragmentManager fragmentManager, Lifecycle.State state) {
        boolean zLLLIL = false;
        for (Fragment fragment : fragmentManager.LJJLIIIJL()) {
            if (fragment != null) {
                if (fragment.getHost() != null) {
                    zLLLIL |= LLLIL(fragment.getChildFragmentManager(), state);
                }
                if (fragment.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
                    ((LifecycleRegistry) fragment.getLifecycle()).setCurrentState(state);
                    zLLLIL = true;
                }
            }
        }
        return zLLLIL;
    }

    @Override // X.InterfaceC20630715o9
    public final void d5(AbstractC813200VvC abstractC813200VvC, boolean z) {
        if (this.LLJLIL.containsKey(abstractC813200VvC)) {
            return;
        }
        this.LLJLIL.put(abstractC813200VvC, Boolean.valueOf(z));
        getFragmentManager().LJZL(abstractC813200VvC, z);
    }

    @Override // com.bytedance.scene.Scene
    public final void dispatchCreateView(Bundle bundle, ViewGroup viewGroup) {
        super.dispatchCreateView(bundle, viewGroup);
        if (!((Boolean) this.LLJILJIL.getValue()).booleanValue() && C07RK.LIZ()) {
            LLLIILIL().LIZ.LLILZ.LJJIL(2);
        }
    }

    @Override // X.C198H
    public final Boolean onActivityKeyDown(int i, KeyEvent keyEvent) {
        String str = "onActivityKeyDown Start (" + this + ')';
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogE("SAFFragmentRootScene", str);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SAFFragmentRootScene");
        sbLIZ.append(": ");
        sbLIZ.append(str);
        System.out.println((Object) C2188811AlT.LIZIZ(sbLIZ));
        return LLLILZLLLI().onKeyDown(i, keyEvent);
    }

    @Override // X.C198H
    public final Boolean onActivityKeyLongPress(int i, KeyEvent keyEvent) {
        return LLLILZLLLI().onKeyLongPress(i, keyEvent);
    }

    @Override // X.C198H
    public final Boolean onActivityKeyUp(int i, KeyEvent keyEvent) {
        return LLLILZLLLI().onKeyUp(i, keyEvent);
    }

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[RootScene] onViewCreated() ");
        sbLIZ.append(hashCode());
        C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC20630715o9
    public final void oo(C2214291BlT c2214291BlT, Bundle bundle) {
        InterfaceC214902198i interfaceC214902198i = this.LLJJ;
        if (interfaceC214902198i != null) {
            interfaceC214902198i.uG(c2214291BlT);
        } else {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    @Override // X.C198H
    public final void setResult(int i, Intent intent) {
        C20630415o6.LIZIZ(this, i, intent);
    }

    @Override // com.bytedance.scene.Scene
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[RootScene] onCreateView(). ");
        sbLIZ.append(hashCode());
        C2188811AlT.LIZIZ(sbLIZ);
        if (((Boolean) this.LLJILJIL.getValue()).booleanValue()) {
            LLLIILIL().LIZ.LLILZ.LJJIL(2);
            return LLLILZ().requireView();
        }
        C21390118nL c21390118nL = new C21390118nL(layoutInflater.getContext());
        c21390118nL.setId(R.id.tyd);
        return c21390118nL;
    }

    @Override // X.C198H
    public final boolean onResult(int i, int i2, Intent intent) {
        InterfaceC214902198i interfaceC214902198i = this.LLJJ;
        if (interfaceC214902198i != null) {
            return interfaceC214902198i.onResult(i, i2, intent);
        }
        return false;
    }
}
