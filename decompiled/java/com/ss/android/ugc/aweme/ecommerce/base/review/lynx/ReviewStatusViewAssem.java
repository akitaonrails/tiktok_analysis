package com.ss.android.ugc.aweme.ecommerce.base.review.lynx;

import X.C019F;
import X.C01GW;
import X.C034S;
import X.C1120604Zw;
import X.C1170050gYN;
import X.C13LE;
import X.C1555790qaX;
import X.C1556050qax;
import X.C1623606Xi;
import X.C1637806bA;
import X.C1749280vcc;
import X.C1755980vnQ;
import X.C1766480w4M;
import X.C19719912Dl;
import X.C1AQS;
import X.C2217381BqS;
import X.C452501pT;
import X.C491001vg;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C804420Vh2;
import X.EnumC1766410w4F;
import X.InterfaceC2217461Bqa;
import Y.ARunnableS124S0100000_24;
import android.content.Context;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.ecommerce.base.review.lynx.ReviewState;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.AwS640S0100000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class ReviewStatusViewAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJILJ;
    public C1749280vcc LLIZLLLIL;
    public final AssemVMLazy LLJ;
    public final C01GW LLJI;
    public final BPEAHandler LLJIJIL;
    public final ARunnableS124S0100000_24 LLJILJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ReviewStatusViewAssem.class, "reviewLynxVM", "getReviewLynxVM()Lcom/ss/android/ugc/aweme/ecommerce/base/review/lynx/ReviewAssemVM;", 0);
        C13LE.LIZ.getClass();
        LLJILJILJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public ReviewStatusViewAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ReviewAssemVM.class);
        this.LLJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS568S0100000_24(c19719912DlLIZ, 317), AFwS264S0000000_24.get$arr$(81), null, true);
        this.LLJI = C452501pT.LIZIZ(new AwS568S0100000_24(this, 316));
        this.LLJIJIL = new BPEAHandler(Looper.getMainLooper());
        this.LLJILJIL = new ARunnableS124S0100000_24(this, 21);
    }

    public final ReviewAssemVM Go() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJILJ;
        return (ReviewAssemVM) assemVMLazy.getValue();
    }

    public final C1749280vcc Ho() {
        View viewFindViewById = this.LLIZLLLIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.th7) : null;
            this.LLIZLLLIL = (C1749280vcc) viewFindViewById;
        }
        return (C1749280vcc) viewFindViewById;
    }

    public final void Lo() {
        this.LLJIJIL.removeCallbacks(this.LLJILJIL);
        C1749280vcc c1749280vccHo = Ho();
        if (c1749280vccHo != null) {
            C786410Ut5.LJLLLLLL(0, c1749280vccHo);
        }
    }

    public final void Jo() {
        IECommerceHostService iECommerceHostService;
        C1755980vnQ c1755980vnQHo;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            C1AQS.LIZJ(jElapsedRealtime, 1, IApplicationDependencyService.class.getName(), iECommerceHostService != null ? iECommerceHostService.getClass().getName() : null, iECommerceHostService != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        if (C804420Vh2.LJFF(((IApplicationDependencyService) iECommerceHostService).getApplication())) {
            C1749280vcc c1749280vccHo = Ho();
            if (c1749280vccHo != null) {
                c1749280vccHo.LJ();
            }
            ReviewState state = Go().getState();
            if ((state.getDataFetchStatus() instanceof C1555790qaX) || state.getNetworkState() == EnumC1766410w4F.UNAVAILABLE) {
                Go().vQ2();
            }
            if (state.getLynxLoadStatus() instanceof C491001vg) {
                ReviewAssemVM reviewAssemVMGo = Go();
                reviewAssemVMGo.setState(AFwS268S0000000_26.get$arr$(713));
                C1766480w4M c1766480w4M = reviewAssemVMGo.LLJIJIL;
                if (c1766480w4M == null || (c1755980vnQHo = c1766480w4M.LIZ.Ho()) == null) {
                    return;
                }
                c1755980vnQHo.LIZIZ();
            }
        }
    }

    public final void R() {
        ReviewState state = Go().getState();
        if ((state.getDataFetchStatus() instanceof C1556050qax) && (state.getLynxLoadStatus() instanceof C1623606Xi)) {
            C786410Ut5.LJLIIL(50L, this.LLJIJIL, this.LLJILJIL);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        Context context = getContext();
        if (context != null) {
            C1170050gYN c1170050gYN = new C1170050gYN(context);
            C1749280vcc c1749280vccHo = Ho();
            if (c1749280vccHo != null) {
                c1749280vccHo.LIZIZ(c1170050gYN.LIZ);
            }
            C1749280vcc c1749280vccHo2 = Ho();
            if (c1749280vccHo2 != null) {
                c1749280vccHo2.LIZ(c1170050gYN);
            }
        }
        AssemViewModel.asyncSubscribe$default(Go(), new C2217381BqS() { // from class: X.0w4H
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((ReviewState) obj).getLynxLoadStatus();
            }
        }, (Fragment) this.LLJI.getValue(), null, new AwS605S0100000_26(this, 247), new AwS570S0100000_26(this, 513), new AwS605S0100000_26(this, 248), 4, null);
        C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.0w4I
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((ReviewState) obj).getNetworkState();
            }
        }, null, new AwS640S0100000_26(this, 24), 6);
        C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.0w4G
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((ReviewState) obj).getDataFetchStatus();
            }
        }, null, new AwS640S0100000_26(this, 25), 6);
    }
}
