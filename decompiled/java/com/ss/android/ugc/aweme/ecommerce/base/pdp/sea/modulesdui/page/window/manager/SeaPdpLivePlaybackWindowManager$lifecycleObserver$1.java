package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.page.window.manager;

import X.AnonymousClass0378;
import X.C1757250vpT;
import X.C1757320vpa;
import X.C356901a3;
import X.EnumC1486810onH;
import X.InterfaceC1631630sYr;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.communication.ISeaPdpCommunicationService;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.player.ISeaPdpMediaControlService;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: loaded from: classes27.dex */
public final class SeaPdpLivePlaybackWindowManager$lifecycleObserver$1 implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public final /* synthetic */ C1757250vpT LL;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    public SeaPdpLivePlaybackWindowManager$lifecycleObserver$1(C1757250vpT c1757250vpT) {
        this.LL = c1757250vpT;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZ(this, lifecycleOwner);
        ISeaPdpCommunicationService iSeaPdpCommunicationService = (ISeaPdpCommunicationService) this.LL.LLJIJIL.getValue();
        if (iSeaPdpCommunicationService != null) {
            final C1757250vpT c1757250vpT = this.LL;
            iSeaPdpCommunicationService.sx(c1757250vpT.LLILLJJLI, "sea_pdp_mini_window_manually_close", new InterfaceC1631630sYr<String, Map<String, ? extends Object>, Map<String, ? extends Object>, C1757320vpa, Unit>() { // from class: X.0vpV
                @Override // X.InterfaceC1631630sYr
                public final Unit invoke(String str, Map<String, ? extends Object> map, Map<String, ? extends Object> map2, C1757320vpa c1757320vpa) {
                    if (c1757250vpT.LIZLLL()) {
                        c1757250vpT.LLJILLL.LIZJ();
                    }
                    return Unit.LIZ;
                }
            });
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZIZ(this, lifecycleOwner);
        this.LL.LJFF();
        this.LL.LLILLL.getLifecycle().removeObserver(this);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZJ(this, lifecycleOwner);
        if (this.LL.LJ()) {
            ISeaPdpMediaControlService iSeaPdpMediaControlServiceLIZIZ = this.LL.LIZIZ();
            if (iSeaPdpMediaControlServiceLIZIZ != null) {
                iSeaPdpMediaControlServiceLIZIZ.oU(EnumC1486810onH.PAUSE);
            }
            this.LL.LLJILLL.LJ();
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZLLL(this, lifecycleOwner);
        if (this.LL.LJ()) {
            ISeaPdpMediaControlService iSeaPdpMediaControlServiceLIZIZ = this.LL.LIZIZ();
            if (iSeaPdpMediaControlServiceLIZIZ != null) {
                iSeaPdpMediaControlServiceLIZIZ.oU(EnumC1486810onH.RESUME);
            }
            this.LL.LLJILLL.LIZJ();
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(LifecycleOwner lifecycleOwner) {
        C356901a3.LJ(this, lifecycleOwner);
        AnonymousClass0378.LIZ().LIZLLL("small_window_status_change", this.LL);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(LifecycleOwner lifecycleOwner) {
        C356901a3.LJFF(this, lifecycleOwner);
        AnonymousClass0378.LIZ().LIZJ("small_window_status_change", this.LL);
    }
}
