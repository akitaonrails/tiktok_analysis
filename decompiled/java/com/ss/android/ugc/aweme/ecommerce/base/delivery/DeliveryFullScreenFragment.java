package com.ss.android.ugc.aweme.ecommerce.base.delivery;

import X.AbstractC1252750ihl;
import X.C004I;
import X.C01GW;
import X.C040Q;
import X.C098200Yq;
import X.C11DL;
import X.C11E6;
import X.C11EA;
import X.C11EC;
import X.C11EF;
import X.C13LE;
import X.C1634100scq;
import X.C1644460stY;
import X.C1685300txQ;
import X.C1765020w20;
import X.C189200o6;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C452501pT;
import X.InterfaceC1075600e62;
import X.InterfaceC1171660gay;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC2217241BqE;
import X.InterfaceC420801kM;
import X.InterfaceC874803bO;
import X.InterfaceC960503pD;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.DeliveryPanelStarter;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelViewModel;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS284S0000000_1;
import kotlin.jvm.internal.AwS145S0400000_16;
import kotlin.jvm.internal.AwS545S0100000_1;

/* JADX INFO: loaded from: classes2.dex */
public final class DeliveryFullScreenFragment extends ECBaseFragment implements InterfaceC1171660gay, InterfaceC1075600e62<ViewModelProvider.Factory> {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTcvLGExKTHELIOSYpZys2JCw6LD0qZgEpJSYlLTc1Dzo/JBYvOyo2JgM+KCg+LSs4";
    public Integer LLILLL;
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS545S0100000_1(this, 79));
    public final lifecycleAwareLazy LLILZIL;
    public final C01GW LLILZLL;

    public DeliveryFullScreenFragment() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(DeliveryPanelViewModel.class);
        AwS545S0100000_1 awS545S0100000_1 = new AwS545S0100000_1(c19719912DlLIZ, 77);
        this.LLILZIL = new lifecycleAwareLazy(this, awS545S0100000_1, new AwS145S0400000_16(this, awS545S0100000_1, c19719912DlLIZ, AFwS284S0000000_1.get$arr$(3), 1));
        this.LLILZLL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 78));
    }

    @Override // X.InterfaceC960503pD, X.C11E6
    public final LifecycleOwner getLifecycleOwner() {
        return this;
    }

    @Override // X.C11E9
    public final C11E6 getLifecycleOwnerHolder() {
        return this;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, X.InterfaceC1748820vbs
    public final String getPageName() {
        return "logistics";
    }

    @Override // X.C11DL
    public final InterfaceC874803bO getReceiver() {
        return this;
    }

    @Override // X.C11E9
    public final C11DL<InterfaceC960503pD> getReceiverHolder() {
        return this;
    }

    @Override // X.C11E9
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    public final C040Q VR() {
        return (C040Q) this.LLILZLL.getValue();
    }

    @Override // X.InterfaceC1075600e62
    public final ViewModelProvider.Factory jl() {
        return (ViewModelProvider.Factory) this.LLILZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        C040Q c040qVR = VR();
        if (c040qVR != null) {
            c040qVR.LJIIIZ();
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        C040Q c040qVR = VR();
        if (c040qVR != null) {
            c040qVR.LJIIJJI();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        C040Q c040qVR;
        super.onActivityCreated(bundle);
        C040Q c040qVR2 = VR();
        if (c040qVR2 != null) {
            c040qVR2.LJ(bundle);
        }
        C19EG activity = getActivity();
        if (activity != null && (c040qVR = VR()) != null) {
            c040qVR.LIZJ(activity, bundle);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Integer num;
        DeliveryPanelStarter.EnterParam enterParam;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null && (enterParam = (DeliveryPanelStarter.EnterParam) arguments.getParcelable("enter_param")) != null) {
            num = enterParam.bizType;
        } else {
            num = null;
        }
        this.LLILLL = num;
        C040Q c040qVR = VR();
        if (c040qVR != null) {
            c040qVR.LJII(bundle);
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        C040Q c040qVR;
        super.onSaveInstanceState(bundle);
        C19EG activity = getActivity();
        if (activity != null && (c040qVR = VR()) != null) {
            c040qVR.LIZLLL(activity, bundle);
        }
    }

    @Override // X.C11E9
    public final <VM1 extends JediViewModel<S1>, S1 extends C004I, R> R withState(VM1 vm1, Function1<? super S1, ? extends R> function1) {
        return function1.invoke(vm1.FQ2());
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewLJIIIIZZ;
        C040Q c040qVR = VR();
        C19GS c19gs = null;
        if (c040qVR != null) {
            viewLJIIIIZZ = c040qVR.LJIIIIZZ(layoutInflater, viewGroup, bundle);
        } else {
            viewLJIIIIZZ = null;
        }
        if (!(viewLJIIIIZZ instanceof View)) {
            viewLJIIIIZZ = null;
        }
        if (viewLJIIIIZZ != null) {
            try {
                ViewTreeLifecycleOwner.set(viewLJIIIIZZ, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewLJIIIIZZ, this);
                viewLJIIIIZZ.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewLJIIIIZZ;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewLJIIIIZZ;
    }

    @Override // X.C11E9
    public final <S extends C004I> InterfaceC420801kM subscribe(JediViewModel<S> jediViewModel, C1765020w20<S> c1765020w20, Function2<? super InterfaceC960503pD, ? super S, Unit> function2) {
        return C11EA.LJIIJJI(this, jediViewModel, c1765020w20, function2);
    }

    @Override // X.C11E9
    public final <S extends C004I, A> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1765020w20<C11EC<A>> c1765020w20, Function2<? super InterfaceC960503pD, ? super A, Unit> function2) {
        return C11EA.LJI(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1765020w20<C11EF<A, B>> c1765020w20, InterfaceC1631620sYq<? super InterfaceC960503pD, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C11EA.LJFF(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, c1765020w20, interfaceC1631620sYq);
    }

    @Override // X.C11E9
    public final <S extends C004I, T> InterfaceC420801kM asyncSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends AbstractC1252750ihl<? extends T>> interfaceC2217241BqE, C1765020w20<C11EC<AbstractC1252750ihl<T>>> c1765020w20, Function2<? super InterfaceC960503pD, ? super Throwable, Unit> function2, Function1<? super InterfaceC960503pD, Unit> function1, Function2<? super InterfaceC960503pD, ? super T, Unit> function22) {
        return C11EA.LIZ(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2, function1, function22);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B, C> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1765020w20<C1634100scq<A, B, C>> c1765020w20, InterfaceC1631630sYr<? super InterfaceC960503pD, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C11EA.LJ(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1765020w20, interfaceC1631630sYr);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B, C, D> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1765020w20<C1644460stY<A, B, C, D>> c1765020w20, InterfaceC1685420txc<? super InterfaceC960503pD, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C11EA.LIZLLL(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1765020w20, interfaceC1685420txc);
    }
}
