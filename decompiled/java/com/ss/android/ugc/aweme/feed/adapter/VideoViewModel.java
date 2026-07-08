package com.ss.android.ugc.aweme.feed.adapter;

import X.C01GW;
import X.C0BK9;
import X.C0Q69;
import X.C0R5A;
import X.C0R8F;
import X.C0R8G;
import X.C0R8H;
import X.C0R8I;
import X.C0R9E;
import X.C14EU;
import X.C20586815h4;
import X.C2174741A9g;
import X.C2276411E8h;
import X.C295300Bho;
import X.C690920R8g;
import X.C690930R8h;
import X.C690940R8i;
import X.C690950R8j;
import X.C692900RFw;
import X.C709790Rsn;
import X.C724640Sbe;
import X.C786410Ut5;
import X.InterfaceC0148002o;
import Y.ARunnableS80S0200000_11;
import android.os.Looper;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseHolderViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes12.dex */
public final class VideoViewModel extends FeedBaseHolderViewModel<C709790Rsn> {
    public static final /* synthetic */ int LLILZIL = 0;
    public final boolean LLILZ = true;

    public final void AQ2() {
        setState(AFwS243S0000000_11.get$arr$(48));
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C709790Rsn(0);
    }

    public final void zQ2() {
        setState(AFwS243S0000000_11.get$arr$(47));
    }

    public VideoViewModel() {
        if (C2174741A9g.LIZIZ.LJIILJJIL() || C0BK9.LIZIZ) {
            try {
                if (EventBus.LIZLLL().LJIIJ(this)) {
                    return;
                }
                EventBus.LIZLLL().LJIJJ(this);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C2276411E8h.LIZIZ.LJFF("OpenOnMute EventBus", e);
            }
        }
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        if (C2174741A9g.LIZIZ.LJIILJJIL() || C0BK9.LIZIZ) {
            try {
                if (EventBus.LIZLLL().LJIIJ(this)) {
                    EventBus.LIZLLL().LJJI(this);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C2276411E8h.LIZIZ.LJFF("OpenOnMute EventBus", e);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.base.FeedBaseHolderViewModel, com.bytedance.assem.arch.viewModel.AssemViewModel
    public final boolean isHolderVM() {
        return this.LLILZ;
    }

    @C14EU
    public final void setMuteIconState(C690940R8i c690940R8i) {
        C01GW c01gw = C690950R8j.LIZ;
        if (!C690950R8j.LIZIZ) {
            C01GW c01gw2 = C0BK9.LIZ;
            if (!C0BK9.LIZIZ) {
                return;
            }
        }
        setState(new AwS590S0100000_11(c690940R8i, 75));
    }

    public final void wQ2(C692900RFw c692900RFw) {
        setState(new C0R8F(c692900RFw));
    }

    public final void xQ2(C0Q69 c0q69) {
        if (C295300Bho.LIZ()) {
            if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
                setStateImmediate(new C0R8G(c0q69));
                return;
            }
            ARunnableS80S0200000_11 aRunnableS80S0200000_11 = new ARunnableS80S0200000_11(this, c0q69, 5);
            if (((Number) C295300Bho.LIZ.getValue()).intValue() == 2) {
                C786410Ut5.LJL(C724640Sbe.LIZ(), aRunnableS80S0200000_11);
                return;
            } else {
                C786410Ut5.LJJZZIII(C724640Sbe.LIZ(), aRunnableS80S0200000_11);
                return;
            }
        }
        setState(new AwS590S0100000_11(c0q69, 72));
    }

    public final void yQ2(Aweme aweme) {
        setState(new AwS590S0100000_11(aweme, 74));
    }

    public final void BQ2(int i, C0R5A c0r5a) {
        C20586815h4.LIZIZ = true;
        setState(new C0R8H(i));
        setState(new C0R8I(i, c0r5a));
        if (C2174741A9g.LIZIZ.LJIILJJIL()) {
            try {
                if (!EventBus.LIZLLL().LJIIJ(this)) {
                    EventBus.LIZLLL().LJIJJ(this);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C2276411E8h.LIZIZ.LJFF("OpenOnMute EventBus", e);
            }
        }
    }

    public final void CQ2(String str, boolean z) {
        C0R9E c0r9e = new C0R9E(str, z);
        setState(new C690920R8g(c0r9e));
        setState(new C690930R8h(c0r9e));
        if (C2174741A9g.LIZIZ.LJIILJJIL()) {
            try {
                if (EventBus.LIZLLL().LJIIJ(this)) {
                    EventBus.LIZLLL().LJJI(this);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C2276411E8h.LIZIZ.LJFF("OpenOnMute EventBus", e);
            }
        }
    }
}
