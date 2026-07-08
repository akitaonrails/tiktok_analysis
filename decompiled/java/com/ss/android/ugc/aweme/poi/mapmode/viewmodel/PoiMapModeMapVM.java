package com.ss.android.ugc.aweme.poi.mapmode.viewmodel;

import X.C1174450gfT;
import X.C1174730gfv;
import X.C1177210gjv;
import X.C15438062q;
import X.C2002207sq;
import X.EnumC1174810gg3;
import X.InterfaceC0148002o;
import X.InterfaceC1177110gjl;
import X.InterfaceC1177250gjz;
import X.InterfaceC665370Q7z;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.poi.mapmode.model.MapModeType;
import com.ss.android.ugc.aweme.poi.mapmode.model.PoiDiscoveryCard;
import com.ss.android.ugc.aweme.poi.mapmode.model.PoiMapModeDataParams;
import com.ss.android.ugc.aweme.poi.mapmode.model.PoiMapModeMobParams;
import com.ss.android.ugc.aweme.poi.mapmode.model.PoiMapModeResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiMapModeMapVM extends AssemViewModel<C2002207sq> {
    public InterfaceC1177250gjz LL;
    public InterfaceC1177110gjl<C1177210gjv> LLILLJJLI;
    public PoiMapModePageVM LLILLL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C2002207sq(null);
    }

    public final void wQ2() {
        Iterable data;
        InterfaceC1177110gjl<C1177210gjv> interfaceC1177110gjl = this.LLILLJJLI;
        if (interfaceC1177110gjl == null || (data = interfaceC1177110gjl.getData()) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(data, 10));
        Iterator it2 = data.iterator();
        while (it2.hasNext()) {
            arrayList.add(C1177210gjv.LIZJ((C1177210gjv) it2.next(), null, false, false, 255));
        }
        InterfaceC1177110gjl<C1177210gjv> interfaceC1177110gjl2 = this.LLILLJJLI;
        if (interfaceC1177110gjl2 != null) {
            interfaceC1177110gjl2.clearData();
        }
        InterfaceC1177110gjl<C1177210gjv> interfaceC1177110gjl3 = this.LLILLJJLI;
        if (interfaceC1177110gjl3 != null) {
            interfaceC1177110gjl3.LJII(arrayList);
        }
    }

    public final void vQ2(String str, int i, InterfaceC665370Q7z interfaceC665370Q7z) {
        PoiDiscoveryCard poiDiscoveryCard;
        String pagePoiId;
        String fromPoiId;
        String pageCollectInfo;
        String str2;
        String fromGroupId;
        String str3;
        String poiDetailEnterFrom;
        String poiDetailEnterMethod;
        String initialPoiEnterFrom;
        String initialPoiEnterMethod;
        String initialPoiFromGroupId;
        MapModeType mapModeType;
        PageFinder pageFinder;
        String pagePoiId2;
        String str4;
        String pageCollectInfo2;
        String initialPoiEnterFrom2;
        String initialPoiEnterMethod2;
        String initialPoiId;
        String initialPoiFromGroupId2;
        PoiMapModeMobParams poiMapModeMobParams;
        PoiMapModeMobParams poiMapModeMobParams2;
        PoiMapModeMobParams poiMapModeMobParams3;
        PoiMapModeMobParams poiMapModeMobParams4;
        PoiMapModeMobParams poiMapModeMobParams5;
        PoiMapModeDataParams poiMapModeDataParams;
        PoiMapModeMobParams poiMapModeMobParams6;
        PoiMapModeMobParams poiMapModeMobParams7;
        PoiMapModeMobParams poiMapModeMobParams8;
        PoiMapModeMobParams poiMapModeMobParams9;
        PoiMapModeMobParams poiMapModeMobParams10;
        PoiMapModeMobParams poiMapModeMobParams11;
        C1174450gfT c1174450gfTVQ2;
        PoiMapModeMobParams poiMapModeMobParams12;
        PoiMapModeMobParams poiMapModeMobParams13;
        PoiMapModeMobParams poiMapModeMobParams14;
        PoiMapModeDataParams poiMapModeDataParams2;
        PoiMapModeResponse poiMapModeResponse;
        List<PoiDiscoveryCard> poiList;
        PoiDiscoveryCard next;
        PoiMapModePageVM poiMapModePageVM = this.LLILLL;
        PageFinder pageFinder2 = null;
        if (poiMapModePageVM != null && (poiMapModeResponse = poiMapModePageVM.LLJIJIL) != null && (poiList = poiMapModeResponse.getPoiList()) != null) {
            Iterator<PoiDiscoveryCard> it2 = poiList.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(next.poiId, str)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            poiDiscoveryCard = next;
        } else {
            poiDiscoveryCard = null;
        }
        C1174730gfv c1174730gfv = C1174730gfv.LIZ;
        PoiMapModePageVM poiMapModePageVM2 = this.LLILLL;
        if (poiMapModePageVM2 != null && (poiMapModeDataParams2 = poiMapModePageVM2.LLILZIL) != null) {
            pagePoiId = poiMapModeDataParams2.getPagePoiId();
        } else {
            pagePoiId = null;
        }
        PoiMapModePageVM poiMapModePageVM3 = this.LLILLL;
        if (poiMapModePageVM3 != null && (poiMapModeMobParams14 = poiMapModePageVM3.LLILZLL) != null) {
            fromPoiId = poiMapModeMobParams14.getFromPoiId();
        } else {
            fromPoiId = null;
        }
        PoiMapModePageVM poiMapModePageVM4 = this.LLILLL;
        if (poiMapModePageVM4 != null && (poiMapModeMobParams13 = poiMapModePageVM4.LLILZLL) != null) {
            pageCollectInfo = poiMapModeMobParams13.getPageCollectInfo();
        } else {
            pageCollectInfo = null;
        }
        if (poiDiscoveryCard != null) {
            str2 = poiDiscoveryCard.collectInfo;
        } else {
            str2 = null;
        }
        PoiMapModePageVM poiMapModePageVM5 = this.LLILLL;
        if (poiMapModePageVM5 != null && (poiMapModeMobParams12 = poiMapModePageVM5.LLILZLL) != null) {
            fromGroupId = poiMapModeMobParams12.getFromGroupId();
        } else {
            fromGroupId = null;
        }
        PoiMapModePageVM poiMapModePageVM6 = this.LLILLL;
        if (poiMapModePageVM6 != null && (c1174450gfTVQ2 = poiMapModePageVM6.vQ2()) != null) {
            str3 = c1174450gfTVQ2.tabCode;
        } else {
            str3 = null;
        }
        PoiMapModePageVM poiMapModePageVM7 = this.LLILLL;
        if (poiMapModePageVM7 != null && (poiMapModeMobParams11 = poiMapModePageVM7.LLILZLL) != null) {
            poiDetailEnterFrom = poiMapModeMobParams11.getPoiDetailEnterFrom();
        } else {
            poiDetailEnterFrom = null;
        }
        PoiMapModePageVM poiMapModePageVM8 = this.LLILLL;
        if (poiMapModePageVM8 != null && (poiMapModeMobParams10 = poiMapModePageVM8.LLILZLL) != null) {
            poiDetailEnterMethod = poiMapModeMobParams10.getPoiDetailEnterMethod();
        } else {
            poiDetailEnterMethod = null;
        }
        PoiMapModePageVM poiMapModePageVM9 = this.LLILLL;
        if (poiMapModePageVM9 != null && (poiMapModeMobParams9 = poiMapModePageVM9.LLILZLL) != null) {
            initialPoiEnterFrom = poiMapModeMobParams9.getInitialPoiEnterFrom();
        } else {
            initialPoiEnterFrom = null;
        }
        PoiMapModePageVM poiMapModePageVM10 = this.LLILLL;
        if (poiMapModePageVM10 != null && (poiMapModeMobParams8 = poiMapModePageVM10.LLILZLL) != null) {
            initialPoiEnterMethod = poiMapModeMobParams8.getInitialPoiEnterMethod();
        } else {
            initialPoiEnterMethod = null;
        }
        PoiMapModePageVM poiMapModePageVM11 = this.LLILLL;
        if (poiMapModePageVM11 != null && (poiMapModeMobParams7 = poiMapModePageVM11.LLILZLL) != null) {
            initialPoiFromGroupId = poiMapModeMobParams7.getInitialPoiFromGroupId();
        } else {
            initialPoiFromGroupId = null;
        }
        PoiMapModePageVM poiMapModePageVM12 = this.LLILLL;
        if (poiMapModePageVM12 != null && (poiMapModeMobParams6 = poiMapModePageVM12.LLILZLL) != null) {
            mapModeType = poiMapModeMobParams6.getMapModeType();
        } else {
            mapModeType = null;
        }
        String strValueOf = String.valueOf(i);
        PoiMapModePageVM poiMapModePageVM13 = this.LLILLL;
        if (poiMapModePageVM13 != null) {
            pageFinder = poiMapModePageVM13.LLJ;
        } else {
            pageFinder = null;
        }
        c1174730gfv.getClass();
        C1174730gfv.LIZJ(pageFinder, interfaceC665370Q7z, mapModeType, "map_mode", str, fromPoiId, fromGroupId, str3, pagePoiId, pageCollectInfo, str2, poiDetailEnterFrom, poiDetailEnterMethod, initialPoiEnterFrom, initialPoiEnterMethod, initialPoiFromGroupId, strValueOf);
        EnumC1174810gg3 enumC1174810gg3 = EnumC1174810gg3.CLICK_POI;
        PoiMapModePageVM poiMapModePageVM14 = this.LLILLL;
        if (poiMapModePageVM14 != null && (poiMapModeDataParams = poiMapModePageVM14.LLILZIL) != null) {
            pagePoiId2 = poiMapModeDataParams.getPagePoiId();
        } else {
            pagePoiId2 = null;
        }
        if (poiDiscoveryCard != null) {
            str4 = poiDiscoveryCard.collectInfo;
        } else {
            str4 = null;
        }
        PoiMapModePageVM poiMapModePageVM15 = this.LLILLL;
        if (poiMapModePageVM15 != null && (poiMapModeMobParams5 = poiMapModePageVM15.LLILZLL) != null) {
            pageCollectInfo2 = poiMapModeMobParams5.getPageCollectInfo();
        } else {
            pageCollectInfo2 = null;
        }
        PoiMapModePageVM poiMapModePageVM16 = this.LLILLL;
        if (poiMapModePageVM16 != null && (poiMapModeMobParams4 = poiMapModePageVM16.LLILZLL) != null) {
            initialPoiEnterFrom2 = poiMapModeMobParams4.getInitialPoiEnterFrom();
        } else {
            initialPoiEnterFrom2 = null;
        }
        PoiMapModePageVM poiMapModePageVM17 = this.LLILLL;
        if (poiMapModePageVM17 != null && (poiMapModeMobParams3 = poiMapModePageVM17.LLILZLL) != null) {
            initialPoiEnterMethod2 = poiMapModeMobParams3.getInitialPoiEnterMethod();
        } else {
            initialPoiEnterMethod2 = null;
        }
        PoiMapModePageVM poiMapModePageVM18 = this.LLILLL;
        if (poiMapModePageVM18 != null && (poiMapModeMobParams2 = poiMapModePageVM18.LLILZLL) != null) {
            initialPoiId = poiMapModeMobParams2.getInitialPoiId();
        } else {
            initialPoiId = null;
        }
        PoiMapModePageVM poiMapModePageVM19 = this.LLILLL;
        if (poiMapModePageVM19 != null && (poiMapModeMobParams = poiMapModePageVM19.LLILZLL) != null) {
            initialPoiFromGroupId2 = poiMapModeMobParams.getInitialPoiFromGroupId();
        } else {
            initialPoiFromGroupId2 = null;
        }
        PoiMapModePageVM poiMapModePageVM20 = this.LLILLL;
        if (poiMapModePageVM20 != null) {
            pageFinder2 = poiMapModePageVM20.LLJ;
        }
        C1174730gfv.LJII("map_mode", enumC1174810gg3, pagePoiId2, initialPoiEnterFrom2, initialPoiEnterMethod2, initialPoiId, initialPoiFromGroupId2, str4, pageCollectInfo2, interfaceC665370Q7z, pageFinder2);
    }
}
