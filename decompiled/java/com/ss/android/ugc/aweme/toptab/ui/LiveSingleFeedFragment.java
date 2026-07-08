package com.ss.android.ugc.aweme.toptab.ui;

import X.C03H5;
import X.C098200Yq;
import X.C0OCC;
import X.C0SU6;
import X.C0SZ8;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1209450hZv;
import X.C1361830lXh;
import X.C1440005kM;
import X.C1492500owS;
import X.C1492540owW;
import X.C1514430pVp;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1564710qov;
import X.C1568310quj;
import X.C1568690qvL;
import X.C1590830rV3;
import X.C1620930sHb;
import X.C1685300txQ;
import X.C1770850wBP;
import X.C189200o6;
import X.C19474211Gy;
import X.C19EG;
import X.C19GS;
import X.C20673215v0;
import X.C2187451AjH;
import X.C2189821An6;
import X.C446900Hfk;
import X.C616540OGe;
import X.C680080Qly;
import X.C723850SaN;
import X.C736680Sv4;
import X.C818480W8w;
import X.EnumC1584370rKd;
import X.InterfaceC0148002o;
import X.InterfaceC1055110dYz;
import X.InterfaceC1209460hZw;
import X.InterfaceC1577630r9l;
import X.InterfaceC1581960rGk;
import X.InterfaceC1591870rWj;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2217241BqE;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import X.InterfaceC988100bou;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.hox.Hox;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.netdetector.fetchfeed.NoNetDetectHelper;
import com.ss.android.ugc.aweme.feed.ui.BaseFeedListFragment;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.aweme.toptab.panel.LiveSingleFeedFragmentPanel;
import com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility;
import com.ss.android.ugc.feed.platform.panel.loadmorepanel.LoadMorePanelComponentTempHelper;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public class LiveSingleFeedFragment extends BaseFeedListFragment implements InterfaceC1055110dYz, InterfaceC988100bou, InterfaceC724530SbT, InterfaceC1591870rWj, InterfaceC1577630r9l {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjEjOTHELIOSsyKms5IGEfITMpGiY9LykpDyo2LAM+KCg+LSs4";
    public LiveSingleFeedFragmentPanel LLIZ;
    public InterfaceC1209460hZw LLIZLLLIL;

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment
    public final String MR() {
        return "a2270.b9024";
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

    @Override // X.InterfaceC1583780rJg
    public final String getHoxNodeTag() {
        return "";
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

    @Override // X.InterfaceC1591870rWj
    public final String wm() {
        return "LiveFeedFragment";
    }

    public final LiveSingleFeedFragmentPanel WR() {
        LiveSingleFeedFragmentPanel liveSingleFeedFragmentPanel = this.LLIZ;
        if (liveSingleFeedFragmentPanel != null) {
            return liveSingleFeedFragmentPanel;
        }
        return null;
    }

    public final boolean ZR() {
        C446900Hfk c446900Hfk = Hox.LLJILJIL;
        return c446900Hfk.LIZ(requireActivity()).KQ2("HOME") && Intrinsics.LJFF(c446900Hfk.LIZ(requireActivity()).DQ2("HOME", false), "Live");
    }

    @Override // X.InterfaceC988100bou
    public final boolean Ci() {
        return WR().LLJJ();
    }

    public final void aS() {
        if (WR().c0 > 0) {
            if (System.currentTimeMillis() - WR().c0 > 60000) {
                C1568690qvL c1568690qvL = new C1568690qvL();
                ILiveSingleFeedContentAssemAbility iLiveSingleFeedContentAssemAbility = (ILiveSingleFeedContentAssemAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this, null), ILiveSingleFeedContentAssemAbility.class, null);
                if (iLiveSingleFeedContentAssemAbility != null) {
                    iLiveSingleFeedContentAssemAbility.qN1(c1568690qvL);
                }
            }
            WR().c0 = 0L;
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.BaseFeedListFragment, com.ss.android.ugc.aweme.feed.ui.FeedFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        WR().onDestroyView();
        InterfaceC1209460hZw interfaceC1209460hZw = this.LLIZLLLIL;
        if (interfaceC1209460hZw != null) {
            ((C1492540owW) interfaceC1209460hZw).LIZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        if (ZR()) {
            WR().c0 = System.currentTimeMillis();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        Window window;
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(getClass().getName());
        }
        super.onResume();
        if (getUserVisibleHint() && isResumed()) {
            C1514430pVp.LJFF(EnumC1584370rKd.LIVE);
        }
        C19EG activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            window.setBackgroundDrawable(new ColorDrawable(-16777216));
        }
        if (ZR()) {
            aS();
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment
    public final SparseArray<InterfaceC1581960rGk> registerComponents() {
        SparseArray<InterfaceC1581960rGk> sparseArrayRegisterComponents = super.registerComponents();
        this.LLILLJJLI = "homepage_live";
        this.LLIZ = new LiveSingleFeedFragmentPanel(this.LLILLJJLI);
        sparseArrayRegisterComponents.append(C0SU6.LIZJ, WR());
        return sparseArrayRegisterComponents;
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment
    public final void NR(boolean z) {
        SR();
        C1440005kM.LIZ(new C1568310quj(2, WR().LJIIIIZZ(), WR()));
        WR().h(z);
        NoNetDetectHelper.LJIILLIIL.set(false);
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.BaseFeedListFragment, com.ss.android.ugc.aweme.feed.ui.FeedFragment
    public final boolean Oi(boolean z) {
        ILiveSingleFeedContentAssemAbility iLiveSingleFeedContentAssemAbility = (ILiveSingleFeedContentAssemAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this, null), ILiveSingleFeedContentAssemAbility.class, null);
        if (iLiveSingleFeedContentAssemAbility != null) {
            iLiveSingleFeedContentAssemAbility.qN1(null);
            return true;
        }
        return false;
    }

    public final void S1(boolean z) {
        Window window;
        if (getUserVisibleHint() && isViewValid()) {
            NoNetDetectHelper.LJIILLIIL.set(true);
            RR();
            C1440005kM.LIZ(new C1568310quj(1, WR().LJIIIIZZ(), WR()));
            if (z) {
                WR().tryResumePlay();
            } else {
                WR().g();
            }
            Db(false);
            C19EG activity = getActivity();
            if (activity != null && (window = activity.getWindow()) != null) {
                window.setBackgroundDrawable(new ColorDrawable(-16777216));
            }
        }
    }

    @Override // X.InterfaceC1055110dYz
    public final void onNodeHide(Bundle bundle) {
        C1564710qov.LIZ(this, bundle, "Live", new AwS603S0100000_24(this, 360));
        Aweme aweme = C680080Qly.LIZIZ(requireActivity()).LLJILJILJ;
        String string = bundle.getString("fromStart", "");
        C446900Hfk c446900Hfk = Hox.LLJILJIL;
        String strHQ2 = c446900Hfk.LIZ(requireActivity()).HQ2("Live");
        String strHQ22 = c446900Hfk.LIZ(requireActivity()).HQ2(strHQ2);
        String strHQ23 = c446900Hfk.LIZ(requireActivity()).HQ2(strHQ22);
        if (!Intrinsics.LJFF(string, "MainFragment") && !bundle.getBoolean(strHQ2)) {
            if (!Intrinsics.LJFF(string, "MainPage") && !bundle.getBoolean(strHQ22)) {
                if (Intrinsics.LJFF(string, "RootNode") || bundle.getBoolean(strHQ23)) {
                    C0SZ8 c0sz8K4 = k4();
                    if (c0sz8K4 != null) {
                        c0sz8K4.LJLIIIL(1);
                    }
                    if (aweme != null) {
                        C1361830lXh.LIZ.LIZ(aweme.getAid());
                    }
                }
            } else {
                NR(true);
            }
        } else {
            WR().setUserVisibleHint(false);
            NR(false);
        }
        WR().c0 = System.currentTimeMillis();
    }

    @Override // X.InterfaceC1055110dYz
    public final void onNodeShow(Bundle bundle) {
        AbsFragment absFragment;
        AbsFragment absFragment2;
        AbsFragment absFragment3;
        C1564710qov.LIZ(this, bundle, "Live", new AwS603S0100000_24(this, 361));
        String string = bundle.getString("fromStart", "");
        C446900Hfk c446900Hfk = Hox.LLJILJIL;
        String strHQ2 = c446900Hfk.LIZ(requireActivity()).HQ2("Live");
        String strHQ22 = c446900Hfk.LIZ(requireActivity()).HQ2(strHQ2);
        String strHQ23 = c446900Hfk.LIZ(requireActivity()).HQ2(strHQ22);
        if (!Intrinsics.LJFF(string, "MainFragment") && !bundle.getBoolean(strHQ2)) {
            if (!Intrinsics.LJFF(string, "MainPage") && !bundle.getBoolean(strHQ22)) {
                if (Intrinsics.LJFF(string, "RootNode") || bundle.getBoolean(strHQ23)) {
                    WR().setUserVisibleHint(true);
                    if (isResumed() && (absFragment3 = this.LLILZ) != null && !absFragment3.isHidden()) {
                        C1514430pVp.LJFF(EnumC1584370rKd.LIVE);
                        C1590830rV3 c1590830rV3 = new C1590830rV3();
                        c1590830rV3.LJIILLIIL = this.LLILLJJLI;
                        c1590830rV3.LJIILJJIL();
                    }
                    C0SZ8 c0sz8K4 = k4();
                    if (c0sz8K4 != null) {
                        c0sz8K4.LLLI(1);
                    }
                    S1(true);
                }
            } else {
                WR().setUserVisibleHint(true);
                if (isResumed() && (absFragment2 = this.LLILZ) != null && !absFragment2.isHidden()) {
                    C1514430pVp.LJFF(EnumC1584370rKd.LIVE);
                    C1590830rV3 c1590830rV32 = new C1590830rV3();
                    c1590830rV32.LJIILLIIL = this.LLILLJJLI;
                    c1590830rV32.LJIILJJIL();
                }
                S1(true);
            }
        } else {
            WR().setUserVisibleHint(true);
            if (isResumed() && (absFragment = this.LLILZ) != null && !absFragment.isHidden()) {
                C1514430pVp.LJFF(EnumC1584370rKd.LIVE);
                C1590830rV3 c1590830rV33 = new C1590830rV3();
                c1590830rV33.LJIILLIIL = this.LLILLJJLI;
                c1590830rV33.LJIILJJIL();
            }
            S1(false);
        }
        aS();
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.BaseFeedListFragment, com.ss.android.ugc.aweme.feed.ui.FeedFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C19EG activity;
        super.onViewCreated(view, bundle);
        C2189821An6 c2189821An6 = new C2189821An6();
        c2189821An6.setEventType("homepage_live");
        c2189821An6.setPageType(37);
        LiveSingleFeedFragmentPanel liveSingleFeedFragmentPanelWR = WR();
        liveSingleFeedFragmentPanelWR.LLLL(c2189821An6);
        liveSingleFeedFragmentPanelWR.LLLII = VR();
        liveSingleFeedFragmentPanelWR.LLLIIII = VR();
        if (this.LLIZLLLIL == null && C1492500owS.LIZ() && (activity = getActivity()) != null) {
            this.LLIZLLLIL = C1209450hZv.LIZIZ(activity);
        }
        NoNetDetectHelper.LJIILLIIL.set(true);
        Db(false);
        WR().onViewCreated(getView(), bundle);
        WR().Xl1(VR());
        WR().LLJJI(new C1620930sHb(this, 0));
        C723850SaN.LIZ(this, false, null, new AwS597S0100000_18(this, 594), 3);
        ILoadMoreAbility iLoadMoreAbilityEw0 = Ew0();
        if (iLoadMoreAbilityEw0 != null) {
            ((LoadMorePanelComponentTempHelper) iLoadMoreAbilityEw0).p41(new C0OCC() { // from class: X.0hTk
                @Override // X.C0OCC, X.InterfaceC1603270rp7
                public final void onHide() {
                }
            });
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.BaseFeedListFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C818480W8w.LIZ("homepage_live");
        View viewLIZJ = C20673215v0.LIZJ(R.layout.dj8, getActivity());
        C19GS c19gs = null;
        if (!(viewLIZJ instanceof View)) {
            viewLIZJ = null;
        }
        if (viewLIZJ != null) {
            try {
                ViewTreeLifecycleOwner.set(viewLIZJ, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewLIZJ, this);
                viewLIZJ.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewLIZJ;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewLIZJ;
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
