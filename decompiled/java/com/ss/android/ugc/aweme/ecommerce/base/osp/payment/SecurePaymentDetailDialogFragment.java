package com.ss.android.ugc.aweme.ecommerce.base.osp.payment;

import X.AbstractC1252750ihl;
import X.C004I;
import X.C01GW;
import X.C098200Yq;
import X.C0OM1;
import X.C1018703yb;
import X.C11DL;
import X.C11E6;
import X.C11EA;
import X.C11EC;
import X.C11EF;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1634100scq;
import X.C1644460stY;
import X.C1685300txQ;
import X.C1765020w20;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C452501pT;
import X.C786410Ut5;
import X.C819603Ic;
import X.C882603ce;
import X.InterfaceC1171660gay;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC2217241BqE;
import X.InterfaceC420801kM;
import X.InterfaceC874803bO;
import X.InterfaceC960503pD;
import android.app.Dialog;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.ecommerce.base.common.view.CommerceBottomSheetDialogFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.usertrust.UserTrustItem;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.usertrust.UserTrustItemDescriptionChunk;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS580S0100000_1;
import poa.a0;

/* JADX INFO: loaded from: classes2.dex */
public final class SecurePaymentDetailDialogFragment extends CommerceBottomSheetDialogFragment implements InterfaceC1171660gay {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTcvLGExKTYpZyAgOGHELIOSs8KDY+LSs4Zxw2KzA+LB8yMSgpJzsXLTEtICMXISQgJigVOiQrJCo9PA==";
    public TuxNavBar LLJI;
    public RecyclerView LLJIJIL;
    public PaymentMethodsData LLJILJIL;
    public HashMap<String, Object> LLJILJILJ;
    public a0 LLJILLL;
    public Integer LLJJ;
    public String LLJJI;
    public final C01GW LLJJIII;
    public boolean LLJJIJI;
    public boolean LLJJIJIIJIL;

    public SecurePaymentDetailDialogFragment() {
        super(0);
        this.LLJJIII = C452501pT.LIZIZ(new AwS545S0100000_1(this, 933));
        this.LLJJIJIIJIL = true;
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

    public final RecyclerView cS() {
        View viewFindViewById = this.LLJIJIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.us_order_submit_user_trust_container) : null;
            this.LLJIJIL = (RecyclerView) viewFindViewById;
        }
        return (RecyclerView) viewFindViewById;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLJI = null;
        this.LLJIJIL = null;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.view.CommerceBottomSheetDialogFragment, com.ss.android.ugc.aweme.ecommerce.base.common.view.ECBaseBottomSheetDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        View decorView;
        super.onStart();
        C882603ce c882603ce = (C882603ce) this.LLJJIII.getValue();
        c882603ce.getClass();
        c882603ce.LIZLLL = SystemClock.elapsedRealtime();
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        ViewTreeLifecycleOwner.set(decorView, this);
        ViewTreeViewModelStoreOwner.set(decorView, this);
        decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        C882603ce c882603ce = (C882603ce) this.LLJJIII.getValue();
        c882603ce.getClass();
        c882603ce.LIZJ = SystemClock.elapsedRealtime() - c882603ce.LIZLLL;
        C1018703yb.LIZJ("tiktokec_stay_page", c882603ce.LIZ, new AwS580S0100000_1(c882603ce, 184));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.view.ECBaseBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        Integer numValueOf;
        String string2;
        UserTrustItem userTrustItem;
        List<UserTrustItemDescriptionChunk> list;
        a0 a0Var;
        PaymentMethodsData paymentMethodsData;
        UserTrustItem userTrustItem2;
        List<UserTrustItemDescriptionChunk> list2;
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("title")) == null) {
            string = "Secure Payments";
        }
        Bundle arguments2 = getArguments();
        View viewFindViewById = null;
        if (arguments2 != null) {
            numValueOf = Integer.valueOf(arguments2.getInt("with_delivery_info"));
        } else {
            numValueOf = null;
        }
        this.LLJJ = numValueOf;
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            string2 = arguments3.getString("fill_type");
        } else {
            string2 = null;
        }
        this.LLJJI = string2;
        View view2 = this.LLJI;
        if (view2 == null) {
            View view3 = getView();
            if (view3 != null) {
                viewFindViewById = view3.findViewById(R.id.o9r);
            }
            this.LLJI = (TuxNavBar) viewFindViewById;
            view2 = viewFindViewById;
        }
        TuxNavBar tuxNavBar = (TuxNavBar) view2;
        C0OM1 c0om1 = new C0OM1();
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = string;
        c0om1.LIZJ = c1250250idj;
        c0om1.LIZLLL = true;
        if (this.LLJJIJI) {
            C1251150ifB c1251150ifB = new C1251150ifB();
            c1251150ifB.LIZLLL();
            c1251150ifB.LIZJ = R.raw.icon_chevron_left_offset_ltr;
            c1251150ifB.LIZLLL = true;
            c1251150ifB.LIZJ(new AwS545S0100000_1(this, 1195));
            c0om1.LJ(c1251150ifB);
        }
        if (this.LLJJIJIIJIL) {
            C1251150ifB c1251150ifB2 = new C1251150ifB();
            c1251150ifB2.LIZLLL();
            c1251150ifB2.LIZJ = R.raw.icon_x_mark;
            c1251150ifB2.LIZLLL = true;
            c1251150ifB2.LIZJ(new AwS545S0100000_1(this, 1201));
            c0om1.LIZIZ(c1251150ifB2);
        }
        tuxNavBar.setNavActions(c0om1);
        if (this.LLJILLL == null && (paymentMethodsData = this.LLJILJIL) != null && (userTrustItem2 = paymentMethodsData.securePayment) != null && (list2 = userTrustItem2.description) != null) {
            this.LLJILLL = new a0(list2, R.attr.a1h, new AwS580S0100000_1(this, 174));
            cS().setLayoutManager(new LinearLayoutManager(getContext()));
            cS().addItemDecoration(new C819603Ic(12));
            cS().setAdapter(this.LLJILLL);
        }
        C882603ce c882603ce = (C882603ce) this.LLJJIII.getValue();
        if (!c882603ce.LIZIZ) {
            C1018703yb.LIZIZ("tiktokec_enter_page", c882603ce.LIZ);
            c882603ce.LIZIZ = true;
        }
        PaymentMethodsData paymentMethodsData2 = this.LLJILJIL;
        if (paymentMethodsData2 != null && (userTrustItem = paymentMethodsData2.securePayment) != null && (list = userTrustItem.description) != null && (a0Var = this.LLJILLL) != null) {
            a0Var.LLILLJJLI = list;
            a0Var.LLLI(list);
        }
    }

    @Override // X.C11E9
    public final <VM1 extends JediViewModel<S1>, S1 extends C004I, R> R withState(VM1 vm1, Function1<? super S1, ? extends R> function1) {
        return function1.invoke(vm1.FQ2());
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.aqw, viewGroup, false);
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
