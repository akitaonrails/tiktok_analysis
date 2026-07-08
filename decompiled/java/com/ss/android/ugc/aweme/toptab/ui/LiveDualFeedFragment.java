package com.ss.android.ugc.aweme.toptab.ui;

import X.C019F;
import X.C01D1;
import X.C03H5;
import X.C098200Yq;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1388190mED;
import X.C13LE;
import X.C14LC;
import X.C1564710qov;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C1770850wBP;
import X.C189200o6;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C2187451AjH;
import X.C2217381BqS;
import X.C338490DOt;
import X.C418440Gaw;
import X.C446900Hfk;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C482710IwP;
import X.C497820Jfg;
import X.C616540OGe;
import X.C723850SaN;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C814420VxA;
import X.C987103tV;
import X.InterfaceC0148002o;
import X.InterfaceC1055110dYz;
import X.InterfaceC1577630r9l;
import X.InterfaceC1591870rWj;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC482720IwQ;
import X.InterfaceC724530SbT;
import X.InterfaceC724760Sbq;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.hox.Hox;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.ui.FeedFragment;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.aweme.toptab.vm.LiveDualFeedListViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS138S1100000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS585S0100000_6;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.AwS638S0100000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class LiveDualFeedFragment extends FeedFragment implements InterfaceC724530SbT, InterfaceC1055110dYz, InterfaceC1591870rWj, InterfaceC1577630r9l {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjEjOTHELIOSsyKms5IGEfITMpDToyJAMpLCsVOiQrJCo9PA==";
    public final AssemVMLazy LLILZLL;
    public View LLIZ;
    public View LLIZLLLIL;
    public ViewOnAttachStateChangeListenerC20604515jv LLJ;
    public C482710IwP LLJI;
    public long LLJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(LiveDualFeedFragment.class, "dualFeedListViewModel", "getDualFeedListViewModel()Lcom/ss/android/ugc/aweme/toptab/vm/LiveDualFeedListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

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

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment
    public final String getEnterFrom() {
        return "homepage_live";
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

    public LiveDualFeedFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(LiveDualFeedListViewModel.class);
        AwS568S0100000_24 awS568S0100000_24 = new AwS568S0100000_24(c19719912DlLIZ, 1402);
        AFwS264S0000000_24 aFwS264S0000000_24 = AFwS264S0000000_24.get$arr$(485);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS568S0100000_24, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS568S0100000_24((HasDefaultViewModelProviderFactory) this, 1403), aFwS264S0000000_24, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS568S0100000_24, new AwS568S0100000_24((Fragment) this, 1404), aFwS264S0000000_24, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS568S0100000_24, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS568S0100000_24((HasDefaultViewModelProviderFactory) this, 1405), aFwS264S0000000_24, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLILZLL = assemVMLazy;
    }

    public final boolean VR() {
        C446900Hfk c446900Hfk = Hox.LLJILJIL;
        return c446900Hfk.LIZ(requireActivity()).KQ2("HOME") && Intrinsics.LJFF(c446900Hfk.LIZ(requireActivity()).DQ2("HOME", false), "Live");
    }

    public final void WR() {
        int iFindFirstVisibleItemPosition;
        LiveDualFeedCell liveDualFeedCell;
        if (this.LLJIJIL > 0) {
            if (System.currentTimeMillis() - this.LLJIJIL > 60000) {
                Oi(false);
            }
            this.LLJIJIL = 0L;
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJ;
        RecyclerView.LayoutManager layoutManager = viewOnAttachStateChangeListenerC20604515jv != null ? viewOnAttachStateChangeListenerC20604515jv.getLayoutManager() : null;
        LinearLayoutManager linearLayoutManager = layoutManager instanceof GridLayoutManager ? (LinearLayoutManager) layoutManager : null;
        int iFindLastVisibleItemPosition = -1;
        if (linearLayoutManager != null) {
            iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
            iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
            if (iFindFirstVisibleItemPosition > iFindLastVisibleItemPosition) {
                return;
            }
        } else {
            iFindFirstVisibleItemPosition = -1;
        }
        while (true) {
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = this.LLJ;
            RecyclerView.ViewHolder viewHolderFindViewHolderForLayoutPosition = viewOnAttachStateChangeListenerC20604515jv2 != null ? viewOnAttachStateChangeListenerC20604515jv2.findViewHolderForLayoutPosition(iFindFirstVisibleItemPosition) : null;
            if ((viewHolderFindViewHolderForLayoutPosition instanceof LiveDualFeedCell) && (liveDualFeedCell = (LiveDualFeedCell) viewHolderFindViewHolderForLayoutPosition) != null) {
                liveDualFeedCell.T5();
            }
            if (iFindFirstVisibleItemPosition == iFindLastVisibleItemPosition) {
                return;
            } else {
                iFindFirstVisibleItemPosition++;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        C482710IwP c482710IwP = this.LLJI;
        if (c482710IwP != null) {
            c482710IwP.LLILLJJLI = false;
            c482710IwP.LL.removeOnScrollListener(c482710IwP);
            c482710IwP.LL.removeOnChildAttachStateChangeListener(c482710IwP);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        if (VR()) {
            C482710IwP c482710IwP = this.LLJI;
            if (c482710IwP != null && c482710IwP.LLILLJJLI) {
                c482710IwP.LLILLL = false;
                InterfaceC482720IwQ interfaceC482720IwQ = c482710IwP.LLIZ;
                if (interfaceC482720IwQ != null) {
                    interfaceC482720IwQ.LJJL();
                }
            }
            this.LLJIJIL = System.currentTimeMillis();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(LiveDualFeedFragment.class.getName());
        }
        super.onResume();
        if (VR()) {
            C482710IwP c482710IwP = this.LLJI;
            if (c482710IwP != null) {
                c482710IwP.onResume();
            }
            WR();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment
    public final boolean Oi(boolean z) {
        String str;
        AssemVMLazy assemVMLazy = this.LLILZLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJIL;
        LiveDualFeedListViewModel liveDualFeedListViewModel = (LiveDualFeedListViewModel) assemVMLazy.getValue();
        if (z) {
            str = "click_button_icon";
        } else {
            str = "click_top_icon";
        }
        liveDualFeedListViewModel.withState(new AwS138S1100000_24(liveDualFeedListViewModel, str, 3));
        return true;
    }

    @Override // X.InterfaceC1055110dYz
    public final void onNodeHide(Bundle bundle) {
        C1564710qov.LIZ(this, bundle, "Live", new AwS603S0100000_24(this, 354));
        SR();
        this.LLJIJIL = System.currentTimeMillis();
        C482710IwP c482710IwP = this.LLJI;
        if (c482710IwP != null && c482710IwP.LLILLJJLI) {
            c482710IwP.LLILLL = false;
            InterfaceC482720IwQ interfaceC482720IwQ = c482710IwP.LLIZ;
            if (interfaceC482720IwQ != null) {
                interfaceC482720IwQ.LJJL();
            }
        }
    }

    @Override // X.InterfaceC1055110dYz
    public final void onNodeShow(Bundle bundle) {
        C1564710qov.LIZ(this, bundle, "Live", new AwS603S0100000_24(this, 355));
        RR();
        C19EG activity = getActivity();
        if (activity == null) {
            return;
        }
        String string = bundle.getString("fromStart", "");
        C446900Hfk c446900Hfk = Hox.LLJILJIL;
        String strHQ2 = c446900Hfk.LIZ(activity).HQ2(c446900Hfk.LIZ(activity).HQ2("homepage_explore"));
        if (Intrinsics.LJFF(string, "MainPage") || bundle.getBoolean(strHQ2)) {
            Db(false);
        }
        WR();
        C482710IwP c482710IwP = this.LLJI;
        if (c482710IwP != null) {
            c482710IwP.onResume();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int iLIZIZ;
        View viewFindViewById;
        super.onViewCreated(view, bundle);
        this.LLILLJJLI = "homepage_live";
        this.LLILLL = 37;
        View view2 = null;
        C723850SaN.LIZ(this, false, null, new AwS585S0100000_6(this, 204), 3);
        this.LLIZ = view.findViewById(R.id.ydi);
        this.LLIZLLLIL = view.findViewById(R.id.ch3);
        this.LLJ = (ViewOnAttachStateChangeListenerC20604515jv) view.findViewById(R.id.mwn);
        View view3 = this.LLIZ;
        if (view3 == null) {
            view3 = null;
        }
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        View view4 = this.LLIZ;
        if (view4 == null) {
            view4 = null;
        }
        int iLIZJ = C497820Jfg.LIZJ(view4.getContext());
        Activity activityLIZ = C1388190mED.LIZ(view.getContext());
        if (activityLIZ != null && (viewFindViewById = activityLIZ.findViewById(R.id.tpm)) != null) {
            iLIZIZ = viewFindViewById.getMeasuredHeight();
        } else {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(58));
        }
        layoutParams.height = iLIZJ + iLIZIZ;
        View view5 = this.LLIZLLLIL;
        if (view5 != null) {
            view2 = view5;
        }
        view2.getLayoutParams().height = C14LC.LJIILLIIL;
        AssemVMLazy assemVMLazy = this.LLILZLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJIL;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0r9k
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C1581070rFJ c1581070rFJ = (C1581070rFJ) obj;
                c1581070rFJ.getClass();
                return C627260Oiy.LIZLLL(c1581070rFJ);
            }
        }, null, new AwS638S0100000_24(this, 13), 6);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJ;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            C482710IwP c482710IwP = new C482710IwP(viewOnAttachStateChangeListenerC20604515jv);
            if (!c482710IwP.LLILLJJLI) {
                c482710IwP.LLILLJJLI = true;
                c482710IwP.LL.addOnScrollListener(c482710IwP);
                c482710IwP.LL.addOnChildAttachStateChangeListener(c482710IwP);
            }
            this.LLJI = c482710IwP;
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.dj6, viewGroup, false);
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
