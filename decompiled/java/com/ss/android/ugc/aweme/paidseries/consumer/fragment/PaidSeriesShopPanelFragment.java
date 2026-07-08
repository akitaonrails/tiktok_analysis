package com.ss.android.ugc.aweme.paidseries.consumer.fragment;

import X.C01GW;
import X.C03H5;
import X.C098200Yq;
import X.C0OM1;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1236070iGr;
import X.C1236120iGw;
import X.C1236130iGx;
import X.C1250250idj;
import X.C1388190mED;
import X.C1390920mIc;
import X.C13LE;
import X.C1685300txQ;
import X.C1749280vcc;
import X.C1770850wBP;
import X.C189200o6;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C2217381BqS;
import X.C452070Ho5;
import X.C452501pT;
import X.C497820Jfg;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C757130Tmx;
import X.C786410Ut5;
import X.EnumC1236010iGl;
import X.InterfaceC0148002o;
import X.InterfaceC1236080iGs;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.paidseries.consumer.viewmodel.PaidSeriesShopPanelViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.AwS633S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class PaidSeriesShopPanelFragment extends Fragment implements InterfaceC1236080iGs, InterfaceC724530SbT {
    public static final C757130Tmx LLJI;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjUtICsgLTclLDx9KyoiOjHELIOSo+LTdiLz0yLygpJzt9GCQlLRw2OiwpOhw7JzUcKCE2JAM+KCg+LSs4";
    public TuxNavBar LL;
    public RecyclerView LLILLJJLI;
    public C1749280vcc LLILLL;
    public C1236130iGx LLILZ;
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS556S0100000_12(this, 531));
    public final AssemVMLazy LLILZLL;
    public final C01GW LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0Tmx] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PaidSeriesShopPanelFragment.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/paidseries/consumer/viewmodel/PaidSeriesShopPanelViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJI = new Object() { // from class: X.0Tmx
        };
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

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    public final PaidSeriesShopPanelViewModel MR() {
        AssemVMLazy assemVMLazy = this.LLILZLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJIJIL;
        return (PaidSeriesShopPanelViewModel) assemVMLazy.getValue();
    }

    public final long getRoomId() {
        return ((Number) this.LLILZIL.getValue()).longValue();
    }

    public PaidSeriesShopPanelFragment() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PaidSeriesShopPanelViewModel.class);
        this.LLILZLL = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), new AwS556S0100000_12(c19719912DlLIZ, 532), new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS563S0100000_19((HasDefaultViewModelProviderFactory) this, 1669), AFwS257S0000000_19.get$arr$(245));
        this.LLIZ = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(290));
        this.LLIZLLLIL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(291));
        this.LLJ = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(199));
    }

    @Override // X.InterfaceC1236080iGs
    public final void rM(long j) {
        C19EG c19egLIZIZ;
        C1236130iGx c1236130iGx = this.LLILZ;
        if (c1236130iGx != null) {
            c1236130iGx.LLLI(j, true);
        }
        C1236070iGr c1236070iGr = PaidSeriesConfirmationPanelFragment.LLJIJIL;
        long roomId = getRoomId();
        long jLongValue = ((Number) this.LLJ.getValue()).longValue();
        c1236070iGr.getClass();
        Bundle bundle = new Bundle();
        bundle.putLong("room_id", roomId);
        bundle.putLong("creator_id", jLongValue);
        PaidSeriesConfirmationPanelFragment paidSeriesConfirmationPanelFragment = new PaidSeriesConfirmationPanelFragment();
        paidSeriesConfirmationPanelFragment.setArguments(bundle);
        Context context = getContext();
        if (context != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null) {
            C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
            c1390920mIc.LJIIIIZZ(1);
            int iLIZ = (int) (((double) C497820Jfg.LIZ(c19egLIZIZ)) * 0.73d);
            TuxSheet tuxSheet = c1390920mIc.LIZ;
            tuxSheet.LLJJL = iLIZ;
            tuxSheet.LLJJIJI = paidSeriesConfirmationPanelFragment;
            tuxSheet.LLJLILLLLZIIL = false;
            tuxSheet.LLJJIJIIJIL = true;
            tuxSheet.LLJLL = true;
            tuxSheet.showNow(c19egLIZIZ.getSupportFragmentManager(), null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        TuxNavBar tuxNavBar;
        super.onViewCreated(view, bundle);
        Context context = getContext();
        if (context != null && (tuxNavBar = this.LL) != null) {
            C0OM1 c0om1 = new C0OM1();
            C1250250idj c1250250idj = new C1250250idj();
            c1250250idj.LIZJ = context.getString(2131847348);
            c0om1.LIZJ = c1250250idj;
            tuxNavBar.setNavActions(c0om1);
        }
        this.LLILZ = new C1236130iGx(new C1236120iGw(R.attr.a04, 2131847344, 2131847449, 2131847349, EnumC1236010iGl.BORDERLESS, MR(), true), this, requireContext());
        RecyclerView recyclerView = this.LLILLJJLI;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        }
        RecyclerView recyclerView2 = this.LLILLJJLI;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(this.LLILZ);
        }
        MR().vQ2(getRoomId());
        C1749280vcc c1749280vcc = this.LLILLL;
        if (c1749280vcc != null) {
            c1749280vcc.LJ();
        }
        AssemViewModel.asyncSubscribe$default(MR(), new C2217381BqS() { // from class: X.0iGp
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1158830gGH) obj).LL;
            }
        }, null, new AwS598S0100000_19(this, 220), new AwS563S0100000_19(this, 1668), new AwS598S0100000_19(this, 221), 2, null);
        C736680Sv4.LJIIIIZZ(this, MR(), new C2217381BqS() { // from class: X.0iGq
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1158830gGH) obj).LLILLL;
            }
        }, C736820SvI.LIZLLL(), new AwS633S0100000_19(this, 68), 4);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19GS c19gs;
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.bh8, viewGroup, false);
        this.LL = (TuxNavBar) viewTd.findViewById(R.id.v7e);
        this.LLILLJJLI = (RecyclerView) viewTd.findViewById(R.id.v7d);
        this.LLILLL = (C1749280vcc) viewTd.findViewById(R.id.q15);
        try {
            ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(viewTd, this);
            viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity = getActivity();
            if (activity instanceof C19GS) {
                c19gs = (C19GS) activity;
            } else {
                c19gs = null;
            }
            C1685300txQ.LIZ(c19gs);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return viewTd;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return viewTd;
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
