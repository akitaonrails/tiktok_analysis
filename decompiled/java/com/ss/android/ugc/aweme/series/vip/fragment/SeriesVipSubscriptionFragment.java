package com.ss.android.ugc.aweme.series.vip.fragment;

import X.C01GW;
import X.C03H5;
import X.C098200Yq;
import X.C0C64;
import X.C0TVI;
import X.C0ZP4;
import X.C1155930gBb;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C11JF;
import X.C1220000hqw;
import X.C1251150ifB;
import X.C13LE;
import X.C14K9;
import X.C1554960qZC;
import X.C1558360qeg;
import X.C1559070qfp;
import X.C1614640s7S;
import X.C1614710s7Z;
import X.C1685300txQ;
import X.C1701940uOG;
import X.C1770850wBP;
import X.C189200o6;
import X.C19474211Gy;
import X.C19EG;
import X.C19GS;
import X.C20097313kJ;
import X.C2217381BqS;
import X.C338520DOw;
import X.C451460Hn6;
import X.C451620HnM;
import X.C452070Ho5;
import X.C452501pT;
import X.C723850SaN;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C736950SvV;
import X.C785410UrT;
import X.C786410Ut5;
import X.DialogC1389620mGW;
import X.EnumC1614520s7G;
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
import Y.AfS158S0200000_24;
import Y.AfS193S0100000_24;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.model.VipSubscriptionDetailResponse;
import com.ss.android.ugc.aweme.model.VipSubscriptionPurchaseOption;
import com.ss.android.ugc.aweme.series.vip.service.SeriesSubscriptionService;
import com.ss.android.ugc.aweme.series.vip.viewmodel.SeriesVipSubscriptionViewModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS139S1200000_24;
import kotlin.jvm.internal.AwS390S0200000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS638S0100000_24;
import kotlin.jvm.internal.AwS673S0100000_24;
import kotlin.jvm.internal.AwS74S1000000_24;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes25.dex */
@InterfaceC836760Ws6
public final class SeriesVipSubscriptionFragment extends BaseFragment implements InterfaceC724530SbT {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYpOyY2O2s6ID99LjHELIOSctLiI2JjFiGiohISA/HyYjGzAuOiwhITU4ICA9DjctLiI2JjE=";
    public final String LLIZ = UUID.randomUUID().toString();
    public final C736950SvV LLIZLLLIL;
    public TuxSheet LLJ;
    public DialogC1389620mGW LLJI;
    public C11JF LLJIJIL;
    public boolean LLJILJIL;
    public long LLJILJILJ;
    public boolean LLJILLL;
    public final C01GW LLJJ;

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

    public final SeriesVipSubscriptionViewModel SR() {
        return (SeriesVipSubscriptionViewModel) this.LLIZLLLIL.getValue();
    }

    public final void UR() {
        DialogC1389620mGW dialogC1389620mGW = this.LLJI;
        if (dialogC1389620mGW != null) {
            dialogC1389620mGW.dismiss();
            C785410UrT.LIZ(dialogC1389620mGW);
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        TuxSheet tuxSheet = this.LLJ;
        if (tuxSheet != null) {
            tuxSheet.dismiss();
            this.LLJ = null;
        }
        UR();
        this.LLJI = null;
        C11JF c11jf = this.LLJIJIL;
        if (c11jf != null) {
            c11jf.dispose();
        }
        this.LLJIJIL = null;
        super.onDestroyView();
    }

    public SeriesVipSubscriptionFragment() {
        AwS568S0100000_24 awS568S0100000_24 = new AwS568S0100000_24(this, 1116);
        this.LLIZLLLIL = new C736950SvV(C13LE.LIZ(SeriesVipSubscriptionViewModel.class), awS568S0100000_24, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS264S0000000_24.get$arr$(361), new C451460Hn6(this, false), new C451620HnM(this, true), new C338520DOw(this));
        this.LLJJ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(336));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        this.LLJILLL = true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.LLJILLL) {
            SR().JQ2();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String stringExtra;
        Intent intent;
        Intent intent2;
        NR(AFwS264S0000000_24.get$arr$(360));
        super.onCreate(bundle);
        C19EG activity = getActivity();
        String str = "";
        if (activity == null || (intent2 = activity.getIntent()) == null) {
            stringExtra = "";
        } else {
            try {
                stringExtra = intent2.getStringExtra("enter_from");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (stringExtra == null) {
                stringExtra = "";
            }
        }
        C1559070qfp c1559070qfp = new C1559070qfp(stringExtra, this.LLIZ);
        SeriesVipSubscriptionViewModel seriesVipSubscriptionViewModelSR = SR();
        seriesVipSubscriptionViewModelSR.getClass();
        if (stringExtra.length() != 0 && !Intrinsics.LJFF(stringExtra, ((C1614710s7Z) seriesVipSubscriptionViewModelSR.getState()).LLJJIJI)) {
            seriesVipSubscriptionViewModelSR.setState(new AwS74S1000000_24(stringExtra, 13));
        }
        SeriesVipSubscriptionViewModel seriesVipSubscriptionViewModelSR2 = SR();
        C19EG activity2 = getActivity();
        if (activity2 != null && (intent = activity2.getIntent()) != null) {
            try {
                String stringExtra2 = intent.getStringExtra("collection_id");
                if (stringExtra2 != null) {
                    str = stringExtra2;
                }
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
        seriesVipSubscriptionViewModelSR2.getClass();
        if (str.length() != 0 && !Intrinsics.LJFF(str, ((C1614710s7Z) seriesVipSubscriptionViewModelSR2.getState()).LLJJIJIIJIL)) {
            seriesVipSubscriptionViewModelSR2.setState(new AwS74S1000000_24(str, 12));
        }
        C1554960qZC.LIZ(C1558360qeg.LJFF(this, null), c1559070qfp, C1559070qfp.class, "source_default_key");
        C723850SaN.LIZ(this, false, null, new AwS390S0200000_24(this, c1559070qfp, 35), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void WR(boolean z, C1155930gBb c1155930gBb) {
        List<VipSubscriptionPurchaseOption> list;
        String str = ((C1614710s7Z) SR().getState()).LLJJIJI;
        String str2 = ((C1614710s7Z) SR().getState()).LLJJIJIIJIL;
        String str3 = ((C1614710s7Z) SR().getState()).LLILZ;
        VipSubscriptionDetailResponse vipSubscriptionDetailResponse = ((C1614710s7Z) SR().getState()).LLILLJJLI;
        if (vipSubscriptionDetailResponse != null) {
            list = vipSubscriptionDetailResponse.subsOptions;
        } else {
            list = null;
        }
        C1614640s7S.LIZJ(z, str, str2, str3, list, c1155930gBb);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        TuxNavBar tuxNavBar = (TuxNavBar) view.findViewById(R.id.vip_subscription_nav_bar);
        if (tuxNavBar != null) {
            tuxNavBar.setNavBackground(0);
            C1251150ifB c1251150ifB = new C1251150ifB();
            c1251150ifB.LIZLLL();
            c1251150ifB.LIZJ = R.raw.icon_chevron_left_ltr;
            c1251150ifB.LIZLLL = true;
            c1251150ifB.LIZJ(new AwS568S0100000_24(this, 16));
            tuxNavBar.LIZIZ(c1251150ifB);
            String strLJJ = C0C64.LJIILLIIL().LJJ(31744, "short_drama_subscription_term_url", "", true);
            C1251150ifB c1251150ifB2 = new C1251150ifB();
            c1251150ifB2.LIZLLL();
            c1251150ifB2.LIZJ = R.raw.icon_question_mark_circle_ltr;
            c1251150ifB2.LIZLLL = !a0.LJJJIL(strLJJ);
            if (true ^ a0.LJJJIL(strLJJ)) {
                c1251150ifB2.LIZJ(new AwS139S1200000_24(this, tuxNavBar, strLJJ, 0));
            }
            tuxNavBar.LIZ(c1251150ifB2);
            tuxNavBar.LJIIZILJ(false);
        }
        View viewFindViewById = view.findViewById(R.id.vip_subscription_nav_bar);
        if (viewFindViewById != null) {
            final int paddingTop = viewFindViewById.getPaddingTop();
            C14K9.LJIJJ(viewFindViewById, new C0TVI() { // from class: X.0DRC
                @Override // X.C0TVI
                public final C20246014Ju onApplyWindowInsets(View view2, C20246014Ju c20246014Ju) {
                    view2.setPadding(view2.getPaddingLeft(), paddingTop + c20246014Ju.LIZ(129).LIZIZ, view2.getPaddingRight(), view2.getPaddingBottom());
                    return c20246014Ju;
                }
            });
            C20097313kJ.LIZJ(viewFindViewById);
        }
        View viewFindViewById2 = view.findViewById(R.id.vip_subscription_footer_container);
        if (viewFindViewById2 != null) {
            final int paddingBottom = viewFindViewById2.getPaddingBottom();
            C14K9.LJIJJ(viewFindViewById2, new C0TVI() { // from class: X.0DRD
                @Override // X.C0TVI
                public final C20246014Ju onApplyWindowInsets(View view2, C20246014Ju c20246014Ju) {
                    view2.setPadding(view2.getPaddingLeft(), view2.getPaddingTop(), view2.getPaddingRight(), paddingBottom + c20246014Ju.LIZ(130).LIZLLL);
                    return c20246014Ju;
                }
            });
            C20097313kJ.LIZJ(viewFindViewById2);
        }
        C736680Sv4.LJIIIZ(this, SR(), new C2217381BqS() { // from class: X.0s7V
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1614710s7Z) obj).LLILLJJLI;
            }
        }, new C2217381BqS() { // from class: X.0s7Y
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1614710s7Z) obj).LLILLL;
            }
        }, C736820SvI.LIZLLL(), new AwS673S0100000_24(this, 0), 8);
        C736680Sv4.LJIIIIZZ(this, SR(), new C2217381BqS() { // from class: X.0s7X
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1614710s7Z) obj).LLJJ;
            }
        }, C736820SvI.LIZLLL(), new AwS638S0100000_24(this, 11), 4);
        SeriesSubscriptionService seriesSubscriptionService = (SeriesSubscriptionService) PluggableExtentionKt.pluggableSpi$default(SeriesSubscriptionService.class, false, false, false, 14, null);
        if (seriesSubscriptionService != null) {
            seriesSubscriptionService.LJ(EnumC1614520s7G.SUBSCRIPTION_PAGE);
            C11JF c11jf = this.LLJIJIL;
            if (c11jf != null) {
                c11jf.dispose();
            }
            this.LLJIJIL = (C11JF) seriesSubscriptionService.LIZ().LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS158S0200000_24(this, seriesSubscriptionService, 0), new AfS193S0100000_24(this, 1));
        }
        C736680Sv4.LJIIIIZZ(this, SR(), new C2217381BqS() { // from class: X.0s7W
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1614710s7Z) obj).LLILLJJLI;
            }
        }, C736820SvI.LIZLLL(), new AwS638S0100000_24(this, 12), 4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void VR(java.lang.String r28, boolean r29, boolean r30) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.series.vip.fragment.SeriesVipSubscriptionFragment.VR(java.lang.String, boolean, boolean):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.bic, viewGroup, false);
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
