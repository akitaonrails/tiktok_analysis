package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.page.window.manager;

import X.AnonymousClass0317;
import X.C034S;
import X.C1120604Zw;
import X.C1757410vpj;
import X.C19EG;
import X.C1AQS;
import X.C356901a3;
import X.InterfaceC1508380pM4;
import X.InterfaceC1756810vol;
import android.os.SystemClock;
import android.view.Surface;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.libra.EcSeaPdpShortVideoWindowOptExperiment;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.ui.SeaPdpFragment;
import com.ss.android.ugc.aweme.ecommerce.dependency.commonfeed.CommonFeedDependService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.commonfeed.ICommonFeedDependService;

/* JADX INFO: loaded from: classes27.dex */
public final class SeaPdpShortVideoWindowManager$seaPdpFragmentLifecycleObserver$1 implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public final /* synthetic */ C1757410vpj LL;
    public final /* synthetic */ Lifecycle LLILLJJLI;
    public final /* synthetic */ DefaultLifecycleObserver LLILLL;

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZ(this, lifecycleOwner);
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

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        Lifecycle lifecycle;
        C1757410vpj c1757410vpj = this.LL;
        if (c1757410vpj.LJIIIZ) {
            c1757410vpj.LIZLLL();
        }
        SeaPdpFragment seaPdpFragment = this.LL.LIZJ;
        if (seaPdpFragment != null && (lifecycle = seaPdpFragment.getLifecycle()) != null) {
            lifecycle.removeObserver(this);
        }
        this.LL.getClass();
        InterfaceC1508380pM4 interfaceC1508380pM4LIZIZ = C1757410vpj.LIZIZ();
        if (interfaceC1508380pM4LIZIZ != null) {
            interfaceC1508380pM4LIZIZ.LJI(this.LL.LJIILL);
        }
        Lifecycle lifecycle2 = this.LLILLJJLI;
        if (lifecycle2 != null) {
            lifecycle2.removeObserver(this.LLILLL);
        }
        C356901a3.LIZIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(LifecycleOwner lifecycleOwner) {
        InterfaceC1508380pM4 interfaceC1508380pM4LIZIZ;
        C356901a3.LIZJ(this, lifecycleOwner);
        if (this.LL.LJIIIZ && (interfaceC1508380pM4LIZIZ = C1757410vpj.LIZIZ()) != null) {
            interfaceC1508380pM4LIZIZ.LIZ();
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(LifecycleOwner lifecycleOwner) {
        C19EG activity;
        Surface surface;
        AnonymousClass0317 anonymousClass0317CreateICommonFeedDependServicebyMonsterPlugin;
        String name;
        C356901a3.LIZLLL(this, lifecycleOwner);
        C1757410vpj c1757410vpj = this.LL;
        if (c1757410vpj.LJIIIZ) {
            if (EcSeaPdpShortVideoWindowOptExperiment.LIZLLL) {
                SeaPdpFragment seaPdpFragment = c1757410vpj.LIZJ;
                if (seaPdpFragment != null && (activity = seaPdpFragment.getActivity()) != null && (surface = this.LL.LJIIIIZZ) != null) {
                    if (C034S.LIZ()) {
                        C1120604Zw.LIZ.LIZ();
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        boolean z = false;
                        anonymousClass0317CreateICommonFeedDependServicebyMonsterPlugin = CommonFeedDependService.createICommonFeedDependServicebyMonsterPlugin(false);
                        if (anonymousClass0317CreateICommonFeedDependServicebyMonsterPlugin != null) {
                            z = true;
                        }
                        String name2 = ICommonFeedDependService.class.getName();
                        if (anonymousClass0317CreateICommonFeedDependServicebyMonsterPlugin != null) {
                            name = anonymousClass0317CreateICommonFeedDependServicebyMonsterPlugin.getClass().getName();
                        } else {
                            name = null;
                        }
                        C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
                    } else {
                        C1120604Zw.LIZ.LIZ();
                        anonymousClass0317CreateICommonFeedDependServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ICommonFeedDependService.class);
                    }
                    InterfaceC1756810vol feedPlayerAbility = ((ICommonFeedDependService) anonymousClass0317CreateICommonFeedDependServicebyMonsterPlugin).getFeedPlayerAbility(activity);
                    if (feedPlayerAbility != null) {
                        feedPlayerAbility.LIZ();
                    }
                    InterfaceC1508380pM4 interfaceC1508380pM4LIZIZ = C1757410vpj.LIZIZ();
                    if (interfaceC1508380pM4LIZIZ != null) {
                        interfaceC1508380pM4LIZIZ.LJJIL(surface);
                        return;
                    }
                    return;
                }
                return;
            }
            InterfaceC1508380pM4 interfaceC1508380pM4LIZIZ2 = C1757410vpj.LIZIZ();
            if (interfaceC1508380pM4LIZIZ2 == null) {
                return;
            }
            interfaceC1508380pM4LIZIZ2.LJIILLIIL();
        }
    }

    public SeaPdpShortVideoWindowManager$seaPdpFragmentLifecycleObserver$1(C1757410vpj c1757410vpj, Lifecycle lifecycle, SeaPdpShortVideoWindowManager$detailFragmentLifecycleObserver$1 seaPdpShortVideoWindowManager$detailFragmentLifecycleObserver$1) {
        this.LL = c1757410vpj;
        this.LLILLJJLI = lifecycle;
        this.LLILLL = seaPdpShortVideoWindowManager$detailFragmentLifecycleObserver$1;
    }
}
