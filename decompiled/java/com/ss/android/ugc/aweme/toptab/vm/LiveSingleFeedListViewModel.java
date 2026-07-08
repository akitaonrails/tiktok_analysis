package com.ss.android.ugc.aweme.toptab.vm;

import X.AbstractC1264080j02;
import X.C09YA;
import X.C1264090j03;
import X.C1264100j04;
import X.C1264120j06;
import X.C1265700j2e;
import X.C1567620qtc;
import X.C19719512Dh;
import X.C2188811AlT;
import X.C627660Ojc;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import X.InterfaceC1581090rFL;
import X.InterfaceC1891350zJl;
import com.bytedance.android.livesdk.livesetting.feed.LiveOutSourceProviderConfigSetting;
import com.bytedance.ext_power_list.AssemSingleListViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.awemeservice.api.IRequestIdService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS603S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class LiveSingleFeedListViewModel extends AssemSingleListViewModel<Aweme, C1567620qtc, Long> {
    public boolean LL = true;
    public final C09YA LLILLJJLI = new C09YA(this, AFwS213S0000000_24.get$arr$(374));
    public final List<Aweme> LLILLL = new CopyOnWriteArrayList();

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1567620qtc(new C627660Ojc(null, null, null, null, 15), true);
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<Aweme> c627660Ojc) {
        setState(new AwS603S0100000_24(c627660Ojc, (C627660Ojc<InterfaceC1891350zJl>) 367));
    }

    public final List<Aweme> vQ2(FeedItemList feedItemList) {
        ArrayList arrayList = new ArrayList();
        for (Aweme aweme : feedItemList.getItems()) {
            ((CopyOnWriteArrayList) this.LLILLL).add(aweme);
            arrayList.add(aweme);
        }
        return arrayList;
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    /* JADX INFO: renamed from: wQ2, reason: merged with bridge method [inline-methods] */
    public final void listRemoveItem(Aweme aweme) {
        super.listRemoveItem(aweme);
        ((CopyOnWriteArrayList) this.LLILLL).remove(aweme);
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final Object whenRefresh(InterfaceC1364105Vn<? super AbstractC1264080j02<Aweme>> interfaceC1364105Vn) {
        String str;
        List<Aweme> list;
        try {
            InterfaceC1581090rFL interfaceC1581090rFL = (InterfaceC1581090rFL) this.LLILLJJLI.getValue().getOperator();
            if (this.LL) {
                str = "live_tab_draw_enter";
            } else {
                str = "live_tab_draw_refresh";
            }
            FeedItemList feedItemListFetchLiveFeedList = interfaceC1581090rFL.fetchLiveFeedList(str);
            this.LL = false;
            if (feedItemListFetchLiveFeedList.size() == 0 && !feedItemListFetchLiveFeedList.isHasMore()) {
                setState(new AwS603S0100000_24(feedItemListFetchLiveFeedList, 368));
                return new C1264100j04(new RuntimeException("no result"));
            }
            ((CopyOnWriteArrayList) this.LLILLL).clear();
            List<Aweme> listVQ2 = vQ2(feedItemListFetchLiveFeedList);
            if (C19719512Dh.LJI(listVQ2)) {
                list = listVQ2;
            } else {
                list = null;
            }
            xQ2(feedItemListFetchLiveFeedList.getRequestId(), list);
            if (feedItemListFetchLiveFeedList.isHasMore()) {
                setState(new AwS603S0100000_24(feedItemListFetchLiveFeedList, 369));
                return new C1265700j2e(null, null, listVQ2);
            }
            setState(new AwS603S0100000_24(feedItemListFetchLiveFeedList, 370));
            return new C1264120j06(listVQ2);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            setState(AFwS264S0000000_24.get$arr$(488));
            return new C1264100j04(e);
        }
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final Object whenLoadMore(Long l, InterfaceC1364105Vn<? super AbstractC1264080j02<Aweme>> interfaceC1364105Vn) {
        List<Aweme> list;
        l.longValue();
        try {
            FeedItemList feedItemListFetchLiveFeedList = ((InterfaceC1581090rFL) this.LLILLJJLI.getValue().getOperator()).fetchLiveFeedList("live_tab_draw_loadmore");
            if (feedItemListFetchLiveFeedList.size() == 0) {
                setState(new AwS603S0100000_24(feedItemListFetchLiveFeedList, 425));
                return C1264090j03.LIZIZ();
            }
            List<Aweme> listVQ2 = vQ2(feedItemListFetchLiveFeedList);
            if (C19719512Dh.LJI(listVQ2)) {
                list = listVQ2;
            } else {
                list = null;
            }
            xQ2(feedItemListFetchLiveFeedList.getRequestId(), list);
            if (feedItemListFetchLiveFeedList.isHasMore()) {
                setState(new AwS603S0100000_24(feedItemListFetchLiveFeedList, 426));
                return new C1265700j2e(null, null, listVQ2);
            }
            setState(new AwS603S0100000_24(feedItemListFetchLiveFeedList, 427));
            return new C1264120j06(listVQ2);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            setState(AFwS264S0000000_24.get$arr$(563));
            return new C1264100j04(e);
        }
    }

    public final void xQ2(String str, List list) {
        User user;
        IAwemeService iAwemeService;
        Aweme awemeLLILLL;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Object obj = ListProtector.get(list, i);
                Aweme aweme = (Aweme) obj;
                aweme.setRequestId(str);
                LiveRoomStruct newLiveRoomDataExt = AwemeExtKt.getNewLiveRoomDataExt(aweme);
                if (newLiveRoomDataExt != null) {
                    newLiveRoomDataExt.setRequestId(str);
                }
                if (!LiveOutSourceProviderConfigSetting.fixGetItemPos() && (iAwemeService = (IAwemeService) ServiceManager.get().getService(IAwemeService.class)) != null && (awemeLLILLL = iAwemeService.LLILLL(aweme)) != null) {
                    obj = awemeLLILLL;
                }
                Aweme aweme2 = (Aweme) obj;
                if (aweme2.getAuthor() == null) {
                    LiveRoomStruct newLiveRoomDataExt2 = AwemeExtKt.getNewLiveRoomDataExt(aweme2);
                    if (newLiveRoomDataExt2 != null) {
                        user = newLiveRoomDataExt2.owner;
                    } else {
                        user = null;
                    }
                    aweme2.setAuthor(user);
                }
                IRequestIdService iRequestIdService = (IRequestIdService) ServiceManager.get().getService(IRequestIdService.class);
                if (iRequestIdService != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(aweme2.getAid());
                    sbLIZ.append("37");
                    iRequestIdService.LIZIZ(i, C2188811AlT.LIZIZ(sbLIZ), str);
                }
                ListProtector.set(list, i, obj);
            }
        }
    }
}
