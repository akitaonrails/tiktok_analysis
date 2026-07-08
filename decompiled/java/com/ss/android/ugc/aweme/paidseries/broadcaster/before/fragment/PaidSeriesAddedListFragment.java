package com.ss.android.ugc.aweme.paidseries.broadcaster.before.fragment;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03H5;
import X.C098200Yq;
import X.C0OM1;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C11S5;
import X.C1236360iHK;
import X.C1250250idj;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1390130mHL;
import X.C13LE;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C1701940uOG;
import X.C1749280vcc;
import X.C1770850wBP;
import X.C189200o6;
import X.C19474211Gy;
import X.C197039127h;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C2217381BqS;
import X.C338490DOt;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C452501pT;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C757170Tn1;
import X.C786410Ut5;
import X.C960203pA;
import X.C987103tV;
import X.InterfaceC0148002o;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC724530SbT;
import X.InterfaceC724760Sbq;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import Y.ACListenerS154S0100000_19;
import Y.AfS187S0100000_18;
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
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.experiment.PaidContentImageSettings;
import com.ss.android.ugc.aweme.paidseries.broadcaster.before.service.PaidSeriesLiveApiService;
import com.ss.android.ugc.aweme.paidseries.broadcaster.before.viewmodel.PaidSeriesAddedSeriesViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.AwS633S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class PaidSeriesAddedListFragment extends Fragment implements InterfaceC724530SbT {
    public static final C757170Tn1 LLJJI;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIII;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjUtICsgLTclLDx9KjcjKCswKTY4LDHELIOS19KiAqJj02ZiM+KCg+LSs4Zx8yISEfLD06LTYNLSs2LAklOjsVOiQrJCo9PA==";
    public TuxNavBar LLILLJJLI;
    public TuxTextView LLILLL;
    public ViewGroup LLILZ;
    public ViewGroup LLILZIL;
    public C1749280vcc LLILZLL;
    public SmartImageView LLIZ;
    public TuxTextView LLIZLLLIL;
    public RecyclerView LLJ;
    public C197039127h LLJI;
    public C1390130mHL LLJIJIL;
    public final AssemVMLazy LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(283));
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1655));

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0Tn1] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PaidSeriesAddedListFragment.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/paidseries/broadcaster/before/viewmodel/PaidSeriesAddedSeriesViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIII = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJJI = new Object() { // from class: X.0Tn1
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

    public PaidSeriesAddedListFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PaidSeriesAddedSeriesViewModel.class);
        AwS556S0100000_12 awS556S0100000_12 = new AwS556S0100000_12(c19719912DlLIZ, 529);
        AFwS257S0000000_19 aFwS257S0000000_19 = AFwS257S0000000_19.get$arr$(242);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS556S0100000_12, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS563S0100000_19((HasDefaultViewModelProviderFactory) this, 1656), aFwS257S0000000_19, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS556S0100000_12, new AwS563S0100000_19((Fragment) this, 1657), aFwS257S0000000_19, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS556S0100000_12, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS563S0100000_19((HasDefaultViewModelProviderFactory) this, 1659), aFwS257S0000000_19, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJILJILJ = assemVMLazy;
        this.LLJILLL = C452501pT.LIZIZ(new AwS556S0100000_12(this, 528));
        this.LLJJ = C452501pT.LIZIZ(new AwS556S0100000_12(this, 530));
    }

    public final C1236360iHK MR() {
        return (C1236360iHK) this.LLJILJIL.getValue();
    }

    public final PaidSeriesAddedSeriesViewModel OR() {
        AssemVMLazy assemVMLazy = this.LLJILJILJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIII;
        return (PaidSeriesAddedSeriesViewModel) assemVMLazy.getValue();
    }

    public final long getRoomId() {
        return ((Number) this.LLJILLL.getValue()).longValue();
    }

    public final void NR() {
        PaidSeriesAddedSeriesViewModel paidSeriesAddedSeriesViewModelOR = OR();
        paidSeriesAddedSeriesViewModelOR.disposeOnClear(((PaidSeriesLiveApiService) paidSeriesAddedSeriesViewModelOR.LL.getValue()).LIZLLL().getLivePaidSeriesList(getRoomId()).LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LJJIIZ(new AfS187S0100000_18(paidSeriesAddedSeriesViewModelOR, 95), new AfS187S0100000_18(paidSeriesAddedSeriesViewModelOR, 96)));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        NR();
    }

    public final void PR(int i) {
        TuxNavBar tuxNavBar;
        Context context = getContext();
        if (context != null && (tuxNavBar = this.LLILLJJLI) != null) {
            C0OM1 c0om1 = new C0OM1();
            C1250250idj c1250250idj = new C1250250idj();
            c1250250idj.LIZJ = context.getString(2131847362, Integer.valueOf(i));
            c0om1.LIZJ = c1250250idj;
            tuxNavBar.setNavActions(c0om1);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Boolean boolValueOf;
        String str;
        Context context;
        C1749280vcc c1749280vcc = this.LLILZLL;
        if (c1749280vcc != null && (context = c1749280vcc.getContext()) != null) {
            PR(0);
            TuxTextView tuxTextView = this.LLILLL;
            if (tuxTextView != null) {
                tuxTextView.setText(context.getString(2131847346, "tiktok.com/series"));
            }
        }
        Context context2 = getContext();
        if (context2 != null) {
            boolValueOf = Boolean.valueOf(C960203pA.LIZIZ(context2));
        } else {
            boolValueOf = null;
        }
        if (Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
            str = PaidContentImageSettings.LIZ().sellingSeriesGuidanceImage.dark;
        } else {
            str = PaidContentImageSettings.LIZ().sellingSeriesGuidanceImage.light;
        }
        C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
        c1331670kl3LJIIIZ.LJJ(this.LLIZ);
        C786410Ut5.h3(c1331670kl3LJIIIZ);
        C1749280vcc c1749280vcc2 = this.LLILZLL;
        if (c1749280vcc2 != null) {
            c1749280vcc2.LJ();
        }
        C197039127h c197039127h = this.LLJI;
        if (c197039127h != null) {
            C786410Ut5.U8(c197039127h, new ACListenerS154S0100000_19(this, 123));
        }
        C736680Sv4.LJIIIIZZ(this, OR(), new C2217381BqS() { // from class: X.0iHH
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1158800gGE) obj).LL;
            }
        }, C736820SvI.LIZLLL(), new AwS633S0100000_19(this, 64), 4);
        C736680Sv4.LJIIIIZZ(this, OR(), new C2217381BqS() { // from class: X.0iHI
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1158800gGE) obj).LLILLJJLI;
            }
        }, C736820SvI.LIZLLL(), new AwS633S0100000_19(this, 65), 4);
        C736680Sv4.LJIIIIZZ(this, OR(), new C2217381BqS() { // from class: X.0iHJ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1158800gGE) obj).LLILLL;
            }
        }, C736820SvI.LIZLLL(), new AwS633S0100000_19(this, 66), 4);
        AssemViewModel.asyncSubscribe$default(OR(), new C2217381BqS() { // from class: X.0iHD
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1158800gGE) obj).LLILZIL;
            }
        }, null, new AwS598S0100000_19(this, 202), new AwS563S0100000_19(this, 1658), new AwS598S0100000_19(this, 203), 2, null);
        AssemViewModel.asyncSubscribe$default(OR(), new C2217381BqS() { // from class: X.0iHE
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1158800gGE) obj).LLILZ;
            }
        }, null, new AwS598S0100000_19(this, 204), new AwS563S0100000_19(this, 1660), new AwS598S0100000_19(this, 205), 2, null);
        AssemViewModel.asyncSubscribe$default(OR(), new C2217381BqS() { // from class: X.0iHF
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1158800gGE) obj).LLILZLL;
            }
        }, null, new AwS598S0100000_19(this, 206), new AwS563S0100000_19(this, 1661), new AwS598S0100000_19(this, 207), 2, null);
        AssemViewModel.asyncSubscribe$default(OR(), new C2217381BqS() { // from class: X.0iHG
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1158800gGE) obj).LLIZ;
            }
        }, null, new AwS598S0100000_19(this, 208), new AwS563S0100000_19(this, 1662), new AwS598S0100000_19(this, 209), 2, null);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19GS c19gs;
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.bh0, viewGroup, false);
        this.LLILLJJLI = (TuxNavBar) viewTd.findViewById(R.id.q11);
        this.LLILLL = (TuxTextView) viewTd.findViewById(R.id.q13);
        this.LLILZ = (ViewGroup) viewTd.findViewById(R.id.q12);
        this.LLILZIL = (ViewGroup) viewTd.findViewById(R.id.q0z);
        this.LLILZLL = (C1749280vcc) viewTd.findViewById(R.id.q15);
        this.LLIZ = (SmartImageView) viewTd.findViewById(R.id.q10);
        this.LLIZLLLIL = (TuxTextView) viewTd.findViewById(R.id.q0y);
        this.LLJ = (RecyclerView) viewTd.findViewById(R.id.q17);
        this.LLJI = (C197039127h) viewTd.findViewById(R.id.q0x);
        this.LLJIJIL = (C1390130mHL) viewTd.findViewById(R.id.q16);
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
