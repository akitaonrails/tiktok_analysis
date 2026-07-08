package com.ss.android.ugc.aweme.ecommercelive.audience.common.preload;

import X.AbstractC1538740q92;
import X.C01GW;
import X.C0PEM;
import X.C1041990dDp;
import X.C1388190mED;
import X.C13LP;
import X.C1506070pIL;
import X.C150T;
import X.C19EG;
import X.C19EH;
import X.C1DFH;
import X.C2107308Nj;
import X.C21210117zP;
import X.C2296808zG;
import X.C23250099c;
import X.C356901a3;
import X.C452501pT;
import X.C786410Ut5;
import X.InterfaceC1506090pIN;
import X.InterfaceC1766510w4P;
import X.InterfaceC21210317zR;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.os.MessageQueue;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.preload.NativePreloadController;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS147S1200000_32;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes33.dex */
public final class NativePreloadController {
    public final Context LIZ;
    public InterfaceC21210317zR LIZIZ;
    public boolean LIZJ;
    public final ShopBagListContainerFragment LIZLLL;
    public ShopBagListSparkFragment LJ;
    public InterfaceC1506090pIN LJFF;
    public C21210117zP LJI;
    public C1506070pIL LJII;
    public boolean LJIIIIZZ;
    public final C01GW LJIIIZ;

    public final void LIZ() {
        FragmentManager supportFragmentManager;
        if (((Fragment) this.LJIIIZ.getValue()).isAdded()) {
            return;
        }
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(this.LIZ);
        if (c19egLIZIZ == null || !c19egLIZIZ.isFinishing()) {
            try {
                C19EG c19egLIZIZ2 = C1388190mED.LIZIZ(this.LIZ);
                if (c19egLIZIZ2 == null || (supportFragmentManager = c19egLIZIZ2.getSupportFragmentManager()) == null) {
                    return;
                }
                ((TuxSheet) this.LJIIIZ.getValue()).showNow(supportFragmentManager, "ShopBagListContainerFragment");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ugc.aweme.ecommercelive.audience.common.preload.NativePreloadController$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes32.dex */
    public final class AnonymousClass1 implements DefaultLifecycleObserver, GenericLifecycleObserver {
        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
            C356901a3.LIZ(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
            C356901a3.LIZJ(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
            C356901a3.LIZLLL(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
            C356901a3.LJ(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
            C356901a3.LJFF(this, lifecycleOwner);
        }

        public AnonymousClass1() {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final void onDestroy(LifecycleOwner lifecycleOwner) {
            C356901a3.LIZIZ(this, lifecycleOwner);
            lifecycleOwner.getLifecycle().removeObserver(this);
            NativePreloadController nativePreloadController = NativePreloadController.this;
            nativePreloadController.LIZJ(nativePreloadController.LJFF);
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C150T(nativePreloadController, null), 3);
        }
    }

    public NativePreloadController(Context context) {
        FragmentManager supportFragmentManager;
        List<Fragment> listLJJLIIIJL;
        Lifecycle lifecycle;
        TuxSheet tuxSheet;
        Fragment fragment;
        List<Fragment> listLJJLIIIJL2;
        this.LIZ = context;
        ShopBagListContainerFragment shopBagListContainerFragment = new ShopBagListContainerFragment();
        shopBagListContainerFragment.LLIZLLLIL = new InterfaceC1766510w4P() { // from class: X.17zO
            @Override // X.InterfaceC1766510w4P
            public final void LIZ() {
                InterfaceC21210317zR interfaceC21210317zR = this.LIZ.LIZIZ;
                if (interfaceC21210317zR != null) {
                    interfaceC21210317zR.LIZ();
                }
            }

            @Override // X.InterfaceC1766510w4P
            public final void onDismiss() {
                if (this.LIZ.LIZJ) {
                    onHide();
                }
                NativePreloadController nativePreloadController = this.LIZ;
                nativePreloadController.LIZJ(nativePreloadController.LJFF);
                C1DFH c1dfh = C0PEM.LIZ;
                C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C150T(nativePreloadController, null), 3);
            }

            @Override // X.InterfaceC1766510w4P
            public final void onHide() {
                NativePreloadController nativePreloadController = this.LIZ;
                nativePreloadController.LIZJ = false;
                BtmSDK.INSTANCE.onPageHide(nativePreloadController.LJ, Boolean.FALSE);
                C1506070pIL c1506070pIL = this.LIZ.LJII;
                if (c1506070pIL != null) {
                    c1506070pIL.LIZ("close", null);
                }
                InterfaceC21210317zR interfaceC21210317zR = this.LIZ.LIZIZ;
                if (interfaceC21210317zR != null) {
                    interfaceC21210317zR.onHide();
                }
            }
        };
        this.LIZLLL = shopBagListContainerFragment;
        this.LJIIIZ = C452501pT.LIZIZ(new AwS575S0100000_31(this, 524));
        try {
            C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
            Fragment fragment2 = null;
            if (c19egLIZIZ != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null && (listLJJLIIIJL = supportFragmentManager.LJJLIIIJL()) != null) {
                Iterator<Fragment> it2 = listLJJLIIIJL.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Fragment next = it2.next();
                    Fragment fragment3 = next;
                    if ((fragment3 instanceof TuxSheet) && (tuxSheet = (TuxSheet) fragment3) != null && tuxSheet.isAdded() && !tuxSheet.isDetached() && !tuxSheet.isRemoving()) {
                        FragmentManager childFragmentManager = tuxSheet.getChildFragmentManager();
                        if (childFragmentManager != null && (listLJJLIIIJL2 = childFragmentManager.LJJLIIIJL()) != null) {
                            fragment = (Fragment) C13LP.LJJJLZIJ(0, listLJJLIIIJL2);
                        } else {
                            fragment = null;
                        }
                        if ((fragment instanceof ShopBagListContainerFragment) && ((ShopBagListContainerFragment) fragment) != null) {
                            fragment2 = next;
                            break;
                        }
                    }
                }
                Fragment fragment4 = fragment2;
                if (fragment4 != null && (lifecycle = fragment4.getLifecycle()) != null) {
                    lifecycle.addObserver(new AnonymousClass1());
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void LIZJ(InterfaceC1506090pIN interfaceC1506090pIN) {
        InterfaceC1506090pIN interfaceC1506090pIN2 = this.LJFF;
        if (interfaceC1506090pIN2 == null) {
            return;
        }
        if (interfaceC1506090pIN == null || Intrinsics.LJFF(interfaceC1506090pIN2, interfaceC1506090pIN)) {
            this.LIZLLL.mS();
            this.LJFF = null;
            this.LJ = null;
            this.LIZIZ = null;
            C21210117zP c21210117zP = this.LJI;
            if (c21210117zP != null) {
                Looper.myQueue().removeIdleHandler(c21210117zP);
            }
            this.LJI = null;
            C1506070pIL c1506070pIL = this.LJII;
            if (c1506070pIL != null) {
                c1506070pIL.LIZ("destroy", null);
            }
            this.LJII = null;
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [X.17zP, android.os.MessageQueue$IdleHandler] */
    public final void LIZLLL(final InterfaceC1506090pIN interfaceC1506090pIN, final String str) {
        if (!Intrinsics.LJFF(this.LJFF, interfaceC1506090pIN)) {
            LIZJ(null);
            this.LJFF = interfaceC1506090pIN;
            this.LJII = new C1506070pIL(interfaceC1506090pIN);
        }
        C21210117zP c21210117zP = this.LJI;
        if (c21210117zP != null) {
            Looper.myQueue().removeIdleHandler(c21210117zP);
        }
        ?? r1 = new MessageQueue.IdleHandler() { // from class: X.17zP
            @Override // android.os.MessageQueue.IdleHandler
            public final boolean queueIdle() {
                NativePreloadController nativePreloadController = this.LL;
                InterfaceC1506090pIN interfaceC1506090pIN2 = interfaceC1506090pIN;
                String str2 = str;
                if (nativePreloadController.LJ == null && Intrinsics.LJFF(interfaceC1506090pIN2, nativePreloadController.LJFF)) {
                    nativePreloadController.LIZ();
                    nativePreloadController.LJ = nativePreloadController.LIZIZ(str2, "live_cart", interfaceC1506090pIN2);
                    nativePreloadController.LIZLLL.LJJJJLL(false);
                    C1506070pIL c1506070pIL = nativePreloadController.LJII;
                    if (c1506070pIL != null) {
                        c1506070pIL.LIZ("start_preload", null);
                    }
                }
                return false;
            }
        };
        this.LJI = r1;
        C786410Ut5.f3(r1, Looper.myQueue());
    }

    public final ShopBagListSparkFragment LIZIZ(String str, String str2, final InterfaceC1506090pIN interfaceC1506090pIN) {
        C19EG activity;
        ShopBagListSparkFragment shopBagListSparkFragment = this.LJ;
        if (shopBagListSparkFragment != null) {
            return shopBagListSparkFragment;
        }
        SparkContext sparkContextLIZJ = interfaceC1506090pIN.LIZJ(str, str2, true);
        sparkContextLIZJ.LJJIJIIJIL(new AbstractC1538740q92() { // from class: X.17zQ
            @Override // X.AbstractC1537870q7d
            public final void LJLIIIL(InterfaceC1541990qEH interfaceC1541990qEH) {
            }

            @Override // X.AbstractC1537870q7d
            public final void LJLIIL(InterfaceC1541990qEH interfaceC1541990qEH, String str3) {
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // X.AbstractC1537870q7d
            public final void LJLI(InterfaceC1541990qEH interfaceC1541990qEH, String str3, String str4) {
                C421580Gg0.LIZ(new AwS147S1200000_32(this.LLILLJJLI, interfaceC1506090pIN, str3, 5));
            }
        });
        ShopBagListContainerFragment shopBagListContainerFragment = this.LIZLLL;
        shopBagListContainerFragment.getClass();
        sparkContextLIZJ.LJJJZ("need_wrapper_view", "1");
        if (shopBagListContainerFragment.LLIZ != null) {
            shopBagListContainerFragment.mS();
        }
        ShopBagListSparkFragment shopBagListSparkFragment2 = new ShopBagListSparkFragment();
        SparkFragment sparkFragment = new SparkFragment();
        Bundle bundle = new Bundle();
        C1041990dDp.LIZ.getClass();
        C1041990dDp.LIZJ(sparkContextLIZJ);
        C786410Ut5.LJJJI("SparkContextContainerId", sparkContextLIZJ.containerId, bundle);
        sparkFragment.setArguments(bundle);
        shopBagListSparkFragment2.setSparkFragment(sparkFragment);
        try {
            if (shopBagListContainerFragment.isAdded() && !shopBagListContainerFragment.isRemoving() && shopBagListContainerFragment.getActivity() != null && ((activity = shopBagListContainerFragment.getActivity()) == null || !activity.isFinishing())) {
                C19EH c19ehLJIIJ = shopBagListContainerFragment.getChildFragmentManager().LJIIJ();
                c19ehLJIIJ.LIZJ(R.id.gmv, shopBagListSparkFragment2, "shop_bag_list_spark_container");
                c19ehLJIIJ.LJIIL();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        shopBagListContainerFragment.LLIZ = shopBagListSparkFragment2;
        return shopBagListSparkFragment2;
    }
}
