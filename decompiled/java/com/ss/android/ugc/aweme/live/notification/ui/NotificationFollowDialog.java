package com.ss.android.ugc.aweme.live.notification.ui;

import X.AbstractC1252750ihl;
import X.AnonymousClass0412;
import X.C004I;
import X.C011Z;
import X.C03H5;
import X.C098200Yq;
import X.C0OVM;
import X.C0ZP4;
import X.C10EJ;
import X.C10EK;
import X.C10EW;
import X.C1119850fFP;
import X.C11DL;
import X.C11E6;
import X.C11EA;
import X.C11EC;
import X.C11EF;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C11NJ;
import X.C1233040iBy;
import X.C1252380ihA;
import X.C1365450ldX;
import X.C1391190mJ3;
import X.C13IQ;
import X.C13LE;
import X.C1634100scq;
import X.C1644460stY;
import X.C1685300txQ;
import X.C1765020w20;
import X.C1770850wBP;
import X.C189200o6;
import X.C19474211Gy;
import X.C197039127h;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C343970De7;
import X.C422820Gi0;
import X.C735350Ssv;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C824390WVp;
import X.DialogInterfaceOnCancelListenerC19332810kI;
import X.DialogInterfaceOnDismissListenerC19333210kM;
import X.InterfaceC0148002o;
import X.InterfaceC1075600e62;
import X.InterfaceC1171660gay;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2217241BqE;
import X.InterfaceC420801kM;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import X.InterfaceC874803bO;
import X.InterfaceC960503pD;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.design.app.LiveControllableDialogFragment;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.user.repository.UserViewModel;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS156S0400000_28;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS633S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public class NotificationFollowDialog extends LiveControllableDialogFragment implements InterfaceC1171660gay, InterfaceC724530SbT, InterfaceC1075600e62<AnonymousClass0412> {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiklPyp9Jio4ICk6HELIOSKyQ4ICA9ZjAlZwE8PCwqICwyPCwjJwk8JCkjPgs6KSkjLg==";
    public final User LL;
    public final int LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final C10EW LLILZLL;
    public final Map<String, String> LLIZ;
    public C422820Gi0 LLIZLLLIL;
    public ConstraintLayout LLJ;
    public TuxNavBar LLJI;
    public TuxTextView LLJIJIL;
    public C197039127h LLJILJIL;
    public FrameLayout LLJILJILJ;
    public final lifecycleAwareLazy LLJJI;
    public final DialogInterfaceOnDismissListenerC19333210kM LLJJIII;
    public final DialogInterfaceOnCancelListenerC19332810kI LLJJIJI;
    public final String LLILZIL = "";
    public final AnonymousClass0412 LLJILLL = new AnonymousClass0412();
    public final C11NJ LLJJ = new C11NJ();

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

    @Override // X.InterfaceC960503pD, X.C11E6
    public final LifecycleOwner getLifecycleOwner() {
        return this;
    }

    @Override // X.C11E9
    public final C11E6 getLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.C11DL
    public final InterfaceC874803bO getReceiver() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.C11E9
    public final C11DL<InterfaceC960503pD> getReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // X.C11E9
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    public final void MR() {
        C1233040iBy c1233040iBy = new C1233040iBy(getContext());
        c1233040iBy.LIZIZ(2131848597);
        c1233040iBy.LIZLLL();
    }

    public final void NR() {
        User user = this.LL;
        int i = (user == null || user.getFollowStatus() != 0) ? 0 : 1;
        UserViewModel userViewModel = (UserViewModel) this.LLJJI.getValue();
        C0OVM c0ovm = new C0OVM();
        User user2 = this.LL;
        c0ovm.LIZJ(user2 != null ? user2.getUid() : null);
        User user3 = this.LL;
        c0ovm.LIZIZ(user3 != null ? user3.getSecUid() : null);
        C1252380ihA c1252380ihA = c0ovm.LIZ;
        c1252380ihA.LIZLLL = i;
        c1252380ihA.LJI = "other_places";
        c1252380ihA.LJ = 0;
        User user4 = this.LL;
        c0ovm.LIZ.LJIIJJI = user4 != null ? user4.getFollowerStatus() : 0;
        userViewModel.hR2(c0ovm.LIZ());
        User user5 = this.LL;
        String str = (user5 == null || user5.getFollowerStatus() != 1) ? "single" : "mutual";
        C735350Ssv c735350Ssv = new C735350Ssv();
        User user6 = this.LL;
        c735350Ssv.LJJLIIIJJIZ = user6 != null ? user6.getUid() : null;
        c735350Ssv.LIZLLL = this.LLILLL;
        c735350Ssv.LJJLIIJ = "notification_bell";
        c735350Ssv.LJJLIIIJ = this.LLILZ;
        c735350Ssv.LJJLIIIJILLIZJL = Intrinsics.LJFF(this.LLILZIL, "") ? "other_places" : this.LLILZIL;
        c735350Ssv.LJJZ = str;
        User user7 = this.LL;
        c735350Ssv.LJLIIIL = (user7 == null || !user7.isSecret()) ? 0 : 1;
        C1365450ldX.LIZLLL(c735350Ssv, this.LL);
        c735350Ssv.LJIILJJIL();
        C10EJ c10ej = C10EJ.LIZ;
        User user8 = this.LL;
        String uid = user8 != null ? user8.getUid() : null;
        User user9 = this.LL;
        int followStatus = user9 != null ? user9.getFollowStatus() : 0;
        User user10 = this.LL;
        boolean z = user10 != null && user10.getAccountType() == 3;
        c10ej.getClass();
        C10EJ.LJII(followStatus, uid, z);
    }

    public final C197039127h OR() {
        View viewFindViewById = this.LLJILJIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.iec) : null;
            this.LLJILJIL = (C197039127h) viewFindViewById;
        }
        return (C197039127h) viewFindViewById;
    }

    public final C422820Gi0 PR() {
        View viewFindViewById = this.LLIZLLLIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.ies) : null;
            this.LLIZLLLIL = (C422820Gi0) viewFindViewById;
        }
        return (C422820Gi0) viewFindViewById;
    }

    public final ConstraintLayout RR() {
        View viewFindViewById = this.LLJ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.iew) : null;
            this.LLJ = (ConstraintLayout) viewFindViewById;
        }
        return (ConstraintLayout) viewFindViewById;
    }

    public final FrameLayout SR() {
        View viewFindViewById = this.LLJILJILJ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.tqy) : null;
            this.LLJILJILJ = (FrameLayout) viewFindViewById;
        }
        return (FrameLayout) viewFindViewById;
    }

    @Override // androidx.fragment.app.DialogFragment
    public final void dismiss() {
        String str = TuxSheet._pnsPageId;
        C1391190mJ3.LJFF(this, C343970De7.LIZ);
    }

    @Override // com.bytedance.android.live.design.app.LiveControllableDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLJJ.LJ();
        this.LLIZLLLIL = null;
        this.LLJ = null;
        this.LLJI = null;
        this.LLJIJIL = null;
        this.LLJILJIL = null;
        this.LLJILJILJ = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (C824390WVp.LIZJ(getContext())) {
            C10EK.LIZ.getClass();
            if (C10EK.LJII("live_push")) {
                return;
            }
        }
        dismiss();
    }

    @Override // X.InterfaceC1075600e62
    public final /* bridge */ /* synthetic */ ViewModelProvider.Factory jl() {
        return this.LLJILLL;
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        boolean z;
        C1119850fFP c1119850fFP = C011Z.LIZ;
        if (!c1119850fFP.LJIJJ(getContext()) && c1119850fFP.LJIIZILJ(getContext())) {
            z = true;
        } else {
            z = false;
        }
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        if (z) {
            return layoutInflaterOnGetLayoutInflater.cloneInContext(new ContextThemeWrapper(getContext(), c1119850fFP.LJIIIZ()));
        }
        return layoutInflaterOnGetLayoutInflater;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0197  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r11, android.os.Bundle r12) {
        /*
            Method dump skipped, instruction units count: 413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.live.notification.ui.NotificationFollowDialog.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // X.C11E9
    public final <VM1 extends JediViewModel<S1>, S1 extends C004I, R> R withState(VM1 vm1, Function1<? super S1, ? extends R> function1) {
        return function1.invoke(vm1.FQ2());
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.dck, viewGroup, false);
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

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o> C0ZP4 subscribe(AssemViewModel<S> assemViewModel, C1770850wBP<S> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super S, Unit> function2) {
        return C736680Sv4.LJIILLIIL(this, assemViewModel, c1770850wBP, function1, function2);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1765020w20<C11EF<A, B>> c1765020w20, InterfaceC1631620sYq<? super InterfaceC960503pD, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C11EA.LJFF(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, c1765020w20, interfaceC1631620sYq);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJIILJJIL(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJ(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    public NotificationFollowDialog(User user, int i, String str, String str2, C10EW c10ew, Map map) {
        this.LL = user;
        this.LLILLJJLI = i;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZLL = c10ew;
        this.LLIZ = map;
        AwS633S0100000_19 awS633S0100000_19 = new AwS633S0100000_19(this, 252);
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(UserViewModel.class);
        AwS560S0100000_16 awS560S0100000_16 = new AwS560S0100000_16((C13IQ) c19719912DlLIZ, 746);
        this.LLJJI = new lifecycleAwareLazy(this, awS560S0100000_16, new AwS156S0400000_28(this, awS560S0100000_16, c19719912DlLIZ, awS633S0100000_19, 14));
        this.LLJJIII = new DialogInterfaceOnDismissListenerC19333210kM(this, 11);
        this.LLJJIJI = new DialogInterfaceOnCancelListenerC19332810kI(this, 5);
    }

    @Override // X.C11E9
    public final <S extends C004I, T> InterfaceC420801kM asyncSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends AbstractC1252750ihl<? extends T>> interfaceC2217241BqE, C1765020w20<C11EC<AbstractC1252750ihl<T>>> c1765020w20, Function2<? super InterfaceC960503pD, ? super Throwable, Unit> function2, Function1<? super InterfaceC960503pD, Unit> function1, Function2<? super InterfaceC960503pD, ? super T, Unit> function22) {
        return C11EA.LIZ(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2, function1, function22);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1770850wBP<C19474211Gy<A, B>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631620sYq<? super C03H5, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C736680Sv4.LIZLLL(assemViewModel, this, c1770850wBP, function1, interfaceC1631620sYq, interfaceC2217241BqE, interfaceC2217241BqE2);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B, C> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1765020w20<C1634100scq<A, B, C>> c1765020w20, InterfaceC1631630sYr<? super InterfaceC960503pD, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C11EA.LJ(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1765020w20, interfaceC1631630sYr);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B, C, D> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1765020w20<C1644460stY<A, B, C, D>> c1765020w20, InterfaceC1685420txc<? super InterfaceC960503pD, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C11EA.LIZLLL(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1765020w20, interfaceC1685420txc);
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
