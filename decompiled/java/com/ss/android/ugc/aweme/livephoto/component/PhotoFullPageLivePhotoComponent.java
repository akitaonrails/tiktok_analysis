package com.ss.android.ugc.aweme.livephoto.component;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C03H5;
import X.C0S7U;
import X.C0S9P;
import X.C0SFN;
import X.C0SMF;
import X.C0SOB;
import X.C0SRL;
import X.C0ST8;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1770850wBP;
import X.C19474211Gy;
import X.C2217381BqS;
import X.C452501pT;
import X.C628500Oky;
import X.C630740Ooa;
import X.C687700QyG;
import X.C708110Rq5;
import X.C724240Sb0;
import X.C736680Sv4;
import X.InterfaceC0148002o;
import X.InterfaceC1146704e9;
import X.InterfaceC1484830ok5;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2217241BqE;
import X.InterfaceC719460SKa;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.ability.FullPageHostAbility;
import com.ss.android.ugc.aweme.ability.IPhotoSlidesAbility;
import com.ss.android.ugc.aweme.ability.IPhotoSlidesEventDispatchAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.livephoto.ability.PhotoLivePhotoComponentAbility;
import com.ss.android.ugc.aweme.scope.PostModeDetailScope;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS54S0001000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS625S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class PhotoFullPageLivePhotoComponent extends AbstractC738140SxQ implements InterfaceC724530SbT, C0SOB, C0SMF, PhotoLivePhotoComponentAbility, InterfaceC1146704e9 {
    public final C01GW LL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 504));
    public final C630740Ooa LLILLJJLI = C628500Oky.LIZ(new AwS555S0100000_11(this, 506));
    public final C630740Ooa LLILLL = C628500Oky.LIZ(new AwS555S0100000_11(this, 507));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS555S0100000_11(this, 509));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 508));
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 505));
    public C0S7U LLIZ;
    public boolean LLIZLLLIL;
    public InterfaceC1484830ok5 LLJ;

    @Override // X.C0SOB
    public final void Aa() {
    }

    @Override // X.C0SMF
    public final void Yb() {
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{PostModeDetailScope.class});
    }

    @Override // X.InterfaceC724530SbT, X.InterfaceC736810SvH
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC736810SvH getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC725050ScJ
    public final C03H5 getActualReceiver() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC725050ScJ<C03H5> getActualReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(PostModeDetailScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        IPhotoSlidesEventDispatchAbility iPhotoSlidesEventDispatchAbility = (IPhotoSlidesEventDispatchAbility) this.LLILLL.getValue();
        if (iPhotoSlidesEventDispatchAbility != null) {
            iPhotoSlidesEventDispatchAbility.u52(this);
        }
        IPhotoSlidesEventDispatchAbility iPhotoSlidesEventDispatchAbility2 = (IPhotoSlidesEventDispatchAbility) this.LLILLL.getValue();
        if (iPhotoSlidesEventDispatchAbility2 != null) {
            iPhotoSlidesEventDispatchAbility2.GS0(this);
        }
        IPhotoSlidesAbility iPhotoSlidesAbility = (IPhotoSlidesAbility) this.LLILLJJLI.getValue();
        if (iPhotoSlidesAbility != null) {
            onPageSelected(iPhotoSlidesAbility.xt0());
        }
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJII(C1558360qeg.LJFF(fragmentLJI, null), this, PhotoLivePhotoComponentAbility.class, null, null);
        }
        AssemViewModel assemViewModel = (AssemViewModel) this.LLILZIL.getValue();
        if (assemViewModel != null) {
            C736680Sv4.LJIIIIZZ(this, assemViewModel, new C2217381BqS() { // from class: X.0RVY
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C0S9P) obj).LLIZ;
                }
            }, null, new AwS625S0100000_11(this, 41), 6);
        }
    }

    @Override // com.ss.android.ugc.aweme.livephoto.ability.PhotoLivePhotoComponentAbility
    public final void Ri0() {
        C0S7U c0s7u;
        C0S9P c0s9p;
        AssemViewModel assemViewModel = (AssemViewModel) this.LLILZIL.getValue();
        if ((assemViewModel == null || (c0s9p = (C0S9P) assemViewModel.getState()) == null || !Intrinsics.LJFF(c0s9p.LLIZ, Boolean.TRUE)) && (c0s7u = this.LLIZ) != null) {
            c0s7u.E4();
        }
    }

    public final void bo() {
        C0S7U c0s7u;
        C0S9P c0s9p;
        C0SRL c0srlAR1;
        Aweme aweme;
        C0S9P c0s9p2;
        Boolean bool;
        AssemViewModel assemViewModel = (AssemViewModel) this.LLILZIL.getValue();
        if (assemViewModel != null && (c0s9p2 = (C0S9P) assemViewModel.getState()) != null && (bool = c0s9p2.LLIZ) != null) {
            boolean zBooleanValue = bool.booleanValue();
            C0S7U c0s7u2 = this.LLIZ;
            if (c0s7u2 != null) {
                c0s7u2.Ba(zBooleanValue);
            }
        }
        C0S7U c0s7u3 = this.LLIZ;
        if (c0s7u3 != null) {
            c0s7u3.a9((View.OnClickListener) this.LLILZLL.getValue());
        }
        FullPageHostAbility fullPageHostAbility = (FullPageHostAbility) this.LL.getValue();
        int iLIZJ = (fullPageHostAbility == null || (c0srlAR1 = fullPageHostAbility.AR1()) == null || (aweme = c0srlAR1.LIZJ) == null) ? 0 : C0ST8.LIZJ(aweme);
        AssemViewModel assemViewModel2 = (AssemViewModel) this.LLILZIL.getValue();
        if ((assemViewModel2 == null || (c0s9p = (C0S9P) assemViewModel2.getState()) == null || !c0s9p.LLJJL || iLIZJ <= 1) && (c0s7u = this.LLIZ) != null) {
            c0s7u.Q2();
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        IPhotoSlidesEventDispatchAbility iPhotoSlidesEventDispatchAbility = (IPhotoSlidesEventDispatchAbility) this.LLILLL.getValue();
        if (iPhotoSlidesEventDispatchAbility != null) {
            iPhotoSlidesEventDispatchAbility.IL1(this);
        }
        IPhotoSlidesEventDispatchAbility iPhotoSlidesEventDispatchAbility2 = (IPhotoSlidesEventDispatchAbility) this.LLILLL.getValue();
        if (iPhotoSlidesEventDispatchAbility2 != null) {
            iPhotoSlidesEventDispatchAbility2.GS0(null);
        }
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJIIJJI(C1558360qeg.LJFF(fragmentLJI, null), PhotoLivePhotoComponentAbility.class, null);
        }
        InterfaceC1484830ok5 interfaceC1484830ok5 = this.LLJ;
        if (interfaceC1484830ok5 != null) {
            interfaceC1484830ok5.release();
        }
        this.LLJ = null;
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        super.onPause();
        Ri0();
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
        bo();
    }

    @Override // com.ss.android.ugc.aweme.livephoto.ability.PhotoLivePhotoComponentAbility
    public final void N10() {
        bo();
    }

    @Override // X.C0SOB
    public final void onPageSelected(int i) {
        InterfaceC719460SKa interfaceC719460SKaRq2;
        C0S7U c0s7u;
        C0S7U c0s7u2;
        C0SFN.LIZIZ.LIZLLL("LivePhotoFullPageComp", null, new AwS54S0001000_11(i, 1));
        IPhotoSlidesAbility iPhotoSlidesAbility = (IPhotoSlidesAbility) this.LLILLJJLI.getValue();
        if (iPhotoSlidesAbility != null) {
            interfaceC719460SKaRq2 = iPhotoSlidesAbility.rq2(i);
        } else {
            interfaceC719460SKaRq2 = null;
        }
        if (interfaceC719460SKaRq2 instanceof C0S7U) {
            c0s7u = (C0S7U) interfaceC719460SKaRq2;
            if (c0s7u != null) {
                this.LLIZLLLIL = true;
            }
        } else {
            c0s7u = null;
        }
        if (!Intrinsics.LJFF(this.LLIZ, c0s7u) && (c0s7u2 = this.LLIZ) != null) {
            c0s7u2.E4();
        }
        if (c0s7u != null) {
            Fragment fragmentLJI = C724240Sb0.LJI(this);
            if (this.LLJ == null) {
                this.LLJ = C708110Rq5.LIZ(fragmentLJI);
            }
            c0s7u.Pn(this.LLJ, null);
        }
        this.LLIZ = c0s7u;
        bo();
    }

    @Override // X.C0SMF
    public final void wd(int i) {
        IPhotoSlidesAbility iPhotoSlidesAbility;
        if (!this.LLIZLLLIL && (iPhotoSlidesAbility = (IPhotoSlidesAbility) this.LLILLJJLI.getValue()) != null) {
            onPageSelected(iPhotoSlidesAbility.xt0());
        }
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o> C0ZP4 subscribe(AssemViewModel<S> assemViewModel, C1770850wBP<S> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super S, Unit> function2) {
        return C736680Sv4.LJIILLIIL(this, assemViewModel, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJ(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJIILJJIL(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1770850wBP<C19474211Gy<A, B>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631620sYq<? super C03H5, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C736680Sv4.LIZLLL(assemViewModel, this, c1770850wBP, function1, interfaceC1631620sYq, interfaceC2217241BqE, interfaceC2217241BqE2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1770850wBP<C11H7<A, B, C>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631630sYr<? super C03H5, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C736680Sv4.LJFF(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1770850wBP, function1, interfaceC1631630sYr);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1770850wBP<C11H6<A, B, C, D>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685420txc<? super C03H5, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C736680Sv4.LJI(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1770850wBP, function1, interfaceC1685420txc);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D, E> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, InterfaceC2217241BqE<S, ? extends E> interfaceC2217241BqE5, C1770850wBP<C11H2<A, B, C, D, E>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685430txd<? super C03H5, ? super A, ? super B, ? super C, ? super D, ? super E, Unit> interfaceC1685430txd) {
        return C736680Sv4.LJII(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, interfaceC2217241BqE5, c1770850wBP, function1, interfaceC1685430txd);
    }
}
