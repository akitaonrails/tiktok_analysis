package com.ss.android.ugc.aweme.series.serieslist.viewmodel;

import X.AbstractC1574500r4i;
import X.AbstractC316870CbV;
import X.C01GW;
import X.C1159160gGo;
import X.C1259810it9;
import X.C13LP;
import X.C15438062q;
import X.C1559260qg8;
import X.C1572600r1e;
import X.C1572960r2E;
import X.C1572980r2G;
import X.C1573930r3n;
import X.C1573950r3p;
import X.C1574380r4W;
import X.C1574470r4f;
import X.C1574580r4q;
import X.C1574690r51;
import X.C1576640r8A;
import X.C1613940s6K;
import X.C1617190sBZ;
import X.C1617470sC1;
import X.C19719612Di;
import X.C20684815ws;
import X.C2344009Gk;
import X.C296950BkT;
import X.C452501pT;
import X.C5180020c;
import X.C627660Ojc;
import X.C844470XAv;
import X.EnumC1574490r4h;
import X.EnumC1612760s4Q;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import X.InterfaceC1891350zJl;
import Y.AObserverS226S0100000_24;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.SeriesCategory;
import com.ss.android.ugc.aweme.minidrama.common.preload.MiniDramaVideoApi;
import com.ss.android.ugc.aweme.model.CollectionDetailModel;
import com.ss.android.ugc.aweme.model.PriceInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.series.favorite.appdiff.SeriesFavoriteAppDiffProtocol;
import com.ss.android.ugc.aweme.service.ISeriesPricingService;
import com.ss.android.ugc.profile.platform.multiapp.IProfileItemTrackService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS127S1200000_11;
import kotlin.jvm.internal.AwS390S0200000_24;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.AwS75S0210000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class SeriesListAssemViewModel extends AssemListViewModel<C1572980r2G, C1573950r3p, Integer> {
    public static final int LLILZIL;
    public final List<C1573950r3p> LL = new ArrayList();
    public int LLILLJJLI = -1;
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(335));
    public final C1559260qg8 LLILZ = new C1559260qg8(new AwS127S1200000_11((AssemViewModel) this, (AssemViewModel<Object>) C1572960r2E.class, (Class<Object>) "paid_content_collection_list_hierarchy_data_key", (String) 13), true);

    static {
        SeriesFavoriteAppDiffProtocol.LIZ.getClass();
        C1572600r1e.LIZ().LJIIIZ();
        LLILZIL = 8;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1572980r2G(0);
    }

    public final C1572960r2E xQ2() {
        return (C1572960r2E) this.LLILZ.getValue();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        String strVQ2 = vQ2();
        if (strVQ2 == null) {
            return;
        }
        Map<EnumC1574490r4h, Map<String, Aweme>> map = C1574470r4f.LIZ;
        if (strVQ2.length() != 0) {
            C1574470r4f.LIZIZ.remove(strVQ2);
            Set<Pair<String, List<Long>>> set = C1574470r4f.LIZJ;
            synchronized (set) {
                try {
                    C19719612Di.LJJIII(set, new C5180020c(strVQ2, 3), true);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    public final String vQ2() {
        if (!Intrinsics.LJFF(xQ2().LLJILJIL, "personal_homepage_favorite_series")) {
            return null;
        }
        SeriesFavoriteAppDiffProtocol.LIZ.getClass();
        SeriesFavoriteAppDiffProtocol seriesFavoriteAppDiffProtocolLIZ = C1572600r1e.LIZ();
        String str = xQ2().LLILLL;
        seriesFavoriteAppDiffProtocolLIZ.LIZIZ(str);
        return str;
    }

    public final void BQ2(List<C1573950r3p> list) {
        ConcurrentHashMap<String, Aweme> concurrentHashMapPutIfAbsent;
        final String strVQ2 = vQ2();
        if (strVQ2 == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<C1573950r3p> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(Long.valueOf(it2.next().LL.collectionId));
        }
        if (arrayList.isEmpty()) {
            return;
        }
        C1574690r51.LIZ.getClass();
        if (C1574690r51.LIZ()) {
            C1574580r4q.LIZIZ.LJI(arrayList, C1574380r4W.LIZ, new AbstractC1574500r4i(strVQ2) { // from class: X.0qat
                public final String LIZ;

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C1556010qat) && Intrinsics.LJFF(this.LIZ, ((C1556010qat) obj).LIZ);
                }

                public final int hashCode() {
                    return this.LIZ.hashCode();
                }

                public final String toString() {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("FavoriteList(enterFrom=");
                    sbLIZ.append(this.LIZ);
                    sbLIZ.append(')');
                    return C2188811AlT.LIZIZ(sbLIZ);
                }

                @Override // X.AbstractC1574500r4i
                public final String LIZ() {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("favorite_list:");
                    sbLIZ.append(this.LIZ);
                    return C2188811AlT.LIZIZ(sbLIZ);
                }

                {
                    this.LIZ = strVQ2;
                }
            }, null);
            return;
        }
        Map<EnumC1574490r4h, Map<String, Aweme>> map = C1574470r4f.LIZ;
        Integer numValueOf = Integer.valueOf(CastIntegerProtector.parseInt("1"));
        if (C296950BkT.LIZ() && strVQ2.length() != 0) {
            ConcurrentHashMap<String, ConcurrentHashMap<String, Aweme>> concurrentHashMap = C1574470r4f.LIZIZ;
            ConcurrentHashMap<String, Aweme> concurrentHashMap2 = concurrentHashMap.get(strVQ2);
            if (concurrentHashMap2 == null && (concurrentHashMapPutIfAbsent = concurrentHashMap.putIfAbsent(strVQ2, (concurrentHashMap2 = new ConcurrentHashMap<>()))) != null) {
                concurrentHashMap2 = concurrentHashMapPutIfAbsent;
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (!concurrentHashMap2.containsKey(String.valueOf(((Number) obj).longValue()))) {
                    arrayList2.add(obj);
                }
            }
            if (!arrayList2.isEmpty()) {
                Pair<String, List<Long>> pair = new Pair<>(strVQ2, C13LP.LJLLJ(arrayList2));
                Set<Pair<String, List<Long>>> set = C1574470r4f.LIZJ;
                synchronized (set) {
                    try {
                        if (!set.add(pair)) {
                            return;
                        }
                        C1617470sC1 c1617470sC1 = MiniDramaVideoApi.LIZ;
                        AwS390S0200000_24 awS390S0200000_24 = new AwS390S0200000_24((Pair) pair, (Pair<String, ? extends List<Long>>) concurrentHashMap2, (ConcurrentHashMap<String, Aweme>) strVQ2, (String) 67);
                        c1617470sC1.getClass();
                        C1617470sC1.LIZ(arrayList2, numValueOf, awS390S0200000_24);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
        }
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<C1573950r3p> c627660Ojc) {
        setState(new AwS603S0100000_24(c627660Ojc, (C627660Ojc<InterfaceC1891350zJl>) 271));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC1364105Vn<? super AbstractC316870CbV<Integer>> interfaceC1364105Vn) {
        return zQ2(xQ2().LLILLJJLI, 0L, xQ2().LL, interfaceC1364105Vn);
    }

    public final C1159160gGo wQ2(C1573950r3p c1573950r3p) {
        String string;
        CollectionDetailModel collectionDetailModel;
        String str = xQ2().LLILLL;
        IProfileItemTrackService.LIZ.getClass();
        C1259810it9.LIZ().LIZJ();
        Boolean bool = Boolean.TRUE;
        if (c1573950r3p == null || (collectionDetailModel = c1573950r3p.LL) == null || (string = Long.valueOf(collectionDetailModel.collectionId).toString()) == null) {
            string = "";
        }
        return new C1159160gGo(str, null, "series", string, null, bool, null, "video");
    }

    public final void AQ2(LifecycleOwner lifecycleOwner, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            CollectionDetailModel collectionDetailModel = ((C1573950r3p) it2.next()).LL;
            PriceInfo priceInfo = collectionDetailModel.priceInfo;
            if (priceInfo != null) {
                arrayList.add(new C1617190sBZ(collectionDetailModel.collectionId, priceInfo, collectionDetailModel.discountedPriceInfo, collectionDetailModel.singleVideoPriceInfo));
            }
        }
        ISeriesPricingService.LIZ.getClass();
        ISeriesPricingService iSeriesPricingServiceLIZ = C1613940s6K.LIZ();
        if (iSeriesPricingServiceLIZ != null) {
            C844470XAv.LIZ.getClass();
            LiveData<Map<Long, C1576640r8A>> liveDataLIZJ = iSeriesPricingServiceLIZ.LIZJ(C844470XAv.LIZ(), arrayList);
            if (liveDataLIZJ != null) {
                liveDataLIZJ.observe(lifecycleOwner, new AObserverS226S0100000_24(this, 31));
            }
        }
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(Integer num, InterfaceC1364105Vn<? super AbstractC316870CbV<Integer>> interfaceC1364105Vn) {
        return zQ2(xQ2().LLILLJJLI, num.intValue(), xQ2().LL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void yQ2(C1573950r3p c1573950r3p, int i) {
        String uid;
        boolean z;
        C1573950r3p c1573950r3pListGetAt;
        if (xQ2().LLILZLL) {
            if (c1573950r3p != null) {
                int i2 = this.LLILLJJLI;
                if (i2 == i) {
                    this.LLILLJJLI = -1;
                    withState(new AwS75S0210000_24(c1573950r3p.LL, false, this, 5));
                } else {
                    if (i2 != -1 && (c1573950r3pListGetAt = listGetAt(i2)) != null) {
                        withState(new AwS75S0210000_24(c1573950r3pListGetAt.LL, false, this, 5));
                    }
                    withState(new AwS75S0210000_24(c1573950r3p.LL, true, this, 5));
                    this.LLILLJJLI = i;
                }
                if (this.LLILLJJLI == -1) {
                    setState(AFwS264S0000000_24.get$arr$(722));
                    return;
                } else {
                    setState(AFwS264S0000000_24.get$arr$(723));
                    return;
                }
            }
            return;
        }
        if (c1573950r3p == null) {
            return;
        }
        CollectionDetailModel collectionDetailModel = c1573950r3p.LL;
        if (xQ2().LLIZ) {
            if (c1573950r3p.LL.category == SeriesCategory.MINI_DRAMA) {
                z = true;
            } else {
                z = false;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(((C1572980r2G) getState()).LLILLL);
            if (linkedHashMap.containsKey(Long.valueOf(collectionDetailModel.collectionId))) {
                linkedHashMap.remove(Long.valueOf(collectionDetailModel.collectionId));
                setState(new AwS603S0100000_24(linkedHashMap, (Map<Long, CollectionDetailModel>) 625));
                withState(new AwS75S0210000_24(collectionDetailModel, false, this, 5));
                return;
            } else {
                if (linkedHashMap.size() == 10) {
                    setState(AFwS264S0000000_24.get$arr$(720));
                    return;
                }
                if (z) {
                    linkedHashMap.clear();
                    withState(new AwS603S0100000_24(this, 624));
                }
                linkedHashMap.put(Long.valueOf(collectionDetailModel.collectionId), collectionDetailModel);
                setState(new AwS603S0100000_24(linkedHashMap, (Map<Long, CollectionDetailModel>) 626));
                withState(new AwS75S0210000_24(collectionDetailModel, true, this, 5));
                return;
            }
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", xQ2().LLILLL);
        c2344009Gk.LJIIIIZZ("tab_name", "series");
        User user = collectionDetailModel.collectionCreator;
        String uid2 = null;
        if (user != null) {
            uid = user.getUid();
        } else {
            uid = null;
        }
        c2344009Gk.LJIIIIZZ("author_id", uid);
        c2344009Gk.LIZLLL(collectionDetailModel.collectionId, "collection_id");
        C20684815ws.LJIILLIIL("click_personal_collection", c2344009Gk.LIZ);
        IProfileItemTrackService.LIZ.getClass();
        IProfileItemTrackService iProfileItemTrackServiceLIZ = C1259810it9.LIZ();
        wQ2(c1573950r3p);
        iProfileItemTrackServiceLIZ.LIZ();
        C844470XAv.LIZ.getClass();
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(C844470XAv.LIZ(), "aweme://paidcontent/collections/detail");
        smartRouteBuildRoute.withParam("collection_id", String.valueOf(collectionDetailModel.collectionId));
        User user2 = collectionDetailModel.collectionCreator;
        if (user2 != null) {
            uid2 = user2.getUid();
        }
        smartRouteBuildRoute.withParam("owner_id", uid2);
        smartRouteBuildRoute.withParam("from_collection_list", true);
        SeriesFavoriteAppDiffProtocol.LIZ.getClass();
        SeriesFavoriteAppDiffProtocol seriesFavoriteAppDiffProtocolLIZ = C1572600r1e.LIZ();
        String str = xQ2().LLILLL;
        seriesFavoriteAppDiffProtocolLIZ.LIZIZ(str);
        smartRouteBuildRoute.withParam("enter_from", str);
        smartRouteBuildRoute.withParam("session_id", xQ2().LLILZ);
        smartRouteBuildRoute.withParam("root_scene", xQ2().LLJI);
        smartRouteBuildRoute.withParam("entry_source", EnumC1612760s4Q.SERIES_LIST);
        smartRouteBuildRoute.withParam("is_ad", xQ2().LLJ);
        smartRouteBuildRoute.withParam("category", collectionDetailModel.category.name());
        String str2 = xQ2().LLJILJIL;
        if (str2 != null) {
            smartRouteBuildRoute.withParam("series_enter_entrance", str2);
        }
        C1573930r3n.LIZ.getClass();
        if (C1573930r3n.LIZ()) {
            smartRouteBuildRoute.withParam("collection_detail", c1573950r3p.LL);
        }
        smartRouteBuildRoute.open();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zQ2(int r19, long r20, long r22, X.InterfaceC1364105Vn r24) {
        /*
            Method dump skipped, instruction units count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.series.serieslist.viewmodel.SeriesListAssemViewModel.zQ2(int, long, long, X.05Vn):java.lang.Object");
    }
}
