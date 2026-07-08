package com.ss.android.ugc.aweme.series.innerfeed.fragment;

import X.AbstractC1159090gGh;
import X.AbstractC738140SxQ;
import X.C01GW;
import X.C1159100gGi;
import X.C1159110gGj;
import X.C1159120gGk;
import X.C1159130gGl;
import X.C1159140gGm;
import X.C1159150gGn;
import X.C1159260gGy;
import X.C1220000hqw;
import X.C13LE;
import X.C1573890r3j;
import X.C1613330s5L;
import X.C197039127h;
import X.C2217381BqS;
import X.C356901a3;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452501pT;
import X.C723700Sa8;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C736950SvV;
import X.InterfaceC1614350s6z;
import android.view.View;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.minidrama.common.component.innerfeed.playlist.assem.NoPaymentSeriesPanelSquareAssem;
import com.ss.android.ugc.aweme.minidrama.common.component.innerfeed.refund.viewmodel.SeriesRefundRatingViewModel;
import com.ss.android.ugc.aweme.service.MiniDramaHostService;
import com.ss.android.ugc.aweme.service.MiniDramaPaymentService;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS638S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class SeriesPanelSquareAssem extends NoPaymentSeriesPanelSquareAssem implements InterfaceC1614350s6z {
    public final C01GW LLJJIII = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(311));
    public final C1613330s5L LLJJIJI = new InterfaceC1614350s6z() { // from class: X.0s5L
        @Override // X.InterfaceC1614350s6z
        public final void jI1(boolean z) {
        }

        @Override // X.InterfaceC1614350s6z
        public final void sX0(AbstractC1159090gGh abstractC1159090gGh) {
            this.LL.sX0(abstractC1159090gGh);
        }
    };
    public final C736950SvV LLJJIJIIJIL;

    @Override // X.InterfaceC1614350s6z
    public final void jI1(boolean z) {
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0s5L] */
    public SeriesPanelSquareAssem() {
        AwS568S0100000_24 awS568S0100000_24 = new AwS568S0100000_24(this, 1014);
        this.LLJJIJIIJIL = new C736950SvV(C13LE.LIZ(SeriesRefundRatingViewModel.class), awS568S0100000_24, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS264S0000000_24.get$arr$(319), new AwS568S0100000_24((AbstractC738140SxQ) this, 1015), new C451610HnL(this, true, true), new C723700Sa8(this));
    }

    /* JADX INFO: renamed from: com.ss.android.ugc.aweme.series.innerfeed.fragment.SeriesPanelSquareAssem$onViewCreated$1, reason: invalid class name */
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
            MiniDramaPaymentService miniDramaPaymentService = (MiniDramaPaymentService) SeriesPanelSquareAssem.this.LLJJIII.getValue();
            if (miniDramaPaymentService != null) {
                miniDramaPaymentService.LIZ(SeriesPanelSquareAssem.this.LLJJIJI);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.minidrama.common.component.innerfeed.playlist.assem.NoPaymentSeriesPanelSquareAssem, com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        Lifecycle lifecycle;
        super.onViewCreated(view);
        MiniDramaPaymentService miniDramaPaymentService = (MiniDramaPaymentService) this.LLJJIII.getValue();
        if (miniDramaPaymentService != null) {
            miniDramaPaymentService.LJIIJ(this.LLJJIJI);
        }
        LifecycleOwner hostLifecycleOwner = getHostLifecycleOwner();
        if (hostLifecycleOwner != null && (lifecycle = hostLifecycleOwner.getLifecycle()) != null) {
            lifecycle.addObserver(new AnonymousClass1());
        }
        MiniDramaHostService.LIZ.getClass();
        MiniDramaHostService miniDramaHostServiceLIZ = C1573890r3j.LIZ();
        if (miniDramaHostServiceLIZ != null) {
            miniDramaHostServiceLIZ.LIZ();
        }
        C736680Sv4.LJIIIIZZ(this, this.LLJJIJIIJIL.getValue(), new C2217381BqS() { // from class: X.0s49
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1611650s2d) obj).LL;
            }
        }, C736820SvI.LIZLLL(), new AwS638S0100000_24(this, 165), 4);
    }

    @Override // X.InterfaceC1614350s6z
    public final void sX0(AbstractC1159090gGh abstractC1159090gGh) {
        if (abstractC1159090gGh.LIZ() == Oo().LLILZLL) {
            MiniDramaHostService.LIZ.getClass();
            MiniDramaHostService miniDramaHostServiceLIZ = C1573890r3j.LIZ();
            if (miniDramaHostServiceLIZ != null && miniDramaHostServiceLIZ.LJIIJ(C724240Sb0.LIZ(this))) {
                if (abstractC1159090gGh instanceof C1159110gGj) {
                    ((C197039127h) this.LLJILJIL.getValue()).setLoading(true);
                    return;
                }
                if ((abstractC1159090gGh instanceof C1159150gGn) || (abstractC1159090gGh instanceof C1159100gGi) || (abstractC1159090gGh instanceof C1159140gGm) || (abstractC1159090gGh instanceof C1159130gGl) || (abstractC1159090gGh instanceof C1159260gGy) || !(abstractC1159090gGh instanceof C1159120gGk)) {
                    return;
                }
                ((C197039127h) this.LLJILJIL.getValue()).setLoading(false);
            }
        }
    }
}
