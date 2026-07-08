package com.ss.android.ugc.aweme.ui.view;

import X.C01GW;
import X.C03H5;
import X.C0SOK;
import X.C0SRL;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1303280k1G;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1770850wBP;
import X.C19474211Gy;
import X.C356901a3;
import X.C415550GRd;
import X.C452501pT;
import X.C736680Sv4;
import X.C786410Ut5;
import X.InterfaceC0148002o;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2217241BqE;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import Y.ARunnableS106S0100000_6;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ability.IPhotoFloatGuideAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class PostModeGuideComponent implements InterfaceC724530SbT, IPhotoFloatGuideAbility {
    public static final /* synthetic */ int LLJIJIL = 0;
    public final C0SRL LL;
    public ViewStub LLILLJJLI;
    public View LLILLL;
    public C1303280k1G LLILZ;
    public TuxTextView LLILZIL;
    public C415550GRd LLILZLL;
    public ARunnableS106S0100000_6 LLIZ;
    public ARunnableS106S0100000_6 LLIZLLLIL;
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS550S0100000_6(this, 822));
    public final C01GW LLJI = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(349));

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

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ability.IPhotoFloatGuideAbility
    public final void dr0() {
        C0SRL c0srl = this.LL;
        ViewGroup viewGroup = c0srl.LIZLLL;
        Aweme aweme = c0srl.LIZJ;
        if (viewGroup == null || aweme == null || !c0srl.LJIJ()) {
            return;
        }
        this.LLILLJJLI = (ViewStub) viewGroup.findViewById(R.id.fu6);
        ARunnableS106S0100000_6 aRunnableS106S0100000_6 = new ARunnableS106S0100000_6(this, 256);
        HandlerHook.viewPostDelay(viewGroup, aRunnableS106S0100000_6, C0SOK.LIZ().guideDelay);
        this.LLIZ = aRunnableS106S0100000_6;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.LL.LJIIL();
    }

    /* JADX INFO: renamed from: com.ss.android.ugc.aweme.ui.view.PostModeGuideComponent$1, reason: invalid class name */
    public final class AnonymousClass1 implements DefaultLifecycleObserver, GenericLifecycleObserver {
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
        public final void onCreate(LifecycleOwner lifecycleOwner) {
            Fragment fragmentLJIILL = PostModeGuideComponent.this.LL.LJIILL();
            if (fragmentLJIILL != null) {
                C1558520qew.LJII(C1558360qeg.LJFF(fragmentLJIILL, null), PostModeGuideComponent.this, IPhotoFloatGuideAbility.class, null, null);
            }
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final void onDestroy(LifecycleOwner lifecycleOwner) {
            Fragment fragmentLJIILL = PostModeGuideComponent.this.LL.LJIILL();
            if (fragmentLJIILL != null) {
                C1558520qew.LJIIJJI(C1558360qeg.LJFF(fragmentLJIILL, null), IPhotoFloatGuideAbility.class, null);
            }
        }
    }

    public PostModeGuideComponent(C0SRL c0srl) {
        this.LL = c0srl;
        getLifecycle().addObserver(new AnonymousClass1());
    }

    public final void LIZ(boolean z) {
        View view;
        ViewGroup viewGroup = this.LL.LIZLLL;
        ARunnableS106S0100000_6 aRunnableS106S0100000_6 = this.LLIZ;
        if (aRunnableS106S0100000_6 != null && viewGroup != null) {
            HandlerHook.viewRemoveCallbacks(viewGroup, aRunnableS106S0100000_6);
        }
        this.LLIZ = null;
        ARunnableS106S0100000_6 aRunnableS106S0100000_62 = this.LLIZLLLIL;
        if (aRunnableS106S0100000_62 != null && viewGroup != null) {
            HandlerHook.viewRemoveCallbacks(viewGroup, aRunnableS106S0100000_62);
        }
        this.LLIZLLLIL = null;
        View view2 = this.LLILLL;
        if ((view2 == null || view2.getVisibility() != 8) && (view = this.LLILLL) != null) {
            C1303280k1G c1303280k1G = this.LLILZ;
            if (c1303280k1G != null) {
                c1303280k1G.cancelAnimation();
            }
            C1303280k1G c1303280k1G2 = this.LLILZ;
            if (c1303280k1G2 != null) {
                C786410Ut5.i(c1303280k1G2, 4);
            }
            this.LLILZ = null;
            TuxTextView tuxTextView = this.LLILZIL;
            if (tuxTextView != null) {
                C786410Ut5.LLLLZLL(tuxTextView, 4);
            }
            if (!z) {
                C786410Ut5.LJLLLLLL(8, view);
            } else {
                view.animate().alpha(0.0f).setDuration(200L).withEndAction(new ARunnableS106S0100000_6(view, 121)).start();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ability.IPhotoFloatGuideAbility
    public final void LJJJJLL(boolean z) {
        LIZ(z);
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
