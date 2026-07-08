package com.ss.android.ugc.aweme.poi.creator;

import X.AnonymousClass0956;
import X.C01GW;
import X.C03H5;
import X.C098200Yq;
import X.C0PEM;
import X.C0ZP4;
import X.C1192290h8F;
import X.C1194810hCJ;
import X.C1197550hGj;
import X.C1199450hJn;
import X.C1199460hJo;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1220000hqw;
import X.C1308910kAL;
import X.C1388190mED;
import X.C13LE;
import X.C1685300txQ;
import X.C1749280vcc;
import X.C1766560w4U;
import X.C1770850wBP;
import X.C1846060y8i;
import X.C189200o6;
import X.C19474211Gy;
import X.C19EG;
import X.C19GS;
import X.C2217381BqS;
import X.C23250099c;
import X.C338520DOw;
import X.C451460Hn6;
import X.C451620HnM;
import X.C452070Ho5;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C736950SvV;
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
import X.InterfaceC836760Ws6;
import X.ViewOnAttachStateChangeListenerC20631115oD;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.system.TuxImmersionBar;
import com.ss.android.ugc.aweme.poi.BasePage;
import com.ss.android.ugc.aweme.poi.PoiMobParam;
import com.zhiliaoapp.musically.R;
import irm.AkS86S0100000_16;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS32S0010000_18;
import kotlin.jvm.internal.AwS630S0100000_16;
import kotlin.jvm.internal.AwS667S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
@InterfaceC836760Ws6
public final class PoiCreatorFragment extends BasePage implements InterfaceC724530SbT {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjUjIGHELIOSEwOiAtPSAhZhUjIAwhLSQ4Jj0VOiQrJCo9PA==";
    public final C01GW LLIZLLLIL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS256S0000000_18.get$arr$(328), "poi_mob_param", PoiMobParam.class);
    public C1846060y8i LLJ;
    public ViewOnAttachStateChangeListenerC20631115oD LLJI;
    public C1749280vcc LLJIJIL;
    public C1749280vcc LLJILJIL;
    public final C736950SvV LLJILJILJ;
    public Rect LLJILLL;
    public C1194810hCJ LLJJ;

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

    public final PoiCreatorVM UR() {
        return (PoiCreatorVM) this.LLJILJILJ.getValue();
    }

    public PoiCreatorFragment() {
        AFwS206S0000000_18 aFwS206S0000000_18 = AFwS206S0000000_18.get$arr$(306);
        this.LLJILJILJ = new C736950SvV(C13LE.LIZ(PoiCreatorVM.class), aFwS206S0000000_18, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS256S0000000_18.get$arr$(329), new C451460Hn6(this, false), new C451620HnM(this, true), new C338520DOw(this));
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        AnonymousClass0956 anonymousClass0956 = UR().LLILZLL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        TuxImmersionBar tuxImmersionBarLIZLLL = C1766560w4U.LIZLLL(this);
        tuxImmersionBarLIZLLL.LJIIIIZZ(R.attr.bx);
        tuxImmersionBarLIZLLL.LJ(R.attr.bx);
        tuxImmersionBarLIZLLL.LIZ(true);
        tuxImmersionBarLIZLLL.LIZLLL();
    }

    public final void t4(boolean z) {
        if (z) {
            C1749280vcc c1749280vcc = this.LLJIJIL;
            if (c1749280vcc != null) {
                C786410Ut5.LLLZLZ(c1749280vcc, 0);
            }
            C1749280vcc c1749280vcc2 = this.LLJIJIL;
            if (c1749280vcc2 != null) {
                c1749280vcc2.LJ();
                return;
            }
            return;
        }
        C1749280vcc c1749280vcc3 = this.LLJIJIL;
        if (c1749280vcc3 == null) {
            return;
        }
        C786410Ut5.LLLZLZ(c1749280vcc3, 8);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Integer numLIZJ;
        super.onViewCreated(view, bundle);
        this.LLJ = (C1846060y8i) view.findViewById(R.id.qz8);
        this.LLJI = (ViewOnAttachStateChangeListenerC20631115oD) view.findViewById(R.id.qz9);
        View viewFindViewById = view.findViewById(R.id.qz2);
        if (viewFindViewById != null) {
            C786410Ut5.I7(new AkS86S0100000_16(this, 0), viewFindViewById);
        }
        this.LLJIJIL = (C1749280vcc) view.findViewById(R.id.nnh);
        this.LLJILJIL = (C1749280vcc) view.findViewById(R.id.hby);
        Context context = getContext();
        if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.bx, context)) != null) {
            int iIntValue = numLIZJ.intValue();
            C1846060y8i c1846060y8i = this.LLJ;
            if (c1846060y8i != null) {
                c1846060y8i.setBackgroundColor(iIntValue);
            }
        }
        C736680Sv4.LJIIIZ(this, UR(), new C2217381BqS() { // from class: X.0hGV
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1197360hGQ) obj).LLILLJJLI;
            }
        }, new C2217381BqS() { // from class: X.0hGR
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1197360hGQ) obj).LLILLL);
            }
        }, C736820SvI.LIZLLL(), new AwS667S0100000_18(this, 10), 8);
        C736680Sv4.LJIIIIZZ(this, UR(), new C2217381BqS() { // from class: X.0hGU
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1197360hGQ) obj).LLILZLL;
            }
        }, C736820SvI.LIZLLL(), new AwS630S0100000_16(this, 19), 4);
        C736680Sv4.LJIIIIZZ(this, UR(), new C2217381BqS() { // from class: X.0hGS
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1197360hGQ) obj).LLIZ;
            }
        }, C736820SvI.LIZLLL(), new AwS630S0100000_16(this, 20), 4);
        C736680Sv4.LJIIIIZZ(this, UR(), new C2217381BqS() { // from class: X.0hGT
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1197360hGQ) obj).LLILZ);
            }
        }, null, new AwS630S0100000_16(this, 18), 6);
        PoiCreatorVM poiCreatorVMUR = UR();
        poiCreatorVMUR.getClass();
        poiCreatorVMUR.setState(new AwS32S0010000_18(true, 21));
        poiCreatorVMUR.LLILZLL = C23250099c.LIZLLL(poiCreatorVMUR.getAssemVMScope(), C0PEM.LIZJ, null, new C1197550hGj(poiCreatorVMUR, false, null), 2);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context;
        C19EG c19egLIZIZ;
        Intent intent;
        C1192290h8F.LIZ(this, "poi_influencer_main", null, false, null, null, 30);
        if (viewGroup != null && (context = viewGroup.getContext()) != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null && (intent = c19egLIZIZ.getIntent()) != null) {
            long longExtra = intent.getLongExtra("page_start_ts", -1L);
            if (longExtra > 0) {
                UR().getClass();
                C1199460hJo c1199460hJo = C1199460hJo.LIZ;
                C1199450hJn c1199450hJn = new C1199450hJn("poi_creator");
                c1199450hJn.LIZLLL = "page_open";
                c1199450hJn.LIZ(System.currentTimeMillis() - longExtra);
                c1199460hJo.getClass();
                C1199460hJo.LIZ(c1199450hJn);
            }
        }
        UR().LLILLJJLI = (PoiMobParam) this.LLIZLLLIL.getValue();
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.dz7, viewGroup, false);
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
