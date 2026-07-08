package com.ss.android.ugc.aweme.toptab.vm;

import X.AbstractC316870CbV;
import X.C09YA;
import X.C1210880hcE;
import X.C13BV;
import X.C14EU;
import X.C15438062q;
import X.C1581070rFJ;
import X.C1581110rFN;
import X.C1697810uHb;
import X.C20684815ws;
import X.C316640Cb8;
import X.C316650Cb9;
import X.C317290CcB;
import X.C343280Dd0;
import X.C622680Oba;
import X.C627660Ojc;
import X.EnumC323450Cm7;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import X.InterfaceC1581090rFL;
import X.InterfaceC1891350zJl;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.network.spi.INetworkStateService;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AwS390S0200000_24;
import kotlin.jvm.internal.AwS603S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class LiveDualFeedListViewModel extends AssemListViewModel<C1581070rFJ, C343280Dd0, C1581110rFN> {
    public AbstractC316870CbV<C1581110rFN> LL;
    public boolean LLILLJJLI = true;
    public final C09YA LLILLL = new C09YA(this, AFwS213S0000000_24.get$arr$(373));

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1581070rFJ(0);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        C622680Oba.LIZLLL(this);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        C622680Oba.LIZJ(this);
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<C343280Dd0> c627660Ojc) {
        setState(new AwS603S0100000_24(c627660Ojc, (C627660Ojc<InterfaceC1891350zJl>) 366));
    }

    @C14EU
    public final void onDeleteAwemeEvent(C1210880hcE c1210880hcE) {
        withState(new AwS390S0200000_24(this, c1210880hcE, 53));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC1364105Vn<? super AbstractC316870CbV<C1581110rFN>> interfaceC1364105Vn) {
        return vQ2(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v3, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.ArrayList] */
    public final AbstractC316870CbV<C1581110rFN> vQ2(boolean z) {
        String str;
        ?? arrayList;
        AbstractC316870CbV<C1581110rFN> c316640Cb8;
        ?? arrayList2;
        List<Aweme> items;
        if (!z) {
            try {
                wQ2("slide_up");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                AbstractC316870CbV.LIZ.getClass();
                C316650Cb9 c316650Cb9 = new C316650Cb9(e);
                this.LL = c316650Cb9;
                return c316650Cb9;
            }
        }
        if (this.LLILLJJLI) {
            str = "live_tab_cover_enter";
        } else if (z) {
            str = "live_tab_cover_refresh";
        } else {
            str = "live_tab_cover_loadmore";
        }
        int i = 0;
        this.LLILLJJLI = false;
        FeedItemList feedItemListFetchLiveFeedList = ((InterfaceC1581090rFL) this.LLILLL.getValue().getOperator()).fetchLiveFeedList(str);
        if (z && ((items = feedItemListFetchLiveFeedList.getItems()) == null || items.isEmpty())) {
            C1581070rFJ c1581070rFJ = (C1581070rFJ) getState();
            c1581070rFJ.getClass();
            List<C343280Dd0> list = c1581070rFJ.getListState().LLILZ;
            if (list != null && !list.isEmpty()) {
                C1581070rFJ c1581070rFJ2 = (C1581070rFJ) getState();
                c1581070rFJ2.getClass();
                List<C343280Dd0> list2 = c1581070rFJ2.getListState().LLILZ;
                if (list2 != null) {
                    return C317290CcB.LJ(AbstractC316870CbV.LIZ, null, new Object() { // from class: X.0rFN
                    }, list2, 1);
                }
            }
        }
        if (feedItemListFetchLiveFeedList.hasMore == 1) {
            C317290CcB c317290CcB = AbstractC316870CbV.LIZ;
            List<Aweme> items2 = feedItemListFetchLiveFeedList.getItems();
            if (items2 != null) {
                arrayList2 = new ArrayList(C15438062q.LJIJJ(items2, 10));
                for (Aweme aweme : items2) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        arrayList2.add(new C343280Dd0(aweme, feedItemListFetchLiveFeedList.getRequestId(), feedItemListFetchLiveFeedList.logPb));
                        i = i2;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
            } else {
                arrayList2 = C13BV.INSTANCE;
            }
            c316640Cb8 = C317290CcB.LJ(c317290CcB, null, new Object() { // from class: X.0rFN
            }, arrayList2, 1);
        } else {
            C317290CcB c317290CcB2 = AbstractC316870CbV.LIZ;
            List<Aweme> items3 = feedItemListFetchLiveFeedList.getItems();
            if (items3 != null) {
                arrayList = new ArrayList(C15438062q.LJIJJ(items3, 10));
                for (Aweme aweme2 : items3) {
                    int i3 = i + 1;
                    if (i >= 0) {
                        arrayList.add(new C343280Dd0(aweme2, feedItemListFetchLiveFeedList.getRequestId(), feedItemListFetchLiveFeedList.logPb));
                        i = i3;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
            } else {
                arrayList = C13BV.INSTANCE;
            }
            c317290CcB2.getClass();
            c316640Cb8 = new C316640Cb8<>(arrayList);
        }
        this.LL = c316640Cb8;
        return c316640Cb8;
    }

    public final void wQ2(String str) {
        if (str.length() == 0) {
            return;
        }
        C20684815ws.LJIJI("refresh_homepage_live", new Pair("homepage_live", "enter_from"), new Pair("live_cell", "enter_method"), new Pair(str, "refresh_method"), new Pair(Integer.valueOf(((INetworkStateService) ServiceManager.get().getService(INetworkStateService.class)).getEffectiveConnectionType()), "network_status"));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(C1581110rFN c1581110rFN, InterfaceC1364105Vn<? super AbstractC316870CbV<C1581110rFN>> interfaceC1364105Vn) {
        return vQ2(false);
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final List<C343280Dd0> onLoadPageAddData(EnumC323450Cm7 enumC323450Cm7, List<C343280Dd0> list, List<C343280Dd0> list2) {
        List<C343280Dd0> listOnLoadPageAddData = super.onLoadPageAddData(enumC323450Cm7, list, list2);
        if (enumC323450Cm7 == EnumC323450Cm7.Refresh && list2.isEmpty() && (this.LL instanceof C316650Cb9)) {
            return new ArrayList(list);
        }
        return listOnLoadPageAddData;
    }
}
