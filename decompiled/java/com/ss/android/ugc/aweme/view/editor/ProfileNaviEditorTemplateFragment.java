package com.ss.android.ugc.aweme.view.editor;

import X.AbstractC1252750ihl;
import X.C004I;
import X.C01GW;
import X.C098200Yq;
import X.C11DL;
import X.C11E6;
import X.C11EA;
import X.C11EC;
import X.C11EF;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C1634100scq;
import X.C1644460stY;
import X.C1685300txQ;
import X.C1765020w20;
import X.C189200o6;
import X.C19403610vi;
import X.C19404010vm;
import X.C19423210ys;
import X.C19424410z4;
import X.C19429110zp;
import X.C19EG;
import X.C19GS;
import X.C20684815ws;
import X.C2217371BqR;
import X.C2344009Gk;
import X.C422660Ghk;
import X.C452501pT;
import X.C786410Ut5;
import X.C985403tE;
import X.InterfaceC1171660gay;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC19403810vk;
import X.InterfaceC2217241BqE;
import X.InterfaceC420801kM;
import X.InterfaceC874803bO;
import X.InterfaceC960503pD;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.jedi.arch.BaseJediViewModel;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.model.api.data.ProfileNaviDataModel;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviEditorState;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviOnboardingState;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviOnboardingViewModel;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviSwitcherViewModel;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS41S0001000_29;
import kotlin.jvm.internal.AwS41S0010000_29;
import kotlin.jvm.internal.AwS430S0200000_29;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlin.jvm.internal.AwS643S0100000_29;

/* JADX INFO: loaded from: classes30.dex */
public final class ProfileNaviEditorTemplateFragment extends Fragment implements InterfaceC1171660gay, InterfaceC19403810vk {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjMlLDh9LSElPSAhHELIOSZhU+Jik6JCACKDk6DSElPSAhHCAhOSMyPCAKOy40JSAiPQ==";
    public final boolean LL;
    public RecyclerView LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;

    public ProfileNaviEditorTemplateFragment() {
        this(false);
    }

    @Override // X.InterfaceC960503pD, X.C11E6
    public final LifecycleOwner getLifecycleOwner() {
        return this;
    }

    @Override // X.C11E9
    public final C11E6 getLifecycleOwnerHolder() {
        return this;
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

    public final RecyclerView MR() {
        View viewFindViewById = this.LLILLJJLI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.p3j) : null;
            this.LLILLJJLI = (RecyclerView) viewFindViewById;
        }
        return (RecyclerView) viewFindViewById;
    }

    public final ProfileNaviOnboardingViewModel NR() {
        return (ProfileNaviOnboardingViewModel) this.LLILLL.getValue();
    }

    @Override // X.InterfaceC19403810vk
    public final void Nh() {
        RR(new AwS573S0100000_29(this, 587));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLILLJJLI = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        OR(null);
        ProfileNaviOnboardingViewModel profileNaviOnboardingViewModelNR = NR();
        profileNaviOnboardingViewModelNR.getClass();
        profileNaviOnboardingViewModelNR.withState(new AwS608S0100000_29(profileNaviOnboardingViewModelNR, 570));
        C11EA.LJII(this, NR(), new C2217371BqR() { // from class: X.10z1
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((ProfileNaviOnboardingState) obj).getStarterAvatarList();
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((ProfileNaviOnboardingState) obj).setStarterAvatarList((List) obj2);
            }
        }, new AwS643S0100000_29(this, 189));
        C11EA.LJII(this, NR(), new C2217371BqR() { // from class: X.10yw
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((ProfileNaviOnboardingState) obj).getStarterAvatarId();
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((ProfileNaviOnboardingState) obj).setStarterAvatarId((Integer) obj2);
            }
        }, new AwS643S0100000_29(this, 190));
    }

    public ProfileNaviEditorTemplateFragment(boolean z) {
        this.LL = z;
        this.LLILLL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 588));
        this.LLILZ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 586));
        this.LLILZIL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 589));
    }

    public final void OR(List<C19404010vm> list) {
        C19403610vi c19403610vi;
        C19404010vm next;
        if (MR().getAdapter() instanceof C19403610vi) {
            c19403610vi = (C19403610vi) MR().getAdapter();
        } else {
            c19403610vi = null;
        }
        if (c19403610vi == null) {
            c19403610vi = new C19403610vi(this, false);
            RecyclerView recyclerViewMR = MR();
            if (recyclerViewMR != null) {
                recyclerViewMR.setLayoutManager(new GridLayoutManager(getActivity(), 2));
            }
            RecyclerView recyclerViewMR2 = MR();
            if (recyclerViewMR2 != null) {
                recyclerViewMR2.addItemDecoration(new C422660Ghk(getResources().getDimensionPixelSize(R.dimen.ad7)));
            }
            RecyclerView recyclerViewMR3 = MR();
            if (recyclerViewMR3 != null) {
                recyclerViewMR3.setAdapter(c19403610vi);
            }
        }
        c19403610vi.LLILLJJLI = list;
        c19403610vi.notifyDataSetChanged();
        if (list != null && !list.isEmpty()) {
            ProfileNaviOnboardingViewModel profileNaviOnboardingViewModelNR = NR();
            requireActivity();
            Integer starterAvatarId = ((ProfileNaviOnboardingState) profileNaviOnboardingViewModelNR.hR2()).getStarterAvatarId();
            if (starterAvatarId != null) {
                BaseJediViewModel baseJediViewModel = (BaseJediViewModel) this.LLILZ.getValue();
                requireActivity();
                if (!((ProfileNaviEditorState) baseJediViewModel.hR2()).getHasEdited()) {
                    Iterator<C19404010vm> it2 = list.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next = it2.next();
                            if (next.LIZ() == starterAvatarId.intValue()) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    C19404010vm c19404010vm = next;
                    if (c19404010vm != null) {
                        PR(c19404010vm);
                        return;
                    }
                    return;
                }
                return;
            }
            BaseJediViewModel baseJediViewModel2 = (BaseJediViewModel) this.LLILZ.getValue();
            requireActivity();
            if (((ProfileNaviEditorState) baseJediViewModel2.hR2()).getHasEdited()) {
                return;
            }
            this.LLILZIL.getValue().getClass();
            C19424410z4 c19424410z4 = C19429110zp.LIZIZ;
            if (c19424410z4 != null && c19424410z4.LIZ != null) {
                return;
            }
            PR((C19404010vm) ListProtector.get(list, 0));
        }
    }

    public final void PR(C19404010vm c19404010vm) {
        int i;
        ProfileNaviOnboardingViewModel profileNaviOnboardingViewModelNR = NR();
        int iLIZ = c19404010vm.LIZ();
        profileNaviOnboardingViewModelNR.getClass();
        profileNaviOnboardingViewModelNR.setState(new AwS41S0001000_29(iLIZ, 33));
        ((ProfileNaviSwitcherViewModel) this.LLILZIL.getValue()).mR2(new ProfileNaviDataModel(null, null, null, null, c19404010vm.LIZJ, null, 0, 111, null));
        JediViewModel jediViewModel = (JediViewModel) this.LLILZ.getValue();
        boolean z = this.LL;
        boolean z2 = !z;
        jediViewModel.getClass();
        if (z2 && !z) {
            i = 0;
        } else {
            i = 1;
        }
        if (((ProfileNaviEditorState) jediViewModel.FQ2()).getCurrentTabIndex() != i) {
            jediViewModel.setStateImmediate(new AwS41S0001000_29(i, 32));
        }
        JediViewModel jediViewModel2 = (JediViewModel) this.LLILZ.getValue();
        jediViewModel2.getClass();
        jediViewModel2.setState(new AwS41S0010000_29(false, 45));
    }

    public final void RR(Function0<Unit> function0) {
        BaseJediViewModel baseJediViewModel = (BaseJediViewModel) this.LLILZ.getValue();
        requireActivity();
        if (((ProfileNaviEditorState) baseJediViewModel.hR2()).getHasEdited()) {
            C1397580mTM c1397580mTM = new C1397580mTM(requireActivity());
            c1397580mTM.LJFF(2131827141);
            c1397580mTM.LIZ(2131827138);
            c1397580mTM.LJII = true;
            C985403tE.LIZ(c1397580mTM, new AwS608S0100000_29(function0, (Function0<Unit>) 329));
            new C1397510mTF(c1397580mTM).LIZLLL();
            return;
        }
        function0.invoke();
    }

    @Override // X.InterfaceC19403810vk
    public final void rP(C19404010vm c19404010vm) {
        RR(new AwS430S0200000_29(c19404010vm, this, 45));
    }

    @Override // X.C11E9
    public final <VM1 extends JediViewModel<S1>, S1 extends C004I, R> R withState(VM1 vm1, Function1<? super S1, ? extends R> function1) {
        return function1.invoke(vm1.FQ2());
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19423210ys.LIZ.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", C19423210ys.LIZIZ);
        C20684815ws.LJIILLIIL("show_avatar_edit_page", c2344009Gk.LIZ);
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.eh6, viewGroup, false);
        C19GS c19gs = null;
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
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
