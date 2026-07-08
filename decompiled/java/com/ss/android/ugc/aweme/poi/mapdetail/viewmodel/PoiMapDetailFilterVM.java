package com.ss.android.ugc.aweme.poi.mapdetail.viewmodel;

import X.C1176370giZ;
import X.C1176550gir;
import X.C13LP;
import X.C15438062q;
import X.C1697810uHb;
import X.InterfaceC0148002o;
import Y.AComparatorS37S0000000_18;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.poi.mapdetail.model.PoiFeedCenterRecallArea;
import com.ss.android.ugc.aweme.poi.mapdetail.model.PoiFeedFilterOption;
import com.ss.android.ugc.aweme.poi.mapdetail.model.PoiGeneralCard;
import com.ss.android.ugc.aweme.poi.mapdetail.model.PoiMapDetailResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiMapDetailFilterVM extends AssemViewModel<C1176370giZ> {
    public PoiMapDetailAreaFilterVM LL;
    public boolean LLILLJJLI;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1176370giZ(0);
    }

    public final PoiFeedCenterRecallArea vQ2() {
        PoiMapDetailAreaFilterVM poiMapDetailAreaFilterVM = this.LL;
        if (poiMapDetailAreaFilterVM != null) {
            return poiMapDetailAreaFilterVM.vQ2();
        }
        return null;
    }

    public final String wQ2() {
        List<PoiFeedFilterOption> listLJIJJLI;
        String str;
        StringBuilder sb = new StringBuilder();
        if (vQ2() != null) {
            sb.append("area");
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Map<C1176550gir, List<PoiFeedFilterOption>> map = getState().LL;
        List<String> listLLIIII = null;
        if (map != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<Map.Entry<C1176550gir, List<PoiFeedFilterOption>>> it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                List<PoiFeedFilterOption> value = it2.next().getValue();
                if (value != null) {
                    arrayList.add(value);
                }
            }
            listLJIJJLI = C15438062q.LJIJJLI(arrayList);
        } else {
            listLJIJJLI = null;
        }
        if (listLJIJJLI != null && !listLJIJJLI.isEmpty()) {
            for (PoiFeedFilterOption poiFeedFilterOption : listLJIJJLI) {
                if (!Intrinsics.LJFF(poiFeedFilterOption.isEmptyOption(), Boolean.TRUE) && (str = poiFeedFilterOption.filterTypeDesc) != null) {
                    linkedHashSet.add(str);
                }
            }
            listLLIIII = C13LP.LLIIII(linkedHashSet);
        }
        if (listLLIIII != null) {
            for (String str2 : listLLIIII) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(str2);
            }
        }
        if (!Intrinsics.LJFF(getState().LLILLJJLI, "sort_by_recommend")) {
            if (sb.length() > 0) {
                sb.append(",");
            }
            sb.append("sort_by");
        }
        return sb.toString();
    }

    public final List<PoiFeedFilterOption> xQ2() {
        Map<C1176550gir, List<PoiFeedFilterOption>> map = getState().LL;
        if (map != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<Map.Entry<C1176550gir, List<PoiFeedFilterOption>>> it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                List<PoiFeedFilterOption> value = it2.next().getValue();
                if (value != null) {
                    arrayList.add(value);
                }
            }
            List<PoiFeedFilterOption> listLJIJJLI = C15438062q.LJIJJLI(arrayList);
            if (listLJIJJLI != null && !listLJIJJLI.isEmpty()) {
                return listLJIJJLI;
            }
        }
        return null;
    }

    public final PoiMapDetailResponse yQ2(PoiMapDetailResponse poiMapDetailResponse) {
        List<PoiGeneralCard> listLJLLLL = null;
        if (poiMapDetailResponse == null) {
            return null;
        }
        if (!Intrinsics.LJFF(getState().LLILLJJLI, "sort_by_recommend") && !poiMapDetailResponse.getOriginSortKeySettle()) {
            List<PoiGeneralCard> listPoiList = poiMapDetailResponse.poiList();
            if (listPoiList != null) {
                int i = 0;
                for (PoiGeneralCard poiGeneralCard : listPoiList) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        poiGeneralCard.setOriginalIndex(i);
                        i = i2;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
            }
            poiMapDetailResponse.setOriginSortKeySettle(true);
        }
        String str = getState().LLILLJJLI;
        if (Intrinsics.LJFF(str, "sort_by_rating")) {
            List<PoiGeneralCard> listPoiList2 = poiMapDetailResponse.poiList();
            if (listPoiList2 != null) {
                listLJLLLL = C13LP.LJLLLL(new AComparatorS37S0000000_18(3), listPoiList2);
            }
        } else if (Intrinsics.LJFF(str, "sort_by_distance")) {
            List<PoiGeneralCard> listPoiList3 = poiMapDetailResponse.poiList();
            if (listPoiList3 != null) {
                listLJLLLL = C13LP.LJLLLL(new AComparatorS37S0000000_18(4), listPoiList3);
            }
        } else {
            List<PoiGeneralCard> listPoiList4 = poiMapDetailResponse.poiList();
            if (listPoiList4 != null) {
                listLJLLLL = C13LP.LJLLLL(new AComparatorS37S0000000_18(5), listPoiList4);
            }
        }
        return poiMapDetailResponse.copy(poiMapDetailResponse.bizCode, listLJLLLL, poiMapDetailResponse.userCityStatus, poiMapDetailResponse.mapWindow, poiMapDetailResponse.recallAreaGroup, poiMapDetailResponse.filterKeyCategoryList, poiMapDetailResponse.filterGroup, poiMapDetailResponse.poiListPanelTitle, poiMapDetailResponse.isDistanceSortValid, poiMapDetailResponse.isRatingSortValid, poiMapDetailResponse.poiDetailTagStyleMap, poiMapDetailResponse.currentPoiHotelShelfInfo, poiMapDetailResponse.LL, poiMapDetailResponse.LLILLJJLI, poiMapDetailResponse.LLILLL);
    }
}
