package com.ss.android.ugc.aweme.search.detail.keyframe.ui;

import X.C019F;
import X.C01D1;
import X.C03H5;
import X.C098200Yq;
import X.C0OM1;
import X.C0Q4Y;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1250250idj;
import X.C1251150ifB;
import X.C13IQ;
import X.C13LE;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C1770850wBP;
import X.C189200o6;
import X.C19396110uV;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C1BWL;
import X.C20636415p4;
import X.C20636915p9;
import X.C20637615pG;
import X.C20637915pJ;
import X.C2217381BqS;
import X.C301220BrM;
import X.C305740Bye;
import X.C338490DOt;
import X.C436130H8h;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C5182020e;
import X.C661030PwL;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C987103tV;
import X.EnumC436120H8g;
import X.InterfaceC0148002o;
import X.InterfaceC1350190lEv;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC20636815p8;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC344240DeY;
import X.InterfaceC451590HnJ;
import X.InterfaceC679410Qkt;
import X.InterfaceC724530SbT;
import X.InterfaceC724760Sbq;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.AsS34S0200000_21;
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
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.feed.adapter.VideoEventDispatchViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BigThumb;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.search.detail.keyframe.viewmodel.SearchDetailKeyframeSheetVM;
import com.ss.android.ugc.aweme.search.innerflowpage.SearchKeyFramePoint;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AFwS319S0000000_31;
import kotlin.jvm.internal.AwS456S0200000_21;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS645S0100000_31;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public final class SearchDetailKeyframePanelFragment extends Fragment implements InterfaceC344240DeY, InterfaceC724530SbT, InterfaceC20636815p8 {
    public static final C20636415p4 LLJI;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYpKD0wIGsoLDsyISliIioqHELIOSLjctJCp9PSxiGioyOiYkDSonKSwgAioqLjctJCoDKSspJQkhKSIhLCEn";
    public final InterfaceC20636815p8 LL;
    public Aweme LLILLJJLI;
    public List<SearchKeyFramePoint> LLILLL;
    public EnumC436120H8g LLILZ;
    public long LLILZIL;
    public VideoEventDispatchViewModel LLILZLL;
    public VideoViewModel LLIZ;
    public final AssemVMLazy LLIZLLLIL;
    public IPlayerComponentAbility LLJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SearchDetailKeyframePanelFragment.class, "keyframePanelVM", "getKeyframePanelVM()Lcom/ss/android/ugc/aweme/search/detail/keyframe/viewmodel/SearchDetailKeyframeSheetVM;", 0);
        C13LE.LIZ.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJI = new C20636415p4();
    }

    public SearchDetailKeyframePanelFragment() {
        this(0);
    }

    @Override // X.InterfaceC20636815p8
    public final void Bq(InterfaceC1350190lEv interfaceC1350190lEv, InterfaceC679410Qkt interfaceC679410Qkt) {
        this.LL.Bq(interfaceC1350190lEv, interfaceC679410Qkt);
    }

    @Override // X.InterfaceC20636815p8
    public final void G2(int i) {
        this.LL.G2(i);
    }

    @Override // X.InterfaceC1058150ddt
    public final void LLLFFI(TuxSheet tuxSheet, float f) {
        this.LL.LLLFFI(tuxSheet, f);
    }

    @Override // X.InterfaceC1058150ddt
    public final void LLLLIIIILLL(TuxSheet tuxSheet, int i) {
        this.LL.LLLLIIIILLL(tuxSheet, i);
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

    @Override // X.InterfaceC1058150ddt
    public final boolean onBackPress() {
        return this.LL.onBackPress();
    }

    @Override // X.InterfaceC20636815p8
    public final void sy(View view) {
        this.LL.sy(view);
    }

    @Override // X.InterfaceC20636815p8
    public final void w2(TuxSheet tuxSheet) {
        this.LL.w2(tuxSheet);
    }

    public final SearchDetailKeyframeSheetVM MR() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJIJIL;
        return (SearchDetailKeyframeSheetVM) assemVMLazy.getValue();
    }

    @Override // X.InterfaceC344240DeY
    public final C0OM1 Sn() {
        int i = (((Boolean) C305740Bye.LIZJ.getValue()).booleanValue() && this.LLILZ == EnumC436120H8g.RECIPE) ? 2131834851 : 2131826832;
        C0OM1 c0om1 = new C0OM1();
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = C1BWL.LIZ().getString(i);
        c0om1.LIZJ = c1250250idj;
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_x_mark;
        c1251150ifB.LIZJ(new AwS575S0100000_31(this, 999));
        c0om1.LIZIZ(c1251150ifB);
        return c0om1;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        final List<SearchKeyFramePoint> list;
        if (this.LLILZIL > 0) {
            SearchDetailKeyframeSheetVM searchDetailKeyframeSheetVMMR = MR();
            final long jCurrentTimeMillis = System.currentTimeMillis() - this.LLILZIL;
            final Aweme aweme = searchDetailKeyframeSheetVMMR.LLILLL;
            if (aweme != null && (list = searchDetailKeyframeSheetVMMR.LLILZ) != null) {
                final ISearchContextAbility iSearchContextAbility = (ISearchContextAbility) searchDetailKeyframeSheetVMMR.LL.getValue();
                new C661030PwL<C20637915pJ>(aweme, jCurrentTimeMillis, list, iSearchContextAbility) { // from class: X.15pJ
                    {
                        LJIIZILJ("sub_titles_list", C13LP.LJJLIIIJ(list, null, null, null, 0, null, AFwS276S0000000_31.get$arr$(296), 31));
                        LJIIZILJ("sub_notes_list", C13LP.LJJLIIIJ(list, null, null, null, 0, null, AFwS276S0000000_31.get$arr$(297), 31));
                        LJIIZILJ("duration", String.valueOf(jCurrentTimeMillis));
                    }
                }.LJIILJJIL();
            }
        }
        MR().setState(AFwS256S0000000_18.get$arr$(971));
        super.onDestroyView();
    }

    public SearchDetailKeyframePanelFragment(int i) {
        AssemVMLazy assemVMLazy;
        this.LL = new C19396110uV();
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SearchDetailKeyframeSheetVM.class);
        C5182020e c5182020e = new C5182020e((C13IQ) c19719912DlLIZ, 353);
        AFwS276S0000000_31 aFwS276S0000000_31 = AFwS276S0000000_31.get$arr$(310);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), c5182020e, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS575S0100000_31((HasDefaultViewModelProviderFactory) this, 1472), aFwS276S0000000_31, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c5182020e, new AwS575S0100000_31((Fragment) this, 1473), aFwS276S0000000_31, null, null, null);
        } else if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), c5182020e, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS575S0100000_31((HasDefaultViewModelProviderFactory) this, 1474), aFwS276S0000000_31, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.LLIZLLLIL = assemVMLazy;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        List<BigThumb> bigThumbs;
        Video video;
        super.onViewCreated(view, bundle);
        if (C301220BrM.LIZ()) {
            C436130H8h c436130H8h = EnumC436120H8g.Companion;
            EnumC436120H8g enumC436120H8g = this.LLILZ;
            c436130H8h.getClass();
            if (C436130H8h.LIZJ(enumC436120H8g)) {
                this.LL.sy(view);
            }
        }
        MR().LLILLJJLI = this.LLJ;
        MR().LLILZIL = new AwS575S0100000_31(this, LSPassThroughRecordSizeConfig.DEFAULT);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) view.findViewById(R.id.rn0);
        viewOnAttachStateChangeListenerC20604515jv.setLayoutManager(new LinearLayoutManager(view.getContext()));
        viewOnAttachStateChangeListenerC20604515jv.getState().LIZLLL = C0Q4Y.BUFFER;
        Aweme aweme = this.LLILLJJLI;
        if (aweme != null && (video = aweme.getVideo()) != null) {
            bigThumbs = video.getBigThumbs();
        } else {
            bigThumbs = null;
        }
        if (bigThumbs != null && !bigThumbs.isEmpty()) {
            viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(KeyframeCellImageStyle.class);
        } else {
            viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(KeyframeCellNoImageStyle.class);
        }
        C20637615pG c20637615pG = new C20637615pG(viewOnAttachStateChangeListenerC20604515jv);
        viewOnAttachStateChangeListenerC20604515jv.addItemDecoration(c20637615pG);
        viewOnAttachStateChangeListenerC20604515jv.addOnScrollListener(new AsS34S0200000_21(view, viewOnAttachStateChangeListenerC20604515jv, 1));
        C736680Sv4.LJIIIIZZ(this, MR(), new C2217381BqS() { // from class: X.15p6
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C1155640gB8) obj).LL);
            }
        }, null, new AwS645S0100000_31(c20637615pG, 54), 6);
        SearchDetailKeyframeSheetVM searchDetailKeyframeSheetVMMR = MR();
        C20636915p9 c20636915p9 = new C2217381BqS() { // from class: X.15p9
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1155640gB8) obj).LLILLL;
            }
        };
        C1770850wBP c1770850wBP = new C1770850wBP();
        c1770850wBP.LIZIZ = AFwS319S0000000_31.get$arr$(29);
        C736680Sv4.LJIIIIZZ(this, searchDetailKeyframeSheetVMMR, c20636915p9, c1770850wBP, new AwS645S0100000_31(viewOnAttachStateChangeListenerC20604515jv, 55), 4);
        VideoEventDispatchViewModel videoEventDispatchViewModel = this.LLILZLL;
        if (videoEventDispatchViewModel != null) {
            C736680Sv4.LJIIIIZZ(this, videoEventDispatchViewModel, new C2217381BqS() { // from class: X.15pA
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1ELP) obj).LLJJ;
                }
            }, null, new AwS645S0100000_31(this, 56), 6);
        }
        VideoViewModel videoViewModel = this.LLIZ;
        if (videoViewModel != null) {
            C736680Sv4.LJIIIIZZ(this, videoViewModel, new C2217381BqS() { // from class: X.15pE
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C709790Rsn) obj).LLILZ;
                }
            }, null, new AwS456S0200000_21(this, view, 10), 6);
        }
        MR().zQ2(this.LLILLJJLI, this.LLILLL);
        this.LLILZIL = System.currentTimeMillis();
        MR().BQ2(null, null, "");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.ew_, viewGroup, false);
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
