package com.bytedance.scene.navigation;

import X.AbstractC19509011Ui;
import X.AbstractC214793194d;
import X.AnonymousClass1994;
import X.C0V4F;
import X.C0V4G;
import X.C0V4I;
import X.C12WP;
import X.C13X1;
import X.C13X2;
import X.C1447800nmM;
import X.C14K0;
import X.C1602160rnK;
import X.C1710130ubT;
import X.C195Z;
import X.C19A5;
import X.C19A6;
import X.C19AC;
import X.C19AF;
import X.C19AH;
import X.C19AL;
import X.C19BK;
import X.C19BL;
import X.C19BM;
import X.C19BR;
import X.C20689115xZ;
import X.C21392618nk;
import X.C214798194i;
import X.C214826195k;
import X.C214928199i;
import X.C214936199q;
import X.C21494919Ad;
import X.C21495119Af;
import X.C21496519At;
import X.C21497719Bf;
import X.C21498319Bl;
import X.C21524919Lr;
import X.C2188811AlT;
import X.C2350509Ix;
import X.C569760MWg;
import X.C603820NmG;
import X.C786410Ut5;
import X.C801600VcU;
import X.EnumC214943199x;
import X.EnumC569750MWf;
import X.InterfaceC1447890nmV;
import X.InterfaceC1737690vJv;
import X.InterfaceC214796194g;
import X.InterfaceC214877197j;
import X.InterfaceC214930199k;
import X.InterfaceC214942199w;
import X.InterfaceC21495019Ae;
import X.InterfaceC21497419Bc;
import X.InterfaceC21499119Bt;
import X.InterfaceC21499219Bu;
import Y.ARunnableS101S0200000_32;
import Y.ARunnableS93S0000000_16;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.Scene;
import com.bytedance.scene.navigation.NavigationScene;
import com.bytedance.scene.navigation.Record;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes33.dex */
public final class NavigationScene extends Scene implements InterfaceC214930199k, C19BK, InterfaceC21499119Bt {
    public InterfaceC214877197j LLJIJIL;
    public C214936199q LLJILJIL;
    public C19A6 LLJILJILJ;
    public FrameLayout LLJILLL;
    public C1710130ubT LLJJ;
    public C21498319Bl LLJJI;
    public FrameLayout LLJJIII;
    public boolean LLJJIJI;
    public C0V4G LLJLIL;
    public boolean LLJI = true;
    public final BPEAHandler LLJJIJIIJIL = new BPEAHandler(Looper.getMainLooper());
    public AbstractC214793194d LLJJIJIL = null;
    public boolean LLJJJ = false;
    public final List<InterfaceC21497419Bc> LLJJJIL = new ArrayList();
    public final C603820NmG<Class<? extends Scene>, AbstractC19509011Ui> LLJJJJ = new C603820NmG<>(3);
    public C21497719Bf LLJJJJJIL = null;
    public InterfaceC21495019Ae LLJJJJLIIL = null;
    public final List<InterfaceC214930199k> LLJJL = new ArrayList();
    public final List<C801600VcU<C19AH, Boolean>> LLJJLIIIJLLLLLLLZ = new ArrayList();
    public final List<InterfaceC1447890nmV> LLJL = new ArrayList();
    public final C19A5 LLJLILLLLZIIL = new Runnable() { // from class: X.19A5
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public final void LIZ() {
            NavigationScene navigationScene = this.LL;
            navigationScene.getClass();
            C12WP.LIZ();
            C19A6 c19a6 = navigationScene.LLJILJILJ;
            if (c19a6.LJIIIZ) {
                if (c19a6.LJIJ) {
                    C21494919Ad.LIZIZ.LIZIZ("NavigationSceneManager", "recycleInvisibleScenes skip because of mSuppressRecycle true");
                    return;
                }
                if (!c19a6.LJIIJ) {
                    C21494919Ad.LIZIZ.LIZIZ("NavigationSceneManager", "recycleInvisibleScenes skip because of mAnySceneStateChanged false");
                    return;
                }
                if (!((HashSet) c19a6.LJIJJLI).isEmpty() || !c19a6.LJFF.isEmpty() || c19a6.LJJIJLIJ().LIZIZ.size() > 0) {
                    C21494919Ad.LIZIZ.LIZIZ("NavigationSceneManager", "recycleInvisibleScenes skip because of navigation operation is in progress");
                    return;
                }
                c19a6.LJIIJ = false;
                C21494919Ad.LIZIZ.LIZIZ("NavigationSceneManager", "recycleInvisibleScenes start");
                List<Record> listLIZJ = c19a6.LIZIZ.LIZJ();
                int size = ((ArrayList) listLIZJ).size() - 1;
                int i = size;
                while (true) {
                    if (i < 0) {
                        i = size;
                        break;
                    } else if (!((Record) ListProtector.get(listLIZJ, i)).mIsTranslucent) {
                        break;
                    } else {
                        i--;
                    }
                }
                int i2 = i - 1;
                if (!c19a6.LJIILL) {
                    size = i2;
                }
                while (size >= 0) {
                    Record record = (Record) ListProtector.get(listLIZJ, size);
                    Scene scene = record.mScene;
                    if (c19a6.LJIILL && (scene instanceof InterfaceC20630815oA) && ((InterfaceC20630815oA) scene).LJJJ()) {
                        C21494919Ad c21494919Ad = C21494919Ad.LIZIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("recycle scene skip ");
                        sbLIZ.append(scene.toString());
                        sbLIZ.append(" because it followActivityLifecycle");
                        c21494919Ad.LIZIZ("NavigationSceneManager", C2188811AlT.LIZIZ(sbLIZ));
                    } else {
                        EnumC214943199x enumC214943199x = scene.mState;
                        if ((enumC214943199x == EnumC214943199x.ACTIVITY_CREATED || enumC214943199x == EnumC214943199x.VIEW_CREATED) && scene.mSceneRestoreEnabled) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("bd-scene:scene_save_instance_state_reason", 2);
                            scene.dispatchSaveInstanceState(bundle);
                            record.mPreviousSavedState = bundle;
                            c19a6.LJIJJ(c19a6.LIZ, scene, EnumC214943199x.NONE, null, false, null);
                            Scene sceneLIZ = C19AC.LIZ(c19a6.LIZ.requireActivity(), size, record, c19a6.LIZ.LLJIJIL);
                            record.mScene = sceneLIZ;
                            C21494919Ad c21494919Ad2 = C21494919Ad.LIZIZ;
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("recycle scene ");
                            sbLIZ2.append(scene);
                            sbLIZ2.append(" from state ");
                            sbLIZ2.append(enumC214943199x.getName());
                            sbLIZ2.append(" completed, replace it to ");
                            sbLIZ2.append(sceneLIZ.toString());
                            c21494919Ad2.LIZIZ("NavigationSceneManager", C2188811AlT.LIZIZ(sbLIZ2));
                        } else {
                            C21494919Ad c21494919Ad3 = C21494919Ad.LIZIZ;
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("recycle scene skip ");
                            sbLIZ3.append(scene.toString());
                            sbLIZ3.append(" because it is visible or disable restore");
                            c21494919Ad3.LIZIZ("NavigationSceneManager", C2188811AlT.LIZIZ(sbLIZ3));
                        }
                    }
                    size--;
                }
                C21494919Ad.LIZIZ.LIZIZ("NavigationSceneManager", "recycleInvisibleScenes finish");
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean zLIZ;
            C1C7U.LIZ("NavigationScene@8733.<field>$2");
            try {
                LIZ();
            } finally {
                if (!zLIZ) {
                }
            }
            C1C7U.LIZIZ("NavigationScene@8733.<field>$2");
        }
    };
    public boolean LLJLL = false;
    public boolean LLJLLIL = false;
    public C19AF LLJLLL = null;
    public boolean LLJZ = true;
    public boolean LLJZIJLIL = false;
    public int LLL = 0;
    public boolean LLLF = false;
    public final C19BR LLLFF = new C19BR(this);

    @Override // X.C19BK
    public final void disableSupportRestore() {
        this.LLJI = false;
    }

    @Override // X.C19BK
    public final boolean isSupportChildReplaceParentScene() {
        return false;
    }

    public final boolean onBackPressed() {
        return LLLLLJIL(null);
    }

    @Override // com.bytedance.scene.Scene
    public final LayoutInflater LLJJJJJIL() {
        return this.LLJILJIL.LJII ? requireActivity().getLayoutInflater() : super.LLJJJJJIL();
    }

    public final ViewGroup LLLLII() {
        if (this.LLJJ == null) {
            if (!this.LLJILJIL.LJIIIIZZ) {
                throw new IllegalStateException("Animation Container is null");
            }
            FrameLayout frameLayout = (FrameLayout) this.mView;
            Context contextRequireSceneContext = requireSceneContext();
            C214936199q c214936199q = this.LLJILJIL;
            this.LLJJ = LLLII(frameLayout, contextRequireSceneContext, c214936199q.LJIIIZ || c214936199q.LJIIL, c214936199q.LJIILJJIL);
        }
        return this.LLJJ;
    }

    public final Scene LLLLIIIILLL() {
        C19A6 c19a6 = this.LLJILJILJ;
        if (c19a6 == null) {
            return null;
        }
        return c19a6.LJJIIZ();
    }

    public final AbstractC214793194d LLLLIILL() {
        if (this.LLJJIJIL == null && !this.LLJJJ) {
            this.LLJJIJIL = new C21392618nk();
        }
        return this.LLJJIJIL;
    }

    public final C214936199q LLLLIL() {
        C214936199q c214936199q = this.LLJILJIL;
        if (c214936199q != null) {
            return c214936199q;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NavigationSceneOptions is null, current NavigationScene state ");
        sbLIZ.append(this.mState.getName());
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.19AF] */
    public final void LLLLJ() {
        View view;
        if (!this.LLJILJIL.LJIIJ || this.LLJLLIL || (view = this.mView) == null) {
            return;
        }
        this.LLJLLIL = true;
        this.LLJLLL = new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: X.19AF
            @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
            public final void onWindowFocusChanged(boolean z) {
                C19A6 c19a6 = this.LL.LLJILJILJ;
                if (c19a6.LIZ.LLJILJIL.LJIIJ) {
                    C21494919Ad c21494919Ad = C21494919Ad.LIZIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onWindowFocusChanged ");
                    sbLIZ.append(z);
                    c21494919Ad.LIZIZ("NavigationSceneManager", C2188811AlT.LIZIZ(sbLIZ));
                    if (c19a6.LJJIJLIJ().LIZIZ.size() > 0) {
                        c21494919Ad.LIZIZ("NavigationSceneManager", "sync window focus by SceneMessageQueue");
                        C19AE c19ae = c19a6.LJIILJJIL;
                        if (c19ae == null) {
                            C19AE c19ae2 = new C19AE(c19a6, z);
                            c19a6.LJIILJJIL = c19ae2;
                            c19a6.LJJIJLIJ().LIZIZ(c19ae2);
                            return;
                        } else {
                            ((ArrayDeque) c19ae.LL).add(Boolean.valueOf(z));
                            return;
                        }
                    }
                    c19a6.LJJIII(z);
                }
            }
        };
        view.getViewTreeObserver().addOnWindowFocusChangeListener(this.LLJLLL);
    }

    public final boolean LLLLJI() {
        C214936199q c214936199q = this.LLJILJIL;
        if (c214936199q == null) {
            return false;
        }
        float f = c214936199q.LJI;
        return c214936199q.LJIIZILJ || (f > 0.0f && f < 1.0f);
    }

    public final C21497719Bf LLLLLILLIL() {
        if (this.mState == EnumC214943199x.NONE) {
            return null;
        }
        if (this.LLJJJJJIL == null) {
            this.LLJJJJJIL = new C21497719Bf(this.LLJILJILJ, this.LLJJJJLIIL);
        }
        return this.LLJJJJJIL;
    }

    @Override // com.bytedance.scene.Scene
    public final void dispatchDestroy() {
        LLLIZZ(EnumC214943199x.NONE, null, true, true);
        super.dispatchDestroy();
    }

    @Override // com.bytedance.scene.Scene
    public final void dispatchDestroyView() {
        LLLIZZ(EnumC214943199x.CREATED, EnumC214943199x.NONE, true, true);
        super.dispatchDestroyView();
    }

    @Override // com.bytedance.scene.Scene
    public final void dispatchPause() {
        LLLJ(EnumC214943199x.STARTED);
        super.dispatchPause();
    }

    @Override // com.bytedance.scene.Scene
    public final void dispatchStop() {
        LLLJ(EnumC214943199x.ACTIVITY_CREATED);
        super.dispatchStop();
    }

    @Override // X.C19BK
    public final List<Scene> getSceneList() {
        return this.LLJILJILJ.LJJIIZI();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.13X3] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.bytedance.scene.Scene
    public final void onDestroyView() {
        C0V4G c0v4g = this.LLJLIL;
        if (c0v4g != null) {
            C0V4F c0v4f = c0v4g.LIZJ;
            ArrayList<Runnable> arrayList = C0V4I.LIZIZ;
            synchronized (arrayList) {
                try {
                    arrayList.remove(c0v4f);
                    if (arrayList.isEmpty()) {
                        C0V4I.LIZ = null;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            this.LLJJIJIIJIL.removeCallbacks(this.LLJLILLLLZIIL);
        }
        this.LLJJIII = null;
        this.LLJJIJI = false;
        C21497719Bf c21497719Bf = this.LLJJJJJIL;
        if (c21497719Bf != null) {
            c21497719Bf.LIZ.LJIILL(c21497719Bf.LIZIZ.LIZ(new C13X2() { // from class: X.13X3
                @Override // X.C13X2
                public final boolean LIZ(InterfaceC214942199w interfaceC214942199w) {
                    return true;
                }
            }));
            c21497719Bf.LIZIZ.clear();
            this.LLJJJJJIL = null;
        }
        this.LLJJJJLIIL = null;
        super.onDestroyView();
    }

    @Override // com.bytedance.scene.Scene
    public final Context onGetSceneContext() {
        return this.LLJILJIL.LJII ? requireActivity() : super.onGetSceneContext();
    }

    public final void LLLJL() {
        C12WP.LIZ();
        C19A6 c19a6 = this.LLJILJILJ;
        c19a6.getClass();
        C21494919Ad c21494919Ad = C21494919Ad.LIZIZ;
        c21494919Ad.LIZIZ("NavigationSceneManager", "forceExecutePendingNavigationOperation start");
        c19a6.LJJIJLIJ().LIZLLL(new ARunnableS93S0000000_16(0));
        c21494919Ad.LIZIZ("NavigationSceneManager", "forceExecutePendingNavigationOperation finish");
    }

    public final void LLLLLL() {
        C12WP.LIZ();
        if (C19BL.LJ(this.mActivity)) {
            LLLLILI(false);
            C19A6 c19a6 = this.LLJILJILJ;
            c19a6.getClass();
            C21494919Ad.LIZIZ.LIZIZ("NavigationSceneManager", "pop");
            c19a6.LJJJ(new C21495119Af(c19a6, null), false, false);
        }
    }

    @Override // com.bytedance.scene.Scene
    public final void dispatchResume() {
        super.dispatchResume();
        LLLJ(EnumC214943199x.RESUMED);
    }

    @Override // com.bytedance.scene.Scene
    public final void dispatchStart() {
        super.dispatchStart();
        LLLJ(EnumC214943199x.STARTED);
    }

    @Override // com.bytedance.scene.Scene
    public final void onStop() {
        super.onStop();
        this.LLJILJILJ.LJIIJ();
    }

    public static void LLLLLLL() {
    }

    @Override // com.bytedance.scene.Scene
    public final boolean LLJJJ() {
        return this.LLJZ;
    }

    @Override // com.bytedance.scene.Scene
    public final boolean LLJJJJ() {
        return this.LLJJIJI;
    }

    @Override // X.C19BK
    public final boolean isSupportRestore() {
        return this.LLJI;
    }

    @Override // com.bytedance.scene.Scene
    public final void onAttach() {
        super.onAttach();
    }

    @Override // X.InterfaceC21499119Bt
    public final String LIZLLL(String str) {
        return this.LLJILJILJ.LIZLLL(str);
    }

    @Override // X.InterfaceC21499119Bt
    public final void LJIIL(String str) {
        this.LLJILJILJ.LJIIL(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LLLIL(Scene scene) {
        C21497719Bf c21497719BfLLLLLILLIL;
        if (scene == 0) {
            return;
        }
        if (scene instanceof AbstractC19509011Ui) {
            this.LLJJJJ.LIZLLL(AbstractC19509011Ui.class, scene);
        }
        if (scene instanceof InterfaceC214942199w) {
            InterfaceC214942199w interfaceC214942199w = (InterfaceC214942199w) scene;
            if (interfaceC214942199w.W1() && (c21497719BfLLLLLILLIL = LLLLLILLIL()) != null && c21497719BfLLLLLILLIL.LIZIZ.LIZIZ(interfaceC214942199w)) {
                interfaceC214942199w.onRelease();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.19BB] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLILZLLLI(boolean r7) {
        /*
            r6 = this;
            X.199q r0 = r6.LLJILJIL
            java.lang.String r4 = r0.LIZ
            android.os.Bundle r2 = r0.LIZIZ
            X.197j r0 = r6.LLJIJIL
            r5 = 0
            if (r0 == 0) goto L27
            android.app.Activity r0 = r6.requireActivity()
            java.lang.ClassLoader r1 = r0.getClassLoader()
            X.197j r0 = r6.LLJIJIL
            com.bytedance.scene.Scene r3 = r0.LIZ(r1, r4, r2)
            if (r3 == 0) goto L27
            com.bytedance.scene.Scene r0 = r3.mParentScene
            if (r0 == 0) goto L2f
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "SceneComponentFactory instantiateScene return Scene already has a parent"
            r1.<init>(r0)
            throw r1
        L27:
            android.app.Activity r0 = r6.requireActivity()
            com.bytedance.scene.Scene r3 = X.C2350509Ix.LIZIZ(r0, r4, r2)
        L2f:
            if (r7 == 0) goto L80
            X.19A6 r4 = r6.LLJILJILJ
            r4.getClass()
            if (r3 == 0) goto L78
            X.19Ad r2 = X.C21494919Ad.LIZIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "pushRoot "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "NavigationSceneManager"
            r2.LIZIZ(r0, r1)
            boolean r0 = r4.LJIIL
            if (r0 == 0) goto L66
            X.19At r0 = r4.LJIIJJI
            if (r0 != 0) goto L66
            java.lang.String r0 = "NavigationManager execute push root operation immediately"
            java.lang.String r1 = r4.LIZLLL(r0)
            boolean r0 = r3 instanceof X.InterfaceC523020KfE
            r4.LJJIJIIJIL(r3, r0, r5)
            r4.LJIIL(r1)
            return
        L66:
            X.19BB r0 = new X.19BB
            r0.<init>(r3)
            X.19AS r1 = new X.19AS
            r1.<init>()
            X.19At r0 = r4.LJJIJLIJ()
            r0.LIZLLL(r1)
            return
        L78:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r0 = "rootScene can't be null"
            r1.<init>(r0)
            throw r1
        L80:
            X.19A6 r2 = r6.LLJILJILJ
            X.0MWg r1 = new X.0MWg
            r1.<init>()
            r0 = 0
            r1.LJ = r0
            X.19AL r0 = r1.LIZ()
            r2.LJJIJIIJI(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.scene.navigation.NavigationScene.LLLILZLLLI(boolean):void");
    }

    public final void LLLJ(EnumC214943199x enumC214943199x) {
        if (this.mState.value >= EnumC214943199x.VIEW_CREATED.value) {
            C19A6 c19a6 = this.LLJILJILJ;
            if (c19a6.LJIIL && c19a6.LJIIJJI == null) {
                String strLIZLLL = c19a6.LIZLLL("NavigationManager dispatchCurrentChildState");
                c19a6.LJJJIL(enumC214943199x, null);
                c19a6.LJIIL(strLIZLLL);
                c19a6.LJIIJ = true;
                return;
            }
            c19a6.LJJIJLIJ().LIZLLL(new ARunnableS101S0200000_32(enumC214943199x, c19a6, 11));
            return;
        }
        throw new IllegalArgumentException("dispatchCurrentChildState can only call when state is VIEW_CREATED, ACTIVITY_CREATED, STARTED, RESUMED");
    }

    public final void LLLLILI(boolean z) {
        boolean z2;
        View rootView;
        WindowInsets rootWindowInsets;
        Scene sceneLJJIIZ = this.LLJILJILJ.LJJIIZ();
        if (sceneLJJIIZ != null) {
            View view = sceneLJJIIZ.mView;
            if (!z && !C214928199i.LIZLLL) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (view != null) {
                if (Build.VERSION.SDK_INT >= 30 && z2 && (rootView = view.getRootView()) != null && (rootWindowInsets = rootView.getRootWindowInsets()) != null && !rootWindowInsets.isVisible(WindowInsets.Type.ime())) {
                    return;
                }
                ((InputMethodManager) C786410Ut5.H2(view.getContext(), "input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean LLLLL(Scene scene) {
        C21497719Bf c21497719BfLLLLLILLIL;
        if (!(scene instanceof InterfaceC214942199w)) {
            return false;
        }
        InterfaceC214942199w interfaceC214942199w = (InterfaceC214942199w) scene;
        if (!interfaceC214942199w.W1() || (c21497719BfLLLLLILLIL = LLLLLILLIL()) == null || c21497719BfLLLLLILLIL.LIZIZ.LIZLLL(interfaceC214942199w) != C13X1.REUSED) {
            return false;
        }
        return true;
    }

    public final boolean LLLLLIL(Scene scene) {
        Record recordLIZLLL = this.LLJILJILJ.LIZIZ.LIZLLL(scene);
        if (recordLIZLLL != null) {
            return recordLIZLLL.mIsTranslucent;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Scene(");
        sbLIZ.append(scene);
        sbLIZ.append(") not found");
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final boolean LLLLLJIL(C19BM c19bm) {
        C12WP.LIZ();
        if (!C19BL.LJ(this.mActivity)) {
            return false;
        }
        C19A6 c19a6 = this.LLJILJILJ;
        c19a6.getClass();
        ArrayList arrayList = new ArrayList(c19a6.LJIIIIZZ);
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C801600VcU c801600VcU = (C801600VcU) ListProtector.get(arrayList, size);
            if (((LifecycleOwner) c801600VcU.LIZ).getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.RESUMED) && ((InterfaceC1737690vJv) c801600VcU.LIZIZ).onBackPressed()) {
                return true;
            }
        }
        if (((ArrayList) this.LLJILJILJ.LIZIZ.LIZ).size() <= 1) {
            return false;
        }
        if (c19bm != null) {
            LLLLLLIL(c19bm);
            return true;
        }
        LLLLLL();
        return true;
    }

    public final void LLLLLLIL(final C19BM c19bm) {
        C12WP.LIZ();
        if (!C19BL.LJ(this.mActivity)) {
            return;
        }
        LLLLILI(false);
        final C19A6 c19a6 = this.LLJILJILJ;
        c19a6.getClass();
        C21494919Ad.LIZIZ.LIZIZ("NavigationSceneManager", "pop with PopOptions");
        if (c19bm.LIZIZ) {
            final C21496519At c21496519AtLJJIJLIJ = c19a6.LJJIJLIJ();
            c19a6.LJJJ(new InterfaceC21499219Bu(c19a6, c21496519AtLJJIJLIJ, c19bm) { // from class: X.19B8
                public final InterfaceC21496319Ar LIZ;
                public final C21496519At LIZIZ;
                public final C19BM LIZJ;

                @Override // X.InterfaceC21499219Bu
                public final void execute(Runnable runnable) {
                    C21494919Ad.LIZIZ.LIZIZ("CoordinatePopOptionOperation", "invoke execute operation");
                    this.LIZ.LJIJ();
                    this.LIZJ.getClass();
                    final InterfaceC21496319Ar interfaceC21496319Ar = this.LIZ;
                    final C21496519At c21496519At = this.LIZIZ;
                    final C19BM c19bm2 = this.LIZJ;
                    final AbstractC214793194d abstractC214793194d = c19bm2.LIZ;
                    new InterfaceC21499219Bu(interfaceC21496319Ar, c21496519At, abstractC214793194d, c19bm2) { // from class: X.19B9
                        public final InterfaceC21496319Ar LIZ;
                        public final C21496519At LIZIZ;
                        public final AbstractC214793194d LIZJ;
                        public final C19BM LIZLLL;

                        @Override // X.InterfaceC21499219Bu
                        public final void execute(Runnable runnable2) {
                            C21494919Ad.LIZIZ.LIZIZ("CoordinatePopOperation", "invoke execute operation");
                            new C21496419As(this.LIZ, this.LIZIZ, this.LIZJ, 1, this.LIZLLL).execute(runnable2);
                        }

                        {
                            this.LIZ = interfaceC21496319Ar;
                            this.LIZIZ = c21496519At;
                            this.LIZLLL = c19bm2;
                            this.LIZJ = abstractC214793194d;
                        }
                    }.execute(runnable);
                }

                {
                    this.LIZ = c19a6;
                    this.LIZIZ = c21496519AtLJJIJLIJ;
                    this.LIZJ = c19bm;
                }
            }, c19bm.LIZJ, false);
        } else {
            c19a6.LJJJ(new InterfaceC21499219Bu(c19bm) { // from class: X.19Ab
                public final C19BM LIZ;

                @Override // X.InterfaceC21499219Bu
                public final void execute(Runnable runnable) {
                    this.LIZIZ.LIZIZ.LIZJ();
                    this.LIZ.getClass();
                    new C21495119Af(this.LIZIZ, this.LIZ.LIZ).execute(runnable);
                }

                {
                    this.LIZ = c19bm;
                }
            }, false, false);
        }
    }

    public final void LLLLLLLZIL(InterfaceC1737690vJv interfaceC1737690vJv) {
        C12WP.LIZ();
        this.LLJILJILJ.LJJIJL(interfaceC1737690vJv);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.19Bl, android.view.View] */
    public final void LLLLLLZ(boolean z) {
        if (this.LLJJI == null && z && this.LLJILJIL.LJIILL) {
            final Context contextRequireSceneContext = requireSceneContext();
            ?? r3 = new View(contextRequireSceneContext) { // from class: X.19Bl
                @Override // android.view.View
                public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
                    return true;
                }
            };
            this.LLJJI = r3;
            this.LLJILLL.addView((View) r3, new FrameLayout.LayoutParams(-1, -1));
        }
        C21498319Bl c21498319Bl = this.LLJJI;
        if (c21498319Bl != null) {
            if (z) {
                int visibility = c21498319Bl.getVisibility();
                c21498319Bl.setVisibility(0);
                C1602160rnK.LIZIZ(visibility, 0, c21498319Bl);
                C195Z.LIZJ(this.LLJJI);
            } else {
                int visibility2 = c21498319Bl.getVisibility();
                c21498319Bl.setVisibility(8);
                C1602160rnK.LIZIZ(visibility2, 8, c21498319Bl);
                C195Z.LJI(this.LLJJI);
            }
        }
        if (this.LLJILJIL.LJIIL) {
            C21494919Ad c21494919Ad = C21494919Ad.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("optimizedViewLayer don't support requestDisableTouchEvent disable: ");
            sbLIZ.append(z);
            c21494919Ad.LIZJ("NavigationScene", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        ((C20689115xZ) this.mView).setTouchEnabled(!z);
    }

    @Override // com.bytedance.scene.Scene
    public final void dispatchActivityCreated(Bundle bundle) {
        super.dispatchActivityCreated(bundle);
        if (this.LLJLL) {
            if (bundle != null && this.LLJI) {
                this.LLJILJILJ.LJJIL(bundle, EnumC214943199x.ACTIVITY_CREATED, true);
            } else {
                LLLIZZ(EnumC214943199x.ACTIVITY_CREATED, null, false, true);
            }
        }
        this.LLJILJILJ.LJJIIJ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.scene.Scene
    public final void dispatchAttachScene(Scene scene) {
        super.dispatchAttachScene(scene);
        if (scene != 0) {
            if (scene instanceof C19BK) {
                if (!((C19BK) scene).isSupportRestore()) {
                    this.LLJI = false;
                }
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("unknown parent Scene type ");
                sbLIZ.append(scene.getClass());
                throw new C214826195k(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
    }

    @Override // com.bytedance.scene.Scene
    public final void dispatchCreate(Bundle bundle) {
        super.dispatchCreate(bundle);
        if (this.LLJLL) {
            if (bundle != null && this.LLJI) {
                this.LLJILJILJ.LJJIZ(requireActivity(), bundle, this.LLJIJIL, this.mState);
            } else {
                LLLILZLLLI(true);
            }
        }
    }

    @Override // X.C19BK
    public final String getSceneDebugInfo(Scene scene) {
        Scene scene2 = scene.mParentScene;
        String str = null;
        if (scene2 == null) {
            return null;
        }
        if (scene2 == this) {
            Lifecycle.State currentState = scene.getLifecycle().getCurrentState();
            if (currentState == Lifecycle.State.RESUMED) {
                str = "resumed";
            } else if (currentState == Lifecycle.State.STARTED) {
                str = "paused";
            } else if (currentState == Lifecycle.State.CREATED) {
                str = "stopped";
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("status: ");
            sbLIZ.append(str);
            sbLIZ.append(" ");
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Scene(");
        sbLIZ2.append(scene);
        sbLIZ2.append(") parent is incorrect");
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
    }

    @Override // com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        NavigationScene navigationSceneLIZ;
        super.onActivityCreated(bundle);
        if (!this.LLJLL) {
            if (bundle != null && this.LLJI) {
                this.LLJILJILJ.LJJIZ(requireActivity(), bundle, this.LLJIJIL, EnumC214943199x.ACTIVITY_CREATED);
            } else {
                LLLILZLLLI(false);
            }
        }
        if (this.mParentScene != null && (navigationSceneLIZ = C1447800nmM.LIZ(this)) != null) {
            navigationSceneLIZ.LLLIILIL(this, new C21524919Lr(this, 0));
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        final C19A6 c19a6 = this.LLJILJILJ;
        c19a6.getClass();
        C21494919Ad c21494919Ad = C21494919Ad.LIZIZ;
        c21494919Ad.LIZIZ("NavigationSceneManager", "Activity dispatch onConfigurationChanged start");
        c19a6.LJJIIJ();
        c19a6.LJIILIIL = new Configuration(configuration);
        Record recordLIZIZ = c19a6.LIZIZ.LIZIZ();
        AnonymousClass1994.LIZ(recordLIZIZ, recordLIZIZ.mScene, configuration, c19a6.LJIILLIIL, new InterfaceC214796194g<Scene>() { // from class: X.19BD
            @Override // X.InterfaceC214796194g
            public final void LIZ(Scene scene) {
                c19a6.LJJIJIL(scene, 3);
            }
        });
        c21494919Ad.LIZIZ("NavigationSceneManager", "Activity dispatch onConfigurationChanged finish");
    }

    @Override // com.bytedance.scene.Scene
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            String string = bundle2.getString("extra_rootScene");
            if (string != null) {
                C214936199q c214936199q = new C214936199q(string, bundle2.getBundle("extra_rootScene_arguments"));
                c214936199q.LIZJ = bundle2.getBoolean("extra_drawWindowBackground");
                c214936199q.LIZLLL = bundle2.getBoolean("extra_fixSceneBackground_enabled");
                c214936199q.LJ = bundle2.getInt("extra_sceneBackground");
                c214936199q.LJFF = bundle2.getBoolean("extra_onlyRestoreVisibleScene");
                c214936199q.LJI = bundle2.getFloat("extra_autoRecycleInvisibleScenesThreshold");
                c214936199q.LJII = bundle2.getBoolean("extra_useActivityContextAndLayoutInflater", false);
                c214936199q.LJIIIIZZ = bundle2.getBoolean("extra_lazyLoadNavigationSceneUnnecessaryView", false);
                c214936199q.LJIIIZ = bundle2.getBoolean("extra_mergeNavigationSceneView", false);
                c214936199q.LJIIJ = bundle2.getBoolean("extra_useWindowFocusChangedDispatch", false);
                c214936199q.LJIIJJI = bundle2.getBoolean("extra_reduceColdStartCallStack", false);
                c214936199q.LJIIL = bundle2.getBoolean("extra_optimizedViewLayer", false);
                c214936199q.LJIILIIL = bundle2.getBoolean("extra_reuseOutsideView", false);
                c214936199q.LJIILJJIL = bundle2.getBoolean("extra_onlyDispatchToTopSceneWindowInsets", false);
                c214936199q.LJIILL = bundle2.getBoolean("extra_useExtraViewToBlockGesture", false);
                c214936199q.LJIILLIIL = bundle2.getBoolean("extra_skipPopAnimationWhenTargetIsDestroyed", false);
                c214936199q.LJIIZILJ = bundle2.getBoolean("extra_fixOnResultTiming", false);
                this.LLJILJIL = c214936199q;
                this.LLJILJILJ = new C19A6(this);
                if (bundle != null && !bundle.getBoolean("bd-scene-navigation:support_restore", this.LLJI)) {
                    this.LLJI = false;
                }
                float f = this.LLJILJIL.LJI;
                if (f > 0.0f && f < 1.0f) {
                    C0V4G c0v4g = new C0V4G(f, new Runnable() { // from class: X.0uM6
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("NavigationScene@8733.onCreate$1");
                            try {
                                NavigationScene navigationScene = this.LL;
                                C786410Ut5.LJJZZIII(navigationScene.LLJJIJIIJIL, navigationScene.LLJLILLLLZIIL);
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("NavigationScene@8733.onCreate$1");
                        }
                    });
                    this.LLJLIL = c0v4g;
                    c0v4g.LIZ();
                    return;
                }
                return;
            }
            throw new IllegalStateException("root scene class name cant be null");
        }
        throw new IllegalArgumentException("NavigationScene need NavigationSceneOptions bundle");
    }

    @Override // com.bytedance.scene.Scene
    public final void onSaveInstanceState(Bundle bundle) {
        Bundle bundle2;
        super.onSaveInstanceState(bundle);
        if (!bundle.containsKey("bd-scene-navigation:support_restore")) {
            bundle.putBoolean("bd-scene-navigation:support_restore", this.LLJI);
            if (this.LLJI) {
                C19A6 c19a6 = this.LLJILJILJ;
                Record recordLIZJ = c19a6.LIZJ();
                if (recordLIZJ != null) {
                    recordLIZJ.LIZIZ();
                }
                int i = bundle.getInt("bd-scene:scene_save_instance_state_reason", 1);
                C19AC c19ac = c19a6.LIZIZ;
                c19ac.getClass();
                ArrayList arrayList = new ArrayList(c19ac.LIZ);
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                for (int i2 = 0; i2 <= arrayList.size() - 1; i2++) {
                    Record record = (Record) ListProtector.get(arrayList, i2);
                    if (record.mScene.mSceneRestoreEnabled) {
                        arrayList2.add(record);
                    }
                }
                C786410Ut5.LJJIL(bundle, "bd-scene-nav:record_stack", arrayList2);
                ArrayList arrayList3 = new ArrayList();
                for (Record record2 : (ArrayList) c19a6.LIZIZ.LIZJ()) {
                    Scene scene = record2.mScene;
                    if (c19a6.LJIIIZ && (bundle2 = record2.mPreviousSavedState) != null && scene.mState == EnumC214943199x.NONE) {
                        arrayList3.add(bundle2);
                    } else if (scene.mSceneRestoreEnabled) {
                        Bundle bundle3 = new Bundle();
                        bundle3.putInt("bd-scene:scene_save_instance_state_reason", i);
                        scene.dispatchSaveInstanceState(bundle3);
                        arrayList3.add(bundle3);
                    }
                }
                C786410Ut5.LJJIL(bundle, "bd-scene-nav:navigation_scene_manager", arrayList3);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("outState already contains key bd-scene-navigation:support_restore");
    }

    public final void remove(final Scene scene) {
        C12WP.LIZ();
        if (!C19BL.LJ(this.mActivity)) {
            return;
        }
        if (this.LLJILJILJ.LJJIIZ() == scene) {
            LLLLILI(false);
        }
        final C19A6 c19a6 = this.LLJILJILJ;
        c19a6.getClass();
        C21494919Ad c21494919Ad = C21494919Ad.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("remove ");
        sbLIZ.append(scene);
        c21494919Ad.LIZIZ("NavigationSceneManager", C2188811AlT.LIZIZ(sbLIZ));
        c19a6.LJJJ(new InterfaceC21499219Bu(scene) { // from class: X.19AJ
            public final Scene LIZ;

            @Override // X.InterfaceC21499219Bu
            public final void execute(Runnable runnable) {
                if (this.LIZIZ.LJJIIZ() == this.LIZ) {
                    new C21495119Af(this.LIZIZ, null).execute(runnable);
                    return;
                }
                List<Record> listLIZJ = this.LIZIZ.LIZIZ.LIZJ();
                int size = ((ArrayList) listLIZJ).size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    Record record = (Record) ListProtector.get(listLIZJ, size);
                    if (record.mScene == this.LIZ) {
                        if (size == r7.size() - 2) {
                            this.LIZIZ.LJIIJ();
                        }
                        Scene scene2 = this.LIZ;
                        EnumC214943199x enumC214943199x = scene2.mState;
                        C19A6 c19a62 = this.LIZIZ;
                        c19a62.LJIJJ(c19a62.LIZ, scene2, EnumC214943199x.NONE, null, false, null);
                        this.LIZIZ.LIZIZ.LJFF(record);
                        if (size > 0) {
                            Record record2 = (Record) ListProtector.get(listLIZJ, size - 1);
                            C19A6 c19a63 = this.LIZIZ;
                            if (c19a63.LJIIIZ) {
                                if (enumC214943199x == EnumC214943199x.STARTED || enumC214943199x == EnumC214943199x.RESUMED) {
                                    c19a63.LJIJJ(c19a63.LIZ, record2.mScene, enumC214943199x, record2.mPreviousSavedState, false, null);
                                    record2.mPreviousSavedState = null;
                                }
                            } else {
                                c19a63.LJIJJ(c19a63.LIZ, record2.mScene, enumC214943199x, null, false, null);
                            }
                        }
                    }
                }
                runnable.run();
            }

            {
                this.LIZ = scene;
            }
        }, false, false);
    }

    public final void unregisterChildSceneLifecycleCallbacks(C19AH c19ah) {
        C12WP.LIZ();
        int size = ((ArrayList) this.LLJJLIIIJLLLLLLLZ).size();
        for (int i = 0; i < size; i++) {
            if (((C801600VcU) ListProtector.get(this.LLJJLIIIJLLLLLLLZ, i)).LIZ == c19ah) {
                Object obj = ListProtector.get(this.LLJJLIIIJLLLLLLLZ, i);
                if (obj != null) {
                    ((ArrayList) this.LLJJLIIIJLLLLLLLZ).remove(obj);
                    return;
                }
                return;
            }
        }
    }

    public final void LLLIIIIL(final LifecycleOwner lifecycleOwner, final InterfaceC214930199k interfaceC214930199k) {
        C12WP.LIZ();
        if (lifecycleOwner.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
            return;
        }
        ((ArrayList) this.LLJJL).add(interfaceC214930199k);
        lifecycleOwner.getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.bytedance.scene.navigation.NavigationScene.2
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    lifecycleOwner.getLifecycle().removeObserver(this);
                    ((ArrayList) NavigationScene.this.LLJJL).remove(interfaceC214930199k);
                }
            }
        });
    }

    public final void LLLIILIL(final LifecycleOwner lifecycleOwner, final InterfaceC1737690vJv interfaceC1737690vJv) {
        C12WP.LIZ();
        if (lifecycleOwner.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
            return;
        }
        ((ArrayList) this.LLJILJILJ.LJIIIIZZ).add(new C801600VcU(lifecycleOwner, interfaceC1737690vJv));
        lifecycleOwner.getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.bytedance.scene.navigation.NavigationScene.3
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    lifecycleOwner.getLifecycle().removeObserver(this);
                    NavigationScene.this.LLJILJILJ.LJJIJL(interfaceC1737690vJv);
                }
            }
        });
    }

    public final void LLLILZ(final Scene scene, EnumC569750MWf enumC569750MWf) {
        final boolean z;
        C12WP.LIZ();
        if (this.LLJILJILJ.LIZIZ.LIZLLL(scene) != null) {
            final C19A6 c19a6 = this.LLJILJILJ;
            if (enumC569750MWf == EnumC569750MWf.TO_TRANSLUCENT) {
                z = true;
            } else {
                z = false;
            }
            c19a6.getClass();
            if (scene != null) {
                C21494919Ad c21494919Ad = C21494919Ad.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("changeTranslucent ");
                sbLIZ.append(scene.toString());
                c21494919Ad.LIZIZ("NavigationSceneManager", C2188811AlT.LIZIZ(sbLIZ));
                c19a6.LJJJ(new InterfaceC21499219Bu(scene, z) { // from class: X.19A9
                    public final Scene LIZ;
                    public final boolean LIZIZ;

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:50:0x00ce  */
                    /* JADX WARN: Type inference failed for: r11v0 */
                    /* JADX WARN: Type inference failed for: r11v1, types: [android.os.Bundle, java.lang.Runnable] */
                    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Runnable] */
                    /* JADX WARN: Type inference failed for: r11v3 */
                    /* JADX WARN: Type inference failed for: r11v4 */
                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                     */
                    @Override // X.InterfaceC21499219Bu
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void execute(java.lang.Runnable r13) {
                        /*
                            Method dump skipped, instruction units count: 256
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C19A9.execute(java.lang.Runnable):void");
                    }

                    {
                        this.LIZ = scene;
                        this.LIZIZ = z;
                    }
                }, false, false);
                return;
            }
            throw new NullPointerException("scene can't be null");
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Scene(");
        sbLIZ2.append(scene);
        sbLIZ2.append(") not found");
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
    }

    public final void LLLLLJLJLL(Scene scene, AbstractC214793194d abstractC214793194d) {
        Record recordLIZLLL;
        C12WP.LIZ();
        if (scene.getLifecycle().getCurrentState() != Lifecycle.State.DESTROYED && (recordLIZLLL = this.LLJILJILJ.LIZIZ.LIZLLL(scene)) != null) {
            recordLIZLLL.mNavigationAnimationExecutor = abstractC214793194d;
        }
    }

    public final void LLLLLLJ(final Class cls, final C214798194i c214798194i) {
        C12WP.LIZ();
        if (!C19BL.LJ(this.mActivity)) {
            return;
        }
        LLLLILI(false);
        final C19A6 c19a6 = this.LLJILJILJ;
        c19a6.getClass();
        C21494919Ad c21494919Ad = C21494919Ad.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("popTo ");
        sbLIZ.append(cls);
        c21494919Ad.LIZIZ("NavigationSceneManager", C2188811AlT.LIZIZ(sbLIZ));
        c19a6.LJJJ(new InterfaceC21499219Bu(cls, c214798194i) { // from class: X.19AI
            public final Class<? extends Scene> LIZ;
            public final AbstractC214793194d LIZIZ;

            @Override // X.InterfaceC21499219Bu
            public final void execute(Runnable runnable) {
                List<Record> listLIZJ = this.LIZJ.LIZIZ.LIZJ();
                int i = 0;
                for (int size = ((ArrayList) listLIZJ).size() - 1; size >= 0; size--) {
                    if (((Record) ListProtector.get(listLIZJ, size)).mScene.getClass() == this.LIZ) {
                        if (i == 0) {
                            runnable.run();
                            return;
                        } else {
                            new C19A7(this.LIZJ, this.LIZIZ, i, null).execute(runnable);
                            return;
                        }
                    }
                    i++;
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Cant find ");
                sbLIZ2.append(this.LIZ.getSimpleName());
                sbLIZ2.append(" in backStack");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
            }

            {
                this.LIZ = cls;
                this.LIZIZ = c214798194i;
            }
        }, false, false);
    }

    public final void LLLLLLLLLL(Scene scene, C19AL c19al) {
        Scene scene2;
        C12WP.LIZ();
        if (!C19BL.LJ(this.mActivity)) {
            return;
        }
        if (!LLLLL(scene) && (scene2 = scene.mParentScene) != null) {
            if (scene2 == this) {
                throw new IllegalArgumentException("Scene is already pushed");
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Scene already has a parent, parent ");
            sbLIZ.append(scene.mParentScene);
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
        if (this.LLJI && scene.mSceneRestoreEnabled && !C2350509Ix.LIZJ(scene)) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Scene ");
            sbLIZ2.append(scene.getClass().getName());
            sbLIZ2.append(" must be a public class or public static class, and have only one parameterless constructor to be properly recreated from instance state.");
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
        }
        if (c19al == null) {
            c19al = new C569760MWg().LIZ();
        }
        LLLLILI(c19al.LJIIIIZZ);
        this.LLJILJILJ.LJJIJIIJI(scene, c19al);
    }

    public final void LLLLLLZZ(Scene scene, Object obj) {
        C19A6 c19a6 = this.LLJILJILJ;
        Record recordLIZLLL = c19a6.LIZIZ.LIZLLL(scene);
        if (recordLIZLLL != null) {
            c19a6.LJIIJJI().LIZJ(recordLIZLLL, obj);
            return;
        }
        throw new IllegalArgumentException("Scene is not found in stack");
    }

    @Override // com.bytedance.scene.Scene
    public final void dispatchCreateView(Bundle bundle, ViewGroup viewGroup) {
        super.dispatchCreateView(bundle, viewGroup);
        if (this.LLJLL) {
            if (bundle != null && this.LLJI) {
                this.LLJILJILJ.LJJIL(bundle, EnumC214943199x.VIEW_CREATED, false);
            } else {
                LLLIZZ(EnumC214943199x.VIEW_CREATED, null, false, false);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.scene.Scene
    public final void dispatchOnPreSceneDestroyed(Scene scene, boolean z) {
        if (scene != this) {
            for (C801600VcU c801600VcU : new ArrayList(this.LLJJLIIIJLLLLLLLZ)) {
                if (z || ((Boolean) c801600VcU.LIZIZ).booleanValue()) {
                    ((C19AH) c801600VcU.LIZ).LJJJJIZL(scene);
                }
            }
        }
        super.dispatchOnPreSceneDestroyed(scene, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.scene.Scene
    public final void dispatchOnPreScenePaused(Scene scene, boolean z) {
        if (scene != this) {
            for (C801600VcU c801600VcU : new ArrayList(this.LLJJLIIIJLLLLLLLZ)) {
                if (z || ((Boolean) c801600VcU.LIZIZ).booleanValue()) {
                    ((C19AH) c801600VcU.LIZ).LJIILIIL(scene);
                }
            }
        }
        super.dispatchOnPreScenePaused(scene, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.scene.Scene
    public final void dispatchOnPreSceneResumed(Scene scene, boolean z) {
        if (scene != this) {
            for (C801600VcU c801600VcU : new ArrayList(this.LLJJLIIIJLLLLLLLZ)) {
                if (z || ((Boolean) c801600VcU.LIZIZ).booleanValue()) {
                    ((C19AH) c801600VcU.LIZ).LJIJJ(scene);
                }
            }
        }
        super.dispatchOnPreSceneResumed(scene, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.scene.Scene
    public final void dispatchOnPreSceneStarted(Scene scene, boolean z) {
        if (scene != this) {
            for (C801600VcU c801600VcU : new ArrayList(this.LLJJLIIIJLLLLLLLZ)) {
                if (z || ((Boolean) c801600VcU.LIZIZ).booleanValue()) {
                    ((C19AH) c801600VcU.LIZ).LJJ(scene);
                }
            }
        }
        super.dispatchOnPreSceneStarted(scene, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.scene.Scene
    public final void dispatchOnPreSceneStopped(Scene scene, boolean z) {
        if (scene != this) {
            for (C801600VcU c801600VcU : new ArrayList(this.LLJJLIIIJLLLLLLLZ)) {
                if (z || ((Boolean) c801600VcU.LIZIZ).booleanValue()) {
                    ((C19AH) c801600VcU.LIZ).LJJJJL(scene);
                }
            }
        }
        super.dispatchOnPreSceneStopped(scene, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.scene.Scene
    public final void dispatchOnPreSceneViewDestroyed(Scene scene, boolean z) {
        if (scene != this) {
            for (C801600VcU c801600VcU : new ArrayList(this.LLJJLIIIJLLLLLLLZ)) {
                if (z || ((Boolean) c801600VcU.LIZIZ).booleanValue()) {
                    ((C19AH) c801600VcU.LIZ).LJJJJ();
                }
            }
        }
        super.dispatchOnPreSceneViewDestroyed(scene, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.scene.Scene
    public final void dispatchOnSceneDestroyed(Scene scene, boolean z) {
        if (scene != this) {
            for (C801600VcU c801600VcU : new ArrayList(this.LLJJLIIIJLLLLLLLZ)) {
                if (z || ((Boolean) c801600VcU.LIZIZ).booleanValue()) {
                    ((C19AH) c801600VcU.LIZ).LJJJ(scene);
                }
            }
        }
        super.dispatchOnSceneDestroyed(scene, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.scene.Scene
    public final void dispatchOnScenePaused(Scene scene, boolean z) {
        if (scene != this) {
            for (C801600VcU c801600VcU : new ArrayList(this.LLJJLIIIJLLLLLLLZ)) {
                if (z || ((Boolean) c801600VcU.LIZIZ).booleanValue()) {
                    ((C19AH) c801600VcU.LIZ).LJJIFFI(scene);
                }
            }
        }
        super.dispatchOnScenePaused(scene, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.scene.Scene
    public final void dispatchOnSceneResumed(Scene scene, boolean z) {
        if (scene != this) {
            for (C801600VcU c801600VcU : new ArrayList(this.LLJJLIIIJLLLLLLLZ)) {
                if (z || ((Boolean) c801600VcU.LIZIZ).booleanValue()) {
                    ((C19AH) c801600VcU.LIZ).LIZ(scene);
                }
            }
        }
        super.dispatchOnSceneResumed(scene, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.scene.Scene
    public final void dispatchOnSceneStarted(Scene scene, boolean z) {
        if (scene != this) {
            for (C801600VcU c801600VcU : new ArrayList(this.LLJJLIIIJLLLLLLLZ)) {
                if (z || ((Boolean) c801600VcU.LIZIZ).booleanValue()) {
                    ((C19AH) c801600VcU.LIZ).LIZLLL(scene);
                }
            }
        }
        super.dispatchOnSceneStarted(scene, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.scene.Scene
    public final void dispatchOnSceneStopped(Scene scene, boolean z) {
        if (scene != this) {
            for (C801600VcU c801600VcU : new ArrayList(this.LLJJLIIIJLLLLLLLZ)) {
                if (z || ((Boolean) c801600VcU.LIZIZ).booleanValue()) {
                    ((C19AH) c801600VcU.LIZ).LJJIZ(scene);
                }
            }
        }
        super.dispatchOnSceneStopped(scene, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.scene.Scene
    public final void dispatchOnSceneViewDestroyed(Scene scene, boolean z) {
        if (scene != this) {
            for (C801600VcU c801600VcU : new ArrayList(this.LLJJLIIIJLLLLLLLZ)) {
                if (z || ((Boolean) c801600VcU.LIZIZ).booleanValue()) {
                    ((C19AH) c801600VcU.LIZ).LJJIII(scene);
                }
            }
        }
        super.dispatchOnSceneViewDestroyed(scene, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.scene.Scene
    public final void dispatchOnSuperSceneDestroyed(Scene scene, boolean z) {
        if (scene != this) {
            for (C801600VcU c801600VcU : new ArrayList(this.LLJJLIIIJLLLLLLLZ)) {
                if (z || ((Boolean) c801600VcU.LIZIZ).booleanValue()) {
                    ((C19AH) c801600VcU.LIZ).LJIIIZ(scene);
                }
            }
        }
        super.dispatchOnSuperSceneDestroyed(scene, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.scene.Scene
    public final void dispatchOnSuperScenePaused(Scene scene, boolean z) {
        if (scene != this) {
            for (C801600VcU c801600VcU : new ArrayList(this.LLJJLIIIJLLLLLLLZ)) {
                if (z || ((Boolean) c801600VcU.LIZIZ).booleanValue()) {
                    ((C19AH) c801600VcU.LIZ).LIZJ(scene);
                }
            }
        }
        super.dispatchOnSuperScenePaused(scene, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.scene.Scene
    public final void dispatchOnSuperSceneResumed(Scene scene, boolean z) {
        if (scene != this) {
            for (C801600VcU c801600VcU : new ArrayList(this.LLJJLIIIJLLLLLLLZ)) {
                if (z || ((Boolean) c801600VcU.LIZIZ).booleanValue()) {
                    ((C19AH) c801600VcU.LIZ).LJJIIJ(scene);
                }
            }
        }
        super.dispatchOnSuperSceneResumed(scene, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.scene.Scene
    public final void dispatchOnSuperSceneStarted(Scene scene, boolean z) {
        if (scene != this) {
            for (C801600VcU c801600VcU : new ArrayList(this.LLJJLIIIJLLLLLLLZ)) {
                if (z || ((Boolean) c801600VcU.LIZIZ).booleanValue()) {
                    ((C19AH) c801600VcU.LIZ).LJJIIZ(scene);
                }
            }
        }
        super.dispatchOnSuperSceneStarted(scene, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.scene.Scene
    public final void dispatchOnSuperSceneStopped(Scene scene, boolean z) {
        if (scene != this) {
            for (C801600VcU c801600VcU : new ArrayList(this.LLJJLIIIJLLLLLLLZ)) {
                if (z || ((Boolean) c801600VcU.LIZIZ).booleanValue()) {
                    ((C19AH) c801600VcU.LIZ).LJIIIIZZ(scene);
                }
            }
        }
        super.dispatchOnSuperSceneStopped(scene, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.scene.Scene
    public final void dispatchOnSuperSceneViewDestroyed(Scene scene, boolean z) {
        if (scene != this) {
            for (C801600VcU c801600VcU : new ArrayList(this.LLJJLIIIJLLLLLLLZ)) {
                if (z || ((Boolean) c801600VcU.LIZIZ).booleanValue()) {
                    ((C19AH) c801600VcU.LIZ).LJIIZILJ();
                }
            }
        }
        super.dispatchOnSuperSceneViewDestroyed(scene, z);
    }

    public final void registerChildSceneLifecycleCallbacks(C19AH c19ah, boolean z) {
        C12WP.LIZ();
        ((ArrayList) this.LLJJLIIIJLLLLLLLZ).add(new C801600VcU(c19ah, Boolean.valueOf(z)));
    }

    @Override // X.InterfaceC214930199k
    public final void LLJJI(Scene scene, Scene scene2, boolean z) {
        Iterator it2 = new ArrayList(this.LLJJL).iterator();
        while (it2.hasNext()) {
            ((InterfaceC214930199k) it2.next()).LLJJI(scene, scene2, z);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f A[PHI: r0
      0x002f: PHI (r0v8 com.bytedance.scene.Scene) = (r0v6 com.bytedance.scene.Scene), (r0v11 X.11Ui) binds: [B:15:0x002d, B:5:0x0010] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLLLLLLL(java.lang.Class<? extends com.bytedance.scene.Scene> r3, android.os.Bundle r4, X.C19AL r5) {
        /*
            r2 = this;
            java.lang.Class<X.11Ui> r0 = X.AbstractC19509011Ui.class
            boolean r0 = r0.isAssignableFrom(r3)
            if (r0 == 0) goto L12
            X.0NmG<java.lang.Class<? extends com.bytedance.scene.Scene>, X.11Ui> r0 = r2.LLJJJJ
            java.lang.Object r0 = r0.LIZJ(r3)
            com.bytedance.scene.Scene r0 = (com.bytedance.scene.Scene) r0
            if (r0 != 0) goto L2f
        L12:
            if (r5 == 0) goto L37
            boolean r0 = r5.LJIIJJI
            if (r0 == 0) goto L37
            X.19Bf r0 = r2.LLLLLILLIL()
            if (r0 == 0) goto L37
            X.13X2 r1 = r5.LJIIL
            if (r1 != 0) goto L27
            X.199I r1 = new X.199I
            r1.<init>(r3)
        L27:
            X.19Ae r0 = r0.LIZIZ
            com.bytedance.scene.Scene r0 = r0.LIZJ(r1)
            if (r0 == 0) goto L37
        L2f:
            if (r4 == 0) goto L33
            r0.mArguments = r4
        L33:
            r2.LLLLLLLLLL(r0, r5)
            return
        L37:
            com.bytedance.scene.Scene r0 = X.C2350509Ix.LIZ(r4, r3)
            goto L33
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.scene.navigation.NavigationScene.LLLLLLLLL(java.lang.Class, android.os.Bundle, X.19AL):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.scene.Scene
    public final void dispatchOnPreSceneActivityCreated(Scene scene, Bundle bundle, boolean z) {
        if (scene != this) {
            for (C801600VcU c801600VcU : new ArrayList(this.LLJJLIIIJLLLLLLLZ)) {
                if (z || ((Boolean) c801600VcU.LIZIZ).booleanValue()) {
                    ((C19AH) c801600VcU.LIZ).LJIILJJIL();
                }
            }
        }
        super.dispatchOnPreSceneActivityCreated(scene, bundle, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.scene.Scene
    public final void dispatchOnPreSceneCreated(Scene scene, Bundle bundle, boolean z) {
        if (scene != this) {
            for (C801600VcU c801600VcU : new ArrayList(this.LLJJLIIIJLLLLLLLZ)) {
                if (z || ((Boolean) c801600VcU.LIZIZ).booleanValue()) {
                    ((C19AH) c801600VcU.LIZ).LJJIJIIJIL(scene, bundle);
                }
            }
        }
        super.dispatchOnPreSceneCreated(scene, bundle, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.scene.Scene
    public final void dispatchOnPreSceneSaveInstanceState(Scene scene, Bundle bundle, boolean z) {
        if (scene != this) {
            for (C801600VcU c801600VcU : new ArrayList(this.LLJJLIIIJLLLLLLLZ)) {
                if (z || ((Boolean) c801600VcU.LIZIZ).booleanValue()) {
                    ((C19AH) c801600VcU.LIZ).LJIJJLI(scene, bundle);
                }
            }
        }
        super.dispatchOnPreSceneSaveInstanceState(scene, bundle, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.scene.Scene
    public final void dispatchOnPreSceneViewCreated(Scene scene, Bundle bundle, boolean z) {
        if (scene != this) {
            for (C801600VcU c801600VcU : new ArrayList(this.LLJJLIIIJLLLLLLLZ)) {
                if (z || ((Boolean) c801600VcU.LIZIZ).booleanValue()) {
                    ((C19AH) c801600VcU.LIZ).LJJJI();
                }
            }
        }
        super.dispatchOnPreSceneViewCreated(scene, bundle, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.scene.Scene
    public final void dispatchOnSceneActivityCreated(Scene scene, Bundle bundle, boolean z) {
        if (scene != this) {
            for (C801600VcU c801600VcU : new ArrayList(this.LLJJLIIIJLLLLLLLZ)) {
                if (z || ((Boolean) c801600VcU.LIZIZ).booleanValue()) {
                    ((C19AH) c801600VcU.LIZ).LJJIIZI(scene);
                }
            }
        }
        super.dispatchOnSceneActivityCreated(scene, bundle, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.scene.Scene
    public final void dispatchOnSceneCreated(Scene scene, Bundle bundle, boolean z) {
        if (scene != this) {
            for (C801600VcU c801600VcU : new ArrayList(this.LLJJLIIIJLLLLLLLZ)) {
                if (z || ((Boolean) c801600VcU.LIZIZ).booleanValue()) {
                    ((C19AH) c801600VcU.LIZ).LJJJJZ(scene, bundle);
                }
            }
        }
        super.dispatchOnSceneCreated(scene, bundle, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.scene.Scene
    public final void dispatchOnSceneSaveInstanceState(Scene scene, Bundle bundle, boolean z) {
        if (scene != this) {
            for (C801600VcU c801600VcU : new ArrayList(this.LLJJLIIIJLLLLLLLZ)) {
                if (z || ((Boolean) c801600VcU.LIZIZ).booleanValue()) {
                    ((C19AH) c801600VcU.LIZ).LJIIL(scene, bundle);
                }
            }
        }
        super.dispatchOnSceneSaveInstanceState(scene, bundle, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.scene.Scene
    public final void dispatchOnSceneViewCreated(Scene scene, Bundle bundle, boolean z) {
        if (scene != this) {
            for (C801600VcU c801600VcU : new ArrayList(this.LLJJLIIIJLLLLLLLZ)) {
                if (z || ((Boolean) c801600VcU.LIZIZ).booleanValue()) {
                    ((C19AH) c801600VcU.LIZ).LJJI(scene, bundle);
                }
            }
        }
        super.dispatchOnSceneViewCreated(scene, bundle, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.scene.Scene
    public final void dispatchOnSuperSceneActivityCreated(Scene scene, Bundle bundle, boolean z) {
        if (scene != this) {
            for (C801600VcU c801600VcU : new ArrayList(this.LLJJLIIIJLLLLLLLZ)) {
                if (z || ((Boolean) c801600VcU.LIZIZ).booleanValue()) {
                    ((C19AH) c801600VcU.LIZ).LJII();
                }
            }
        }
        super.dispatchOnSuperSceneActivityCreated(scene, bundle, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.scene.Scene
    public final void dispatchOnSuperSceneCreated(Scene scene, Bundle bundle, boolean z) {
        if (scene != this) {
            for (C801600VcU c801600VcU : new ArrayList(this.LLJJLIIIJLLLLLLLZ)) {
                if (z || ((Boolean) c801600VcU.LIZIZ).booleanValue()) {
                    ((C19AH) c801600VcU.LIZ).LJIIJJI(scene, bundle);
                }
            }
        }
        super.dispatchOnSuperSceneCreated(scene, bundle, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.scene.Scene
    public final void dispatchOnSuperSceneSaveInstanceState(Scene scene, Bundle bundle, boolean z) {
        if (scene != this) {
            for (C801600VcU c801600VcU : new ArrayList(this.LLJJLIIIJLLLLLLLZ)) {
                if (z || ((Boolean) c801600VcU.LIZIZ).booleanValue()) {
                    ((C19AH) c801600VcU.LIZ).LJJJLIIL(scene, bundle);
                }
            }
        }
        super.dispatchOnSuperSceneSaveInstanceState(scene, bundle, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.scene.Scene
    public final void dispatchOnSuperSceneViewCreated(Scene scene, Bundle bundle, boolean z) {
        if (scene != this) {
            for (C801600VcU c801600VcU : new ArrayList(this.LLJJLIIIJLLLLLLLZ)) {
                if (z || ((Boolean) c801600VcU.LIZIZ).booleanValue()) {
                    ((C19AH) c801600VcU.LIZ).LJJIJIIJI();
                }
            }
        }
        super.dispatchOnSuperSceneViewCreated(scene, bundle, z);
    }

    @Override // com.bytedance.scene.Scene
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C214936199q c214936199q = this.LLJILJIL;
        if (c214936199q.LJIILIIL) {
            FrameLayout frameLayout = this.LLJJIII;
            if (frameLayout != null) {
                frameLayout.setOnApplyWindowInsetsListener(new C14K0(c214936199q.LJIILJJIL));
                this.LLJILLL = frameLayout;
                if (!this.LLJILJIL.LJIIIIZZ) {
                    this.LLJJ = LLLII(frameLayout, requireSceneContext(), true, this.LLJILJIL.LJIILJJIL);
                }
                if (this.LLJILJIL.LIZJ) {
                    frameLayout.setBackground(C19BL.LIZLLL(requireSceneContext()));
                }
                return frameLayout;
            }
            throw new IllegalArgumentException("Please invoke setOutsideView at first");
        }
        if (c214936199q.LJIIL) {
            FrameLayout frameLayout2 = new FrameLayout(requireSceneContext());
            frameLayout2.setSaveFromParentEnabled(false);
            frameLayout2.setOnApplyWindowInsetsListener(new C14K0(this.LLJILJIL.LJIILJJIL));
            frameLayout2.setId(R.id.p3t);
            this.LLJILLL = frameLayout2;
            if (!this.LLJILJIL.LJIIIIZZ) {
                this.LLJJ = LLLII(frameLayout2, requireSceneContext(), true, this.LLJILJIL.LJIILJJIL);
            }
            if (this.LLJILJIL.LIZJ) {
                frameLayout2.setBackground(C19BL.LIZLLL(requireSceneContext()));
            }
            return frameLayout2;
        }
        C20689115xZ c20689115xZ = new C20689115xZ(requireSceneContext());
        c20689115xZ.setOnApplyWindowInsetsListener(new C14K0());
        c20689115xZ.setId(R.id.p3t);
        if (this.LLJILJIL.LJIIIZ) {
            this.LLJILLL = c20689115xZ;
            c20689115xZ.setChildrenDrawingOrderEnabled(true);
        } else {
            FrameLayout frameLayout3 = new FrameLayout(requireSceneContext());
            this.LLJILLL = frameLayout3;
            frameLayout3.setOnApplyWindowInsetsListener(new C14K0(this.LLJILJIL.LJIILJJIL));
            c20689115xZ.addView(this.LLJILLL, new FrameLayout.LayoutParams(-1, -1));
        }
        if (!this.LLJILJIL.LJIIIIZZ) {
            Context contextRequireSceneContext = requireSceneContext();
            C214936199q c214936199q2 = this.LLJILJIL;
            this.LLJJ = LLLII(c20689115xZ, contextRequireSceneContext, c214936199q2.LJIIIZ, c214936199q2.LJIILJJIL);
        }
        if (this.LLJILJIL.LIZJ) {
            c20689115xZ.setBackground(C19BL.LIZLLL(requireSceneContext()));
        }
        return c20689115xZ;
    }

    public static C1710130ubT LLLII(FrameLayout frameLayout, Context context, boolean z, boolean z2) {
        int i;
        C1710130ubT c1710130ubT = new C1710130ubT(context);
        if (z2) {
            c1710130ubT.setTag(R.id.p3s, Boolean.TRUE);
        }
        c1710130ubT.setOnApplyWindowInsetsListener(new C14K0());
        if (z) {
            i = 0;
        } else {
            i = -1;
        }
        frameLayout.addView(c1710130ubT, i, new FrameLayout.LayoutParams(-1, -1));
        return c1710130ubT;
    }

    public final void LLLIZZ(final EnumC214943199x enumC214943199x, final EnumC214943199x enumC214943199x2, final boolean z, final boolean z2) {
        final C19A6 c19a6 = this.LLJILJILJ;
        if (c19a6.LJIIL && c19a6.LJIIJJI == null) {
            String strLIZLLL = c19a6.LIZLLL("NavigationManager dispatchChildrenState");
            c19a6.LJJJI(enumC214943199x, enumC214943199x2, z, z2, null);
            c19a6.LJIIL(strLIZLLL);
            return;
        }
        c19a6.LJJIJLIJ().LIZLLL(new Runnable() { // from class: X.19AT
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("NavigationSceneManager@df89.dispatchChildrenState$1");
                try {
                    String strLIZLLL2 = c19a6.LIZLLL("NavigationManager dispatchChildrenState");
                    final C19A6 c19a62 = c19a6;
                    final EnumC214943199x enumC214943199x3 = enumC214943199x;
                    final EnumC214943199x enumC214943199x4 = enumC214943199x2;
                    final boolean z3 = z;
                    final boolean z4 = z2;
                    c19a62.LJIILJJIL(new InterfaceC21499219Bu(enumC214943199x3, enumC214943199x4, z3, z4) { // from class: X.19BJ
                        public final EnumC214943199x LIZ;
                        public final EnumC214943199x LIZIZ;
                        public final boolean LIZJ;
                        public final boolean LIZLLL;

                        @Override // X.InterfaceC21499219Bu
                        public final void execute(Runnable runnable) {
                            this.LJ.LJJJI(this.LIZ, this.LIZIZ, this.LIZJ, this.LIZLLL, runnable);
                        }

                        {
                            this.LIZ = enumC214943199x3;
                            this.LIZIZ = enumC214943199x4;
                            this.LIZJ = z3;
                            this.LIZLLL = z4;
                        }
                    }, C19A6.LJJIFFI);
                    c19a6.LJIIL(strLIZLLL2);
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("NavigationSceneManager@df89.dispatchChildrenState$1");
            }
        });
    }
}
