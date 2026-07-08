package com.ss.android.ugc.aweme.poi.detail.nearbyv2.vm;

import X.C1176080gi6;
import X.C13LP;
import X.C1697810uHb;
import X.C2097608Jq;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.poi.detail.nearbyv2.model.PoiNearbyV2Tab;
import com.ss.android.ugc.aweme.poi.mapdetail.model.PoiGeneralCard;
import com.ss.android.ugc.aweme.poi.mapmode.model.Location;
import com.ss.android.ugc.aweme.poi_api.model.PoiLocation;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiDetailNearbyV2VM extends AssemViewModel<C1176080gi6> {
    public final Map<String, Map<Integer, PoiGeneralCard>> LL = new LinkedHashMap();

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1176080gi6(null, null, null);
    }

    public final Map<Integer, PoiGeneralCard> vQ2(PoiLocation poiLocation, PoiNearbyV2Tab poiNearbyV2Tab) {
        double dDoubleValue;
        double dDoubleValue2;
        double dDoubleValue3;
        double dDoubleValue4;
        Double d;
        Double d2;
        List listLL;
        if (((LinkedHashMap) this.LL).get(poiNearbyV2Tab.getTabKey()) != null) {
            return (Map) ((LinkedHashMap) this.LL).get(poiNearbyV2Tab.getTabKey());
        }
        int i = 0;
        if (poiLocation == null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            List<PoiGeneralCard> poiList = poiNearbyV2Tab.getPoiList();
            if (poiList != null && (listLL = C13LP.LL(poiList, 3)) != null) {
                for (Object obj : listLL) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        linkedHashMap.put(Integer.valueOf(i2), obj);
                        i = i2;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
            }
            return linkedHashMap;
        }
        Double d3 = poiLocation.lat;
        if (d3 != null) {
            dDoubleValue = d3.doubleValue();
        } else {
            dDoubleValue = 0.0d;
        }
        Double d4 = poiLocation.lng;
        if (d4 != null) {
            dDoubleValue2 = d4.doubleValue();
        } else {
            dDoubleValue2 = 0.0d;
        }
        List<PoiGeneralCard> poiList2 = poiNearbyV2Tab.getPoiList();
        if (poiList2 == null) {
            return C2097608Jq.LJ();
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (PoiGeneralCard poiGeneralCard : poiList2) {
            if (linkedHashMap2.size() >= 3) {
                break;
            }
            Location location = poiGeneralCard.getLocation();
            if (location != null && (d2 = location.lat) != null) {
                dDoubleValue3 = d2.doubleValue();
            } else {
                dDoubleValue3 = 0.0d;
            }
            Location location2 = poiGeneralCard.getLocation();
            if (location2 != null && (d = location2.lng) != null) {
                dDoubleValue4 = d.doubleValue();
            } else {
                dDoubleValue4 = 0.0d;
            }
            int i3 = 1;
            if (dDoubleValue3 != dDoubleValue || dDoubleValue4 != dDoubleValue2) {
                if (dDoubleValue4 <= dDoubleValue2 || dDoubleValue3 <= dDoubleValue) {
                    if (dDoubleValue4 < dDoubleValue2 && dDoubleValue3 > dDoubleValue) {
                        i3 = 2;
                    } else {
                        i3 = 4;
                        if ((dDoubleValue4 >= dDoubleValue2 || dDoubleValue3 >= dDoubleValue) && (dDoubleValue4 <= dDoubleValue2 || dDoubleValue3 >= dDoubleValue)) {
                        }
                    }
                }
                if (!linkedHashSet.contains(Integer.valueOf(i3))) {
                    linkedHashSet.add(Integer.valueOf(i3));
                    linkedHashMap2.put(Integer.valueOf(i3), poiGeneralCard);
                }
            }
        }
        this.LL.put(poiNearbyV2Tab.getTabKey(), linkedHashMap2);
        return linkedHashMap2;
    }
}
