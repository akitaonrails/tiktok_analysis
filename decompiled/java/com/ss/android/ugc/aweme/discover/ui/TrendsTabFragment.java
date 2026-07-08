package com.ss.android.ugc.aweme.discover.ui;

import X.AbstractC1585810rMx;
import X.AbstractC21673619ry;
import X.AbstractC21673719rz;
import X.AbstractC339510DSr;
import X.C01GW;
import X.C036E;
import X.C098200Yq;
import X.C0C64;
import X.C0N1U;
import X.C0VWN;
import X.C117I;
import X.C11CQ;
import X.C11CS;
import X.C11CU;
import X.C11D0;
import X.C11D9;
import X.C11DA;
import X.C11DI;
import X.C11DQ;
import X.C11DU;
import X.C11DW;
import X.C11E9;
import X.C11EA;
import X.C12ES;
import X.C1389890mGx;
import X.C13IQ;
import X.C13LE;
import X.C13LQ;
import X.C14EU;
import X.C1514430pVp;
import X.C15O7;
import X.C1620280sGY;
import X.C1685300txQ;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C18012073q;
import X.C189200o6;
import X.C1893080zMY;
import X.C19259110Wf;
import X.C19371010qS;
import X.C19461811Ce;
import X.C19461911Cf;
import X.C19462011Cg;
import X.C19462211Ci;
import X.C19463211Cs;
import X.C19463311Ct;
import X.C19463611Cw;
import X.C19463711Cx;
import X.C19463911Cz;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C20673215v0;
import X.C2187451AjH;
import X.C2217381BqS;
import X.C2230608oa;
import X.C422590Ghd;
import X.C443120HZe;
import X.C452501pT;
import X.C531650Kt9;
import X.C616540OGe;
import X.C737030Svd;
import X.C746350TPl;
import X.C786410Ut5;
import X.C960203pA;
import X.EnumC1584370rKd;
import X.InterfaceC1581920rGg;
import X.InterfaceC1620270sGX;
import X.InterfaceC19461711Cd;
import X.InterfaceC19464611Dg;
import X.InterfaceC874803bO;
import Y.ACallableS183S0300000_29;
import Y.ACallableS432S0100000_29;
import Y.AObserverS231S0100000_29;
import Y.AsS51S0100000_25;
import Y.AsS55S0100000_29;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.jedi.arch.NestedState;
import com.bytedance.jedi.arch.ext.list.IListState;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.bytedance.jedi.arch.ext.list.ListViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.analysis.Analysis;
import com.ss.android.ugc.aweme.discover.adapter.DiscoverBannerViewHolder;
import com.ss.android.ugc.aweme.discover.adapter.TrendingTopicViewHolder;
import com.ss.android.ugc.aweme.discover.experiment.DiscoveryCommonPoolExperiment;
import com.ss.android.ugc.aweme.discover.model.Banner;
import com.ss.android.ugc.aweme.discover.model.DiscoverSectionItem;
import com.ss.android.ugc.aweme.discover.model.TrendingTopicOrAd;
import com.ss.android.ugc.aweme.discover.ui.TrendsTabFragment;
import com.ss.android.ugc.aweme.discover.viewmodel.TrendsTabViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.main.MainAnimViewModel;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AFwS292S0000000_9;
import kotlin.jvm.internal.AFwS300S0000000_16;
import kotlin.jvm.internal.AFwS317S0000000_29;
import kotlin.jvm.internal.AwS115S0110000_29;
import kotlin.jvm.internal.AwS270S0300000_26;
import kotlin.jvm.internal.AwS385S0200000_19;
import kotlin.jvm.internal.AwS395S0200000_29;
import kotlin.jvm.internal.AwS41S0001000_29;
import kotlin.jvm.internal.AwS41S0010000_29;
import kotlin.jvm.internal.AwS464S0200000_29;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlin.jvm.internal.AwS643S0100000_29;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes30.dex */
public final class TrendsTabFragment extends BaseDiscoverTabFragment implements InterfaceC1620270sGX, C11DI {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiElHELIOSOiw8PiA+Zzo6ZhE+LCE3OxEtKwkhKSIhLCEn";
    public C11CQ LLILLL;
    public C1749280vcc LLILZ;
    public C11CS LLILZIL;
    public final int LLILZLL = 2131830702;
    public final String LLIZ = "top_trends";
    public int LLIZLLLIL = 1;
    public MainAnimViewModel LLJ;
    public int LLJI;
    public final Set<String> LLJIJIL;
    public boolean LLJILJIL;
    public C11DI LLJILJILJ;
    public InterfaceC1620270sGX LLJILLL;
    public final C01GW LLJJ;
    public final Map<C13IQ<? extends RecyclerView.ViewHolder>, Queue<? extends RecyclerView.ViewHolder>> LLJJI;
    public boolean LLJJIII;
    public boolean LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public C11CU LLJJIJIL;
    public DiscoverBannerViewHolder LLJJJ;
    public C117I LLJJJIL;
    public Boolean LLJJJJ;

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment
    public final boolean isRegisterEventBus() {
        return true;
    }

    public final C11CS PR() {
        View viewFindViewById = this.LLILZIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.ckc) : null;
            this.LLILZIL = (C11CS) viewFindViewById;
        }
        return (C11CS) viewFindViewById;
    }

    public final C11CQ RR() {
        View viewFindViewById = this.LLILLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.msy) : null;
            this.LLILLL = (C11CQ) viewFindViewById;
        }
        return (C11CQ) viewFindViewById;
    }

    public final C1749280vcc SR() {
        View viewFindViewById = this.LLILZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.w28) : null;
            this.LLILZ = (C1749280vcc) viewFindViewById;
        }
        return (C1749280vcc) viewFindViewById;
    }

    public final TrendsTabViewModel UR() {
        return (TrendsTabViewModel) this.LLJJ.getValue();
    }

    @Override // X.C11DI
    public final void cQ() {
        C11DI c11di = this.LLJILJILJ;
        if (c11di != null) {
            c11di.cQ();
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, X.InterfaceC744180THc
    public final Analysis getAnalysis() {
        Analysis analysis = new Analysis();
        analysis.setLabelName("discovery_trends");
        return analysis;
    }

    @Override // X.InterfaceC1620270sGX
    public final void vq() {
        InterfaceC1620270sGX interfaceC1620270sGX = this.LLJILLL;
        if (interfaceC1620270sGX != null) {
            interfaceC1620270sGX.vq();
        }
    }

    public TrendsTabFragment() {
        new LinkedHashSet();
        this.LLJIJIL = new LinkedHashSet();
        this.LLJILJIL = true;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TrendsTabViewModel.class);
        this.LLJJ = C452501pT.LIZIZ(new AwS270S0300000_26(this, c19719912DlLIZ, c19719912DlLIZ, 7));
        this.LLJJI = new LinkedHashMap();
        this.LLJJIJIIJIL = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(53));
    }

    public final void WR() {
        getContext();
        try {
            if (C036E.LIZ.LIZIZ()) {
                if (this.LLJJIII) {
                    UR().qR2(false);
                    return;
                }
                SR().LJ();
                this.LLJJIJI = true;
                C786410Ut5.LLLZLZ(SR(), 0);
                UR().qR2(true);
                return;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        PR().setRefreshing(false);
        C1389890mGx c1389890mGx = new C1389890mGx(this);
        c1389890mGx.LJIIIZ(2131837962);
        c1389890mGx.LJIIJJI();
        if (this.LLJJIII) {
            return;
        }
        C1749280vcc c1749280vccSR = SR();
        C1722300uv6 c1722300uv6 = new C1722300uv6();
        C1893080zMY.LIZ(c1722300uv6, new AwS573S0100000_29(this, 90));
        c1749280vccSR.setStatus(c1722300uv6);
        this.LLJJIJI = false;
        C786410Ut5.LLLZLZ(SR(), 0);
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        new BPEAHandler(Looper.getMainLooper()).removeCallbacksAndMessages(null);
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        TrendsTabViewModel trendsTabViewModelUR = UR();
        trendsTabViewModelUR.getClass();
        trendsTabViewModelUR.setState(new AwS41S0010000_29(true, 0));
        RR().setAdapter(null);
        super.onDestroyView();
        this.LLILLL = null;
        this.LLILZ = null;
        this.LLILZIL = null;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        C19259110Wf c19259110Wf = C746350TPl.LIZ;
        if (c19259110Wf.LJIIJ == null) {
            c19259110Wf.LJIIJ = new C2230608oa<>("should_show_pull_strong_guide", Boolean.TRUE);
        }
        c19259110Wf.LJIIJ.LJ(Boolean.FALSE);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(TrendsTabFragment.class.getName());
        }
        super.onResume();
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.BaseDiscoverTabFragment
    public final String MR() {
        return this.LLIZ;
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.BaseDiscoverTabFragment
    public final int NR() {
        return this.LLILZLL;
    }

    public final void VR(boolean z) {
        if (!isViewValid()) {
            return;
        }
        if (PR().isEnabled()) {
            PR().setSelected(false);
        }
        if (PR().isEnabled()) {
            PR().setRefreshing(false);
        }
        withState(UR(), new AwS115S0110000_29(z, this, 0));
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        int itemCount;
        AbstractC21673619ry adapter;
        super.onConfigurationChanged(configuration);
        DiscoverBannerViewHolder discoverBannerViewHolder = this.LLJJJ;
        if (discoverBannerViewHolder != null) {
            discoverBannerViewHolder.onConfigurationChanged(getActivity(), configuration);
        }
        AbstractC21673619ry adapter2 = RR().getAdapter();
        if (adapter2 != null && (itemCount = adapter2.getItemCount()) >= 2 && (adapter = RR().getAdapter()) != null) {
            adapter.notifyItemRangeChanged(1, itemCount - 1);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.LLJILJIL) {
            C19371010qS.LIZ("discovery_trigger_net");
        }
    }

    @C14EU
    public final void onVideoEvent(C737030Svd c737030Svd) {
        Object obj = c737030Svd.LIZIZ;
        if (obj instanceof Aweme) {
            TrendsTabViewModel trendsTabViewModelUR = UR();
            trendsTabViewModelUR.getClass();
            trendsTabViewModelUR.withState(new AwS395S0200000_29(trendsTabViewModelUR, (Aweme) obj, 0));
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.BaseDiscoverTabFragment
    public final void OR(boolean z, boolean z2) {
        MutableLiveData<Boolean> mutableLiveData;
        DiscoverBannerViewHolder discoverBannerViewHolder;
        super.OR(z, z2);
        if (isViewValid() && RR() != null) {
            if (!z && this.LLIZLLLIL != 1) {
                return;
            }
            if (!z2 && (discoverBannerViewHolder = this.LLJJJ) != null) {
                discoverBannerViewHolder.IB(!z);
            }
            MainAnimViewModel mainAnimViewModel = this.LLJ;
            if (mainAnimViewModel != null && (mutableLiveData = mainAnimViewModel.LL) != null) {
                mutableLiveData.setValue(Boolean.valueOf(!z));
            }
            if (!z2) {
                TrendsTabViewModel trendsTabViewModelUR = UR();
                trendsTabViewModelUR.getClass();
                trendsTabViewModelUR.setState(new AwS41S0010000_29(z, 0));
            }
            if (!z) {
                C0N1U.LIZ.getClass();
                C1514430pVp.LJFF(EnumC1584370rKd.DISCOVER);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12, types: [X.11DC, X.11DS] */
    /* JADX WARN: Type inference failed for: r2v10, types: [X.11Cc] */
    /* JADX WARN: Type inference failed for: r3v2, types: [X.11Cx, X.11Cz, X.19ry] */
    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C11E9 c11e9;
        InterfaceC19464611Dg interfaceC19464611Dg;
        super.onViewCreated(view, bundle);
        if (SR() != null) {
            SR().setOnTouchListener(new View.OnTouchListener() { // from class: X.11D8
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    return true;
                }
            });
            SR().LJ();
            this.LLJJIJI = true;
        }
        RR().setLayoutManager(new WrapLinearLayoutManager(getContext(), 1));
        AbstractC21673719rz itemAnimator = RR().getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.LJIJJLI(0L);
        }
        RR().setLabel("discover_list");
        C0VWN.LIZ("discover_list", false).LIZIZ(RR());
        this.LLJJIJIL = new C11CU();
        C11CQ c11cqRR = RR();
        C11CU c11cu = this.LLJJIJIL;
        if (c11cu == null) {
            c11cu = null;
        }
        c11cqRR.addOnScrollListener(c11cu);
        RR().addOnScrollListener(new AsS55S0100000_29(this, 11));
        AbstractC339510DSr<DiscoverSectionItem> abstractC339510DSr = new AbstractC339510DSr<DiscoverSectionItem>() { // from class: X.11Cj
            @Override // X.AbstractC339510DSr
            public final boolean LIZ(DiscoverSectionItem discoverSectionItem, DiscoverSectionItem discoverSectionItem2) {
                DiscoverSectionItem.TrendingTopicOrAdSection trendingTopicOrAdSection;
                DiscoverSectionItem.BannerSection bannerSection;
                DiscoverSectionItem discoverSectionItem3 = discoverSectionItem;
                DiscoverSectionItem discoverSectionItem4 = discoverSectionItem2;
                Object obj = null;
                if (discoverSectionItem3 instanceof DiscoverSectionItem.BannerSection) {
                    List<Banner> list = ((DiscoverSectionItem.BannerSection) discoverSectionItem3).bannerList;
                    if ((discoverSectionItem4 instanceof DiscoverSectionItem.BannerSection) && (bannerSection = (DiscoverSectionItem.BannerSection) discoverSectionItem4) != null) {
                        obj = bannerSection.bannerList;
                    }
                    return Intrinsics.LJFF(list, obj);
                }
                if (discoverSectionItem3 instanceof DiscoverSectionItem.TrendingTopicOrAdSection) {
                    TrendingTopicOrAd trendingTopicOrAd = ((DiscoverSectionItem.TrendingTopicOrAdSection) discoverSectionItem3).trendingTopicOrAd;
                    if ((discoverSectionItem4 instanceof DiscoverSectionItem.TrendingTopicOrAdSection) && (trendingTopicOrAdSection = (DiscoverSectionItem.TrendingTopicOrAdSection) discoverSectionItem4) != null) {
                        obj = trendingTopicOrAdSection.trendingTopicOrAd;
                    }
                    return Intrinsics.LJFF(trendingTopicOrAd, obj);
                }
                throw new C1954807lC();
            }

            @Override // X.AbstractC339510DSr
            public final boolean LIZIZ(DiscoverSectionItem discoverSectionItem, DiscoverSectionItem discoverSectionItem2) {
                return Intrinsics.LJFF(discoverSectionItem, discoverSectionItem2);
            }
        };
        new C19463211Cs(abstractC339510DSr);
        final C11DU c11du = new C11DU(abstractC339510DSr, null);
        final C19463611Cw c19463611Cw = new C19463611Cw(this, c11du);
        ((ArrayList) c19463611Cw.LIZ).add(new C443120HZe(new AwS608S0100000_29(this, 891), AFwS292S0000000_9.get$arr$(74), null));
        ((ArrayList) c19463611Cw.LIZ).add(new C443120HZe(new AwS608S0100000_29(this, 892), AFwS292S0000000_9.get$arr$(75), AFwS300S0000000_16.get$arr$(80)));
        final LifecycleOwner lifecycleOwner = c19463611Cw.LIZIZ;
        if ((lifecycleOwner instanceof C11E9) && (c11e9 = (C11E9) lifecycleOwner) != null) {
            final ?? r1 = new C11DW(lifecycleOwner, c11du) { // from class: X.11DC
                @Override // X.C11DX
                public final void LLLI(C19465311Dn c19465311Dn) {
                    for (C443120HZe c443120HZe : (ArrayList) c19463611Cw.LIZ) {
                        Function1 function1 = (Function1) c443120HZe.getFirst();
                        Function2 function2 = (Function2) c443120HZe.getSecond();
                        c19465311Dn.LJFF(new AwS385S0200000_19(function2, (Function2<? super Integer, Object, Boolean>) this, (C11DC) 124), function1, (Function2) c443120HZe.getThird());
                    }
                }
            };
            C11DQ c11dq = r1.LL;
            if (c11dq != null) {
                interfaceC19464611Dg = c11dq.LIZ;
            } else {
                interfaceC19464611Dg = null;
            }
            ?? r3 = new C19463911Cz(r1) { // from class: X.11Cx
            };
            C19462211Ci c19462211Ci = new C19462211Ci(r1, r3, c11e9);
            c19462211Ci.LJIIIZ = (ListViewModel) interfaceC19464611Dg;
            c19462211Ci.LIZLLL = 242;
            c19462211Ci.LJ = AFwS300S0000000_16.get$arr$(81);
            c19462211Ci.LJIIIZ = UR();
            c19462211Ci.LJFF = new int[]{0};
            c19462211Ci.LJII = new C19461811Ce(new AwS608S0100000_29(this, 894), new AwS643S0100000_29(this, 187), new AwS643S0100000_29(this, 188));
            c19462211Ci.LJIIIIZZ = new C19462011Cg(AFwS273S0000000_29.get$arr$(359), AFwS317S0000000_29.get$arr$(21), new AwS643S0100000_29(this, 185));
            C11CQ c11cqRR2 = RR();
            ListViewModel<T, ?, ?> listViewModel = c19462211Ci.LJIIIZ;
            if (listViewModel != 0) {
                C11EA.LJII(c11e9, listViewModel, new C2217381BqS() { // from class: X.11Cp
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj) {
                        return ((ListState) ((NestedState) obj).getSubstate()).getHasMore();
                    }
                }, new AwS643S0100000_29(c19462211Ci, (C19462211Ci<Object, C19463711Cx<Object>, InterfaceC874803bO>) 113));
                C11EA.LJII(c11e9, listViewModel, new C2217381BqS() { // from class: X.11Cq
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj) {
                        return ((ListState) ((NestedState) obj).getSubstate()).isEmpty();
                    }
                }, new AwS643S0100000_29(c19462211Ci, (C19462211Ci<Object, C19463711Cx<Object>, InterfaceC874803bO>) 108));
                C11EA.LIZIZ(c11e9, listViewModel, new C2217381BqS() { // from class: X.11Cl
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj) {
                        return ((ListState) ((NestedState) obj).getSubstate()).getRefresh();
                    }
                }, new AwS464S0200000_29(c19462211Ci, (C19462211Ci<Object, C19463711Cx<Object>, InterfaceC874803bO>) listViewModel, (ListViewModel<Object, ?, IListState<Object, ?>>) 22), new AwS608S0100000_29(c19462211Ci, (C19462211Ci<Object, C19463711Cx<Object>, InterfaceC874803bO>) OppoPermissionPopupMaskDelayExp.DEFAULT), new AwS643S0100000_29(c19462211Ci, (C19462211Ci<Object, C19463711Cx<Object>, InterfaceC874803bO>) 109), 2);
                C11EA.LIZIZ(c11e9, listViewModel, new C2217381BqS() { // from class: X.11Ck
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj) {
                        return ((ListState) ((NestedState) obj).getSubstate()).getLoadMore();
                    }
                }, new AwS643S0100000_29(c19462211Ci, (C19462211Ci<Object, C19463711Cx<Object>, InterfaceC874803bO>) 110), new AwS608S0100000_29(c19462211Ci, (C19462211Ci<Object, C19463711Cx<Object>, InterfaceC874803bO>) 702), new AwS643S0100000_29(c19462211Ci, (C19462211Ci<Object, C19463711Cx<Object>, InterfaceC874803bO>) 111), 2);
                C11EA.LJII(c11e9, listViewModel, new C2217381BqS() { // from class: X.11Co
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj) {
                        return ((ListState) ((NestedState) obj).getSubstate()).getList();
                    }
                }, new AwS643S0100000_29(c19462211Ci, (C19462211Ci<Object, C19463711Cx<Object>, InterfaceC874803bO>) 112));
                r3.LLLIILIL(c19462211Ci.LIZLLL);
                int[] iArr = c19462211Ci.LJFF;
                int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
                int i = r3.LLILZIL.LJIIIZ;
                if (iArrCopyOf.length == 0) {
                    throw new UnsupportedOperationException("Empty array can't be reduced.");
                }
                int i2 = iArrCopyOf[0];
                C531650Kt9 it2 = new IntRange(1, iArrCopyOf.length - 1).iterator();
                while (it2.LLILLL) {
                    i2 |= iArrCopyOf[it2.nextInt()];
                }
                if (i != i2) {
                    C11D0 c11d0 = r3.LLILZIL;
                    c11d0.LJIIIZ = i2;
                    if (r3.LLIZ.LLILLL != null && c11d0.isEnable()) {
                        r3.LLILZIL.LJ();
                        r3.notifyDataSetChanged();
                    }
                }
                if (c19462211Ci.LIZLLL != 241) {
                    ListViewModel<T, ?, ?> listViewModel2 = c19462211Ci.LJIIIZ;
                    if (listViewModel2 != 0) {
                        AwS573S0100000_29 awS573S0100000_29 = new AwS573S0100000_29((ListViewModel) listViewModel2, 965);
                        C19461911Cf c19461911Cf = r3.LLILZ;
                        c19461911Cf.LJIIJ = awS573S0100000_29;
                        if (c19461911Cf.LJIIIIZZ == 241) {
                            r3.LLLIILIL(242);
                        }
                    }
                    Function2 function2 = c19462211Ci.LJ;
                    if (function2 == null) {
                        if (c19462211Ci.LIZLLL == 242) {
                            function2 = AFwS317S0000000_29.get$arr$(18);
                        } else {
                            function2 = AFwS317S0000000_29.get$arr$(19);
                        }
                    }
                    AwS395S0200000_29 awS395S0200000_29 = new AwS395S0200000_29(function2, (Function2<? super ViewGroup, ? super Function0<Unit>, ? extends C11DA>) c19462211Ci, (C19462211Ci<Object, C19463711Cx<Object>, InterfaceC874803bO>) 97);
                    C19461911Cf c19461911Cf2 = r3.LLILZ;
                    Function1<? super ViewGroup, ? extends C11DA> function1 = c19461911Cf2.LJ;
                    if (function1 == null || function1 != awS395S0200000_29) {
                        c19461911Cf2.LJ = awS395S0200000_29;
                        if (r3.LLIZ.LLILLL != null && c19461911Cf2.isEnable()) {
                            r3.LLILZ.LJ();
                            r3.notifyItemRemoved(r3.LLLII() + r3.LLLI() + r3.LLLFZ());
                            r3.notifyItemInserted(r3.LLLII() + r3.LLLI() + r3.LLLFZ());
                            C19461911Cf c19461911Cf3 = r3.LLILZ;
                            int i3 = c19461911Cf3.LJII;
                            C11DA c11da = c19461911Cf3.LJI;
                            if (c11da != null) {
                                c11da.LIZIZ(i3);
                            }
                        }
                    }
                }
                if (C13LQ.LJIILJJIL(1, c19462211Ci.LJFF)) {
                    AwS608S0100000_29 awS608S0100000_29 = new AwS608S0100000_29(c19462211Ci, (C19462211Ci<Object, C19463711Cx<Object>, InterfaceC874803bO>) 701);
                    C11D0 c11d02 = r3.LLILZIL;
                    Function1<? super ViewGroup, ? extends C11D9> function12 = c11d02.LJI;
                    if (function12 == null || function12 != awS608S0100000_29) {
                        c11d02.LJI = awS608S0100000_29;
                        if (r3.LLIZ.LLILLL != null && c11d02.isEnable()) {
                            r3.LLILZIL.LJ();
                            r3.notifyDataSetChanged();
                        }
                    }
                }
                c11cqRR2.setAdapter(r3);
                if (((Boolean) C18012073q.LIZ.getValue()).booleanValue()) {
                    RR().addOnScrollListener(new AsS51S0100000_25(this, 11));
                }
                C11CQ c11cqRR3 = RR();
                final int iLIZ = C960203pA.LIZ(R.attr.ng, RR().getContext());
                final int iLIZJ = (int) C12ES.LIZJ(16.0f, getContext());
                final int iLIZJ2 = (int) C12ES.LIZJ(16.0f, getContext());
                c11cqRR3.addItemDecoration(new C422590Ghd(iLIZ, iLIZJ, iLIZJ2) { // from class: X.0Gl9
                    @Override // X.C0DXR
                    public final void LIZIZ(Rect rect, View view2, RecyclerView recyclerView, C21673919s1 c21673919s1) {
                        RecyclerView.ViewHolder childViewHolder = recyclerView.getChildViewHolder(view2);
                        int childAdapterPosition = recyclerView.getChildAdapterPosition(view2);
                        if (childAdapterPosition > 0 && childAdapterPosition < this.LLIZ.RR().getAdapter().getItemCount() - 1 && (childViewHolder instanceof TrendingTopicViewHolder)) {
                            if (this.LLILZIL == 1) {
                                rect.set(0, 0, 0, 0);
                            } else {
                                rect.set(0, 0, this.LLILLL, 0);
                            }
                        }
                    }
                });
                RR().setItemAnimator(null);
                PR().LJJIIZ((int) C12ES.LIZJ(49.0f, getActivity()), (int) C12ES.LIZJ(113.0f, getActivity()));
                PR().setOnRefreshListener(new InterfaceC1581920rGg() { // from class: X.11CR
                    @Override // X.InterfaceC1581920rGg
                    public final void LJFF() {
                        if (this.LL.PR() == null || !this.LL.PR().isEnabled()) {
                            this.LL.getClass();
                        } else {
                            this.LL.WR();
                        }
                    }
                });
                if (C0C64.LJIILLIIL().LJIJ(31744, 0, "discovery_pre_create_viewholder", true) == 1) {
                    C15O7.LIZJ(new ACallableS432S0100000_29(this, 16));
                }
                if (((DiscoveryCommonPoolExperiment.DiscoveryCommonPoolExperimentConfig) DiscoveryCommonPoolExperiment.LIZIZ.getValue()).enable) {
                    C15O7.LIZJ(new ACallableS183S0300000_29(new C1620280sGY(this), this, new BPEAHandler(), 1));
                }
                C11CQ c11cqRR4 = RR();
                ?? r2 = new InterfaceC19461711Cd() { // from class: X.11Cc
                    @Override // X.InterfaceC19461711Cd
                    public final Object LIZ(int i4) {
                        TrendsTabFragment trendsTabFragment = this.LIZ;
                        return trendsTabFragment.withState(trendsTabFragment.UR(), new AwS41S0001000_29(i4, 1));
                    }
                };
                if (c11cqRR4 != null && !(c11cqRR4.getTag(R.id.t0x) instanceof C19463311Ct)) {
                    c11cqRR4.addOnScrollListener(new AbstractC1585810rMx() { // from class: X.11CT
                        @Override // X.AbstractC1585810rMx
                        public final void LJJIIZI(RecyclerView recyclerView, int i4, int i5) {
                            C19463411Cu.LIZ(recyclerView);
                        }
                    });
                    c11cqRR4.setTag(R.id.t0x, new C19463311Ct(r2));
                }
                MainAnimViewModel mainAnimViewModel = (MainAnimViewModel) ViewModelProviders.of(getActivity()).get(MainAnimViewModel.class);
                this.LLJ = mainAnimViewModel;
                mainAnimViewModel.LL.observe(this, new AObserverS231S0100000_29(this, 40));
                C11CQ c11cqRR5 = RR();
                if (c11cqRR5 != null) {
                    c11cqRR5.setBackground(null);
                }
                C11CS c11csPR = PR();
                if (c11csPR != null) {
                    c11csPR.setBackground(null);
                    return;
                }
                return;
            }
            "realAdapter does not provide viewModel, please specify one".toString();
            throw new IllegalArgumentException("realAdapter does not provide viewModel, please specify one");
        }
        "realAdapter does not provide ISubscriber, please specify it".toString();
        throw new IllegalArgumentException("realAdapter does not provide ISubscriber, please specify it");
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewLIZLLL = C20673215v0.LIZLLL(R.layout.bmy, getActivity(), viewGroup, false);
        C19GS c19gs = null;
        if (!(viewLIZLLL instanceof View)) {
            viewLIZLLL = null;
        }
        if (viewLIZLLL != null) {
            try {
                ViewTreeLifecycleOwner.set(viewLIZLLL, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewLIZLLL, this);
                viewLIZLLL.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewLIZLLL;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewLIZLLL;
    }
}
